package net.lucode.hackware.magicindicator;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes23.dex */
public class ViewPagerHelper {

    public static class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ MagicIndicator a;

        public a(MagicIndicator magicIndicator) {
            this.a = magicIndicator;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.a.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            this.a.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.a.onPageSelected(i);
        }
    }

    public static void bind(MagicIndicator magicIndicator, ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new a(magicIndicator));
    }
}
