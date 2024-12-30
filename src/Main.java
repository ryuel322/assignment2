public class Main {
    public static void main(String[] args) {

        Artwork[] artworks = new Artwork[] {
                new Artwork("Atameken", new Artist("Shokan Ualihanov"), new Gallery("Kazakh National Museum")),
                new Artwork("Kazakh Girl", new Artist("Abylkhan Kasteev"), new Gallery("Kasteev State Museum of Arts")),
                new Artwork("Nomadic Spirit", new Artist("Tleuberdy Bekmukhanbet"), new Gallery("Astana Modern Art Gallery"))
        };


        System.out.println("All Artworks:");
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }


        String artistName = "Abylkhan Kasteev";
        System.out.println("\nArtworks by " + artistName + ":");
        for (Artwork artwork : artworks) {
            if (artwork.getArtist().getName().equals(artistName)) {
                System.out.println(artwork);
            }
        }


        String searchTitle = "Kazakh Girl";
        System.out.println("\nSearch Result for \"" + searchTitle + "\":");
        Artwork foundArtwork = null;
        for (Artwork artwork : artworks) {
            if (artwork.getArtwork().equals(searchTitle)) {
                foundArtwork = artwork;
                break;
            }
        }
        System.out.println(foundArtwork != null ? foundArtwork : "Not Found");


        for (int i = 0; i < artworks.length - 1; i++) {
            for (int j = 0; j < artworks.length - i - 1; j++) {
                if (artworks[j].getArtwork().compareTo(artworks[j + 1].getArtwork()) > 0) {
                    Artwork temp = artworks[j];
                    artworks[j] = artworks[j + 1];
                    artworks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArtworks Sorted by Title:");
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }


        System.out.println("\nComparing Two Artworks:");
        System.out.println(artworks[0].equals(artworks[1]) ? "Artworks are the same" : "Artworks are different");
    }
}
