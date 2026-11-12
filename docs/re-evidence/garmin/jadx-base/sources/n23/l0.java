package n23;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122524a;

    public l0(p0 p0Var) {
        this.f122524a = p0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        List<k23.k> parameters = this.f122524a.getParameters();
        if (parameters.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (s4.f(((k23.k) it.next()).getType())) {
                    z14 = true;
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
