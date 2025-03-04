# Text-Animator
This project is a Java Swing-based application that animates user-provided text across the screen. The text bounces off the edges of the window, and users can control the direction of the animation using arrow keys. The application demonstrates the use of Java Swing, event handling, and animation techniques.

# Overview
The animator.java application is a GUI-based program that allows users to input text, which is then animated across the screen. The text moves in a bouncing motion, changing direction when it hits the edges of the window. Users can also control the direction of the text using the arrow keys (←, →, ↑, ↓) and exit the application by pressing the Esc key.

# Features
User Input: Prompts the user to enter text to animate.

Text Animation: The entered text bounces off the edges of the window.

Keyboard Controls: Users can control the direction of the text using arrow keys.

Dynamic Updates: The text position is updated in real-time using a Timer for smooth animation.

Customizable Appearance: The text is displayed in a clean, black-themed window with white text for high contrast.

# Installation
To run this project, you need to have Java installed on your system. Follow these steps:

**Clone the repository:**

*git clone https://github.com/your-username/animated-text-display.git*
*cd animated-text-display*

**Compile the Java file:**

*javac animator.java*

**Run the application:**

*java animator*

#Technologies Used
Java: The primary programming language used for the application.

Java Swing: Used to create the graphical user interface (GUI).

AWT (Abstract Window Toolkit): Provides the basic windowing and event-handling framework.

Timer: Used for smooth animation by updating the text position at regular intervals.
