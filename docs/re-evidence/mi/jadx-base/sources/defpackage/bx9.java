package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bx9 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ex9 f4694a;

        public a(ex9 ex9Var) {
            this.f4694a = ex9Var;
        }
    }

    public static boolean a(jl8 jl8Var) throws IOException {
        okh okhVar = new okh(4);
        jl8Var.i(okhVar.d(), 0, 4);
        return okhVar.F() == 1716281667;
    }

    public static int b(jl8 jl8Var) throws IOException {
        jl8Var.l();
        okh okhVar = new okh(2);
        jl8Var.i(okhVar.d(), 0, 2);
        int iJ = okhVar.J();
        if ((iJ >> 2) == 16382) {
            jl8Var.l();
            return iJ;
        }
        jl8Var.l();
        throw new ParserException("First frame does not start with sync code.");
    }

    public static Metadata c(jl8 jl8Var, boolean z) throws IOException {
        Metadata metadataA = new a2d().a(jl8Var, z ? null : z1d.f40775b);
        if (metadataA == null || metadataA.e() == 0) {
            return null;
        }
        return metadataA;
    }

    public static Metadata d(jl8 jl8Var, boolean z) throws IOException {
        jl8Var.l();
        long jN = jl8Var.n();
        Metadata metadataC = c(jl8Var, z);
        jl8Var.p((int) (jl8Var.n() - jN));
        return metadataC;
    }

    public static boolean e(jl8 jl8Var, a aVar) throws IOException {
        jl8Var.l();
        nkh nkhVar = new nkh(new byte[4]);
        jl8Var.i(nkhVar.f28014a, 0, 4);
        boolean zG = nkhVar.g();
        int iH = nkhVar.h(7);
        int iH2 = nkhVar.h(24) + 4;
        if (iH == 0) {
            aVar.f4694a = i(jl8Var);
        } else {
            ex9 ex9Var = aVar.f4694a;
            if (ex9Var == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                aVar.f4694a = ex9Var.c(g(jl8Var, iH2));
            } else if (iH == 4) {
                aVar.f4694a = ex9Var.d(k(jl8Var, iH2));
            } else if (iH == 6) {
                aVar.f4694a = ex9Var.b(Collections.singletonList(f(jl8Var, iH2)));
            } else {
                jl8Var.p(iH2);
            }
        }
        return zG;
    }

    public static PictureFrame f(jl8 jl8Var, int i) throws IOException {
        okh okhVar = new okh(i);
        jl8Var.readFully(okhVar.d(), 0, i);
        okhVar.Q(4);
        int iN = okhVar.n();
        String strB = okhVar.B(okhVar.n(), bu3.f4606a);
        String strA = okhVar.A(okhVar.n());
        int iN2 = okhVar.n();
        int iN3 = okhVar.n();
        int iN4 = okhVar.n();
        int iN5 = okhVar.n();
        int iN6 = okhVar.n();
        byte[] bArr = new byte[iN6];
        okhVar.j(bArr, 0, iN6);
        return new PictureFrame(iN, strB, strA, iN2, iN3, iN4, iN5, bArr);
    }

    public static ex9.a g(jl8 jl8Var, int i) throws IOException {
        okh okhVar = new okh(i);
        jl8Var.readFully(okhVar.d(), 0, i);
        return h(okhVar);
    }

    public static ex9.a h(okh okhVar) {
        okhVar.Q(1);
        int iG = okhVar.G();
        long jE = ((long) okhVar.e()) + ((long) iG);
        int i = iG / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jW = okhVar.w();
            if (jW == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jW;
            jArrCopyOf2[i2] = okhVar.w();
            okhVar.Q(2);
        }
        okhVar.Q((int) (jE - ((long) okhVar.e())));
        return new ex9.a(jArrCopyOf, jArrCopyOf2);
    }

    public static ex9 i(jl8 jl8Var) throws IOException {
        byte[] bArr = new byte[38];
        jl8Var.readFully(bArr, 0, 38);
        return new ex9(bArr, 4);
    }

    public static void j(jl8 jl8Var) throws IOException {
        okh okhVar = new okh(4);
        jl8Var.readFully(okhVar.d(), 0, 4);
        if (okhVar.F() != 1716281667) {
            throw new ParserException("Failed to read FLAC stream marker.");
        }
    }

    public static List<String> k(jl8 jl8Var, int i) throws IOException {
        okh okhVar = new okh(i);
        jl8Var.readFully(okhVar.d(), 0, i);
        okhVar.Q(4);
        return Arrays.asList(b3r.i(okhVar, false, false).f3760b);
    }
}
