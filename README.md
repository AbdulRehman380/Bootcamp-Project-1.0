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
<img width="1919" height="1079" alt="Screenshot 2025-08-14 155346" src="https://github.com/user-attachments/assets/1fab0b69-cbad-4c08-8cb7-af98dd3b8b5b" />

