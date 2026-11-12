package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends ViewPager2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11374a;

    public a(int i14) {
        this.f11374a = new ArrayList(i14);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageScrollStateChanged(int i14) {
        try {
            Iterator it = this.f11374a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.h) it.next()).onPageScrollStateChanged(i14);
            }
        } catch (ConcurrentModificationException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageScrolled(int i14, float f14, int i15) {
        try {
            Iterator it = this.f11374a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.h) it.next()).onPageScrolled(i14, f14, i15);
            }
        } catch (ConcurrentModificationException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageSelected(int i14) {
        try {
            Iterator it = this.f11374a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.h) it.next()).onPageSelected(i14);
            }
        } catch (ConcurrentModificationException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }
}
