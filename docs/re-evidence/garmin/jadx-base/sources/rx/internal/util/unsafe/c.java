package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static int a(int i14) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i14 - 1));
    }
}
