package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class b3r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3758b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f3757a = i;
            this.f3758b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f3760b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.f3759a = str;
            this.f3760b = strArr;
            this.c = i;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3762b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.f3761a = z;
            this.f3762b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3764b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f3763a = i;
            this.f3764b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static long b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static a c(z2r z2rVar) throws ParserException {
        if (z2rVar.d(24) != 5653314) {
            int iB = z2rVar.b();
            StringBuilder sb = new StringBuilder(66);
            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb.append(iB);
            throw new ParserException(sb.toString());
        }
        int iD = z2rVar.d(16);
        int iD2 = z2rVar.d(24);
        long[] jArr = new long[iD2];
        boolean zC = z2rVar.c();
        long jB = 0;
        if (zC) {
            int iD3 = z2rVar.d(5) + 1;
            int i = 0;
            while (i < iD2) {
                int iD4 = z2rVar.d(a(iD2 - i));
                for (int i2 = 0; i2 < iD4 && i < iD2; i2++) {
                    jArr[i] = iD3;
                    i++;
                }
                iD3++;
            }
        } else {
            boolean zC2 = z2rVar.c();
            for (int i3 = 0; i3 < iD2; i3++) {
                if (!zC2) {
                    jArr[i3] = z2rVar.d(5) + 1;
                } else if (z2rVar.c()) {
                    jArr[i3] = z2rVar.d(5) + 1;
                } else {
                    jArr[i3] = 0;
                }
            }
        }
        int iD5 = z2rVar.d(4);
        if (iD5 > 2) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("lookup type greater than 2 not decodable: ");
            sb2.append(iD5);
            throw new ParserException(sb2.toString());
        }
        if (iD5 == 1 || iD5 == 2) {
            z2rVar.e(32);
            z2rVar.e(32);
            int iD6 = z2rVar.d(4) + 1;
            z2rVar.e(1);
            if (iD5 != 1) {
                jB = ((long) iD2) * ((long) iD);
            } else if (iD != 0) {
                jB = b(iD2, iD);
            }
            z2rVar.e((int) (jB * ((long) iD6)));
        }
        return new a(iD, iD2, jArr, iD5, zC);
    }

    public static void d(z2r z2rVar) throws ParserException {
        int iD = z2rVar.d(6) + 1;
        for (int i = 0; i < iD; i++) {
            int iD2 = z2rVar.d(16);
            if (iD2 == 0) {
                z2rVar.e(8);
                z2rVar.e(16);
                z2rVar.e(16);
                z2rVar.e(6);
                z2rVar.e(8);
                int iD3 = z2rVar.d(4) + 1;
                for (int i2 = 0; i2 < iD3; i2++) {
                    z2rVar.e(8);
                }
            } else {
                if (iD2 != 1) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("floor type greater than 1 not decodable: ");
                    sb.append(iD2);
                    throw new ParserException(sb.toString());
                }
                int iD4 = z2rVar.d(5);
                int[] iArr = new int[iD4];
                int i3 = -1;
                for (int i4 = 0; i4 < iD4; i4++) {
                    int iD5 = z2rVar.d(4);
                    iArr[i4] = iD5;
                    if (iD5 > i3) {
                        i3 = iD5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = z2rVar.d(3) + 1;
                    int iD6 = z2rVar.d(2);
                    if (iD6 > 0) {
                        z2rVar.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << iD6); i7++) {
                        z2rVar.e(8);
                    }
                }
                z2rVar.e(2);
                int iD7 = z2rVar.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iD4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        z2rVar.e(iD7);
                        i9++;
                    }
                }
            }
        }
    }

    public static void e(int i, z2r z2rVar) throws ParserException {
        int iD = z2rVar.d(6) + 1;
        for (int i2 = 0; i2 < iD; i2++) {
            int iD2 = z2rVar.d(16);
            if (iD2 != 0) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("mapping type other than 0 not supported: ");
                sb.append(iD2);
                toe.c("VorbisUtil", sb.toString());
            } else {
                int iD3 = z2rVar.c() ? z2rVar.d(4) + 1 : 1;
                if (z2rVar.c()) {
                    int iD4 = z2rVar.d(8) + 1;
                    for (int i3 = 0; i3 < iD4; i3++) {
                        int i4 = i - 1;
                        z2rVar.e(a(i4));
                        z2rVar.e(a(i4));
                    }
                }
                if (z2rVar.d(2) != 0) {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
                if (iD3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        z2rVar.e(4);
                    }
                }
                for (int i6 = 0; i6 < iD3; i6++) {
                    z2rVar.e(8);
                    z2rVar.e(8);
                    z2rVar.e(8);
                }
            }
        }
    }

    public static c[] f(z2r z2rVar) {
        int iD = z2rVar.d(6) + 1;
        c[] cVarArr = new c[iD];
        for (int i = 0; i < iD; i++) {
            cVarArr[i] = new c(z2rVar.c(), z2rVar.d(16), z2rVar.d(16), z2rVar.d(8));
        }
        return cVarArr;
    }

    public static void g(z2r z2rVar) throws ParserException {
        int iD = z2rVar.d(6) + 1;
        for (int i = 0; i < iD; i++) {
            if (z2rVar.d(16) > 2) {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
            z2rVar.e(24);
            z2rVar.e(24);
            z2rVar.e(24);
            int iD2 = z2rVar.d(6) + 1;
            z2rVar.e(8);
            int[] iArr = new int[iD2];
            for (int i2 = 0; i2 < iD2; i2++) {
                iArr[i2] = ((z2rVar.c() ? z2rVar.d(5) : 0) * 8) + z2rVar.d(3);
            }
            for (int i3 = 0; i3 < iD2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        z2rVar.e(8);
                    }
                }
            }
        }
    }

    public static b h(okh okhVar) throws ParserException {
        return i(okhVar, true, true);
    }

    public static b i(okh okhVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            l(3, okhVar, false);
        }
        String strA = okhVar.A((int) okhVar.t());
        int length = strA.length();
        long jT = okhVar.t();
        String[] strArr = new String[(int) jT];
        int length2 = length + 15;
        for (int i = 0; i < jT; i++) {
            String strA2 = okhVar.A((int) okhVar.t());
            strArr[i] = strA2;
            length2 = length2 + 4 + strA2.length();
        }
        if (z2 && (okhVar.D() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new b(strA, strArr, length2 + 1);
    }

    public static d j(okh okhVar) throws ParserException {
        l(1, okhVar, false);
        int iU = okhVar.u();
        int iD = okhVar.D();
        int iU2 = okhVar.u();
        int iQ = okhVar.q();
        if (iQ <= 0) {
            iQ = -1;
        }
        int iQ2 = okhVar.q();
        if (iQ2 <= 0) {
            iQ2 = -1;
        }
        int iQ3 = okhVar.q();
        if (iQ3 <= 0) {
            iQ3 = -1;
        }
        int iD2 = okhVar.D();
        return new d(iU, iD, iU2, iQ, iQ2, iQ3, (int) Math.pow(2.0d, iD2 & 15), (int) Math.pow(2.0d, (iD2 & 240) >> 4), (okhVar.D() & 1) > 0, Arrays.copyOf(okhVar.d(), okhVar.f()));
    }

    public static c[] k(okh okhVar, int i) throws ParserException {
        l(5, okhVar, false);
        int iD = okhVar.D() + 1;
        z2r z2rVar = new z2r(okhVar.d());
        z2rVar.e(okhVar.e() * 8);
        for (int i2 = 0; i2 < iD; i2++) {
            c(z2rVar);
        }
        int iD2 = z2rVar.d(6) + 1;
        for (int i3 = 0; i3 < iD2; i3++) {
            if (z2rVar.d(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        d(z2rVar);
        g(z2rVar);
        e(i, z2rVar);
        c[] cVarArrF = f(z2rVar);
        if (z2rVar.c()) {
            return cVarArrF;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    public static boolean l(int i, okh okhVar, boolean z) throws ParserException {
        if (okhVar.a() < 7) {
            if (z) {
                return false;
            }
            int iA = okhVar.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iA);
            throw new ParserException(sb.toString());
        }
        if (okhVar.D() != i) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw new ParserException(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (okhVar.D() == 118 && okhVar.D() == 111 && okhVar.D() == 114 && okhVar.D() == 98 && okhVar.D() == 105 && okhVar.D() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }
}
