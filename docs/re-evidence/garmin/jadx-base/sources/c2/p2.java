package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/p2;", "", "", "weight", "", "fill", "Lc2/f0;", "crossAxisAlignment", "Lc2/p0;", "flowLayoutData", "<init>", "(FZLc2/f0;Lc2/p0;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f22813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f22814d;

    public /* synthetic */ p2(float f14, boolean z14, f0 f0Var, p0 p0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0f : f14, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? null : f0Var, (i14 & 8) != 0 ? null : p0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Float.compare(this.f22811a, p2Var.f22811a) == 0 && this.f22812b == p2Var.f22812b && p005kotlin.jvm.internal.s.g(this.f22813c, p2Var.f22813c) && p005kotlin.jvm.internal.s.g(this.f22814d, p2Var.f22814d);
    }

    public final int hashCode() {
        int iG = q6.f.g(Float.hashCode(this.f22811a) * 31, 31, this.f22812b);
        f0 f0Var = this.f22813c;
        int iHashCode = (iG + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        p0 p0Var = this.f22814d;
        return iHashCode + (p0Var != null ? Float.hashCode(p0Var.f22809a) : 0);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f22811a + ", fill=" + this.f22812b + ", crossAxisAlignment=" + this.f22813c + ", flowLayoutData=" + this.f22814d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public p2(float f14, boolean z14, f0 f0Var, p0 p0Var) {
        this.f22811a = f14;
        this.f22812b = z14;
        this.f22813c = f0Var;
        this.f22814d = p0Var;
    }

    public p2() {
        this(0.0f, false, null, null, 15, null);
    }
}
