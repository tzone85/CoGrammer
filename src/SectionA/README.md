# REVIEW FEEDBACK
## For reversing a string recursively
- _Line 4_: It's good practice to write your driving code after the code that it actually drives. Your code can work still, but it's not good practice to do so. A good place is on line 37, before the closing brace for the class.
- _Lines 5 & 7_: Try to get your indentation to be inline with the rest of your code even if it's comments.
- _Lines 5_: Also try to leave comments explaining complex logic. Too many comments explaining things that don't take a lot of reading to understand, can polute your space and end up making your code having too much clutter.
- _Line 9_: This produces a syntax error because the string literal appears as unclosed. Moving from the opening quote, ", to the word Fibonacci, if you could move that to be on line 10, with the rest of line 10 will get rid of your error. This line (line 9) appears as if the string hasn't been close
- _Line 10_: This is a continuation of the above error. But the compiler reads this as a statement instead of a continuation of the string. Applying the above should fix this syntax error
- _Line 11_: Giving comments for your methods is good practice. But try to do that directly above the method that you're describing it's functionality. Last point, look up how to use Doc Block Comments online. It will help you a lot also with documentation of your code. Don't forget the indentation point about comments mentioned above as well.
- _Line 15_: This is a spelling error but because its considered a string, the compiler doesn't pick it up as an error.
- _Line 17_: When adding your comments, just ask yourself if you're explaining something that would take another developer a while to understand, if not, then don't write the comment and your names are descriptive enough which is a good trait to have.
- _Line 18 & 19_: Your string concatination is erroneous. Puting what's on line 19 at the end of line 18 would resolve this, as right now, the string literal on line 18 is not closed, as well as the one on line 19 according to the compiler.
- _Line 20_: A recursive function calls itself within itself. In this case, because you spelt "reverseString" differently to the name of the method, it can't find the one that you're calling and errors out. When calling the function, the name must be identical in every way. That way the compiler can identify it as well

## For Fibonacci Series
- _Line 21_: The "function()" method is not called in the driving code, i.e. your main method.
- _Line 21_: The name of the method is not descriptive enough to tell a person that's reading the name, what to expect when reading the code inside.
- _Line 21_: Using a doc block before the function is declared is also good practice.
  - _Line 22_: Please try indenting the comments to be in line with the rest of the code that it's describing.
    - _Line 29, 30, 31_: Please indent the code as stated above, and try to not describe what your code does very well in explaining with proper variable declaration and descriptive names. Good job. Try to be concise and too the point when you're adding comments.
      
    ### Recommendations
             - The question asked for a recursive function that applies the fibonacci sequence. I see your approach of using generics, but it wasn't applied correctly. Not to worry, I have a fanctastic free link that will explain it to you 
               https://www.youtube.com/watch?v=K1iu1kXkVoA Generics are extremely powerful in Java but they add a little more complexity. 
               Here's another article that will give you a nice explanation about them and examples: https://www.digitalocean.com/community/tutorials/java-generics-example-method-class-interface#java-generic-method
               There are a few simpler routes that you could follow. Here's another link that could help you understand how to solve
               problems like this one and goes on further to explain how to implement a recursive function
               https://www.javatpoint.com/fibonacci-series-in-java 
               If you have any other questions, feel free to DM me I'll get back to you within 24hrs unless something drastic happens to me that I cannot access my computer for whatever reason.

               - Try using an IDE. It will take care of some of the syntax errors by highlighint them to you in time and will also help you when debugging. JetBrains IntelliJ (Community Edition) is a good one that I would recommend but you are free to use anyone that you feel most comfortable with. 