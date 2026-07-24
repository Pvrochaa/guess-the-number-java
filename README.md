# 🎯 Guess the Number

A simple command-line **number guessing game** written in Java. The computer picks a random number between **1 and 50**, and you try to guess it. After every attempt the game tells you whether your guess was too high or too low, and it keeps going until you find the secret number.

> This is my **first Java project**, built while learning the language from scratch. 🚀

## 🎮 How it works

1. The program picks a random secret number from 1 to 50.
2. You type a guess.
3. The game responds with a hint — *too high* or *too low*.
4. The loop repeats until you guess correctly and see **"Acertou!"** (You got it!).

## 🧩 Concepts practiced

This small project brings together the fundamentals of programming logic:

- **Variables & data types** — `int`
- **User input** — reading from the keyboard with `Scanner`
- **Loops** — a `while` loop that runs until the number is guessed
- **Conditional logic** — `if` / `else if` / `else`
- **Comparison operators** — `==`, `!=`, `<`
- **Randomness** — generating the secret number with `Math.random()`

## ▶️ How to run

You need the **Java JDK** installed (this project was built with Java 25).

```bash
# from the src folder
javac Main.java
java Main
```

Or just open the project in **IntelliJ IDEA** and press Run.

## 📸 Example run

```
Adivinhe o número secreto de (1 a 50):
25
Muito baixo, Tente um número maior.
40
Muito alto, Tente um número menor.
33
Acertou!
```

> Note: the in-game messages are in Portuguese (my native language). An English version is on the to-do list. 🇧🇷 🇬🇧

---

Made with ☕ and a lot of debugging while learning Java. Feedback and suggestions are always welcome!
