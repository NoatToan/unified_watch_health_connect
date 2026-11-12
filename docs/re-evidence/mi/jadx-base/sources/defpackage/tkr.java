package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.core.view.d;

/* JADX INFO: loaded from: classes.dex */
public final class tkr {

    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi(30)
    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static d a(Window window, View view) {
        return new d(window, view);
    }

    public static void b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
