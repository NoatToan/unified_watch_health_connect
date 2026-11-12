package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiValidatorUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wvc {
    private static int[] h = {6500, 5620, 7560, 8940, 12500, 9630, 4765, 7865, 3650, 9900, 25160, 8655, 7650, 7895, 18650, 6500, 5620, 7560, 8940, 12500, 9630, 4765, 7865};
    private static int[] i = {13650, 9900, 21060, 8655, 7650, 7895, 650};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f52531c = {17, 47, 53, 34, 66, 30, 27, 65, 50, 20, 60, 55, 50, 45, 30, 52, 22, 42, 40, 25, 30, 65, 17};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f52529a = {29, 46, 31, 40, 23, 16, 10};
    private static int[] e = {630, 150, 450, HwExerciseConstants.NINE_MINUTES_PACE, 720, 630, 120, 240, 360, 90, a.C, 450, 450, 240, 690, 150, 180, 240, a.C, 420, 240, 270, 300};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f52530b = {450, 300, HwExerciseConstants.NINE_MINUTES_PACE, a.C, 420, 270, 120};
    private static int j = 0;
    private static int g = 0;
    private static int d = 1;
    private static SecureRandom f = new SecureRandom();

    public static double a(double d2) {
        return d2 * 0.5d * 0.735d * 68.0d;
    }

    public static double d(double d2) {
        return (d2 / 10.0d) * 68.0d * 0.04d;
    }

    public static double e(int i2) {
        if (i2 <= 0) {
            return 0.0d;
        }
        return ((double) i2) * 0.735d;
    }

    static /* synthetic */ int b() {
        int i2 = g;
        g = i2 + 1;
        return i2;
    }

    static /* synthetic */ int e() {
        int i2 = j;
        j = i2 + 1;
        return i2;
    }

    public static void b(final Context context) {
        if (context == null) {
            LogUtil.j("StepCountDataMockUtil", "insertWeekStepDetailToDB context = null");
            return;
        }
        HiDataInsertOption hiDataInsertOptionC = c(context);
        if (hiDataInsertOptionC != null) {
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOptionC, new HiDataOperateListener() { // from class: wvc.4
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("StepCountDataMockUtil", "insertWeekStepDetailToDB() type = ", Integer.valueOf(i2), " data=", obj);
                    if (obj != null) {
                        if (i2 == 0) {
                            LogUtil.a("StepCountDataMockUtil", "insertWeekStepDetailToDB insert onSuccess");
                            return;
                        }
                        LogUtil.a("StepCountDataMockUtil", "insertWeekStepDetailToDB insert failed error=", obj);
                        if (wvc.j < wvc.d) {
                            wvc.b(context);
                            wvc.e();
                        }
                    }
                }
            });
        }
    }

    public static void a(final Context context) {
        if (context == null) {
            LogUtil.j("StepCountDataMockUtil", "insertMonthStepDetailToDB context = null");
            return;
        }
        HiDataInsertOption hiDataInsertOptionD = d(context);
        if (hiDataInsertOptionD != null) {
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOptionD, new HiDataOperateListener() { // from class: wvc.3
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("StepCountDataMockUtil", "insertMonthStepDetailToDB() type = ", Integer.valueOf(i2), " data=", obj);
                    if (obj != null) {
                        if (i2 == 0) {
                            LogUtil.a("StepCountDataMockUtil", "insertMonthStepDetailToDB insert onSuccess");
                            return;
                        }
                        LogUtil.a("StepCountDataMockUtil", "insertMonthStepDetailToDB insert failed error=", obj);
                        if (wvc.g < wvc.d) {
                            wvc.a(context);
                            wvc.b();
                        }
                    }
                }
            });
        }
    }

    private static HiDataInsertOption c(Context context) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList();
        long time = ltb.d(ltb.d(), -6).getTime();
        for (int i2 = 6; i2 >= 0; i2--) {
            int i3 = (int) (((((long) i2) * 86400000) + time) / 60000);
            LogUtil.a("StepCountDataMockUtil", "getWeekStepDetailOption startMin=", Integer.valueOf(i3), " i = ", Integer.valueOf(i2));
            c(context, i[i2], i3, arrayList);
            b(context, f52530b[i2], i3, arrayList);
            d(context, f52529a[i2], i3, arrayList);
        }
        hiDataInsertOption.setDatas(arrayList);
        return hiDataInsertOption;
    }

    private static HiDataInsertOption d(Context context) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList();
        long time = ltb.d(ltb.d(), -29).getTime();
        for (int i2 = 0; i2 < 23; i2++) {
            int i3 = (int) (((((long) i2) * 86400000) + time) / 60000);
            c(context, h[i2], i3, arrayList);
            b(context, e[i2], i3, arrayList);
            d(context, f52531c[i2], i3, arrayList);
        }
        hiDataInsertOption.setDatas(arrayList);
        return hiDataInsertOption;
    }

    private static void d(Context context, int i2, int i3, List<HiHealthData> list) {
        for (int i4 = 0; i4 < i2; i4++) {
            HiHealthData hiHealthData = new HiHealthData();
            long j2 = ((long) (i3 + 360 + i4)) * 60000;
            hiHealthData.setTimeInterval(j2, 60000 + j2);
            if (i4 > 0 && i4 <= 10) {
                hiHealthData.setValue(1);
            } else if (i4 > 10 && i4 <= 30) {
                hiHealthData.setValue(2);
            } else if (i4 > 30 && i4 <= 45) {
                hiHealthData.setValue(4);
            } else {
                hiHealthData.setValue(3);
            }
            hiHealthData.setType(7);
            hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData);
        }
    }

    private static void c(Context context, int i2, int i3, List<HiHealthData> list) {
        int i4 = i3 + 360;
        int i5 = 0;
        int i6 = 0;
        int iNextInt = 0;
        while (true) {
            long j2 = i4;
            if (j2 >= ((long) i3) + 1440) {
                i4 = i5;
                break;
            }
            iNextInt = f.nextInt(20) + 90;
            i6 += iNextInt;
            if (i6 > i2) {
                break;
            }
            a(context, list, j2 * 60000, iNextInt);
            i5 = i4;
            i4 += 4;
        }
        a(context, list, ((long) i4) * 60000, i2 - (i6 - iNextInt));
    }

    private static void b(Context context, int i2, int i3, List<HiHealthData> list) {
        int i4 = i3 + 360;
        int i5 = 0;
        int i6 = 0;
        int iNextInt = 0;
        while (true) {
            long j2 = i4;
            if (j2 >= ((long) i3) + 1440) {
                i4 = i5;
                break;
            }
            iNextInt = (f.nextInt(2) * 30) + 30;
            i6 += iNextInt;
            if (i6 > i2) {
                break;
            }
            e(context, list, j2 * 60000, iNextInt);
            i5 = i4;
            i4 += 10;
        }
        e(context, list, ((long) i4) * 60000, i2 - (i6 - iNextInt));
    }

    private static void a(Context context, List<HiHealthData> list, long j2, int i2) {
        double d2 = i2;
        if (HiValidatorUtil.b(2, d2)) {
            HiHealthData hiHealthData = new HiHealthData(2);
            hiHealthData.setTimeInterval(j2, j2 + 60000);
            hiHealthData.setValue(i2);
            hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData);
            LogUtil.a("StepCountDataMockUtil", "fillMinDetailData stepPointData=", hiHealthData);
        }
        if (HiValidatorUtil.b(4, a(d2))) {
            HiHealthData hiHealthData2 = new HiHealthData(4);
            hiHealthData2.setTimeInterval(j2, j2 + 60000);
            hiHealthData2.setValue(a(d2));
            hiHealthData2.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData2);
            LogUtil.a("StepCountDataMockUtil", "fillMinDetailData calPointData=", hiHealthData2);
        }
        if (HiValidatorUtil.b(3, e(i2))) {
            HiHealthData hiHealthData3 = new HiHealthData(3);
            hiHealthData3.setTimeInterval(j2, j2 + 60000);
            hiHealthData3.setValue(e(i2));
            hiHealthData3.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData3);
            LogUtil.a("StepCountDataMockUtil", "fillMinDetailData disPointData=", hiHealthData3);
        }
        if (HiValidatorUtil.b(20002, 20002.0d)) {
            HiHealthData hiHealthData4 = new HiHealthData(20002);
            hiHealthData4.setTimeInterval(j2, 60000 + j2);
            hiHealthData4.setValue(20002);
            hiHealthData4.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData4);
        }
    }

    private static void e(Context context, List<HiHealthData> list, long j2, int i2) {
        double d2 = i2;
        if (HiValidatorUtil.b(5, d2)) {
            HiHealthData hiHealthData = new HiHealthData(5);
            hiHealthData.setTimeInterval(j2, j2 + 60000);
            hiHealthData.setValue(i2);
            hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData);
            LogUtil.a("StepCountDataMockUtil", "fillDayFloorDetail pointData=", hiHealthData);
        }
        if (HiValidatorUtil.b(20004, 20004.0d)) {
            HiHealthData hiHealthData2 = new HiHealthData(20004);
            hiHealthData2.setTimeInterval(j2, j2 + 60000);
            hiHealthData2.setValue(20004);
            hiHealthData2.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData2);
        }
        if (HiValidatorUtil.b(4, d(d2))) {
            HiHealthData hiHealthData3 = new HiHealthData(4);
            hiHealthData3.setTimeInterval(j2, 60000 + j2);
            hiHealthData3.setValue(d(d2));
            hiHealthData3.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
            list.add(hiHealthData3);
            LogUtil.a("StepCountDataMockUtil", "fillMinDetailData calPointData=", hiHealthData3);
        }
    }
}
