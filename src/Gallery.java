public class Gallery {
    private String name;

    public Gallery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return name;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gallery gallery = (Gallery) obj;
        return name.equals(gallery.name);
    }


    public int hashCode() {
        return name.hashCode();
    }
}
