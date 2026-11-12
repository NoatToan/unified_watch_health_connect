package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class a0 extends z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f11053f = true;

    @SuppressLint({"NewApi"})
    public void f(View view2, int i14, int i15, int i16, int i17) {
        if (f11053f) {
            try {
                view2.setLeftTopRightBottom(i14, i15, i16, i17);
            } catch (NoSuchMethodError unused) {
                f11053f = false;
            }
        }
    }
}
