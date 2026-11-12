package defpackage;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class dkp {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
