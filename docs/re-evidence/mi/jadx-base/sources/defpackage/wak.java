package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wak<T> extends AtomicReference<T> implements jz6 {
    private static final long serialVersionUID = 6537757548749041217L;

    public wak(T t) {
        super(x3h.d(t, "value is null"));
    }

    public abstract void a(T t);

    @Override // defpackage.jz6
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // defpackage.jz6
    public final boolean isDisposed() {
        return get() == null;
    }
}
