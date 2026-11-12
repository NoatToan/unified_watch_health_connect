package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class b0 extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f11054g = true;

    @Override // androidx.transition.y
    @SuppressLint({"NewApi"})
    public void c(int i14, View view2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(i14, view2);
        } else if (f11054g) {
            try {
                view2.setTransitionVisibility(i14);
            } catch (NoSuchMethodError unused) {
                f11054g = false;
            }
        }
    }
}
