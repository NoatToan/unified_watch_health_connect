package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.List;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class FontCharacter {
    private final char character;
    private final String fontFamily;
    private final List<ShapeGroup> shapes;
    private final double size;
    private final String style;
    private final double width;

    public FontCharacter(List<ShapeGroup> list, char c14, double d14, double d15, String str, String str2) {
        this.shapes = list;
        this.character = c14;
        this.size = d14;
        this.width = d15;
        this.style = str;
        this.fontFamily = str2;
    }

    public static int hashFor(char c14, String str, String str2) {
        return str2.hashCode() + g.j(c14 * 31, 31, str);
    }

    public List<ShapeGroup> getShapes() {
        return this.shapes;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return hashFor(this.character, this.fontFamily, this.style);
    }
}
