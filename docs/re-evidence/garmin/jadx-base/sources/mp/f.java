package mp;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmp/f;", "Lmp/b;", "Lam/x0;", "parentActivityType", "<init>", "(Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f119972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x0 x0Var) {
        super(x0Var, null);
        x0Var.getClass();
        this.f119972b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f119972b == ((f) obj).f119972b;
    }

    public final int hashCode() {
        return this.f119972b.hashCode();
    }

    public final String toString() {
        return "AllActivities(parentActivityType=" + this.f119972b + ")";
    }
}
