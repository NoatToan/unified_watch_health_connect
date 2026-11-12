package j70;

import java.util.Set;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj70/h;", "Lhm0/a;", "", "Lo70/f;", "sections", "Lo70/r;", "primaryStats", "Lo70/t;", "secondaryStats", "Lo70/i;", "essentialsStats", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements hm0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<o70.f> f97529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<o70.r> f97530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<o70.t> f97531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<o70.i> f97532d;

    public h(Set set, Set set2, Set set3, Set set4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? l0.f134950a : set, (i14 & 2) != 0 ? l0.f134950a : set2, (i14 & 4) != 0 ? l0.f134950a : set3, (i14 & 8) != 0 ? l0.f134950a : set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f97529a, hVar.f97529a) && p005kotlin.jvm.internal.s.g(this.f97530b, hVar.f97530b) && p005kotlin.jvm.internal.s.g(this.f97531c, hVar.f97531c) && p005kotlin.jvm.internal.s.g(this.f97532d, hVar.f97532d);
    }

    public final int hashCode() {
        return this.f97532d.hashCode() + ((this.f97531c.hashCode() + ((this.f97530b.hashCode() + (this.f97529a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DashboardDataQuery(sections=" + this.f97529a + ", primaryStats=" + this.f97530b + ", secondaryStats=" + this.f97531c + ", essentialsStats=" + this.f97532d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Set<? extends o70.f> set, Set<? extends o70.r> set2, Set<? extends o70.t> set3, Set<? extends o70.i> set4) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        this.f97529a = set;
        this.f97530b = set2;
        this.f97531c = set3;
        this.f97532d = set4;
    }

    public h() {
        this(null, null, null, null, 15, null);
    }
}
