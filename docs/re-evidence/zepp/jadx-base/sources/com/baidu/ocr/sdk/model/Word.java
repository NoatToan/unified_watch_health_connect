package com.baidu.ocr.sdk.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Word extends WordSimple {
    private List<Char> characterResults;
    private Location location = new Location();
    private List<VertexesLocation> vertexesLocation;

    public static class Char {
        private String character;
        private Location location = new Location();

        public String getCharacter() {
            return this.character;
        }

        public Location getLocation() {
            return this.location;
        }

        public void setCharacter(String str) {
            this.character = str;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }

    public List<Char> getCharacterResults() {
        return this.characterResults;
    }

    public Location getLocation() {
        return this.location;
    }

    public List<VertexesLocation> getVertexesLocations() {
        return this.vertexesLocation;
    }

    public void setCharacterResults(List<Char> list) {
        this.characterResults = list;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setVertexesLocations(List<VertexesLocation> list) {
        this.vertexesLocation = list;
    }
}
