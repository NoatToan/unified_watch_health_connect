package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g1l extends wak<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public g1l(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.wak
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
