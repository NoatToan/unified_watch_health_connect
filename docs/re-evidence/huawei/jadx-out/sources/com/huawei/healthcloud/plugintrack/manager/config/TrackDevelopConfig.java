package com.huawei.healthcloud.plugintrack.manager.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fla;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class TrackDevelopConfig {
    private Context e;
    private String h;
    private StorageParams i;
    private SharedPreferences j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10467a = true;
    private boolean d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10468b = true;
    private boolean g = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10469c = true;

    public TrackDevelopConfig(Context context) {
        if (context == null) {
            throw new RuntimeException("TrackDevelopConfig invalid params in constructor");
        }
        this.h = Integer.toString(20002);
        this.e = context;
        this.j = context.getSharedPreferences("TrackDevelopConfig", 0);
        StorageParams storageParams = new StorageParams();
        this.i = storageParams;
        storageParams.e(0);
    }

    public void d() {
        SharedPreferences sharedPreferences = this.j;
        if (sharedPreferences != null) {
            this.f10467a = sharedPreferences.getBoolean("StepEstimatedDitance", true);
            this.d = this.j.getBoolean("StaticDropGps", true);
            this.f10468b = this.j.getBoolean("LogConvert", true);
            this.g = this.j.getBoolean("TrackSmooth", true);
            this.f10469c = this.j.getBoolean("NeedStartFinding", true);
        }
    }

    private int b(String str, String str2) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        try {
            i = Integer.parseInt(str2);
            String strE = SharedPreferenceManager.e(this.e, this.h, str);
            return (strE == null || strE.isEmpty()) ? i : Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("Track_TrackDevelopConfig", e.getMessage());
            return i;
        }
    }

    private float d(String str, String str2) {
        float f = 0.0f;
        if (str == null) {
            return 0.0f;
        }
        try {
            f = Float.parseFloat(str2);
            String strE = SharedPreferenceManager.e(this.e, this.h, str);
            return (strE == null || strE.isEmpty()) ? f : Float.parseFloat(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("Track_TrackDevelopConfig", e.getMessage());
            return f;
        }
    }

    public int b(String str, int i) {
        return b(str, Integer.toString(i));
    }

    public boolean e() {
        return this.d;
    }

    public boolean c() {
        return this.f10467a;
    }

    public boolean a() {
        return this.f10468b;
    }

    public fla b() {
        fla flaVar = new fla();
        flaVar.e(d("filter_distance", "3"));
        flaVar.d(d("min_satellite_threshold_speed", "0.3"));
        flaVar.a(d("max_satellite_speed_multiple", "2.8"));
        flaVar.a(this.j.getBoolean("TrackSmooth", true));
        flaVar.c(this.j.getBoolean("NeedStartFinding", true));
        flaVar.d(b("min_dis_acc", "100"));
        flaVar.b(d("min_time_interval", "1.5"));
        flaVar.d(new float[]{d("max_speed_dis_bike", "12"), d("max_speed_dis_run", "12"), d("max_speed_dis_bike", "33.3")});
        LogUtil.a("Track_TrackDevelopConfig", "MIN_DISTANCE_REDUNDANCY :", Float.valueOf(flaVar.e()), " -- MIN_GPS_SPEED :", Float.valueOf(flaVar.d()), " -- FILTER_TIMES_OF_GPS_SPEED :", Float.valueOf(flaVar.a()), " -- NEED_SMOOTH :", Boolean.valueOf(flaVar.h()), " -- NEED_START_FINDING :", Boolean.valueOf(flaVar.f()), " -- MIN_GPS_ACCURACY :", Integer.valueOf(flaVar.c()), " -- MIN_TIME_INTERVAL :", Float.valueOf(flaVar.j()), " -- MAX_SPEED_DISTANCE_WALK :", Float.valueOf(flaVar.e(0)), " -- DEFAULT_MAX_SPEED_DISTANCE_RUN :", Float.valueOf(flaVar.e(1)), " -- MAX_SPEED_DISTANCE_BIKE :", Float.valueOf(flaVar.e(2)));
        return flaVar;
    }

    public long b(String str, long j) {
        String strE;
        if (str != null && (strE = SharedPreferenceManager.e(this.e, this.h, str)) != null && !strE.isEmpty()) {
            try {
                return Long.parseLong(strE);
            } catch (NumberFormatException e) {
                LogUtil.e("Track_TrackDevelopConfig", e.getMessage());
            }
        }
        return j;
    }

    public boolean c(String str, boolean z) {
        String strE;
        return (str == null || (strE = SharedPreferenceManager.e(this.e, this.h, str)) == null || strE.isEmpty()) ? z : "1".equals(strE);
    }
}
