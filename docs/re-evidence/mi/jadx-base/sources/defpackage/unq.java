package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class unq<T> implements l0d<T> {
    public abstract T constructor();

    public synchronized void destructor() {
    }

    @Override // defpackage.l0d
    public T get() {
        T tPeek = peek();
        if (tPeek != null) {
            return tPeek;
        }
        synchronized (this) {
            try {
                T tPeek2 = peek();
                if (tPeek2 != null) {
                    return tPeek2;
                }
                T tOnConstructor = onConstructor();
                if (tOnConstructor == null) {
                    throw new NullPointerException("call onConstructor return null.");
                }
                notifyAll();
                return tOnConstructor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T onConstructor();

    public abstract T peek();
}
