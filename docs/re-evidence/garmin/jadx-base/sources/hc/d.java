package hc;

import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.q f82837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f82842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f82846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.media3.common.q f82847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f82849m;

    public d(String str, int i14) {
        fa.q qVar = new fa.q(new byte[16]);
        this.f82837a = qVar;
        this.f82838b = new fa.r(qVar.f70047a);
        this.f82843g = 0;
        this.f82844h = 0;
        this.f82845i = false;
        this.f82849m = C.TIME_UNSET;
        this.f82839c = str;
        this.f82840d = i14;
    }

    @Override // hc.j
    public final void b(fa.r rVar) {
        fa.a.f(this.f82842f);
        while (rVar.a() > 0) {
            int i14 = this.f82843g;
            fa.r rVar2 = this.f82838b;
            if (i14 == 0) {
                while (rVar.a() > 0) {
                    if (this.f82845i) {
                        int iU = rVar.u();
                        this.f82845i = iU == 172;
                        if (iU == 64 || iU == 65) {
                            boolean z14 = iU == 65;
                            this.f82843g = 1;
                            byte[] bArr = rVar2.f70054a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z14 ? 65 : 64);
                            this.f82844h = 2;
                            break;
                        }
                    } else {
                        this.f82845i = rVar.u() == 172;
                    }
                }
            } else if (i14 == 1) {
                byte[] bArr2 = rVar2.f70054a;
                int iMin = Math.min(rVar.a(), 16 - this.f82844h);
                rVar.e(bArr2, this.f82844h, iMin);
                int i15 = this.f82844h + iMin;
                this.f82844h = i15;
                if (i15 == 16) {
                    fa.q qVar = this.f82837a;
                    qVar.m(0);
                    bb.c.C0240c c0240cB = bb.c.b(qVar);
                    int i16 = c0240cB.f17114a;
                    int i17 = c0240cB.f17115b;
                    androidx.media3.common.q qVar2 = this.f82847k;
                    if (qVar2 == null || i17 != qVar2.C || i16 != qVar2.D || !MimeTypes.AUDIO_AC4.equals(qVar2.f8386n)) {
                        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
                        bVar.f8399a = this.f82841e;
                        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_AC4);
                        bVar.B = i17;
                        bVar.C = i16;
                        bVar.f8402d = this.f82839c;
                        bVar.f8404f = this.f82840d;
                        androidx.media3.common.q qVarA = bVar.a();
                        this.f82847k = qVarA;
                        this.f82842f.d(qVarA);
                    }
                    this.f82848l = c0240cB.f17116c;
                    this.f82846j = (((long) c0240cB.f17117d) * 1000000) / ((long) this.f82847k.D);
                    rVar2.G(0);
                    this.f82842f.f(16, rVar2);
                    this.f82843g = 2;
                }
            } else if (i14 == 2) {
                int iMin2 = Math.min(rVar.a(), this.f82848l - this.f82844h);
                this.f82842f.f(iMin2, rVar);
                int i18 = this.f82844h + iMin2;
                this.f82844h = i18;
                if (i18 == this.f82848l) {
                    fa.a.d(this.f82849m != C.TIME_UNSET);
                    this.f82842f.c(this.f82849m, 1, this.f82848l, 0, null);
                    this.f82849m += this.f82846j;
                    this.f82843g = 0;
                }
            }
        }
    }

    @Override // hc.j
    public final void c(bb.p pVar, f0.d dVar) {
        dVar.a();
        dVar.b();
        this.f82841e = dVar.f82933e;
        dVar.b();
        this.f82842f = pVar.track(dVar.f82932d, 1);
    }

    @Override // hc.j
    public final void d(boolean z14) {
    }

    @Override // hc.j
    public final void packetStarted(long j8, int i14) {
        this.f82849m = j8;
    }

    @Override // hc.j
    public final void seek() {
        this.f82843g = 0;
        this.f82844h = 0;
        this.f82845i = false;
        this.f82849m = C.TIME_UNSET;
    }

    public d() {
        this(null, 0);
    }
}
