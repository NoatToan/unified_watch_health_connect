package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.ddi;
import defpackage.gnf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrr;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMyCompetitionAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<gnf.e> f7392c = new ArrayList();
    private final Context d;

    public SectionMyCompetitionAdapter(Context context) {
        this.d = context;
    }

    public void b(OnClickSectionListener onClickSectionListener) {
        this.f7391b = onClickSectionListener;
    }

    public void a(List<gnf.e> list) {
        this.f7392c.clear();
        List<gnf.e> list2 = this.f7392c;
        if (njy.e(list)) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
        this.f7392c.sort(Comparator.comparingLong(new ddi()));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.d).inflate(R.layout.section_my_competition_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        final gnf.e eVar = this.f7392c.get(i);
        cVar.b(eVar);
        cVar.g.setVisibility(i < getItemCount() + (-1) ? 0 : 8);
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: fpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34386b.d(eVar, view);
            }
        });
    }

    public /* synthetic */ void d(gnf.e eVar, View view) {
        String str;
        if (this.f7391b == null || eVar == null) {
            return;
        }
        String strA = eVar.a();
        boolean z = strA != null && strA.startsWith("customRun");
        OnClickSectionListener onClickSectionListener = this.f7391b;
        if (z) {
            str = String.format("#/custom_competition_view?id=%s", eVar.e());
        } else {
            str = String.format("#/competition_view?id=%s", eVar.e());
        }
        onClickSectionListener.onClick(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f7392c)) {
            return 0;
        }
        return Math.min(this.f7392c.size(), 2);
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f7393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f7394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f7395c;
        private final View d;
        private final HealthTextView e;
        private final HealthDivider g;
        private final HealthTextView j;

        public c(View view) {
            super(view);
            this.d = view.findViewById(R.id.my_competition_item_map);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.my_competition_item_main_flag);
            this.j = healthTextView;
            this.f7393a = (HealthTextView) view.findViewById(R.id.my_competition_item_title);
            this.f7395c = (HealthTextView) view.findViewById(R.id.my_competition_item_goal);
            this.e = (HealthTextView) view.findViewById(R.id.my_competition_item_date);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.my_competition_item_distance);
            this.f7394b = healthTextView2;
            healthTextView2.setTypeface(qrr.a());
            this.g = (HealthDivider) view.findViewById(R.id.my_competition_item_divider);
            healthTextView.setBackgroundResource(LanguageUtil.ba(view.getContext()) ? R.drawable.health_my_competition_main_mark_rtl : R.drawable.health_my_competition_main_mark);
        }

        public void b(gnf.e eVar) {
            gnf.d next;
            gnf.c cVar;
            int length;
            if (eVar == null) {
                LogUtil.j("SectionMyCompetitionAdapter", "init competition groupList is empty");
                return;
            }
            this.f7393a.setText(eVar.b());
            a(eVar);
            this.j.setVisibility(eVar.f() == 1 ? 0 : 8);
            List<gnf.d> listC = eVar.c();
            if (njy.e(listC)) {
                LogUtil.j("SectionMyCompetitionAdapter", "init competition groupList is empty");
                return;
            }
            Iterator<gnf.d> it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    cVar = null;
                    break;
                } else {
                    next = it.next();
                    if (njy.b(next.e())) {
                        cVar = next.e().get(0);
                        break;
                    }
                }
            }
            if (next == null || cVar == null || TextUtils.isEmpty(next.a()) || TextUtils.isEmpty(cVar.d())) {
                LogUtil.j("SectionMyCompetitionAdapter", "init competition groupBean or objectiveInfo is empty");
                return;
            }
            double dA = CommonUtils.a(next.a());
            if (UnitUtil.f()) {
                dA = UnitUtil.e(dA, 3);
                this.d.setBackgroundResource(R.drawable.sug_my_competition_distance_mi);
            } else {
                this.d.setBackgroundResource(R.drawable.sug_my_competition_distance);
            }
            double d = dA;
            if (UnitUtil.f() && eVar.g() == 1) {
                length = 4;
            } else {
                int iIndexOf = next.a().indexOf(".");
                length = next.a().length() - (iIndexOf >= 0 ? iIndexOf + 1 : 0);
            }
            this.f7394b.setText(UnitUtil.c(d, 1, 0, length, null));
            this.f7395c.setText(qre.a(R.string.IDS_competition_goal, DateFormatUtil.e(TimeUnit.SECONDS.toMillis(CommonUtils.j(cVar.d())), lsl.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC)));
        }

        private void a(gnf.e eVar) {
            TimeZone timeZoneA = lsl.a(eVar.i());
            String strE = DateFormatUtil.e(eVar.d(), timeZoneA, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
            long rawOffset = ((long) timeZoneA.getRawOffset()) / 3600000;
            String strA = qre.a(R.string.IDS_competition_gmt_value, rawOffset >= 0 ? Marker.ANY_NON_NULL_MARKER : Constants.LINK, UnitUtil.e(Math.abs(rawOffset), 1, 0));
            SpannableString spannableString = new SpannableString(String.format("%s %s", strE, strA));
            qri.b(spannableString, strA, R.color.emui_color_tertiary);
            this.e.setText(spannableString);
        }
    }
}
