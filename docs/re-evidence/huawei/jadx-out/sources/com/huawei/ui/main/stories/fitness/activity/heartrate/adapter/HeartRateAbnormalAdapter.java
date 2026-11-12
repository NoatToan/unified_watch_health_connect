package com.huawei.ui.main.stories.fitness.activity.heartrate.adapter;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerViewHolder;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.ued;
import defpackage.uef;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateAbnormalAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private List<ued> d = null;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_heart_rate_abnormal, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "onBindViewHolder position invalid");
            return;
        }
        ued uedVar = this.d.get(i);
        if (uedVar == null) {
            LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "onBindViewHolder monthData is null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) recyclerViewHolder.a(R.id.item_heart_rate_date);
        healthTextView.setText(DateUtils.formatDateTime(healthTextView.getContext(), uedVar.b(), 52));
        boolean zD = uedVar.d();
        a(recyclerViewHolder, zD);
        c(recyclerViewHolder, i);
        e(recyclerViewHolder, uedVar.e(), zD);
    }

    private void c(final RecyclerViewHolder recyclerViewHolder, int i) {
        final LinearLayout linearLayout = (LinearLayout) recyclerViewHolder.a(R.id.item_heart_rate_title);
        linearLayout.setTag(Integer.valueOf(i));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: uec
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49981a.a(linearLayout, recyclerViewHolder, view);
            }
        });
    }

    public /* synthetic */ void a(LinearLayout linearLayout, RecyclerViewHolder recyclerViewHolder, View view) {
        int iIntValue = ((Integer) linearLayout.getTag()).intValue();
        if (njy.e(this.d, iIntValue)) {
            LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "onBindViewHolder mItemExpanded is OutOfBounds");
            return;
        }
        ued uedVar = this.d.get(iIntValue);
        if (uedVar == null) {
            LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "onBindViewHolder setOnClickListener monthData is null");
            return;
        }
        boolean zD = uedVar.d();
        if (zD) {
            recyclerViewHolder.a(R.id.item_heart_rate_recycler).setVisibility(8);
        } else {
            e(recyclerViewHolder, uedVar.e(), true);
        }
        boolean z = !zD;
        a(recyclerViewHolder, z);
        uedVar.e(z);
    }

    private void e(RecyclerViewHolder recyclerViewHolder, List<uef> list, boolean z) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) recyclerViewHolder.a(R.id.item_heart_rate_recycler);
        healthRecycleView.setVisibility(z ? 0 : 8);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(healthRecycleView.getContext()));
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setIsConsumption(true);
        HeartRateSubItemAdapter heartRateSubItemAdapter = new HeartRateSubItemAdapter();
        heartRateSubItemAdapter.c(list);
        healthRecycleView.setAdapter(heartRateSubItemAdapter);
    }

    private void a(RecyclerViewHolder recyclerViewHolder, boolean z) {
        int i;
        ImageView imageView = (ImageView) recyclerViewHolder.a(R.id.item_heart_rate_arrow);
        if (z) {
            i = R.drawable.ic_health_list_drop_down_arrow_sel;
        } else {
            i = R.drawable.ic_health_list_drop_down_arrow_nor;
        }
        imageView.setImageResource(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ued> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void a(List<ued> list) {
        this.d = list;
        notifyDataSetChanged();
    }

    public void e(int i) {
        if (njy.c(this.d, i)) {
            this.d.get(i).e(true);
            notifyItemChanged(i);
        }
    }

    public boolean a() {
        if (njy.e(this.d)) {
            LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "getFirstSubItemCount mHistoryDataTree is null");
            return false;
        }
        ued uedVar = this.d.get(0);
        if (uedVar != null && !njy.e(uedVar.e())) {
            return uedVar.e().size() > 0;
        }
        LogUtil.j("HealthHeartRate_HeartRateAbnormalAdapter", "modelGroup is null");
        return false;
    }
}
