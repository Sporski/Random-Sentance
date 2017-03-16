package lab6;


import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application implements Runnable {
	
	lab6.EventHandler _ev;
	
	JLabel j1 = new JLabel();
	JLabel j2 = new JLabel();
	JLabel j3 = new JLabel();
	JLabel j4 = new JLabel();
	JLabel j5 = new JLabel();
	@Override 
	public void run() {
		JFrame window = new JFrame("CSE115-Lab 6-Chris Sporski");
		BoxLayout g = new BoxLayout(window.getContentPane(),BoxLayout.X_AXIS);
		
		JButton _b = new JButton("Shuffle");
		EventHandler ev = new lab6.EventHandler(window,j1,j2,j3,j4,j5);
		_b.addActionListener(ev);
		
		window.setLayout(g);
		window.add(j1);
		window.add(j2);
		window.add(j3);
		window.add(j4);
		window.add(j5);
		window.add(_b);
		
		ArrayList<String> adjList = new ArrayList<String>();
		LineReader adj = new LineReader("words/adjectives");
		for (String a: adj) {
			adjList.add(a);
		}
		Collections.shuffle(adjList);
		
		ArrayList<String> advList = new ArrayList<String>();
		LineReader adv = new LineReader("words/adverbs");
		for( String b: adv){
			advList.add(b);
		}
		Collections.shuffle(advList);
		
		ArrayList<String> nounList = new ArrayList<String>();
		LineReader noun = new LineReader("words/nouns");
		for( String c: noun){
			nounList.add(c);
		}
		Collections.shuffle(nounList);
		
		ArrayList<String> verbList = new ArrayList<String>();
		LineReader verb = new LineReader("words/verbs");
		for( String d: verb){
			verbList.add(d);
		}
		Collections.shuffle(verbList);
		
		j1.setText(advList.get(0)+" ");
		j2.setText(adjList.get(0)+" ");
		j3.setText(nounList.get(0)+" ");
		j4.setText(verbList.get(0)+" ");
		j5.setText(adjList.get(1)+" ");
		
		window.pack();
		window.setVisible(true);
	}
}
