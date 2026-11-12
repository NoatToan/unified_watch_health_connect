package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.knit.section.chart.StepView;
import com.huawei.health.knit.section.listener.IUpdateLayoutCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.chi;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class SectionStepCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f7949a;
    private RelativeLayout aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private ImageView af;
    private ImageView ag;
    private ImageView ah;
    private ImageView ai;
    private ImageView aj;
    private HealthTextView ak;
    private HealthTextView al;
    private ViewGroup am;
    private StepView an;
    private HealthTextView ao;
    private LinearLayout ap;
    private HealthTextView aq;
    private HealthTextView ar;
    private HealthTextView as;
    private HealthTextView at;
    private HealthTextView au;
    private ViewGroup av;
    private HealthTextView aw;
    private HealthTextView ax;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7950b;
    private HealthTextView ba;
    private RelativeLayout bb;
    private HealthTextView bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IUpdateLayoutCallback f7951c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private int g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthColumnSystem j;
    private LinearLayout k;
    private HealthTextView l;
    private HealthTextView m;
    private RelativeLayout n;
    private Context o;
    private View p;
    private HealthTextView q;
    private HealthTextView r;
    private View s;
    private ImageView t;
    private HealthTextView u;
    private LinearLayout v;
    private View w;
    private HealthTextView x;
    private LinearLayout y;
    private RelativeLayout z;

    public SectionStepCard(Context context) {
        super(context);
        this.g = 0;
    }

    public SectionStepCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
    }

    public SectionStepCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.o = context;
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.o, 1);
        this.j = healthColumnSystem;
        this.g = healthColumnSystem.j();
        View viewInflate = LayoutInflater.from(this.o).inflate(R.layout.layout_step_card_container, (ViewGroup) this, false);
        this.w = viewInflate;
        d(viewInflate);
        e(this.w, this.o);
        return this.w;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionStepCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionStepCard", "no need to bind");
            return;
        }
        LogUtil.a("SectionStepCard", "bindParamsToView, size: " + map.size());
        setText(map);
        setOnClickListener(map);
        setVisible(map);
        setOnSectionClickListener(map);
        setLargeModeTextSize(map);
        setTextAndVisible(map);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        IUpdateLayoutCallback iUpdateLayoutCallback;
        super.onConfigurationChanged(configuration);
        if (!d() || (iUpdateLayoutCallback = this.f7951c) == null) {
            return;
        }
        iUpdateLayoutCallback.onUpdateLayoutSuccess();
    }

    public boolean d() {
        this.j.b(this.o);
        if (this.g == this.j.j()) {
            return false;
        }
        this.g = this.j.j();
        View view = this.w;
        if (view == null) {
            return false;
        }
        d(view);
        View view2 = this.w;
        e(view2, view2.getContext());
        return true;
    }

    private void d(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            if (c()) {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.home_item_layout_step_card_cd, null));
                return;
            }
            if (qrs.ac()) {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.home_item_layout_step_card_large_font_scale_2, null));
            } else if (qrs.v()) {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.home_item_layout_step_card_large_font_scale, null));
            } else {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.home_item_layout_step_card, null));
            }
        }
    }

    private boolean c() {
        return this.g >= 8;
    }

    private void e(View view, Context context) {
        this.an = (StepView) view.findViewById(R.id.stepView);
        this.ak = (HealthTextView) view.findViewById(R.id.stepsText);
        if (c()) {
            this.ax = (HealthTextView) view.findViewById(R.id.targetStep);
            this.ao = (HealthTextView) view.findViewById(R.id.targetTime);
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append("/");
            stringBuffer.append(UnitUtil.e(30.0d, 1, 0));
            this.ao.setText(stringBuffer.toString());
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
            this.ax.setTypeface(typefaceCreateFromAsset);
            this.ao.setTypeface(typefaceCreateFromAsset);
        }
        this.aw = (HealthTextView) view.findViewById(R.id.timeText);
        this.bc = (HealthTextView) view.findViewById(R.id.timeTextRight);
        Typeface typefaceCreateFromAsset2 = Typeface.createFromAsset(context.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.ak.setTypeface(typefaceCreateFromAsset2);
        this.aw.setTypeface(typefaceCreateFromAsset2);
        this.ak.setText("0");
        this.aw.setText("0");
        b(view);
        a(context);
        if (LanguageUtil.g(context)) {
            this.e.setTextSize(1, 15.0f);
            this.d.setTextSize(1, 10.0f);
            this.l.setTextSize(1, 15.0f);
            this.m.setTextSize(1, 10.0f);
            this.r.setTextSize(1, 15.0f);
            this.ac.setTextSize(1, 10.0f);
        }
        if (LanguageUtil.at(context)) {
            this.h.setTextSize(1, 10.0f);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CommonUtil.ap() && CommonUtil.d() <= jCurrentTimeMillis && jCurrentTimeMillis <= CommonUtil.b()) {
            this.f7949a.setVisibility(0);
        } else {
            this.f7949a.setVisibility(8);
        }
    }

    private void b(View view) {
        this.s = view.findViewById(R.id.calories_climb_devider);
        this.av = (ViewGroup) view.findViewById(R.id.time_strength_layout);
        this.aj = (ImageView) view.findViewById(R.id.iv_steps_icon);
        this.al = (HealthTextView) view.findViewById(R.id.tv_steps);
        this.ah = (ImageView) view.findViewById(R.id.sport_intensity_icon);
        this.ae = (HealthTextView) view.findViewById(R.id.tv_sport_intensity);
        this.f7949a = (RelativeLayout) view.findViewById(R.id.hw_health_home_dameon_beta_version_no_expire);
        this.v = (LinearLayout) view.findViewById(R.id.home_item_step_card_layout);
        this.au = (HealthTextView) view.findViewById(R.id.tv_distance_title);
        this.at = (HealthTextView) view.findViewById(R.id.tv_calorie_title);
        this.h = (HealthTextView) view.findViewById(R.id.climb_title);
        this.ag = (ImageView) view.findViewById(R.id.sport_distance_icon);
        this.ai = (ImageView) view.findViewById(R.id.sport_calorie_icon);
        this.af = (ImageView) view.findViewById(R.id.sport_climbed_icon);
        this.t = (ImageView) view.findViewById(R.id.hw_health_fitness_data_origin_icon);
        this.ac = (HealthTextView) view.findViewById(R.id.unit_meter);
        this.d = (HealthTextView) view.findViewById(R.id.unit_calories);
        this.m = (HealthTextView) view.findViewById(R.id.unit_distance);
        this.p = view.findViewById(R.id.tv_calories_distance_devider);
        this.q = (HealthTextView) view.findViewById(R.id.hw_health_fitness_data_textview);
        this.am = (ViewGroup) view.findViewById(R.id.stepLayout);
        this.aq = (HealthTextView) view.findViewById(R.id.notice_message11);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.calories);
        this.e = healthTextView;
        healthTextView.setText("0");
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.distance);
        this.l = healthTextView2;
        healthTextView2.setText("0");
        this.r = (HealthTextView) view.findViewById(R.id.floor);
        this.f7950b = (LinearLayout) view.findViewById(R.id.hw_health_steps_card_calories);
        this.y = (LinearLayout) view.findViewById(R.id.hw_health_steps_card_floors);
        this.k = (LinearLayout) view.findViewById(R.id.hw_health_steps_card_distance);
        this.n = (RelativeLayout) view.findViewById(R.id.hw_health_home_dameon_killed_layout);
        this.z = (RelativeLayout) view.findViewById(R.id.rl_oppo_vivo_help);
        this.f = (HealthTextView) this.n.findViewById(R.id.img_show_tips_close);
        this.x = (HealthTextView) this.z.findViewById(R.id.tv_go_to);
        this.u = (HealthTextView) this.z.findViewById(R.id.tv_ignore);
        this.aa = (RelativeLayout) view.findViewById(R.id.rl_nps);
        this.ay = (HealthTextView) view.findViewById(R.id.tv_title);
        this.i = (HealthTextView) view.findViewById(R.id.tv_content);
        this.ad = (HealthTextView) view.findViewById(R.id.tv_join);
        this.ab = (HealthTextView) view.findViewById(R.id.tv_not_join);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sync_cloud_data_fail_layout);
        this.ap = linearLayout;
        this.ar = (HealthTextView) linearLayout.findViewById(R.id.sync_ignore_tv);
        this.as = (HealthTextView) this.ap.findViewById(R.id.sync_try_again_tv);
        this.bb = (RelativeLayout) view.findViewById(R.id.layout_wechat_bind);
        this.ba = (HealthTextView) view.findViewById(R.id.tv_wechat_join);
        this.az = (HealthTextView) view.findViewById(R.id.tv_wechat_ignore);
    }

    private void a(Context context) {
        if (LanguageUtil.ba(context)) {
            this.aj.setBackgroundResource(R.drawable.ic_home_card_data_circle_step_mirror);
            this.ah.setBackgroundResource(R.drawable.ic_home_card_zata_circle_time_mirror);
            this.ag.setBackgroundResource(R.drawable.ic_home_card_data_distance);
            this.ai.setBackgroundResource(R.drawable.ic_home_card_data_calories);
            this.af.setBackgroundResource(R.drawable.ic_home_card_data_climbed);
            this.f7949a.setBackgroundResource(R.drawable.ic_beta_tip_logo);
        }
        if (LanguageUtil.l(context)) {
            this.al.setVisibility(0);
            this.aj.setVisibility(8);
            this.au.setVisibility(0);
            this.ag.setVisibility(8);
            this.at.setVisibility(0);
            this.ai.setVisibility(8);
            this.h.setVisibility(0);
            this.af.setVisibility(8);
            this.ah.setVisibility(8);
            this.ae.setVisibility(0);
            return;
        }
        this.al.setVisibility(8);
        this.aj.setVisibility(0);
        this.au.setVisibility(8);
        this.ag.setVisibility(0);
        this.at.setVisibility(8);
        this.ai.setVisibility(0);
        this.h.setVisibility(8);
        this.af.setVisibility(0);
        this.ah.setVisibility(0);
        this.ae.setVisibility(8);
    }

    private float getDefaultValue() {
        if (qrs.v()) {
            return this.o.getResources().getDimension(R.dimen.large_font_scale_step_text_size);
        }
        return this.o.getResources().getDimension(R.dimen.textSizeHeadline6);
    }

    private void setText(HashMap<String, Object> map) {
        qsp.b(this.i, qqw.d((Map) map, "TV_CONTENT_TEXT_VIEW", ""));
        qsp.b(this.ad, qqw.d((Map) map, "TV_JOIN_TEXT_VIEW", ""));
        qsp.b(this.ab, qqw.d((Map) map, "TV_NOT_JOIN_TEXT_VIEW", ""));
        qsp.b(this.q, qqw.d((Map) map, "HW_HEALTH_FITNESS_DATA_TEXT", ""));
        qsp.b(this.ae, qqw.d((Map) map, "TV_SPORT_INTENSITY", ""));
        qsp.b(this.bc, qqw.d((Map) map, "TIME_TEXT_RIGHT", ""));
        qsp.b(this.h, qqw.d((Map) map, "CLIMB_TITLE", ""));
        qsp.b(this.as, qqw.d((Map) map, "SYNC_TRY_AGAIN_TV", ""));
        qsp.b(this.as, qqw.d((Map) map, "SYNC_TRY_AGAIN_TV", ""));
        qsp.b(this.ac, qqw.d((Map) map, "METER_TEXT_UNIT", this.o.getString(R.string.IDS_fitness_data_list_activity_meter_unit)));
        qsp.b(this.r, qqw.d((Map) map, "FLOOR_TEXT", ""));
        qsp.c((View) this.ac, qqw.c(map, "METER_TEXT_UNIT_VISIBILITY", 0));
        qsp.b(this.m, qqw.d((Map) map, "DISTANCE_UNIT_TEXT", this.o.getString(R.string.IDS_band_data_sport_distance_unit)));
        this.f7951c = (IUpdateLayoutCallback) qqw.a(map, "UPDATE_CALLBACK", (Class<Object>) IUpdateLayoutCallback.class, (Object) null);
    }

    private void setOnClickListener(HashMap<String, Object> map) {
        StepView stepView;
        qsp.b(this.am, chi.b(map, "STEP_CLICK_LISTENER", null));
        qsp.b(this.k, chi.b(map, "STEP_CLICK_LISTENER", null));
        qsp.b(this.f7950b, chi.b(map, "CALORIE_CLICK_LISTENER", null));
        qsp.b(this.y, chi.b(map, "FLOOR_CLICK_LISTENER", null));
        qsp.b(this.av, chi.b(map, "STRENGTH_TIME_CLICK_LISTENER", null));
        qsp.b(this.t, qqw.c(map, "BASE_CLICK_LISTENER", (OnClickSectionListener) null));
        qsp.b(this.q, qqw.c(map, "BASE_CLICK_LISTENER", (OnClickSectionListener) null));
        qsp.b(this.n, qqw.c(map, "BASE_CLICK_LISTENER", (OnClickSectionListener) null));
        qsp.b(this.f, qqw.c(map, "BASE_CLICK_LISTENER", (OnClickSectionListener) null));
        StepView.OnStepViewClickListener onStepViewClickListener = (StepView.OnStepViewClickListener) qqw.a(map, "STEP_CIRCLE_CLICK_LISTENER", (Class<Object>) StepView.OnStepViewClickListener.class, (Object) null);
        if (onStepViewClickListener == null || (stepView = this.an) == null) {
            return;
        }
        stepView.setOnStepViewListener(onStepViewClickListener);
    }

    private void setVisible(HashMap<String, Object> map) {
        qsp.b(this.ak, qqw.d((Map) map, "STEPS_TEXT", ""));
        qsp.b(this.aw, qqw.d((Map) map, "TIME_TEXT", ""));
        qsp.c(this.p, qqw.c(map, "DIVIDER_VISIBILITY", 0));
        qsp.c(this.s, qqw.c(map, "DIVIDER_RIGHT_VISIBILITY", 8));
        qsp.c((View) this.y, qqw.c(map, "FLOORS_LINEAR_LAYOUT_VISIBILITY", 8));
        this.f7950b.setGravity(qqw.c(map, "CALORIES_LINEAR_LAYOUT_GRAVITY", 16));
        this.an.setRightProgress(qqw.e((Map) map, "STEP_VIEW_RIGHT_PROGRESS", 0.0f));
        this.an.setLeftProgress(qqw.e((Map) map, "STEP_VIEW_LEFT_PROGRESS", 0.0f));
        qsp.c((View) this.ap, qqw.c(map, "SYNC_CLOUD_DATA_FAIL_LAYOUT_VISIBILITY", 8));
        qsp.c((View) this.n, qqw.c(map, "DAEMON_LAYOUT_VISIBILITY", 8));
        qsp.c((View) this.z, qqw.c(map, "OPPO_OR_VIVO_HELP_LAYOUT_VISIBILITY", 8));
        qsp.c((View) this.bb, qqw.c(map, "WECHAT_RELATIVE_LAYOUT_VISIBILITY", 8));
    }

    private void setOnSectionClickListener(HashMap<String, Object> map) {
        qsp.e(this.x, qqw.c(map, "TEXT_VIEW_CLICK_EVENT", (OnClickSectionListener) null), "GO_TO_TEXT");
        qsp.e(this.u, qqw.c(map, "TEXT_VIEW_CLICK_EVENT", (OnClickSectionListener) null), "IGNORE_TEXT_VIEW");
        qsp.b(this.aq, qqw.d((Map) map, "SYNC_DATA_FAILED_TEXT", ""));
        qsp.e(this.aq, qqw.c(map, "TEXT_VIEW_CLICK_EVENT", (OnClickSectionListener) null), "SYNC_DATA_FAILED_CLICK_LISTENER");
        qsp.c(this.t, qqw.c(map, "FITNESS_DATA_ORIGIN_ICON_BACKGROUND", this.o.getDrawable(R.drawable.ic_home_data_origin)));
        qsp.e(this.ba, qqw.c(map, "WECHAT_CLICK_LISTENER", (OnClickSectionListener) null), "WECHAT_JOIN_CLICK_LISTENER");
        qsp.e(this.az, qqw.c(map, "WECHAT_CLICK_LISTENER", (OnClickSectionListener) null), "WECHAT_IGNORE_CLICK_LISTENER");
        qsp.e(this.ar, qqw.c(map, "SYNC_CLICK_LISTENER", (OnClickSectionListener) null), "SYNC_IGNORE_CLICK_LISTENER");
        qsp.e(this.as, qqw.c(map, "SYNC_CLICK_LISTENER", (OnClickSectionListener) null), "SYNC_TRY_AGAIN_CLICK_LISTENER");
    }

    private void setLargeModeTextSize(HashMap<String, Object> map) {
        if (qrs.ac()) {
            qsp.b(this.l, qqw.e(map, "DISTANCE_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_14dp)));
            qsp.b(this.r, qqw.e(map, "FLOOR_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_14dp)));
            qsp.b(this.e, qqw.e(map, "CALORIES_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_14dp)));
        } else if (qrs.v()) {
            qsp.b(this.l, qqw.e(map, "DISTANCE_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_10dp)));
            qsp.b(this.r, qqw.e(map, "FLOOR_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_10dp)));
            qsp.b(this.e, qqw.e(map, "CALORIES_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.health_common_10dp)));
        } else {
            qsp.b(this.l, qqw.e(map, "DISTANCE_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.textSizeBody2)));
            qsp.b(this.r, qqw.e(map, "FLOOR_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.textSizeBody2)));
            qsp.b(this.e, qqw.e(map, "CALORIES_TEXT_SIZE", this.o.getResources().getDimension(R.dimen.textSizeBody2)));
        }
    }

    private void setTextAndVisible(HashMap<String, Object> map) {
        qsp.b(this.l, qqw.d((Map) map, "DISTANCE_TEXT", ""));
        qsp.c((View) this.aa, qqw.c(map, "NPS_LAYOUT_VISIBILITY", 8));
        qsp.b(this.ay, qqw.d((Map) map, "TITLE_TEXT_VIEW", ""));
        qsp.e(this.ad, qqw.c(map, "JOIN_TEXT_VIEW_CLICK_LISTENER", (OnClickSectionListener) null), "JOIN_TEXT_VIEW_CLICK_LISTENER");
        qsp.e(this.ab, qqw.c(map, "JOIN_TEXT_VIEW_CLICK_LISTENER", (OnClickSectionListener) null), "NOT_JOIN_TEXT_VIEW_CLICK_LISTENER");
        qsp.b(this.e, qqw.d((Map) map, "CALORIES_TEXT", ""));
        qsp.c((View) this.t, qqw.c(map, "FITNESS_DATA_ORIGIN_ICON_VISIBILITY", 8));
        qsp.b(this.ax, qqw.d((Map) map, "TARGET_STEP_TEXT", ""));
        qsp.b(this.ak, qqw.e(map, "STEPS_TEXT_SIZE", getDefaultValue()));
    }
}
