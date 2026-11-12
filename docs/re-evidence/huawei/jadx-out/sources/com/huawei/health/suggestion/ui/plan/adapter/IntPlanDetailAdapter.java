package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanH5ViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntAiDialogViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntPlanListViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanResourceSlotViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.SmartTrainPlanResourceViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.hqr;
import defpackage.ibk;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class IntPlanDetailAdapter extends RecyclerView.Adapter<AbsFitnessViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AiPlanWeekDetailViewHolder f9628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FragmentManager f9629c;
    private SparseArray<ibk> d = new SparseArray<>();
    private AiPlanH5ViewHolder e;
    private IntCurrentPlanViewHolder f;
    private LayoutInflater g;
    private hqr h;
    private final HealthRecycleView j;

    public IntPlanDetailAdapter(Context context, FragmentManager fragmentManager, HealthRecycleView healthRecycleView) {
        this.f9627a = context;
        this.g = LayoutInflater.from(context);
        this.f9629c = fragmentManager;
        this.j = healthRecycleView;
    }

    public IntPlanDetailAdapter(Context context, FragmentManager fragmentManager, HealthRecycleView healthRecycleView, hqr hqrVar) {
        this.f9627a = context;
        this.g = LayoutInflater.from(context);
        this.f9629c = fragmentManager;
        this.j = healthRecycleView;
        this.h = hqrVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(AbsFitnessViewHolder absFitnessViewHolder) {
        super.onViewAttachedToWindow(absFitnessViewHolder);
        if (absFitnessViewHolder instanceof AiPlanWeekDetailViewHolder) {
            ((AiPlanWeekDetailViewHolder) absFitnessViewHolder).g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbsFitnessViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new IntAiDialogViewHolder(this.g.inflate(R.layout.sug_layout_intplan_assistant_dialog, viewGroup, false));
            case 1:
                IntCurrentPlanViewHolder intCurrentPlanViewHolder = new IntCurrentPlanViewHolder(this.g.inflate(R.layout.sug_layout_intplan_progress, viewGroup, false), 0);
                this.f = intCurrentPlanViewHolder;
                return intCurrentPlanViewHolder;
            case 2:
                return new IntPlanWeekDetailViewHolder(this.g.inflate(R.layout.sug_layout_intplan_week_detail, viewGroup, false));
            case 3:
                return new IntPlanListViewHolder(this.g.inflate(R.layout.sug_layout_intplan_recommend_list_item, viewGroup, false), "plan");
            case 4:
                AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = new AiPlanWeekDetailViewHolder(this.g.inflate(R.layout.sug_layout_intplan_week_detail, viewGroup, false), this.f9629c, this.j, this.h);
                this.f9628b = aiPlanWeekDetailViewHolder;
                return aiPlanWeekDetailViewHolder;
            case 5:
                return new PlanResourceSlotViewHolder(this.g.inflate(R.layout.plan_resouce_slot, viewGroup, false));
            case 6:
            default:
                return null;
            case 7:
                return new AbsFitnessViewHolder(new View(this.f9627a)) { // from class: com.huawei.health.suggestion.ui.plan.adapter.IntPlanDetailAdapter.1
                    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
                    public void init(Object obj) {
                    }
                };
            case 8:
                AiPlanH5ViewHolder aiPlanH5ViewHolder = new AiPlanH5ViewHolder(this.g.inflate(R.layout.sug_layout_intplan_h5, viewGroup, false));
                this.e = aiPlanH5ViewHolder;
                return aiPlanH5ViewHolder;
            case 9:
                return new SmartTrainPlanResourceViewHolder(this.g.inflate(R.layout.sug_layout_intplan_recommend_list_item, viewGroup, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbsFitnessViewHolder absFitnessViewHolder, int i) {
        LogUtil.a("Suggestion_PlanDetailAdapter", "onBindViewHolder position ", Integer.valueOf(i), " holder ", absFitnessViewHolder);
        if (this.d.size() == 0) {
            LogUtil.a("Suggestion_PlanDetailAdapter", "onBindViewHolder sparseArray size is 0");
            return;
        }
        ibk ibkVarValueAt = this.d.valueAt(i);
        LogUtil.a("Suggestion_PlanDetailAdapter", "onBindViewHolder recycleItemData ", ibkVarValueAt);
        if (ibkVarValueAt == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "onBindViewHolder recycleItemData is null");
            return;
        }
        if (absFitnessViewHolder instanceof IntPlanListViewHolder) {
            IntPlanListViewHolder intPlanListViewHolder = (IntPlanListViewHolder) absFitnessViewHolder;
            intPlanListViewHolder.b(ibkVarValueAt.a() == 10);
            intPlanListViewHolder.d(ibkVarValueAt.a() == 11);
        }
        absFitnessViewHolder.init(ibkVarValueAt.c());
    }

    public void b(String str) {
        AiPlanH5ViewHolder aiPlanH5ViewHolder = this.e;
        if (aiPlanH5ViewHolder == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "refreshH5WebView mAiPlanH5ViewHolder is null sourceTag ", str);
        } else {
            aiPlanH5ViewHolder.a(str);
        }
    }

    public void d(ibk ibkVar) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "notifyNewItem itemData is NULL");
            return;
        }
        LogUtil.a("Suggestion_PlanDetailAdapter", "notifyNewItem itemData enter type:", Integer.valueOf(ibkVar.b()));
        int iA = ibkVar.a();
        if (iA == -1) {
            LogUtil.a("Suggestion_PlanDetailAdapter", "notifyNewItem valid value itemData=", Integer.valueOf(ibkVar.b()));
            b(ibkVar);
            return;
        }
        int iIndexOfKey = this.d.indexOfKey(iA);
        if (iIndexOfKey < 0) {
            LogUtil.a("Suggestion_PlanDetailAdapter", "mDataArray not contains viewId:", Integer.valueOf(iA));
            a(ibkVar);
            if (ibkVar.b() != 4 || this.f9628b == null) {
                return;
            }
            LogUtil.j("Suggestion_PlanDetailAdapter", "add AiPlanWeekDetailViewHolder");
            this.f9628b.a();
            return;
        }
        e(ibkVar, iIndexOfKey);
    }

    public void e(ibk ibkVar) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "notifyDeleteItem itemData is NULL");
            return;
        }
        LogUtil.a("Suggestion_PlanDetailAdapter", "notifyDeleteItem itemData enter type:", Integer.valueOf(ibkVar.b()));
        int iA = ibkVar.a();
        if (iA == -1) {
            LogUtil.a("Suggestion_PlanDetailAdapter", "notifyDeleteItem valid value itemData=", Integer.valueOf(ibkVar.b()));
            c(ibkVar);
            if (ibkVar.b() == 4 && this.f9628b != null) {
                LogUtil.j("Suggestion_PlanDetailAdapter", "remove AiPlanWeekDetailViewHolder");
                this.f9628b.j();
                this.f9628b.f();
            }
            if (ibkVar.b() != 8 || PluginSuggestion.getInstance() == null || PluginSuggestion.getInstance().getH5ProWebView() == null) {
                return;
            }
            LogUtil.j("Suggestion_PlanDetailAdapter", "notifyDeleteItem remove AiPlanH5ViewHolder mRecyclerView ", this.j);
            PluginSuggestion.getInstance().getH5ProWebView().onDetachedFromWindow();
            PluginSuggestion.getInstance().setH5ProWebView(null);
            HealthRecycleView healthRecycleView = this.j;
            if (healthRecycleView != null) {
                healthRecycleView.removeAllViews();
                this.j.getRecycledViewPool().clear();
                return;
            }
            return;
        }
        int iIndexOfKey = this.d.indexOfKey(iA);
        if (iIndexOfKey >= 0) {
            c(ibkVar, iIndexOfKey);
        }
    }

    private void a(ibk ibkVar) {
        int iA = ibkVar.a();
        this.d.append(iA, ibkVar);
        notifyItemInserted(this.d.indexOfKey(iA));
    }

    private void b(ibk ibkVar) {
        for (int i = 0; i < this.d.size(); i++) {
            ibk ibkVarValueAt = this.d.valueAt(i);
            if (ibkVarValueAt == null) {
                LogUtil.j("Suggestion_PlanDetailAdapter", "sourceData is null");
            } else if (ibkVarValueAt.b() == ibkVar.b()) {
                ibkVarValueAt.a(ibkVar.c());
                notifyItemChanged(i);
            }
        }
    }

    public void c() {
        IntCurrentPlanViewHolder intCurrentPlanViewHolder = this.f;
        if (intCurrentPlanViewHolder == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "updateCurrentPlan mIntCurrentPlanViewHolder is null");
        } else {
            intCurrentPlanViewHolder.a();
        }
    }

    private void c(ibk ibkVar) {
        LogUtil.a("Suggestion_PlanDetailAdapter", "deleteItemByViewType ", Integer.valueOf(ibkVar.b()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.d.size(); i++) {
            ibk ibkVarValueAt = this.d.valueAt(i);
            if (ibkVarValueAt == null) {
                LogUtil.j("Suggestion_PlanDetailAdapter", "sourceData is null");
            } else if (ibkVarValueAt.b() == ibkVar.b()) {
                arrayList.add(Integer.valueOf(this.d.keyAt(i)));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.remove(((Integer) it.next()).intValue());
        }
        notifyDataSetChanged();
    }

    private void e(ibk ibkVar, int i) {
        if (ibkVar.c() == null || i < 0) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "updateSingleItem itemData is NULL or data is NULL");
        } else {
            this.d.valueAt(i).a(ibkVar.c());
            notifyItemChanged(i);
        }
    }

    private void c(ibk ibkVar, int i) {
        if (ibkVar == null || i < 0) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "deleteSingleItem itemData is NULL or data is NULL");
        } else {
            this.d.removeAt(i);
            notifyItemRemoved(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.d.valueAt(i) == null) {
            return super.getItemId(i);
        }
        return this.d.valueAt(i).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ibk ibkVarValueAt = this.d.valueAt(i);
        if (ibkVarValueAt == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "getItemViewType null position:", Integer.valueOf(i));
            return -1;
        }
        return ibkVarValueAt.b();
    }

    public View d() {
        IntCurrentPlanViewHolder intCurrentPlanViewHolder = this.f;
        if (intCurrentPlanViewHolder == null) {
            LogUtil.j("Suggestion_PlanDetailAdapter", "getReportRedDotView mIntCurrentPlanViewHolder == null");
            return null;
        }
        return intCurrentPlanViewHolder.d();
    }
}
