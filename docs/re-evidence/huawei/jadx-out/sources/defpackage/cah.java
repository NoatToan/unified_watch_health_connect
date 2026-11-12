package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.basichealthmodel.ui.view.HealthWeekCloverView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cah extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<View> f1387a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HealthWeekCloverView> f1388b;
    private Context e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public cah(Context context, List<HealthWeekCloverView> list) {
        this.e = context;
        this.f1388b = list;
    }

    public LinkedList<View> b() {
        return this.f1387a;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<HealthWeekCloverView> list = this.f1388b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            if (obj instanceof HealthWeekCloverView) {
                LogUtil.a("HL_HealthCloverPageAdapter", "destroyItem object instanceof HealthWeekCloverView position = ", Integer.valueOf(i));
                ((HealthWeekCloverView) obj).e();
            }
            View view = (View) obj;
            this.f1387a.add(view);
            viewGroup.removeView(view);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f1388b) || njy.e(this.f1388b, i)) {
            return null;
        }
        HealthWeekCloverView healthWeekCloverView = this.f1388b.get(i);
        if (healthWeekCloverView.getParent() instanceof ViewGroup) {
            LogUtil.j("HL_HealthCloverPageAdapter", "child has a parent must reset child and viewList");
            if (this.e == null) {
                this.e = BaseApplication.getContext();
            }
            HealthWeekCloverView healthWeekCloverView2 = new HealthWeekCloverView(this.e);
            this.f1388b.set(i, healthWeekCloverView2);
            viewGroup.addView(healthWeekCloverView2);
            return healthWeekCloverView2;
        }
        viewGroup.addView(healthWeekCloverView);
        return healthWeekCloverView;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        List<HealthWeekCloverView> list = this.f1388b;
        if (list == null) {
            return -2;
        }
        if (list.contains(obj)) {
            return this.f1388b.indexOf(obj);
        }
        return -1;
    }
}
