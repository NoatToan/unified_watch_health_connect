package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class uly extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<View> f50341a;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public uly(ArrayList<View> arrayList) {
        new ArrayList(10);
        this.f50341a = arrayList;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.f50341a)) {
            return 0;
        }
        return this.f50341a.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (njy.c(this.f50341a, i)) {
            viewGroup.removeView(this.f50341a.get(i));
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (!njy.c(this.f50341a, i)) {
            return null;
        }
        View view = this.f50341a.get(i);
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
