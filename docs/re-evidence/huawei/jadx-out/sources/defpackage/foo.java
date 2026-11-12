package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class foo extends HealthPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34321b;
    private ArrayList<View> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public foo(ArrayList<View> arrayList, Context context) {
        new ArrayList(10);
        this.e = arrayList;
        this.f34321b = context;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (njy.c(this.e, i)) {
            viewGroup.removeView(this.e.get(i));
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (!njy.c(this.e, i)) {
            return null;
        }
        View view = this.e.get(i);
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
