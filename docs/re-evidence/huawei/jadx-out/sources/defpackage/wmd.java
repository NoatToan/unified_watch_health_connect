package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wmd extends HealthPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f52176b;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public wmd(List<View> list) {
        this.f52176b = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f52176b.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f52176b, i)) {
            return null;
        }
        View view = this.f52176b.get(i);
        if (viewGroup != null) {
            viewGroup.addView(view, 0);
        }
        return view;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        List<View> list = this.f52176b;
        if (list == null || viewGroup == null) {
            return;
        }
        viewGroup.removeView(list.get(i));
    }
}
