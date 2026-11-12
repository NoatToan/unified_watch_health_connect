package com.huawei.ui.homehealth.operationcard;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.njy;
import defpackage.qqp;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class OperationCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f25673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OperationRecycleViewAdapter f25674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GridLayoutManager f25675c;
    private HealthColumnSystem d;
    private Context e;
    private LinearLayout i;
    private HealthRecycleView j;

    OperationCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.e = context;
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.operation_rv);
        this.j = healthRecycleView;
        healthRecycleView.b(false);
        this.j.e(false);
        this.j.setFocusableInTouchMode(false);
        this.f25673a = (LinearLayout) view.findViewById(R.id.health_grid_operation_card);
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.e, 1);
        this.d = healthColumnSystem;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, Math.min(healthColumnSystem.j() / 4, 2), 1, false);
        this.f25675c = gridLayoutManager;
        this.j.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        this.j.addItemDecoration(new RecyclerItemDecoration(qqp.b(this.e), 0, arrayList));
        this.i = (LinearLayout) view.findViewById(R.id.operation_card_layout);
        BaseActivity.setViewSafeRegion(true, view.findViewById(R.id.operation_rv));
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.operation_card_sub_header);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader.setSubHeaderSafeRegion();
    }

    public void b(List<MessageObject> list, Map<Integer, ResourceResultInfo> map) {
        OperationRecycleViewAdapter operationRecycleViewAdapter = new OperationRecycleViewAdapter(this.e, list);
        this.f25674b = operationRecycleViewAdapter;
        this.j.setAdapter(operationRecycleViewAdapter);
        List<View> marketingViewList = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getMarketingViewList(this.e, map);
        if (njy.e(marketingViewList)) {
            LogUtil.a("OperationCardViewHolder", "GRID INFO VIEW IS EMPTY.");
            return;
        }
        if (this.f25673a == null) {
            LogUtil.a("OperationCardViewHolder", "mGridLayout == null.");
            return;
        }
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            this.f25673a.addView(it.next());
        }
    }

    private void a() {
        HealthColumnSystem healthColumnSystem = this.d;
        if (healthColumnSystem != null) {
            healthColumnSystem.b(this.e);
            if (this.f25675c != null) {
                int iMin = Math.min(this.d.j() / 4, 2);
                this.f25675c.setSpanCount(iMin);
                this.f25674b.c(iMin);
            }
        }
    }

    public boolean c() {
        LogUtil.a("OperationCardViewHolder", "notifyDataSetChanged start");
        a();
        if (this.f25674b != null) {
            if (this.j.getScrollState() == 0 && !this.j.isComputingLayout()) {
                try {
                    this.j.getRecycledViewPool().clear();
                    this.f25674b.notifyDataSetChanged();
                    LogUtil.a("OperationCardViewHolder", "notifyDataSetChanged succ");
                    return true;
                } catch (Exception unused) {
                    LogUtil.e("OperationCardViewHolder", "notifyDataSetChanged occurred unknown exception");
                    return false;
                }
            }
            LogUtil.e("OperationCardViewHolder", "notifyDataSetChanged ----------- fail");
        }
        return false;
    }

    public void b(int i) {
        this.i.setVisibility(i);
    }
}
