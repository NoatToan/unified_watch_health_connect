package ho;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lho/a;", "", "Lam/x0;", "parentActivity", "Li53/c;", "Lho/b;", "childActivities", "<init>", "(Lam/x0;Li53/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f84566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<b> f84567b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(x0 x0Var, i53.c<? extends b> cVar) {
        x0Var.getClass();
        cVar.getClass();
        this.f84566a = x0Var;
        this.f84567b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f84566a == aVar.f84566a && p005kotlin.jvm.internal.s.g(this.f84567b, aVar.f84567b);
    }

    public final int hashCode() {
        return this.f84567b.hashCode() + (this.f84566a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityData(parentActivity=" + this.f84566a + ", childActivities=" + this.f84567b + ")";
    }

    public a(x0 x0Var, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? j53.l.b() : cVar);
    }
}
