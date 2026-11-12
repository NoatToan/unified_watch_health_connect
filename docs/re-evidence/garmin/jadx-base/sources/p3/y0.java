package p3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp3/y0;", "", TtmlNode.LEFT, TtmlNode.RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f135389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135390b;

    public y0(Object obj, Object obj2) {
        this.f135389a = obj;
        this.f135390b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return p005kotlin.jvm.internal.s.g(this.f135389a, y0Var.f135389a) && p005kotlin.jvm.internal.s.g(this.f135390b, y0Var.f135390b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f135389a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i14 = iHashCode * 31;
        Object obj2 = this.f135390b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JoinedKey(left=");
        sb3.append(this.f135389a);
        sb3.append(", right=");
        return wr.g.p(sb3, this.f135390b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
