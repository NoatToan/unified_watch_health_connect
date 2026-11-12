package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final boolean a;
    private final DataCharacter b;
    private final DataCharacter c;
    private final FinderPattern d;

    public b(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean z) {
        this.b = dataCharacter;
        this.c = dataCharacter2;
        this.d = finderPattern;
        this.a = z;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public FinderPattern b() {
        return this.d;
    }

    public DataCharacter c() {
        return this.b;
    }

    public DataCharacter d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a(this.b, bVar.b) && a(this.c, bVar.c) && a(this.d, bVar.d);
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.c == null;
    }

    public int hashCode() {
        return (e(this.b) ^ e(this.c)) ^ e(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.b);
        sb.append(" , ");
        sb.append(this.c);
        sb.append(" : ");
        FinderPattern finderPattern = this.d;
        sb.append(finderPattern == null ? "null" : Integer.valueOf(finderPattern.getValue()));
        sb.append(" ]");
        return sb.toString();
    }
}
