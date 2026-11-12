package com.huawei.health.suggestion.ui.polymericpage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.FilterOption;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.view.FilterFlowLayout;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericFilterMoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Long, List<Long>> f9823a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FilterCondition> f9824c;
    private Context e;

    public PolymericFilterMoreAdapter(Context context, List<FilterCondition> list, Map<Long, List<Long>> map) {
        this.e = (Context) new WeakReference(context).get();
        this.f9824c = list;
        this.f9823a = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.e).inflate(R.layout.item__course_filter_more, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<Long> arrayList;
        c cVar = (c) viewHolder;
        final FilterCondition filterCondition = this.f9824c.get(i);
        cVar.f9826a.setHeadTitleText(filterCondition.getName());
        List<FilterOption> filterOptions = filterCondition.getFilterOptions();
        if (this.f9823a.get(Long.valueOf(filterCondition.getValue())) == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = this.f9823a.get(Long.valueOf(filterCondition.getValue()));
        }
        cVar.e.setData(this.e, e(filterOptions), arrayList);
        cVar.e.setOnCheckedChangeListener(new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterMoreAdapter.4
            @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
            public void onChecked(int i2) {
                List list = (List) PolymericFilterMoreAdapter.this.f9823a.get(Long.valueOf(filterCondition.getValue()));
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Long.valueOf(i2));
                    PolymericFilterMoreAdapter.this.f9823a.put(Long.valueOf(filterCondition.getValue()), arrayList2);
                    return;
                }
                list.add(Long.valueOf(i2));
            }

            @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
            public void onCancelCheck(int i2) {
                List list = (List) PolymericFilterMoreAdapter.this.f9823a.get(Long.valueOf(filterCondition.getValue()));
                if (list != null) {
                    list.remove(Long.valueOf(i2));
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FilterCondition> list = this.f9824c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Map<Long, List<Long>> b() {
        return this.f9823a;
    }

    public void e() {
        Map<Long, List<Long>> map = this.f9823a;
        if (map == null || map.size() == 0) {
            return;
        }
        this.f9823a.clear();
    }

    private List<Attribute> e(List<FilterOption> list) {
        ArrayList arrayList = new ArrayList(10);
        for (FilterOption filterOption : list) {
            Attribute attribute = new Attribute();
            attribute.setName(filterOption.getName());
            attribute.setId(Long.toString(filterOption.getValue()));
            arrayList.add(attribute);
        }
        return arrayList;
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthSubHeader f9826a;
        FilterFlowLayout e;

        c(View view) {
            super(view);
            this.f9826a = (HealthSubHeader) view.findViewById(R.id.workout_filter_classify_title);
            this.e = (FilterFlowLayout) view.findViewById(R.id.workout_filter_classify_group);
        }
    }
}
