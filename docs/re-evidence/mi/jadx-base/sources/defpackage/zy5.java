package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class zy5 {
    public static void a(TextView textView, float f) {
        if (Build.VERSION.SDK_INT >= 30) {
            textView.setTextSize(textView.getTextSizeUnit(), f);
        } else {
            textView.setTextSize(2, f);
        }
    }

    public static void b(TextView textView, float f) {
        textView.setTextSize(2, f);
    }

    public static void c(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin * f);
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * f);
            marginLayoutParams.rightMargin = (int) (marginLayoutParams.rightMargin * f);
            marginLayoutParams.bottomMargin = (int) (marginLayoutParams.bottomMargin * f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void d(View view, float f) {
        view.setPadding((int) (view.getPaddingLeft() * f), (int) (view.getPaddingTop() * f), (int) (view.getPaddingRight() * f), (int) (view.getPaddingBottom() * f));
    }

    public static void e(View view, float f) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = layoutParams.width;
        if (i > 0) {
            layoutParams.width = (int) (i * f);
            z = true;
        } else {
            z = false;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            layoutParams.height = (int) (i2 * f);
        } else if (!z) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }
}
