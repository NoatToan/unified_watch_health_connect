package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ihs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21160a = new HashMap();

    public final synchronized double a(String str) {
        Double d = (Double) this.f21160a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public final synchronized double b(String str, mks mksVar) {
        double d;
        int i = ((xfs) mksVar).i;
        d = (((double) ((xfs) mksVar).h) + 1.0d) / ((double) i);
        this.f21160a.put(str, Double.valueOf(d));
        return d;
    }

    public final synchronized void c(String str) {
        this.f21160a.put(str, Double.valueOf(0.0d));
    }
}
