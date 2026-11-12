package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class iou {
    public static void d(DeviceInfo deviceInfo) {
        LogUtil.a("HealthGlanceHelper", "device is : ", deviceInfo);
        a(deviceInfo, i());
    }

    public static boolean a(DeviceInfo deviceInfo, iob iobVar) {
        ReleaseLogUtil.d("R_HealthGlanceHelper", "sendHealthGlanceSampleEvent");
        String strD = HiJsonUtil.d(iobVar);
        LogUtil.a("HealthGlanceHelper", "healthGlanceDataResult json is : ", strD);
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.healthGlanceMgr");
        eeeVar.setWearPkgName("hw.watch.health.healthcheck");
        eeeVar.setCommandId(2);
        eeeVar.a(80030006L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.a(strD)));
        LogUtil.a("HealthGlanceHelper", "sendHealthGlanceSampleEvent SampleEvent: ", eeeVar.toString());
        return edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "HealthGlanceHelper");
    }

    private static iob i() {
        LogUtil.a("HealthGlanceHelper", "getHealthGlance start");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        iob iobVar = new iob();
        c(iobVar);
        c(countDownLatch, iobVar);
        try {
            ReleaseLogUtil.d("R_HealthGlanceHelper", "getHealthGlance is ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("R_HealthGlanceHelper", "getHealthGlance interrupted");
        }
        LogUtil.a("HealthGlanceHelper", "getHealthGlance is " + iobVar);
        return iobVar;
    }

    public static void c(iob iobVar) {
        LogUtil.a("HealthGlanceHelper", "getHeight start");
        UserInfomation userInfoFromDbSync = LoginInit.getInstance(BaseApplication.b()).getUserInfoFromDbSync();
        if (userInfoFromDbSync == null) {
            LogUtil.j("HealthGlanceHelper", "userInformation is null");
            return;
        }
        int height = userInfoFromDbSync.getHeight();
        LogUtil.a("HealthGlanceHelper", "height is : ", Integer.valueOf(height));
        if (height != 0) {
            iobVar.e(Integer.valueOf(height));
        }
    }

    private static List<HiDataReadProOption> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e());
        arrayList.add(c());
        arrayList.add(a());
        arrayList.add(b());
        if (Utils.o()) {
            arrayList.add(d());
        }
        return arrayList;
    }

    private static HiDataReadProOption e() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.d(System.currentTimeMillis(), -30), System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{2004});
        hiDataReadOption.setSortOrder(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).a(true).b();
    }

    private static HiDataReadProOption c() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.d(System.currentTimeMillis(), -30), System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.BODY_FAT_RATE.value()});
        hiDataReadOption.setSortOrder(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    private static HiDataReadProOption a() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.d(System.currentTimeMillis(), -30), System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{2006, 2007});
        hiDataReadOption.setSortOrder(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    private static HiDataReadProOption b() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.d(System.currentTimeMillis(), -30), System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.FATTY_LIVER_RISK.value(), DicDataTypeUtil.DataType.FATTY_LIVER_GRADE.value()});
        hiDataReadOption.setSortOrder(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    private static HiDataReadProOption d() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.d(System.currentTimeMillis(), -30), System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.OSA_LEVEL.value()});
        hiDataReadOption.setSortOrder(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    public static void c(final CountDownLatch countDownLatch, final iob iobVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ior
            @Override // java.lang.Runnable
            public final void run() {
                iou.b(countDownLatch, iobVar);
            }
        });
    }

    static /* synthetic */ void b(final CountDownLatch countDownLatch, final iob iobVar) {
        LogUtil.a("HealthGlanceHelper", "getLatestHealthGlanceData start");
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).readHiHealthDataEx(j(), new HiDataReadResultListener() { // from class: iou.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HealthGlanceHelper", "getLatestHealthGlanceData error code ", Integer.valueOf(i));
                if (i == 0) {
                    if (!(obj instanceof SparseArray)) {
                        countDownLatch.countDown();
                        return;
                    }
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        iou.j(sparseArray, iobVar);
                        iou.i(sparseArray, iobVar);
                        iou.g(sparseArray, iobVar);
                        iou.h(sparseArray, iobVar);
                        iou.f(sparseArray, iobVar);
                    } else {
                        LogUtil.j("HealthGlanceHelper", "sparseArray data is null");
                        countDownLatch.countDown();
                        return;
                    }
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(SparseArray<Object> sparseArray, iob iobVar) {
        List arrayList = new ArrayList();
        Object obj = sparseArray.get(2004);
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HealthGlanceHelper", "getLatestWeight is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        double value = hiHealthData.getValue();
        LogUtil.a("HealthGlanceHelper", "getLatestWeight weight is : ", Double.valueOf(value));
        if (value != 0.0d) {
            iobVar.e(Float.valueOf((float) value));
            iobVar.c(Long.valueOf(hiHealthData.getStartTime()));
        }
        if (iobVar.e().intValue() == 0 || iobVar.b().floatValue() == 0.0f) {
            return;
        }
        double d = UnitUtil.d(((double) iobVar.b().floatValue()) / Math.pow(((double) iobVar.e().intValue()) / 100.0d, 2.0d), 1);
        LogUtil.a("HealthGlanceHelper", "getLatestWeight bmi is : ", Double.valueOf(d));
        iobVar.b(Float.valueOf((float) d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(SparseArray<Object> sparseArray, iob iobVar) {
        long startTime;
        double value;
        List arrayList = new ArrayList();
        Object obj = sparseArray.get(DicDataTypeUtil.DataType.BODY_FAT_RATE.value());
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HealthGlanceHelper", "getFatPercentage is empty");
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                startTime = 0;
                value = 0.0d;
                break;
            }
            HiHealthData hiHealthData = (HiHealthData) arrayList.get(i);
            if (TextUtils.equals(hiHealthData.getMetaData(), "NULL") || TextUtils.equals(hiHealthData.getMetaData(), "0")) {
                value = hiHealthData.getValue();
                startTime = hiHealthData.getStartTime();
                break;
            }
            i++;
        }
        LogUtil.a("HealthGlanceHelper", "getLatestFatPercentage is ： ", Double.valueOf(value));
        if (value != 0.0d) {
            iobVar.a(Float.valueOf(String.valueOf(value)));
            iobVar.d(Long.valueOf(startTime));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(SparseArray<Object> sparseArray, iob iobVar) {
        List arrayList = new ArrayList();
        Object obj = sparseArray.get(2006);
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HealthGlanceHelper", "getLatestHighBloodPressureList is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        double value = hiHealthData.getValue();
        List arrayList2 = new ArrayList();
        Object obj2 = sparseArray.get(2007);
        if (njy.b(obj2, HiHealthData.class)) {
            arrayList2 = (List) obj2;
        }
        if (njy.e(arrayList2)) {
            LogUtil.j("HealthGlanceHelper", "getLatestLowBloodPressureList is empty");
            return;
        }
        double value2 = ((HiHealthData) arrayList2.get(0)).getValue();
        LogUtil.a("HealthGlanceHelper", "highBloodPressure is : ", Double.valueOf(value), " lowBloodPressure is : ", Double.valueOf(value2));
        if (value == 0.0d || value2 == 0.0d) {
            return;
        }
        int i = (int) value;
        iobVar.j(Integer.valueOf(i));
        int i2 = (int) value2;
        iobVar.c(Integer.valueOf(i2));
        BloodPressureApi bloodPressureApi = (BloodPressureApi) Services.b("Main", BloodPressureApi.class);
        if (bloodPressureApi != null) {
            iobVar.d(Integer.valueOf(bloodPressureApi.getBloodPressureGradeType(i, i2)));
        }
        iobVar.a((Integer) 0);
        iobVar.e(Long.valueOf(hiHealthData.getStartTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(SparseArray<Object> sparseArray, iob iobVar) {
        List arrayList = new ArrayList();
        Object obj = sparseArray.get(DicDataTypeUtil.DataType.FATTY_LIVER_GRADE.value());
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HealthGlanceHelper", "getLatestFattyLiverGrade is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        double value = hiHealthData.getValue();
        List arrayList2 = new ArrayList();
        Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.FATTY_LIVER_RISK.value());
        if (njy.b(obj2, HiHealthData.class)) {
            arrayList2 = (List) obj2;
        }
        if (njy.e(arrayList2)) {
            LogUtil.j("HealthGlanceHelper", "getLatestFattyLiverRiskList is empty");
            return;
        }
        double value2 = ((HiHealthData) arrayList2.get(0)).getValue();
        LogUtil.a("HealthGlanceHelper", "fattyLiverGrade is : ", Double.valueOf(value), " fattyLiverRisk is : ", Double.valueOf(value2));
        if (value == 0.0d || value2 == 0.0d) {
            return;
        }
        iobVar.d(Float.valueOf(String.valueOf(value)));
        iobVar.b(Integer.valueOf((int) value2));
        iobVar.b(Long.valueOf(hiHealthData.getStartTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(SparseArray<Object> sparseArray, iob iobVar) {
        if (!Utils.o()) {
            LogUtil.a("HealthGlanceHelper", "is not oversea , don't need to send sleepApnea data to device");
            return;
        }
        List arrayList = new ArrayList();
        Object obj = sparseArray.get(DicDataTypeUtil.DataType.OSA_LEVEL.value());
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HealthGlanceHelper", "getLatest sleepApneaGrade is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        double value = hiHealthData.getValue();
        LogUtil.a("HealthGlanceHelper", "sleepApneaGrade is : ", Double.valueOf(value));
        if (value != 0.0d) {
            iobVar.i(Integer.valueOf((int) value));
            iobVar.a(Long.valueOf(hiHealthData.getStartTime()));
        }
    }
}
