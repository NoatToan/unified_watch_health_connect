package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f3170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2.k f3171b;

    public c(LinearLayoutManager linearLayoutManager) {
        this.f3170a = linearLayoutManager;
    }

    public ViewPager2.k a() {
        return this.f3171b;
    }

    public void b(ViewPager2.k kVar) {
        this.f3171b = kVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f3171b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f3170a.getChildCount(); i3++) {
            View childAt = this.f3170a.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f3170a.getChildCount())));
            }
            this.f3171b.transformPage(childAt, (this.f3170a.getPosition(childAt) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i) {
    }
}
