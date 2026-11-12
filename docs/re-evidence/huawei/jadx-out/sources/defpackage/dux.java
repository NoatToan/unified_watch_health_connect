package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolder;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolderCreator;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dux<T> extends HwPagerAdapter {
    private HealthViewPagerHolderCreator d;
    private List<T> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public dux(List<T> list, HealthViewPagerHolderCreator healthViewPagerHolderCreator) {
        this.e = list;
        this.d = healthViewPagerHolderCreator;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<T> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewE = e(i, viewGroup);
        viewGroup.addView(viewE);
        return viewE;
    }

    private View e(int i, ViewGroup viewGroup) {
        HealthViewPagerHolder healthViewPagerHolderCreateViewHolder = this.d.createViewHolder();
        View viewCreateView = healthViewPagerHolderCreateViewHolder.createView(viewGroup.getContext());
        if (viewCreateView != null) {
            viewCreateView.setTag(Integer.valueOf(i));
        }
        List<T> list = this.e;
        if (list != null && list.size() > 0) {
            healthViewPagerHolderCreateViewHolder.onBind(viewGroup.getContext(), i, this.e.get(i));
        }
        return viewCreateView;
    }
}
