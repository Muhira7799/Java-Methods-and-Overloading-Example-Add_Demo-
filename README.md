# Java Methods and Overloading Example (Add_Demo)

A small Java program that demonstrates fields, methods that return values, and **method overloading** with a `multiply` method.

## What It Demonstrates

- Setting and reading an object's field (`a`)
- A method with no parameters (`add`)
- A method that returns a value (`divide`)
- Overloading: two `multiply` methods with 2 and 3 parameters

## Code Overview

| Class | Role |
|-------|------|
| `Add` | Has the field `a` and the methods `add`, `divide`, and `multiply` (two versions) |
| `Add_Demo` | Contains `main` and calls each method |

## How It Works

| Call | Result |
|------|--------|
| `obj.a = 5` then print | `5` |
| `obj.add()` | Prints `Add method called` |
| `obj.multiply(10, 12)` | Uses the 2-parameter version: `p = 120` |
| `obj.multiply(10, 12, 15)` | Uses the 3-parameter version: `p = 1800` |
| `obj.divide(24, 6)` | Prints `x = 4` |

## Output

```
5
Add method called
p = 120
p = 1800
x = 4
```

## Note on Division

`divide` uses integer division. Calling it with `z = 0` throws an `ArithmeticException`, so a check for zero would make it safer.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac Add_Demo.java
java Add_Demo
```

## Project Structure

```
.
├── Add_Demo.java
└── README.md
```

## Next Steps

- Add a check for division by zero
- Add a `double` version of `multiply`
- Add `subtract` and compare overloaded and separately named methods
