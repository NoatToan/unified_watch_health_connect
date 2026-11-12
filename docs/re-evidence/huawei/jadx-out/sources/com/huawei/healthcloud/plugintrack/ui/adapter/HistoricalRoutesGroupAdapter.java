package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fts;
import defpackage.jbd;
import defpackage.qrk;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HistoricalRoutesGroupAdapter extends BaseRecyclerAdapter<jbd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HistoricalRoutesGroupItemAdapter f10973a;
    private HealthRecycleView d;
    private Context e;

    public HistoricalRoutesGroupAdapter(Context context, List<jbd> list, int i) {
        super(list, i);
        this.e = context;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, jbd jbdVar) {
        if (recyclerHolder == null || jbdVar == null) {
            LogUtil.j("HistoricalRoutesGroupAdapter", "convert holder or itemData is null");
            return;
        }
        String strB = qrk.b(this.e, jbdVar.a());
        if (qrk.i(jbdVar.a())) {
            strB = this.e.getResources().getString(R.string.IDS_motiontrack_show_this_year);
        }
        recyclerHolder.a(R.id.data_group_title, strB);
        e(recyclerHolder, jbdVar);
    }

    private void e(RecyclerHolder recyclerHolder, jbd jbdVar) {
        LogUtil.a("HistoricalRoutesGroupAdapter", "setHoldView item=", Integer.valueOf(jbdVar.d().size()));
        LogUtil.a("HistoricalRoutesGroupAdapter", "setHoldView itemData.getList()=", jbdVar.d());
        HealthRecycleView healthRecycleView = (HealthRecycleView) recyclerHolder.d(R.id.historical_routes_child_recycler);
        this.d = healthRecycleView;
        healthRecycleView.setAdapter(null);
        this.d.setLayoutManager(null);
        HistoricalRoutesGroupItemAdapter historicalRoutesGroupItemAdapter = new HistoricalRoutesGroupItemAdapter(this.e, jbdVar.d(), R.layout.section_popular_routes_item);
        this.f10973a = historicalRoutesGroupItemAdapter;
        this.d.setAdapter(historicalRoutesGroupItemAdapter);
        if (qrs.af(this.e)) {
            fts.d(this.e, this.d, new HealthLinearLayoutManager(this.e), false, 0);
            this.f10973a.notifyDataSetChanged();
        } else {
            this.d.setLayoutManager(new LinearLayoutManager(this.e, 1, false));
        }
    }

    public void e() {
        HealthRecycleView healthRecycleView;
        if (this.e == null || (healthRecycleView = this.d) == null || this.f10973a == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.d.setLayoutManager(null);
        this.d.setAdapter(this.f10973a);
        fts.d(this.e, this.d, new HealthLinearLayoutManager(this.e), false, 0);
        this.f10973a.notifyDataSetChanged();
    }
}
