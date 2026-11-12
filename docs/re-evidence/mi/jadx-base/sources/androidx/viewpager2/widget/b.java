package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g6i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewPager2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3169a;

    public b(int i) {
        g6i.e(i, "Margin must be non-negative");
        this.f3169a = i;
    }

    public final ViewPager2 a(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.k
    public void transformPage(View view, float f) {
        ViewPager2 viewPager2A = a(view);
        float f2 = this.f3169a * f;
        if (viewPager2A.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2A.e()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}
