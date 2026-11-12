package androidx.core.view;

import android.os.Build;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private h() {
    }

    public static e0 a(Display display, int i14) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e0.a(display.getRoundedCorner(i14));
        }
        return null;
    }
}
