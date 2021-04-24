package com.example.fragment;

import java.util.ArrayList;

public class DattaDummy {
    private static String[] id = new String[]{
      "1","2","3","4","5"
    };
    private static String[] title = new String[]{
            "Alive", "Bird Box", "Enola Holmes", "Forest Gump","Geez and Ann"
    };

    private static String[] genre = new String[]{
            "Horror","Horror","Mystery","Drama","Drama"
    };

    private static String[] pic = new String[]{
           "https://img.tek.id/img/library/library-2020-04/images/WhatsApp%20Image%202020-05-19%20at%2006.12.50%20%281%29.jpeg",
            "https://images-na.ssl-images-amazon.com/images/I/716lYqWiqyL._AC_SL1481_.jpg",
            "https://i.pinimg.com/originals/92/80/50/9280502900cb947635bc47d012b6a01c.jpg",
            "https://i.pinimg.com/originals/f8/4b/96/f84b961743b78e47edf22fce1cde3d2c.jpg",
            "https://m.media-amazon.com/images/M/MV5BZTY2YWFlYWQtYTA0My00NTFhLTk4MzgtNTMwZWEyYzgyOTIzXkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_.jpg"
    };

    private static String[] desc = new String[]{
            "The rapid spread of an unknown infection has left an entire city in ungovernable chaos, but one survivor remains alive in isolation. It is his story.",
            "Five years after an ominous unseen presence drives most of society to suicide, a mother and her two children make a desperate bid to reach safety.",
            "When Enola Holmes-Sherlock's teen sister-discovers her mother missing, she sets off to find her, becoming a super-sleuth in her own right as she outwits her famous brother and unravels a dangerous conspiracy around a mysterious young Lord.",
            "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.",
            "They first met at an alumni event. The first meeting was very memorable for the dreamer Ann and the mysterious Geez."
    };

    private static String[] artist = new String[]{
            " Ah-in Yoo, Park Shin-Hye","Sandra Bullock"," Millie Bobby Brown"," Tom Hanks","Junior Roberts, Hanggini"
    };

    static ArrayList<Movie> getDummyDetailMovie() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++) {
            Movie movie = new Movie();
            movie.setId(id[position]);
            movie.setTitle(title[position]);
            movie.setArtist(artist[position]);
            movie.setGenra(genre[position]);
            movie.setDesc(desc[position]);
            movie.setPic(pic[position]);
            list.add(movie);
        }
        return list;
    }
}
