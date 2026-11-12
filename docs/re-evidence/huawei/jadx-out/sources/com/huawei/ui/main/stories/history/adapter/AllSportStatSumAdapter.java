package com.huawei.ui.main.stories.history.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.der;
import defpackage.njy;
import defpackage.vrf;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AllSportStatSumAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28267a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28269c;
    private OnItemClickListener f;
    private List<vrf> h;
    private String e = "Track_AllSportStatSumAdapter";
    private boolean j = LanguageUtil.l(BaseApplication.getContext());
    private double d = 60.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f28268b = 100000.0d;

    public interface OnItemClickListener {
        void onItemClick(String str, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public AllSportStatSumAdapter(Context context, List<vrf> list) {
        this.f28267a = context;
        this.h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f28267a).inflate(R.layout.item_all_sport_data_sum, viewGroup, false);
        if (i == 0 && (viewInflate.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewInflate.getLayoutParams();
            layoutParams.setMarginStart(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart));
            viewInflate.setLayoutParams(layoutParams);
        }
        return new e(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.h.size();
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.f = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        if (njy.c(this.h, i)) {
            eVar.e.setText(this.h.get(i).e());
            c(eVar, i);
            e(eVar, i);
            eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.adapter.AllSportStatSumAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AllSportStatSumAdapter.this.f != null) {
                        AllSportStatSumAdapter.this.f.onItemClick(AllSportStatSumAdapter.this.d(i), i);
                    }
                }
            });
        }
    }

    private void c(e eVar, int i) {
        double dA = this.h.get(i).a();
        if (i == 0) {
            eVar.d.setText(b(dA));
            eVar.f28273c.setText(d(dA));
        } else if (i == 1) {
            eVar.d.setText(UnitUtil.e(dA, 1, 0));
            eVar.f28273c.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, 0, ""));
        } else {
            eVar.d.setText(a(dA));
            eVar.f28273c.setText(c(dA));
        }
    }

    private void e(e eVar, int i) {
        if (this.h.get(i).c()) {
            LogUtil.a(this.e, "init color position = ", Integer.valueOf(i), ", color = ", Integer.valueOf(this.h.get(i).b()));
            this.f28269c = i;
            eVar.e.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimaryInverse));
            eVar.d.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimaryInverse));
            eVar.f28273c.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimaryInverse));
            eVar.f28271a.setCardBackgroundColor(this.f28267a.getColor(this.h.get(i).b()));
            return;
        }
        eVar.e.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimary));
        eVar.d.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimary));
        eVar.f28273c.setTextColor(ContextCompat.getColor(this.f28267a, R.color.textColorPrimary));
        eVar.f28271a.setCardBackgroundColor(this.f28267a.getColor(R.color.colorCardPanelBg));
    }

    public String d(int i) {
        if (i == 0) {
            return "Track_Duration_Sum";
        }
        if (i == 1) {
            return "Track_Count_Sum";
        }
        if (i == 2) {
            return "Track_Calorie_Sum";
        }
        return "";
    }

    public String b(double d) {
        return der.a(d / 1000.0d);
    }

    public String d(double d) {
        return der.c(d);
    }

    public String a(double d) {
        if (this.j && d / 1000.0d >= this.f28268b) {
            return UnitUtil.e(d / 1.0E7d, 1, e(d));
        }
        return UnitUtil.e(d / 1000.0d, 1, e(d));
    }

    public String c(double d) {
        if (this.j && d / 1000.0d >= this.f28268b) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_skiing_ten_thousand_kcal, "");
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_plugindameon_hw_show_sport_kcal_string, "");
    }

    private int e(double d) {
        return (!this.j || d / 1000.0d < this.f28268b) ? 0 : 2;
    }

    public void e(int i) {
        if (njy.e(this.h, this.f28269c) || njy.e(this.h, i)) {
            LogUtil.j(this.e, "mIndex or cardPosition is out of bound");
            return;
        }
        int i2 = this.f28269c;
        if (i != i2) {
            this.h.get(i2).d(false);
            this.h.get(i).d(true);
        } else {
            this.h.get(i).d(true);
        }
        notifyDataSetChanged();
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthCardView f28271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f28273c;
        private HealthTextView d;
        private HealthTextView e;

        e(View view) {
            super(view);
            this.f28271a = (HealthCardView) view.findViewById(R.id.all_sport_item_card);
            this.e = (HealthTextView) view.findViewById(R.id.card_item_string);
            this.d = (HealthTextView) view.findViewById(R.id.card_item_value);
            this.f28273c = (HealthTextView) view.findViewById(R.id.card_item_unit);
        }
    }
}
