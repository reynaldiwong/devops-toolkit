# 🚀 DevOps Automation Toolkit by Reynaldi Wong

Hey there! 👋  
This repo is my personal collection of tools, scripts, and templates I use to automate stuff — from infrastructure to CI/CD workflows and beyond. It’s kind of a living toolbox I keep coming back to and tweaking as I learn new things.

## 💡 What's This All About?

This toolkit helps me quickly spin up, automate, and manage different parts of software delivery and infrastructure. Right now, it's mostly scripts — but I *might* throw in some Kubernetes manifests, Ansible playbooks, Terraform configs, or even n8n workflows down the line.

Currently, you'll find things like:

- **Jenkins Pipelines** – My go-to multi-stage CI/CD setups for building, testing, and deploying services.

## 🌿 Features
### Jenkinsfile
- Webhook-Driven Automation (automatically triggers from service repository webhooks for pull requests and releases.)
- Flexible Git Integration (Handles both branch-based deployments (dev/sit) and tag-based releases (uat/prod), accommodating different release workflows.)
- Parallelization (Significantly sped up pipeline speed by paralleling steps that don't dependent on each other.)
- Multiple programming languages, Environments, and Projects in 1 script (allows centralized, efficient, and coordinated CI/CD pipelines while reducing duplication and improving maintainability.)
- Centralized and Custom-tailored Configuration for each services (Using shared library to defines configurations for multiple services in a separate file.)
- Smart Docker Caching (Implements Docker layer caching by reusing previous builds, significantly reducing build times for incremental changes. Exponentially reduced more if integrating cache mounts in Dockerfile)

## 🛠 How I Use This Repo

- **Quick Reference** – I keep reusable patterns and snippets here so I don’t reinvent the wheel every time.
- **Speedy Setup** – Helps me bootstrap new projects or environments faster.
- **Always Evolving** – Whenever I pick up a new tool or workflow (like n8n or new IaC tricks), I drop it in here.
- **Sharing is Caring** – Easy way to pass along useful stuff to teammates or the wider dev community.

## ⚙️ Tips for Future Me (and Maybe You)

- Keep things modular and easy to plug into other projects.
- Stick with clear names and comments — future me will thank you.
- Update regularly as things change or improve.

## 📄 License

This project is licensed under the [MIT License](LICENSE).  
Feel free to use, fork, adapt, and share — just give credit where it’s due.
