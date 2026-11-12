package mp;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmp/g;", "Lmp/b;", "Lam/x0;", "parentActivityType", "childActivityType", "<init>", "(Lam/x0;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f119973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f119974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x0 x0Var, x0 x0Var2) {
        super(x0Var2, null);
        x0Var.getClass();
        x0Var2.getClass();
        this.f119973b = x0Var;
        this.f119974c = x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f119973b == gVar.f119973b && this.f119974c == gVar.f119974c;
    }

    public final int hashCode() {
        return this.f119974c.hashCode() + (this.f119973b.hashCode() * 31);
    }

    public final String toString() {
        return "ChildActivity(parentActivityType=" + this.f119973b + ", childActivityType=" + this.f119974c + ")";
    }
}
