package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes13.dex */
public class orn<V> extends FutureTask<V> implements Comparable<Runnable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f44609c;

    public orn(Callable<V> callable) {
        super(callable);
    }

    public orn(Runnable runnable, V v) {
        super(runnable, v);
        this.f44609c = runnable;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Runnable runnable) {
        Runnable runnable2 = this.f44609c;
        orr orrVar = runnable2 instanceof orr ? (orr) runnable2 : null;
        if (orrVar != null) {
            return orrVar.compareTo(runnable);
        }
        return 0;
    }
}
