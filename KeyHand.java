package Default;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHand implements KeyListener {
	
	Panel dp;
	
	public KeyHand(Panel dp) {
		this.dp = dp;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_SHIFT) {
		//	dp.search();
			dp.autoSearch();
		}
	}

	
	
	@Override
	public void keyReleased(KeyEvent e) {
}

}
