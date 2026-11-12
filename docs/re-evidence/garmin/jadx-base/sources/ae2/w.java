package ae2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lae2/w;", "", "", "deviceId", "Lae2/r;", "sportType", "Lae2/t;", "eventType", "<init>", "(Ljava/lang/Long;Lae2/r;Lae2/t;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f3000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f3002c;

    public /* synthetic */ w(Long l14, r rVar, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : l14, (i14 & 2) != 0 ? new r.i() : rVar, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.f3000a, wVar.f3000a) && p005kotlin.jvm.internal.s.g(this.f3001b, wVar.f3001b) && p005kotlin.jvm.internal.s.g(this.f3002c, wVar.f3002c);
    }

    public final int hashCode() {
        Long l14 = this.f3000a;
        int iHashCode = (this.f3001b.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31)) * 31;
        t tVar = this.f3002c;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "LtSportEvent(deviceId=" + this.f3000a + ", sportType=" + this.f3001b + ", eventType=" + this.f3002c + ")";
    }

    public w(Long l14, r rVar, t tVar) {
        rVar.getClass();
        this.f3000a = l14;
        this.f3001b = rVar;
        this.f3002c = tVar;
    }
}
