package fn1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfn1/w;", "", "Le53/c;", "baseline", "Lj23/g;", "range", "<init>", "(JLj23/g;Lkotlin/jvm/internal/j;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.g<e53.c> f72253b;

    public /* synthetic */ w(long j8, j23.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : gVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            long j8 = wVar.f72252a;
            e53.c.a aVar = e53.c.f63094b;
            if (this.f72252a == j8 && p005kotlin.jvm.internal.s.g(this.f72253b, wVar.f72253b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        e53.c.a aVar = e53.c.f63094b;
        int iHashCode = Long.hashCode(this.f72252a) * 31;
        j23.g<e53.c> gVar = this.f72253b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "SleepRecommendation(baseline=" + e53.c.k(this.f72252a) + ", range=" + this.f72253b + ")";
    }

    private w(long j8, j23.g<e53.c> gVar) {
        this.f72252a = j8;
        this.f72253b = gVar;
    }

    public /* synthetic */ w(long j8, j23.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, gVar);
    }
}
