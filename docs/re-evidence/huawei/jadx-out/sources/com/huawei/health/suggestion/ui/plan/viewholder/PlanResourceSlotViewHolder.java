package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import defpackage.fxl;

/* JADX INFO: loaded from: classes9.dex */
public class PlanResourceSlotViewHolder extends AbsFitnessViewHolder<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f9775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9776b;
    private Integer e;

    public PlanResourceSlotViewHolder(View view) {
        super(view);
        this.e = -1;
        this.f9776b = view.getContext();
        this.f9775a = (LinearLayout) view.findViewById(R.id.plan_resource_slot);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = iIntValue > 0 ? iIntValue : -iIntValue;
            if ((iIntValue >= 0 || i != this.e.intValue()) && this.e.equals(Integer.valueOf(i))) {
                return;
            }
            this.f9775a.removeAllViews();
            fxl.e(this.f9776b, this.f9775a, i);
            this.e = Integer.valueOf(i);
        }
    }
}
