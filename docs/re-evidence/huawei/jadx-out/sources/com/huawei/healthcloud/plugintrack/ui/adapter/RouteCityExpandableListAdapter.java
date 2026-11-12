package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import defpackage.jpl;
import defpackage.qrs;

/* JADX INFO: loaded from: classes10.dex */
public class RouteCityExpandableListAdapter extends BaseGroupDataAdapter<jpl, HotPathCityInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseGroupDataAdapter.OnItemClickListener f10983b;

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter, android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter
    public void setChildViewData(RecyclerHolder recyclerHolder, final int i, final int i2) {
        HotPathCityInfo child = getChild(i2, i);
        if (child == null) {
            LogUtil.j("Track_RouteCityExpandableListAdapter", "child is null'");
            return;
        }
        ((RelativeLayout) recyclerHolder.d(R.id.item_layout)).setMinimumHeight(qrs.d(BaseApplication.b(), 48.0f));
        recyclerHolder.d(R.id.item_out_layout).setLayoutParams(new RelativeLayout.LayoutParams(-1, qrs.d(BaseApplication.b(), 48.0f)));
        recyclerHolder.d(R.id.item_subtitle).setVisibility(8);
        recyclerHolder.d(R.id.item_right_data).setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, R.id.item_out_layout);
        recyclerHolder.d(R.id.divider).setLayoutParams(layoutParams);
        recyclerHolder.a(R.id.item_title, child.getCityName());
        recyclerHolder.d(R.id.item_layout).setOnClickListener(new View.OnClickListener() { // from class: jma
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(i2, i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, int i2, View view) {
        BaseGroupDataAdapter.OnItemClickListener onItemClickListener = this.f10983b;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClickListener(i, i2);
        }
    }

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter
    public void setOnItemClickListener(BaseGroupDataAdapter.OnItemClickListener onItemClickListener) {
        this.f10983b = onItemClickListener;
    }
}
