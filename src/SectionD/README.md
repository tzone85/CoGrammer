# OPTION 1:

I have two approaches, and they are dependent on one another.

1. My first approach, would be to try getting the students that are behind to be on par without shining too much spotlight on them to the point where they might be rebellious and not fully participate.
   So my first approach, would be to have a test in roughly 3 days time. This test is not one that's to be added to their year mark, but rather a test that's to ensure that they study with purpose in mind
   and a deadline is also involved. This is beneficial for everybody in class as it provides the students that are at risk of falling behind an opportunity to catch up as no new work will be added as we go over
   what's most likely to come in the test and asking the students to be vocal about which topics they would like me to revise with them.

   This not only offers an opportunity for those students to catch up but also gives the ones left behind an opportunity to catch up and know what to focus on when studying. If there are any topics that they  
   don't understand with the work that they have covered, this is an ideal time to iron those areas. Even the group that's ahead benefits for this gives them yet another opportunity to revise the work that they
   have already covered. Making them even more prepared for the exam.

2. This is the second portion, where we have a Hackerthon. Step one is necessary for it provides the students an opportunity to read over the theory and have some practice time to solidify the concepts.
   A hackerthon is to ensure that not only are they versed in the theory but have an opportunity to work together and have them cross pollinate and share knowledge. The risk here would be that the students
   that are ahead stick together and the ones that are at risk also sticking together so the **key requirement** here would be to ensure that the groups are well distributed with students from all three
   "tiers" so to speak. Then the trick would be to make them willing to be the winning team, so the reward needs to be something wothwhile, like maybe a 50K prize for example. The final piece of the puzzle,
   I, the moderator, get to choose who presents the final project to everybody. If the presenter is someone who can't explain well enough how they went about their solution, then even if the team did a remarkable
   job, they will not get all the points that they could have gotten. This is to prevent the top achievers from taking the lead and leaving their behind, not understanding what or why things are being done a
   specific way. So it forces them to share their knowledge for when they win the grand prize, they will all get to share it amongst each other equally.

_**I believe these two approaches will not only do the job but get the students to collaborate and share knowledge as well which is a great skill to have for when they enter the working environment. So it goes beyond just the classroom**_

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# OPTION 2:

From what you've described here, there are a few things to check.
1. First lets check if you have imported `import javax.swing.JOptionPane` within your project. Good now that that is there, lets test the problem again and see if there are any changes.
2. You said your do-while loop has an infinite loop. Ok, lets look into that. Why did you use a do while loop and the reason for my question is, because a do-while loop needs to run at least once. That is what makes it different from a normal
   while-loop. The second thing to look out for is the sentinel, in other words, when should your program terminate. Under normal circumstances, with each iteration, your program should be getting closer and closer to the sentinel so that it can terminate.
   So, is there a reason you chose to utilize a do-while loop, is your logic required to run at least once? If so, what condition should we be approaching with every iteration to ensure that our program terminates when it reaches that condition and prevent the infinite loop.
   Lets test again as this should take care of the infinite loop.
3. If you've done all of the above, and lets say it still doesn't show, lets right a small script that checks if the problem is with your logic, that could be preventing the JOptionPane, or if it's the JOptionPain itself.

    - public static void main(String[] args){
      JOptionPane.showMessageDialog(null,"This is only a Test =\)","ALERT",JOptionPane.INFORMATION_MESSAGE);
      }

_**If after removing the code within our main method putting the above and the alert pops up, then the problem is with the logic of the program and not the JOptionPane. So now we'll dive deeper into understanding the logic that your program is following.**_
