package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f5072b;

    public static class a {
        private a() {
        }

        public static void a(View view2, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view2.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    private c1() {
    }
}
