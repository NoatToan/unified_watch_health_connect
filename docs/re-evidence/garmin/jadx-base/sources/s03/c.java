package s03;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static e a(Runnable runnable) {
        w03.b.a(runnable, "run is null");
        return new e(runnable);
    }
}
