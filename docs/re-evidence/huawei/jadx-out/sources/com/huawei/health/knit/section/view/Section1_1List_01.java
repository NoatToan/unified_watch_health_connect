package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.section.adapter.Section1_1List_01Adapter;
import com.huawei.health.section.adapter.SectionX_YList_01Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import defpackage.fta;
import defpackage.fts;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1List_01 extends SectionX_YList_01 {
    private int d;

    public Section1_1List_01(Context context) {
        super(context);
        this.d = 1;
    }

    public Section1_1List_01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1;
    }

    public Section1_1List_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 1;
    }

    @Override // com.huawei.health.knit.section.view.SectionX_YList_01
    protected View layoutInflater() {
        return LayoutInflater.from(this.context).inflate(R.layout.section1_1list_01_layout_new, (ViewGroup) this, false);
    }

    @Override // com.huawei.health.knit.section.view.SectionX_YList_01
    protected void setRecyclerViewLayout(fta ftaVar) {
        this.d = Math.max(1, fts.e(ftaVar.e(), ftaVar.h()));
        b();
    }

    private void b() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        int[] iArr = {getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), 0, getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd), 0};
        if (this.sectionRecycleView == null) {
            LogUtil.j("Section1_1List_01", "setLayoutManager() sectionRecycleView is null");
            return;
        }
        if (this.sectionRecycleView.getItemDecorationCount() > 0 && this.sectionRecycleView.getItemDecorationAt(0) != null) {
            this.sectionRecycleView.removeItemDecorationAt(0);
        }
        this.sectionRecycleView.addItemDecoration(new ColumnLayoutItemDecoration(dimensionPixelSize, 0, this.d, iArr));
        this.sectionRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.context, 0, false));
        this.sectionRecycleView.setOnScrollListener(new MarketingBiUtils.FitnessOnScrollListener(this.mPageType, this.mSubHeaderTitle, 3));
    }

    @Override // com.huawei.health.knit.section.view.SectionX_YList_01
    protected SectionX_YList_01Adapter getSectionListAdapter(Context context, fta ftaVar) {
        return new Section1_1List_01Adapter(context, ftaVar);
    }

    @Override // com.huawei.health.knit.section.view.SectionX_YList_01, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }
}
