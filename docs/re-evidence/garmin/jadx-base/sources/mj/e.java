package mj;

/* JADX INFO: loaded from: classes7.dex */
public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f119028a;

        a(boolean z14) {
            this.f119028a = z14;
        }
    }

    boolean a();

    void c(d dVar);

    boolean e(d dVar);

    boolean f(d dVar);

    e getRoot();

    boolean h(d dVar);

    void i(d dVar);
}
