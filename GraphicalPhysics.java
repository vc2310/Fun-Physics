//author @ Vaibhav Chadha
import java.awt.*;
import hsa.Console;

public class GraphicalPhysics
{
    static Console c;           // The output console

    public static void main (String[] args) throws InterruptedException
    {

	c = new Console ();
	c.setColor (new Color (0, 0, 255));
	Boundary ();

	//inserting background

	c.setColor (new Color (255, 222, 173));
	c.fillRect (30, 30, 580, 450);

	//tittle
	Font times = new Font ("Times", Font.BOLD, 50);
	c.setColor (Color.black);
	c.setFont (times);
	c.drawString ("PHYSICS", 200, 80);

	//Drawing Rocket
	c.fillRect (500, 160, 40, 100);
	c.drawLine (500, 160, 520, 100);
	c.drawLine (540, 160, 520, 100);
	c.drawLine (540, 260, 555, 265);
	c.drawLine (540, 230, 555, 265);
	c.drawLine (500, 260, 485, 265);
	c.drawLine (500, 230, 485, 265);
	c.setColor (Color.red);
	c.fillRect (515, 260, 10, 15);

	//Writing formula d = t * v
	Thread.sleep (600);
	c.setColor (new Color (220, 220, 220));
	c.fillOval (65, 100, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (95, 100, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (125, 100, 50, 50);
	c.setColor (Color.blue);
	Font plain = new Font ("Times", Font.PLAIN, 40);
	c.setFont (plain);
	c.drawString ("d=t*v", 70, 140);


	//Writing formula V=IR
	Thread.sleep (600);
	c.setColor (new Color (220, 220, 220));
	c.fillOval (65, 250, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (95, 250, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (125, 250, 50, 50);
	c.setColor (Color.blue);
	c.drawString ("V=IR", 70, 290);


	//Writing formula F=ma
	Thread.sleep (600);
	c.setColor (new Color (220, 220, 220));
	c.fillOval (250, 160, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (280, 160, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (310, 160, 50, 50);
	c.setColor (Color.blue);
	c.drawString ("F=ma", 255, 200);

	//Writing formula Q=ne
	Thread.sleep (600);
	c.setColor (new Color (220, 220, 220));
	c.fillOval (250, 310, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (280, 310, 50, 50);

	c.setColor (new Color (220, 220, 220));
	c.fillOval (310, 310, 50, 50);
	c.setColor (Color.blue);
	c.drawString ("Q=ne", 255, 350);



	//end of title page
	Thread.sleep (800);
	c.setColor (Color.green);
	Font italic = new Font ("Times", Font.ITALIC, 30);
	c.setFont (italic);
	c.drawString ("Press Any Key To Continue", 60, 450);
	c.setFont (times);
	Thread.sleep (500);
	c.drawString (".", 430, 450);
	Thread.sleep (500);
	c.drawString (".", 440, 450);
	Thread.sleep (500);
	c.drawString (".", 450, 450);
	Thread.sleep (500);
	c.drawString (".", 460, 450);
	Thread.sleep (500);
	c.drawString (".", 470, 450);
	Thread.sleep (500);
	c.drawString (".", 480, 450);
	c.getChar ();
	c.clear ();
	//loading page comes to make it more intractive
	Loading ();

	name ();

    } // main method


    public static void Boundary () throws InterruptedException
    {
	for (int index1 = 0 ; index1 <= 500 ; index1 += 10)
	{
	    c.fillRect (0, index1, 30, 30);
	    Thread.sleep (30);

	}

	for (int index2 = 30 ; index2 <= 640 ; index2 += 10)
	{
	    c.fillRect (index2, 470, 30, 30);
	    Thread.sleep (30);

	}
	for (int index3 = 470 ; index3 >= 0 ; index3 -= 10)
	{
	    c.fillRect (610, index3, 30, 30);
	    Thread.sleep (30);

	}
	for (int index4 = 640 ; index4 >= 0 ; index4 -= 10)
	{
	    c.fillRect (index4, 0, 30, 30);
	    Thread.sleep (30);
	}

    }


    public static void Loading () throws InterruptedException //loading page
    {

	Font times = new Font ("Times", Font.BOLD, 40);
	c.setColor (Color.red);
	c.setFont (times);
	c.drawString ("LOADING", 230, 260);
	c.setColor (Color.blue);
	c.drawRect (29, 209, 582, 62);
	c.setColor (Color.yellow);
	for (int index2 = 30 ; index2 <= 580 ; index2 += 10)
	{
	    c.fillRect (index2, 210, 30, 60);
	    Thread.sleep (100);

	}
	Font timesNewRoman = new Font ("Times", Font.PLAIN, 20);
	c.setColor (Color.red);
	c.setFont (timesNewRoman);
	c.drawString ("Loading Complete,Press Any Key To Continue", 60, 450);
	c.setFont (times);
	c.getChar ();
	c.clear ();
    }
    public static void name () throws InterruptedException

    {
	c.clear ();
	c.println ("Hello....Welcome to my world !!What's your name?");
	String name = c.readString ();
	c.println ("Hey " + name );
	c.println("Select Anyone of the following:");
	c.println ("1.Physics Quiz");
	c.println ("2.Some physics topics");
	c.println ("3.Program Portfolio");
	c.println ("4.Exit");
	int choice = c.readInt ();
	if (choice == 1)
	{
	    physics ();
	}
	else if (choice == 2)
	{
	    arrays ();
	}
	else if (choice == 3)
	{
	    ProgramPortfolio ();
	}
	else if (choice == 4)
	{
	    Exit ();
	}
    }
    public static void Index () throws InterruptedException

    {
	c.clear();
	c.println("Select Anyone of the following:");
	c.println ("1.Physics Quiz");
	c.println ("2.Some physics topics");
	c.println ("3.Program Portfolio");
	c.println ("4.Exit");
	int choice = c.readInt ();
	if (choice == 1)
	{
	    physics ();
	}
	else if (choice == 2)
	{
	    arrays ();
	}
	else if (choice == 3)
	{
	    ProgramPortfolio ();
	}
	else if (choice == 4)
	{
	    Exit ();
	}

    }


    public static void physics () throws InterruptedException
    {
	c.clear ();
	c.println (" So come on , lets check your physics knowledge with starting a small quiz ");
	Thread.sleep (800);
	c.println ("Select the topic on which you think you are good");
	c.println ("1.Basic maths skills");
	c.println ("2.Distance formula when a!=0");
	c.println ("3.Ohms Law");
	c.println ("4.Back to main menu");
	double option = c.readDouble ();
	if (option == 1)
	{
	    c.clear ();
	    int m = 0;
	    c.println ("Tell Number of scientific digits in following numbers ");
	    //1st
	    c.println ("12000 ");
	    double first = c.readDouble ();
	    if (first == 2)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '2significant digits'");
	    }
	    c.println ();
	    //2nd
	    c.println ("8.0002 ");
	    double second = c.readDouble ();
	    if (second == 5)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '5significant digits'");
	    }
	    c.println ();
	    //3rd
	    c.println ("0.1477 ");
	    double third = c.readDouble ();
	    if (third == 4)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '4significant digits'");
	    }
	    c.println ();
	    //4th
	    c.println ("3.4 ");
	    double fourth = c.readDouble ();
	    if (fourth == 2)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '2significant digits'");
	    }
	    c.println ();
	    c.println ("So with this you are done with one part, so now convert the following upto 2 significant digits");
	    c.println ();
	    //1st
	    c.println ("12094.9 ");
	    double firstno = c.readDouble ();
	    if (firstno == 12000)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("You are wrong,The correct answer is '12000'");
	    }
	    c.println ();
	    //2nd
	    c.println ("22999 ");
	    double secondno = c.readDouble ();
	    if (secondno == 23000)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The correct answer is '23000'");
	    }
	    c.println ();
	    //3rd
	    c.println ("0.14532");
	    double thirdno = c.readDouble ();
	    if (thirdno == 0.14)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '0.14'");
	    }
	    c.println ();
	    //4th
	    c.println ("0.00018889");
	    double fourthno = c.readDouble ();
	    if (fourthno == 0.00019)
	    {
		c.println ("This is the correct answer");
		m++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '0.00019'");
	    }
	    c.println ();
	    c.println ("In maths quiz you score is " + (100 * m / 8) + "%");
	    c.println ();
	    c.println ("So with this you are finished with you quiz, press any key to go back");
	    c.getChar ();
	    c.clear ();
	    physics ();

	}
	//Distance formula
	else if (option == 2)

	    {
		c.clear ();
		int correctAnswers = 0;
		c.println ("So we are going to do our quiz on basis of the basic formula");
		Thread.sleep (500);
		c.println ("So our basic formula is d=t*v");
		Thread.sleep (500);
		c.println ("Here");
		Thread.sleep (200);
		c.println ("'t' refers to time");
		Thread.sleep (200);
		c.println ("'d' refers to distance/displacement");
		Thread.sleep (200);
		c.println ("'v' refers to speed/velocity");
		c.println ("Press any key to move on to the quiz");
		c.getChar ();
		c.clear ();
		//first question
		c.println ("A bus moved at 60km/h for 120km.Find the total time taken to cover it?");
		double time = c.readDouble ();
		if (time == 2)
		{
		    c.println ("This is the correct answer");
		    correctAnswers++;
		}
		else
		{
		    c.println ("Sorry ,you are wrong,The right answer is '2hrs'");
		}
		c.println ();
		//second question
		c.println ("A car travelled at 100km in 2hrs.Find the average speed of car?");
		double speed = c.readDouble ();
		if (speed == 50)
		{
		    c.println ("This is the correct answer");
		    correctAnswers++;
		}
		else
		{
		    c.println ("Sorry ,you are wrong,The right answer is '50km/hr'");
		}
		c.println ();
		//third question
		c.println ("A man on bike with a constant speed of 50km/hr travelled for 3 hours.Find the distance travelled by the man?");
		double distance = c.readDouble ();
		if (distance == 150)
		{
		    c.println ("This is the correct answer");
		    correctAnswers++;
		}
		else
		{
		    c.println ("Sorry ,you are wrong,The right answer is '150km'");
		}
		c.println ();
		//fourth question
		c.println ("This is the last question of your quiz.So here is a situation given below.Say 'y' if its possible or say 'n'.");
		c.println ("'A man covered 27.6km in 2.3hrs with a constant velocity of 12km/hr.'");
		char reply = c.readChar ();
		if (reply == 'y')
		{
		    c.println ("This is the correct answer");
		    correctAnswers++;
		}
		else if (reply == 'n')
		{
		    c.println ("Sorry ,you are wrong.This is possible ");
		}
		else
		{
		    c.println ("sorry,invalid input");
		}
		c.println ();
		c.println ("Your score is " + (100 * correctAnswers / 4) + "%");
		c.getChar ();
		c.clear ();
		double Distance, TimeTaken;
		c.println ("Come on!! Lets find out your averge speed from your school to house");
		c.println ("Enter the distance of the school from your house in km");
		Distance = c.readDouble ();
		c.println ("Enter the time taken by you to come to school in hours");
		TimeTaken = c.readDouble ();
		CalcSpeed (Distance, TimeTaken);
		c.println ();
		c.println ();
		c.println ("So with this you are finished with you quiz, press any key to go back");
		c.getChar ();
		c.clear ();
		physics ();

	    }

	else if (option == 3)
	{
	    c.clear ();
	    int marks = 0;
	    c.println ("So we are going to do our quiz on OHMS LAW(V=IR)");
	    Thread.sleep (500);
	    c.println ("So our basic formula is V=IR");
	    Thread.sleep (500);
	    c.println ("Here");
	    Thread.sleep (200);
	    c.println ("'V' refers to Potential Difference");
	    Thread.sleep (200);
	    c.println ("'I' refers to Current");
	    Thread.sleep (200);
	    c.println ("'R' refers to Resistence");
	    c.println ("Press any key to move on to the quiz");
	    c.getChar ();
	    c.clear ();
	    //first question
	    c.println ("A wire is attached to a battery with 12V and has a resister of 6 ohms.Find the current following through this wire?");
	    double current = c.readDouble ();
	    if (current == 2)
	    {
		c.println ("This is the correct answer");
		marks++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '2amp'");
	    }
	    c.println ();
	    //second question
	    c.println ("A 20 ohm light bulb is connected to a wire carring current of 7amp.Find the voltage of battery?");
	    double voltage = c.readDouble ();
	    if (voltage == 140)
	    {
		c.println ("This is the correct answer");
		marks++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '140volts'");
	    }
	    c.println ();
	    //third question
	    c.println ("A wire with current of 16 amp is conneceted to a battery of 12Volts.Find the resistence of light bulb in this system?");
	    double distance = c.readDouble ();
	    if (distance == 0.75)
	    {
		c.println ("This is the correct answer");
		marks++;
	    }
	    else
	    {
		c.println ("Sorry ,you are wrong,The right answer is '0.75 ohms'");
	    }
	    c.println ();
	    //fourth question
	    c.println ("This is the last question of your quiz.So here is a situation given below.Say 'y' if its possible or say 'n'.");
	    c.println ("'A wire has resistence of 15 ohm and current of 12 amp is flowing through a battery of 150 Volts'");
	    char response = c.readChar ();
	    if (response == 'n')
	    {
		c.println ("This is the correct answer");
		marks++;
	    }
	    else if (response == 'y')
	    {
		c.println ("Sorry ,you are wrong.This is not possible ");
	    }
	    else
	    {
		c.println ("sorry,invalid input");
	    }
	    c.println ();
	    c.println ("Your score is " + (100 * marks / 4) + "%");
	    c.getChar ();
	    c.clear ();
	    double Resistence, Voltage;
	    c.println ("Now lets find out the current across a bulb in your home");
	    c.println ("Enter the Resistence of the electric bulb");
	    Resistence = c.readDouble ();
	    c.println ("Enter the Voltage supply");
	    Voltage = c.readDouble ();
	    CalcCurrent (Resistence, Voltage);
	    c.println ();
	    c.println ();
	    c.println ("So with this you are finished with you quiz, press any key to go back");
	    c.getChar ();
	    c.clear ();
	    physics ();
	}
	else if (option == 4)
	{
	    Index ();
	}


    }


