package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes23.dex */
class a<T> {
    private final T a;
    private final Thread b = Thread.currentThread();

    public a(T t) {
        this.a = t;
    }

    public T a() {
        if (b()) {
            return this.a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.b == Thread.currentThread();
    }
}
