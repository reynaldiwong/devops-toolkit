def call(env) {
    def services = [
        // example services
        "serviceA": [
            goTool: 'your-go-tool',
            Project: 'your-projectA',
            serviceType: 'your-service-type',
            skipSonar: false,
            sonarGate: true
        ],
        "serviceB": [
            goTool: 'your-go-tool',
            Project: 'your-projectB',
            skipSonar: true,
            sonarGate: true
        ],
        "serviceC": [
            nodeTool: 'your-node-tool',
            Project: 'your-projectB',
            skipSonar: true,
            sonarGate: true
        ]
    ]
    
    def gcpMap = [
        your_projectB: [
            dev:  "your-projectB-dev-id",
            prod: "your-projectB-prod-id"
        ],
        your_projectA: [
            sit:  "your-projectA-sit-id",
            uat:  "your-projectA-uat-id",
            your_service_type: "your-projectA-prod-type1-id",
            your_other_service_type: "your-projectA-prod-type2-id"
        ]
    ]
    
    def envKey = env.TARGET_ENV ?: "dev"

    return services.collectEntries { serviceName, cfg ->
        def resolvedProject

        if (envKey == "prod" && cfg.Project == "your-projectA") {
            resolvedProject = gcpMap[cfg.Project][cfg.serviceType]
        } else {
            resolvedProject = gcpMap[cfg.Project][envKey]
        }

        cfg.gcpProject = resolvedProject
        [serviceName, cfg]
    }
}
