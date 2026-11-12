package ae2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lae2/s;", "", "", "deviceId", "Lae2/t;", "eventType", "<init>", "(Ljava/lang/Long;Lae2/t;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f2991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f2992b;

    public /* synthetic */ s(Long l14, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : l14, (i14 & 2) != 0 ? null : tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f2991a, sVar.f2991a) && p005kotlin.jvm.internal.s.g(this.f2992b, sVar.f2992b);
    }

    public final int hashCode() {
        Long l14 = this.f2991a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        t tVar = this.f2992b;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "LtEvent(deviceId=" + this.f2991a + ", eventType=" + this.f2992b + ")";
    }

    public s(Long l14, t tVar) {
        this.f2991a = l14;
        this.f2992b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
