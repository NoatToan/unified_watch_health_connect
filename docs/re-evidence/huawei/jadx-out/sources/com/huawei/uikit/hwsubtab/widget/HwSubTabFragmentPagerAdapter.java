package com.huawei.uikit.hwsubtab.widget;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import defpackage.xfz;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes44.dex */
public class HwSubTabFragmentPagerAdapter extends FragmentPagerAdapter implements HwSubTabListener, ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewPager f29735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<b> f29737c;
    private final HwSubTabWidget d;
    private boolean e;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Fragment f29738a;
    }

    private void c(xfz xfzVar) {
        Object objG = xfzVar.g();
        if (objG instanceof b) {
            b bVar = (b) objG;
            int size = this.f29737c.size();
            for (int i = 0; i < size; i++) {
                if (this.f29737c.get(i) == bVar) {
                    notifyDataSetChanged();
                    this.f29735a.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f29737c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        int size = this.f29737c.size();
        if (i < 0 || i >= size) {
            return null;
        }
        return this.f29737c.get(i).f29738a;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.d.setIsViewPagerScroll(false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.e) {
            this.d.setIsViewPagerScroll(true);
            this.d.setSubTabScrollingOffsets(i, f);
        }
        if (Float.compare(f, 0.0f) == 0 && this.f29736b == this.f29735a.getCurrentItem()) {
            this.e = true;
            this.d.setIsViewPagerScroll(false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.d.setSubTabSelected(i);
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        if (this.d.getSubTabAppearance() == 1) {
            this.e = false;
            this.f29736b = xfzVar.c();
        }
        c(xfzVar);
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }
}
