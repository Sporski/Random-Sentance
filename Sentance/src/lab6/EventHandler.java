package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandler implements ActionListener{
	JFrame window;
	JLabel j1;
	JLabel j2;
	JLabel j3;
	JLabel j4;
	JLabel j5;
	
	ArrayList<String> adjList;
	public void actionPerformed(ActionEvent e) {
		
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
		
	}
	
	public EventHandler(JFrame _w, JLabel _j1,JLabel _j2,JLabel _j3,JLabel _j4,JLabel _j5){	
		window = _w;
		j1 = _j1;
		j2 = _j2;
		j3 = _j3;
		j4 = _j4;
		j5 = _j5;
	}

}
