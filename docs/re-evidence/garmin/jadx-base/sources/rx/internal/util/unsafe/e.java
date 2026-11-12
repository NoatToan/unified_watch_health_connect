package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e<E> extends g<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f154920g = s.a(e.class, "consumerIndex");
    private volatile long consumerIndex;

    public e(int i14) {
        super(i14);
    }

    public final boolean h(long j8, long j14) {
        return s.f154926a.compareAndSwapLong(this, f154920g, j8, j14);
    }

    public final long i() {
        return this.consumerIndex;
    }
}
