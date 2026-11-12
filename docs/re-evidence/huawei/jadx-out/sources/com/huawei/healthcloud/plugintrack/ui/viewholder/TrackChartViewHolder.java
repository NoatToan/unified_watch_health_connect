package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.BloodOxygenRangeView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import defpackage.izn;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class TrackChartViewHolder extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBaseCombinedChart f11401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f11402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f11403c;
    private int d;
    private HealthTextView e;
    private int f;
    private RelativeLayout g;
    private boolean h;
    private ImageView i;
    private LinearLayout j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView r;
    private HealthTextView s;

    private boolean d(float f) {
        return f < 1.0f;
    }

    public TrackChartViewHolder(Context context, int i, boolean z, int i2) {
        super(context);
        this.f11402b = null;
        this.d = 0;
        this.h = false;
        this.f = 100;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.n = null;
        this.m = null;
        this.o = null;
        this.l = null;
        this.s = null;
        this.f11401a = null;
        this.e = null;
        this.f11403c = null;
        this.i = null;
        c(context, i, z, i2);
    }

    public TrackChartViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11402b = null;
        this.d = 0;
        this.h = false;
        this.f = 100;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.n = null;
        this.m = null;
        this.o = null;
        this.l = null;
        this.s = null;
        this.f11401a = null;
        this.e = null;
        this.f11403c = null;
        this.i = null;
        c(context, 100, false, 0);
    }

    private void c(Context context, int i, boolean z, int i2) {
        this.f11402b = context;
        this.f = i;
        this.d = i2;
        this.h = z;
        h();
        if (z) {
            this.e.setVisibility(8);
            Resources resources = getResources();
            if (this.f == 100) {
                int color = resources.getColor(R.color.common_black_50alpha);
                int color2 = resources.getColor(R.color.common_black_100alpha);
                this.p.setTextColor(color2);
                this.p.setTypeface(Typeface.create(this.f11402b.getString(R.string.textFontFamilyMedium), 0));
                this.r.setTextColor(color2);
                this.n.setTextColor(color2);
                this.m.setTextColor(color);
                this.k.setTextColor(color2);
                this.l.setTextColor(color2);
                this.o.setTextColor(color);
                this.s.setTextColor(color2);
            } else {
                int color3 = resources.getColor(R.color.common_white_50alpha);
                int color4 = resources.getColor(R.color.color_normal_titlebar_title);
                this.p.setTextColor(resources.getColor(R.color.textColorPrimary));
                this.r.setTextColor(resources.getColor(R.color.textColorPrimary));
                this.n.setTextColor(color4);
                this.m.setTextColor(color3);
                this.k.setTextColor(color4);
                this.l.setTextColor(color4);
                this.o.setTextColor(color3);
                this.s.setTextColor(color4);
            }
            this.l.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = qrs.d(this.f11402b, 3.5f);
                marginLayoutParams.height = -2;
                this.g.setLayoutParams(marginLayoutParams);
            }
            ViewGroup.LayoutParams layoutParams = this.f11401a.getLayoutParams();
            layoutParams.height = qrs.d(this.f11402b, 149.0f);
            this.f11401a.setLayoutParams(layoutParams);
        }
        u();
        o();
    }

    private void h() {
        View viewInflate = View.inflate(this.f11402b, R.layout.layout_track_chart_viewholder, this);
        this.j = (LinearLayout) viewInflate.findViewById(R.id.layout_track_detail_curve_max_avg);
        this.k = (HealthTextView) findViewById(R.id.text_track_detail_left_value);
        this.p = (HealthTextView) findViewById(R.id.text_curve_title);
        this.r = (HealthTextView) findViewById(R.id.text_curve_title_unit);
        this.n = (HealthTextView) findViewById(R.id.text_track_detail_left_unit);
        this.m = (HealthTextView) findViewById(R.id.text_track_detail_left_title);
        this.o = (HealthTextView) findViewById(R.id.text_track_detail_right_title);
        this.l = (HealthTextView) findViewById(R.id.text_track_detail_right_unit);
        this.s = (HealthTextView) findViewById(R.id.text_track_detail_right_value);
        this.e = (HealthTextView) findViewById(R.id.text_curve_detail);
        this.i = (ImageView) findViewById(R.id.img_explain_icon);
        HwHealthBaseCombinedChart hwHealthBaseCombinedChart = (HwHealthBaseCombinedChart) findViewById(R.id.combined_chart);
        this.f11401a = hwHealthBaseCombinedChart;
        Layout layoutAcquireLayout = hwHealthBaseCombinedChart.acquireLayout();
        if (layoutAcquireLayout != null) {
            layoutAcquireLayout.b(0.0f, 0.0f);
            layoutAcquireLayout.a(0.0f);
        }
        this.g = (RelativeLayout) findViewById(R.id.rl_title_parent);
        this.f11403c = (LinearLayout) findViewById(R.id.track_extended_view);
        c(viewInflate);
    }

    private void c(View view) {
        if (qrs.t()) {
            boolean zAf = qrs.af(this.f11402b);
            LogUtil.a("Track_TrackChartViewHolder", "inflateView, isTahitiModel: ", Boolean.valueOf(zAf));
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.heart_rate_right_data);
            if (viewGroup != null && (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                if (zAf) {
                    layoutParams.setMarginStart(qrs.d(this.f11402b, 12.0f));
                } else {
                    layoutParams.setMarginStart(qrs.d(this.f11402b, 34.0f));
                }
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            LogUtil.j("Track_TrackChartViewHolder", "inflateView, viewGroup is null, ", "or layoutParams isn't the instance of LinearLauout.LayoutParams");
        }
    }

    public void e() {
        h();
    }

    public void a(View view) {
        LinearLayout linearLayout;
        if (view == null || (linearLayout = this.f11403c) == null) {
            return;
        }
        linearLayout.addView(view);
        this.f11403c.setVisibility(0);
    }

    public void d() {
        LinearLayout linearLayout = this.f11403c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f11403c.setVisibility(8);
        }
    }

    private void u() {
        setBaseChart(this.d);
        setDeviceChart(this.d);
        setBoltChart(this.d);
        setBasketballChart(this.d);
        setSwimmingChart(this.d);
    }

    private void setSwimmingChart(int i) {
        if (i == 4) {
            ah();
        } else if (i == 5) {
            z();
        } else {
            if (i != 6) {
                return;
            }
            ae();
        }
    }

    private void setBasketballChart(int i) {
        if (i == 11) {
            x();
        } else {
            if (i != 12) {
                return;
            }
            v();
        }
    }

    private void setDeviceChart(int i) {
        if (i == 9) {
            ab();
            return;
        }
        if (i == 10) {
            af();
            return;
        }
        if (i != 124) {
            switch (i) {
                case 13:
                    l();
                    return;
                case 14:
                    break;
                case 15:
                    ad();
                    return;
                case 16:
                    ac();
                    return;
                case 17:
                    k();
                    return;
                default:
                    switch (i) {
                        case 24:
                            aa();
                            break;
                        case 26:
                            m();
                            break;
                        case 27:
                            n();
                            break;
                        case 28:
                            i();
                            break;
                    }
                    return;
            }
            setPaddleFreqChart(i == 25);
            return;
        }
        w();
    }

    private void setBoltChart(int i) {
        if (i == 7) {
            s();
            return;
        }
        if (i != 8) {
            switch (i) {
                case 18:
                    p();
                    break;
                case 19:
                    t();
                    break;
                case 20:
                    j();
                    break;
                case 21:
                    q();
                    break;
                case 22:
                    ak();
                    break;
                case 23:
                    al();
                    break;
            }
            return;
        }
        r();
    }

    private void setBaseChart(int i) {
        if (i == 0) {
            g();
            return;
        }
        if (i == 1) {
            y();
            return;
        }
        if (i == 2) {
            ag();
        } else if (i == 3) {
            ai();
        } else {
            if (i != 100) {
                return;
            }
            f();
        }
    }

    private void w() {
        this.p.setText(R.string.IDS_motiontrack_res_heart_rate);
        this.r.setText(String.format(Locale.ROOT, this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string)));
        this.o.setText(getResources().getString(R.string.IDS_guide_page_num, getResources().getString(R.string.IDS_wl_food_start_time), getResources().getString(R.string.IDS_wl_food_end_time)));
        this.l.setVisibility(8);
    }

    private void v() {
        this.p.setText(R.string.IDS_aw_version2_jump_height);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_ins)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_cm)));
        }
        this.m.setText(R.string.IDS_aw_version2_average_jump_height);
        this.o.setText(R.string.IDS_aw_version2_maximum_jump_height);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void x() {
        this.p.setText(R.string.IDS_aw_version2_duration_of_passage);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_msec_unit)));
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_aw_version2_average_jump_time);
        this.o.setText(R.string.IDS_aw_version2_max_duration_of_passage);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void af() {
        this.p.setText(R.string.IDS_hw_health_blood_oxygen);
        this.r.setVisibility(8);
        this.m.setText(R.string.IDS_hw_health_blood_oxygen_minimum_value);
        this.o.setText(R.string.IDS_hw_health_blood_oxygen_max_value);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        if (this.h) {
            return;
        }
        d();
        a(new BloodOxygenRangeView(getContext()));
    }

    private void ab() {
        String str;
        this.p.setText(R.string.IDS_motiontrack_show_map_sport_peisu_1);
        this.m.setText(R.string.IDS_motiontrack_show_detail_avragepace_simplified);
        this.o.setText(R.string.IDS_motiontrack_fastpace_rt_simplified);
        if (UnitUtil.f()) {
            str = "/" + getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        } else {
            str = "/" + getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
        }
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), str));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void k() {
        this.p.setText(R.string.IDS_motiontrack_show_map_sport_peisu_1);
        this.m.setText(R.string.IDS_motiontrack_show_detail_avragepace_simplified);
        this.o.setText(R.string.IDS_motiontrack_fastpace_rt_simplified);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500)));
        }
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void m() {
        this.p.setText(qre.f(R.string.IDS_motiontrack_show_map_sport_peisu_1));
        this.m.setText(qre.f(R.string.IDS_motiontrack_show_detail_avragepace_simplified));
        this.o.setText(qre.f(R.string.IDS_motiontrack_fastpace_rt_simplified));
        this.r.setText(String.format(qre.f(R.string.IDS_motiontrack_show_chart_unit_string), qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void r() {
        this.p.setText(R.string.IDS_running_posture_ground_impact_acceleration);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_gravity_unit)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_running_posture_avg_ground_impact_acceleration_simplified);
        this.o.setText(R.string.IDS_running_posture_max_ground_impact_acceleration_simplified);
    }

    private void j() {
        b();
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_bolt_average_peak_impact);
        this.o.setText(R.string.IDS_bolt_max_peak_impact);
    }

    private void b() {
        if (LanguageUtil.c(this.f11402b)) {
            this.p.setText(this.f11402b.getString(R.string.IDS_bolt_shock_peak_chart, this.f11402b.getString(R.string.IDS_bolt_shock_peak), this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string, this.f11402b.getString(R.string.IDS_bolt_shock_peak_unit))));
            this.r.setText("");
        } else {
            this.p.setText(R.string.IDS_bolt_shock_peak);
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_bolt_shock_peak_unit)));
        }
    }

    private void s() {
        this.p.setText(R.string.IDS_running_posture_ground_contact_time);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_msec_unit)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_running_posture_avg_duration_simplified);
        this.o.setText(R.string.IDS_running_posture_min_duration_simplified);
    }

    private void p() {
        this.p.setText(R.string.IDS_aw_version2_duration_of_passage);
        this.r.setText(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string, getResources().getString(R.string.IDS_msec_unit)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_aw_version2_average_jump_time);
        this.o.setText(R.string.IDS_aw_version2_max_duration_of_passage);
    }

    private void q() {
        this.p.setText(R.string.IDS_bolt_balance_left_right_touches);
        this.r.setText(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string, Character.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getPercent())));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        if (LanguageUtil.c(this.f11402b)) {
            this.o.setText(R.string.IDS_bolt_balance_left_touches);
            this.m.setText(R.string.IDS_bolt_balance_right_touches);
        } else {
            this.m.setText(R.string.IDS_bolt_balance_left_touches);
            this.o.setText(R.string.IDS_bolt_balance_right_touches);
        }
    }

    private void ak() {
        this.p.setText(R.string.IDS_bolt_vertical_stride_rate);
        this.r.setText(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string, Character.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getPercent())));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_bolt_average_vertical_amplitude_rate);
        this.o.setText(R.string.IDS_bolt_max_vertical_amplitude_rate);
    }

    private void al() {
        String string;
        this.p.setText(R.string.IDS_bolt_vertical_amplitude);
        if (!UnitUtil.f()) {
            string = this.f11402b.getResources().getString(R.string.IDS_cm);
        } else {
            string = this.f11402b.getResources().getString(R.string.IDS_ins);
        }
        this.r.setText(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string, string));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_bolt_average_amplitude);
        this.o.setText(R.string.IDS_bolt_max_amplitude);
    }

    private void t() {
        this.p.setText(R.string.IDS_motiontrack_ground_to_air_ratio);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_motiontrack__average_ground_to_air_ratio);
        this.o.setText(R.string.IDS_motiontrack_small_ground_to_air_ratio);
    }

    private void f() {
        this.p.setText(R.string.IDS_hwh_motiontrack_alti);
        this.m.setText(R.string.IDS_hwh_motiontrack_min_alti_simplified);
        this.o.setText(R.string.IDS_hwh_motiontrack_max_alti_simplified);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_ft)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit)));
        }
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void ae() {
        this.p.setText(R.string.IDS_motiontrack_show_map_sport_peisu_1);
        this.m.setText(R.string.IDS_motiontrack_show_detail_avragepace_simplified);
        this.o.setText(R.string.IDS_motiontrack_fastpace_rt_simplified);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100)));
        }
        this.l.setVisibility(8);
        this.n.setVisibility(8);
    }

    private void z() {
        this.p.setText(R.string.IDS_hwh_motiontrack_pull_frequence);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, 0)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_hwh_motiontrack_avg_frequence_simplified);
        this.o.setText(R.string.IDS_hwh_motiontrack_max_frequence_simplified);
    }

    private void ah() {
        this.p.setText(R.string.IDS_hwh_motiontrack_swim_SWOLF);
        this.r.setVisibility(8);
        this.m.setText(R.string.IDS_hwh_motiontrack_avg_swolf_simplified);
        this.o.setText(R.string.IDS_hwh_motiontrack_max_SWOLF);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void ai() {
        this.p.setText(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_motiontrack_show_detail_averagespeed_simplified);
        this.o.setText(R.string.IDS_hwh_motiontrack_fast_speed);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed)));
        }
    }

    private void g() {
        this.p.setText(R.string.IDS_hwh_motiontrack_climbed_withot_unit);
        this.m.setText(R.string.IDS_hwh_motiontrack_total_climbed);
        this.o.setText(R.string.IDS_hwh_motiontrack_total_descent);
        if (UnitUtil.f()) {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_ft)));
        } else {
            this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit)));
        }
        this.n.setVisibility(8);
        this.l.setVisibility(8);
    }

    private void ag() {
        this.p.setText(getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_bupin));
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getQuantityString(R.plurals.IDS_motiontrack_show_chart_stepsmin, 0)));
        this.m.setText(R.string.IDS_motiontrack_detail_fm_heart_bupinrate);
        this.n.setVisibility(8);
        this.o.setText(R.string.IDS_motiontrack_detail_fm_heart_bupinbig);
        this.l.setVisibility(8);
    }

    private void l() {
        this.p.setText(getResources().getString(R.string.IDS_indoor_equip_cadence));
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_indoor_equip_cadence_unit_times_minute)));
        this.m.setText(getResources().getString(R.string.IDS_indoor_equip_cadence_average));
        this.n.setVisibility(8);
        this.o.setText(getResources().getString(R.string.IDS_indoor_equip_cadence_maximum));
        this.l.setVisibility(8);
    }

    private void setPaddleFreqChart(boolean z) {
        this.p.setText(getResources().getString(z ? R.string.IDS_rowing_machine_action_frequency : R.string.IDS_indoor_equip_paddle_frequency));
        this.j.setVisibility(z ? 8 : 0);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_indoor_equip_paddle_unit_times_minute)));
        this.m.setText(getResources().getString(R.string.IDS_indoor_equip_paddle_average));
        this.n.setVisibility(8);
        this.o.setText(getResources().getString(R.string.IDS_indoor_equip_paddle_maximum));
        this.l.setVisibility(8);
    }

    private void aa() {
        this.p.setText(getResources().getString(R.string.IDS_rowing_machine_weight));
        this.r.setText(String.format(Locale.ROOT, this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(UnitUtil.f() ? R.string.IDS_lbs : R.string.IDS_rowing_machine_unit_kg)));
        this.o.setVisibility(8);
        this.l.setVisibility(8);
        this.s.setVisibility(8);
        this.m.setText(getResources().getString(R.string.IDS_rowing_machine_peak_weight));
        this.n.setVisibility(8);
    }

    private void ac() {
        this.p.setText(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_indoor_skipper_number_minute)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_motiontrack_show_detail_averagespeed_simplified);
        this.o.setText(R.string.IDS_hwh_motiontrack_fast_speed);
    }

    private void ad() {
        this.p.setText(getResources().getString(R.string.IDS_indoor_equip_power));
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_indoor_equip_power_unit_watt)));
        this.m.setText(getResources().getString(R.string.IDS_indoor_equip_power_average));
        this.n.setVisibility(8);
        this.o.setText(getResources().getString(R.string.IDS_indoor_equip_power_maximum));
        this.l.setVisibility(8);
    }

    private void n() {
        this.p.setText(qre.f(R.string.IDS_track_analog_power));
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), qre.f(R.string.IDS_indoor_equip_power_unit_watt)));
        this.m.setText(qre.f(R.string.IDS_track_analog_average_power));
        this.n.setVisibility(8);
        this.o.setText(qre.f(R.string.IDS_track_max_analog_power));
        this.l.setVisibility(8);
    }

    private void i() {
        this.p.setText(qre.f(R.string.IDS_track_analog_cadence));
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), qre.f(R.string.IDS_indoor_equip_cadence_unit_times_minute)));
        this.m.setText(qre.f(R.string.IDS_track_average_analog_cadence_chart));
        this.n.setVisibility(8);
        this.o.setText(qre.f(R.string.IDS_track_max_analog_cadence));
        this.l.setVisibility(8);
    }

    private void y() {
        this.p.setText(R.string.IDS_main_watch_heart_rate_string);
        this.r.setText(String.format(this.f11402b.getString(R.string.IDS_motiontrack_show_chart_unit_string), getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string)));
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setText(R.string.IDS_motiontrack_detail_fm_heart_heartrate);
        this.o.setText(R.string.IDS_motiontrack_detail_fm_heart_heartbest);
    }

    private void e(float f) {
        if (UnitUtil.f()) {
            double d = f;
            this.k.setText(UnitUtil.e(UnitUtil.e(d, 1), 1, 2));
            this.n.setText(getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(UnitUtil.e(d, 1))));
            return;
        }
        this.k.setText(UnitUtil.e(f, 1, 1));
        this.n.setText(getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
    }

    public void c(float f) {
        setLeftValueSingleNumberType(f);
        int i = this.d;
        if (i == 0) {
            e(f);
            if (d(f)) {
                this.k.setVisibility(4);
                this.n.setVisibility(4);
                this.m.setVisibility(4);
                return;
            }
            return;
        }
        if (i == 3) {
            a(f, this.k, this.n, R.string.IDS_motiontrack_show_detail_average_speed_imp, R.string.IDS_motiontrack_show_detail_average_speed);
            return;
        }
        if (i == 100) {
            e(f);
        } else if (i == 124) {
            setRecoveryHeartRateLeftValue(f);
        } else {
            setTextLeftValue(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    private void setTextLeftValue(float f) {
        int i = this.d;
        if (i != 26) {
            switch (i) {
                case 6:
                case 9:
                    break;
                case 7:
                case 8:
                    this.k.setText(UnitUtil.e(f, 1, 0));
                    break;
                case 10:
                    this.k.setText(UnitUtil.e(f, 2, 0));
                    break;
                case 11:
                    this.k.setText(UnitUtil.e(f, 1, 0));
                    break;
                case 12:
                    this.k.setText(UnitUtil.e(f, 1, 0));
                    break;
                default:
                    switch (i) {
                        case 18:
                            this.k.setText(UnitUtil.e(f, 1, 0));
                            break;
                        case 19:
                        case 20:
                        case 22:
                        case 23:
                            HealthTextView healthTextView = this.k;
                            d(f, healthTextView, 20, healthTextView);
                            break;
                        case 21:
                            d(f, this.k, 21, this.s);
                            break;
                    }
                    break;
            }
            return;
        }
        this.k.setText(izn.a(f));
    }

    private void d(float f, HealthTextView healthTextView, int i, HealthTextView healthTextView2) {
        double d = f;
        healthTextView.setText(UnitUtil.e(d, 1, 1));
        if (LanguageUtil.c(getContext()) && i == 21) {
            healthTextView2.setText(UnitUtil.e(d, 1, 1));
        }
    }

    private void a(float f, HealthTextView healthTextView, HealthTextView healthTextView2, int i, int i2) {
        if (UnitUtil.f()) {
            healthTextView.setText(UnitUtil.e(UnitUtil.e(f, 3), 1, 2));
            healthTextView2.setText(getResources().getString(i));
        } else {
            healthTextView.setText(UnitUtil.e(f, 1, 2));
            healthTextView2.setText(getResources().getString(i2));
        }
    }

    private void setLeftValueSingleNumberType(float f) {
        int i = this.d;
        if (i != 1 && i != 2 && i != 4 && i != 5 && i != 24 && i != 25 && i != 27 && i != 28) {
            switch (i) {
            }
            return;
        }
        this.k.setText(UnitUtil.e(f, 1, 0));
    }

    private void setRecoveryHeartRateLeftValue(float f) {
        String strE = UnitUtil.e((int) Math.floor(Math.abs(f)), 1, 0);
        if (f >= 0.0f) {
            this.m.setText(getResources().getString(R.string.IDS_recovery_heart_lower, ""));
        } else {
            this.m.setText(getResources().getString(R.string.IDS_recovery_heart_escalate, ""));
        }
        this.n.setVisibility(8);
        this.k.setText(strE);
    }

    private void b(float f) {
        if (UnitUtil.f()) {
            double d = f;
            this.s.setText(UnitUtil.e(UnitUtil.e(d, 1), 1, 2));
            this.l.setText(getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(UnitUtil.e(d, 1))));
            return;
        }
        this.s.setText(UnitUtil.e(f, 1, 1));
        this.l.setText(getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
    }

    public void a(float f) {
        int i = this.d;
        if (i == 0) {
            b(f);
            if (d(f)) {
                this.s.setVisibility(4);
                this.o.setVisibility(4);
            }
            this.l.setVisibility(8);
            return;
        }
        if (i == 3) {
            a(f, this.s, this.l, R.string.IDS_motiontrack_show_detail_average_speed_imp, R.string.IDS_motiontrack_show_detail_average_speed);
            this.l.setVisibility(8);
        } else if (i == 100) {
            b(f);
            this.l.setVisibility(8);
        } else {
            setRightValueAndUnitVisible(f);
        }
    }

    private void setRightValueAndUnitVisible(float f) {
        switch (this.d) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 13:
            case 14:
            case 15:
            case 16:
            case 25:
            case 27:
            case 28:
                this.s.setText(UnitUtil.e(f, 1, 0));
                this.l.setVisibility(8);
                break;
            case 3:
            case 11:
            case 12:
            case 24:
            default:
                setRightValueAndUnitVisibleOne(f);
                break;
            case 6:
            case 9:
            case 17:
            case 26:
                this.s.setText(izn.a(f));
                this.l.setVisibility(8);
                break;
            case 7:
            case 8:
            case 18:
                this.s.setText(UnitUtil.e(f, 1, 0));
                this.l.setVisibility(8);
                break;
            case 10:
                this.s.setText(UnitUtil.e(f, 2, 0));
                this.l.setVisibility(8);
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                HealthTextView healthTextView = this.s;
                d(f, healthTextView, 19, healthTextView);
                this.l.setVisibility(8);
                break;
            case 21:
                d(f, this.s, 21, this.k);
                this.l.setVisibility(8);
                break;
        }
    }

    private void setRightValueAndUnitVisibleOne(float f) {
        int i = this.d;
        if (i == 11 || i == 12) {
            this.s.setText(UnitUtil.e(f, 1, 0));
            this.l.setVisibility(8);
        }
    }

    public void e(int i, int i2) {
        if (this.d == 124) {
            this.s.setText(getResources().getString(R.string.IDS_guide_page_num, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0)));
        }
    }

    public HwHealthBaseCombinedChart getCombinedChart() {
        return this.f11401a;
    }

    public HealthTextView a() {
        return this.e;
    }

    public ImageView c() {
        return this.i;
    }

    private void o() {
        this.p.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.TrackChartViewHolder.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (TrackChartViewHolder.this.r.getWidth() + TrackChartViewHolder.this.p.getWidth() + TrackChartViewHolder.this.i.getWidth() + TrackChartViewHolder.this.e.getWidth() + qrs.d(TrackChartViewHolder.this.f11402b, 18.0f) <= TrackChartViewHolder.this.g.getWidth()) {
                    return;
                }
                if (!TrackChartViewHolder.this.h) {
                    float textSize = TrackChartViewHolder.this.r.getTextSize();
                    float textSize2 = TrackChartViewHolder.this.p.getTextSize();
                    TrackChartViewHolder.this.r.setTextSize(0, textSize - 1.0f);
                    TrackChartViewHolder.this.p.setTextSize(0, textSize2 - 1.0f);
                    return;
                }
                TrackChartViewHolder.this.r.setTextSize(0, qrs.d(TrackChartViewHolder.this.f11402b, 12.0f));
                TrackChartViewHolder.this.p.setTextSize(0, qrs.d(TrackChartViewHolder.this.f11402b, 12.0f));
            }
        });
    }
}
