package defpackage;

import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class iyc {
    private ActivityCaloriesCalculateApi e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38196a = 0;
    private float h = 60.0f;
    private final iye d = new iye();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iye f38198c = new iyf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f38197b = new AtomicBoolean(false);

    public void d(UserInfomation userInfomation, long j, int i) {
        this.f38196a = i;
        if (userInfomation == null) {
            userInfomation = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        }
        if (userInfomation != null) {
            float weightOrDefaultValue = userInfomation.getWeightOrDefaultValue();
            if (weightOrDefaultValue > 0.0f) {
                this.h = weightOrDefaultValue;
            }
        }
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        this.e = activityCaloriesCalculateApi;
        activityCaloriesCalculateApi.initUserInfo(chh.a(userInfomation));
        e(j, i);
        LogUtil.a("Track_CalorieManager", "mStartSportTime ", Long.valueOf(j), " mSportType ", Integer.valueOf(i));
    }

    public void e(long j, int i) {
        if (this.e != null) {
            ReleaseLogUtil.d("Track_CalorieManager", "timestamp ", Long.valueOf(j), " sportType ", Integer.valueOf(i));
            this.e.initCalculateCalories(j, i);
            this.f38197b.set(true);
        }
    }

    public void c(float f, long j, float f2, float f3) {
        if (!this.f38197b.get()) {
            ReleaseLogUtil.d("Track_CalorieManager", "mTotalCalorieCalculate not initialized");
            return;
        }
        int i = this.f38196a;
        if (i == 260) {
            this.d.e(f, j, this.h);
            this.f38198c.e(f, j, this.h);
        } else {
            this.d.c(this.e, f2, f3, i);
            this.f38198c.c(this.e, f2, f3, this.f38196a);
        }
    }

    public void e(float f) {
        this.d.d(f);
        this.f38198c.d(f);
    }

    public float d() {
        return this.f38198c.c();
    }

    public float a() {
        return this.d.c();
    }

    public void b(float f) {
        this.f38198c.b(f);
    }

    public void d(float f) {
        this.d.b(f);
    }

    public void a(float f) {
        this.f38198c.c(f);
    }

    public void c(float f) {
        this.d.c(f);
    }
}
