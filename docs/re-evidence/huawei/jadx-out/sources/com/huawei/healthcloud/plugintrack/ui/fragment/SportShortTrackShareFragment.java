package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.DynamicTimelineView;
import com.huawei.healthcloud.plugintrack.ui.view.TrackPaceColorGradientView;
import com.huawei.healthcloud.plugintrack.ui.view.WeatherInfoView;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.up.model.UserInfomation;
import defpackage.een;
import defpackage.irz;
import defpackage.izn;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jbr;
import defpackage.jpq;
import defpackage.jqp;
import defpackage.jqq;
import defpackage.jst;
import defpackage.jxi;
import defpackage.jxq;
import defpackage.njj;
import defpackage.njv;
import defpackage.njy;
import defpackage.nub;
import defpackage.qqf;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportShortTrackShareFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f11103a;
    private HealthTextView aa;
    private jqp ab = null;
    private HealthTextView ac;
    private HealthTextView ad;
    private WeatherInfoView ae;
    private HealthTextView af;
    private LinearLayout ah;
    private HealthTextView ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11105c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private ImageView k;
    private ImageView l;
    private int m;
    private Bitmap n;
    private HealthTextView o;
    private HealthTextView p;
    private Matrix q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private LinearLayout u;
    private HealthTextView v;
    private LinearLayout w;
    private View x;
    private HealthTextView y;
    private TrackPaceColorGradientView z;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = jbr.c().b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x = layoutInflater.inflate(R.layout.track_fragment_sport_share_short_track, viewGroup, false);
        this.f11105c = getActivity();
        jqp jqpVarD = jbr.c().d();
        this.ab = jqpVarD;
        if (jqpVarD == null) {
            return new View(this.f11105c);
        }
        jaa.d(this.f11105c);
        this.m = jaa.e(this.f11105c);
        j();
        c();
        i();
        a();
        return this.x;
    }

    private void j() {
        if (this.n != null) {
            this.k = (ImageView) this.x.findViewById(R.id.track_share_short_map);
            this.l = (ImageView) this.x.findViewById(R.id.sport_track_map_mask);
            this.q = new Matrix();
            this.k.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SportShortTrackShareFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = SportShortTrackShareFragment.this.n.getWidth();
                    int height = SportShortTrackShareFragment.this.n.getHeight();
                    float width2 = SportShortTrackShareFragment.this.k.getWidth();
                    float f = width;
                    float f2 = width2 / f;
                    float height2 = SportShortTrackShareFragment.this.k.getHeight();
                    float f3 = height;
                    float f4 = height2 / f3;
                    if (f2 > f4) {
                        SportShortTrackShareFragment.this.q.setScale(f2, f2);
                        if (!SportShortTrackShareFragment.this.ab.ba()) {
                            SportShortTrackShareFragment.this.q.postTranslate(0.0f, -(((f3 * f2) - height2) / 2.0f));
                        }
                    } else {
                        SportShortTrackShareFragment.this.q.setScale(f4, f4);
                        if (!SportShortTrackShareFragment.this.ab.ba()) {
                            SportShortTrackShareFragment.this.q.postTranslate(-(((f * f4) - width2) / 2.0f), 0.0f);
                        }
                    }
                    SportShortTrackShareFragment.this.k.setImageMatrix(SportShortTrackShareFragment.this.q);
                    SportShortTrackShareFragment.this.k.setImageBitmap(SportShortTrackShareFragment.this.n);
                    SportShortTrackShareFragment.this.k();
                }
            });
        } else {
            LogUtil.j("Track_ShortTrackShareFragment", "map is null!");
        }
        d();
        this.z = (TrackPaceColorGradientView) this.x.findViewById(R.id.img_track_share_pace_gradient);
        if (LanguageUtil.ba(this.f11105c)) {
            this.z.setRotationY(180.0f);
        }
        if (LanguageUtil.c(this.f11105c)) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                LogUtil.e("Track_ShortTrackShareFragment", "object is not instanceof LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            this.j.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ImageView imageView = this.l;
        if (imageView == null) {
            LogUtil.j("Track_ShortTrackShareFragment", "map mask is null");
            return;
        }
        int i = this.m;
        if (i == 2 || i == 3) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void d() {
        this.f = (HealthTextView) this.x.findViewById(R.id.track_detail_map_sport_distance_value);
        this.j = (HealthTextView) this.x.findViewById(R.id.text_targetUnit);
        this.y = (HealthTextView) this.x.findViewById(R.id.track_detail_map_sport_type);
        this.e = (HealthTextView) this.x.findViewById(R.id.track_detail_map_sport_type_dayime);
        this.g = (HealthTextView) this.x.findViewById(R.id.track_main_page_left_datatype);
        this.h = (HealthTextView) this.x.findViewById(R.id.track_detail_map_sport_during_time);
        this.i = (HealthTextView) this.x.findViewById(R.id.track_main_page_left_unit);
        this.f11104b = (HealthTextView) this.x.findViewById(R.id.track_detail_map_calorie_value);
        this.v = (HealthTextView) this.x.findViewById(R.id.track_main_page_right_unit);
        this.t = (HealthTextView) this.x.findViewById(R.id.track_main_page_right_datatype);
        this.r = (HealthTextView) this.x.findViewById(R.id.track_detail_map_speed_value);
        this.u = (LinearLayout) this.x.findViewById(R.id.track_detail_linear_layout);
        this.w = (LinearLayout) this.x.findViewById(R.id.layout_otherValues);
        this.p = (HealthTextView) this.x.findViewById(R.id.txt_track_share_map_max_pace_value);
        this.s = (HealthTextView) this.x.findViewById(R.id.txt_track_share_map_min_pace_value);
        this.ai = (HealthTextView) this.x.findViewById(R.id.track_share_detail_title_username);
        this.d = (HealthTextView) this.x.findViewById(R.id.track_detail_map_speed_value_unit);
        this.f11103a = (HealthTextView) this.x.findViewById(R.id.track_main_page_mid_datatype);
        this.aa = (HealthTextView) this.x.findViewById(R.id.triathlon_map_sport_distance_value);
        this.ad = (HealthTextView) this.x.findViewById(R.id.triathlon_map_sport_during_time);
        this.ac = (HealthTextView) this.x.findViewById(R.id.triathlon_map_sport_calorie_value);
        this.ah = (LinearLayout) this.x.findViewById(R.id.triathlon_detail_layout);
        this.af = (HealthTextView) this.x.findViewById(R.id.triathlon_text_targetUnit);
        this.o = (HealthTextView) this.x.findViewById(R.id.map_type);
        this.ae = (WeatherInfoView) this.x.findViewById(R.id.weather_info_view);
        g();
    }

    private void g() {
        int i = this.m;
        if (i == 1) {
            this.o.setVisibility(0);
            this.o.setText(this.f11105c.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode));
        } else if (i == 2) {
            this.o.setVisibility(0);
            this.o.setText(this.f11105c.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_google));
        } else if (i == 3) {
            this.o.setVisibility(0);
            this.o.setText(this.f11105c.getResources().getString(R.string.IDS_hw_petal_maps));
        } else {
            this.o.setVisibility(0);
        }
    }

    private void a() {
        String strA;
        String strE;
        MotionPathSimplify motionPathSimplifyD = this.ab.d();
        if (motionPathSimplifyD == null) {
            LogUtil.j("Track_ShortTrackShareFragment", "simplify is null");
            this.u.setVisibility(8);
            return;
        }
        double dRequestTotalDistance = ((double) motionPathSimplifyD.requestTotalDistance()) / 1000.0d;
        float fRequestAvgPace = motionPathSimplifyD.requestAvgPace();
        if (motionPathSimplifyD.requestSportType() == 222) {
            fRequestAvgPace = motionPathSimplifyD.requestTotalTime() / motionPathSimplifyD.getExtendDataFloat("wayPointDistance");
        }
        if (jpq.g(motionPathSimplifyD.requestSportType())) {
            this.j.setText(R.string.IDS_fitness_data_list_activity_meter_unit);
        } else if (UnitUtil.f()) {
            dRequestTotalDistance = UnitUtil.e(dRequestTotalDistance, 3);
            this.j.setText(R.string.IDS_band_data_sport_distance_unit_en);
            this.af.setText(R.string.IDS_band_data_sport_distance_unit_en);
            fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace, 3);
        }
        if (fRequestAvgPace <= 0.0f) {
            strA = getString(R.string.IDS_motiontrack_show_invalid_data);
        } else if (jpq.g(motionPathSimplifyD.requestSportType())) {
            strA = izn.a(fRequestAvgPace / 2.0f);
        } else {
            strA = izn.a(fRequestAvgPace);
        }
        if (dRequestTotalDistance <= 0.0d) {
            strE = getString(R.string.IDS_motiontrack_show_invalid_data);
        } else if (jpq.g(motionPathSimplifyD.requestSportType())) {
            strE = UnitUtil.c(motionPathSimplifyD.requestTotalDistance(), 1, 0, false);
        } else {
            strE = UnitUtil.e(dRequestTotalDistance, 1, 2);
        }
        this.r.setText(strA);
        e(motionPathSimplifyD, strE, fRequestAvgPace);
        o();
    }

    private void o() {
        MotionPathSimplify motionPathSimplifyD = this.ab.d();
        if (motionPathSimplifyD == null || motionPathSimplifyD.requestExtendDataMap() == null) {
            LogUtil.e("Track_ShortTrackShareFragment", "initWeatherInfoView motionPathSimplify is null, return");
            this.ae.setVisibility(8);
            return;
        }
        boolean zC = jxi.c(motionPathSimplifyD);
        LogUtil.a("Track_ShortTrackShareFragment", "initWeatherInfoView hashWeatherInfo:" + zC);
        if (zC) {
            this.ae.setVisibility(0);
            this.ae.a(motionPathSimplifyD);
        } else {
            this.ae.setVisibility(8);
        }
    }

    private void e(MotionPathSimplify motionPathSimplify, String str, float f) {
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        if (this.ab.ay()) {
            List<RelativeSportData> listRequestChildSportItems = motionPathSimplify.requestChildSportItems();
            if (njy.b(listRequestChildSportItems) && listRequestChildSportItems.get(0) != null) {
                jRequestStartTime = listRequestChildSportItems.get(0).getStartTime();
            }
        }
        this.e.setText(UnitUtil.d("yyyy/M/d H:mm", jRequestStartTime));
        n();
        this.f11104b.setText(jpq.d(motionPathSimplify.requestTotalCalories()));
        this.f.setText(str);
        String strE = UnitUtil.e(((int) motionPathSimplify.requestTotalTime()) / 1000);
        this.h.setText(strE);
        d(motionPathSimplify);
        if (this.ab.ay()) {
            f();
            return;
        }
        if (motionPathSimplify.requestSportType() == 260) {
            e(motionPathSimplify, f);
            return;
        }
        if (motionPathSimplify.requestSportType() == 259 || jpq.h(motionPathSimplify.requestSportType())) {
            c(f);
            return;
        }
        if (motionPathSimplify.requestSportType() == 262 || motionPathSimplify.requestSportType() == 266) {
            e(motionPathSimplify);
            return;
        }
        if (nub.c(motionPathSimplify.requestSportType())) {
            b(motionPathSimplify, f);
            return;
        }
        if (motionPathSimplify.requestSportType() == 512) {
            c(motionPathSimplify, str, strE);
        } else if (motionPathSimplify.requestSportType() == 222) {
            a(motionPathSimplify, f);
        } else {
            LogUtil.e("Track_ShortTrackShareFragment", "not request sport type");
        }
    }

    private void f() {
        this.x.findViewById(R.id.layout_middata).setVisibility(8);
    }

    private void a(MotionPathSimplify motionPathSimplify, float f) {
        this.f.setText(izn.c(motionPathSimplify.requestTotalTime(), R.style.sport_day_hour_min_num_38dp, R.style.sport_day_hour_min_unit_14dp));
        this.j.setVisibility(8);
        this.g.setText(R.string.IDS_hw_sport_waypoint_mileage);
        int extendDataInt = motionPathSimplify.getExtendDataInt("wayPointDistance");
        this.h.setText(extendDataInt == 0 ? this.f11105c.getString(R.string.IDS_motiontrack_show_invalid_data) : jpq.b(extendDataInt));
        this.i.setVisibility(0);
        this.x.findViewById(R.id.layout_middata).setVisibility(8);
        this.t.setText(this.f11105c.getString(R.string.IDS_hw_sport_waypoint_averagespeed));
        this.f11104b.setText(jpq.h(f));
        if (UnitUtil.f()) {
            this.i.setText(R.string.IDS_motiontrack_show_sport_unit_mi);
            this.v.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            this.i.setText(R.string.IDS_motiontrack_show_sport_unit_km);
            this.v.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
    }

    private void n() {
        MotionPathSimplify motionPathSimplifyD = this.ab.d();
        if (motionPathSimplifyD != null) {
            String extendDataString = motionPathSimplifyD.getExtendDataString("alias");
            if (!TextUtils.isEmpty(extendDataString)) {
                this.y.setText(extendDataString);
                return;
            }
            if (this.ab.ay()) {
                this.y.setText(qre.f(R.string.IDS_workout_record_merge_tracks));
                return;
            }
            if (motionPathSimplifyD.requestRunCourseId() != null) {
                String strD = jaa.d(this.f11105c, this.ab.d().requestRunCourseId(), this.ab.d().getExtendDataString("courseName", ""));
                if (TextUtils.isEmpty(strD)) {
                    this.y.setText(jaa.d(this.f11105c, motionPathSimplifyD.requestSportType()));
                    return;
                } else {
                    this.y.setText(strD);
                    return;
                }
            }
            if (jaa.a(motionPathSimplifyD)) {
                this.y.setText(getString(R.string.IDS_lactate_threshold_measurement));
                return;
            }
            if (this.ab.ba()) {
                this.y.setText(getString(R.string.IDS_track_route_draw_sport_graffiti));
            } else if (motionPathSimplifyD.requestSportType() == 227) {
                this.y.setText(jqq.e(motionPathSimplifyD.requestExtendDataMap()));
            } else {
                this.y.setText(jaa.d(this.f11105c, motionPathSimplifyD.requestSportType()));
            }
        }
    }

    private void c(MotionPathSimplify motionPathSimplify, String str, String str2) {
        this.u.setVisibility(0);
        this.w.setVisibility(8);
        this.ah.setVisibility(0);
        this.aa.setText(str);
        this.ad.setText(str2);
        this.ac.setText(jpq.d(motionPathSimplify.requestTotalCalories()));
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        this.d.setVisibility(0);
        this.r.setText(c(motionPathSimplify.requestAvgPace()));
        this.d.setText(jpq.e(this.f11105c));
        if (UnitUtil.f()) {
            this.j.setText(this.f11105c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(UnitUtil.e(this.ab.d().requestTotalDistance(), 2))));
        } else {
            this.j.setText(this.f11105c.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
        }
        int iRequestTotalDistance = this.ab.d().requestTotalDistance();
        if (iRequestTotalDistance > 0) {
            this.f.setText(jpq.f(iRequestTotalDistance));
        } else {
            this.f.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_invalid_data));
        }
    }

    private void c(float f) {
        this.f11103a.setText(this.f11105c.getString(R.string.IDS_motiontrack_show_detail_averagespeed));
        this.d.setVisibility(0);
        this.r.setText(jpq.h(f));
        if (UnitUtil.f()) {
            this.d.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            this.d.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
    }

    private void b(MotionPathSimplify motionPathSimplify, float f) {
        String strH;
        int iRequestSportType = motionPathSimplify.requestSportType();
        this.d.setVisibility(0);
        if (nub.e(iRequestSportType)) {
            strH = jpq.d(motionPathSimplify.requestTotalDistance(), TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime()));
            this.g.setText(qre.f(R.string.IDS_motiontrack_show_detail_ski_time));
            this.f11103a.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_ski_speed));
            this.f11104b.setText(String.valueOf(motionPathSimplify.getExtendDataInt("skiTripTimes", 0)));
            this.v.setVisibility(8);
            this.t.setText(R.string.IDS_motiontrack_show_detail_laps);
        } else {
            this.f11103a.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_averagespeed));
            strH = jpq.h(f);
        }
        this.r.setText(strH);
        if (UnitUtil.f()) {
            this.d.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            this.d.setText(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
        if (nub.b(motionPathSimplify.requestSportType())) {
            h();
        }
    }

    private void h() {
        MotionPathSimplify motionPathSimplifyD = this.ab.d();
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(motionPathSimplifyD.requestTotalTime());
        int extendDataInt = motionPathSimplifyD.getExtendDataInt("skiCableTime", -1);
        int extendDataInt2 = motionPathSimplifyD.getExtendDataInt("skiFreeTime", -1);
        if (seconds <= 0 || extendDataInt <= 0) {
            ReleaseLogUtil.d("Track_ShortTrackShareFragment", "initSkiTimeline skiTime or skiCableTime invalid");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jst(qre.a(R.string.IDS_track_slide_format, UnitUtil.e(seconds)), Color.parseColor("#FB6522"), seconds));
        arrayList.add(new jst(qre.a(R.string.IDS_track_cable_format, UnitUtil.e(extendDataInt)), Color.parseColor("#13B2E7"), extendDataInt));
        if (extendDataInt2 > 0) {
            arrayList.add(new jst(qre.a(R.string.IDS_track_rest_format, UnitUtil.e(extendDataInt2)), Color.parseColor("#BCC4CF"), extendDataInt2));
        }
        DynamicTimelineView dynamicTimelineView = (DynamicTimelineView) this.x.findViewById(R.id.share_ski_dynamic_timeline);
        dynamicTimelineView.setSegments(arrayList);
        dynamicTimelineView.setVisibility(0);
    }

    private void e(MotionPathSimplify motionPathSimplify, float f) {
        String string;
        String strE;
        double dRequestCreepingWave = motionPathSimplify.requestCreepingWave() / 10.0f;
        if (dRequestCreepingWave <= 1.0E-6d) {
            c(f);
            return;
        }
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(dRequestCreepingWave, 1);
            string = this.f11105c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(dE));
            strE = UnitUtil.e(dE, 1, 2);
        } else {
            string = this.f11105c.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
            strE = UnitUtil.e(dRequestCreepingWave, 1, 1);
        }
        this.r.setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.x.findViewById(R.id.track_detail_map_speed_value_unit);
        healthTextView.setText(string);
        healthTextView.setVisibility(0);
        ((HealthTextView) this.x.findViewById(R.id.track_main_page_mid_datatype)).setText(this.f11105c.getResources().getString(R.string.IDS_hwh_motiontrack_total_climbed));
    }

    private void d(MotionPathSimplify motionPathSimplify) {
        Float[] fArrA;
        List<njj> listBg = this.ab.bg();
        if (listBg != null && listBg.size() >= 2 && this.ab.c(this.f11105c) && (fArrA = this.ab.a(listBg)) != null && fArrA.length >= 2) {
            b(motionPathSimplify, fArrA);
        } else {
            e();
        }
        if (jpq.g(motionPathSimplify.requestSportType())) {
            this.d.setVisibility(0);
            this.d.setText(qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500));
        }
    }

    private void e() {
        this.p.setVisibility(8);
        this.s.setVisibility(8);
        this.z.setVisibility(8);
    }

    private void b(MotionPathSimplify motionPathSimplify, Float[] fArr) {
        if (jpq.i(motionPathSimplify.requestSportType())) {
            String strE = e(fArr[0]);
            String strE2 = e(fArr[1]);
            if (jpq.e(this.ab) && jpq.d(this.ab)) {
                strE2 = jpq.a(this.ab, true);
                strE = jpq.e(this.ab, true);
            } else if (jpq.e(this.ab) && !jpq.d(this.ab)) {
                this.p.setVisibility(4);
                this.s.setVisibility(4);
            } else {
                LogUtil.d("Track_ShortTrackShareFragment", "no valid show speed chart");
            }
            this.p.setText(((Object) this.p.getText()) + " " + strE);
            this.s.setText(((Object) this.s.getText()) + " " + strE2);
        } else if (motionPathSimplify.requestSportType() == 262 || motionPathSimplify.requestSportType() == 266) {
            this.p.setText(c(fArr[0].floatValue()) + " " + jpq.e(this.f11105c));
            this.p.setText(c((double) fArr[1].floatValue()) + " " + jpq.e(this.f11105c));
        } else {
            this.p.setText(((Object) this.p.getText()) + " " + izn.a(fArr[0].floatValue()));
            this.s.setText(((Object) this.s.getText()) + " " + izn.a(fArr[1].floatValue()));
        }
        MotionPath motionPathB = this.ab.b();
        if (motionPathB != null) {
            Float[] fArrB = njv.b(motionPathB.requestPaceList());
            List<Integer> listA = izt.a(fArrB[1].floatValue(), fArrB[0].floatValue(), motionPathSimplify.requestSportType());
            if (njy.e(listA)) {
                return;
            }
            this.z.setColors(listA);
            this.p.setTextColor(listA.get(listA.size() - 1).intValue());
            this.s.setTextColor(listA.get(0).intValue());
        }
    }

    private String c(double d) {
        float fC = ((float) d) / 10.0f;
        double d2 = fC;
        if (d2 > 360000.0d || d2 <= 3.6d) {
            return getString(R.string.IDS_motiontrack_show_invalid_data);
        }
        if (UnitUtil.f()) {
            fC = (float) UnitUtil.c(d2, 2);
        }
        return izn.a(fC);
    }

    private String e(Float f) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(jpq.h(f.floatValue()));
        stringBuffer.append(" ");
        if (UnitUtil.f()) {
            stringBuffer.append(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            stringBuffer.append(this.f11105c.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
        return stringBuffer.toString();
    }

    private void c() {
        int iRequestDeviceType = this.ab.d().requestDeviceType();
        int iA = SportSupportUtil.a(this.ab.d().requestTrackType(), iRequestDeviceType);
        HealthTextView healthTextView = (HealthTextView) this.x.findViewById(R.id.track_detail_map_sport_device_name);
        if (iA == 0) {
            String strB = jxq.b(this.ab.d());
            if (TextUtils.isEmpty(strB)) {
                healthTextView.setVisibility(8);
                return;
            } else {
                healthTextView.setVisibility(0);
                healthTextView.setText(strB);
                return;
            }
        }
        Context context = this.f11105c;
        healthTextView.setText(een.e(iRequestDeviceType, context, context.getPackageName(), this.ab.d().requestProductId(), this.ab.d().requestSubProductId()));
    }

    private void i() {
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        if (!socialShareCenterApi.isShowUserInfo()) {
            b();
            return;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        String shareNickName = socialShareCenterApi.getShareNickName();
        this.ai.setText(shareNickName);
        ImageView imageView = (ImageView) this.x.findViewById(R.id.track_share_short_image);
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        String picPath = userInfo != null ? userInfo.getPicPath() : null;
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this.f11105c, picPath);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                LogUtil.j("Track_ShortTrackShareFragment", "handleWhenGetUserInfoSuccess()bmp != null ");
            }
        } else {
            LogUtil.j("Track_ShortTrackShareFragment", "handleWhenGetUserInfoSuccess()! headImgPath is null! ");
        }
        if (Utils.o() && TextUtils.isEmpty(shareNickName)) {
            imageView.setVisibility(8);
        }
        m();
    }

    private void b() {
        this.ai.setVisibility(4);
        this.x.findViewById(R.id.track_share_short_image).setVisibility(8);
    }

    private void m() {
        LogUtil.a("Track_ShortTrackShareFragment", "queryMemberInfo");
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA == null) {
            LogUtil.j("Track_ShortTrackShareFragment", "userMemberInfo is null");
            return;
        }
        if (userMemberInfoA.getMemberFlag() != 1) {
            LogUtil.j("Track_ShortTrackShareFragment", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
            return;
        }
        if (irz.d(userMemberInfoA)) {
            LogUtil.a("Track_ShortTrackShareFragment", "isVipExpired");
            return;
        }
        HealthImageView healthImageView = (HealthImageView) this.x.findViewById(R.id.member_card_vip_icon);
        if (healthImageView == null) {
            return;
        }
        healthImageView.setVisibility(0);
    }

    public void b(Bitmap bitmap) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void b(boolean z) {
        WeatherInfoView weatherInfoView = this.ae;
        if (weatherInfoView != null) {
            weatherInfoView.a(z);
        }
        HealthTextView healthTextView = this.o;
        if (healthTextView != null) {
            if (z) {
                healthTextView.setTextColor(ContextCompat.getColor(BaseApplication.b(), R.color.font_dark_secondary));
            } else {
                healthTextView.setTextColor(ContextCompat.getColor(BaseApplication.b(), R.color.health_secondary_color));
            }
        }
    }
}
