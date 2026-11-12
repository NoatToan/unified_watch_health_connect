package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.adapter.FitnessCourseHorizontalAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.btx;
import defpackage.njy;
import defpackage.pcs;
import defpackage.qqf;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CourseDetailViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f9443a;
    private HealthSubHeader aa;
    private HealthTextView ac;
    private HealthSubHeader ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f9444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9445c;
    private HealthRecycleView d;
    private HealthSubHeader e;
    private LinearLayout f;
    private FitnessCourseHorizontalAdapter g = new FitnessCourseHorizontalAdapter();
    private LinearLayout h;
    private ImageView i;
    private HealthSubHeader j;
    private LinearLayout k;
    private LinearLayout l;
    private LinearLayout m;
    private LinearLayout n;
    private LinearLayout o;
    private HealthTextView p;
    private View q;
    private LinearLayout r;
    private LinearLayout s;
    private HealthSubHeader t;
    private HealthTextView u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;

    public CourseDetailViewHolder(Context context) {
        context = context == null ? BaseApplication.b() : context;
        this.f9445c = context;
        this.q = LayoutInflater.from(context).inflate(R.layout.sug_fitness_activity_detail_info, (ViewGroup) null);
        d();
    }

    private void d() {
        this.s = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_re_course_layout);
        this.r = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout0);
        this.k = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout1);
        this.n = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout2);
        this.l = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout3);
        this.f = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout4);
        this.h = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout5);
        this.m = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout6);
        LinearLayout linearLayout = (LinearLayout) this.q.findViewById(R.id.sug_detail_info_layout_course_partner);
        this.o = linearLayout;
        BaseActivity.setViewSafeRegion(false, this.r, this.k, this.n, this.l, this.f, this.h, this.m, linearLayout, this.q.findViewById(R.id.sug_detail_info_course_header));
        this.e = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_course_desc_title);
        this.j = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_course_type_title);
        this.aa = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_train_equipment_title);
        this.ad = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_train_advice_title);
        this.t = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_suit_people_title);
        this.f9444b = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_ban_people_title);
        this.f9443a = (HealthSubHeader) this.q.findViewById(R.id.sug_detail_info_attention_title);
        this.i = (ImageView) this.q.findViewById(R.id.sug_iv_coach_intro_course_partner_img);
        this.e.setPaddingStartEnd(0.0f, 0.0f);
        this.j.setPaddingStartEnd(0.0f, 0.0f);
        this.aa.setPaddingStartEnd(0.0f, 0.0f);
        this.ad.setPaddingStartEnd(0.0f, 0.0f);
        this.t.setPaddingStartEnd(0.0f, 0.0f);
        this.f9444b.setPaddingStartEnd(0.0f, 0.0f);
        this.f9443a.setPaddingStartEnd(0.0f, 0.0f);
        this.ac = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text0);
        this.y = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text2);
        this.u = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text3);
        this.x = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text4);
        this.p = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text5);
        this.v = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_text6);
        this.w = (HealthTextView) this.q.findViewById(R.id.sug_detail_info_notice);
        this.d = (HealthRecycleView) this.q.findViewById(R.id.sug_recycleview_relative_course);
    }

    public void a() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(btx.c());
        linearLayoutManager.setOrientation(0);
        this.d.setLayoutManager(linearLayoutManager);
        this.d.setAdapter(this.g);
    }

    public void a(String str) {
        if ("".equals(str)) {
            return;
        }
        this.n.setVisibility(0);
        this.aa.setHeadTitleText(BaseApplication.b().getResources().getString(R.string.sug_run_workout_workout_equipments));
        this.y.setText(str);
    }

    public void b(Map<String, pcs> map) {
        if (map.containsKey("courseDesc")) {
            e(map.get("courseDesc"), this.ac, this.e, this.r);
        }
        if (map.containsKey("trainingSuggest")) {
            e(map.get("trainingSuggest"), this.u, this.ad, this.l);
        }
        if (map.containsKey("suitPeople")) {
            e(map.get("suitPeople"), this.x, this.t, this.f);
        }
        if (map.containsKey("bannerPeople")) {
            e(map.get("bannerPeople"), this.p, this.f9444b, this.h);
        }
        if (map.containsKey("attention")) {
            e(map.get("attention"), this.v, this.f9443a, this.m);
        }
    }

    private void e(pcs pcsVar, HealthTextView healthTextView, HealthSubHeader healthSubHeader, LinearLayout linearLayout) {
        if (pcsVar == null) {
            LogUtil.j("Suggestion_CourseDetailViewHolder", "updateContent workoutExtendBean == null");
            return;
        }
        String strE = pcsVar.e();
        String strD = pcsVar.d();
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strD)) {
            LogUtil.j("Suggestion_CourseDetailViewHolder", "updateContent content title == null");
            return;
        }
        if (linearLayout == null || healthTextView == null || healthSubHeader == null) {
            LogUtil.j("Suggestion_CourseDetailViewHolder", "updateContent view == null");
            return;
        }
        linearLayout.setVisibility(0);
        healthSubHeader.setHeadTitleText(pcsVar.d());
        healthTextView.setText(pcsVar.e());
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            qqf.d(str, this.i);
        } else {
            this.o.setVisibility(8);
        }
    }

    public View b() {
        return this.q;
    }

    public void d(int i) {
        View view = this.q;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void a(SpannableString spannableString) {
        if (spannableString == null) {
            return;
        }
        this.w.setText(spannableString);
        this.w.setMovementMethod(LinkMovementMethod.getInstance());
        this.w.setHighlightColor(BaseApplication.b().getResources().getColor(android.R.color.transparent));
        this.w.setVisibility(0);
    }

    public void d(List<FitWorkout> list) {
        if (njy.b(list)) {
            this.s.setVisibility(0);
            this.g.c(list);
        }
    }

    public void c() {
        this.s.setVisibility(8);
        this.r.setVisibility(8);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.f.setVisibility(8);
        this.h.setVisibility(8);
        this.m.setVisibility(8);
    }
}