    public static double CalcSpeed (double distance1, double time1)  //Functional method
    {
	c.println ("Average speed   = " + (distance1 / time1) + "km/hr");
	double speed = distance1 / time1;
	return speed;

    } // CalcSpeed


    public static double CalcCurrent (double Resistence1, double Voltage1)  //Functional method
    {
	c.println ("Current   = " + (Voltage1 / Resistence1) + "amp");
	double Current = Voltage1 / Resistence1;
	return Current;

    } // CalcCurrent


    public static void ProgramPortfolio () throws InterruptedException
    {
	c.clear ();
	c.println ("1.Determining Grade");
	c.println ("2.Salary Title Page");
	c.println ("3.Boundry without loops");
	c.println ("4.Back to main menu");
	int program = c.readInt ();
	if (program == 1)
	{
	    grades ();
	}
	else if (program == 2)
	{
	    SalaryTitlePage ();
	}
	else if (program == 3)
	{
	    BoundaryWithoutLoops ();
	}
	 else if(program == 4)
	{
	    Index ();
	}
    }


    public static void grades () throws InterruptedException
    {
	c.clear ();

	//being friendly with user
	c.println ("Hey!My name is Vaibhav, Whats is your name?");
	String name = c.readString ();
	//Asking grade
	c.println ("So " + (name) + ",you are in which class?");
	String Grade = c.readString ();
	//Asking if he/she needs help
	c.println ("Do you want to know that you are lying in which grade level?");
	String Response = c.readString ();
	//asking for percentage
	c.println ("So what is your percentage going on in your class?");
	int Percentage = c.readInt ();
	c.getChar ();
	c.clear ();

	//Determining grade by using if statement
	if (Percentage >= 101)
	{
	    c.println ("Sorry that's an in valid data");
	}
	else if (Percentage >= 80)
	{
	    c.println ("Nice job,you are lying in 'A' grade");
	}
	else if (Percentage >= 70)
	{
	    c.println ("Well done,you are lying in 'B' grade");
	}
	else if (Percentage >= 60)
	{
	    c.println ("Keep practicing you are lying in 'C' grade");
	}
	else if (Percentage >= 50)
	{
	    c.println ("Put little bit more efforts so that you can improve yourself as you are lying in 'D' grade");
	}
	else if (Percentage >= 00)
	{
	    c.println ("You need a lot of practice as you are lying in 'F' grade");
	}
	else if (Percentage < 00)
	{
	    c.println ("Sorry that's an invalid data");
	}
	c.getChar ();
	ProgramPortfolio ();

    }


