

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        Button AddFront = (Button) findViewById(R.id.addFrontButton);
        Button RemoveFront = (Button) findViewById(R.id.removeFrontButton);
        Button AddEnd = (Button) findViewById(R.id.addEndButton);
        Button RemoveEnd = (Button) findViewById(R.id.removeEndButton);

        AddFront.setOnClickListener(new AddFront.OnClickListener());
        RemoveFront.setOnClickListener(new RemoveFront.OnClickListener());
        AddEnd.setOnClickListener(new AddEnd.OnClickListener());
        RemoveEnd.setOnClickListener(new RemoveEnd.OnClickListener());

        ListCore.inflater = this.getLayoutInflater();
        ll.addFront("1");
        ll.addFront("2");
        ll.addFront("3");
        ll.addFront("4");
        ll.display();
        ll.removeFront();
        ll.display();

        /*
        View v;
        for(int i = 0; i < 10; i++)
        {
            v = this.getLayoutInflater().inflate(R.layout.node, null);
            TextView tf = (TextView) v.findViewById(R.id.theValueTF);
            tf.setText("" + i);
            svLL.addView(v);
        }
        */
    }

        public void onClick (View v)
        {
            if (v == ll.addFront)
            {
                LinkedList.addFront;
            }
            else if (v == ll.removeEnd)
            {
                LinkedList.removeEnd;
            }
            else if (v == ll.addEnd);
            {
                LinkedList.addEnd;
            }
            else if (v == ll.removeEnd);
            {
                LinkedList.removeEnd;
            }
            else
            {
                return;
            }



        }
    }