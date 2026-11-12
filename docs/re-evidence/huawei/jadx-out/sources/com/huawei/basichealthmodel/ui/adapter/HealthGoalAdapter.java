package com.huawei.basichealthmodel.ui.adapter;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.can;
import defpackage.njy;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class HealthGoalAdapter extends BaseRecyclerAdapter<can> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<can> f5347c;
    private final HealthPlanListener d;

    public interface HealthPlanListener {
        void onPlanClick(can canVar);
    }

    public HealthGoalAdapter(HealthPlanListener healthPlanListener) {
        super(new ArrayList(), R.layout.item_card_goal);
        this.f5346b = -1;
        this.d = healthPlanListener;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, can canVar) {
        if (njy.e(this.f5347c, i)) {
            LogUtil.j("HL_HealthGoalAdapter", "mList is out of bounds");
            return;
        }
        if (canVar == null) {
            LogUtil.j("HL_HealthGoalAdapter", "bean is null");
            return;
        }
        recyclerHolder.a(R.id.item_plan_title, canVar.d());
        recyclerHolder.a(R.id.item_plan_description, canVar.b());
        ((HealthRadioButton) recyclerHolder.d(R.id.item_plan_radio)).setChecked(canVar.c() == 1);
        final ConstraintLayout constraintLayout = (ConstraintLayout) recyclerHolder.d(R.id.item_plan_layout);
        constraintLayout.setTag(Integer.valueOf(i));
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: caj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1392c.c(constraintLayout, view);
            }
        });
    }

    public /* synthetic */ void c(ConstraintLayout constraintLayout, View view) {
        Integer num = (Integer) constraintLayout.getTag();
        int iIntValue = num.intValue();
        ReleaseLogUtil.c("R_HL_HealthGoalAdapter", "convert pos ", num, " mLastSelectPosition ", Integer.valueOf(this.f5346b));
        if (njy.c(this.f5347c, iIntValue)) {
            can canVar = this.f5347c.get(iIntValue);
            int iC = canVar.c();
            ReleaseLogUtil.c("R_HL_HealthGoalAdapter", "convert selected ", Integer.valueOf(iC));
            if (iC == 1) {
                canVar.c(0);
            } else {
                canVar.c(1);
            }
            notifyItemChanged(iIntValue);
            int i = this.f5346b;
            if (i != -1 && i != iIntValue) {
                can canVar2 = this.f5347c.get(i);
                int iC2 = canVar.c();
                ReleaseLogUtil.c("R_HL_HealthGoalAdapter", "convert selected ", Integer.valueOf(iC2));
                if (iC2 == 1) {
                    canVar2.c(0);
                } else {
                    canVar2.c(1);
                }
                notifyItemChanged(this.f5346b);
            }
            this.f5346b = iIntValue;
            HealthPlanListener healthPlanListener = this.d;
            if (healthPlanListener != null) {
                healthPlanListener.onPlanClick(canVar);
            }
        }
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<can> list = this.f5347c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void d(List<can> list) {
        this.f5347c = list;
        refreshDataChange(list);
    }
}
