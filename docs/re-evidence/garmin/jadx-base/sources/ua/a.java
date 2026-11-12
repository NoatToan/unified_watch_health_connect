package ua;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f169580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f169581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f169582d;

    public a(long j8, long j14) {
        this.f169580b = j8;
        this.f169581c = j14;
        this.f169582d = j8 - 1;
    }

    @Override // ua.e
    public final boolean next() {
        long j8 = this.f169582d + 1;
        this.f169582d = j8;
        return !(j8 > this.f169581c);
    }
}
