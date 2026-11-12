package defpackage;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class nkp {
    public static void a(String str) {
        if (wlq.f38110a >= 18) {
            b(str);
        }
    }

    @RequiresApi(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (wlq.f38110a >= 18) {
            d();
        }
    }

    @RequiresApi(18)
    public static void d() {
        Trace.endSection();
    }
}
