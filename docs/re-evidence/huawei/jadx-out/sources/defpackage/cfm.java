package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cfm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1538b = {40002};
    private static final String[] e = {ParsedFieldTag.STEP_SUM};

    public static HiAggregateOption c(int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(f1538b);
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    public static void d(List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        if (njy.e(list) || healthLifeBean == null || healthLifeBean.getId() != 2) {
            LogUtil.j("HL_StepUtils", "refreshDayRecord dataList ", list, " recordBean ", healthLifeBean);
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HL_StepUtils", "refreshDayRecord hiHealthData is null");
            } else if (cbg.d(hiHealthData) != recordDay) {
                LogUtil.j("HL_StepUtils", "refreshDayRecord hiHealthData ", hiHealthData, " recordDay ", Integer.valueOf(recordDay));
            } else {
                c(hiHealthData, healthLifeBean);
                return;
            }
        }
    }

    public static void d(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_StepUtils", "refreshRecord callback is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_StepUtils", "refreshRecord recordArray is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_StepUtils", "refreshRecord recordArray ", sparseArray);
            responseCallback.onResponse(-1, sparseArray);
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(c(sparseArray.keyAt(0), sparseArray.keyAt(size - 1)), new HiAggregateListener() { // from class: cfm.4
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (njy.e(list)) {
                        LogUtil.j("HL_StepUtils", "refreshRecord dataList ", list);
                        responseCallback.onResponse(-1, sparseArray);
                        return;
                    }
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData == null) {
                            LogUtil.j("HL_StepUtils", "refreshRecord hiHealthData is null");
                        } else {
                            HealthLifeBean healthLifeBean = (HealthLifeBean) sparseArray.get(cbg.d(hiHealthData));
                            if (healthLifeBean != null && healthLifeBean.getId() == 2) {
                                cfm.c(hiHealthData, healthLifeBean);
                            } else {
                                LogUtil.j("HL_StepUtils", "refreshRecord hiHealthData ", hiHealthData, " recordBean ", healthLifeBean);
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
        int i = hiHealthData.getInt(ParsedFieldTag.STEP_SUM);
        if (healthLifeBean.getComplete() <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setSyncStatus(0);
            if (healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
            }
        } else if (i != CommonUtil.j(healthLifeBean.getResult())) {
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setSyncStatus(0);
        } else {
            LogUtil.d("HL_StepUtils", "refreshRecord recordBean ", healthLifeBean, " step ", Integer.valueOf(i));
        }
        healthLifeBean.setResult(String.valueOf(i));
    }
}
