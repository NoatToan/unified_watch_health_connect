package health.compact.a;

import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import defpackage.chg;
import defpackage.chh;
import defpackage.lsl;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OneMinuteStepData implements Serializable {
    private static final long serialVersionUID = 4576504675226376880L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36623c;
    private int d;
    private int e;

    public OneMinuteStepData(int i, long j, int i2, int i3, int i4) {
        this.f36623c = i;
        this.f36621a = j;
        this.d = i2;
        this.e = i3;
        this.f36622b = i4;
    }

    public void c(int i, long j, int i2, int i3, int i4) {
        this.f36623c = i;
        this.f36621a = j;
        this.d = i2;
        this.e = i3;
        this.f36622b = i4;
    }

    private boolean b(long j) {
        int iE = (int) TimeUtil.e(lsl.r(j));
        long j2 = this.f36621a;
        return j2 >= ((long) iE) && j2 < ((long) (iE + ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL));
    }

    public boolean j() {
        return b(System.currentTimeMillis());
    }

    public long e() {
        return this.f36621a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(this.f36621a);
        stringBuffer.append(",");
        stringBuffer.append(this.f36623c);
        stringBuffer.append(",");
        stringBuffer.append(this.d);
        stringBuffer.append(",");
        stringBuffer.append(this.e);
        stringBuffer.append(",");
        stringBuffer.append(this.f36622b);
        return stringBuffer.toString();
    }

    public int d() {
        return this.f36623c;
    }

    public void d(int i, int i2) {
        this.d += i;
        this.e += i2;
    }

    public void a(int i) {
        this.f36622b = i;
    }

    public int b() {
        return this.d;
    }

    public boolean g() {
        int i;
        if (this.e > 0) {
            this.f36622b = 20004;
            return true;
        }
        if (this.d > 0 || (i = this.f36622b) == 20005) {
            return true;
        }
        return (i == 20003 || i == 20002) ? false : true;
    }

    public void c(String str, List<HiHealthData> list) {
        a(str, 2, this.d, list);
    }

    public void a(String str, UserInfo userInfo, List<HiHealthData> list) {
        a(str, 4, d(userInfo), list);
    }

    public double d(UserInfo userInfo) {
        double dCalculateCalories;
        int i = this.f36622b;
        if (i != 20005 && i != 20004 && this.d == 0) {
            return 0.0d;
        }
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        chh.c cVar = new chh.c();
        if (userInfo != null) {
            cVar.c(userInfo.e()).e(userInfo.c() / 100.0f).c(userInfo.j()).b(userInfo.b());
        }
        activityCaloriesCalculateApi.initUserInfo(cVar.c());
        long j = this.f36621a * 60000;
        long j2 = 60000 + j;
        float f = this.d / 60.0f;
        int i2 = this.f36622b;
        if (i2 == 20005) {
            activityCaloriesCalculateApi.initCalculateCalories(j, 259);
            dCalculateCalories = activityCaloriesCalculateApi.calculateCalories(j2);
        } else if (i2 == 20004) {
            activityCaloriesCalculateApi.initCalculateCalories(j, 261);
            dCalculateCalories = activityCaloriesCalculateApi.calculateCalories(j2);
        } else if (i2 == 20003) {
            activityCaloriesCalculateApi.initCalculateCalories(j, 258);
            dCalculateCalories = activityCaloriesCalculateApi.calculateCalories(j2, new chg.c().b(f).b());
        } else {
            activityCaloriesCalculateApi.initCalculateCalories(j, 257);
            dCalculateCalories = activityCaloriesCalculateApi.calculateCalories(j2, new chg.c().b(f).b());
        }
        return dCalculateCalories * 1000.0d;
    }

    public void b(String str, UserInfo userInfo, List<HiHealthData> list) {
        a(str, 3, e(userInfo), list);
    }

    public int e(UserInfo userInfo) {
        if (userInfo == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_OneMinuteStepData", "userInfo == null");
            return 0;
        }
        return (int) (CalculateDistanceUtils.e(this.d, userInfo.c()) * 1000.0d);
    }

    public void a(String str, List<HiHealthData> list) {
        int i = this.e;
        if (i > 0) {
            a(str, 5, i, list);
        }
    }

    public void b(String str, List<HiHealthData> list) {
        int i = this.f36622b;
        a(str, i, i, list);
    }

    private void a(String str, int i, double d, List<HiHealthData> list) {
        long j = this.f36621a * 60000;
        if (!HiValidatorUtil.b(i, d)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_OneMinuteStepData", "checkLocalDataValue false");
            return;
        }
        if (str == null || list == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_OneMinuteStepData", "(deviceUuid == null) || (dataList == null)");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setTimeInterval(j, 60000 + j);
        hiHealthData.setValue(d);
        hiHealthData.setDeviceUuid(str);
        list.add(hiHealthData);
    }

    public int a() {
        return this.e;
    }

    public int c() {
        return this.f36622b;
    }
}
