package com.huawei.health.suggestion.ui.plan.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.adapter.DietDetailsMutipleAdapter;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.hdc;
import defpackage.hvu;
import defpackage.lmf;
import defpackage.njy;
import defpackage.vgo;
import defpackage.vgu;
import defpackage.vgw;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class DietDetailsFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DietDetailsMutipleAdapter f9679b;
    private AiPlanWeekDetailViewHolder d;
    private ExpandableListView e;
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Integer> f9680c = Arrays.asList(10, 20, 30);
    private List<List<hdc>> g = new ArrayList();
    private List<String> f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f9678a = new HashMap(16);

    public static DietDetailsFragment a() {
        Bundle bundle = new Bundle();
        DietDetailsFragment dietDetailsFragment = new DietDetailsFragment();
        dietDetailsFragment.setArguments(bundle);
        return dietDetailsFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(getContext(), AnalyticsValue.INT_PLAN_2040150.value(), map, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.diet_expandable_list, viewGroup, false);
        this.e = (ExpandableListView) viewInflate.findViewById(R.id.hw_show_diet_expandable_lv);
        DietDetailsMutipleAdapter dietDetailsMutipleAdapter = new DietDetailsMutipleAdapter(getContext());
        this.f9679b = dietDetailsMutipleAdapter;
        this.e.setAdapter(dietDetailsMutipleAdapter);
        d();
        return viewInflate;
    }

    private void d() {
        Log.d("DietDetailsFragment", "addListener");
        this.e.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietDetailsFragment$$ExternalSyntheticLambda0
            @Override // android.widget.ExpandableListView.OnGroupExpandListener
            public final void onGroupExpand(int i) {
                this.d.a(i);
            }
        });
        this.e.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietDetailsFragment$$ExternalSyntheticLambda1
            @Override // android.widget.ExpandableListView.OnGroupCollapseListener
            public final void onGroupCollapse(int i) {
                this.f9681c.c(i);
            }
        });
        this.e.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietDetailsFragment$$ExternalSyntheticLambda2
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
                return this.e.e(expandableListView, view, i, j);
            }
        });
        this.e.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietDetailsFragment$$ExternalSyntheticLambda3
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                return this.d.b(expandableListView, view, i, i2, j);
            }
        });
    }

    /* synthetic */ void a(int i) {
        if (!njy.e(this.f, i) && i >= 0 && i < this.f.size()) {
            this.f9678a.put(this.f.get(i), 1);
            this.d.b(1, b(this.e, this.f9679b));
        }
    }

    /* synthetic */ void c(int i) {
        if (njy.e(this.f, i)) {
            return;
        }
        this.f9678a.put(this.f.get(i), 0);
        this.d.b(1, b(this.e, this.f9679b));
    }

    /* synthetic */ boolean e(ExpandableListView expandableListView, View view, int i, long j) {
        if (hvu.c(this.j)) {
            return true;
        }
        if (this.e.isGroupExpanded(i)) {
            return false;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_2040155.value(), map, 0);
        map.put("source", 2);
        map.put("type", Integer.valueOf(i + 1));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_2040156.value(), map, 0);
        JumpUtil.a(this.j, new String[0]);
        Log.d("DietDetailsFragment", "jumpToDietDiaryH5");
        return true;
    }

    /* synthetic */ boolean b(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        if (this.g.isEmpty()) {
            return false;
        }
        this.f9679b.d(i, i2);
        return true;
    }

    private void d(List<String> list, List<List<hdc>> list2, vgo vgoVar) {
        Log.d("DietDetailsFragment", "expand " + list2);
        this.f9678a.clear();
        if (list2.isEmpty()) {
            Log.d("DietDetailsFragment", "recommendFoods isEmpty");
            return;
        }
        b(list, vgoVar, list2);
        for (int i = 0; i < list.size(); i++) {
            LogUtil.e("DietDetailsFragment", "mExpandSecondTabMap is", this.f9678a.toString(), "heats", list.toString());
            if (this.f9678a.get(list.get(i)).intValue() == 1) {
                this.e.expandGroup(i);
            } else {
                this.e.collapseGroup(i);
            }
        }
        this.f = list;
        this.g = list2;
        this.d.b(1, b(this.e, this.f9679b));
    }

    public int b(ExpandableListView expandableListView, DietDetailsMutipleAdapter dietDetailsMutipleAdapter) {
        if (dietDetailsMutipleAdapter == null) {
            return 0;
        }
        int childrenCount = 0;
        int measuredHeight = 0;
        for (int i = 0; i < dietDetailsMutipleAdapter.getGroupCount(); i++) {
            View groupView = dietDetailsMutipleAdapter.getGroupView(i, false, null, expandableListView);
            if (groupView != null) {
                groupView.measure(0, 0);
                measuredHeight += groupView.getMeasuredHeight();
                LogUtil.a("DietDetailsFragment", "getListHeight secondTab totallist = ", Integer.valueOf(measuredHeight));
                childrenCount += dietDetailsMutipleAdapter.getChildrenCount(0) - 1;
            }
        }
        LogUtil.a("DietDetailsFragment", "getListHeight secondTab list = ", Integer.valueOf(childrenCount));
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Log.d("DietDetailsFragment", "mExpandSecondTabMap.get(heats.get(i)) " + this.f.get(i2) + "" + this.f9678a.toString());
            Integer num = this.f9678a.get(this.f.get(i2));
            if (num != null && num.intValue() == 1) {
                int childrenCount2 = childrenCount;
                int measuredHeight2 = measuredHeight;
                int i3 = 0;
                while (i3 < dietDetailsMutipleAdapter.getChildrenCount(i2)) {
                    int i4 = i3;
                    View childView = dietDetailsMutipleAdapter.getChildView(i2, i3, false, null, expandableListView);
                    if (childView != null) {
                        childView.measure(0, 0);
                        measuredHeight2 += childView.getMeasuredHeight();
                        LogUtil.a("DietDetailsFragment", "getListHeight secondTab totallist = ", Integer.valueOf(measuredHeight2));
                        childrenCount2 += dietDetailsMutipleAdapter.getChildrenCount(i2) - 1;
                    }
                    i3 = i4 + 1;
                }
                childrenCount = childrenCount2;
                measuredHeight = measuredHeight2;
            }
        }
        int dividerHeight = measuredHeight + (expandableListView.getDividerHeight() * childrenCount);
        LogUtil.a("DietDetailsFragment", "getListHeight second tab list height = ", Integer.valueOf(dividerHeight));
        LogUtil.a("DietDetailsFragment", "getListHeight secondTab final totallist = ", Integer.valueOf(dividerHeight));
        return dividerHeight;
    }

    public void b(AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder) {
        this.d = aiPlanWeekDetailViewHolder;
    }

    public void a(IntPlan intPlan, List<String> list, List<List<hdc>> list2, vgo vgoVar, String str) {
        LogUtil.e("DietDetailsFragment", "setData");
        DietDetailsMutipleAdapter dietDetailsMutipleAdapter = this.f9679b;
        if (dietDetailsMutipleAdapter == null) {
            LogUtil.c("DietDetailsFragment", "adapter not init or destroyed.");
            return;
        }
        this.j = str;
        dietDetailsMutipleAdapter.d(intPlan, list, list2, vgoVar, this.d, str);
        this.f9679b.notifyDataSetChanged();
        d(list, list2, vgoVar);
    }

    private void b(List<String> list, vgo vgoVar, List<List<hdc>> list2) {
        for (int i = 0; i < list.size(); i++) {
            LogUtil.e("DietDetailsFragment", "heatIndex", Integer.valueOf(i), " heat", list.get(i));
            ArrayList arrayList = new ArrayList();
            List<vgw> arrayList2 = new ArrayList<>();
            if (vgoVar != null) {
                arrayList2 = vgoVar.a();
            }
            List<hdc> list3 = list2.get(i);
            if (njy.e(arrayList2)) {
                LogUtil.e("DietDetailsFragment", "dietMap = null");
                this.f9678a.put(list.get(i), 1);
            } else {
                for (vgw vgwVar : arrayList2) {
                    LogUtil.e("DietDetailsFragment", " meal.getWhichMeal() " + vgwVar.i());
                    if (this.f9680c.get(i).intValue() == vgwVar.i()) {
                        Iterator<vgu> it = vgwVar.c().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().e());
                        }
                    }
                }
                Iterator<hdc> it2 = list2.get(i).iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (arrayList.contains(it2.next().c())) {
                        i2++;
                    }
                }
                LogUtil.e("DietDetailsFragment", "allRecorded " + i2);
                this.f9678a.put(list.get(i), Integer.valueOf(i2 == list3.size() ? 0 : 1));
            }
        }
    }
}
