package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li3/xb;", "", "Lo4/d0;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f90312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f90313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f90314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f90315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f90316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f90317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f90318m;

    private xb(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.f90306a = j8;
        this.f90307b = j14;
        this.f90308c = j15;
        this.f90309d = j16;
        this.f90310e = j17;
        this.f90311f = j18;
        this.f90312g = j19;
        this.f90313h = j24;
        this.f90314i = j25;
        this.f90315j = j26;
        this.f90316k = j27;
        this.f90317l = j28;
        this.f90318m = j29;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return o4.d0.d(this.f90306a, xbVar.f90306a) && o4.d0.d(this.f90307b, xbVar.f90307b) && o4.d0.d(this.f90308c, xbVar.f90308c) && o4.d0.d(this.f90309d, xbVar.f90309d) && o4.d0.d(this.f90310e, xbVar.f90310e) && o4.d0.d(this.f90311f, xbVar.f90311f) && o4.d0.d(this.f90312g, xbVar.f90312g) && o4.d0.d(this.f90313h, xbVar.f90313h) && o4.d0.d(this.f90314i, xbVar.f90314i) && o4.d0.d(this.f90315j, xbVar.f90315j) && o4.d0.d(this.f90316k, xbVar.f90316k) && o4.d0.d(this.f90317l, xbVar.f90317l) && o4.d0.d(this.f90318m, xbVar.f90318m);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f90318m) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f90306a) * 31, 31, this.f90307b), 31, this.f90308c), 31, this.f90309d), 31, this.f90310e), 31, this.f90311f), 31, this.f90312g), 31, this.f90313h), 31, this.f90314i), 31, this.f90315j), 31, this.f90316k), 31, this.f90317l);
    }

    public /* synthetic */ xb(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29);
    }
}
