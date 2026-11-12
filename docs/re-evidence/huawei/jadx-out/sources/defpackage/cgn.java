package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cgn {
    public static void d(int i, int i2, HiAggregateListener hiAggregateListener) {
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(a(i, i2), hiAggregateListener);
    }

    public static HiAggregateOption a(int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("NULL");
        return hiAggregateOption;
    }

    public static void c(List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        if (njy.e(list) || healthLifeBean == null || healthLifeBean.getId() != 14) {
            LogUtil.j("HL_WeightUtils", "refreshDayRecord dataList ", list, " recordBean ", healthLifeBean);
            return;
        }
        int i = b(list).get(healthLifeBean.getRecordDay());
        if (healthLifeBean.getComplete() <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setSyncStatus(0);
            cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
        }
        healthLifeBean.setResult(String.valueOf(i));
    }

    public static void b(final HealthLifeBean healthLifeBean, final ResponseCallback<HealthLifeBean> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_WeightUtils", "refreshDayRecord callback is null");
        } else if (healthLifeBean == null) {
            LogUtil.j("HL_WeightUtils", "refreshDayRecord lifeBean is null");
            responseCallback.onResponse(-1, null);
        } else {
            int recordDay = healthLifeBean.getRecordDay();
            d(recordDay, recordDay, new HiAggregateListener() { // from class: cgn.5
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    cgn.c(list, healthLifeBean);
                    responseCallback.onResponse(0, healthLifeBean);
                }
            });
        }
    }

    public static void e(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_WeightUtils", "refreshRecord callback is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_WeightUtils", "refreshRecord recordArray is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_WeightUtils", "refreshRecord recordArray ", sparseArray);
            responseCallback.onResponse(-1, sparseArray);
        } else {
            d(sparseArray.keyAt(0), sparseArray.keyAt(size - 1), new HiAggregateListener() { // from class: cgn.1
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (njy.e(list)) {
                        LogUtil.j("HL_WeightUtils", "refreshRecord dataList ", list);
                        responseCallback.onResponse(0, cgi.d(14, (SparseArray<HealthLifeBean>) sparseArray, new SparseIntArray()));
                    } else {
                        SparseArray<HealthLifeBean> sparseArrayD = cgi.d(14, (SparseArray<HealthLifeBean>) sparseArray, cgn.b(list));
                        LogUtil.a("HL_WeightUtils", "refreshRecord sparseArray ", sparseArrayD);
                        responseCallback.onResponse(0, sparseArrayD);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SparseIntArray b(List<HiHealthData> list) {
        if (njy.e(list)) {
            return new SparseIntArray();
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (HiHealthData hiHealthData : list) {
            double d = hiHealthData.getDouble("bodyWeight");
            int day = (int) hiHealthData.getDay();
            if (d > 0.0d && day > 0) {
                int i = sparseIntArray.get(day);
                sparseIntArray.append(day, i <= 0 ? 1 : i + 1);
            }
        }
        return sparseIntArray;
    }
}
