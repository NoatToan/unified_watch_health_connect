package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class ccm {
    public static void a(int i, int i2, HiAggregateListener hiAggregateListener) {
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(d(i, i2), hiAggregateListener);
    }

    public static HiAggregateOption d(int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.DRINK_WATER_SET.value()});
        hiAggregateOption.setConstantsKey(new String[]{"drinkWater"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    public static void d(List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        if (njy.e(list) || healthLifeBean == null || healthLifeBean.getId() != 10) {
            LogUtil.j("HL_DrinkWaterUtils", "refreshDayRecord dataList ", list, " lifeBean ", healthLifeBean);
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HL_DrinkWaterUtils", "refreshDayRecord hiHealthData is null");
            } else if (cbg.d(hiHealthData) != recordDay) {
                LogUtil.j("HL_DrinkWaterUtils", "refreshDayRecord hiHealthData ", hiHealthData, " recordDay ", Integer.valueOf(recordDay));
            } else {
                c(hiHealthData, healthLifeBean);
                return;
            }
        }
    }

    public static void d(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_DrinkWaterUtils", "refreshRecord callback is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_DrinkWaterUtils", "refreshRecord recordArray is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_DrinkWaterUtils", "refreshRecord recordArray ", sparseArray);
            responseCallback.onResponse(-1, sparseArray);
        } else {
            a(sparseArray.keyAt(0), sparseArray.keyAt(size - 1), new HiAggregateListener() { // from class: ccm.5
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (njy.e(list)) {
                        LogUtil.j("HL_DrinkWaterUtils", "refreshRecord dataList ", list);
                        responseCallback.onResponse(-1, sparseArray);
                        return;
                    }
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData == null) {
                            LogUtil.j("HL_DrinkWaterUtils", "refreshRecord hiHealthData is null");
                        } else {
                            HealthLifeBean healthLifeBean = (HealthLifeBean) sparseArray.get(cbg.d(hiHealthData));
                            if (healthLifeBean != null && healthLifeBean.getId() == 10) {
                                ccm.c(hiHealthData, healthLifeBean);
                            } else {
                                LogUtil.j("HL_DrinkWaterUtils", "refreshRecord hiHealthData ", hiHealthData, " recordBean ", healthLifeBean);
                            }
                        }
                    }
                    responseCallback.onResponse(0, sparseArray);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HiHealthData hiHealthData, HealthLifeBean healthLifeBean) {
        if (hiHealthData == null || healthLifeBean == null) {
            return;
        }
        int i = hiHealthData.getInt("drinkWater");
        if (healthLifeBean.getComplete() <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(2);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            if (healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
            }
        }
        healthLifeBean.setIsUpdated(true);
        healthLifeBean.setSyncStatus(0);
        if (i > 0) {
            healthLifeBean.setResult(String.valueOf(Math.min(i, 6000)));
        }
    }

    public static void c(final int i, final HealthLifeBean healthLifeBean, final ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_DrinkWaterUtils", "insertHiHealthData callback is null");
            return;
        }
        if (i <= 0) {
            LogUtil.j("HL_DrinkWaterUtils", "insertHiHealthData value ", Integer.valueOf(i));
            responseCallback.onResponse(-1, "");
        } else if (healthLifeBean == null || healthLifeBean.getId() != 10) {
            LogUtil.j("HL_DrinkWaterUtils", "insertHiHealthData lifeBean ", healthLifeBean);
            responseCallback.onResponse(-1, "");
        } else {
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            a(iA, iA, new HiAggregateListener() { // from class: ccm.1
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i2, int i3) {
                    HiHealthData hiHealthData = new HiHealthData();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    hiHealthData.setStartTime(jCurrentTimeMillis);
                    hiHealthData.setEndTime(jCurrentTimeMillis);
                    int i4 = i;
                    if (njy.e(list)) {
                        LogUtil.a("HL_DrinkWaterUtils", "insertHiHealthData dataList ", list, " lifeBean ", healthLifeBean);
                        int iJ = CommonUtils.j(healthLifeBean.getResult());
                        i4 = iJ > 0 ? i + iJ : i;
                    }
                    hiHealthData.setValue(Math.min(i4, 6000));
                    hiHealthData.setType(DicDataTypeUtil.DataType.DRINK_WATER.value());
                    hiHealthData.setDeviceUuid(String.valueOf(-1));
                    HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
                    hiDataInsertOption.addData(hiHealthData);
                    HiHealthApi hiHealthApiD = HiHealthManager.d(BaseApplication.b());
                    ResponseCallback responseCallback2 = responseCallback;
                    Objects.requireNonNull(responseCallback2);
                    hiHealthApiD.insertHiHealthData(hiDataInsertOption, new cct(responseCallback2));
                }
            });
        }
    }
}
