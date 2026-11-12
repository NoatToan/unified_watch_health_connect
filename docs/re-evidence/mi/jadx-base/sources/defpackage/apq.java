package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes5.dex */
public final class apq {
    public static final apq[] h = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3338b;
    public final int c;
    public final int d;
    public final int e;
    public final c f;
    public final int g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3340b;

        public int a() {
            return this.f3339a;
        }

        public int b() {
            return this.f3340b;
        }

        public b(int i, int i2) {
            this.f3339a = i;
            this.f3340b = i2;
        }
    }

    public apq(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.f3337a = i;
        this.f3338b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.g = iA;
    }

    public static apq[] a() {
        int i = 1;
        int i2 = 5;
        apq apqVar = new apq(1, 10, 10, 8, 8, new c(i2, new b(i, 3)));
        apq apqVar2 = new apq(2, 12, 12, 10, 10, new c(7, new b(i, i2)));
        apq apqVar3 = new apq(3, 14, 14, 12, 12, new c(10, new b(i, 8)));
        int i3 = 12;
        apq apqVar4 = new apq(4, 16, 16, 14, 14, new c(i3, new b(i, i3)));
        int i4 = 18;
        apq apqVar5 = new apq(5, 18, 18, 16, 16, new c(14, new b(i, i4)));
        apq apqVar6 = new apq(6, 20, 20, 18, 18, new c(i4, new b(i, 22)));
        apq apqVar7 = new apq(7, 22, 22, 20, 20, new c(20, new b(i, 30)));
        int i5 = 36;
        apq apqVar8 = new apq(8, 24, 24, 22, 22, new c(24, new b(i, i5)));
        apq apqVar9 = new apq(9, 26, 26, 24, 24, new c(28, new b(i, 44)));
        apq apqVar10 = new apq(10, 32, 32, 14, 14, new c(i5, new b(i, 62)));
        int i6 = 42;
        int i7 = 56;
        int i8 = 2;
        int i9 = 4;
        return new apq[]{apqVar, apqVar2, apqVar3, apqVar4, apqVar5, apqVar6, apqVar7, apqVar8, apqVar9, apqVar10, new apq(11, 36, 36, 16, 16, new c(i6, new b(i, 86))), new apq(12, 40, 40, 18, 18, new c(48, new b(i, 114))), new apq(13, 44, 44, 20, 20, new c(i7, new b(i, 144))), new apq(14, 48, 48, 22, 22, new c(68, new b(i, 174))), new apq(15, 52, 52, 24, 24, new c(i6, new b(i8, 102))), new apq(16, 64, 64, 14, 14, new c(i7, new b(i8, 140))), new apq(17, 72, 72, 16, 16, new c(36, new b(i9, 92))), new apq(18, 80, 80, 18, 18, new c(48, new b(i9, 114))), new apq(19, 88, 88, 20, 20, new c(i7, new b(i9, 144))), new apq(20, 96, 96, 22, 22, new c(68, new b(i9, 174))), new apq(21, 104, 104, 24, 24, new c(i7, new b(6, 136))), new apq(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new apq(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new apq(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(i8, 155))), new apq(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new apq(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new apq(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new apq(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new apq(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new apq(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static apq h(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (apq apqVar : h) {
            if (apqVar.f3338b == i && apqVar.c == i2) {
                return apqVar;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public c d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.f3338b;
    }

    public int g() {
        return this.g;
    }

    public int i() {
        return this.f3337a;
    }

    public String toString() {
        return String.valueOf(this.f3337a);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f3342b;

        public b[] a() {
            return this.f3342b;
        }

        public int b() {
            return this.f3341a;
        }

        public c(int i, b bVar) {
            this.f3341a = i;
            this.f3342b = new b[]{bVar};
        }

        public c(int i, b bVar, b bVar2) {
            this.f3341a = i;
            this.f3342b = new b[]{bVar, bVar2};
        }
    }
}
