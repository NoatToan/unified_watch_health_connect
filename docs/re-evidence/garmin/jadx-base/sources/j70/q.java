package j70;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj70/q;", "", "Lyz1/d;", "status", "", "hasMoreTrainingEvents", "Li53/c;", "Lr70/s;", "events", "canHideSection", "<init>", "(Lyz1/d;ZLi53/c;Z)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f97619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<r70.s> f97621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f97622d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(yz1.d dVar, boolean z14, i53.c<? extends r70.s> cVar, boolean z15) {
        dVar.getClass();
        cVar.getClass();
        this.f97619a = dVar;
        this.f97620b = z14;
        this.f97621c = cVar;
        this.f97622d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f97619a.equals(qVar.f97619a) && this.f97620b == qVar.f97620b && this.f97621c.equals(qVar.f97621c) && this.f97622d == qVar.f97622d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97622d) + l2.a(this.f97621c, q6.f.g(this.f97619a.hashCode() * 31, 31, this.f97620b), 31);
    }

    public final String toString() {
        return "EventsData(status=" + this.f97619a + ", hasMoreTrainingEvents=" + this.f97620b + ", events=" + this.f97621c + ", canHideSection=" + this.f97622d + ")";
    }
}
