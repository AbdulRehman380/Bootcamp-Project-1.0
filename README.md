# Spring Boot Student Profile & Task Management API

## Author
**Name:** Mohd Abdul Rehman Iqbal  
**Roll No:** 160923733008  

---

## 📌 Overview
This project is a **Spring Boot REST API** that manages:
- **Student Profiles**
- **Tasks** (with status tracking using Enum)

The API supports full CRUD (Create, Read, Update, Delete) operations for both modules.

---

## 🛠 Features
### Student Profile
- Create a student profile
- Fetch student details by ID
- Update existing profiles
- Delete profiles

### Task Management
- Create a new task
- Retrieve a task by ID
- Update a task’s details/status
- Delete a task

---

## 🗂 Project Structure
src/main/java/com/example/demo/
│
├── controller/
│ ├── StudentProfileController.java
│ ├── TaskController.java
│
├── model/
│ └── TaskStatus.java
│
├── services/
│ ├── StudentProfileService.java
│ ├── TaskService.java
│
├── studentprofile/
│ └── StudentProfile.java
│
└── task/
└── Task.java
