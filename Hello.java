/* mengimpor class yang dibutuhkan */
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;

/* mendeklarasikan class "Hello",
menjadikan class turunan dari class MIDlet,
serta mengimplementasikan interface CommandListener
agar class ini dapat berfungsi sebagai penangan Command */
public class Hello extends MIDlet implements CommandListener {

	/* membuat global variable */
	private Form objForm;
	private Display objDisplay;
	private Command objCmdExit;

	/* method "startApp()" yang akan dieksekusi
	pada saat aplikasi dimulai atau setelah aplikasi dijeda (Paused) 
	dan menjadikan aplikasi berstatus "Active" */
	public void startApp() {

		/* membuat objek bertipe Form
		dengan title "Hello World"
*/
		objForm = new Form("Hello World!");

		/* menambahkan text ke dalam objek form */
		objForm.append("How to create an app with J2ME SDK Mobile ?");

		/* membuat objek bertipe Command */
		objCmdExit = new Command("Exit", Command.EXIT, 1);

		/* memasang objek Command ke dalam form */
		objForm.addCommand(objCmdExit);

		/* memasang objek CommandListener pada form,
berfungsi sebagai penangan (Listener) Command yang terpasang agar Command dapat berjalan */
		objForm.setCommandListener(this);

		/* objek Display tidak dapat di buat dengan keyword "new"
melainkan telah tersedia satu objek Display untuk setiap MIDlet */
		objDisplay = Display.getDisplay(this);

		/* menampilkan objek form */
		objDisplay.setCurrent(objForm);
	}

	/* method pauseApp akan dieksekusi ketika aplikasi dijeda,
	dan menjadikan status aplikasi ke "Paused"

	kali ini tak ada implementasi apa apa di sini
	tapi method tetap harus di buat karena class Hello
	sebagai turunan dari MIDlet (extends MIDlet) diharuskan mengimplementasikannya,
	dalam pemerograman OOP, ini di sebut override */
	public void pauseApp() {
	}

	/* method ini dieksekusi ketika aplikasi berstatus "Destroyed" */
	public void destroyApp(boolean unconditional) {
	}

	/* method ini yang menangani objek Command */
	public void commandAction( Command c, Displayable d){

		/* menghentikan aplikasi */
		notifyDestroyed();
	}
}
