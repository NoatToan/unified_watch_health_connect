package defpackage;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class lfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f25012a = Log.isLoggable("OverScroll", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f25013b = Log.isLoggable("OverScroll", 2);

    public static void a(String str) {
    }

    public static void b(String str, Object... objArr) {
        if (f25012a) {
            String.format(Locale.US, str, objArr);
        }
    }

    public static void c(String str) {
    }

    public static void d(String str, Object... objArr) {
        if (f25013b) {
            String.format(Locale.US, str, objArr);
        }
    }
}
