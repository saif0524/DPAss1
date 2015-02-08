package talkingtom.main;

/*	Saif Uddin Mahmud
 *  Date: 29-01-2015
 *  Comment: This is the main client class
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import talkingtom.expressions.Expression1;
import talkingtom.expressions.Expression2;
import talkingtom.expressions.Expression3;
import talkingtom.interfaces.IExpression;
import talkingtom.utils.TalkingTom;

public class MainApp {

	public static void main(String[] args) {

		List<IExpression> expList = new ArrayList<IExpression>();

		expList.add(new Expression1());
		expList.add(new Expression2());
		expList.add(new Expression3());

		TalkingTom tom = new TalkingTom();

		Random rand = new Random();

		tom.like(expList.get(rand.nextInt(3) + 0));
	}
}