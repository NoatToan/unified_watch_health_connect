package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j<E> extends f<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f154921f = s.a(j.class, "producerIndex");
    private volatile long producerIndex;

    public j(int i14) {
        super(i14);
    }

    public final long f() {
        return this.producerIndex;
    }

    public final void g(long j8) {
        s.f154926a.putOrderedLong(this, f154921f, j8);
    }
}
