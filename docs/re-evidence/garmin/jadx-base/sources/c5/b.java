package c5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc5/b;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f24448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24449c;

    public b() {
        d.a aVar = d.a.Lsq2;
        this.f24447a = new d(false, aVar, 1, null);
        this.f24448b = new d(false, aVar, 1, null);
        n4.c.f123541b.getClass();
    }

    public final void a(long j8, long j14) {
        this.f24447a.a(Float.intBitsToFloat((int) (j14 >> 32)), j8);
        this.f24448b.a(Float.intBitsToFloat((int) (j14 & 4294967295L)), j8);
    }
}
