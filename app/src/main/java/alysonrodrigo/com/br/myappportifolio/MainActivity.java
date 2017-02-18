package alysonrodrigo.com.br.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarPopularMovies(View view){
        exibirToast("This button will launch my popular movies app!");
    }

    public void chamarStockHawk(View view){
        exibirToast("This button will launch my stock hawk app!");
    }

    public void chamarBuildItBigger(View view){
        exibirToast("This button will launch my build it bigger app!");
    }

    public void chamarMakeYourAppMaterial(View view){
        exibirToast("This button will launch my make your material app!");
    }

    public void chamarGoUbiquitous(View view){
        exibirToast("This button will launch my go ubiquitous app!");
    }

    public void chamarCapstone(View view){
        exibirToast("This button will launch my capstone app!");
    }

    private void exibirToast(String messsage){
        Toast.makeText(this,messsage,Toast.LENGTH_SHORT).show();
    }
}
