package com.huawei.ui.homehealth.stepscard;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.knit.section.chart.StepView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes17.dex */
public class StepsCardViewHolder extends StepsBaseCardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26100a;
    private HealthTextView aa;
    private StepView ab;
    private HealthTextView ac;
    private ViewGroup ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private HealthTextView aj;
    private ViewGroup ak;
    private HealthTextView am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f26101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f26102c;
    private RelativeLayout d;
    private HealthTextView e;
    private LinearLayout f;
    private int g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthColumnSystem j;
    private HealthTextView k;
    private View l;
    private HealthTextView m;
    private View n;
    private ImageView o;
    private LinearLayout p;
    private LinearLayout q;
    private ImageView r;
    private HealthTextView s;
    private HealthTextView t;
    private HealthTextView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private ImageView y;
    private HealthTextView z;

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public RelativeLayout getActivityLayout() {
        return null;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public LinearLayout getFitnessDataOriginIconLayout() {
        return null;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public ImageView getThreeLeafIcon() {
        return null;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public LinearLayout getTwoModelSwitchArea() {
        return null;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public void refreshDistanceCalFloorMargin(String str, String str2, String str3, boolean z) {
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public void refreshDistanceCalFloorParams(int i) {
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public void refreshStepStrenActivityWidth() {
    }

    public StepsCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.g = 0;
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(getContext(), 1);
        this.j = healthColumnSystem;
        this.g = healthColumnSystem.j();
        a(view);
        d(view, context);
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public boolean updateLayout() {
        this.j.b(getContext());
        if (this.g == this.j.j()) {
            return false;
        }
        this.g = this.j.j();
        if (this.itemView == null) {
            return false;
        }
        a(this.itemView);
        d(this.itemView, this.itemView.getContext());
        return true;
    }

    private void a(View view) {
        if (this.itemView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            if (d()) {
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

    private boolean d() {
        return this.g >= 8;
    }

    private void d(View view, Context context) {
        RelativeLayout relativeLayout;
        this.ab = (StepView) view.findViewById(R.id.stepView);
        this.ac = (HealthTextView) view.findViewById(R.id.stepsText);
        this.aa = (HealthTextView) view.findViewById(R.id.hw_health_steps);
        b(view, context);
        this.aj = (HealthTextView) view.findViewById(R.id.timeText);
        this.am = (HealthTextView) view.findViewById(R.id.timeTextRight);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.ac.setTypeface(typefaceCreateFromAsset);
        this.aj.setTypeface(typefaceCreateFromAsset);
        this.ac.setText("0");
        this.aj.setText("0");
        e();
        c(context);
        this.am.setText(getContext().getString(R.string.IDS_hw_health_show_time_unit));
        if (LanguageUtil.g(context)) {
            this.e.setTextSize(1, 15.0f);
            this.f26100a.setTextSize(1, 10.0f);
            this.h.setTextSize(1, 15.0f);
            this.m.setTextSize(1, 10.0f);
            this.s.setTextSize(1, 15.0f);
            this.t.setTextSize(1, 10.0f);
        }
        if (LanguageUtil.at(context)) {
            this.i.setTextSize(1, 10.0f);
        }
        if (LanguageUtil.bk(context) && qrs.u()) {
            this.aa.setTextSize(1, 15.0f);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CommonUtil.ap() && CommonUtil.d() <= jCurrentTimeMillis && jCurrentTimeMillis <= CommonUtil.b()) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        if (qrs.y() && qrs.af(getContext()) && (relativeLayout = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.relativeLayout2)) != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = -2;
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    private void b(View view, Context context) {
        if (d()) {
            this.ae = (HealthTextView) view.findViewById(R.id.targetStep);
            this.af = (HealthTextView) view.findViewById(R.id.targetTime);
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append("/");
            stringBuffer.append(UnitUtil.e(30.0d, 1, 0));
            this.af.setText(stringBuffer.toString());
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
            this.ae.setTypeface(typefaceCreateFromAsset);
            this.af.setTypeface(typefaceCreateFromAsset);
        }
    }

    private void c(Context context) {
        if (LanguageUtil.ba(context)) {
            this.v.setBackgroundResource(R.drawable.ic_home_card_data_circle_step_mirror);
            this.y.setBackgroundResource(R.drawable.ic_home_card_zata_circle_time_mirror);
            this.x.setBackgroundResource(R.drawable.ic_home_card_data_distance);
            this.r.setBackgroundResource(R.drawable.ic_home_card_data_calories);
            this.w.setBackgroundResource(R.drawable.ic_home_card_data_climbed);
            this.d.setBackgroundResource(R.drawable.ic_beta_tip_logo);
        }
        if (LanguageUtil.l(context)) {
            this.ah.setVisibility(0);
            this.v.setVisibility(8);
            this.ai.setVisibility(0);
            this.x.setVisibility(8);
            this.ag.setVisibility(0);
            this.r.setVisibility(8);
            this.i.setVisibility(0);
            this.w.setVisibility(8);
            this.y.setVisibility(8);
            this.u.setVisibility(0);
            return;
        }
        c(this.itemView);
        this.ah.setVisibility(8);
        this.v.setVisibility(0);
        this.ai.setVisibility(8);
        this.x.setVisibility(0);
        this.ag.setVisibility(8);
        this.r.setVisibility(0);
        this.i.setVisibility(8);
        this.w.setVisibility(0);
        this.y.setVisibility(0);
        this.u.setVisibility(8);
    }

    private void e() {
        this.n = this.itemView.findViewById(R.id.calories_climb_devider);
        this.ak = (ViewGroup) this.itemView.findViewById(R.id.time_strength_layout);
        this.v = (ImageView) this.itemView.findViewById(R.id.iv_steps_icon);
        this.ah = (HealthTextView) this.itemView.findViewById(R.id.tv_steps);
        this.y = (ImageView) this.itemView.findViewById(R.id.sport_intensity_icon);
        HealthTextView healthTextView = (HealthTextView) this.itemView.findViewById(R.id.tv_sport_intensity);
        this.u = healthTextView;
        healthTextView.setText(getContext().getString(R.string.IDS_hwh_home_step_strength));
        this.d = (RelativeLayout) this.itemView.findViewById(R.id.hw_health_home_dameon_beta_version_no_expire);
        this.p = (LinearLayout) this.itemView.findViewById(R.id.home_item_step_card_layout);
        a();
    }

    private void a() {
        this.ai = (HealthTextView) this.itemView.findViewById(R.id.tv_distance_title);
        this.ag = (HealthTextView) this.itemView.findViewById(R.id.tv_calorie_title);
        HealthTextView healthTextView = (HealthTextView) this.itemView.findViewById(R.id.climb_title);
        this.i = healthTextView;
        healthTextView.setText(getContext().getString(R.string.IDS_motiontrack_climb_stairs_tip));
        this.x = (ImageView) this.itemView.findViewById(R.id.sport_distance_icon);
        this.r = (ImageView) this.itemView.findViewById(R.id.sport_calorie_icon);
        this.w = (ImageView) this.itemView.findViewById(R.id.sport_climbed_icon);
        this.o = (ImageView) this.itemView.findViewById(R.id.hw_health_fitness_data_origin_icon);
        this.t = (HealthTextView) this.itemView.findViewById(R.id.unit_meter);
        this.f26100a = (HealthTextView) this.itemView.findViewById(R.id.unit_calories);
        this.m = (HealthTextView) this.itemView.findViewById(R.id.unit_distance);
        this.l = this.itemView.findViewById(R.id.tv_calories_distance_devider);
        HealthTextView healthTextView2 = (HealthTextView) this.itemView.findViewById(R.id.hw_health_fitness_data_textview);
        this.k = healthTextView2;
        healthTextView2.setText(getContext().getString(R.string.IDS_hw_show_main_home_page_step_activity_today));
        this.ad = (ViewGroup) this.itemView.findViewById(R.id.stepLayout);
        HealthTextView healthTextView3 = (HealthTextView) this.itemView.findViewById(R.id.calories);
        this.e = healthTextView3;
        healthTextView3.setText("0");
        HealthTextView healthTextView4 = (HealthTextView) this.itemView.findViewById(R.id.distance);
        this.h = healthTextView4;
        healthTextView4.setText("0");
        this.s = (HealthTextView) this.itemView.findViewById(R.id.floor);
        this.f26102c = (LinearLayout) this.itemView.findViewById(R.id.hw_health_steps_card_calories);
        this.q = (LinearLayout) this.itemView.findViewById(R.id.hw_health_steps_card_floors);
        this.f = (LinearLayout) this.itemView.findViewById(R.id.hw_health_steps_card_distance);
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public HealthTextView getBubbleText() {
        return this.f26101b;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public HealthTextView getStepsText() {
        return this.ac;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public StepView getStepView() {
        return this.ab;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public HealthTextView getTimeText() {
        return this.aj;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public HealthTextView getFitnessDataTextView() {
        return this.k;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public ImageView getFitnessDataOriginIcon() {
        return this.o;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public View getDivider() {
        return this.l;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public View getHomeStepCardLayout() {
        return this.p;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public ViewGroup getTimeStrengthLayout() {
        return this.ak;
    }

    @Override // com.huawei.ui.homehealth.stepscard.StepsBaseCardViewHolder
    public ViewGroup getStepLayout() {
        return this.ad;
    }

    private void c(View view) {
        if (qrs.y() && d()) {
            b(view);
            if (qrs.t()) {
                b();
            }
        }
    }

    private void b(View view) {
        this.v = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.iv_steps_icon_large);
        view.findViewById(com.huawei.health.servicesui.R.id.sport_intensity_icon_large).setVisibility(8);
        this.y = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.sport_intensity_icon_large);
        view.findViewById(com.huawei.health.servicesui.R.id.sport_intensity_icon).setVisibility(8);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.hw_health_steps_large);
        this.z = healthTextView;
        healthTextView.setVisibility(0);
        view.findViewById(com.huawei.health.servicesui.R.id.hw_health_steps).setVisibility(8);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.timeTextRight_large);
        this.am = healthTextView2;
        healthTextView2.setVisibility(0);
        view.findViewById(com.huawei.health.servicesui.R.id.timeTextRight).setVisibility(8);
    }

    private void b() {
        LogUtil.d("StepsCardViewHolder", "foldable current font scale: ", Float.valueOf(qrs.i()));
        int iD = qrs.d(getContext(), 4.0f);
        d(this.v, 0, 0, 0, iD);
        d(this.y, 0, 0, 0, iD);
        d(this.z, 0, iD, 0, 0);
        d(this.am, 0, iD, 0, 0);
    }

    private void d(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            LogUtil.d("StepsCardViewHolder", "imageView is null,can not set margin");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            LogUtil.d("StepsCardViewHolder", "parent layout params type is not match,return");
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(layoutParams2.leftMargin + i, layoutParams2.topMargin + i2, layoutParams2.rightMargin + i3, layoutParams2.bottomMargin + i4);
        view.setLayoutParams(layoutParams2);
    }
}
