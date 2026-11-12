package com.huawei.health.suggestion.ui.polymericpage.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.FilterOption;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.activity.PolymericMoreFilterActivity;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.hzj;
import defpackage.njy;
import defpackage.peh;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericFilterRecyclerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f9832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FilterCondition> f9833c;
    private HealthRecycleView d;
    private OnCourseFilterListener e;
    private PolymericFilterAdapter i;
    private List<FilterCondition> h = new ArrayList(10);
    private List<FilterCondition> j = new ArrayList(10);
    private Map<Long, List<Long>> g = new HashMap();

    public interface OnCourseFilterListener {
        void onToFilterCallBack(List<FilterCondition> list);
    }

    public PolymericFilterRecyclerHelper(Context context, LinearLayout linearLayout) {
        if (context == null || linearLayout == null) {
            LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "CourseFilterRecyclerViewHelper() context or filterView is null");
            return;
        }
        this.f9831a = context;
        this.f9832b = linearLayout;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "initView.");
        this.d = (HealthRecycleView) this.f9832b.findViewById(R.id.recycleview_filter);
        this.d.setLayoutManager(new LinearLayoutManager(this.f9831a, 0, 0 == true ? 1 : 0) { // from class: com.huawei.health.suggestion.ui.polymericpage.view.PolymericFilterRecyclerHelper.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        this.d.setIsScroll(false);
        PolymericFilterAdapter polymericFilterAdapter = new PolymericFilterAdapter(this.f9831a, new ArrayList(), new PolymericFilterAdapter.OnItemClick() { // from class: com.huawei.health.suggestion.ui.polymericpage.view.PolymericFilterRecyclerHelper.5
            @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterAdapter.OnItemClick
            public void onMoreItemClickListener(int i, List<FilterCondition> list) {
                if (qrs.c(500)) {
                    LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "initView() onClick() view click too fast.");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("MORE_FILTER_CONDITIONS", (ArrayList) list);
                bundle.putString("MORE_FILTER_SELECTED_DATA", peh.c(PolymericFilterRecyclerHelper.this.g));
                if (PolymericFilterRecyclerHelper.this.f9831a instanceof Activity) {
                    Activity activity = (Activity) PolymericFilterRecyclerHelper.this.f9831a;
                    Intent intent = new Intent(PolymericFilterRecyclerHelper.this.f9831a, (Class<?>) PolymericMoreFilterActivity.class);
                    intent.putExtra("RESULT_KEY_SELECTED_DATA", bundle);
                    activity.startActivityForResult(intent, 123);
                }
            }

            @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterAdapter.OnItemClick
            public void onSpinnerOptionSelectedListener(FilterCondition filterCondition) {
                LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "onSpinnerOptionSelectedListener.");
                PolymericFilterRecyclerHelper.this.d(filterCondition);
                PolymericFilterRecyclerHelper.this.e.onToFilterCallBack(PolymericFilterRecyclerHelper.this.h);
            }
        });
        this.i = polymericFilterAdapter;
        this.d.setAdapter(polymericFilterAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FilterCondition filterCondition) {
        Iterator<FilterCondition> it = this.h.iterator();
        this.j.remove(filterCondition);
        while (it.hasNext()) {
            FilterCondition next = it.next();
            if (next.getValue() == filterCondition.getValue()) {
                LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "remove ", next.getName(), Long.valueOf(next.getValue()));
                it.remove();
            }
        }
        if (filterCondition.getFilterOptions() != null && njy.b(filterCondition.getFilterOptions())) {
            LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "add ", filterCondition.getName(), Long.valueOf(filterCondition.getValue()));
            this.h.add(filterCondition);
            this.j.add(filterCondition);
            return;
        }
        LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "not add ", filterCondition.getName(), Long.valueOf(filterCondition.getValue()));
    }

    public void a(List<FilterCondition> list, String str) {
        int i;
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "setFilterData() filterConditions or categoryName is null");
            this.i.d();
            this.i.notifyDataSetChanged();
            return;
        }
        this.h.clear();
        this.g.clear();
        this.j.clear();
        this.f9833c = list;
        ArrayList arrayList = new ArrayList(10);
        if (list.size() <= 3) {
            for (FilterCondition filterCondition : list) {
                hzj hzjVar = new hzj();
                hzjVar.b(filterCondition);
                hzjVar.e(0);
                hzjVar.b(filterCondition.getName());
                arrayList.add(hzjVar);
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    break;
                }
                hzj hzjVar2 = new hzj();
                hzjVar2.b(list.get(i2));
                hzjVar2.e(0);
                hzjVar2.b(list.get(i2).getName());
                arrayList.add(hzjVar2);
                i2++;
            }
            ArrayList arrayList2 = new ArrayList(10);
            for (i = 2; i < list.size(); i++) {
                arrayList2.add(list.get(i));
            }
            hzj hzjVar3 = new hzj();
            hzjVar3.a(arrayList2);
            hzjVar3.e(1);
            hzjVar3.b(this.f9831a.getString(R.string.IDS_user_profile_more));
            arrayList.add(hzjVar3);
        }
        this.i.d();
        this.i.a(arrayList);
    }

    public void d(Map<Long, List<Long>> map) {
        if (map == null) {
            LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "setMoreFilterConditionSelected() selectedIdMap is null");
            return;
        }
        this.h.clear();
        this.h.addAll(this.j);
        this.g = map;
        for (int i = 2; i < this.f9833c.size(); i++) {
            FilterCondition filterCondition = this.f9833c.get(i);
            List<FilterOption> filterOptions = filterCondition.getFilterOptions();
            List<Long> list = this.g.get(Long.valueOf(filterCondition.getValue()));
            if (!njy.e(list) && !njy.e(filterOptions)) {
                a(filterCondition, filterOptions, list);
            }
        }
        LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "setMoreFilterConditionSelected.");
        this.e.onToFilterCallBack(this.h);
    }

    private void a(FilterCondition filterCondition, List<FilterOption> list, List<Long> list2) {
        ArrayList arrayList = new ArrayList(10);
        for (FilterOption filterOption : list) {
            if (list2.contains(Long.valueOf(filterOption.getValue()))) {
                arrayList.add(filterOption);
            }
        }
        if (njy.b(arrayList)) {
            this.h.add(new FilterCondition.Builder().name(filterCondition.getName()).value(filterCondition.getValue()).type(filterCondition.getType()).categoryId(filterCondition.getCategoryId()).filterOptions(arrayList).build());
        }
    }

    public void c(List<FilterCondition> list) {
        if (list == null) {
            LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "setDefaultSelectedFilter() index < 0 or filterConditions is null");
            return;
        }
        this.h.clear();
        this.g.clear();
        this.h.addAll(list);
        for (FilterCondition filterCondition : this.h) {
            if (!njy.e(filterCondition.getFilterOptions())) {
                ArrayList arrayList = new ArrayList();
                for (FilterOption filterOption : filterCondition.getFilterOptions()) {
                    if (filterOption != null) {
                        arrayList.add(Long.valueOf(filterOption.getValue()));
                    }
                }
                this.g.put(Long.valueOf(filterCondition.getValue()), arrayList);
            }
        }
        LogUtil.a("Suggestion_AggregateFilterRecyclerHelper", "setDefaultSelectedFilter.");
    }

    public void a(OnCourseFilterListener onCourseFilterListener) {
        if (onCourseFilterListener == null) {
            LogUtil.j("Suggestion_AggregateFilterRecyclerHelper", "setOnFilterViewListener() listener is null");
        } else {
            this.e = onCourseFilterListener;
        }
    }
}
