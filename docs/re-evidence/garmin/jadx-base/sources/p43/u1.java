package p43;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u1 implements t1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return b() == t1Var.b() && a() == t1Var.a() && getType().equals(t1Var.getType());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (d2.o(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (b()) {
            return Marker.ANY_MARKER;
        }
        if (a() == g2.INVARIANT) {
            return getType().toString();
        }
        return a() + StringUtils.SPACE + getType();
    }
}
