# Pipeline DevSecOps avec SAST & DAST
Ce projet illustre la mise en œuvre d'une pipeline DevSecOps intégrant des contrôles de sécurité automatisés dans le cycle de développement d'une application Spring Boot.

## Fonctionnalités

- Compilation et tests avec Maven
- Analyse de sécurité du code (SAST) avec Trivy
- Construction d'une image Docker
- Scan de sécurité de l'image Docker avec Trivy
- Déploiement automatisé via GitLab CI/CD
- Analyse dynamique de l'application (DAST) avec OWASP ZAP


## Technologies

- Java 17
- Spring Boot
- Maven
- Docker
- GitLab CI/CD
- Trivy
- OWASP ZAP

## Architecture de la pipeline

Git Push
    │
    ▼
Build & Tests
    │
    ▼
Analyse SAST (Trivy)
    │
    ▼
Build Image Docker
    │
    ▼
Scan Image Docker
    │
    ▼
Déploiement
    │
    ▼
Analyse DAST (OWASP ZAP)

## Objectif
Mettre en pratique les principes du DevSecOps en intégrant des contrôles de sécurité automatisés tout au long du pipeline CI/CD afin de détecter les vulnérabilités avant la mise en production.

## Auteur

**Moaye Line Esther Kouassi**

Ingénieure Cybersécurité | Cloud Security | DevSecOps