# ChatApplication
This is a simple console-based chat application built in Java using Socket Programming and Multithreading. It allows real-time communication between a server and a client over a TCP connection.

# How It Works
The application consists of two files:

**ChatServer.java**

Acts as the server to handle incoming connections from clients.
Listens on a specified port and facilitates message exchange with the client.

**ChatClient.java**

Acts as the client that connects to the server.
Sends and receives messages in real-time.

# Features

Real-time text communication between a client and a server.

Multithreading ensures that both sending and receiving of messages happen concurrently without blocking the chat flow.

Simple and lightweight, designed for easy demonstration of Java networking concepts.

# Technologies Used

**Java:** The programming language used for development.

**Socket Programming:** Used to establish a reliable connection between the server and client.

**Multithreading:** Used to enable simultaneous sending and receiving of messages.

**I/O Streams:** Used for text-based data communication.

# How to Run

**Prerequisites**

Install Java Development Kit (JDK) on your system.

Set up the Java compiler and runtime environment.

**Steps to Run**

# Compile the Files - Open a terminal in the project folder and run:

*javac ChatServer.java ChatClient.java*

# Run the Server:

*java ChatServer*

The server will start listening for connections on port 12345.

# Run the Client In a separate terminal, start the client:

*java ChatClient*

The client will connect to the server, and you can begin the chat.

*Chat Away!* Type messages in either the server or client terminal to send them. Both sides will see the exchanged messages.

