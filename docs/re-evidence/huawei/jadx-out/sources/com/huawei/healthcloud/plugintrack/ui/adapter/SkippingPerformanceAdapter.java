package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jbn;
import defpackage.njy;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingPerformanceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f10990c;
    private final List<jbn> d = new ArrayList();
    private View e;

    public SkippingPerformanceAdapter(Context context) {
        this.f10990c = context.getApplicationContext();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.e != null && i == 0) {
            return new c(this.e);
        }
        return new c(LayoutInflater.from(this.f10990c).inflate(R.layout.layout_track_skipping_performance_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            return;
        }
        if (!(viewHolder instanceof c)) {
            LogUtil.j("SkippingPerformanceAdapter", "onBindViewHolder holder is not an instance of SkippingPerformanceViewHolder");
            return;
        }
        c cVar = (c) viewHolder;
        int iB = b(cVar);
        if (iB == 0) {
            cVar.f10991a.setVisibility(8);
        } else {
            cVar.f10991a.setVisibility(0);
        }
        if (njy.e(this.d, iB)) {
            return;
        }
        cVar.d(iB);
    }

    private int b(c cVar) {
        int layoutPosition = cVar.getLayoutPosition();
        return this.e == null ? layoutPosition : layoutPosition - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e == null ? this.d.size() : this.d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.e != null && i == 0) ? 0 : 1;
    }

    public void d(View view) {
        this.e = view;
        notifyItemInserted(0);
    }

    public void a(List<jbn> list, int i) {
        this.f10989b = i;
        this.d.clear();
        this.d.addAll(list);
        LogUtil.d("SkippingPerformanceAdapter", "setUpData size = ", Integer.valueOf(this.d.size()));
        notifyDataSetChanged();
    }

    public void a() {
        this.d.clear();
    }

    class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthDivider f10991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f10992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f10993c;
        HealthTextView d;
        HealthTextView e;

        c(View view) {
            super(view);
            if (view == SkippingPerformanceAdapter.this.e) {
                return;
            }
            this.f10991a = (HealthDivider) view.findViewById(R.id.skipping_performance_divider);
            this.e = (HealthTextView) view.findViewById(R.id.skipping_performance_category);
            this.f10992b = (HealthTextView) view.findViewById(R.id.skipping_performance_score);
            this.d = (HealthTextView) view.findViewById(R.id.skipping_performance_data_unit);
            this.f10993c = (HealthTextView) view.findViewById(R.id.skipping_performance_rank_score);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:33:0x0089  */
        void d(int i) {
            byte b2;
            jbn jbnVar = (jbn) SkippingPerformanceAdapter.this.d.get(i);
            if (jbnVar == null) {
                LogUtil.a("SkippingPerformanceAdapter", "setData performanceData is null");
                return;
            }
            this.f10992b.setTextColor(SkippingPerformanceAdapter.this.f10990c.getResources().getColor(SkippingPerformanceAdapter.this.f10989b == i ? R.color.colorAccent : R.color.textColorPrimary));
            String strE = jbnVar.e();
            strE.hashCode();
            switch (strE) {
                case "enduranceTimeAbility":
                    b2 = 0;
                    break;
                case "enduranceAbility":
                    b2 = 1;
                    break;
                case "maxSkipSpeed":
                    b2 = 2;
                    break;
                case "maxSkippingTimes":
                    b2 = 3;
                    break;
                case "skipNum":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                a(jbnVar);
                return;
            }
            if (b2 == 1) {
                a(R.string.IDS_rope_performance_speed_endurance, SkippingPerformanceAdapter.this.f10990c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""), jbnVar);
                return;
            }
            if (b2 == 2) {
                a(R.string.IDS_rope_performance_speed, SkippingPerformanceAdapter.this.f10990c.getString(R.string.IDS_indoor_skipper_number_minute), jbnVar);
                return;
            }
            if (b2 == 3) {
                a(R.string.IDS_rope_performance_continuity, SkippingPerformanceAdapter.this.f10990c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""), jbnVar);
            } else if (b2 != 4) {
                LogUtil.a("SkippingPerformanceAdapter", "Unknown type!");
            } else {
                a(R.string.IDS_rope_performance_load, SkippingPerformanceAdapter.this.f10990c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""), jbnVar);
            }
        }

        void a(jbn jbnVar) {
            this.f10992b.setText(UnitUtil.e(jbnVar.d(), 1, 2));
            this.d.setText(SkippingPerformanceAdapter.this.f10990c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, 0, ""));
            this.e.setText(R.string.IDS_rope_performance_endurance);
            this.f10993c.setText(UnitUtil.e(jbnVar.b() < 0.0f ? 0.0d : jbnVar.b(), 2, 1));
        }

        void a(int i, String str, jbn jbnVar) {
            this.e.setText(i);
            this.f10992b.setText(UnitUtil.e(jbnVar.d(), 1, 0));
            this.d.setText(str);
            this.f10993c.setText(UnitUtil.e(jbnVar.b() < 0.0f ? 0.0d : jbnVar.b(), 2, 1));
        }
    }
}
