package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class ru5 implements ga7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f32903a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f32904b = new ArrayDeque<>();
    public final wnq c = new wnq();
    public fa7 d;
    public int e;
    public int f;
    public long g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32906b;

        public b(int i, long j) {
            this.f32905a = i;
            this.f32906b = j;
        }
    }

    public static String f(jl8 jl8Var, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        jl8Var.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // defpackage.ga7
    public boolean a(jl8 jl8Var) throws IOException {
        rk1.i(this.d);
        while (true) {
            b bVarPeek = this.f32904b.peek();
            if (bVarPeek != null && jl8Var.getPosition() >= bVarPeek.f32906b) {
                this.d.a(this.f32904b.pop().f32905a);
                return true;
            }
            if (this.e == 0) {
                long jD = this.c.d(jl8Var, true, false, 4);
                if (jD == -2) {
                    jD = c(jl8Var);
                }
                if (jD == -1) {
                    return false;
                }
                this.f = (int) jD;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(jl8Var, false, true, 8);
                this.e = 2;
            }
            int iG = this.d.g(this.f);
            if (iG != 0) {
                if (iG == 1) {
                    long position = jl8Var.getPosition();
                    this.f32904b.push(new b(this.f, this.g + position));
                    this.d.e(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (iG == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.c(this.f, e(jl8Var, (int) j));
                        this.e = 0;
                        return true;
                    }
                    long j2 = this.g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new ParserException(sb.toString());
                }
                if (iG == 3) {
                    long j3 = this.g;
                    if (j3 <= 2147483647L) {
                        this.d.d(this.f, f(jl8Var, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    long j4 = this.g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new ParserException(sb2.toString());
                }
                if (iG == 4) {
                    this.d.f(this.f, (int) this.g, jl8Var);
                    this.e = 0;
                    return true;
                }
                if (iG != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(iG);
                    throw new ParserException(sb3.toString());
                }
                long j5 = this.g;
                if (j5 == 4 || j5 == 8) {
                    this.d.b(this.f, d(jl8Var, (int) j5));
                    this.e = 0;
                    return true;
                }
                long j6 = this.g;
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("Invalid float size: ");
                sb4.append(j6);
                throw new ParserException(sb4.toString());
            }
            jl8Var.p((int) this.g);
            this.e = 0;
        }
    }

    @Override // defpackage.ga7
    public void b(fa7 fa7Var) {
        this.d = fa7Var;
    }

    public final long c(jl8 jl8Var) throws IOException {
        jl8Var.l();
        while (true) {
            jl8Var.i(this.f32903a, 0, 4);
            int iC = wnq.c(this.f32903a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) wnq.a(this.f32903a, iC, false);
                if (this.d.h(iA)) {
                    jl8Var.p(iC);
                    return iA;
                }
            }
            jl8Var.p(1);
        }
    }

    public final double d(jl8 jl8Var, int i) throws IOException {
        long jE = e(jl8Var, i);
        return i == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    public final long e(jl8 jl8Var, int i) throws IOException {
        jl8Var.readFully(this.f32903a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f32903a[i2] & 255));
        }
        return j;
    }

    @Override // defpackage.ga7
    public void reset() {
        this.e = 0;
        this.f32904b.clear();
        this.c.e();
    }
}
