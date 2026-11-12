package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    public static class a {
        private a() {
        }

        public static void a(Window window, boolean z14) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z14 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z14);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(Window window, boolean z14) {
            window.setDecorFitsSystemWindows(z14);
        }
    }

    private k1() {
    }

    public static void a(Window window, boolean z14) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 35) {
            b.a(window, z14);
        } else {
            if (i14 >= 30) {
                a.a(window, z14);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z14 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
