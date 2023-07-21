package project;


class Transition {
    private String currentState;
    private String currentSymbol;
    private String destState;

    public Transition(String currentState, String currentSymbol, String destState) {
        this.currentState = currentState;
        this.currentSymbol = currentSymbol;
        this.destState = destState;
    }

    public String getCurrentState() {
        return currentState;
    }

    public String getCurrentSymbol() {
        return currentSymbol;
    }

    public String getDestState() {
        return destState;
    }
}