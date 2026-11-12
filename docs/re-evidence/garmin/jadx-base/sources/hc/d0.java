package hc;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82850a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82855f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.w f82851b = new fa.w(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82856g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82857h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f82858i = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f82852c = new fa.r();

    public d0(int i14) {
        this.f82850a = i14;
    }

    public final void a(bb.o oVar) {
        byte[] bArr = fa.z.f70076f;
        fa.r rVar = this.f82852c;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
        this.f82853d = true;
        oVar.resetPeekPosition();
    }
}
