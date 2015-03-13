package bo.umsa.clasegraficos.clasegraficos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    int dados[] = {R.drawable.and_cacho, R.drawable.and_uno, R.drawable.and_dos, R.drawable.and_tres, R.drawable.and_cuatro, R.drawable.and_cinco, R.drawable.and_seis };
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = (ImageView) findViewById(R.id.imageView1);

        ImageView pg1 = (ImageView) findViewById(R.id.imageView1);
        ImageView pg2 = (ImageView) findViewById(R.id.imageView2);

        TextView pd1 = (TextView) findViewById(R.id.textView1);
        TextView pd2 = (TextView) findViewById(R.id.textView2);

        //int d1 = (int) Math.round(Math.random() * 5) + 1;
        pg1.setImageResource(dados[0]);
        //int d2 = (int) Math.round(Math.random() * 5) + 1;
        //pg2.setImageResource(dados[0]);

        pd1.setText( "");
        pd2.setText( "");
        Button pb2 = (Button) findViewById(R.id.button2);
        pb2.setEnabled(false);


        //int d1=(int)Math.round(Math.random() *5)+1;
        //int d2=(int)Math.round(Math.random() *5)+1;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void reiniciar(View vista){
        total = 0;
        ImageView pg1 = (ImageView) findViewById(R.id.imageView1);
        ImageView pg2 = (ImageView) findViewById(R.id.imageView2);

        TextView pd1 = (TextView) findViewById(R.id.textView1);
        TextView pd2 = (TextView) findViewById(R.id.textView2);

        //int d1 = (int) Math.round(Math.random() * 5) + 1;
        pg1.setImageResource(dados[0]);
        //int d2 = (int) Math.round(Math.random() * 5) + 1;
        pg2.setImageResource(dados[0]);

        pd1.setText( "");
        pd2.setText( "");
        Button pb2 = (Button) findViewById(R.id.button2);
        pb2.setEnabled(false);
        Button pb1 = (Button) findViewById(R.id.button1);
        pb1.setEnabled(true);
        Toast.makeText(this,"Reiniciando el juego",Toast.LENGTH_SHORT).show();
    }
    public void lansar(View vista){
        ImageView pg1=(ImageView) findViewById(R.id.imageView1);
        ImageView pg2=(ImageView) findViewById(R.id.imageView2);

        TextView pd1=(TextView) findViewById(R.id.textView1);
        TextView pd2=(TextView) findViewById(R.id.textView2);

        int cont = 0;

        int d1=(int)Math.round(Math.random() *5)+1;
        pg1.setImageResource(dados[d1]);
        int d2=(int)Math.round(Math.random() *5)+1;
        pg2.setImageResource(dados[d2]);

        pd1.setText(d1 +"");
        pd2.setText(d2 +"");

        if(d1+d2 == 7){
            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
            Button pb1 = (Button) findViewById(R.id.button1);
            Button pb2 = (Button) findViewById(R.id.button2);
            pb1.setEnabled(false);
            pb2.setEnabled(true);
        } else {
            cont++;
//            Toast.makeText(this, cont, Toast.LENGTH_SHORT).show();asd
        }
        if(cont > 3){
            if(d1+d2 != 7){
                Toast.makeText(this,"Perdiste",Toast.LENGTH_SHORT).show();
                Button pb1 = (Button) findViewById(R.id.button1);
                Button pb2 = (Button) findViewById(R.id.button2);
                pb1.setEnabled(false);
                pb2.setEnabled(true);
            }
        }


//        if(total == 0 && d1+d2 == 7){
//            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
//            Button pb1 = (Button) findViewById(R.id.button1);
//            Button pb2 = (Button) findViewById(R.id.button2);
//            pb1.setEnabled(false);
//            pb2.setEnabled(true);
//        } else if(total == 0 ){
//            total = d1 + d2;
//        } else if( total == d1+d2){
//            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
//            Button pb1 = (Button) findViewById(R.id.button1);
//            Button pb2 = (Button) findViewById(R.id.button2);
//            pb1.setEnabled(false);
//            pb2.setEnabled(true);
//        } else if( total > 7 && d1+d2 == 7){
//            Toast.makeText(this,"Perdiste",Toast.LENGTH_SHORT).show();
//            Button pb1 = (Button) findViewById(R.id.button1);
//            Button pb2 = (Button) findViewById(R.id.button2);
//            pb1.setEnabled(false);
//            pb2.setEnabled(true);
//        }

    }
}
