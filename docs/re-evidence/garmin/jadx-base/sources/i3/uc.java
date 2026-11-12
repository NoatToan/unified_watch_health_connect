package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li3/uc;", "", "Lo4/d0;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f89905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f89906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f89907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f89908j;

    private uc(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26) {
        this.f89899a = j8;
        this.f89900b = j14;
        this.f89901c = j15;
        this.f89902d = j16;
        this.f89903e = j17;
        this.f89904f = j18;
        this.f89905g = j19;
        this.f89906h = j24;
        this.f89907i = j25;
        this.f89908j = j26;
    }

    public final long a(boolean z14, boolean z15) {
        if (z14) {
            return z15 ? this.f89901c : this.f89903e;
        }
        return z15 ? this.f89906h : this.f89908j;
    }

    public final long b(boolean z14, boolean z15) {
        if (z14) {
            return z15 ? this.f89900b : this.f89902d;
        }
        return z15 ? this.f89905g : this.f89907i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return o4.d0.d(this.f89899a, ucVar.f89899a) && o4.d0.d(this.f89900b, ucVar.f89900b) && o4.d0.d(this.f89901c, ucVar.f89901c) && o4.d0.d(this.f89902d, ucVar.f89902d) && o4.d0.d(this.f89903e, ucVar.f89903e) && o4.d0.d(this.f89904f, ucVar.f89904f) && o4.d0.d(this.f89905g, ucVar.f89905g) && o4.d0.d(this.f89906h, ucVar.f89906h) && o4.d0.d(this.f89907i, ucVar.f89907i) && o4.d0.d(this.f89908j, ucVar.f89908j);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f89908j) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f89899a) * 31, 31, this.f89900b), 31, this.f89901c), 31, this.f89902d), 31, this.f89903e), 31, this.f89904f), 31, this.f89905g), 31, this.f89906h), 31, this.f89907i);
    }

    public /* synthetic */ uc(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26);
    }
}
