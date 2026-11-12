package i6;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final void a(long j8, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j8);
        }
    }
}
