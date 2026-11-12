package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FontCharacter {
    private final List<ShapeGroup> a;
    private final char b;
    private final double c;
    private final double d;
    private final String e;
    private final String f;

    public FontCharacter(List<ShapeGroup> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public static int hashFor(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public double a() {
        return this.c;
    }

    public String b() {
        return this.e;
    }

    public List<ShapeGroup> getShapes() {
        return this.a;
    }

    public double getWidth() {
        return this.d;
    }

    public int hashCode() {
        return hashFor(this.b, this.f, this.e);
    }
}
