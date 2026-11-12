package nn0;

import in0.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnn0/c;", "", "Lyz1/d;", "status", "Li53/c;", "Lin0/h;", "metrics", "<init>", "(Lyz1/d;Li53/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f126685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<h> f126686b;

    static {
        int i14 = h.f94445e;
    }

    public c(d dVar, i53.c<h> cVar) {
        dVar.getClass();
        this.f126685a = dVar;
        this.f126686b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f126685a.equals(cVar.f126685a) && s.g(this.f126686b, cVar.f126686b);
    }

    public final int hashCode() {
        int iHashCode = this.f126685a.hashCode() * 31;
        i53.c<h> cVar = this.f126686b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "HealthStatusCardData(status=" + this.f126685a + ", metrics=" + this.f126686b + ")";
    }
}
