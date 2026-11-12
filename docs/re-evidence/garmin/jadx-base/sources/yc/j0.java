package yc;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyc/j0;", "", "", "generationId", "Lyc/t4;", "hint", "<init>", "(ILyc/t4;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4 f196088b;

    public j0(int i14, t4 t4Var) {
        t4Var.getClass();
        this.f196087a = i14;
        this.f196088b = t4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f196087a == j0Var.f196087a && this.f196088b.equals(j0Var.f196088b);
    }

    public final int hashCode() {
        return this.f196088b.hashCode() + (Integer.hashCode(this.f196087a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f196087a + ", hint=" + this.f196088b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
