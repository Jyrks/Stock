package ee.stocks;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;

import java.io.IOException;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.add(Calendar.YEAR, -5); // from 5 years ago

        Stock google = null;
        try {
            google = YahooFinance.get("GOOG", from, to, Interval.WEEKLY);
        } catch (IOException e) {
            e.printStackTrace();
        }
        google.print();
    }

}
