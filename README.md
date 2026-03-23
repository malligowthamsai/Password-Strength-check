# 🔐 Password Strength Checker (Java)

A simple Java CLI application that checks the strength of a password based on different criteria.

## 🚀 Features

- Checks password strength based on:
  - Length (≥ 8)
  - Uppercase letters
  - Lowercase letters
  - Numbers
  - Special characters
- Outputs:
  - Strength level (Weak / Medium / Strong)
  - Score (out of 5)

## 🧠 How It Works

Each condition gives 1 point:

| Criteria              | Points |
|----------------------|--------|
| Length ≥ 8           | 1      |
| Uppercase letter     | 1      |
| Lowercase letter     | 1      |
| Number               | 1      |
| Special character    | 1      |

## ▶️ How to Run

1. Compile:
```bash
javac PasswordChecker.java
