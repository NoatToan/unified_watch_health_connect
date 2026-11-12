package com.huawei.ui.main.stories.history.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.der;
import defpackage.jpq;
import defpackage.njy;
import defpackage.vpq;
import defpackage.vrg;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AllSportRankListAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<vpq> f28263b;
    private Context e;

    public AllSportRankListAdapter(Context context, List<vpq> list) {
        this.e = context;
        this.f28263b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_all_sport_rank_list, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<vpq> list = this.f28263b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        if (njy.e(this.f28263b, i)) {
            return;
        }
        e(cVar, i);
        h(cVar, i);
        d(cVar, i);
        a(cVar, i);
        c(cVar, i);
    }

    private void e(c cVar, int i) {
        cVar.d.setVisibility(0);
        cVar.h.setVisibility(8);
        if (i == 0) {
            cVar.d.setImageResource(R.drawable.ic_ranking_1);
            return;
        }
        if (i == 1) {
            cVar.d.setImageResource(R.drawable.ic_ranking_2);
        } else {
            if (i == 2) {
                cVar.d.setImageResource(R.drawable.ic_ranking_3);
                return;
            }
            cVar.d.setVisibility(8);
            cVar.h.setVisibility(0);
            cVar.h.setText(UnitUtil.e(i + 1, 1, 0));
        }
    }

    private void h(c cVar, int i) {
        cVar.g.setText(vrg.b(this.f28263b.get(i).b(), this.e));
    }

    private void d(c cVar, int i) {
        int i2 = this.f28262a;
        if (i2 == 0) {
            cVar.f28265b.setText(c(this.f28263b.get(i).c()));
        } else if (i2 == 1) {
            double dE = this.f28263b.get(i).e();
            cVar.f28265b.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) dE, UnitUtil.e(dE, 1, 0)));
        } else {
            cVar.f28265b.setText(b(this.f28263b.get(i).d()));
        }
    }

    private void a(c cVar, int i) {
        double dA = this.f28263b.get(i).a();
        if (dA >= 0.1d) {
            cVar.f28264a.setText(UnitUtil.e(dA, 2, 1));
            return;
        }
        cVar.f28264a.setText(HiDataFilter.DataFilterExpression.LESS_THAN + UnitUtil.e(0.1d, 2, 1));
    }

    private String c(double d) {
        return der.d(d / 1000.0d);
    }

    private String b(double d) {
        return jpq.d(d / 1000.0d);
    }

    private void c(c cVar, int i) {
        if (i == this.f28263b.size() - 1) {
            cVar.e.setVisibility(8);
        } else {
            cVar.e.setVisibility(0);
        }
    }

    public void d(int i) {
        this.f28262a = i;
        notifyDataSetChanged();
    }

    class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f28264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f28265b;
        private ImageView d;
        private HealthDivider e;
        private HealthTextView g;
        private HealthTextView h;

        public c(View view) {
            super(view);
            this.d = (ImageView) view.findViewById(R.id.rank_image);
            this.h = (HealthTextView) view.findViewById(R.id.rank_id);
            this.g = (HealthTextView) view.findViewById(R.id.rank_sport_type);
            this.f28265b = (HealthTextView) view.findViewById(R.id.rank_sport_value);
            this.f28264a = (HealthTextView) view.findViewById(R.id.rank_sport_percent);
            this.e = (HealthDivider) view.findViewById(R.id.rank_item_divider);
        }
    }
}
