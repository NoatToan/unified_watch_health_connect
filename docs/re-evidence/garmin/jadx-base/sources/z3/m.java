package z3;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz3/m;", "T", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<o> f202117a = new AtomicReference<>(n.f202120a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f202118b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f202119c;

    public final T a() {
        long jA = k.a();
        if (jA == p.f202124a) {
            return this.f202119c;
        }
        o oVar = this.f202117a.get();
        int iA = oVar.a(jA);
        if (iA >= 0) {
            return (T) oVar.f202123c[iA];
        }
        return null;
    }

    public final void b(T t7) {
        long jA = k.a();
        if (jA == p.f202124a) {
            this.f202119c = t7;
            return;
        }
        synchronized (this.f202118b) {
            o oVar = this.f202117a.get();
            int iA = oVar.a(jA);
            if (iA >= 0) {
                oVar.f202123c[iA] = t7;
            } else {
                this.f202117a.set(oVar.b(jA, t7));
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
