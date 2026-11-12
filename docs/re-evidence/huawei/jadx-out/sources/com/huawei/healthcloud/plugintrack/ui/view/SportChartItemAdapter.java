package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportChartItemAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f11310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CustomTrackChartTitleBar.d> f11312c = new ArrayList();

    public SportChartItemAdapter(Context context) {
        this.f11311b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f11311b).inflate(R.layout.layout_sport_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        List<CustomTrackChartTitleBar.d> list = this.f11312c;
        if (list == null || i >= list.size()) {
            eVar.d.setVisibility(4);
            return;
        }
        CustomTrackChartTitleBar.d dVar = this.f11312c.get(i);
        eVar.d.setText(dVar.d);
        a(i, eVar.d);
        if (dVar.e || (dVar.f11249a && dVar.f11251c)) {
            eVar.d.setTextColor(this.f11311b.getResources().getColor(R.color.button_title_color));
            eVar.d.setBackgroundResource(R.drawable.botton_selected_normal);
        } else if (dVar.f11249a) {
            eVar.d.setTextColor(this.f11311b.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary));
            eVar.d.setBackgroundResource(R.drawable.botton_normal_color);
        }
        if (dVar.e) {
            return;
        }
        eVar.d.setOnClickListener(new View.OnClickListener() { // from class: jsm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38974c.d(i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, View view) {
        this.f11310a.a(i, null);
    }

    private void a(int i, HealthButton healthButton) {
        float dimension;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, qrs.d(this.f11311b, 28.0f));
        if (this.f11312c.size() - 1 > i) {
            dimension = this.f11311b.getResources().getDimension(com.huawei.ui.commonui.R.dimen.elementsMarginHorizontalM);
        } else {
            dimension = this.f11311b.getResources().getDimension(com.huawei.ui.commonui.R.dimen.elementsMarginHorizontalL);
        }
        layoutParams.setMargins(0, 0, (int) dimension, (int) this.f11311b.getResources().getDimension(com.huawei.ui.commonui.R.dimen.id_fa_corner_radius_default_xs));
        healthButton.setLayoutParams(layoutParams);
        healthButton.setMinWidth(0);
        healthButton.setMinHeight(0);
        healthButton.setTextSize(0, this.f11311b.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.textSizeBody3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11312c.size() + 1;
    }

    public void d(List<CustomTrackChartTitleBar.d> list, IBaseResponseCallback iBaseResponseCallback) {
        this.f11312c = list;
        this.f11310a = iBaseResponseCallback;
        notifyDataSetChanged();
    }

    static final class e extends RecyclerView.ViewHolder {
        HealthButton d;

        public e(View view) {
            super(view);
            this.d = (HealthButton) view.findViewById(R.id.recycle_button);
        }
    }
}
