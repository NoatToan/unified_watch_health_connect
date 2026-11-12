package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class fgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f34031a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile fgp f34032c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34033b;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private float j;

    public static fgp d() {
        if (f34032c == null) {
            synchronized (f34031a) {
                if (f34032c == null) {
                    f34032c = new fgp();
                }
            }
        }
        return f34032c;
    }

    public void d(final int i, final ResponseCallback responseCallback) {
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "initPersonParam callback = ", responseCallback);
        if (responseCallback == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: fgt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(i, responseCallback);
            }
        });
    }

    /* synthetic */ void b(int i, ResponseCallback responseCallback) {
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "initPersonParam start");
        final CountDownLatch countDownLatch = new CountDownLatch(4);
        final int[] iArr = new int[3];
        final UserInfomation[] userInfomationArr = new UserInfomation[1];
        b(new ResponseCallback() { // from class: fgm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                fgp.c(iArr, userInfomationArr, countDownLatch, i2, (UserInfomation) obj);
            }
        });
        final int[] iArr2 = new int[1];
        a(new ResponseCallback() { // from class: fgo
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                fgp.a(iArr, iArr2, countDownLatch, i2, (Integer) obj);
            }
        });
        final float[] fArr = new float[1];
        c(new ResponseCallback() { // from class: fgq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                fgp.b(iArr, fArr, countDownLatch, i2, (Float) obj);
            }
        });
        HeartRateConfigHelper heartRateConfigHelper = new HeartRateConfigHelper(i, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: fgs
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            c(userInfomationArr[0], iArr2[0], fArr[0], heartRateConfigHelper);
            if (c(iArr)) {
                responseCallback.onResponse(0, null);
            } else {
                responseCallback.onResponse(-1, null);
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_HRControl_PersonalParamHelper", "initPersonParam time out");
            c(null, 0, 0.0f, null);
            responseCallback.onResponse(-2, null);
        }
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "initPersonParam end");
    }

    static /* synthetic */ void c(int[] iArr, UserInfomation[] userInfomationArr, CountDownLatch countDownLatch, int i, UserInfomation userInfomation) {
        iArr[0] = i;
        userInfomationArr[0] = userInfomation;
        countDownLatch.countDown();
    }

    static /* synthetic */ void a(int[] iArr, int[] iArr2, CountDownLatch countDownLatch, int i, Integer num) {
        iArr[1] = i;
        iArr2[0] = num.intValue();
        countDownLatch.countDown();
    }

    static /* synthetic */ void b(int[] iArr, float[] fArr, CountDownLatch countDownLatch, int i, Float f) {
        iArr[2] = i;
        fArr[0] = f.floatValue();
        countDownLatch.countDown();
    }

    public int c() {
        return this.d;
    }

    public float j() {
        return this.j;
    }

    public float a() {
        return this.h;
    }

    public int h() {
        return this.g;
    }

    public int e() {
        return this.f;
    }

    public int b() {
        return this.f34033b;
    }

    private boolean c(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    private void c(UserInfomation userInfomation, int i, float f, HeartRateConfigHelper heartRateConfigHelper) {
        int ageOrDefaultValue;
        float weightOrDefaultValue;
        int heightOrDefaultValue;
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "setPersonalParamOfProcessed userInformation = ", userInfomation == null ? Constants.NULL : userInfomation.toString(), ", vo2Max = ", Integer.valueOf(i), ", runData = ", Float.valueOf(f), ", heartRateConfigHelper = ", heartRateConfigHelper);
        if (userInfomation != null) {
            ageOrDefaultValue = userInfomation.getAgeOrDefaultValue();
            weightOrDefaultValue = userInfomation.getWeightOrDefaultValue();
            heightOrDefaultValue = userInfomation.getHeightOrDefaultValue();
        } else {
            ageOrDefaultValue = 0;
            weightOrDefaultValue = 0.0f;
            heightOrDefaultValue = 0;
        }
        int iA = a(heartRateConfigHelper);
        int iD = d(heartRateConfigHelper);
        this.d = fgz.d(ageOrDefaultValue);
        this.j = fgz.e(weightOrDefaultValue);
        this.e = fgz.c(heightOrDefaultValue);
        this.g = fgz.a(i);
        this.h = fgz.c(f, i, weightOrDefaultValue, heightOrDefaultValue);
        this.f = fgz.e(iA);
        int iC = fgz.c(iD, ageOrDefaultValue);
        this.f34033b = iC;
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "setPersonalParamOfProcessed mAgeOfProcessed = ", Integer.valueOf(this.d), ", mWeightOfProcessed = ", Float.valueOf(this.j), ", mHeightOfProcessed = ", Integer.valueOf(this.e), ", mVo2MaxOfProcessed = ", Integer.valueOf(this.g), ", mRunDataOfProcessed = ", Float.valueOf(this.h), ", mRestHeartRateOfProcessed = ", Integer.valueOf(this.f), ", mMaxHeartRateOfProcessed = ", Integer.valueOf(iC));
    }

    private void b(ResponseCallback<UserInfomation> responseCallback) {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        LogUtil.a("HRControl_PersonalParamHelper", "getUserInfo userProfileMgrApi = ", userProfileMgrApi);
        if (userProfileMgrApi == null) {
            responseCallback.onResponse(-1, null);
        } else {
            responseCallback.onResponse(0, userProfileMgrApi.getLocalUserInfo());
        }
    }

    private void a(final ResponseCallback<Integer> responseCallback) {
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class);
        LogUtil.a("HRControl_PersonalParamHelper", "getVo2Max healthDataMgrApi = ", healthDataMgrApi);
        if (healthDataMgrApi == null) {
            responseCallback.onResponse(-1, 0);
        } else {
            LogUtil.a("HRControl_PersonalParamHelper", "getVo2Max start");
            healthDataMgrApi.getLastVo2max(new IBaseResponseCallback() { // from class: fgr
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    fgp.e(responseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a("HRControl_PersonalParamHelper", "getVo2Max end errorCode = ", Integer.valueOf(i), ", objData = ", obj);
        if (i != 0) {
            responseCallback.onResponse(-1, 0);
        } else if (obj instanceof Vo2maxDetail) {
            responseCallback.onResponse(0, Integer.valueOf(((Vo2maxDetail) obj).getVo2maxValue()));
        } else {
            responseCallback.onResponse(-1, 0);
        }
    }

    private void c(final ResponseCallback<Float> responseCallback) {
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        LogUtil.a("HRControl_PersonalParamHelper", "getLastRunData start");
        gcn.c().getUserRunLevelDataByRq(iB, iB, 0, new IBaseResponseCallback() { // from class: fgu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                fgp.d(responseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a("HRControl_PersonalParamHelper", "getLastRunData end errorCode = ", Integer.valueOf(i), ", objData = ", obj);
        Float fValueOf = Float.valueOf(0.0f);
        if (i != 200) {
            responseCallback.onResponse(-1, fValueOf);
        } else if (obj instanceof GetRunLevelRsp) {
            responseCallback.onResponse(0, Float.valueOf(((GetRunLevelRsp) obj).getUserRunLevelData().getLastCurrentRunLevel()));
        } else {
            responseCallback.onResponse(-1, fValueOf);
        }
    }

    private int a(HeartRateConfigHelper heartRateConfigHelper) {
        HeartZoneConf heartZoneConfC;
        if (heartRateConfigHelper == null || (heartZoneConfC = heartRateConfigHelper.c()) == null) {
            return 0;
        }
        int restHeartRate = heartZoneConfC.getRestHeartRate();
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "getRestHeartRate restHeartRate = ", Integer.valueOf(restHeartRate));
        return restHeartRate;
    }

    private int d(HeartRateConfigHelper heartRateConfigHelper) {
        HeartZoneConf heartZoneConfC;
        if (heartRateConfigHelper == null || (heartZoneConfC = heartRateConfigHelper.c()) == null) {
            return 0;
        }
        int maxThreshold = heartZoneConfC.getMaxThreshold();
        ReleaseLogUtil.d("R_HRControl_PersonalParamHelper", "getMaxHeartRate maxHeartRate = ", Integer.valueOf(maxThreshold));
        return maxThreshold;
    }
}
