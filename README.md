# # 📅 Appointment Management System

A centralized platform to manage appointments for **salons, doctors, hotels, and consultants**.  
Designed to scale logically: **monolith first, microservices later**.

---

## 📘 Project Development & Usage Guide

---

## 🧩 1. Project Overview

### 🎯 What This Project Is

A **single booking platform** that supports multiple domains:

- ✂️ Salons
- 🩺 Doctors
- 🏨 Hotels
- 🧑‍💼 Consultants

The system is **intentionally built as a monolith first** and later split into microservices.

> Premature microservices increase complexity and slow execution.  
> Stability comes before scalability.

---

## 🛠️ 2. Tech Stack (Locked)

This stack is fixed to avoid decision churn.

- **Backend:** Spring Boot
- **Database:** MySQL
- **ORM:** JPA / Hibernate
- **Build Tool:** Maven
- **Authentication:** JWT
- **API Testing:** Postman

No experiments. No unnecessary tools.

---

## ⚙️ 3. One-Time Setup Guide

### ✅ Prerequisites

Ensure the following are installed and running:

- ☕ Java 17 or higher
- 📦 Maven
- 🗄️ MySQL Server

---

### 🚀 Setup Steps

#### 1️⃣ Clone the Repository
```bash
git clone <repository-url>

```
#### 2️⃣ Create MySQL DB
```sql
appointment_db
```

#### 3️⃣ Update application.yml
```ymal

spring.datasource.url
spring.datasource.username
spring.datasource.password
```
Configure according to your local MySQL setup.
#### 4️⃣ Run:
```arduino
mvn clean install
mvn spring-boot:run

```

#### 5️⃣ Access the Application:
```arduino
http://localhost:8080
```

## ⚠️ Important Rule

If the application does **not start**:

- 🔧 Fix infrastructure issues first

- 🚫 Do not touch business logic

- 🧱 Stability comes before features

## 🧭 Development Rulebook

- 🧱 Monolith first

- 🚫 No skipping steps

- 🛑 No premature microservices

- 🚀 Working system > perfect design
# 📅 Appointment Management System

A centralized system to manage appointments for **salons, doctors, hotels, and consultants**.  
Built **step-by-step**, starting simple and evolving into microservices.

---

## 🧭 Project Development Roadmap

This README focuses **only on what to build and in what order**.  
No APIs. No internal theory. Pure execution plan.

---

## 🚀 STEP 0: Foundation Setup

### ✅ What to Do
- Initialize Spring Boot project
- Configure MySQL connection
- Enable JPA/Hibernate
- Run the application successfully

### 🎯 Exit Criteria
- Application starts without errors
- Database connection is stable

---

## 🔐 STEP 1: Authentication Module

### ✅ What to Do
- Implement user signup
- Implement secure login
- Add role support (User / Provider / Admin)
- Secure application using token-based authentication

### 🎯 Exit Criteria
- Users can authenticate securely
- User identity is available across the system

---

## 👥 STEP 2: User & Provider Management

### ✅ What to Do
- Manage user profiles
- Allow businesses (salon, doctor, hotel) to register
- Store and manage business details
- Track provider status (active / inactive)

### 🎯 Exit Criteria
- System knows **who the user is**
- System knows **what business they manage**

---

## 🛠️ STEP 3: Service Definition

### ✅ What to Do
- Allow providers to define their services
- Configure service duration and pricing
- Keep service setup flexible (not hardcoded)

### 🎯 Exit Criteria
- System understands **what can be booked**

---

## 🗓️ STEP 4: Availability & Scheduling

### ✅ What to Do
- Manage provider availability
- Define time slots or date ranges
- Prevent overlapping schedules

### 🎯 Exit Criteria
- System knows **when a service is available**
- Double booking is eliminated

⚠️ This step defines system quality. Build carefully.

---

## 📦 STEP 5: Booking Flow

### ✅ What to Do
- Implement booking creation
- Manage booking lifecycle (confirm, cancel, complete)
- Track booking status changes

### 🎯 Exit Criteria
- End-to-end booking flow works smoothly

---

## 💳 STEP 6: Payments

### ✅ What to Do
- Handle payment logic
- Link payments with bookings
- Track payment state

### 🎯 Exit Criteria
- Bookings can be paid securely
- Payment logic remains isolated

---

## 🔔 STEP 7: Notifications

### ✅ What to Do
- Send booking confirmations
- Send reminders
- Notify on cancellations

### 🎯 Exit Criteria
- Users receive timely updates

---

## 🧩 STEP 8: Microservices Split

### ✅ What to Do
- Identify clear module boundaries
- Split authentication, booking, and payment into separate services
- Introduce API gateway if required

### 🎯 Exit Criteria
- System works exactly the same after splitting

⚠️ Do this **only when everything is stable**.

---

## 📌 Development Rules (Non-Negotiable)

- 🧱 Build monolith first
- 🧪 Stabilize before moving ahead
- 🚫 No skipping steps
- 🛑 No premature microservices
- 🚀 Working system > perfect design

---

## 🏁 Final Note

This project is **execution-driven**, not academic.  
Follow the steps in order.  
If one step breaks, the next step is meaningless.

**Build → Stabilize → Scale**
