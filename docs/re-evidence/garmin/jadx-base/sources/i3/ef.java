package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Li3/ef;", "", "Lo4/d0;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f88010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f88011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f88012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f88013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f88014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f88015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f88016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f88017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f88018p;

    private ef(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36) {
        this.f88003a = j8;
        this.f88004b = j14;
        this.f88005c = j15;
        this.f88006d = j16;
        this.f88007e = j17;
        this.f88008f = j18;
        this.f88009g = j19;
        this.f88010h = j24;
        this.f88011i = j25;
        this.f88012j = j26;
        this.f88013k = j27;
        this.f88014l = j28;
        this.f88015m = j29;
        this.f88016n = j34;
        this.f88017o = j35;
        this.f88018p = j36;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        return o4.d0.d(this.f88003a, efVar.f88003a) && o4.d0.d(this.f88004b, efVar.f88004b) && o4.d0.d(this.f88005c, efVar.f88005c) && o4.d0.d(this.f88006d, efVar.f88006d) && o4.d0.d(this.f88007e, efVar.f88007e) && o4.d0.d(this.f88008f, efVar.f88008f) && o4.d0.d(this.f88009g, efVar.f88009g) && o4.d0.d(this.f88010h, efVar.f88010h) && o4.d0.d(this.f88011i, efVar.f88011i) && o4.d0.d(this.f88012j, efVar.f88012j) && o4.d0.d(this.f88013k, efVar.f88013k) && o4.d0.d(this.f88014l, efVar.f88014l) && o4.d0.d(this.f88015m, efVar.f88015m) && o4.d0.d(this.f88016n, efVar.f88016n) && o4.d0.d(this.f88017o, efVar.f88017o) && o4.d0.d(this.f88018p, efVar.f88018p);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f88018p) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f88003a) * 31, 31, this.f88004b), 31, this.f88005c), 31, this.f88006d), 31, this.f88007e), 31, this.f88008f), 31, this.f88009g), 31, this.f88010h), 31, this.f88011i), 31, this.f88012j), 31, this.f88013k), 31, this.f88014l), 31, this.f88015m), 31, this.f88016n), 31, this.f88017o);
    }

    public /* synthetic */ ef(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36);
    }
}
