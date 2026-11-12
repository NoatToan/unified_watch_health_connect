package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Li3/mj;", "", "Lo4/d0;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/j;)V", "(JJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89031f;

    private mj(long j8, long j14, long j15, long j16, long j17) {
        this(j8, j14, j15, j16, j17, j16, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return o4.d0.d(this.f89026a, mjVar.f89026a) && o4.d0.d(this.f89027b, mjVar.f89027b) && o4.d0.d(this.f89028c, mjVar.f89028c) && o4.d0.d(this.f89029d, mjVar.f89029d) && o4.d0.d(this.f89030e, mjVar.f89030e) && o4.d0.d(this.f89031f, mjVar.f89031f);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f89031f) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f89026a) * 31, 31, this.f89027b), 31, this.f89028c), 31, this.f89029d), 31, this.f89030e);
    }

    @o13.e
    public /* synthetic */ mj(long j8, long j14, long j15, long j16, long j17, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17);
    }

    private mj(long j8, long j14, long j15, long j16, long j17, long j18) {
        this.f89026a = j8;
        this.f89027b = j14;
        this.f89028c = j15;
        this.f89029d = j16;
        this.f89030e = j17;
        this.f89031f = j18;
    }

    public /* synthetic */ mj(long j8, long j14, long j15, long j16, long j17, long j18, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18);
    }
}
