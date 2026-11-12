package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pke extends HealthPagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45534c;
    private List<View> d;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public pke(Context context, List<View> list) {
        this.f45534c = context;
        this.d = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return this.d.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.d, i)) {
            return null;
        }
        View view = this.d.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
