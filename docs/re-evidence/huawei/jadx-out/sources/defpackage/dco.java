package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class dco extends HealthPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<View> f31608b;

    static /* synthetic */ void b(View view) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Parcelable saveState() {
        return null;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public dco(List<View> list) {
        this.f31608b = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (!(viewGroup instanceof HealthViewPager) || njy.e(this.f31608b, i)) {
            return;
        }
        ((HealthViewPager) viewGroup).removeView(this.f31608b.get(i));
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<View> list = this.f31608b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof HealthViewPager) {
            viewGroup.addView(this.f31608b.get(i), 0);
        }
        int size = this.f31608b.size() - 1;
        if (i == size) {
            this.f31608b.get(size).setOnClickListener(new View.OnClickListener() { // from class: dcs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dco.b(view);
                }
            });
        }
        return this.f31608b.get(i);
    }
}
