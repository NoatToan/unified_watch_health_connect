package z3;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f202124a;

    static {
        long id3;
        try {
            id3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id3 = -1;
        }
        f202124a = id3;
    }
}
