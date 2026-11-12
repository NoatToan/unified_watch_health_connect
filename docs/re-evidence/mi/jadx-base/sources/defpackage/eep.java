package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class eep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f16569a = eep.class;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16571b;
        public int c;

        public b() {
        }
    }

    public static int a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static int b(InputStream inputStream, int i, boolean z) throws IOException {
        if (i < 10 || vio.a(inputStream, 2, z) != 3 || vio.a(inputStream, 4, z) != 1) {
            return 0;
        }
        int iA = vio.a(inputStream, 2, z);
        vio.a(inputStream, 2, z);
        return iA;
    }

    public static int c(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int iA = vio.a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = iA - 1;
            if (iA <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (vio.a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 -= 12;
            iA = i4;
        }
        return 0;
    }

    public static int d(InputStream inputStream, int i) throws IOException {
        b bVar = new b();
        int iE = e(inputStream, i, bVar);
        int i2 = bVar.c - 8;
        if (iE == 0 || i2 > iE) {
            return 0;
        }
        inputStream.skip(i2);
        return b(inputStream, c(inputStream, iE - i2, bVar.f16570a, 274), bVar.f16570a);
    }

    public static int e(InputStream inputStream, int i, b bVar) throws IOException {
        if (i <= 8) {
            return 0;
        }
        int iA = vio.a(inputStream, 4, false);
        bVar.f16571b = iA;
        if (iA != 1229531648 && iA != 1296891946) {
            cm8.e(f16569a, "Invalid TIFF header");
            return 0;
        }
        boolean z = iA == 1229531648;
        bVar.f16570a = z;
        int iA2 = vio.a(inputStream, 4, z);
        bVar.c = iA2;
        int i2 = i - 8;
        if (iA2 >= 8 && iA2 - 8 <= i2) {
            return i2;
        }
        cm8.e(f16569a, "Invalid offset");
        return 0;
    }
}
