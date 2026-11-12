package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f11173a = true;

    public static class a {
        private a() {
        }

        public static void a(ViewGroup viewGroup, boolean z14) {
            viewGroup.suppressLayout(z14);
        }
    }

    private w() {
    }

    public static void a(ViewGroup viewGroup, boolean z14) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(viewGroup, z14);
        } else if (f11173a) {
            try {
                a.a(viewGroup, z14);
            } catch (NoSuchMethodError unused) {
                f11173a = false;
            }
        }
    }
}
