package o70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo70/k;", "", "", "enabledSectionsCount", "Lj70/k$h;", "events", "<init>", "(ILj70/k$h;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f130023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j70.k.h f130024b;

    public k(int i14, j70.k.h hVar) {
        this.f130023a = i14;
        this.f130024b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f130023a == kVar.f130023a && p005kotlin.jvm.internal.s.g(this.f130024b, kVar.f130024b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f130023a) * 31;
        j70.k.h hVar = this.f130024b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        return "EventsSectionData(enabledSectionsCount=" + this.f130023a + ", events=" + this.f130024b + ")";
    }
}
