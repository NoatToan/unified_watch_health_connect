package com.huawei.health.knit.section.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpz;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionListAdapter extends RecyclerView.Adapter<SectionListHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickSectionListener f7362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7364c;
    private List<Drawable> d;
    private List<Integer> e;
    private List<String> h;
    private List<Integer> j;

    public void c(fpz fpzVar) {
        if (fpzVar != null) {
            this.d = fpzVar.e();
            this.f7363b = fpzVar.c();
            this.f7364c = fpzVar.a();
            this.e = fpzVar.b();
            this.h = fpzVar.h();
            this.j = fpzVar.j();
            this.f7362a = fpzVar.d();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SectionListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("SectionListAdapter", "SectionListAdapter onCreateViewHolder");
        if (qrs.ac()) {
            return new SectionListHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_line_record_layout_item_large, viewGroup, false));
        }
        return new SectionListHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_line_record_layout_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionListHolder sectionListHolder, final int i) {
        LogUtil.a("SectionListAdapter", "SectionListAdapter onBindViewHolder");
        List<Drawable> list = this.d;
        if (list != null && i < list.size()) {
            if (LanguageUtil.ba(BaseApplication.b())) {
                qsp.a(sectionListHolder.f7366b, qqz.e(BaseApplication.b(), this.d.get(i)));
            } else {
                qsp.a(sectionListHolder.f7366b, this.d.get(i));
            }
        }
        if (a(this.f7363b, i)) {
            sectionListHolder.f7367c.setText(String.valueOf(this.f7363b.get(i)));
        }
        if (a(this.f7364c, i)) {
            sectionListHolder.f7365a.setText(String.valueOf(this.f7364c.get(i)));
        }
        List<Integer> list2 = this.e;
        if (list2 != null && i < list2.size()) {
            sectionListHolder.f7365a.setTextColor(this.e.get(i).intValue());
        }
        if (a(this.h, i)) {
            sectionListHolder.g.setText(String.valueOf(this.h.get(i)));
        }
        List<Integer> list3 = this.j;
        if (list3 != null && i < list3.size()) {
            sectionListHolder.i.setImageResource(this.j.get(i).intValue());
        }
        if (i != getItemCount() - 1 || sectionListHolder.d == null) {
            sectionListHolder.d.setVisibility(0);
        } else {
            sectionListHolder.d.setVisibility(8);
        }
        if (qrs.y()) {
            sectionListHolder.f7367c.setTextSize(1, 16.0f);
            sectionListHolder.f7365a.setTextSize(1, 16.0f);
        }
        if (qrs.a(2.1f)) {
            sectionListHolder.f7365a.setTextSize(1, 15.0f);
        }
        if (sectionListHolder.e == null || this.f7362a == null) {
            return;
        }
        sectionListHolder.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SectionListAdapter.this.f7362a.onClick(i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Drawable> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private boolean a(List list, int i) {
        return list != null && i < list.size();
    }

    public static class SectionListHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f7366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7367c;
        private HealthDivider d;
        private LinearLayout e;
        private HealthTextView g;
        private ImageView i;

        public SectionListHolder(View view) {
            super(view);
            this.f7366b = (ImageView) view.findViewById(R.id.left_image);
            this.f7367c = (HealthTextView) view.findViewById(R.id.left_top_value);
            this.f7365a = (HealthTextView) view.findViewById(R.id.left_top_state);
            this.g = (HealthTextView) view.findViewById(R.id.right_time);
            this.i = (ImageView) view.findViewById(R.id.right_icon);
            this.d = (HealthDivider) view.findViewById(R.id.section_divider);
            this.e = (LinearLayout) view.findViewById(R.id.abnormal_blood_pressure_recyclerview_item_ll);
        }
    }
}
