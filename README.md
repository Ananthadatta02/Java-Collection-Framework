
# Java Collection Framework

## Repository Description

This repository provides a comprehensive demonstration of the Java Collection Framework, focusing on three commonly used implementations of the List interface: **ArrayList**, **LinkedList**, and **Vector**. The code highlights their usage, differences, and practical applications through a simple interactive program. It is an excellent resource for beginners and developers aiming to enhance their understanding of Java collections and their functionality.

## Code Functionality

The repository contains two implementations showcasing the usage of **ArrayList**, **LinkedList**, and **Vector**. Users can choose a specific list implementation, input elements dynamically, and view the contents of the list. Here's a detailed explanation of the code:

### 1. ArrayList

**Definition**: A resizable array implementation of the List interface.

**Use in Code**:
- Users are prompted to input the number of elements.
- Elements are added sequentially to an ArrayList.
- The program displays the contents of the ArrayList.

**When to Use**:
- When frequent retrieval operations are required.
- Ideal for dynamic arrays where resizing is needed.

### 2. Vector

**Definition**: A synchronized implementation of the List interface, making it thread-safe.

**Use in Code**:
- Users input the number of elements.
- Elements are added sequentially to a Vector.
- The program displays the contents of the Vector.

**When to Use**:
- When thread-safe operations are needed.
- Suitable for legacy systems that require synchronization.

### 3. LinkedList

**Definition**: A doubly-linked list implementation of the List interface.

**Use in Code**:
- Users specify the number of elements.
- Elements are added sequentially to a LinkedList.
- The program displays the contents of the LinkedList.

**When to Use**:
- When frequent insertions or deletions are required.
- Ideal for managing a queue or stack-like data structure.

## How the Code Works

### User Interaction
- The program starts by prompting the user to select one of the three collection types: **ArrayList**, **Vector**, or **LinkedList**.
- Based on the choice, the program asks for the number of elements to add.

### Dynamic Input
- The user enters the elements, which are dynamically added to the selected collection.

### Output
- After inputting the elements, the program prints the collection’s contents.

## Key Features

- **Interactive Design**: The program lets users dynamically choose the type of collection and input data.
- **Modular Implementation**: In one version, collection logic is separated into reusable methods for clarity and reusability.
- **Unified Approach**: In the other version, a single `List` variable is used to manage different collection types, showcasing the power of polymorphism.

## Results and Benefits

### Results:
- Displays the elements stored in the chosen collection.
- Maintains the insertion order for all List implementations.

### Benefits:
- Learn how to use the List interface and its implementations effectively.
- Understand the differences between **ArrayList**, **Vector**, and **LinkedList**.
- Gain insights into when to use each collection type in real-world applications.

## Why is This Repository Useful?

- **Hands-On Practice**: Perfect for Java learners to practice working with collections.
- **Comparison**: Demonstrates the differences in usage and functionality of **ArrayList**, **Vector**, and **LinkedList**.
- **Foundation for Advanced Topics**: Provides a foundation for understanding advanced topics like concurrency (using Vector) and data structures (using LinkedList).

## How to Run the Code

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/Java-Collection-Framework.git

## Compile and run the program using a Java IDE or the command line:
```bash
javac ArrayList_Vector_LinkedList.java
java ArrayList_Vector_LinkedList
```
Follow the on-screen prompts to explore the functionality of different collections.
