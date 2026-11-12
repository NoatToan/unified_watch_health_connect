package v2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lv2/j1;", "", "Lv2/k2;", "startAffinity", "endAffinity", "<init>", "(Lv2/k2;Lv2/k2;)V", "affinity", "(Lv2/k2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f175066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2 f175067b;

    public j1(k2 k2Var, k2 k2Var2) {
        this.f175066a = k2Var;
        this.f175067b = k2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f175066a == j1Var.f175066a && this.f175067b == j1Var.f175067b;
    }

    public final int hashCode() {
        return this.f175067b.hashCode() + (this.f175066a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f175066a + ", endAffinity=" + this.f175067b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public j1(k2 k2Var) {
        this(k2Var, k2Var);
    }
}
