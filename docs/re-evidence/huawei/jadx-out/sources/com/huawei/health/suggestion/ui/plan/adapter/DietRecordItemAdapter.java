package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.hqo;
import defpackage.njy;
import defpackage.ped;
import defpackage.qqf;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DietRecordItemAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9622b;
    private List<hqo> d;

    public DietRecordItemAdapter(Context context, List<hqo> list) {
        this.f9622b = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f9622b).inflate(R.layout.item_diet_record_summary, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.d)) {
            LogUtil.j("Suggestion_DietRecordItemAdapter", "onBindViewHolder() data is null");
            return;
        }
        if (njy.e(this.d, i)) {
            LogUtil.j("Suggestion_DietRecordItemAdapter", "onBindViewHolder() outOfBounds position: ", Integer.valueOf(i));
            return;
        }
        hqo hqoVar = this.d.get(i);
        aVar.h.setText(hqoVar.b());
        if (hqoVar.d() >= 75.0f) {
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(8);
        }
        aVar.f9623a.setText(gzx.d(R.plurals.sug_chart_kcals, (int) hqoVar.c(), ped.f(hqoVar.c())));
        aVar.f9624b.setText(UnitUtil.e(hqoVar.e(), 1, 0));
        aVar.i.setText(hqoVar.h());
        qqf.b(aVar.f9625c, hqoVar.f(), qqf.d, 0, R.drawable.diet_record_default_food);
        if (i == this.d.size() - 1) {
            aVar.e.setVisibility(4);
        } else {
            aVar.e.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<hqo> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f9623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f9624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f9625c;
        private HealthTextView d;
        private HealthDivider e;
        private HealthTextView h;
        private HealthTextView i;

        public a(View view) {
            super(view);
            this.f9625c = (ImageView) view.findViewById(R.id.diet_record_item_icon);
            this.h = (HealthTextView) view.findViewById(R.id.diet_record_item_name);
            this.f9624b = (HealthTextView) view.findViewById(R.id.diet_record_item_count);
            this.i = (HealthTextView) view.findViewById(R.id.diet_record_item_unit);
            this.d = (HealthTextView) view.findViewById(R.id.diet_record_item_high_gi);
            this.f9623a = (HealthTextView) view.findViewById(R.id.diet_record_item_calories);
            this.e = (HealthDivider) view.findViewById(R.id.diet_record_item_divider);
        }
    }
}
