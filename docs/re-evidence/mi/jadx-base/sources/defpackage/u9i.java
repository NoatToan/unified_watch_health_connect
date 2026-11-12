package defpackage;

import android.content.Context;
import android.os.Looper;
import com.miui.privacypolicy.NetUtils;
import com.miui.privacypolicy.a;

/* JADX INFO: loaded from: classes.dex */
public class u9i {
    public static void a(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static synchronized int b(Context context, String str, String str2, String str3, String str4) {
        a("can not request privacy agree in main thread!");
        if (NetUtils.f10321b) {
            return -4;
        }
        return a.a(context.getApplicationContext(), str, str2, String.valueOf(System.currentTimeMillis()), str3, str4);
    }
}
