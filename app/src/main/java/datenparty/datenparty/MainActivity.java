package datenparty.datenparty;

import

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public class Main {
    public Main() {
        try {
            Document d = Jsoup.connect("http://maschini.de:5001").get();
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(d.getElementsByTag("body").text());
            array.forEach(System.out::println);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}