package com.huawei.health.knit.section.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fcn;
import defpackage.fqc;
import defpackage.fya;
import defpackage.njy;
import defpackage.qsp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSimpleRecordAdapter extends RecyclerView.Adapter<SectionSimpleRecordHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7448a;
    private Set<String> d = new HashSet();
    private List<View.OnClickListener> f;
    private int g;
    private List<String> h;
    private static final String e = BaseApplication.b().getString(R.string.IDS_hw_personal_cetenr_help_customer_service);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7446b = BaseApplication.b().getString(R.string.IDS_vip_redeem_membership_code);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7447c = BaseApplication.b().getString(R.string.IDS_vip_auto_renew_management);

    public SectionSimpleRecordAdapter(int i) {
        this.g = i;
    }

    public void d(fqc fqcVar) {
        if (fqcVar != null) {
            this.h = fqcVar.b();
            this.f = fqcVar.e();
            this.f7448a = fqcVar.a();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SectionSimpleRecordHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionSimpleRecordHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_simple_record_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionSimpleRecordHolder sectionSimpleRecordHolder, int i) {
        LogUtil.a("SectionSimpleRecordAdapter", "SectionSimpleRecordAdapter onBindViewHolder");
        if (njy.c(this.h, i) && sectionSimpleRecordHolder.j != null) {
            sectionSimpleRecordHolder.j.setText(this.h.get(i));
        }
        if (njy.c(this.f, i) && sectionSimpleRecordHolder.g != null) {
            sectionSimpleRecordHolder.g.setOnClickListener(this.f.get(i));
        }
        qsp.a(sectionSimpleRecordHolder.e, fya.c());
        if (i == this.h.size() - 1) {
            sectionSimpleRecordHolder.f7450b.setVisibility(8);
            sectionSimpleRecordHolder.d.setVisibility(0);
        }
        c(sectionSimpleRecordHolder, i);
    }

    private void c(SectionSimpleRecordHolder sectionSimpleRecordHolder, int i) {
        if (njy.e(this.h, i)) {
            return;
        }
        sectionSimpleRecordHolder.f7449a = this.h.get(i);
        ViewTreeVisibilityListener.c(sectionSimpleRecordHolder.itemView, new ViewTreeVisibilityListener(sectionSimpleRecordHolder.itemView, sectionSimpleRecordHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.h.size();
    }

    public class SectionSimpleRecordHolder extends RecyclerView.ViewHolder implements ViewTreeVisibilityListener.ViewTreeListenee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthDivider f7450b;
        private View d;
        private final ImageView e;
        private RelativeLayout g;
        private HealthTextView j;

        public SectionSimpleRecordHolder(View view) {
            super(view);
            this.j = (HealthTextView) view.findViewById(R.id.content_title);
            this.g = (RelativeLayout) view.findViewById(R.id.item_content_rl);
            this.f7450b = (HealthDivider) view.findViewById(R.id.list_content_line);
            this.d = view.findViewById(R.id.bottom_padding);
            this.e = (ImageView) view.findViewById(R.id.list_content_arrow_right);
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void checkVisibilityAndSetBiEvent() {
            String str;
            if (!ViewTreeVisibilityListener.c(this.itemView) || hasSetBiEvent() || (str = this.f7449a) == null) {
                return;
            }
            LogUtil.a("SectionSimpleRecordAdapter", "visible to user: ", str);
            biEvent();
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public boolean hasSetBiEvent() {
            return this.f7449a != null && SectionSimpleRecordAdapter.this.d.contains(this.f7449a);
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void biEvent() {
            if (TextUtils.equals(this.f7449a, SectionSimpleRecordAdapter.e)) {
                int i = SectionSimpleRecordAdapter.this.g;
                if (i == 1) {
                    fcn.p();
                } else if (i != 2) {
                    return;
                } else {
                    fcn.m();
                }
            } else if (!TextUtils.equals(this.f7449a, SectionSimpleRecordAdapter.f7446b)) {
                if (!TextUtils.equals(this.f7449a, SectionSimpleRecordAdapter.f7447c)) {
                    return;
                } else {
                    fcn.g();
                }
            } else {
                fcn.j();
            }
            SectionSimpleRecordAdapter.this.d.add(this.f7449a);
        }
    }
}
