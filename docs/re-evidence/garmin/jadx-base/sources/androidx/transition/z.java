package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class z extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f11179d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f11180e = true;

    @SuppressLint({"NewApi"})
    public void d(View view2, Matrix matrix) {
        if (f11179d) {
            try {
                view2.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f11179d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(View view2, Matrix matrix) {
        if (f11180e) {
            try {
                view2.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f11180e = false;
            }
        }
    }
}