    public static void SalaryTitlePage () throws InterruptedException
    {
	c.clear ();

	//inserting background
	c.setColor (Color.black);
	c.drawRect (30, 30, 580, 450);
	c.setColor (new Color (255, 222, 173));
	c.fillRect (31, 31, 579, 449);

	//tittle
	Font times = new Font ("Times", Font.BOLD, 50);
	c.setColor (Color.white);
	c.setFont (times);
	c.drawString ("Salary Calculator", 120, 80);

	//making a $100 note
	c.setColor (new Color (222, 184, 135));
	c.fillRect (180, 110, 300, 90);

	c.setColor (Color.black);
	Font abc = new Font ("Times", Font.PLAIN, 100);
	c.setFont (abc);
	c.drawString ("$100", 210, 190);

	//making a $1 coin
	c.drawOval (50, 300, 100, 100);

	Font abcd = new Font ("Times", Font.PLAIN, 40);
	c.setFont (abcd);
	c.drawString ("$", 60, 350);


	Font xyz = new Font ("Times", Font.PLAIN, 100);
	c.setFont (xyz);
	c.drawString ("1", 80, 380);

	//making a bill
	c.setColor (Color.white);
	c.fillRect (190, 260, 150, 150);

	c.setColor (Color.red);
	Font tuv = new Font ("Times", Font.PLAIN, 60);
	c.setFont (tuv);
	c.drawString ("BILL", 200, 310);

	c.setColor (Color.black);
	c.fillStar (200, 360, 30, 40);
	c.fillStar (240, 360, 30, 40);
	c.fillStar (280, 360, 30, 40);
	c.fillStar (200, 320, 30, 40);
	c.fillStar (240, 320, 30, 40);
	c.fillStar (280, 320, 30, 40);

	//drawing Canada's Flag
	c.setColor (Color.red);
	c.fillRect (380, 290, 80, 100);
	c.setColor (Color.white);
	c.fillRect (460, 290, 80, 100);
	c.setColor (Color.red);
	c.fillRect (530, 290, 80, 100);
	c.fillMapleLeaf (465, 300, 60, 80);

	//drawing a diagram showing that miney makes happy
	c.setColor (Color.black);
	Font pqr = new Font ("Times", Font.PLAIN, 20);
	c.setFont (pqr);
	c.drawString ("CANADA", 450, 420);

	c.drawRoundRect (40, 180, 100, 100, 30, 30);
	c.drawArc (40, 170, 100, 100, 210, 120);

	c.drawString ("MONEY", 50, 210);
	c.drawLine (85, 220, 85, 240);

	c.getChar ();
	ProgramPortfolio ();

    }


