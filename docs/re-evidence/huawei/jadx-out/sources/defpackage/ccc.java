package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
public class ccc {
    public static void d(int i, int i2, HiAggregateListener hiAggregateListener) {
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(d(i, i2), hiAggregateListener);
    }

    public static HiAggregateOption d(int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()});
        hiAggregateOption.setConstantsKey(new String[]{"breathTrain"});
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    public static void d(List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        if (njy.e(list) || healthLifeBean == null || healthLifeBean.getId() != 5) {
            LogUtil.j("HL_BreathUtils", "refreshDayRecord dataList ", list, " recordBean ", healthLifeBean);
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HL_BreathUtils", "refreshDayRecord hiHealthData is null");
            } else if (cbg.d(hiHealthData) != recordDay) {
                LogUtil.j("HL_BreathUtils", "refreshDayRecord hiHealthData ", hiHealthData, " recordDay ", Integer.valueOf(recordDay));
            } else {
                c(hiHealthData, healthLifeBean);
                return;
            }
        }
    }

    public static void d(final HealthLifeBean healthLifeBean, final ResponseCallback<HealthLifeBean> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_BreathUtils", "refreshDayRecord callback is null");
        } else if (healthLifeBean == null) {
            LogUtil.j("HL_BreathUtils", "refreshDayRecord lifeBean is null");
            responseCallback.onResponse(-1, null);
        } else {
            int recordDay = healthLifeBean.getRecordDay();
            d(recordDay, recordDay, new HiAggregateListener() { // from class: ccc.1
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    ccc.d(list, healthLifeBean);
                    responseCallback.onResponse(0, healthLifeBean);
                }
            });
        }
    }

    public static void c(final SparseArray<HealthLifeBean> sparseArray, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_BreathUtils", "refreshRecord callback is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_BreathUtils", "refreshRecord recordArray is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_BreathUtils", "refreshRecord recordArray ", sparseArray);
            responseCallback.onResponse(-1, sparseArray);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        cec.c(sparseArray, (ResponseCallback<SparseArray<HealthLifeBean>>) new ResponseCallback() { // from class: cca
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                countDownLatch.countDown();
            }
        });
        d(sparseArray.keyAt(0), sparseArray.keyAt(size - 1), new HiAggregateListener() { // from class: ccc.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    LogUtil.j("HL_BreathUtils", "refreshRecord dataList ", list);
                    countDownLatch.countDown();
                    return;
                }
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData == null) {
                        LogUtil.j("HL_BreathUtils", "refreshRecord hiHealthData is null");
                    } else {
                        HealthLifeBean healthLifeBean = (HealthLifeBean) sparseArray.get(cbg.d(hiHealthData));
                        if (healthLifeBean != null && healthLifeBean.getId() == 5) {
                            ccc.c(hiHealthData, healthLifeBean);
                        } else {
                            LogUtil.j("HL_BreathUtils", "refreshRecord hiHealthData ", hiHealthData, " recordBean ", healthLifeBean);
                        }
                    }
                }
                countDownLatch.countDown();
            }
        });
        cbg.b(countDownLatch, "HL_BreathUtils");
        responseCallback.onResponse(0, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HiHealthData hiHealthData, HealthLifeBean healthLifeBean) {
        if (hiHealthData == null || healthLifeBean == null) {
            return;
        }
        int i = hiHealthData.getInt("breathTrain");
        if (healthLifeBean.getComplete() <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            if (healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
            }
        }
        LogUtil.a("HL_BreathUtils", "refreshRecord result ", healthLifeBean.getResult(), " recordDay ", Integer.valueOf(healthLifeBean.getRecordDay()));
        healthLifeBean.setIsUpdated(true);
        healthLifeBean.setSyncStatus(0);
        if (i > 0) {
            healthLifeBean.setResult(String.valueOf(i));
        }
    }
}
