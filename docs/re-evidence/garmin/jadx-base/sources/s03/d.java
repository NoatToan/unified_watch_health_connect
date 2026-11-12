package s03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T> extends AtomicReference<T> implements b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T t7) {
        super(t7);
        w03.b.a(t7, "value is null");
    }

    public abstract void a(T t7);

    @Override // s03.b
    public final boolean b() {
        return get() == null;
    }

    @Override // s03.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }
}
