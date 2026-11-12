package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class lyq extends hyq {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void d(View view, Matrix matrix) {
        if (d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
