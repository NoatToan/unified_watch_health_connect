package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ueg {
    private static long d = 0;
    private static boolean e = false;

    public static void c(long j, long j2, final Map<String, ResponseCallback<Map<Long, IStorageModel>>> map) {
        final String strC = qrk.c(j);
        final SparseArray<List<HiHealthData>> sparseArrayB = ueh.b(strC);
        if (e && sparseArrayB.size() > 0) {
            LogUtil.a("HeartRateStorageHelper", "queryDayDayData use cache");
            a(sparseArrayB, map);
        }
        HiDataReadOption hiDataReadOptionA = a(j, j2 - 1);
        LogUtil.a("HeartRateStorageHelper", "queryDayDayData start");
        d = System.currentTimeMillis();
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOptionA, new HiDataReadResultListener() { // from class: ueg.1
            private boolean e = false;

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HeartRateStorageHelper", "queryDayDayData data ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                if (this.e) {
                    return;
                }
                this.e = i2 == 2;
                LogUtil.a("HeartRateStorageHelper", "queryDayDayData success: ", Long.valueOf(System.currentTimeMillis() - ueg.d), "ms");
                if (!(obj instanceof SparseArray)) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((ResponseCallback) it.next()).onResult(-1, null);
                    }
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (ueg.e) {
                    boolean unused = ueg.e = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean zB = ueh.b(sparseArrayB, sparseArray);
                    LogUtil.a("HeartRateStorageHelper", "queryDayDayData diff time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms");
                    if (!zB) {
                        LogUtil.a("HeartRateStorageHelper", "queryDayDayData same cache");
                        return;
                    }
                    ueh.c(strC, sparseArray);
                }
                ueg.a((SparseArray<List<HiHealthData>>) sparseArray, (Map<String, ResponseCallback<Map<Long, IStorageModel>>>) map);
            }
        });
    }

    private static HiDataReadOption a(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{2002, 2018, 2105, 2101, 2102});
        hiDataReadOption.setReadType(0);
        return hiDataReadOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SparseArray<List<HiHealthData>> sparseArray, Map<String, ResponseCallback<Map<Long, IStorageModel>>> map) {
        for (Map.Entry<String, ResponseCallback<Map<Long, IStorageModel>>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashMap map2 = new HashMap(16);
            if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(key)) {
                a(sparseArray.get(2018), map2, "HR_NORMAL_DETAIL");
                a(sparseArray.get(2105), map2, "HR_NORMAL_DETAIL");
                a(sparseArray.get(2002), map2, "HR_NORMAL_DETAIL");
                uei.e((Map<Long, IStorageModel>) map2, true);
            } else if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(key)) {
                a(uei.d(sparseArray.get(2018), sparseArray.get(2105)), map2, "HR_REST_DETAIL");
                uei.d((Map<Long, IStorageModel>) map2, true);
            } else if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(key)) {
                uei.a(map2, "HR_WARNING_DETAIL", sparseArray.get(2101), (ues) null);
                uei.b(map2, true);
            } else if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(key)) {
                uei.a(map2, "BRADYCARDIA_DETAIL", sparseArray.get(2102), (ues) null);
                uei.c(map2, true);
            } else {
                LogUtil.j("HeartRateStorageHelper", "showModeArg.acquireDataLayerId(): ", key);
            }
            LogUtil.a("HeartRateStorageHelper", "parsesDayData resultMap ", map2);
            entry.getValue().onResult(0, map2);
        }
    }

    private static void a(List<HiHealthData> list, Map<Long, IStorageModel> map, String str) {
        StorageGenericModel storageGenericModel;
        LogUtil.a("HeartRateStorageHelper", "loadDayValue resultMap ", map, " hrKey ", str);
        if (njy.e(list)) {
            return;
        }
        LogUtil.a("HeartRateStorageHelper", "loadDayValue dataList size", Integer.valueOf(list.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = 0.0f;
        long j = 0;
        float f2 = 0.0f;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HeartRateStorageHelper", "loadDayValue healthData is null");
            } else {
                long startTime = hiHealthData.getStartTime();
                if (map.containsKey(Long.valueOf(startTime))) {
                    storageGenericModel = (StorageGenericModel) map.get(Long.valueOf(startTime));
                } else {
                    storageGenericModel = new StorageGenericModel();
                }
                if (storageGenericModel != null) {
                    storageGenericModel.e(str, (float) hiHealthData.getValue());
                    map.put(Long.valueOf(startTime), storageGenericModel);
                }
                if ("HR_NORMAL_DETAIL".equals(str)) {
                    if (j < startTime) {
                        f2 = hiHealthData.getFloat(str);
                        j = startTime;
                    }
                    if (jCurrentTimeMillis > startTime) {
                        f = hiHealthData.getFloat(str);
                        jCurrentTimeMillis = startTime;
                    }
                }
            }
        }
        LogUtil.a("HeartRateStorageHelper", "loadDayValue firstTime ", Long.valueOf(jCurrentTimeMillis), " firstHrValue ", Float.valueOf(f), " lastTime ", Long.valueOf(j), " lastHrValue ", Float.valueOf(f2), " resultMap ", map, " size ", Integer.valueOf(map.size()));
    }

    public static void a(boolean z) {
        e = z;
    }
}
