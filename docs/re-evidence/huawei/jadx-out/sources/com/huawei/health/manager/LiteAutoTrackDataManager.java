package com.huawei.health.manager;

import android.os.Bundle;
import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import defpackage.chh;
import defpackage.npt;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LiteAutoTrackDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8047c;
    private ActivityCaloriesCalculateApi d;
    private long e;
    private float g = 0.5f;
    private int h;

    private void b() {
        float fC;
        UserInfo userInfoA = UserInfo.a();
        chh.c cVar = new chh.c();
        if (userInfoA != null) {
            fC = userInfoA.c() / 100.0f;
            cVar.c(userInfoA.e()).e(fC).c(userInfoA.j()).b(userInfoA.b());
        } else {
            fC = 1.7f;
        }
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        this.d = activityCaloriesCalculateApi;
        activityCaloriesCalculateApi.initUserInfo(cVar.c());
        float f = fC * 0.42f;
        this.g = f;
        ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", "init mUserStride is ", Float.valueOf(f));
    }

    public void d(int i) {
        this.f8046b = 180000 + i;
        ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", "init startTime is ", Integer.valueOf(i));
        b();
    }

    public void e(int i) {
        this.e = System.currentTimeMillis();
        this.f8047c = i;
        ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", npt.d("pre sport save steps base step is", Integer.valueOf(i)));
    }

    public void a(int i) {
        this.f8045a = System.currentTimeMillis() - this.e;
        int i2 = this.f8047c;
        if (i2 > i) {
            ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", "day is past one day");
            this.h = i;
        } else {
            this.h = i - i2;
            ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", npt.d("pre sport total steps ", Integer.valueOf(i)));
        }
    }

    public Bundle a() {
        float fCalculateCaloriesFromSteps;
        Bundle bundle = new Bundle();
        bundle.putLong("autoTrackTime", this.f8046b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRound = Math.round(this.h * (this.f8046b / 180000.0f));
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = this.d;
        if (activityCaloriesCalculateApi != null) {
            activityCaloriesCalculateApi.initCalculateCalories(jCurrentTimeMillis - ((long) this.f8046b), -1);
            fCalculateCaloriesFromSteps = ((float) this.d.calculateCaloriesFromSteps(jCurrentTimeMillis, iRound)) * 1000.0f;
        } else {
            fCalculateCaloriesFromSteps = 0.0f;
        }
        bundle.putParcelableArrayList("autoTrackStepList", d(jCurrentTimeMillis));
        bundle.putFloat("autoTrackCalories", fCalculateCaloriesFromSteps);
        bundle.putInt("autoTrackStep", iRound);
        int iRound2 = Math.round(iRound * this.g);
        bundle.putInt("autoTrackDistance", iRound2);
        ReleaseLogUtil.d("Track_LiteAutoTrackDataManager", npt.d("constructBundle total time is", Integer.valueOf(this.f8046b), "distance is ", Integer.valueOf(iRound2), "step is ", Integer.valueOf(this.h), "calorie is ", Float.valueOf(fCalculateCaloriesFromSteps)));
        return bundle;
    }

    private ArrayList<StepRateData> d(long j) {
        ArrayList<StepRateData> arrayList = new ArrayList<>(5);
        long j2 = j - ((long) this.f8046b);
        int iRound = Math.round(this.h / ((this.f8045a / 1000.0f) / 60.0f));
        while (true) {
            j2 += (long) 60000;
            if (j2 > j) {
                return arrayList;
            }
            arrayList.add(new StepRateData(j2, iRound));
        }
    }
}
