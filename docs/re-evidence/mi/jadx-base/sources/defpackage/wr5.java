package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wr5 {
    public static final wr5 e = new wr5('0', '+', '-', '.');
    public static final ConcurrentMap<Locale, wr5> f = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f38277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f38278b;
    public final char c;
    public final char d;

    public wr5(char c, char c2, char c3, char c4) {
        this.f38277a = c;
        this.f38278b = c2;
        this.c = c3;
        this.d = c4;
    }

    public String a(String str) {
        char c = this.f38277a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    public int b(char c) {
        int i = c - this.f38277a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public char c() {
        return this.d;
    }

    public char d() {
        return this.c;
    }

    public char e() {
        return this.f38278b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr5)) {
            return false;
        }
        wr5 wr5Var = (wr5) obj;
        return this.f38277a == wr5Var.f38277a && this.f38278b == wr5Var.f38278b && this.c == wr5Var.c && this.d == wr5Var.d;
    }

    public char f() {
        return this.f38277a;
    }

    public int hashCode() {
        return this.f38277a + this.f38278b + this.c + this.d;
    }

    public String toString() {
        return "DecimalStyle[" + this.f38277a + this.f38278b + this.c + this.d + "]";
    }
}
