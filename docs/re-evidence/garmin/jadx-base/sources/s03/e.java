package s03;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d<Runnable> {
    public e(Runnable runnable) {
        super(runnable);
    }

    @Override // s03.d
    public final void a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + b() + ", " + get() + ")";
    }
}
