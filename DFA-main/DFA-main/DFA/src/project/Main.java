package project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Define the states
        ArrayList<String> states = new ArrayList<>();
        states.add("q0");
        states.add("q1");
        states.add("q2");

        // Define the alphabet
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("0");
        alphabet.add("1");

        // Define the transitions
        ArrayList<Transition> transitions = new ArrayList<>();
        transitions.add(new Transition("q0", "0", "q1"));
        transitions.add(new Transition("q0", "1", "q0"));
        transitions.add(new Transition("q1", "0", "q2"));
        transitions.add(new Transition("q1", "1", "q0"));
        transitions.add(new Transition("q2", "0", "q2"));
        transitions.add(new Transition("q2", "1", "q2"));

        // Define the start state
        String startState = "q0";

        // Define the accept states
        ArrayList<String> acceptStates = new ArrayList<>();
        acceptStates.add("q2");

        // Create the DFA
        DFA dfa = new DFA(states, alphabet, transitions, startState, acceptStates);

        // Test the DFA with some inputs
        System.out.println(dfa.isLanguageDFA("001"));    // accepted
        System.out.println(dfa.isLanguageDFA("001"));    // rejected
        System.out.println(dfa.isLanguageDFA("100"));    // rejected
        System.out.println(dfa.isLanguageDFA("111"));    // rejected
        System.out.println(dfa.isLanguageDFA("000"));  	 // rejected
        System.out.println(dfa.isLanguageDFA("001"));  // accepted
    }
}