package androidx.core.view;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class t0 {
    private t0() {
    }

    public static int a(ViewConfiguration viewConfiguration, int i14, int i15, int i16) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i14, i15, i16);
    }

    public static int b(ViewConfiguration viewConfiguration, int i14, int i15, int i16) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i14, i15, i16);
    }
}
