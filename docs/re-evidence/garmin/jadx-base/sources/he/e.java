package he;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes7.dex */
public class e extends ViewPager2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.d f83473a;

    public e(a.d dVar) {
        this.f83473a = dVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageScrollStateChanged(int i14) {
        this.f83473a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageSelected(int i14) {
        this.f83473a.b(false);
    }
}
