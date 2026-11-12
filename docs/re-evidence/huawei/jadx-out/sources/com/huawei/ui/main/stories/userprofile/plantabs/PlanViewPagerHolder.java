package com.huawei.ui.main.stories.userprofile.plantabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.wre;
import defpackage.wtb;
import defpackage.wtv;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class PlanViewPagerHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<wtv> f29058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HealthTextView> f29059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29060c;
    private Context d;
    private Map<Integer, List<wtv>> e;
    private HealthTextView f;
    private HealthTextView g;
    private long h;
    private HealthTextView i;
    private LayoutInflater j;
    private ImageView k;
    private ImageView l;
    private HealthTextView m;
    private LinearLayout n;
    private LinearLayout o;
    private FrameLayout p;
    private HealthTextView s;

    public PlanViewPagerHolder(View view) {
        super(view);
        this.h = 0L;
        this.f29060c = 0;
        this.f29059b = new ArrayList(10);
        Context context = BaseApplication.getContext();
        this.d = context;
        this.j = LayoutInflater.from(context);
        a();
    }

    private void a() {
        LogUtil.a("PlanViewPagerHolder", "initView");
        this.p = (FrameLayout) this.itemView.findViewById(R.id.plan_arrow_layout);
        this.l = (ImageView) this.itemView.findViewById(R.id.plan_arrow_right);
        this.n = (LinearLayout) this.itemView.findViewById(R.id.no_data_layout);
        this.i = (HealthTextView) this.itemView.findViewById(R.id.no_data_content);
        this.g = (HealthTextView) this.itemView.findViewById(R.id.no_data_goto);
        this.k = (ImageView) this.itemView.findViewById(R.id.no_data_icon);
        this.o = (LinearLayout) this.itemView.findViewById(R.id.plan_data_layout);
        this.m = (HealthTextView) this.itemView.findViewById(R.id.personal_tab_plan);
        this.s = (HealthTextView) this.itemView.findViewById(R.id.personal_tab_sport);
        this.f = (HealthTextView) this.itemView.findViewById(R.id.personal_tab_health);
        this.f29059b.add(this.m);
        this.f29059b.add(this.s);
        this.f29059b.add(this.f);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: wtu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52481c.e(view);
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: wtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52485c.c(view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: wtt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52480b.a(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        wtb.c(1, 0);
        b(0);
    }

    public /* synthetic */ void c(View view) {
        wtb.c(1, 1);
        b(1);
    }

    public /* synthetic */ void a(View view) {
        wtb.c(1, 2);
        b(2);
    }

    public void a(wre wreVar) {
        LogUtil.a("PlanViewPagerHolder", "fill");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        if (!wreVar.i()) {
            layoutParams.height = 0;
            layoutParams.width = 0;
            this.itemView.setVisibility(8);
        } else {
            this.itemView.setVisibility(0);
        }
        this.itemView.setLayoutParams(layoutParams);
        if (wreVar.g() != null) {
            this.p.setOnClickListener(wreVar.g());
        }
        if (LanguageUtil.ba(this.d)) {
            this.l.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        if (wreVar.b() instanceof Map) {
            Map<Integer, List<wtv>> map = (Map) wreVar.b();
            this.e = map;
            LogUtil.a("PlanViewPagerHolder", "mDataMaps size = ", Integer.valueOf(map.size()));
            d();
        }
    }

    private void d() {
        long jD = d(this.e, 0);
        int i = 1;
        long jD2 = d(this.e, 1);
        int i2 = 2;
        long jD3 = d(this.e, 2);
        if (jD3 < 0) {
            i2 = 0;
            jD3 = 0;
        }
        if (jD2 < jD3) {
            i = i2;
            jD2 = jD3;
        }
        if ((jD >= lsl.c(System.currentTimeMillis()) || jD < jD2) && jD2 != 0) {
            jD = jD2;
        } else {
            i = 0;
        }
        LogUtil.a("PlanViewPagerHolder", "processData pageIndex = ", Integer.valueOf(i));
        LogUtil.a("PlanViewPagerHolder", "processData mLastRecordTime = ", Long.valueOf(this.h), "lastRecordTime = ", Long.valueOf(jD));
        if (this.h != jD || jD == 0) {
            b(i);
            this.h = jD;
        } else if (!njy.c(this.f29058a, this.e.get(Integer.valueOf(this.f29060c)), false)) {
            b(this.f29060c);
        }
        wtb.c(0, this.f29060c);
    }

    private long d(Map<Integer, List<wtv>> map, int i) {
        if (!map.containsKey(Integer.valueOf(i))) {
            return 0L;
        }
        List<wtv> list = map.get(Integer.valueOf(i));
        if (!njy.b(list) || list.get(0) == null) {
            return 0L;
        }
        return list.get(0).a();
    }

    private void b(int i) {
        LogUtil.a("PlanViewPagerHolder", "showTabPager pageIndex = ", Integer.valueOf(i));
        Map<Integer, List<wtv>> map = this.e;
        if (map == null) {
            LogUtil.j("PlanViewPagerHolder", "mDataMaps is null or no data");
            return;
        }
        this.f29060c = i;
        List<wtv> list = map.get(Integer.valueOf(i));
        this.f29058a = list;
        if (njy.e(list)) {
            this.o.setVisibility(8);
            this.n.setVisibility(0);
            e(i);
        } else {
            LogUtil.a("PlanViewPagerHolder", "mDataMaps has data size = ", Integer.valueOf(this.f29058a.size()));
            this.o.removeAllViews();
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            for (int i2 = 0; i2 < this.f29058a.size(); i2++) {
                this.o.addView(e(this.f29058a, i2));
                if (i2 < this.f29058a.size() - 1) {
                    this.o.addView(e());
                }
            }
        }
        for (int i3 = 0; i3 < this.f29059b.size(); i3++) {
            HealthTextView healthTextView = this.f29059b.get(i3);
            if (i3 == i) {
                healthTextView.setTextColor(ContextCompat.getColor(this.d, R.color.textColorPrimary));
                healthTextView.setTypeface(qrr.e());
            } else {
                healthTextView.setTextColor(ContextCompat.getColor(this.d, R.color.textColorTertiary));
                healthTextView.setTypeface(qrr.g());
            }
        }
    }

    private View e(List<wtv> list, int i) {
        wtv wtvVar = list.get(i);
        View viewInflate = this.j.inflate(R.layout.personal_plan_fragment_item, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.plan_course_image);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.course_title);
        HealthDivider healthDivider = (HealthDivider) viewInflate.findViewById(R.id.course_item_divider);
        if (i == list.size() - 1) {
            healthDivider.setVisibility(8);
        } else {
            healthDivider.setVisibility(0);
        }
        if (wtvVar.c() instanceof String) {
            qqf.b(imageView, (String) wtvVar.c(), qqf.f46647a, 3, R.mipmap.pic_recommend_empty);
        } else if (wtvVar.c() instanceof Integer) {
            qqf.a(imageView, ((Integer) wtvVar.c()).intValue(), qqf.f46647a, 3, R.mipmap.pic_recommend_empty);
        } else {
            LogUtil.j("PlanViewPagerHolder", "IconPath error = ", wtvVar.c());
            qqf.a(imageView, R.mipmap.pic_recommend_empty, qqf.f46647a, 3, R.mipmap.pic_recommend_empty);
        }
        healthTextView.setText(wtvVar.g());
        b(viewInflate, wtvVar);
        if (wtvVar.d() != null) {
            viewInflate.setOnClickListener(wtvVar.d());
        }
        return viewInflate;
    }

    private void b(View view, wtv wtvVar) {
        List<String> listE = wtvVar.e();
        if (njy.e(listE)) {
            LogUtil.j("PlanViewPagerHolder", "descList is empty, return");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.plan_desc_layout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.plan_desc_difficulty_duration);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.plan_desc_trained);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.plan_desc_difficulty);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.plan_desc_duration);
        if (qrs.u() || !LanguageUtil.f(BaseApplication.getContext())) {
            linearLayout.setOrientation(1);
        }
        if (njy.c(listE, 0) && !TextUtils.isEmpty(listE.get(0))) {
            healthTextView.setText(c(listE.get(0)));
        }
        if (njy.c(listE, 1) && !TextUtils.isEmpty(listE.get(1))) {
            linearLayout2.setVisibility(0);
            healthTextView2.setText(listE.get(1));
        }
        if (njy.c(listE, 2) && !TextUtils.isEmpty(listE.get(2))) {
            linearLayout2.setVisibility(0);
            healthTextView3.setText(listE.get(2));
        }
        if (wtvVar.b() != null) {
            healthTextView.setOnClickListener(wtvVar.b());
        }
    }

    private CharSequence c(String str) {
        String string = this.d.getString(R.string.IDS_plan_run_renew_now);
        if (!str.contains(string)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(string);
        SpannableString spannableString = new SpannableString(str);
        if (iLastIndexOf == -1) {
            LogUtil.j("PlanViewPagerHolder", "splicingString not find linkName in originalStr");
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.d, R.color.colorAccent)), iLastIndexOf, string.length() + iLastIndexOf, 33);
        return spannableString;
    }

    private View e() {
        View view = new View(this.d);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, this.d.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart)));
        return view;
    }

    private void e(int i) {
        LogUtil.a("PlanViewPagerHolder", "updateNoDataLayout pageIndex = ", Integer.valueOf(i));
        if (LanguageUtil.ba(this.d)) {
            this.k.setBackground(qqz.e(this.d, R.mipmap.ic_plan_no_data));
        }
        if (i == 0) {
            this.i.setText(R.string.IDS_hwh_no_plan);
            this.g.setText(R.string.IDS_sug_start_plan);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: wto
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(view);
                }
            });
        } else if (i == 1) {
            this.i.setText(R.string.IDS_course_no_used_record);
            this.g.setText(R.string.IDS_start_use);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: wtp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(view);
                }
            });
        } else {
            if (i == 2) {
                this.i.setText(R.string.IDS_course_no_used_record);
                this.g.setText(R.string.IDS_start_use);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: wtr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f52476c.g(view);
                    }
                });
                return;
            }
            LogUtil.j("PlanViewPagerHolder", "error pageIndex ", Integer.valueOf(i));
        }
    }

    public /* synthetic */ void b(View view) {
        b();
    }

    public /* synthetic */ void d(View view) {
        i();
    }

    public /* synthetic */ void g(View view) {
        c();
    }

    private void b() {
        if (qrs.r()) {
            LogUtil.a("PlanViewPagerHolder", "onClick, isFastClick");
        } else {
            ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).launchPlanTab();
        }
    }

    private void i() {
        if (qrs.r()) {
            LogUtil.a("PlanViewPagerHolder", "onClick, isFastClick");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).e(268435456).b(this.d);
    }

    private void c() {
        if (qrs.r()) {
            LogUtil.a("PlanViewPagerHolder", "onClick, isFastClick");
        } else {
            LogUtil.a("PlanViewPagerHolder", "gotoSleepMusicCourseH5 ");
            AppRouter.e(Uri.parse("huaweischeme://healthapp/fitnesspage?skip_type=all_health&pageTypeId=7&urlType=4&pName=com.huawei.health")).e(268435456).b(this.d);
        }
    }
}
