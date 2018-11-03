import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

// class Mike {
	 //  1/1/11
// does nothing but makes the compiler create a class file
//}
/**
 *
 */

public class CBchanGen
	extends MIDlet
	implements CommandListener {
				 	private List SensorsList;		//3/2/2017
	public void startApp() {

	Display display = Display.getDisplay(this);
// StringBuilder s1 = new StringBuilder("test Mike");
	Form mainForm = new Form ("CB channels");
	SensorsList = new List("Mike string", List.EXCLUSIVE);
	mainForm.append("Welcome to the Mike's world of MIDlets");

//	mainForm.append("second" + 2 + "line Mike");

//	int d = getDayOfMonth();
int newv ;
//	newv = Mike.seta(3);
		int ch = 1;
		for (int x =476425 ; x < 477400+1; x = x +25 ) {
			mainForm.append("\n CB channel " + ch +  " frequency " + x +  "kHz");

			ch = ch + 1;
		}
	Command exitCommand = new Command("Exit", Command.EXIT, 0);
	mainForm.addCommand(exitCommand);
	mainForm.setCommandListener(this);
	display.setCurrent (mainForm) ;
}
/**
 *
 */
public void pauseApp() {}
/**
 * @param unconditional Do it ANYWAY
 */
public void destroyApp(boolean unconditional) {}
/**
 *
 */
public void commandAction(Command c , Displayable s ) {
	if (c.getCommandType() == Command.EXIT)
		notifyDestroyed();
	}
}
