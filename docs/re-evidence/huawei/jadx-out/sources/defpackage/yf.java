package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class yf implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f53327c;
    private final char d;
    private final char e;

    public static yf b() {
        return new yf();
    }

    public yf() {
        this(':', ',', ',');
    }

    public yf(char c2, char c3, char c4) {
        this.e = c2;
        this.d = c3;
        this.f53327c = c4;
    }

    public char a() {
        return this.e;
    }

    public char c() {
        return this.d;
    }

    public char d() {
        return this.f53327c;
    }
}
