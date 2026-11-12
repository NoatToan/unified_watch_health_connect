package mk0;

import am.x0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmk0/a;", "", "Lam/x0;", "activityType", "", "Lmk0/b;", "defaultCollections", "Lmk0/d;", "defaultIndividualGears", "<init>", "(Lam/x0;Ljava/util/List;Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f119097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f119098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f119099c;

    public a(x0 x0Var, List<b> list, List<d> list2) {
        x0Var.getClass();
        list.getClass();
        list2.getClass();
        this.f119097a = x0Var;
        this.f119098b = list;
        this.f119099c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119097a == aVar.f119097a && s.g(this.f119098b, aVar.f119098b) && s.g(this.f119099c, aVar.f119099c);
    }

    public final int hashCode() {
        return this.f119099c.hashCode() + u0.b(this.f119097a.hashCode() * 31, 31, this.f119098b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityTypeDefaultGear(activityType=");
        sb3.append(this.f119097a);
        sb3.append(", defaultCollections=");
        sb3.append(this.f119098b);
        sb3.append(", defaultIndividualGears=");
        return z.c(sb3, this.f119099c, ")");
    }

    public a(x0 x0Var, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2);
    }
}
