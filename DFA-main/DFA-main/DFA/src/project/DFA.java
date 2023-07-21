package project;

import java.util.ArrayList;

class DFA {
    private ArrayList<String> states;
    private ArrayList<String> alphabet;
    private ArrayList<Transition> transitions;
    private String startState;
    private ArrayList<String> acceptStates;

    public DFA(ArrayList<String> states, ArrayList<String> alphabet, ArrayList<Transition> transitions, String startState, ArrayList<String> acceptStates) {
        this.states = states;
        this.alphabet = alphabet;
        this.transitions = transitions;
        this.startState = startState;
        this.acceptStates = acceptStates;
    }

    public boolean isAcceptState(String state) {
        return acceptStates.contains(state);
    }

    public String isLanguageDFA(String input) {
        String currentState = startState;
        for (int i = 0; i < input.length(); i++) {
            String symbol = String.valueOf(input.charAt(i));
            Transition transition = getTransition(currentState, symbol);
            if (transition == null) {
                return "rejected";
            }
            currentState = transition.getDestState();
        }
        if (acceptStates.contains(currentState)) {
            return "accepted";
        } else {
            return "rejected";
        }
    }

    private Transition getTransition(String currentState, String currentSymbol) {
        for (Transition transition : transitions) {
            if (transition.getCurrentState().equals(currentState) && transition.getCurrentSymbol().equals(currentSymbol)) {
                return transition;
            }
        }
        return null;
    }
}