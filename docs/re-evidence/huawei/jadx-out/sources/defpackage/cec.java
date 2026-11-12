package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cec {
    private static int c(int i) {
        if (i >= 1 && i <= 29) {
            return 1;
        }
        if (i <= 29 || i >= 60) {
            return (i < 60 || i >= 80) ? 4 : 3;
        }
        return 2;
    }

    private static HiDataReadOption d(int i) {
        int[] iArr;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        if (c()) {
            iArr = new int[]{2034};
            hiDataReadOption.setCount(1);
            hiDataReadOption.setSortOrder(1);
        } else {
            iArr = new int[]{2034, 44306};
            hiDataReadOption.setSortOrder(0);
        }
        hiDataReadOption.setType(iArr);
        return hiDataReadOption;
    }

    private static HiDataReadOption c(int i, int i2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{2034, 44306});
        hiDataReadOption.setSortOrder(0);
        return hiDataReadOption;
    }

    public static void d(final HealthLifeBean healthLifeBean, final ResponseCallback<HealthLifeBean> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_PressureUtils", "getPressureMeasureDay callback is null");
            return;
        }
        if (healthLifeBean == null) {
            LogUtil.j("HL_PressureUtils", "getPressureMeasureDay healthLifeBean is null");
            responseCallback.onResponse(-1, null);
        } else {
            if (HandlerExecutor.c()) {
                cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: ceb
                    @Override // java.lang.Runnable
                    public final void run() {
                        cec.d(healthLifeBean, responseCallback);
                    }
                });
                return;
            }
            LogUtil.a("HL_PressureUtils", "achieveHandle isComplete=", Integer.valueOf(healthLifeBean.getComplete()), ",recordDay=", Integer.valueOf(healthLifeBean.getRecordDay()));
            e(healthLifeBean, responseCallback);
        }
    }

    public static void c(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_PressureUtils", "getPressureMeasureDay callback is null");
            return;
        }
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_PressureUtils", "getPressureMeasureDay healthLifeBean is null");
            responseCallback.onResponse(-1, null);
        } else if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cdz
                @Override // java.lang.Runnable
                public final void run() {
                    cec.c((SparseArray<HealthLifeBean>) sparseArray, (ResponseCallback<SparseArray<HealthLifeBean>>) responseCallback);
                }
            });
        } else {
            b(sparseArray, responseCallback);
        }
    }

    private static void e(final HealthLifeBean healthLifeBean, final ResponseCallback<HealthLifeBean> responseCallback) {
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(d(healthLifeBean.getRecordDay()), new HiDataReadResultListener() { // from class: cec.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HL_PressureUtils", "readHiHealthData errorCode = ", Integer.valueOf(i));
                if (!(obj instanceof SparseArray)) {
                    responseCallback.onResponse(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    responseCallback.onResponse(-1, null);
                    return;
                }
                Object obj2 = sparseArray.get(2034);
                List list = njy.b(obj2, HiHealthData.class) ? (List) obj2 : null;
                if (cec.c()) {
                    cec.d(list, healthLifeBean, responseCallback);
                } else {
                    Object obj3 = sparseArray.get(44306);
                    cec.a((List<HiHealthData>) list, (List<HiHealthData>) (njy.b(obj3, HiHealthData.class) ? (List) obj3 : null), healthLifeBean, (ResponseCallback<HealthLifeBean>) responseCallback);
                }
            }
        });
    }

    private static void b(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthData(c(sparseArray.keyAt(0), sparseArray.keyAt(sparseArray.size() - 1)), new HiDataReadResultListener() { // from class: cec.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HL_PressureUtils", "readHiHealthData errorCode = ", Integer.valueOf(i));
                if (!(obj instanceof SparseArray)) {
                    responseCallback.onResponse(-1, null);
                    return;
                }
                SparseArray sparseArray2 = (SparseArray) obj;
                if (sparseArray2.size() <= 0) {
                    responseCallback.onResponse(-1, null);
                    return;
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                Object obj2 = sparseArray2.get(44306);
                if (njy.b(obj2, HiHealthData.class)) {
                    cec.a(sparseIntArray, (List<HiHealthData>) obj2);
                    SparseArray sparseArray3 = new SparseArray();
                    Object obj3 = sparseArray2.get(2034);
                    if (njy.b(obj3, HiHealthData.class)) {
                        cec.a((SparseArray<List<HiHealthData>>) sparseArray3, (List<HiHealthData>) obj3);
                        cec.a((SparseArray<HealthLifeBean>) sparseArray, sparseIntArray, (SparseArray<List<HiHealthData>>) sparseArray3, (ResponseCallback<SparseArray<HealthLifeBean>>) responseCallback);
                        return;
                    } else {
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                }
                responseCallback.onResponse(-1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<HiHealthData> list, List<HiHealthData> list2, HealthLifeBean healthLifeBean, ResponseCallback<HealthLifeBean> responseCallback) {
        int intValue;
        boolean z = true;
        boolean z2 = healthLifeBean.getComplete() == 1;
        if (z2 || !njy.b(list2)) {
            z = z2;
            intValue = 0;
        } else {
            intValue = list2.get(0).getIntValue();
            if (intValue >= 60 || !b(healthLifeBean.getRecordDay())) {
                z = z2;
            } else {
                b(healthLifeBean);
            }
        }
        if (njy.b(list)) {
            c(z, intValue, list, healthLifeBean);
        }
        responseCallback.onResponse(0, healthLifeBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<HiHealthData> list, HealthLifeBean healthLifeBean, ResponseCallback<HealthLifeBean> responseCallback) {
        if (njy.e(list)) {
            responseCallback.onResponse(-1, healthLifeBean);
        } else {
            b(list.get(0), healthLifeBean);
            responseCallback.onResponse(0, healthLifeBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SparseArray<HealthLifeBean> sparseArray, SparseIntArray sparseIntArray, SparseArray<List<HiHealthData>> sparseArray2, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        HealthLifeBean healthLifeBeanValueAt;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            int i2 = sparseIntArray.get(iKeyAt);
            if (i2 != 0 && (healthLifeBeanValueAt = sparseArray.valueAt(i)) != null) {
                List<HiHealthData> list = sparseArray2.get(iKeyAt);
                if (!njy.e(list)) {
                    boolean z = true;
                    boolean z2 = healthLifeBeanValueAt.getComplete() == 1;
                    if (z2) {
                        c(true, i2, list, healthLifeBeanValueAt);
                    } else {
                        if (i2 >= 60 || !b(iKeyAt)) {
                            z = z2;
                        } else {
                            b(healthLifeBeanValueAt);
                        }
                        c(z, i2, list, healthLifeBeanValueAt);
                    }
                }
            }
        }
        responseCallback.onResponse(0, sparseArray);
    }

    private static void b(HealthLifeBean healthLifeBean) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int complete = healthLifeBean.getComplete();
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setComplete(1);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setIsUpdated(true);
        healthLifeBean.setSyncStatus(0);
        if (TextUtils.isEmpty(healthLifeBean.getResult())) {
            healthLifeBean.setResult(String.valueOf(0));
        }
        if (complete > 0 || healthLifeBean.getRecordDay() != DateFormatUtil.a(jCurrentTimeMillis)) {
            return;
        }
        cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SparseArray<List<HiHealthData>> sparseArray, List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            int iA = DateFormatUtil.a(hiHealthData.getEndTime(), lsl.a(hiHealthData.getTimeZone()));
            List<HiHealthData> arrayList = sparseArray.get(iA);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(hiHealthData);
            sparseArray.put(iA, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SparseIntArray sparseIntArray, List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            sparseIntArray.put(DateFormatUtil.a(hiHealthData.getEndTime()), hiHealthData.getIntValue());
        }
    }

    private static void c(boolean z, int i, List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        LogUtil.a("HL_PressureUtils", "handlePressureValue isAchieve=", Boolean.valueOf(z), ",averageValue", Integer.valueOf(i));
        if (z) {
            b(list.get(list.size() - 1), healthLifeBean);
            return;
        }
        int intValue = list.get(0).getIntValue();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < list.size()) {
                HiHealthData hiHealthData = list.get(i2);
                long endTime = hiHealthData.getEndTime();
                long jA = lsl.a(endTime, 18, 0);
                int intValue2 = hiHealthData.getIntValue();
                if (endTime <= jA && i2 != size - 1) {
                    i3++;
                    i4 += intValue2;
                    intValue = i4 / i3;
                } else {
                    i3++;
                    i4 += intValue2;
                    intValue = Math.min(intValue, i4 / i3);
                    if (intValue > 0 && intValue < 60 && b(DateFormatUtil.a(endTime))) {
                        break;
                    }
                }
                i2++;
            } else {
                if (z) {
                    break;
                }
                b(list.get(list.size() - 1), healthLifeBean);
            }
        }
        b(healthLifeBean);
        b(list.get(list.size() - 1), healthLifeBean);
    }

    private static void b(HiHealthData hiHealthData, HealthLifeBean healthLifeBean) {
        grv grvVar = new grv();
        int intValue = hiHealthData.getIntValue();
        grvVar.b(intValue);
        grvVar.b(hiHealthData.getEndTime() / 1000);
        grvVar.a(c(intValue));
        healthLifeBean.setExtendInfo(HiJsonUtil.d(grvVar));
        LogUtil.a("HL_PressureUtils", "convertPressureData measureBean=", grvVar.toString());
    }

    private static boolean b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return lsl.a(jCurrentTimeMillis, 18, 0) < jCurrentTimeMillis || i != DateFormatUtil.a(jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis < lsl.a(jCurrentTimeMillis, 18, 0);
    }
}
