package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.AchievePopMessageManager;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper;
import defpackage.fsj;
import defpackage.fsv;
import defpackage.ftl;
import defpackage.iov;
import defpackage.lmf;
import defpackage.qho;
import defpackage.qre;
import defpackage.qrs;
import defpackage.ujq;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordThreeCircleProvider extends MinorProvider<fsj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fsj f26551c;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.f26551c = new fsj();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, fsj fsjVar) {
        LogUtil.b("SCUI_ActiveRecordThreeCircleProvider", "parseParams data is ", fsjVar);
        if (ftl.d(fsjVar, this.f26551c)) {
            map.put("SECTION_HEALTH_DICT_BEAN", null);
        } else {
            d(fsjVar);
            map.put("SECTION_HEALTH_DICT_BEAN", e());
        }
    }

    private void d(fsj fsjVar) {
        if (fsjVar == null || fsjVar.t() == 0) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "setActiveRecordData data is null");
            return;
        }
        this.f26551c.c(fsjVar.f());
        this.f26551c.n(fsjVar.u());
        this.f26551c.o(fsjVar.x());
        this.f26551c.e(fsjVar.g());
        this.f26551c.a(fsjVar.i());
        this.f26551c.m(fsjVar.p());
        this.f26551c.l(fsjVar.q());
        this.f26551c.c(fsjVar.o());
        this.f26551c.e(fsjVar.h());
        this.f26551c.a(fsjVar.b());
        this.f26551c.d(fsjVar.j());
        this.f26551c.d(fsjVar.c());
        this.f26551c.e(fsjVar.ag());
        this.f26551c.b(fsjVar.w());
        this.f26551c.c(fsjVar.v());
        this.f26551c.k(fsjVar.y());
        this.f26551c.p(fsjVar.ad());
        this.f26551c.t(fsjVar.ab());
        this.f26551c.e(fsjVar.t());
        this.f26551c.g(fsjVar.s());
    }

    private fsv e() {
        fsv fsvVar = new fsv();
        fsvVar.d(this.f26551c.j());
        fsvVar.a(this.f26551c.h());
        fsvVar.d(this.f26551c.s());
        e(fsvVar);
        j(fsvVar);
        i(fsvVar);
        a(fsvVar);
        fsvVar.c(this.f26551c.h() > 0.0f || this.f26551c.o());
        final HashMap map = new HashMap();
        map.put("click", "1");
        fsvVar.a(new View.OnClickListener() { // from class: tuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(map, view);
            }
        });
        h(fsvVar);
        c(fsvVar);
        return fsvVar;
    }

    public /* synthetic */ void b(Map map, View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
            return;
        }
        ujq.a(2, 6);
        map.put("type", "2");
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HOME_STEP_CLIMB_2010047.value(), map, 0);
        c(this.f26551c.h() * 10.0f, this.f26551c.f());
    }

    private void c(fsv fsvVar) {
        AchievePopMessageManager achievePopMessageManager = new AchievePopMessageManager(this.f26551c, BaseApplication.b());
        fsv.c cVar = new fsv.c();
        cVar.e = achievePopMessageManager.b();
        cVar.d = achievePopMessageManager.e();
        cVar.f34516c = achievePopMessageManager.d();
        cVar.f34515a = achievePopMessageManager.c();
        fsvVar.d(cVar);
    }

    private void a(fsv fsvVar) {
        d(fsvVar);
        b(fsvVar);
    }

    private void h(final fsv fsvVar) {
        fsvVar.d(new View.OnClickListener() { // from class: tul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(fsvVar, view);
            }
        });
    }

    public /* synthetic */ void b(fsv fsvVar, View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
        } else {
            qho.e(this.f26551c.f(), fsvVar.g());
        }
    }

    private void d(fsv fsvVar) {
        fsv.a aVar = new fsv.a();
        if (this.f26551c.ag()) {
            aVar.d = qre.f(R.string.IDS_settings_steps);
            aVar.e = UnitUtil.e(this.f26551c.u(), 1, 0);
            aVar.f34511c = qre.f(R.string.IDS_plugin_achievement_report_steps);
            aVar.f34510b = R.drawable.ic_health_steps;
            aVar.f34509a = new View.OnClickListener() { // from class: tun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49683a.b(view);
                }
            };
        } else {
            c(fsvVar, aVar);
        }
        fsvVar.e(aVar);
    }

    public /* synthetic */ void b(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
        } else {
            b(this.f26551c.u(), this.f26551c.f());
        }
    }

    private void c(fsv fsvVar, fsv.a aVar) {
        aVar.d = qre.f(R.string.IDS_sport_distance);
        double dFloatValue = new BigDecimal(Float.toString(fsvVar.d())).divide(new BigDecimal("1"), 2, 4).floatValue();
        if (UnitUtil.f()) {
            dFloatValue = UnitUtil.e(dFloatValue, 3);
            aVar.f34511c = qre.f(R.string.IDS_band_data_sport_distance_unit_en);
        } else {
            aVar.f34511c = qre.f(R.string.IDS_motiontrack_show_sport_unit_km);
        }
        aVar.e = UnitUtil.e(dFloatValue, 1, 2);
        aVar.f34510b = R.drawable.ic_health_distance;
        aVar.f34509a = new View.OnClickListener() { // from class: tuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49680b.e(view);
            }
        };
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        d();
    }

    private void d() {
        ujq.b(2);
        ujq.a(2, 5);
        e(this.f26551c.j(), this.f26551c.f());
    }

    private void b(fsv fsvVar) {
        fsv.a aVar = new fsv.a();
        if (this.f26551c.ag()) {
            c(fsvVar, aVar);
        } else {
            aVar.d = qre.f(R.string.IDS_start_track_target_type_calorie);
            aVar.f34511c = qre.f(R.string.IDS_hw_show_sport_cal_unit);
            aVar.e = UnitUtil.e(this.f26551c.b(), 1, 0);
            aVar.f34510b = R.drawable.ic_health_kcal;
            aVar.f34509a = new View.OnClickListener() { // from class: tup
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49684a.c(view);
                }
            };
        }
        fsvVar.c(aVar);
    }

    public /* synthetic */ void c(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
        } else {
            a();
        }
    }

    public void a() {
        ujq.a(2, 4);
        d(this.f26551c.b(), this.f26551c.f());
    }

    private void j(fsv fsvVar) {
        fsv.b bVar = new fsv.b();
        bVar.f34513b = qre.f(R.string.IDS_active_workout);
        bVar.g = this.f26551c.i();
        bVar.j = this.f26551c.g();
        a(bVar);
        bVar.f34512a = new View.OnClickListener() { // from class: tum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.i(view);
            }
        };
        if (this.f26551c.ag()) {
            bVar.i = R.drawable.ic_health_workout_dot;
            bVar.e = new int[]{com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.new_time_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_time_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_time_circle_process_third_color), com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.new_time_circle_process_end_color)};
            bVar.f34514c = new int[]{com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.new_time_circle_bg_start_color), com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.new_time_circle_bg_end_color)};
        } else {
            bVar.i = R.drawable.ic_health_orange;
            bVar.e = new int[]{com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.strength_circle_process_start_color), com.huawei.hwcommonmodel.application.BaseApplication.getContext().getColor(R.color.strength_circle_process_end_color)};
            bVar.f34514c = new int[]{BaseApplication.b().getColor(R.color.strength_circle_bottom_start_color), BaseApplication.b().getColor(R.color.strength_circle_bottom_end_color)};
        }
        c(bVar, R.plurals.IDS_single_circle_intensity_target_desc);
        fsvVar.e(1, bVar);
    }

    public /* synthetic */ void i(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
            return;
        }
        ujq.b(4);
        ujq.a(2, 2);
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) FitnessSportIntensityDetailActivity.class);
        intent.putExtra("today_current_middle_and_high_total", this.f26551c.g());
        intent.putExtra("default_time_millis", this.f26551c.f());
        iov.d(BaseApplication.b(), intent);
    }

    private void a(fsv.b bVar) {
        if (WheelChairStateManager.a().d()) {
            bVar.h = R.drawable.wheel_excise_icon;
        } else {
            bVar.h = R.drawable.ic_time_xxxhdpi;
        }
    }

    private void i(fsv fsvVar) {
        fsv.b bVar = new fsv.b();
        bVar.f34513b = qho.e(R.string.IDS_three_circle_card_activity_hours);
        bVar.g = this.f26551c.q();
        bVar.j = this.f26551c.p();
        if (WheelChairStateManager.a().d()) {
            bVar.h = R.drawable.wheel_activity_icon;
        } else {
            bVar.h = R.drawable.ic_excise_xxxhdpi;
        }
        bVar.f34512a = new View.OnClickListener() { // from class: tuu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h(view);
            }
        };
        if (this.f26551c.ag()) {
            bVar.i = R.drawable.ic_health_blue;
            bVar.e = new int[]{BaseApplication.b().getColor(R.color.new_activity_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_activity_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_activity_circle_process_third_color), BaseApplication.b().getColor(R.color.new_activity_circle_process_end_color)};
            bVar.f34514c = new int[]{BaseApplication.b().getColor(R.color.third_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.third_bg_circle_bottom_end_color)};
        } else {
            bVar.i = R.drawable.ic_health_red;
            bVar.e = new int[]{BaseApplication.b().getColor(R.color.activity_circle_process_start_color), BaseApplication.b().getColor(R.color.activity_circle_process_end_color)};
            bVar.f34514c = new int[]{BaseApplication.b().getColor(R.color.activity_circle_bottom_start_color), BaseApplication.b().getColor(R.color.activity_circle_bottom_end_color)};
        }
        c(bVar, R.plurals.IDS_hour_unit);
        fsvVar.e(2, bVar);
    }

    public /* synthetic */ void h(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
            return;
        }
        ujq.b(3);
        ujq.a(2, 3);
        KnitActiveHoursActivity.a(BaseApplication.b(), this.f26551c.f());
    }

    private void c(fsv.b bVar, int i) {
        bVar.d = ftl.d(BaseApplication.b(), ftl.a(bVar.j), qre.e(i, bVar.j, qre.a(R.string.IDS_current_total_time, ftl.a(bVar.j), ftl.a(bVar.g))));
    }

    private void e(fsv fsvVar) {
        fsv.b bVar = new fsv.b();
        if (this.f26551c.ag()) {
            bVar.g = this.f26551c.c();
            bVar.j = this.f26551c.b();
            bVar.f34513b = qre.f(R.string.IDS_active_caloric);
            bVar.i = R.drawable.ic_health_calorie_dot;
            bVar.h = R.drawable.ic_heat_xxxhdpi_df;
            bVar.f34512a = new View.OnClickListener() { // from class: tug
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49679b.a(view);
                }
            };
            bVar.e = new int[]{BaseApplication.b().getColor(R.color.new_cal_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_cal_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_cal_circle_process_third_color), BaseApplication.b().getColor(R.color.new_cal_circle_process_end_color)};
            bVar.f34514c = new int[]{BaseApplication.b().getColor(R.color.first_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.first_bg_circle_bottom_end_color)};
            c(bVar, R.plurals.IDS_kcalories_unit);
        } else {
            bVar.i = R.drawable.ic_health_blue;
            bVar.g = this.f26551c.x();
            bVar.j = this.f26551c.u();
            bVar.f34513b = qre.f(R.string.IDS_settings_steps);
            bVar.h = R.drawable.ic_step_xxxhdpi_df;
            bVar.f34512a = new View.OnClickListener() { // from class: tuh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            };
            bVar.e = new int[]{BaseApplication.b().getColor(R.color.step_circle_process_start_color), BaseApplication.b().getColor(R.color.step_circle_process_end_color)};
            bVar.f34514c = new int[]{BaseApplication.b().getColor(R.color.step_circle_bottom_start_color), BaseApplication.b().getColor(R.color.step_circle_bottom_end_color)};
            c(bVar, R.plurals.IDS_hwh_me_other_target_steps);
        }
        fsvVar.e(0, bVar);
    }

    public /* synthetic */ void a(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
        } else {
            a();
        }
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            LogUtil.e("SCUI_ActiveRecordThreeCircleProvider", "click too fast.");
        } else {
            b(this.f26551c.u(), this.f26551c.f());
        }
    }

    private void d(int i, long j) {
        ReleaseLogUtil.d("SCUI_ActiveRecordThreeCircleProvider", "click into calories = ", Integer.valueOf(i));
        ujq.d();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setClass(BaseApplication.b(), FitnessCalorieDetailActivity.class);
        intent.putExtra("bundle_key_data", bundle);
        intent.putExtra("today_current_colories_total", i * 1000);
        intent.putExtra("default_time_millis", j);
        iov.d(BaseApplication.b(), intent);
        if (BaseApplication.j() != null) {
            BaseApplication.j().overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    private void e(float f, long j) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) FitnessDistanceDetailActivity.class);
        intent.putExtra("today_current_distance_total", (int) (f * 1000.0f));
        intent.putExtra("default_time_millis", j);
        iov.d(BaseApplication.b(), intent);
        if (BaseApplication.j() != null) {
            BaseApplication.j().overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    private void b(int i, long j) {
        ujq.b(1);
        ujq.a(2, 1);
        StepModuleChartStorageHelper.b(true);
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) FitnessStepDetailActivity.class);
        intent.putExtra("today_current_steps_total", i);
        intent.putExtra("default_time_millis", j);
        iov.d(BaseApplication.b(), intent);
        if (BaseApplication.j() != null) {
            BaseApplication.j().overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    private void c(float f, long j) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setClass(BaseApplication.b(), FitnessClimbDetailActivity.class);
        intent.putExtra("bundle_key_data", bundle);
        intent.putExtra("today_current_climb_total", (int) f);
        intent.putExtra("default_time_millis", j);
        iov.d(BaseApplication.b(), intent);
        if (BaseApplication.j() != null) {
            BaseApplication.j().overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }
}
