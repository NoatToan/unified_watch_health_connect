package qw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqw0/f;", "", "", "requestIntervalInMillis", "Lqw0/g;", "locationRequestAccuracy", "<init>", "(JLqw0/g;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f148311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f148312b;

    public f(long j8, g gVar) {
        gVar.getClass();
        this.f148311a = j8;
        this.f148312b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f148311a == fVar.f148311a && p005kotlin.jvm.internal.s.g(this.f148312b, fVar.f148312b);
    }

    public final int hashCode() {
        return this.f148312b.hashCode() + (Long.hashCode(this.f148311a) * 31);
    }

    public final String toString() {
        return "GCMLocationRequest(requestIntervalInMillis=" + this.f148311a + ", locationRequestAccuracy=" + this.f148312b + ")";
    }

    public /* synthetic */ f(long j8, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1000L : j8, gVar);
    }
}
