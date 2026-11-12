package defpackage;

import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;

/* JADX INFO: loaded from: classes16.dex */
public class qpl implements HealthViewPager.OnPageChangeListener {
    private HwSubTabWidget d;

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    public qpl(HwSubTabWidget hwSubTabWidget) {
        this.d = hwSubTabWidget;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.d.setSubTabScrollingOffsets(i, f);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.d.setSubTabSelected(i);
    }
}
