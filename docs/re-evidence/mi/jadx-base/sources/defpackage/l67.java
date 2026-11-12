package defpackage;

import com.google.android.exoplayer2.Format;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class l67 implements u68 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24715b;
    public String c;
    public snp d;
    public int f;
    public int g;
    public long h;
    public Format i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f24716k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f24714a = new okh(new byte[18]);
    public int e = 0;

    public l67(String str) {
        this.f24715b = str;
    }

    private boolean b(okh okhVar, byte[] bArr, int i) {
        int iMin = Math.min(okhVar.a(), i - this.f);
        okhVar.j(bArr, this.f, iMin);
        int i2 = this.f + iMin;
        this.f = i2;
        return i2 == i;
    }

    private void g() {
        byte[] bArrD = this.f24714a.d();
        if (this.i == null) {
            Format formatG = m67.g(bArrD, this.c, this.f24715b, null);
            this.i = formatG;
            this.d.b(formatG);
        }
        this.j = m67.a(bArrD);
        this.h = (int) ((((long) m67.f(bArrD)) * FolmeCore.NANOS_TO_MS) / ((long) this.i.z));
    }

    private boolean h(okh okhVar) {
        while (okhVar.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int iD = i | okhVar.D();
            this.g = iD;
            if (m67.d(iD)) {
                byte[] bArrD = this.f24714a.d();
                int i2 = this.g;
                bArrD[0] = (byte) ((i2 >> 24) & 255);
                bArrD[1] = (byte) ((i2 >> 16) & 255);
                bArrD[2] = (byte) ((i2 >> 8) & 255);
                bArrD[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.d);
        while (okhVar.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(okhVar.a(), this.j - this.f);
                    this.d.d(okhVar, iMin);
                    int i2 = this.f + iMin;
                    this.f = i2;
                    int i3 = this.j;
                    if (i2 == i3) {
                        this.d.e(this.f24716k, 1, i3, 0, null);
                        this.f24716k += this.h;
                        this.e = 0;
                    }
                } else if (b(okhVar, this.f24714a.d(), 18)) {
                    g();
                    this.f24714a.P(0);
                    this.d.d(this.f24714a, 18);
                    this.e = 2;
                }
            } else if (h(okhVar)) {
                this.e = 1;
            }
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.f24716k = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = kl8Var.d(dVar.c(), 1);
    }
}
