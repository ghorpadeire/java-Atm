
# ATM Simulation Project

This project is a simple ATM (Automated Teller Machine) simulation system developed in Java. The system includes three main components: `ATM`, `Account`, and `OptionMenu`, each handling different functionalities of the ATM.

## Project Components

### 1. `ATM.java`
This file contains the core functionality of the ATM system. It handles operations such as balance inquiry, withdrawals, deposits, and account verification.

### 2. `Account.java`
The `Account` class represents a bank account. It stores essential information such as account number, PIN, and account balance. This class provides methods to retrieve and update account information.

### 3. `OptionMenu.java`
The `OptionMenu` class provides the user interface for interacting with the ATM. It presents different menu options (e.g., checking balance, making deposits/withdrawals) and calls appropriate methods from `ATM.java` and `Account.java` to perform these actions.

## Features

1. **Account Management**: 
   - Users can create and manage their accounts.
   - Each account includes basic details such as account number, PIN, and balance.

2. **ATM Operations**:
   - Users can check their account balance.
   - Users can deposit money into their accounts.
   - Users can withdraw money from their accounts (with checks to ensure sufficient balance).

3. **Security Features**:
   - PIN verification is required for access to accounts.
   - Users are prompted for account credentials before any transactions.

## How to Run

### Prerequisites:
- You need to have **Java** installed on your system. If you don't have it installed, you can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Steps:
1. **Compile the Code**:
   - Navigate to the folder where the Java files are stored.
   - Run the following command to compile the Java files:
     ```bash
     javac ATM.java Account.java OptionMenu.java
     ```

2. **Run the Program**:
   - Once the files are compiled, run the `OptionMenu` class, as it serves as the entry point for the program:
     ```bash
     java OptionMenu
     ```

3. **Interact with the ATM**:
   - After running the program, you'll be prompted to enter your account details (Account Number and PIN).
   - You can choose from the menu to:
     - Check balance
     - Make a deposit
     - Make a withdrawal
   - Follow the on-screen instructions to perform your transactions.

## Future Enhancements

Some improvements that could be made to the project:
- **Account Creation Feature**: Currently, accounts are pre-created. Adding functionality for users to create new accounts directly in the ATM system would improve usability.
- **Database Integration**: Instead of storing account information in memory, the system can be enhanced by connecting to a database to store account details persistently.
- **Enhanced Security**: Features such as logging failed attempts and locking accounts after multiple incorrect PIN entries could be added for better security.

## License

This project is open for educational purposes. Feel free to modify and enhance it as needed.
"# java-Atm" 
