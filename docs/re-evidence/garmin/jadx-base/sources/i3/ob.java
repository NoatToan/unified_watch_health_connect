package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/ob;", "", "Lo4/d0;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f89194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f89195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f89196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f89197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f89198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f89199l;

    private ob(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28) {
        this.f89188a = j8;
        this.f89189b = j14;
        this.f89190c = j15;
        this.f89191d = j16;
        this.f89192e = j17;
        this.f89193f = j18;
        this.f89194g = j19;
        this.f89195h = j24;
        this.f89196i = j25;
        this.f89197j = j26;
        this.f89198k = j27;
        this.f89199l = j28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ob.class != obj.getClass()) {
            return false;
        }
        ob obVar = (ob) obj;
        return o4.d0.d(this.f89190c, obVar.f89190c) && o4.d0.d(this.f89189b, obVar.f89189b) && o4.d0.d(this.f89188a, obVar.f89188a) && o4.d0.d(this.f89193f, obVar.f89193f) && o4.d0.d(this.f89192e, obVar.f89192e) && o4.d0.d(this.f89191d, obVar.f89191d) && o4.d0.d(this.f89196i, obVar.f89196i) && o4.d0.d(this.f89195h, obVar.f89195h) && o4.d0.d(this.f89194g, obVar.f89194g) && o4.d0.d(this.f89199l, obVar.f89199l) && o4.d0.d(this.f89198k, obVar.f89198k) && o4.d0.d(this.f89197j, obVar.f89197j);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f89197j) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f89190c) * 31, 31, this.f89189b), 31, this.f89188a), 31, this.f89193f), 31, this.f89192e), 31, this.f89191d), 31, this.f89196i), 31, this.f89195h), 31, this.f89194g), 31, this.f89199l), 31, this.f89198k);
    }

    public /* synthetic */ ob(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28);
    }
}
