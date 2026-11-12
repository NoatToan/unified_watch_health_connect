package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.oval.HealthOval;
import defpackage.fts;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRingChartAdapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f7426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<e> f7427b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7428c;
    private Context d;
    private d e;
    private List<String> f;
    private SectionRingChartData i;
    private List<String> j;

    public SectionRingChartAdapter(Context context, SectionRingChartData sectionRingChartData) {
        this.d = context;
        b(sectionRingChartData);
    }

    private void b(SectionRingChartData sectionRingChartData) {
        this.i = sectionRingChartData;
        this.f7426a = sectionRingChartData.c();
        this.j = sectionRingChartData.f();
        this.f = sectionRingChartData.h();
        this.f7428c = sectionRingChartData.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(this.d).inflate(R.layout.section_ring_chart_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final d dVar, final int i) {
        this.e = dVar;
        b(i);
        dVar.f7431c.post(new Runnable() { // from class: fqe
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(dVar, i);
            }
        });
    }

    public /* synthetic */ void a(d dVar, int i) {
        d(dVar);
        if (i == getItemCount() - 1) {
            d();
        }
    }

    private void b(int i) {
        if (fts.d(this.f7426a, i) && this.e.e != null) {
            this.e.e.setFillColor(this.f7426a.get(i).intValue());
        }
        if (fts.d(this.j, i) && this.e.g != null) {
            this.e.g.setText(this.j.get(i));
            if (LanguageUtil.be(this.d) || LanguageUtil.bh(this.d)) {
                this.e.g.setTextSize(2, 11.0f);
                ((LinearLayout.LayoutParams) this.e.g.getLayoutParams()).weight = 6.0f;
            }
        }
        if (fts.d(this.f, i) && this.e.h != null && this.i.g()) {
            this.e.h.setText(this.f.get(i));
            this.e.h.setVisibility(0);
        } else if (this.e.h != null) {
            this.e.h.setVisibility(8);
        }
        if (fts.d(this.f7428c, i) && this.e.f7429a != null && this.i.i()) {
            this.e.f7429a.setText(this.f7428c.get(i));
            this.e.f7429a.setVisibility(0);
        } else if (this.e.f7429a != null) {
            this.e.f7429a.setVisibility(8);
        }
    }

    private void d(d dVar) {
        int measuredWidth = dVar.e.getMeasuredWidth();
        int measureWidth = (int) dVar.g.getMeasureWidth();
        int measureWidth2 = (int) dVar.h.getMeasureWidth();
        int measureWidth3 = (int) dVar.f7429a.getMeasureWidth();
        int iD = qre.d(R.dimen.health_common_8dp);
        int measuredWidth2 = dVar.f7431c.getMeasuredWidth();
        int iD2 = measuredWidth + measureWidth + measureWidth2 + measureWidth3 + qre.d(R.dimen.health_common_50dp);
        LogUtil.a("SectionRingChartAdapter", "containerWidth=" + measuredWidth2, " totalWidth=" + iD2);
        this.f7427b.add(new e(iD2, measuredWidth2, dVar.d.getMeasuredWidth(), measureWidth2 + measureWidth3 + iD, dVar));
    }

    private void d() {
        int iMax = 0;
        int i = this.f7427b.get(0).f7434c;
        int iMax2 = 0;
        boolean z = false;
        for (e eVar : this.f7427b) {
            if (eVar.f7433b > eVar.f7434c) {
                z = true;
            }
            iMax2 = Math.max(eVar.f7432a, iMax2);
            iMax = Math.max(eVar.e, iMax);
        }
        if (iMax + iMax2 > i || z) {
            for (e eVar2 : this.f7427b) {
                eVar2.d.f7431c.setOrientation(1);
                if (eVar2.d.h != null) {
                    d(eVar2);
                }
            }
            return;
        }
        for (e eVar3 : this.f7427b) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eVar3.d.d.getLayoutParams();
            layoutParams.width = iMax2;
            eVar3.d.d.setLayoutParams(layoutParams);
        }
    }

    private void d(e eVar) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eVar.d.h.getLayoutParams();
        layoutParams.setMarginStart(qrs.d(BaseApplication.b(), 20.0f));
        eVar.d.h.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) eVar.d.d.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) eVar.d.f7430b.getLayoutParams();
        layoutParams2.width = -2;
        layoutParams3.width = -2;
        eVar.d.d.setLayoutParams(layoutParams2);
        eVar.d.f7430b.setLayoutParams(layoutParams3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7426a, this.j, this.f);
    }

    public static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f7429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f7430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f7431c;
        LinearLayout d;
        HealthOval e;
        HealthTextView g;
        HealthTextView h;

        public d(View view) {
            super(view);
            this.e = (HealthOval) view.findViewById(com.huawei.ui.commonui.R.id.ring_chart_legend_oval);
            this.g = (HealthTextView) view.findViewById(com.huawei.ui.commonui.R.id.ring_chart_legend_title);
            this.h = (HealthTextView) view.findViewById(com.huawei.ui.commonui.R.id.ring_chart_item_value);
            this.f7429a = (HealthTextView) view.findViewById(com.huawei.ui.commonui.R.id.ring_chart_item_percent);
            this.f7431c = (LinearLayout) view.findViewById(R.id.ring_chart_item_layout);
            this.d = (LinearLayout) view.findViewById(R.id.ring_chart_item_start_line);
            this.f7430b = (LinearLayout) view.findViewById(R.id.ring_chart_item_end_line);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7434c;
        d d;
        int e;

        e(int i, int i2, int i3, int i4, d dVar) {
            this.f7433b = i;
            this.f7434c = i2;
            this.d = dVar;
            this.f7432a = i3;
            this.e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        List<e> list = this.f7427b;
        if (list != null) {
            list.clear();
        }
    }
}
