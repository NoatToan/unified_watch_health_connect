package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class e6d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16309a = true;

    public static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            b(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    @RequiresApi(21)
    @SuppressLint({"NewApi"})
    public static void b(ImageView imageView, Matrix matrix) {
        if (f16309a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f16309a = false;
            }
        }
    }
}
