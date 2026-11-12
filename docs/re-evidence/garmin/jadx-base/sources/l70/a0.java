package l70;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u008a\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll70/a0;", "", "", "Lo70/o;", "keyStats", "Lo70/t;", "secondaryStats", "Lo70/i;", "essentialsStats", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<o70.o> f110593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<o70.t> f110594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<o70.i> f110595c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Set<? extends o70.o> set, Set<? extends o70.t> set2, Set<? extends o70.i> set3) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        this.f110593a = set;
        this.f110594b = set2;
        this.f110595c = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f110593a.equals(a0Var.f110593a) && this.f110594b.equals(a0Var.f110594b) && this.f110595c.equals(a0Var.f110595c);
    }

    public final int hashCode() {
        return this.f110595c.hashCode() + ((this.f110594b.hashCode() + (this.f110593a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RealTimeStatsConfig(keyStats=" + this.f110593a + ", secondaryStats=" + this.f110594b + ", essentialsStats=" + this.f110595c + ")";
    }
}
