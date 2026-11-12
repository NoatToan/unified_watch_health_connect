package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ib4 {
    public static Throwable a(Throwable th) {
        if (th != null && !(th instanceof RuntimeException) && !(th instanceof Error)) {
            return th;
        }
        throw new IllegalArgumentException("Not a checked exception: " + th);
    }
}
