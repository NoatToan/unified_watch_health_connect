package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.fsn;
import defpackage.fso;
import defpackage.fsr;
import defpackage.fss;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionExpandReportAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<fsn> f7338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7339b;
    private int d;
    private boolean e;
    private int j;
    private Set<RecyclerView.ViewHolder> g = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7340c = false;

    public SectionExpandReportAdapter(Context context, fss fssVar, int i, boolean z) {
        this.e = false;
        this.f7339b = context;
        this.d = fssVar.g();
        this.j = i;
        this.e = z;
        e(fssVar.a());
    }

    private void e(List<fsn> list) {
        if (njy.e(list) || !VersionControlUtil.isSupportSleepManagement()) {
            this.f7338a = list;
            return;
        }
        int size = list.size();
        if (this.e) {
            if (size >= this.j) {
                list = new ArrayList(list.subList(0, this.j));
            }
            this.f7338a = list;
            return;
        }
        this.f7338a = size <= this.j ? Collections.EMPTY_LIST : new ArrayList(list.subList(this.j, size));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder expandReportExtViewHolder;
        if (i == 0) {
            expandReportExtViewHolder = new ExpandReportDetailViewHolder(LayoutInflater.from(this.f7339b).inflate(R.layout.expand_report_recyclerview_item, viewGroup, false));
        } else if (i == 1) {
            if (qrs.y()) {
                expandReportExtViewHolder = new ExpandReportExtViewHolder(LayoutInflater.from(this.f7339b).inflate(R.layout.sleep_detail_item_layout_large_mode, viewGroup, false));
            } else {
                expandReportExtViewHolder = new ExpandReportExtViewHolder(LayoutInflater.from(this.f7339b).inflate(R.layout.expand_report_ext_item_layout, viewGroup, false));
            }
        } else {
            LogUtil.a("SectionExpandReportAdapter", "no match viewType");
            return null;
        }
        this.g.add(expandReportExtViewHolder);
        return expandReportExtViewHolder;
    }

    public void d(int i) {
        this.f7340c = i != 0;
        for (RecyclerView.ViewHolder viewHolder : this.g) {
            if (!(viewHolder instanceof ExpandReportDetailViewHolder)) {
                if (viewHolder instanceof ExpandReportExtViewHolder) {
                    ExpandReportExtViewHolder expandReportExtViewHolder = (ExpandReportExtViewHolder) viewHolder;
                    int layoutPosition = expandReportExtViewHolder.getLayoutPosition();
                    if (!njy.c(this.f7338a, layoutPosition)) {
                        LogUtil.e("SectionExpandReportAdapter", "err position is ", Integer.valueOf(layoutPosition));
                        qsp.c((View) expandReportExtViewHolder.e, i);
                        return;
                    } else {
                        fsn fsnVar = this.f7338a.get(layoutPosition);
                        if (fsnVar instanceof fso) {
                            qsp.c((View) expandReportExtViewHolder.e, ((fso) fsnVar).e() == -1 ? 8 : i);
                        }
                    }
                } else {
                    LogUtil.e("SectionExpandReportAdapter", "changeRightArrowVisibility failed, viewHolder = ", viewHolder);
                }
            } else {
                qsp.c((View) ((ExpandReportDetailViewHolder) viewHolder).i, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof ExpandReportDetailViewHolder) {
            a(viewHolder, i);
        } else if (viewHolder instanceof ExpandReportExtViewHolder) {
            d(viewHolder, i);
        } else {
            LogUtil.a("SectionExpandReportAdapter", "no match viewHold");
        }
    }

    private void a(RecyclerView.ViewHolder viewHolder, int i) {
        String strA;
        ExpandReportDetailViewHolder expandReportDetailViewHolder = (ExpandReportDetailViewHolder) viewHolder;
        List<fsn> list = this.f7338a;
        if (list != null && i == list.size() - 1) {
            expandReportDetailViewHolder.e.setVisibility(8);
        }
        if (!njy.c(this.f7338a, i)) {
            ReleaseLogUtil.e("R_Sleep_SectionExpandReportAdapter", "is not in Bounds:", Integer.valueOf(i));
            return;
        }
        fsr fsrVar = (fsr) this.f7338a.get(i);
        if (!fsrVar.f()) {
            ReleaseLogUtil.e("R_Sleep_SectionExpandReportAdapter", "can't visible");
            return;
        }
        String strE = fsrVar.e();
        CharSequence charSequenceA = fsrVar.a();
        String strI = fsrVar.i();
        expandReportDetailViewHolder.f7343c.setText(strE);
        expandReportDetailViewHolder.d.setText(charSequenceA);
        expandReportDetailViewHolder.d.setMovementMethod(LinkMovementMethod.getInstance());
        expandReportDetailViewHolder.g.setText(strI);
        expandReportDetailViewHolder.g.setTextColor(fsrVar.j());
        if (!TextUtils.isEmpty(fsrVar.a())) {
            strA = qre.a(R.string.accessibility_status_theme_description_join, strE, charSequenceA, strI);
        } else {
            expandReportDetailViewHolder.d.setVisibility(8);
            strA = qre.a(R.string.accessibility_status_theme_description, strE, strI);
        }
        expandReportDetailViewHolder.i.setBackgroundResource(fsrVar.h());
        qsp.c((View) expandReportDetailViewHolder.i, this.f7340c ? 8 : 0);
        LinearLayout linearLayout = expandReportDetailViewHolder.f7341a;
        LinearLayout linearLayout2 = expandReportDetailViewHolder.f7342b;
        if (linearLayout != null && linearLayout2 != null) {
            linearLayout.setOnClickListener(fsrVar.b());
            if (i == 0 && this.d == fsrVar.c() && fsrVar.d()) {
                linearLayout.setBackgroundResource(R.drawable.button_background_sleep_top_abnormal);
                expandReportDetailViewHolder.e.setVisibility(8);
                linearLayout2.setPadding(0, qqp.a(this.f7339b, 12.0f), 0, 0);
            }
        }
        lrd.d(linearLayout, strA, !this.f7340c);
    }

    private void d(RecyclerView.ViewHolder viewHolder, int i) {
        ExpandReportExtViewHolder expandReportExtViewHolder = (ExpandReportExtViewHolder) viewHolder;
        if (njy.c(this.f7338a, i)) {
            fso fsoVar = (fso) this.f7338a.get(i);
            expandReportExtViewHolder.d.setText(fsoVar.a());
            expandReportExtViewHolder.f7345b.setText(fsoVar.f());
            if (fsoVar.e() != -1) {
                expandReportExtViewHolder.e.setBackgroundResource(fsoVar.e());
                qsp.c((View) expandReportExtViewHolder.e, 0);
                qsp.c((View) expandReportExtViewHolder.e, this.f7340c ? 8 : 0);
            } else {
                qsp.c((View) expandReportExtViewHolder.e, 8);
            }
            LinearLayout linearLayout = expandReportExtViewHolder.f7344a;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(fsoVar.b());
                if (i == 0 && this.d == fsoVar.c() && fsoVar.d()) {
                    linearLayout.setBackgroundColor(BaseApplication.getContext().getResources().getColor(R.color.abnormal_data_item_background));
                }
                lrd.d(linearLayout, qre.a(R.string.IDS_settings_alarm_comma, expandReportExtViewHolder.d.getText(), expandReportExtViewHolder.f7345b.getText()), expandReportExtViewHolder.e.getVisibility() == 0);
            }
        }
        List<fsn> list = this.f7338a;
        if (list == null || i != list.size() - 1) {
            return;
        }
        expandReportExtViewHolder.f7346c.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(this.f7338a.get(i) instanceof fsr) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<fsn> list = this.f7338a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class ExpandReportDetailViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f7341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f7342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f7343c;
        private TextView d;
        private HealthDivider e;
        private TextView g;
        private ImageView i;

        public ExpandReportDetailViewHolder(View view) {
            super(view);
            this.f7341a = (LinearLayout) view.findViewById(R.id.total_sleep_layout_item);
            this.f7342b = (LinearLayout) view.findViewById(R.id.expand_report_recyclerview_1_ll);
            this.f7343c = (TextView) view.findViewById(R.id.item_left_top_text);
            this.d = (TextView) view.findViewById(R.id.item_left_bottom_text);
            this.g = (TextView) view.findViewById(R.id.item_right_text);
            this.i = (ImageView) view.findViewById(R.id.item_right_icon);
            this.e = (HealthDivider) view.findViewById(R.id.recyclerview_divider_1);
        }
    }

    public static class ExpandReportExtViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f7344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextView f7345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthDivider f7346c;
        private TextView d;
        private ImageView e;

        public ExpandReportExtViewHolder(View view) {
            super(view);
            this.f7344a = (LinearLayout) view.findViewById(R.id.expand_report_ext_item_root_view);
            this.d = (TextView) view.findViewById(R.id.expand_report_ext_item_left_text);
            this.f7345b = (TextView) view.findViewById(R.id.expand_report_ext_item_right_text);
            this.e = (ImageView) view.findViewById(R.id.expand_report_ext_item_right_image);
            this.f7346c = (HealthDivider) view.findViewById(R.id.expand_report_ext_item_divider);
        }
    }
}
