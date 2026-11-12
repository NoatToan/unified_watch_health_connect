package com.huawei.health.suggestion.ui.fitness.mvp;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.CoachController;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class CaloriesConsumeHandler {
    private static final long e = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f9426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CaloriesRefreshCallback f9427c;
    private float d;
    private float f;
    private float h;
    private float j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Long, HiHealthData> f9425a = new HashMap(10);
    private boolean i = false;

    public interface CaloriesRefreshCallback {
        void onRefresh(float f);
    }

    public enum CaloriesSource {
        COURSE_PRESET,
        LINK_WEAR,
        EQUIPMENT
    }

    public CaloriesConsumeHandler(boolean z, boolean z2, CaloriesRefreshCallback caloriesRefreshCallback) {
        this.f9426b = new e(z, z2);
        this.f9427c = caloriesRefreshCallback;
    }

    public float e() {
        return this.f;
    }

    public float d() {
        return this.d;
    }

    public boolean c() {
        return this.i;
    }

    public void a(float f, float f2, CaloriesSource caloriesSource) {
        CaloriesSource caloriesSourceA = this.f9426b.a();
        if (caloriesSourceA.equals(caloriesSource)) {
            if (caloriesSourceA.equals(CaloriesSource.LINK_WEAR)) {
                this.i = true;
            }
            synchronized (this) {
                LogUtil.d("Suggestion_CaloriesConsumeHandler", "updateConsumeCalories:", Float.valueOf(f), " activeCalories:", Float.valueOf(f2), " mReferenceCalories:", Float.valueOf(this.h), " selectedSource:", caloriesSourceA, " mUsedSource:", this.f9426b.d);
                if (this.f9426b.d.equals(caloriesSourceA)) {
                    float f3 = this.h;
                    float f4 = f - f3;
                    if (f4 < 0.0f) {
                        LogUtil.e("Suggestion_CaloriesConsumeHandler", "consumeCalories:", Float.valueOf(f), " mReferenceCalories:", Float.valueOf(f3));
                    } else {
                        this.f += f4;
                    }
                    this.h = f;
                    float f5 = this.j;
                    float f6 = f2 - f5;
                    if (f6 < 0.0f) {
                        LogUtil.e("Suggestion_CaloriesConsumeHandler", "activeCaloriesIncrement:", Float.valueOf(f2), " mReferenceActiveCalories:", Float.valueOf(f5));
                    } else {
                        this.d += f6;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = e;
                        b((jCurrentTimeMillis / j) * j, f6);
                    }
                    this.j = this.d;
                    CaloriesRefreshCallback caloriesRefreshCallback = this.f9427c;
                    if (caloriesRefreshCallback != null) {
                        caloriesRefreshCallback.onRefresh(this.f);
                    }
                    CoachController.c().d(this.d);
                } else {
                    ReleaseLogUtil.d("Suggestion_CaloriesConsumeHandler", "switch source:", caloriesSourceA, " mUsedSource:", this.f9426b.d, " consumeCalories:", Float.valueOf(f), " mReferenceCalories:", Float.valueOf(this.h));
                    if (this.f == 0.0f) {
                        this.f = f;
                    }
                    if (this.d == 0.0f) {
                        this.d = f2;
                    }
                    this.h = f;
                    this.j = f2;
                    this.f9426b.d(caloriesSourceA);
                }
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9428a;
        private CaloriesSource d = CaloriesSource.COURSE_PRESET;
        private boolean e;

        e(boolean z, boolean z2) {
            this.e = z;
            this.f9428a = z2;
        }

        CaloriesSource a() {
            boolean zG = CoachController.c().g();
            if (this.e && zG) {
                return CaloriesSource.LINK_WEAR;
            }
            if (this.f9428a) {
                return CaloriesSource.EQUIPMENT;
            }
            return CaloriesSource.COURSE_PRESET;
        }

        void d(CaloriesSource caloriesSource) {
            this.d = caloriesSource;
        }
    }

    public Map<Long, HiHealthData> b() {
        return this.f9425a;
    }

    private void b(long j, float f) {
        HiHealthData hiHealthData = this.f9425a.get(Long.valueOf(j));
        if (hiHealthData != null) {
            hiHealthData.setValue(hiHealthData.getFloatValue() + f);
            return;
        }
        HiHealthData hiHealthData2 = new HiHealthData(4);
        hiHealthData2.setTimeInterval(j - TimeUnit.MINUTES.toMillis(1L), j);
        hiHealthData2.setValue(f);
        hiHealthData2.setDeviceUuid(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        this.f9425a.put(Long.valueOf(j), hiHealthData2);
    }
}
