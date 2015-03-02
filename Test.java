import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Test extends MIDlet implements
CommandListener {

/* Ini adalah Variable */
Display layar;
Form apa;
Command keluar;
Ticker t;

public Test() {
/* Mengambil Display */
layar = Display.getDisplay(this);

/* Menambahkan Perintah Keluar */
keluar = new Command ("Keluar", Command.EXIT, 1);
}

public void startApp() {
t = new Ticker 
("Ini Adalah Ticker");
apa = new Form
("Ini Adalah Form");
apa.append
("Hello Programer\n");
apa.append
("Hello Modifer\n");
apa.append
("Hello Semuanya\n");
apa.append
("Lihat nih gua bisa "
+ "buat aplikasi :P\n");
apa.setTicker(t);
apa.addCommand (keluar);
apa.
setCommandListener (this);

/* untuk menampilkan Form pada layar (Display) */
layar.setCurrent
(apa);
}

public void pauseApp() {}

public void destroyApp
(boolean arg0) {}

public void commandAction
(Command c, Displayable d) {
String label= c.getLabel();
if (label.equals ("Keluar")) {
destroyApp(true);

/* mengakhiri
aplikasi */
notifyDestroyed();
}
}

}
