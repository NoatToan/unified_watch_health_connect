package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.huami.mifit.sportlib.common.DataTypeSource;

/* JADX INFO: loaded from: classes4.dex */
public final class Version {
    private static final Version[] h = a();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final c f;
    private final int g;

    public static final class b {
        private final int a;
        private final int b;

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private Version(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.a = i;
        this.b = i2;
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

    private static Version[] a() {
        int i = 1;
        int i2 = 5;
        int i3 = 8;
        Version version = new Version(3, 14, 14, 12, 12, new c(10, new b(i, i3)));
        int i4 = 2;
        int i5 = 12;
        int i6 = 18;
        Version version2 = new Version(7, 22, 22, 20, 20, new c(20, new b(i, 30)));
        int i7 = 6;
        int i8 = 36;
        int i9 = 62;
        int i10 = 56;
        int i11 = 68;
        b bVar = new b(i, 5);
        b bVar2 = new b(i, 10);
        b bVar3 = new b(i, 16);
        return new Version[]{new Version(1, 10, 10, 8, 8, new c(i2, new b(i, 3))), new Version(2, 12, 12, 10, 10, new c(7, new b(i, i2))), version, new Version(4, 16, 16, 14, 14, new c(i5, new b(i, i5))), new Version(5, 18, 18, 16, 16, new c(14, new b(i, i6))), new Version(6, 20, 20, 18, 18, new c(i6, new b(i, 22))), version2, new Version(8, 24, 24, 22, 22, new c(24, new b(i, i8))), new Version(9, 26, 26, 24, 24, new c(28, new b(i, 44))), new Version(10, 32, 32, 14, 14, new c(i8, new b(i, i9))), new Version(11, 36, 36, 16, 16, new c(42, new b(i, 86))), new Version(12, 40, 40, 18, 18, new c(48, new b(i, 114))), new Version(13, 44, 44, 20, 20, new c(i10, new b(i, 144))), new Version(14, 48, 48, 22, 22, new c(i11, new b(i, DataTypeSource.SPORT_TYPE_CHECKERS))), new Version(15, 52, 52, 24, 24, new c(42, new b(i4, 102))), new Version(16, 64, 64, 14, 14, new c(i10, new b(i4, 140))), new Version(17, 72, 72, 16, 16, new c(i8, new b(4, 92))), new Version(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new Version(19, 88, 88, 20, 20, new c(i10, new b(4, 144))), new Version(20, 96, 96, 22, 22, new c(i11, new b(4, DataTypeSource.SPORT_TYPE_CHECKERS))), new Version(21, 104, 104, 24, 24, new c(i10, new b(i7, 136))), new Version(22, 120, 120, 18, 18, new c(i11, new b(i7, 175))), new Version(23, 132, 132, 20, 20, new c(i9, new b(i3, 163))), new Version(24, 144, 144, 22, 22, new c(i9, new b(i3, 156), new b(i4, 155))), new Version(25, 8, 18, 6, 16, new c(7, bVar)), new Version(26, 8, 32, 6, 14, new c(11, bVar2)), new Version(27, 12, 26, 10, 24, new c(14, bVar3)), new Version(28, 12, 36, 10, 16, new c(i6, new b(i, 22))), new Version(29, 16, 36, 14, 16, new c(24, new b(i, 32))), new Version(30, 16, 48, 14, 22, new c(28, new b(i, 49)))};
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (Version version : h) {
            if (version.b == i && version.c == i2) {
                return version;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public c b() {
        return this.f;
    }

    public int getDataRegionSizeColumns() {
        return this.e;
    }

    public int getDataRegionSizeRows() {
        return this.d;
    }

    public int getSymbolSizeColumns() {
        return this.c;
    }

    public int getSymbolSizeRows() {
        return this.b;
    }

    public int getTotalCodewords() {
        return this.g;
    }

    public int getVersionNumber() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public static final class c {
        private final int a;
        private final b[] b;

        public b[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        private c(int i, b bVar) {
            this.a = i;
            this.b = new b[]{bVar};
        }

        private c(int i, b bVar, b bVar2) {
            this.a = i;
            this.b = new b[]{bVar, bVar2};
        }
    }
}
