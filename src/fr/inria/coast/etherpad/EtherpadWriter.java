/**
 * 
 */
package fr.inria.coast.etherpad;

import java.util.concurrent.TimeUnit;

import fr.inria.coast.general.CollaborativeWriter;

/**
 * @author Quang-Vinh Dang
 *
 */
public class EtherpadWriter extends CollaborativeWriter {
	public EtherpadWriter(int n_user, int type_spd, String DOC_URL, int exp_id) {
		super(n_user, type_spd, DOC_URL, exp_id);
		// TODO Auto-generated constructor stub
		this.e = EtherpadHelper.getContentElement(driver);
		while (this.e == null) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(DOC_URL);
			this.e = EtherpadHelper.getContentElement(driver);
		}
	}
}