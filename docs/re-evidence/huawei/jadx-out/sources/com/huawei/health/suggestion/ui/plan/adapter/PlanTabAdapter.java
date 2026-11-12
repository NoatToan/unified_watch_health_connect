package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.MyAiPlanViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanRunViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanStatisticViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ibk;
import defpackage.qrs;

/* JADX INFO: loaded from: classes9.dex */
public class PlanTabAdapter extends RecyclerView.Adapter<AbsFitnessViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f9634b;
    private SparseArray<ibk> e = new SparseArray<>();

    public PlanTabAdapter(Context context) {
        this.f9633a = context;
        this.f9634b = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbsFitnessViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LogUtil.a("Suggestion_PlanTabAdapter", "onCreateViewHolder viewType: ", Integer.valueOf(i));
        if (i == 0) {
            return new MyAiPlanViewHolder(this.f9634b.inflate(R.layout.sug_layout_plans, viewGroup, false));
        }
        if (i != 1) {
            if (i == 2) {
                return new PlanRunViewHolder(this.f9634b.inflate(R.layout.sug_fragment_topic_list, viewGroup, false));
            }
            if (i == 3) {
                return new PlanFitnessViewHolder(this.f9634b.inflate(R.layout.sug_layout_plans, viewGroup, false));
            }
            return new PlanRunViewHolder(this.f9634b.inflate(R.layout.sug_fragment_topic_list, viewGroup, false));
        }
        AbsFitnessViewHolder absFitnessViewHolderB = b();
        if (absFitnessViewHolderB != null) {
            return absFitnessViewHolderB;
        }
        if (qrs.af(this.f9633a)) {
            i2 = R.layout.sug_fragment_ai_plan_statistic_layout;
        } else {
            i2 = R.layout.sug_fragment_ai_plan_statistic_small_layout;
        }
        return new PlanStatisticViewHolder(this.f9634b.inflate(i2, viewGroup, false));
    }

    private AbsFitnessViewHolder b() {
        SparseArray<ibk> sparseArrayClone = this.e.clone();
        if (sparseArrayClone == null || sparseArrayClone.size() <= 0) {
            LogUtil.e("Suggestion_PlanTabAdapter", "DATA ARRAY ISEMPTY");
            return new b(new View(this.f9633a));
        }
        for (int i = 0; i < sparseArrayClone.size(); i++) {
            ibk ibkVar = sparseArrayClone.get(sparseArrayClone.keyAt(i));
            if (ibkVar == null || ibkVar.c() == null) {
                LogUtil.e("Suggestion_PlanTabAdapter", "onBindViewHolder recycleItemData is null");
            } else {
                AbsFitnessViewHolder absFitnessViewHolderD = d(ibkVar);
                if (absFitnessViewHolderD != null) {
                    return absFitnessViewHolderD;
                }
            }
        }
        return null;
    }

    private AbsFitnessViewHolder d(ibk ibkVar) {
        if (1 != ibkVar.b()) {
            return null;
        }
        if (ibkVar.c() instanceof PlanStatistics) {
            PlanStatistics planStatistics = (PlanStatistics) ibkVar.c();
            if (planStatistics == null) {
                LogUtil.e("Suggestion_PlanTabAdapter", "getAbsFitnessViewHolder itemData is null");
                return new b(new View(this.f9633a));
            }
            if (planStatistics.acquireTotalPlan() == 0) {
                return new b(new View(this.f9633a));
            }
            return null;
        }
        LogUtil.e("Suggestion_PlanTabAdapter", "itemData.getItemData() =", ibkVar.c());
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbsFitnessViewHolder absFitnessViewHolder, int i) {
        LogUtil.a("Suggestion_PlanTabAdapter", "onBindViewHolder position: ", Integer.valueOf(i));
        if (this.e.size() == 0) {
            LogUtil.j("Suggestion_PlanTabAdapter", "onBindViewHolder sparseArray size is 0");
            return;
        }
        LogUtil.a("Suggestion_PlanTabAdapter", "onBindViewHolder mDataArray value: ", this.e);
        ibk ibkVarValueAt = this.e.valueAt(i);
        if (ibkVarValueAt == null) {
            LogUtil.j("Suggestion_PlanTabAdapter", "onBindViewHolder itemData is null");
            return;
        }
        LogUtil.a("Suggestion_PlanTabAdapter", "onBindViewHolder itemData value: ", ibkVarValueAt);
        if (ibkVarValueAt instanceof ibk) {
            absFitnessViewHolder.init(ibkVarValueAt.c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.e.valueAt(i).b();
    }

    public void e(int i) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ibk ibkVarValueAt = this.e.valueAt(i2);
            if (ibkVarValueAt != null && ibkVarValueAt.b() == i) {
                ibkVarValueAt.a(null);
                notifyItemChanged(i2);
            }
        }
    }

    public void e(ibk ibkVar) {
        LogUtil.a("Suggestion_PlanTabAdapter", "notifyNewItem itemData enter");
        if (ibkVar == null) {
            LogUtil.j("Suggestion_PlanTabAdapter", "notifyNewItem itemData is NULL");
            return;
        }
        int iA = ibkVar.a();
        LogUtil.a("Suggestion_PlanTabAdapter", "notifyNewItem viewId =", Integer.valueOf(iA));
        if (iA == -1) {
            LogUtil.a("Suggestion_PlanTabAdapter", "notifyNewItem Valid value itemData=", Integer.valueOf(ibkVar.b()));
            c(ibkVar);
            return;
        }
        int iIndexOfKey = this.e.indexOfKey(iA);
        if (iIndexOfKey < 0) {
            LogUtil.a("Suggestion_PlanTabAdapter", "notifyNewItem mDataArray size =", Integer.valueOf(this.e.size()), "index = ", Integer.valueOf(iIndexOfKey));
            b(ibkVar);
        } else {
            LogUtil.a("Suggestion_PlanTabAdapter", "notifyNewItem Valid value index > 0 getViewType=", Integer.valueOf(ibkVar.b()));
            e(ibkVar, iIndexOfKey);
        }
    }

    private void b(ibk ibkVar) {
        int iA = ibkVar.a();
        this.e.append(iA, ibkVar);
        int iIndexOfKey = this.e.indexOfKey(iA);
        LogUtil.a("Suggestion_PlanTabAdapter", "addNewItem at position: ", Integer.valueOf(iIndexOfKey), " viewId: ", Integer.valueOf(iA));
        notifyItemInserted(iIndexOfKey);
    }

    private void e(ibk ibkVar, int i) {
        if (ibkVar.c() == null || i < 0) {
            LogUtil.j("Suggestion_PlanTabAdapter", "updateSingleItem itemData is NULL or data is NULL");
            return;
        }
        this.e.valueAt(i).a(ibkVar.c());
        LogUtil.a("Suggestion_PlanTabAdapter", "updateSingleItem at position: ", Integer.valueOf(i), " viewId: ", Integer.valueOf(ibkVar.a()));
        notifyItemChanged(i);
    }

    private void c(ibk ibkVar) {
        for (int i = 0; i < this.e.size(); i++) {
            ibk ibkVarValueAt = this.e.valueAt(i);
            int iB = ibkVarValueAt.b();
            if (iB == ibkVar.b()) {
                ibkVarValueAt.a(ibkVar.c());
                LogUtil.a("Suggestion_PlanTabAdapter", "updateItemByViewType at position: ", Integer.valueOf(i), " viewType: ", Integer.valueOf(iB));
                notifyItemChanged(i);
            }
        }
    }

    static class b extends AbsFitnessViewHolder<PlanStatistics> {
        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void init(PlanStatistics planStatistics) {
        }

        public b(View view) {
            super(view);
        }
    }
}
