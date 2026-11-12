package com.huawei.health.suggestion.ui.polymericpage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.FilterOption;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.utils.ScrollUtil;
import defpackage.hkj;
import defpackage.hzj;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericFilterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<hzj> f9815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnItemClick f9816c;
    private Context e;

    public interface OnItemClick {
        void onMoreItemClickListener(int i, List<FilterCondition> list);

        void onSpinnerOptionSelectedListener(FilterCondition filterCondition);
    }

    public PolymericFilterAdapter(Context context, List<hzj> list, OnItemClick onItemClick) {
        if (context == null || njy.e(list) || onItemClick == null) {
            LogUtil.j("Suggestion_AggregateFilterAdapter", "initView() onClick() view click too fast.");
        }
        this.e = context;
        this.f9815b = list;
        this.f9816c = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("Suggestion_AggregateFilterAdapter", "onCreateViewHolder.", Integer.valueOf(i));
        if (i == 0) {
            return new b(LayoutInflater.from(this.e).inflate(R.layout.item_sport_all_course_filter_spinner, viewGroup, false));
        }
        if (i == 1) {
            return new e(LayoutInflater.from(this.e).inflate(R.layout.item_sport_all_course_filter_more, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        LogUtil.a("Suggestion_AggregateFilterAdapter", "onBindViewHolder.", Integer.valueOf(viewHolder.getItemViewType()), " position:", Integer.valueOf(i));
        if (viewHolder.getItemViewType() == 0) {
            b bVar = (b) viewHolder;
            a(bVar.f9819a);
            a(bVar.f9820c, i, hkj.c(c(this.f9815b.get(i).a())));
        }
        if (viewHolder.getItemViewType() == 1) {
            e eVar = (e) viewHolder;
            a(eVar.f9822b);
            eVar.f9821a.setText(this.f9815b.get(i).b());
            eVar.f9822b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PolymericFilterAdapter.this.f9816c.onMoreItemClickListener(i, ((hzj) PolymericFilterAdapter.this.f9815b.get(i)).d());
                }
            });
        }
    }

    public void d() {
        if (this.f9815b == null) {
            this.f9815b = new ArrayList();
        }
        this.f9815b.clear();
    }

    public void a(List<hzj> list) {
        if (this.f9815b == null) {
            this.f9815b = new ArrayList();
        }
        this.f9815b.addAll(list);
        notifyDataSetChanged();
    }

    private void a(LinearLayout linearLayout) {
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        int iB = ScrollUtil.b(this.e);
        int iD = qrs.d(this.e, 85.0f);
        if (njy.e(this.f9815b)) {
            LogUtil.a("Suggestion_AggregateFilterAdapter", "mFilterDataEntities is null");
            return;
        }
        layoutParams.width = (iB - iD) / this.f9815b.size();
        LogUtil.a("Suggestion_AggregateFilterAdapter", "setItemLayoutParams:", Integer.valueOf(iB), " margin:", Integer.valueOf(iD), " width:", Integer.valueOf(layoutParams.width));
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int iE = this.f9815b.get(i).e();
        if (iE == 0) {
            return 0;
        }
        return iE == 1 ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9815b.size();
    }

    private void a(final HealthSpinner healthSpinner, final int i, String[] strArr) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.e, R.layout.fitness_recommed_spinner_com_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.hwspinner_dropdown_item);
        healthSpinner.setDropDownWidth(-2);
        healthSpinner.setDropDownHorizontalOffset(qrs.d(this.e.getApplicationContext(), 14.0f));
        healthSpinner.setDropDownVerticalOffset(-qrs.d(this.e.getApplicationContext(), 14.0f));
        healthSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        healthSpinner.setTag(false);
        healthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterAdapter.5
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                LogUtil.a("Suggestion_AggregateFilterAdapter", "onItemSelected position:", Integer.valueOf(i2), " id:", Long.valueOf(j));
                if (PolymericFilterAdapter.this.e(healthSpinner)) {
                    FilterCondition filterConditionA = ((hzj) PolymericFilterAdapter.this.f9815b.get(i)).a();
                    if (filterConditionA == null) {
                        LogUtil.e("Suggestion_AggregateFilterAdapter", "indexFilterCondition == null");
                        return;
                    }
                    FilterOption filterOption = filterConditionA.getFilterOptions().get(i2);
                    if (filterOption == null) {
                        LogUtil.e("Suggestion_AggregateFilterAdapter", "indexOption == null");
                        return;
                    }
                    String name = filterConditionA.getName();
                    int categoryId = filterConditionA.getCategoryId();
                    LogUtil.a("Suggestion_AggregateFilterAdapter", "condition:", name, " ", Integer.valueOf(categoryId), " option:", filterOption.getName(), " ", Integer.valueOf(filterOption.getCategoryId()));
                    ArrayList arrayList = new ArrayList(10);
                    if (filterOption.getCategoryId() != -1) {
                        arrayList.add(filterOption);
                    }
                    PolymericFilterAdapter.this.f9816c.onSpinnerOptionSelectedListener(new FilterCondition.Builder().name(filterConditionA.getName()).value(filterConditionA.getValue()).type(filterConditionA.getType()).categoryId(filterConditionA.getCategoryId()).filterOptions(arrayList).build());
                    return;
                }
                LogUtil.a("Suggestion_AggregateFilterAdapter", "spinner init.index:", Integer.valueOf(i), " pos:", Integer.valueOf(i2), " id:", Long.valueOf(j));
                healthSpinner.setTag(true);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                LogUtil.a("Suggestion_AggregateFilterAdapter", "onNothingSelected.");
            }
        });
    }

    private List<Attribute> c(FilterCondition filterCondition) {
        ArrayList arrayList = new ArrayList(10);
        if (filterCondition.getFilterOptions() != null) {
            for (FilterOption filterOption : filterCondition.getFilterOptions()) {
                Attribute attribute = new Attribute();
                attribute.setName(filterOption.getName());
                attribute.setId(Long.toString(filterOption.getValue()));
                arrayList.add(attribute);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(HealthSpinner healthSpinner) {
        if (healthSpinner.getTag() instanceof Boolean) {
            return ((Boolean) healthSpinner.getTag()).booleanValue();
        }
        return false;
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f9819a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthSpinner f9820c;

        b(View view) {
            super(view);
            this.f9819a = (LinearLayout) view.findViewById(R.id.sug_course_filter_spinner_item);
            this.f9820c = (HealthSpinner) view.findViewById(R.id.sug_filter_spinner);
        }
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f9821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f9822b;

        e(View view) {
            super(view);
            this.f9822b = (LinearLayout) view.findViewById(R.id.sug_course_filter_more_item);
            this.f9821a = (HealthTextView) view.findViewById(R.id.sug_fitness_more_filter);
        }
    }
}
