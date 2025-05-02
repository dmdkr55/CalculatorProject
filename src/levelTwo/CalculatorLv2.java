package levelTwo;

import java.util.ArrayList;

public class CalculatorLv2 {

    private ArrayList<Integer> results = new ArrayList<>();

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    public int calculate(int n1, int n2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    throw new RuntimeException();
                }
                result = n1 / n2;
                break;
        }
        results.add(result);
        return result;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

}
