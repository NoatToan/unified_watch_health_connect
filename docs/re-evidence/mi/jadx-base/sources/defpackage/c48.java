package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: loaded from: classes5.dex */
public class c48 extends a {
    public static float e(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    public static float f(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float fE;
        RectF rectFA = a.a(tabLayout, view);
        RectF rectFA2 = a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f2 = e(f);
            fE = f(f);
        } else {
            f2 = f(f);
            fE = e(f);
        }
        drawable.setBounds(wc1.c((int) rectFA.left, (int) rectFA2.left, f2), drawable.getBounds().top, wc1.c((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
