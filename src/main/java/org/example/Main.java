package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException{


        List<CastMember> cast1 = new ArrayList<>();
        cast1.add(new CastMember("Tom Hanks", "Forrest Gump"));
        cast1.add(new CastMember("Robin Wright", "Jenny Curran"));

        List<CastMember> cast2 = new ArrayList<>();
        cast2.add(new CastMember("Joanna Kulig", "Zula Lichoń"));
        cast2.add(new CastMember("Tomasz Kot", "Wiktor Warski"));


        Movie movie1 = new Movie("Forrest Gump", "Robert Zemeckis",
                142, cast1);
        Movie movie2 = new Movie("Zimna wojna", "Paweł Pawlikowski",
                88, cast2);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(movies);
        
        System.out.println(json);
    }
}