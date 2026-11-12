package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.marketing.views.ColumnLayoutAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fyf extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<SingleGridContent>> f34737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34738c;
    private int d = 36;
    private boolean e;
    private HealthViewPager g;
    private ResourceBriefInfo i;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public fyf(List<List<SingleGridContent>> list, HealthViewPager healthViewPager, Context context, int i) {
        this.e = false;
        this.f34738c = i;
        this.e = qrs.af(BaseApplication.getActivity());
        this.f34737b = list;
        this.g = healthViewPager;
        this.f34736a = context;
    }

    public void d(List<List<SingleGridContent>> list, ResourceBriefInfo resourceBriefInfo) {
        if (njy.e(list)) {
            LogUtil.j("AppTurnPageAdapter", "list is empty");
        } else {
            this.f34737b = list;
            this.i = resourceBriefInfo;
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<List<SingleGridContent>> list = this.f34737b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f34737b, i)) {
            LogUtil.j("AppTurnPageAdapter", "isOutOfBounds");
            return LayoutInflater.from(this.f34736a).inflate(R.layout.item_app_turn_page, (ViewGroup) null);
        }
        View viewD = d(this.f34737b.get(i), this.g);
        if (viewGroup instanceof HealthViewPager) {
            ((HealthViewPager) viewGroup).addView(viewD);
        }
        return viewD;
    }

    private View d(List<SingleGridContent> list, HealthViewPager healthViewPager) {
        View viewInflate = LayoutInflater.from(this.f34736a).inflate(R.layout.item_app_turn_page, (ViewGroup) null);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.app_turn_page_recycler_view);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        ColumnLayoutAdapter columnLayoutAdapter = new ColumnLayoutAdapter(this.f34736a, this.f34738c, this.i);
        columnLayoutAdapter.c(list);
        healthRecycleView.setAdapter(columnLayoutAdapter);
        b(healthRecycleView, list != null ? list.size() : 0);
        return viewInflate;
    }

    private void b(HealthRecycleView healthRecycleView, int i) {
        a(healthRecycleView, fxk.a(this.d, this.e, i), fxk.a(this.d, this.e), fxk.c(this.d), fxk.a(this.d, this.f34738c));
    }

    private void a(HealthRecycleView healthRecycleView, int i, int i2, int i3, int[] iArr) {
        if (this.f34736a == null) {
            LogUtil.j("AppTurnPageAdapter", "setRecyclerViewLayout() mContext is null.");
            return;
        }
        if (i < 1) {
            LogUtil.j("AppTurnPageAdapter", "setRecyclerViewLayout() gridNumber should be at least 1.");
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f34736a, i);
        gridLayoutManager.setOrientation(1);
        healthRecycleView.setLayoutManager(gridLayoutManager);
        if (healthRecycleView.getItemDecorationCount() > 0) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        healthRecycleView.addItemDecoration(new ColumnLayoutItemDecoration(i2, i3, i, iArr));
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setVisibility(0);
    }
}
