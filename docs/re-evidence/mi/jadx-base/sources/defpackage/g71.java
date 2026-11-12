package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class g71 implements il8 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f18666r;
    public static final int u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18668b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18669k;
    public kl8 l;
    public snp m;
    public arl n;
    public boolean o;
    public static final nl8 p = new nl8() { // from class: f71
        @Override // defpackage.nl8
        public final il8[] c() {
            return g71.m();
        }
    };
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] s = wlq.i0("#!AMR\n");
    public static final byte[] t = wlq.i0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18666r = iArr;
        u = iArr[8];
    }

    public g71() {
        this(0);
    }

    public static int e(int i, long j) {
        return (int) ((((long) (i * 8)) * FolmeCore.NANOS_TO_MS) / j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] m() {
        return new il8[]{new g71()};
    }

    public static boolean p(jl8 jl8Var, byte[] bArr) throws IOException {
        jl8Var.l();
        byte[] bArr2 = new byte[bArr.length];
        jl8Var.i(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            arl arlVar = this.n;
            if (arlVar instanceof kf4) {
                this.f18669k = ((kf4) arlVar).b(j);
                return;
            }
        }
        this.f18669k = 0L;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.l = kl8Var;
        this.m = kl8Var.d(0, 1);
        kl8Var.m();
    }

    public final void d() {
        rk1.i(this.m);
        wlq.j(this.l);
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        d();
        if (jl8Var.getPosition() == 0 && !r(jl8Var)) {
            throw new ParserException("Could not find AMR header.");
        }
        n();
        int iS = s(jl8Var);
        o(jl8Var.getLength(), iS);
        return iS;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        return r(jl8Var);
    }

    public final arl h(long j) {
        return new kf4(j, this.h, e(this.i, 20000L), this.i);
    }

    public final int i(int i) throws ParserException {
        if (k(i)) {
            return this.c ? f18666r[i] : q[i];
        }
        String str = this.c ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    public final boolean j(int i) {
        return !this.c && (i < 12 || i > 14);
    }

    public final boolean k(int i) {
        return i >= 0 && i <= 15 && (l(i) || j(i));
    }

    public final boolean l(int i) {
        return this.c && (i < 10 || i > 13);
    }

    public final void n() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.c;
        this.m.b(new Format.b().e0(z ? "audio/amr-wb" : "audio/3gpp").W(u).H(1).f0(z ? 16000 : 8000).E());
    }

    public final void o(long j, int i) {
        int i2;
        if (this.g) {
            return;
        }
        if ((this.f18668b & 1) == 0 || j == -1 || !((i2 = this.i) == -1 || i2 == this.e)) {
            arl.b bVar = new arl.b(-9223372036854775807L);
            this.n = bVar;
            this.l.k(bVar);
            this.g = true;
            return;
        }
        if (this.j >= 20 || i == -1) {
            arl arlVarH = h(j);
            this.n = arlVarH;
            this.l.k(arlVarH);
            this.g = true;
        }
    }

    public final int q(jl8 jl8Var) throws IOException {
        jl8Var.l();
        jl8Var.i(this.f18667a, 0, 1);
        byte b2 = this.f18667a[0];
        if ((b2 & 131) <= 0) {
            return i((b2 >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Invalid padding bits for frame header ");
        sb.append((int) b2);
        throw new ParserException(sb.toString());
    }

    public final boolean r(jl8 jl8Var) throws IOException {
        byte[] bArr = s;
        if (p(jl8Var, bArr)) {
            this.c = false;
            jl8Var.p(bArr.length);
            return true;
        }
        byte[] bArr2 = t;
        if (!p(jl8Var, bArr2)) {
            return false;
        }
        this.c = true;
        jl8Var.p(bArr2.length);
        return true;
    }

    @Override // defpackage.il8
    public void release() {
    }

    public final int s(jl8 jl8Var) throws IOException {
        if (this.f == 0) {
            try {
                int iQ = q(jl8Var);
                this.e = iQ;
                this.f = iQ;
                if (this.i == -1) {
                    this.h = jl8Var.getPosition();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iC = this.m.c(jl8Var, this.f, true);
        if (iC == -1) {
            return -1;
        }
        int i = this.f - iC;
        this.f = i;
        if (i > 0) {
            return 0;
        }
        this.m.e(this.f18669k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    public g71(int i) {
        this.f18668b = i;
        this.f18667a = new byte[1];
        this.i = -1;
    }
}
