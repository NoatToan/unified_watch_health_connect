package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class j6r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22473b;

        public a(int i, long j) {
            this.f22472a = i;
            this.f22473b = j;
        }

        public static a a(jl8 jl8Var, okh okhVar) throws IOException {
            jl8Var.i(okhVar.d(), 0, 8);
            okhVar.P(0);
            return new a(okhVar.n(), okhVar.t());
        }
    }

    public static i6r a(jl8 jl8Var) throws IOException {
        byte[] bArr;
        rk1.e(jl8Var);
        okh okhVar = new okh(16);
        if (a.a(jl8Var, okhVar).f22472a != 1380533830) {
            return null;
        }
        jl8Var.i(okhVar.d(), 0, 4);
        okhVar.P(0);
        int iN = okhVar.n();
        if (iN != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(iN);
            toe.c("WavHeaderReader", sb.toString());
            return null;
        }
        a aVarA = a.a(jl8Var, okhVar);
        while (aVarA.f22472a != 1718449184) {
            jl8Var.o((int) aVarA.f22473b);
            aVarA = a.a(jl8Var, okhVar);
        }
        rk1.g(aVarA.f22473b >= 16);
        jl8Var.i(okhVar.d(), 0, 16);
        okhVar.P(0);
        int iV = okhVar.v();
        int iV2 = okhVar.v();
        int iU = okhVar.u();
        int iU2 = okhVar.u();
        int iV3 = okhVar.v();
        int iV4 = okhVar.v();
        int i = ((int) aVarA.f22473b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            jl8Var.i(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = wlq.f;
        }
        return new i6r(iV, iV2, iU, iU2, iV3, iV4, bArr);
    }

    public static Pair<Long, Long> b(jl8 jl8Var) throws IOException {
        rk1.e(jl8Var);
        jl8Var.l();
        okh okhVar = new okh(8);
        a aVarA = a.a(jl8Var, okhVar);
        while (true) {
            int i = aVarA.f22472a;
            if (i == 1684108385) {
                jl8Var.p(8);
                long position = jl8Var.getPosition();
                long j = aVarA.f22473b + position;
                long length = jl8Var.getLength();
                if (length != -1 && j > length) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("Data exceeds input length: ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(length);
                    toe.h("WavHeaderReader", sb.toString());
                    j = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j));
            }
            if (i != 1380533830 && i != 1718449184) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Ignoring unknown WAV chunk: ");
                sb2.append(i);
                toe.h("WavHeaderReader", sb2.toString());
            }
            long j2 = aVarA.f22473b + 8;
            if (aVarA.f22472a == 1380533830) {
                j2 = 12;
            }
            if (j2 > 2147483647L) {
                int i2 = aVarA.f22472a;
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i2);
                throw new ParserException(sb3.toString());
            }
            jl8Var.p((int) j2);
            aVarA = a.a(jl8Var, okhVar);
        }
    }
}
