package com.huawei.health.marketing.views;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import defpackage.fxk;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class MultiFunctionPagerAdapter extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8375c;
    private ResourceBriefInfo d;
    private List<SingleFunctionGridContent> e;
    private HealthRecycleView f;
    private int h;
    private Pair<Integer, Integer> i = BaseActivity.getSafeRegionWidth();

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MultiFunctionPagerAdapter(Context context) {
        this.f8374b = context;
    }

    public void a(List<SingleFunctionGridContent> list, ResourceBriefInfo resourceBriefInfo, int i, int i2) {
        this.e = list;
        this.d = resourceBriefInfo;
        this.h = i;
        this.f8373a = i2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return (this.e.size() / 8) + (this.e.size() % 8 > 0 ? 1 : 0);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(this.f8374b, R.layout.pager_multi_function, null);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.multi_function_recycler_view);
        this.f = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.f.setHasFixedSize(true);
        this.f.b(false);
        this.f.e(false);
        this.f.setIsScroll(false);
        ColumnLayoutAdapter columnLayoutAdapter = new ColumnLayoutAdapter(this.f8374b, this.h, this.d);
        int i2 = i * 8;
        columnLayoutAdapter.a(this.e.subList(i2, Math.min(i2 + 8, this.e.size())));
        this.f.setAdapter(columnLayoutAdapter);
        d();
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void d() {
        a(fxk.a(this.f8373a, this.f8375c, this.f.getAdapter() != null ? this.f.getAdapter().getItemCount() : 0), fxk.a(this.f8373a, this.f8375c), fxk.c(this.f8373a), fxk.a(this.f8373a, this.h));
    }

    private void a(int i, int i2, int i3, int[] iArr) {
        LogUtil.a("MultiFunctionPagerAdapter", "enter setRecyclerViewLayout");
        if (this.f8374b == null) {
            LogUtil.j("MultiFunctionPagerAdapter", "setRecyclerViewLayout() mContext is null.");
            return;
        }
        if (i < 1) {
            LogUtil.j("MultiFunctionPagerAdapter", "setRecyclerViewLayout() gridNumber should be at least 1.");
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f8374b, 2);
        gridLayoutManager.setReverseLayout(false);
        gridLayoutManager.setOrientation(0);
        gridLayoutManager.setReverseLayout(LanguageUtil.ba(BaseApplication.getContext()));
        this.f.setLayoutManager(gridLayoutManager);
        int itemDecorationCount = this.f.getItemDecorationCount();
        if (itemDecorationCount > 0) {
            while (true) {
                itemDecorationCount--;
                if (itemDecorationCount < 0) {
                    break;
                } else {
                    this.f.removeItemDecorationAt(itemDecorationCount);
                }
            }
        }
        this.f.addItemDecoration(new ColumnLayoutItemDecoration(i2, i3, i, iArr, this.f8373a));
        this.f.setHasFixedSize(true);
        this.f.setNestedScrollingEnabled(false);
        this.f.setVisibility(0);
    }

    public void b(boolean z) {
        this.f8375c = z;
    }
}
