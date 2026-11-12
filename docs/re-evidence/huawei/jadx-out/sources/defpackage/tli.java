package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tli extends HwPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f49323b;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public tli(List<View> list) {
        this.f49323b = new ArrayList(0);
        if (list == null) {
            return;
        }
        this.f49323b = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (i < 0 || i >= this.f49323b.size() || !(viewGroup instanceof HwViewPager)) {
            return;
        }
        ((HwViewPager) viewGroup).removeView(this.f49323b.get(i));
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<View> list = this.f49323b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (!(viewGroup instanceof HwViewPager) || !njy.c(this.f49323b, i)) {
            return null;
        }
        ((HwViewPager) viewGroup).addView(this.f49323b.get(i), 0);
        return this.f49323b.get(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        super.startUpdate(viewGroup);
    }
}
