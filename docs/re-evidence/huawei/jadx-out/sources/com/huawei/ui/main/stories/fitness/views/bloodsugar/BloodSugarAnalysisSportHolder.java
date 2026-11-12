package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarFeedbackActivity;
import defpackage.idy;
import defpackage.iov;
import defpackage.nlt;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.umd;
import defpackage.umg;
import defpackage.uvz;
import defpackage.vrg;
import defpackage.wuc;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class BloodSugarAnalysisSportHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27201c;
    private HealthTextView d;
    private HealthTextView e;
    private umd f;
    private HealthTextView g;
    private HealthTextView h;
    private Context i;
    private HealthTextView j;
    private HealthDivider k;
    private HealthTextView l;
    private HealthDivider m;
    private LinearLayout n;
    private RelativeLayout o;
    private LinearLayout q;
    private View r;

    public BloodSugarAnalysisSportHolder(View view) {
        super(view);
        this.i = view.getContext();
        this.r = view;
        this.q = (LinearLayout) view.findViewById(R.id.blood_sugar_sport_before);
        this.o = (RelativeLayout) view.findViewById(R.id.blood_sugar_sport_sport);
        this.n = (LinearLayout) view.findViewById(R.id.blood_sugar_sport_after);
        this.l = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_description);
        this.k = (HealthDivider) view.findViewById(R.id.blood_sugar_sport_des_divide);
        this.m = (HealthDivider) view.findViewById(R.id.blood_sugar_sport_after_divide);
        this.g = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_before_diff_num);
        this.h = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_before_diff_status);
        this.f27200b = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_before_diff_period);
        this.j = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_before_dietTime);
        this.e = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_after_diff_num);
        this.f27199a = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_after_diff_status);
        this.f27201c = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_after_diff_period);
        this.d = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_after_dietTime);
        this.q.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }

    public void a(umd umdVar) {
        if (umdVar == null) {
            LogUtil.j("BloodSugarAnalysisSportHolder", "BloodSugarSportBean is null!");
            return;
        }
        this.f = umdVar;
        String strA = umdVar.a();
        if (strA == null || "".equals(strA)) {
            this.l.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setText(strA);
        }
        this.g.setText(e(umdVar.d().getFloatValue()));
        e(this.h, umdVar.d().getType(), umdVar.d().getFloatValue());
        d(this.f27200b, umdVar.d().getType());
        this.j.setText(UnitUtil.d("HH:mm", umdVar.d().getStartTime()));
        a(this.r, umdVar.e());
        if (umdVar.b().getFloatValue() == 0.0f || umdVar.b().getStartTime() == 0) {
            this.n.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        this.m.setVisibility(0);
        this.e.setText(e(umdVar.b().getFloatValue()));
        e(this.f27199a, umdVar.b().getType(), umdVar.b().getFloatValue());
        d(this.f27201c, umdVar.b().getType());
        this.d.setText(UnitUtil.d("HH:mm", umdVar.b().getStartTime()));
    }

    private static void a(View view, umg umgVar) {
        e((HealthTextView) view.findViewById(R.id.blood_sugar_sport_sport_distance), (HealthTextView) view.findViewById(R.id.blood_sugar_sport_sport_distance_unit), umgVar);
        ((HealthTextView) view.findViewById(R.id.blood_sugar_sport_sportStart)).setText(UnitUtil.d("HH:mm", umgVar.getStartTime()));
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_heartRate);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.blood_sugar_sport_heartRate_unit);
        ImageView imageView = (ImageView) view.findViewById(R.id.blood_sugar_sport_heartRate_img);
        if (umgVar.getAvgHeartRate() == 0 && umgVar.getTotalCalories() == 0) {
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (umgVar.getAvgHeartRate() > 0) {
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            imageView.setVisibility(0);
            healthTextView.setText(String.valueOf(UnitUtil.e(umgVar.getAvgHeartRate(), 1, 0)));
            healthTextView2.setText(R.string.IDS_main_watch_heart_rate_unit_string);
            if (c()) {
                imageView.setBackground(qqz.e(BaseApplication.b(), R.mipmap.ic_bloodsugar_heart));
            } else {
                imageView.setBackgroundResource(R.mipmap.ic_bloodsugar_heart);
            }
        } else {
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            imageView.setVisibility(0);
            healthTextView.setText(UnitUtil.e(((double) umgVar.getTotalCalories()) / 1000.0d, 1, 0));
            healthTextView2.setText(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit);
            if (c()) {
                imageView.setBackground(qqz.e(BaseApplication.b(), R.mipmap.ic_bloodsugar_heat));
            } else {
                imageView.setBackgroundResource(R.mipmap.ic_bloodsugar_heat);
            }
        }
        d(view, umgVar);
    }

    private static void d(View view, umg umgVar) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        ((HealthTextView) view.findViewById(R.id.blood_sugar_sport_sport_duration)).setText(UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(umgVar.getTotalTime())));
        ImageView imageView = (ImageView) view.findViewById(R.id.blood_sugar_sport_sport_img_bg);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.blood_sugar_sport_sport_img);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.blood_sugar_sport_sport_duration_img);
        Drawable drawableB = vrg.b(context, umgVar.getSportType());
        imageView.setBackground(qqf.c(context.getDrawable(R.drawable.icon_bg), vrg.c(context, umgVar.getSportType())));
        if (c()) {
            imageView2.setBackground(qqz.e(context, drawableB));
            imageView3.setImageDrawable(qqz.e(context, R.mipmap.ic_excercise_time));
        } else {
            imageView2.setBackground(drawableB);
            imageView3.setBackgroundResource(R.mipmap.ic_excercise_time);
        }
        HashMap map = new HashMap(16);
        map.put("type", 0);
        map.put(ParsedFieldTag.NPES_SPORT_TIME, Long.valueOf(umgVar.getStartTime()));
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_SPORT_2040139.value();
        map.put("click", "1");
        idy.b(strValue, map);
    }

    private static void e(HealthTextView healthTextView, HealthTextView healthTextView2, umg umgVar) {
        int sportType = umgVar.getSportType();
        if (sportType != 262) {
            if (sportType == 265) {
                healthTextView.setText(UnitUtil.e(((double) umgVar.getTotalCalories()) / 1000.0d, 1, 0));
                healthTextView2.setText(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit);
                return;
            } else if (sportType != 266) {
                String strE = e();
                healthTextView.setText(UnitUtil.e(new BigDecimal(umgVar.getTotalDistance()).divide(new BigDecimal(1000), 2, 4).doubleValue(), 1, 2));
                healthTextView2.setText(strE);
                return;
            }
        }
        String strC = c(umgVar.getTotalDistance());
        healthTextView.setText(UnitUtil.e(umgVar.getTotalDistance(), 1, 2));
        healthTextView2.setText(strC);
    }

    private static String c(int i) {
        if (UnitUtil.f()) {
            return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, i);
        }
        return BaseApplication.b().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    private static String e() {
        if (UnitUtil.f()) {
            return BaseApplication.b().getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return BaseApplication.b().getResources().getString(R.string.IDS_band_data_sport_distance_unit);
    }

    public static boolean c() {
        return LanguageUtil.ba(BaseApplication.b());
    }

    private String e(float f) {
        return UnitUtil.e(f, 1, 1) + this.i.getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol);
    }

    private void e(HealthTextView healthTextView, int i, float f) {
        try {
            int i2 = Integer.parseInt(uvz.d(this.i, i, f).get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"));
            if (i2 != 1) {
                if (i2 != 2) {
                    switch (i2) {
                        case 1001:
                            d(healthTextView, R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low, R.color.color_blood_low);
                            break;
                        case 1002:
                            d(healthTextView, R.string.IDS_hw_health_show_healthdata_status_low, R.color.color_blood_low);
                            break;
                        case 1003:
                            break;
                        case 1004:
                            break;
                        case 1005:
                        case 1006:
                            d(healthTextView, R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high, R.color.color_blood_high);
                            break;
                        default:
                            Object[] objArr = new Object[1];
                            objArr[0] = "no support blood type";
                            LogUtil.j("BloodSugarAnalysisSportHolder", objArr);
                            break;
                    }
                    return;
                }
                d(healthTextView, R.string.IDS_hw_health_show_healthdata_status_high, R.color.color_blood_high);
                return;
            }
            d(healthTextView, R.string.IDS_hw_health_show_healthdata_status_normal, R.color.color_blood_normal);
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodSugarAnalysisSportHolder", "NumberFormatException : setDiffStatusText key can not parseInt");
        }
    }

    private void d(HealthTextView healthTextView, int i, int i2) {
        healthTextView.setText(this.i.getResources().getString(i));
        healthTextView.setTextColor(this.i.getResources().getColor(i2));
    }

    private void d(HealthTextView healthTextView, int i) {
        if (i != 2106) {
            switch (i) {
                case 2008:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_breakfast));
                    break;
                case 2009:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast));
                    break;
                case 2010:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch));
                    break;
                case 2011:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch));
                    break;
                case 2012:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner));
                    break;
                case 2013:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner));
                    break;
                case 2014:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep));
                    break;
                case 2015:
                    healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_early_morning));
                    break;
                default:
                    LogUtil.j("BloodSugarAnalysisSportHolder", "no support Period");
                    break;
            }
            return;
        }
        healthTextView.setText(this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_random_time));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        umd umdVar = this.f;
        if (umdVar == null) {
            LogUtil.j("BloodSugarAnalysisSportHolder", "onClick mData is null");
        } else if (view == this.o) {
            c(umdVar.e());
        } else {
            d(view);
        }
    }

    private void d(View view) {
        Intent intent = new Intent();
        intent.setClass(this.i, BloodSugarFeedbackActivity.class);
        if (view == this.q) {
            intent.putExtra("bloodTimePeriod", this.f.d().getType());
            intent.putExtra("time", this.f.d().getStartTime());
            intent.putExtra("bloodNum", CommonUtil.a(String.valueOf(this.f.d().getFloatValue())));
            intent.putExtra("bloodSugarDataIsFromMeter", wuc.d(this.f.d().getInt("trackdata_deviceType")));
            intent.putExtra("clientId", this.f.d().getClientId());
            intent.putExtra(ParsedFieldTag.TASK_MODIFY_TIME, this.f.d().getModifiedTime());
            d(0, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_SPORT_FINGER_2040136.value());
        } else {
            intent.putExtra("bloodTimePeriod", this.f.b().getType());
            intent.putExtra("time", this.f.b().getStartTime());
            intent.putExtra("bloodNum", CommonUtil.a(String.valueOf(this.f.b().getFloatValue())));
            intent.putExtra("bloodSugarDataIsFromMeter", wuc.d(this.f.b().getInt("trackdata_deviceType")));
            intent.putExtra("clientId", this.f.b().getClientId());
            intent.putExtra(ParsedFieldTag.TASK_MODIFY_TIME, this.f.b().getModifiedTime());
            d(1, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_SPORT_FINGER_2040136.value());
        }
        intent.putExtra("isEdit", true);
        intent.putExtra("titleName", this.i.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_history));
        intent.putExtra("pageFrom", 1);
        intent.addFlags(268435456);
        iov.d(BaseApplication.b(), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i, String str) {
        HashMap map = new HashMap(16);
        map.put("type", Integer.valueOf(i));
        map.put("click", "1");
        idy.b(str, map);
    }

    private static void c(umg umgVar) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(umgVar.getStartTime(), umgVar.getEndTime());
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarAnalysisSportHolder.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("BloodSugarAnalysisSportHolder", "goToSportDetail object not SparseArray");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("BloodSugarAnalysisSportHolder", "goToSportDetail map none");
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                arrayList.addAll(BloodSugarAnalysisSportHolder.a((SparseArray<Object>) sparseArray));
                if (arrayList.isEmpty()) {
                    LogUtil.j("BloodSugarAnalysisSportHolder", "goToSportDetail healthDataList isEmpty");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
                if (hiHealthData == null) {
                    LogUtil.j("BloodSugarAnalysisSportHolder", "goToSportDetail hiHealthData is null");
                    return;
                }
                MotionPathSimplify motionPathSimplifyD = nlt.d(hiHealthData);
                String strC = nlt.c(hiHealthData, motionPathSimplifyD);
                if (strC == null) {
                    LogUtil.j("BloodSugarAnalysisSportHolder", "goToSportDetail fileUrl is null");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("simplifyDatakey", motionPathSimplifyD);
                bundle.putString("contentpath", strC);
                Intent intent = new Intent(BaseApplication.b(), (Class<?>) TrackDetailActivity.class);
                intent.putExtras(bundle);
                intent.addFlags(268435456);
                BloodSugarAnalysisSportHolder.d(1, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_SPORT_MONITORING_2040133.value());
                iov.d(BaseApplication.b(), intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> a(SparseArray<Object> sparseArray) {
        Object obj = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (obj instanceof List) {
            try {
                return (List) obj;
            } catch (ClassCastException unused) {
                health.compact.a.util.LogUtil.c("BloodSugarAnalysisSportHolder", "filterHiHealthDataList, is not List<HiHealthData>");
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }
}
