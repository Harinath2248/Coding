
 Password Generator
 =======

This project is a Java application designed to create random passwords and assess password strength.

Overview:
After completion of my course in Java Full Stack, I started on creating this project following a course in Object-Oriented Effective Java Programming. The thought struck during a conversation with my friend about the significance of robust passwords for online security. It boosted me to develop a tool that generates random passwords. After a week of coding, I had a functional password generator at hand.

In addition to password generation, I incorporated a feature to evaluate the strength of passwords. While I was satisfied with the outcome, I realized it might not be intuitive for users unfamiliar with its operation. Consequently, I decided to enhance the project by adding a graphical user interface (GUI), which can be found in the Password-Services repository.

Functionalities:
1. Password Generation:
   - Users respond with "Yes" or "No" to prompts regarding the inclusion of uppercase letters, lowercase letters, numbers, or symbols.
   - Users specify the desired length of the password.
   - Based on user input, a password alphabet—a string containing chosen characters—is generated.
   - Random characters from the password alphabet are selected and combined to create a completely random string, tailored to user preferences.
   - The generated password is then displayed on the console.

2. Password Strength Assessment:
   - Password strength is evaluated based on several criteria:
     - Use of uppercase letters
     - Use of lowercase letters
     - Inclusion of numbers
     - Presence of symbols
     - Length of the password (minimum 8 characters for decent strength, minimum 16 characters for good strength)
   - These criteria contribute to calculating a score for the password, determining the displayed strength message (weak/medium/good/great).

3. Display of Informative Tips:
   - A minor feature offers users insights into password security on the console. Tips include avoiding password reuse, character repetition, keyboard patterns, dictionary words, and sequential letter or number patterns.

This project serves as a practical tool for generating secure passwords and enhancing awareness about password security practices.
