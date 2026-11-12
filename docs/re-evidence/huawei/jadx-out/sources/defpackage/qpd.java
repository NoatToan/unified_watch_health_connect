package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qpd extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f46598a = new ArrayList();

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void e(List<View> list) {
        this.f46598a.clear();
        this.f46598a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f46598a.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view = this.f46598a.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }
}
