package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class foq extends HealthPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<View> f34323b;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public foq(ArrayList<View> arrayList) {
        new ArrayList(10);
        this.f34323b = arrayList;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.f34323b)) {
            return 0;
        }
        return this.f34323b.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (njy.c(this.f34323b, i)) {
            viewGroup.removeView(this.f34323b.get(i));
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (!njy.c(this.f34323b, i)) {
            return null;
        }
        View view = this.f34323b.get(i);
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
        return view;
    }
}
