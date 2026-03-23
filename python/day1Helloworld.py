# Day 1 – Hello Variations

# Goal:
# Use variables and formatted output
# Requirements:
# Ask for name, age, and 2 hobbies
# Print in 1 formatted sentence

# Constraints:
# No hardcoding values
# Must use input

# Stretch:
# Format output in multiple lines neatly

name = input("Enter your name: ")
age = input("Enter your age: ")
hobby1, hobby2 = input("Enter 2 hobbies: ").split(",")

print(f"Hello i am {name}, I am currently {age}. I enjoy {hobby1} and{hobby2}")
