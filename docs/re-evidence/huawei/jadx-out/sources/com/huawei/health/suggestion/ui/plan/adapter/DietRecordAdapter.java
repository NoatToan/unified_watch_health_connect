package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.hqk;
import defpackage.hqo;
import defpackage.njy;
import defpackage.ped;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DietRecordAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<hqk> f9618a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9619c;

    public DietRecordAdapter(Context context, List<hqk> list) {
        this.f9619c = context;
        this.f9618a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f9619c).inflate(R.layout.item_diet_record, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.f9618a)) {
            LogUtil.j("Suggestion_DietRecordAdapter", "onBindViewHolder() data is null");
            return;
        }
        if (njy.e(this.f9618a, i)) {
            LogUtil.j("Suggestion_DietRecordAdapter", "onBindViewHolder() outOfBounds, position = ", Integer.valueOf(i));
            return;
        }
        hqk hqkVar = this.f9618a.get(i);
        a(aVar.e, hqkVar.e());
        LogUtil.a("Suggestion_DietRecordAdapter", "mData.getTimeStamp: ", Long.valueOf(hqkVar.c()));
        if (!DateUtils.isToday(hqkVar.c())) {
            LogUtil.a("Suggestion_DietRecordAdapter", "is not today");
            aVar.d.setVisibility(8);
        } else if (hqkVar.b() < 0.0f || hqkVar.d() <= 0.0f) {
            aVar.d.setVisibility(8);
        } else {
            aVar.d.setVisibility(0);
            aVar.d.setText(this.f9619c.getResources().getString(R.string.IDS_record_recommend_calories, UnitUtil.e(Math.ceil(hqkVar.b()), 1, 0), gzx.d(R.plurals.sug_chart_kcals, (int) Math.ceil(hqkVar.d()), UnitUtil.e(Math.ceil(hqkVar.d()), 1, 0))));
        }
        aVar.f9621c.setText(gzx.d(R.plurals.sug_chart_kcals, (int) hqkVar.g(), ped.f(hqkVar.g())));
        if (!DateUtils.isToday(hqkVar.c()) || hqkVar.d() <= 0.0f || hqkVar.g() <= hqkVar.d()) {
            aVar.f9621c.setTextColor(this.f9619c.getResources().getColor(R.color.textColorSecondary));
        } else {
            aVar.f9621c.setTextColor(this.f9619c.getResources().getColor(R.color.diet_color_high_calories));
        }
        List<hqo> listA = hqkVar.a();
        if (njy.b(listA)) {
            DietRecordItemAdapter dietRecordItemAdapter = new DietRecordItemAdapter(this.f9619c, listA);
            aVar.f9620b.setLayoutManager(new LinearLayoutManager(this.f9619c));
            aVar.f9620b.setAdapter(dietRecordItemAdapter);
        }
    }

    private void a(HealthTextView healthTextView, int i) {
        if (i == 10) {
            healthTextView.setText(R.string.IDS_record_breakfast);
            return;
        }
        if (i == 11) {
            healthTextView.setText(R.string.IDS_record_add_meal_morning);
            return;
        }
        if (i == 20) {
            healthTextView.setText(R.string.IDS_record_lunch);
            return;
        }
        if (i == 21) {
            healthTextView.setText(R.string.IDS_record_add_meal_afternoon);
            return;
        }
        if (i == 30) {
            healthTextView.setText(R.string.IDS_record_dinner);
        } else if (i == 31) {
            healthTextView.setText(R.string.IDS_record_add_meal_night);
        } else {
            LogUtil.j("Suggestion_DietRecordAdapter", "displayTitle() wrong mealType: ", Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<hqk> list = this.f9618a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f9620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f9621c;
        private HealthTextView d;
        private HealthTextView e;

        public a(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.diet_record_item_title);
            this.d = (HealthTextView) view.findViewById(R.id.diet_record_item_recommend_calories);
            this.f9621c = (HealthTextView) view.findViewById(R.id.diet_record_item_total_calories);
            this.f9620b = (RecyclerView) view.findViewById(R.id.diet_record_item_recycler_view);
        }
    }
}
