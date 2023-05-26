package com.example.semana9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana9.adapters.AnimesAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListaAnimesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_animes);
        AnimesAdapter adapter = new AnimesAdapter(data());

        RecyclerView rvLista =  findViewById(R.id.rvListaSimple);
        rvLista.setLayoutManager(new LinearLayoutManager(this));
        rvLista.setAdapter(adapter);
    }
    private List<Anime> data() {
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Fairy Tail","Nulla porttitor accumsan tincidunt.","https://w7.pngwing.com/pngs/782/110/png-transparent-natsu-dragneel-fairy-tail-anime-clothing-fairy-tail-manga-computer-wallpaper-cartoon-thumbnail.png", false));
        animes.add(new Anime("Naruto","Narra la historia de un Ninja huérfano adolescente llamado Naruto Uzumaki.","https://w7.pngwing.com/pngs/639/327/png-transparent-naruto-uzumaki-sasuke-uchiha-kakashi-hatake-asuma-sarutobi-naruto-shippuden-naruto-vs-sasuke-naruto-cartoon-fictional-character-naruto-thumbnail.png", true));
        animes.add(new Anime("Dragon Ball","Describe las aventuras de Gokū, un guerrero saiyajin.","https://w7.pngwing.com/pngs/173/537/png-transparent-dragon-ball-z-hyper-dimension-goku-vegeta-gohan-beerus-dragon-ball-super-background-computer-wallpaper-cartoon-fictional-character-thumbnail.png", false));
        animes.add(new Anime("Tokyo Ghoul","Seres misteriosos que se alimentan de humanos.","https://w7.pngwing.com/pngs/1021/10/png-transparent-tokyo-ghoul-tokyo-ghoul-dark-war-ken-kaneki-ghoul-manga-ken-kaneki-fictional-character-thumbnail.png", false));
        animes.add(new Anime("Death Note","El poder de este sobrenatural bloc de notas permite terminar con la vida de los demás.","https://w7.pngwing.com/pngs/441/293/png-transparent-ryuk-light-yagami-rem-near-death-note-death-note-purple-comics-manga-thumbnail.png", true));
        return animes;
    }
}