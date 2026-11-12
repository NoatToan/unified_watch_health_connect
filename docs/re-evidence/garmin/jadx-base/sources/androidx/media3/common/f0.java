package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8222d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<Integer> f8224b;

    static {
        int i14 = fa.z.f70071a;
        f8221c = Integer.toString(0, 36);
        f8222d = Integer.toString(1, 36);
    }

    public f0(e0 e0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= e0Var.f8214a)) {
            o2.c.q();
            throw null;
        }
        this.f8223a = e0Var;
        this.f8224b = ImmutableList.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f8223a.equals(f0Var.f8223a) && this.f8224b.equals(f0Var.f8224b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8224b.hashCode() * 31) + this.f8223a.hashCode();
    }

    public f0(e0 e0Var, int i14) {
        this(e0Var, ImmutableList.of(Integer.valueOf(i14)));
    }
}
