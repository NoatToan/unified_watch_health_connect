package com.huawei.health.knit.section.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fqa;
import defpackage.fsp;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionListRecordAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fqa f7368a;
    private List<fsp> d;

    public SectionListRecordAdapter(fqa fqaVar) {
        LogUtil.a("SectionListRecordAdapter", "SectionListRecordAdapter");
        this.f7368a = fqaVar;
    }

    public void d(List<fsp> list) {
        LogUtil.a("SectionListRecordAdapter", "setData");
        this.d = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("SectionListRecordAdapter", "onCreateViewHolder");
        if (i == -3) {
            if (qrs.u()) {
                return new SectionRiskRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_large_01, viewGroup, false));
            }
            return new SectionRiskRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_01, viewGroup, false));
        }
        if (i == -2) {
            if (qrs.v()) {
                return new SectionOxygenRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_large_02, viewGroup, false));
            }
            return new SectionOxygenRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_02, viewGroup, false));
        }
        if (i == -1) {
            if (qrs.v()) {
                return new SectionAltitudeRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_large_03, viewGroup, false));
            }
            return new SectionAltitudeRecordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_list_record_item_03, viewGroup, false));
        }
        LogUtil.a("SectionListRecordAdapter", "fail to create viewHolder");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("SectionListRecordAdapter", "onBindViewHolder");
        List<fsp> list = this.d;
        if (list == null || list.size() == 0 || i < 0) {
            return;
        }
        fsp fspVar = this.d.get(i);
        if (viewHolder instanceof SectionRiskRecordViewHolder) {
            e((SectionRiskRecordViewHolder) viewHolder, fspVar, i);
        }
        if (viewHolder instanceof SectionOxygenRecordViewHolder) {
            c((SectionOxygenRecordViewHolder) viewHolder, fspVar, i);
        }
        if (viewHolder instanceof SectionAltitudeRecordViewHolder) {
            a((SectionAltitudeRecordViewHolder) viewHolder, fspVar, i);
        }
    }

    private void e(SectionRiskRecordViewHolder sectionRiskRecordViewHolder, fsp fspVar, final int i) {
        LogUtil.a("SectionListRecordAdapter", "setViewHolderValue_01");
        sectionRiskRecordViewHolder.k.setText(String.valueOf(this.f7368a.f()));
        sectionRiskRecordViewHolder.g.setText(String.valueOf(fspVar.f()));
        sectionRiskRecordViewHolder.f.setImageResource(this.f7368a.j().intValue());
        sectionRiskRecordViewHolder.d.setText(String.valueOf(this.f7368a.c()));
        sectionRiskRecordViewHolder.e.setBackground(fspVar.j());
        qsp.b(sectionRiskRecordViewHolder.e, String.valueOf(fspVar.h()));
        sectionRiskRecordViewHolder.f7383c.setText(fspVar.g());
        sectionRiskRecordViewHolder.f7383c.setTextColor(fspVar.i());
        sectionRiskRecordViewHolder.f7382b.setText(String.valueOf(this.f7368a.i()));
        sectionRiskRecordViewHolder.h.setText(String.valueOf(fspVar.a()));
        sectionRiskRecordViewHolder.h.setTextColor(fspVar.d());
        sectionRiskRecordViewHolder.j.setText("");
        sectionRiskRecordViewHolder.j.setTextColor(fspVar.d());
        sectionRiskRecordViewHolder.i.setText(String.valueOf(this.f7368a.g()));
        sectionRiskRecordViewHolder.m.setText(fspVar.c());
        final OnClickSectionListener onClickSectionListenerA = this.f7368a.a();
        if (sectionRiskRecordViewHolder.f7381a == null || onClickSectionListenerA == null) {
            return;
        }
        sectionRiskRecordViewHolder.f7381a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionListRecordAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSectionListenerA.onClick(i);
            }
        });
    }

    private void c(SectionOxygenRecordViewHolder sectionOxygenRecordViewHolder, fsp fspVar, final int i) {
        LogUtil.a("SectionListRecordAdapter", "setViewHolderValue_02");
        sectionOxygenRecordViewHolder.f7380c.setText(String.valueOf(this.f7368a.d()));
        sectionOxygenRecordViewHolder.f7378a.setText(String.valueOf(fspVar.b()));
        sectionOxygenRecordViewHolder.f7378a.setTextColor(fspVar.d());
        sectionOxygenRecordViewHolder.f7379b.setText(String.valueOf(fspVar.f()));
        sectionOxygenRecordViewHolder.e.setImageResource(this.f7368a.b().intValue());
        final OnClickSectionListener onClickSectionListenerA = this.f7368a.a();
        if (sectionOxygenRecordViewHolder.d == null || onClickSectionListenerA == null) {
            return;
        }
        sectionOxygenRecordViewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionListRecordAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSectionListenerA.onClick(i);
            }
        });
    }

    private void a(SectionAltitudeRecordViewHolder sectionAltitudeRecordViewHolder, fsp fspVar, final int i) {
        LogUtil.a("SectionListRecordAdapter", "setViewHolderValue_03");
        sectionAltitudeRecordViewHolder.e.setText(String.valueOf(this.f7368a.d()));
        sectionAltitudeRecordViewHolder.f7377c.setText(String.valueOf(fspVar.b()));
        sectionAltitudeRecordViewHolder.f7377c.setTextColor(fspVar.d());
        sectionAltitudeRecordViewHolder.f7375a.setText(String.valueOf(this.f7368a.e()));
        sectionAltitudeRecordViewHolder.d.setText(String.valueOf(fspVar.e()));
        sectionAltitudeRecordViewHolder.f.setText(String.valueOf(fspVar.f()));
        sectionAltitudeRecordViewHolder.g.setImageResource(this.f7368a.b().intValue());
        final OnClickSectionListener onClickSectionListenerA = this.f7368a.a();
        if (sectionAltitudeRecordViewHolder.f7376b == null || onClickSectionListenerA == null) {
            return;
        }
        sectionAltitudeRecordViewHolder.f7376b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionListRecordAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickSectionListenerA.onClick(i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        LogUtil.a("SectionListRecordAdapter", "getItemViewType");
        List<fsp> list = this.d;
        if (list == null || list.size() == 0 || i < 0) {
            LogUtil.a("SectionListRecordAdapter", "position is invalid");
            return -4;
        }
        if (this.d.get(i).n() == 0) {
            return -3;
        }
        if (this.d.get(i).n() == 1) {
            return -2;
        }
        return this.d.get(i).n() == 2 ? -1 : -4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<fsp> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class SectionRiskRecordViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RelativeLayout f7381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7383c;
        private HealthTextView d;
        private HealthTextView e;
        private ImageView f;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthTextView k;
        private HealthTextView m;

        public SectionRiskRecordViewHolder(View view) {
            super(view);
            this.k = (HealthTextView) view.findViewById(R.id.privacy_content_title);
            this.g = (HealthTextView) view.findViewById(R.id.privacy_time);
            this.f = (ImageView) view.findViewById(R.id.content_item_arrow);
            this.d = (HealthTextView) view.findViewById(R.id.privacy_highland_risk);
            this.e = (HealthTextView) view.findViewById(R.id.section_button);
            this.f7383c = (HealthTextView) view.findViewById(R.id.privacy_highland_risk_value);
            this.f7382b = (HealthTextView) view.findViewById(R.id.privacy_blood_oxygen);
            this.h = (HealthTextView) view.findViewById(R.id.privacy_blood_oxygen_value);
            this.j = (HealthTextView) view.findViewById(R.id.privacy_blood_oxygen_unit);
            this.i = (HealthTextView) view.findViewById(R.id.privacy_altitude_title);
            this.m = (HealthTextView) view.findViewById(R.id.privacy_altitude_value);
            this.f7381a = (RelativeLayout) view.findViewById(R.id.privacy_item_content_rl);
        }
    }

    public static class SectionOxygenRecordViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7380c;
        private LinearLayout d;
        private ImageView e;

        public SectionOxygenRecordViewHolder(View view) {
            super(view);
            this.f7380c = (HealthTextView) view.findViewById(R.id.oxygen_history_item_instructions);
            this.f7378a = (HealthTextView) view.findViewById(R.id.oxygen_history_item_percent);
            this.f7379b = (HealthTextView) view.findViewById(R.id.oxygen_right_time);
            this.e = (ImageView) view.findViewById(R.id.oxygen_right_icon);
            this.d = (LinearLayout) view.findViewById(R.id.oxygen_history_root_layout);
            SectionListRecordAdapter.a(this.f7380c, 14);
        }
    }

    public static class SectionAltitudeRecordViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f7376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7377c;
        private HealthTextView d;
        private HealthTextView e;
        private HealthTextView f;
        private ImageView g;

        public SectionAltitudeRecordViewHolder(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_item_instructions);
            this.f7377c = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_item_percent);
            this.f7375a = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_altitude);
            this.d = (HealthTextView) view.findViewById(R.id.blood_oxygen_history_height);
            this.f = (HealthTextView) view.findViewById(R.id.right_oxygen_time);
            this.g = (ImageView) view.findViewById(R.id.right_oxygen_icon);
            this.f7376b = (LinearLayout) view.findViewById(R.id.blood_oxygen_history_root_layout);
            SectionListRecordAdapter.a(this.e, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(TextView textView, int i) {
        if (LanguageUtil.c(BaseApplication.b()) && CommonUtil.bc()) {
            textView.setTextSize(2, i);
        }
    }
}
