package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ViewPager2.i> f3168a;

    public a(int i) {
        this.f3168a = new ArrayList(i);
    }

    public void a(ViewPager2.i iVar) {
        this.f3168a.add(iVar);
    }

    public void b(ViewPager2.i iVar) {
        this.f3168a.remove(iVar);
    }

    public final void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i) {
        try {
            Iterator<ViewPager2.i> it = this.f3168a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator<ViewPager2.i> it = this.f3168a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            c(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i) {
        try {
            Iterator<ViewPager2.i> it = this.f3168a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            c(e);
        }
    }
}
