package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: loaded from: classes5.dex */
public class z79 extends a {
    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFA = a.a(tabLayout, view);
        float fB = f < 0.5f ? wc1.b(1.0f, 0.0f, 0.0f, 0.5f, f) : wc1.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB * 255.0f));
    }
}
