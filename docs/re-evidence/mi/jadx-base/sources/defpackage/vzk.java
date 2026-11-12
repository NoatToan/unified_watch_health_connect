package defpackage;

import com.google.android.exoplayer2.ParserException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class vzk implements a0l {
    public static final okh i;
    public static final int j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzk f37398b;
    public snp c;
    public int d;
    public int g;
    public long h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f37397a = new okh();
    public long e = -9223372036854775807L;
    public int f = -1;

    static {
        byte[] bArr = kgg.f23821a;
        i = new okh(bArr);
        j = bArr.length;
    }

    public vzk(zzk zzkVar) {
        this.f37398b = zzkVar;
    }

    public static int e(int i2) {
        return i2 == 5 ? 1 : 0;
    }

    public static long i(long j2, long j3, long j4) {
        return j2 + wlq.H0(j3 - j4, FolmeCore.NANOS_TO_MS, 90000L);
    }

    public static int j(snp snpVar) {
        okh okhVar = i;
        int i2 = j;
        snpVar.d(okhVar, i2);
        okhVar.P(0);
        return i2;
    }

    @Override // defpackage.a0l
    public void a(long j2, long j3) {
        this.e = j2;
        this.g = 0;
        this.h = j3;
    }

    @Override // defpackage.a0l
    public void b(long j2, int i2) {
    }

    @Override // defpackage.a0l
    public void c(okh okhVar, long j2, int i2, boolean z) throws ParserException {
        try {
            int i3 = okhVar.d()[0] & 31;
            rk1.i(this.c);
            if (i3 > 0 && i3 < 24) {
                g(okhVar);
            } else if (i3 == 24) {
                h(okhVar);
            } else {
                if (i3 != 28) {
                    throw new ParserException(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i3)));
                }
                f(okhVar, i2);
            }
            if (z) {
                if (this.e == -9223372036854775807L) {
                    this.e = j2;
                }
                this.c.e(i(this.h, j2, this.e), this.d, this.g, 0, null);
                this.g = 0;
            }
            this.f = i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ParserException(e);
        }
    }

    @Override // defpackage.a0l
    public void d(kl8 kl8Var, int i2) {
        snp snpVarD = kl8Var.d(i2, 2);
        this.c = snpVarD;
        ((snp) wlq.j(snpVarD)).b(this.f37398b.c);
    }

    public final void f(okh okhVar, int i2) {
        byte b2 = okhVar.d()[0];
        byte b3 = okhVar.d()[1];
        int i3 = (b2 & 224) | (b3 & 31);
        boolean z = (b3 & 128) > 0;
        boolean z2 = (b3 & 64) > 0;
        if (z) {
            this.g += j(this.c);
            okhVar.d()[1] = (byte) i3;
            this.f37397a.M(okhVar.d());
            this.f37397a.P(1);
        } else {
            int i4 = (this.f + 1) % 65535;
            if (i2 != i4) {
                toe.h("RtpH264Reader", wlq.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i2)));
                return;
            } else {
                this.f37397a.M(okhVar.d());
                this.f37397a.P(2);
            }
        }
        int iA = this.f37397a.a();
        this.c.d(this.f37397a, iA);
        this.g += iA;
        if (z2) {
            this.d = e(i3 & 31);
        }
    }

    public final void g(okh okhVar) {
        int iA = okhVar.a();
        this.g += j(this.c);
        this.c.d(okhVar, iA);
        this.g += iA;
        this.d = e(okhVar.d()[0] & 31);
    }

    public final void h(okh okhVar) {
        okhVar.D();
        while (okhVar.a() > 4) {
            int iJ = okhVar.J();
            this.g += j(this.c);
            this.c.d(okhVar, iJ);
            this.g += iJ;
        }
        this.d = 0;
    }
}
