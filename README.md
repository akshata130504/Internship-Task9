# Internship-Task9


# 🎓 Java Developer Internship – Task 9  
## Collections Framework – Student Management System

## 📌 Task Objective
The objective of this task is to build a **Student Management System** using the **Java Collections Framework**.  
This task demonstrates how different collection types (`List`, `Set`, `Map`) are used together to store, process, sort, and manage student data efficiently.


## 🛠 Tools Used
- **IDE:** IntelliJ IDEA / Eclipse  
- **Language:** Java  
- **JDK Version:** Java 17 / Java 21  


## 📂 Project Structure
Java-Internship-Task-9
│
├── src
│ ├── Student.java
│ ├── StudentManager.java
│ └── StudentApp.java
│
└── README.md


## 🧩 Features Implemented
- Stored student objects using **ArrayList**
- Used **HashMap** for fast lookup by student ID
- Removed duplicate student records using **Set**
- Implemented sorting using **Comparator**
- Iterated collections using **enhanced for loop**
- Demonstrated understanding of **Collections hierarchy**
- Optimized data handling using appropriate collections
- Displayed **formatted student reports**


## ▶️ How to Compile and Run
Open terminal / command prompt in the `src` directory and run:

     ```bash
     javac Student.java StudentManager.java StudentApp.java
     java StudentApp

     
## 💻 Sample Console Output

--- Student Report ---

ID: 2 | Name: Riya | Marks: 92

ID: 1 | Name: Akshu | Marks: 85

ID: 3 | Name: Anu | Marks: 78

Searching for student with ID 2:

ID: 2 | Name: Riya | Marks: 92

## 🧠 Key Concepts Demonstrated

🔹 List vs Set vs Map

List: Allows duplicates and maintains insertion order

Set: Does not allow duplicates

Map: Stores data as key–value pairs

🔹 HashMap Usage

Provides fast data retrieval using hashing (average O(1) time complexity).

🔹 Comparator

Used to define custom sorting logic (sorting students by marks).

🔹 Duplicate Handling

Duplicates removed using Set with overridden equals() and hashCode().

## 🎯 Learning Outcomes

Understood Java Collections Framework

Learned difference between List, Set, and Map

Implemented custom sorting using Comparator

Practiced data de-duplication

Gained insight into HashMap internal working

Improved efficiency and readability of Java programs