    public static void BoundaryWithoutLoops () throws InterruptedException
    {
	c.clear ();
	c.setColor (Color.black);
	c.fillRect (0, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 50, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 100, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 150, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 200, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 250, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 300, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 350, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 400, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 100, 100);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 150, 150);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 200, 200);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 250, 250);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 300, 300);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 350, 350);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 450, 450);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 500, 500);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 550, 550);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 600, 600);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (0, 450, 650, 650);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 400, 600, 600);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 350, 550, 550);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 300, 500, 500);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 250, 450, 450);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 200, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 150, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 100, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 50, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (580, 0, 400, 400);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (530, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (480, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (430, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (380, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (330, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (280, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (230, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (180, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (130, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (80, 0, 50, 50);
	Thread.sleep (500);

	c.setColor (Color.black);
	c.fillRect (30, 0, 50, 50);
	Thread.sleep (500);

	c.getChar ();
	ProgramPortfolio ();

    } // Fun Drawing


    //Arrays
    public static void arrays () throws InterruptedException
    {

	c.clear ();
	String physics[] = new String [5];
	physics [0] = "Forces and Motion";
	physics [1] = "Energy, Work, and Power";
	physics [2] = "Waves and Sound";
	physics [3] = "Light and Geometric Optics";
	physics [4] = "Electricity and Magnetism";


	c.println ("Some Topics of Physics are:");
	for (int index = 0 ; index <= 4 ; index++)
	{
	    c.println (physics [index]); //Prints arrays in order of declaration
	}
	c.println ("Please press any key to continue");
	c.getChar ();
	c.clear ();
	alphabeticalOrder (physics);
	calculateLength (physics);
	Index ();

    }


    public static void alphabeticalOrder (String[] physics) throws InterruptedException
    {
	c.println ("List of topics in alphabetical order: ");
	java.util.Arrays.sort (physics);
	for (int index = 0 ; index <= 4 ; index++)
	{
	    c.println (physics [index]); //Prints arrays in order of alphabet
	}
	c.println ("Please press any key to continue.");
	c.getChar ();
	c.clear ();
    } //alphabeticalOrder method


    public static void calculateLength (String[] physics) throws InterruptedException
    {
	c.println ("The length of each topic: ");
	for (int index = 0 ; index <= 4 ; index++)
	{
	    int length = (physics [index]).length ();
	    c.println (physics [index] + "= " + length);
	}
	c.println ("Please press any key to continue");
	c.getChar ();
	c.clear ();
	c.println (findMax (physics));
	c.println (findMin (physics));
	c.println (calculateSum (physics));
	c.println (calculateAverage (physics));
	c.println ("Please press any key to continue.");
	c.getChar ();


    } //calculateLength method


    public static String findMax (String[] physics)
    {
	int max = (physics [0]).length ();
	for (int counter = 1 ; counter < physics.length ; counter++)
	{
	    if (max < (physics [counter]).length ())
	    {
		max = physics [counter].length ();
	    }
	}
	return ("The longest topic has a length of " + max);
    } //findMax method


    public static String findMin (String[] physics)
    {
	int min = (physics [0]).length ();
	for (int counter = 1 ; counter < physics.length ; counter++)
	{
	    if (min > (physics [counter]).length ())
	    {
		min = physics [counter].length ();
	    }
	}
	return ("The shortest topic has a length of " + min);
    } //findMin method


    public static String calculateSum (String[] physics)
    {
	int sum = 0;
	for (int index = 0 ; index < physics.length ; index++)
	{
	    sum = sum + (physics [index]).length ();
	}
	return ("The total amount of length in the list of topics is " + sum);
    } //calculateSum method


    public static String calculateAverage (String[] physics)
    {
	double sum = 0;
	for (int index = 0 ; index < physics.length ; index++)
	{
	    sum = sum + physics [index].length ();
	}
	double average = sum / 5;
	return ("The average amount of length in the list of topics is " + average);


    } //calculateAverage method


    public static void Exit ()
    {
	c.setColor (Color.red);
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.yellow);
	Font times = new Font ("Times", Font.BOLD, 70);
	c.setFont (times);
	c.drawString ("THANK YOU..!!!", 70, 300);
	c.getChar ();
	c.close ();
    }
} 
