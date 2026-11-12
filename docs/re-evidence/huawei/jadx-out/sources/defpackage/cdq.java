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
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.openservice.OpenServiceUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cdq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1495b = {47101, 47102, 47103, 47104, 47105, 47107, 47108, 47109};
    private static final String[] d = {"TOTAL", OpenServiceUtil.Location.STEP, "RUN", "CYCLE", "FITNESS", "CLIMB", "SWIM", "UNKNOWHIGH"};

    public static HiAggregateOption e(int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(f1495b);
        hiAggregateOption.setConstantsKey(d);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    public static void c(List<HiHealthData> list, HealthLifeBean healthLifeBean) {
        if (njy.e(list) || healthLifeBean == null || healthLifeBean.getId() != 3) {
            LogUtil.j("HL_IntensityUtils", "refreshDayRecord dataList ", list, " recordBean ", healthLifeBean);
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HL_IntensityUtils", "refreshDayRecord hiHealthData is null");
            } else if (cbg.d(hiHealthData) != recordDay) {
                LogUtil.j("HL_IntensityUtils", "refreshDayRecord hiHealthData ", hiHealthData, " recordDay ", Integer.valueOf(recordDay));
            } else {
                c(hiHealthData, healthLifeBean);
                return;
            }
        }
    }

    public static void b(final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_IntensityUtils", "refreshRecord callback is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_IntensityUtils", "refreshRecord recordArray is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_IntensityUtils", "refreshRecord recordArray ", sparseArray);
            responseCallback.onResponse(-1, sparseArray);
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(e(sparseArray.keyAt(0), sparseArray.keyAt(size - 1)), new HiAggregateListener() { // from class: cdq.4
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (!njy.e(list)) {
                        responseCallback.onResponse(0, cdq.d(list, sparseArray));
                    } else {
                        LogUtil.j("HL_IntensityUtils", "refreshRecord dataList ", list);
                        responseCallback.onResponse(0, cgi.d(3, (SparseArray<HealthLifeBean>) sparseArray, new SparseIntArray()));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SparseArray<HealthLifeBean> d(List<HiHealthData> list, SparseArray<HealthLifeBean> sparseArray) {
        if (njy.e(list) || sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HL_IntensityUtils", "refreshRecord dataList ", list, " recordArray ", sparseArray);
            return sparseArray;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("HL_IntensityUtils", "refreshRecord hiHealthData is null");
            } else {
                int iD = cbg.d(hiHealthData);
                HealthLifeBean healthLifeBean = sparseArray.get(iD);
                if (healthLifeBean == null || healthLifeBean.getId() != 3) {
                    LogUtil.j("HL_IntensityUtils", "refreshRecord hiHealthData ", hiHealthData, " recordBean ", healthLifeBean);
                } else {
                    sparseIntArray.append(iD, hiHealthData.getInt("TOTAL"));
                    map.put(Integer.valueOf(iD), Integer.valueOf(cbg.a(hiHealthData)));
                }
            }
        }
        SparseArray<HealthLifeBean> sparseArrayD = cgi.d(3, sparseArray, sparseIntArray);
        ccy.a("intensity_week_status", HiJsonUtil.d(map));
        LogUtil.a("HL_IntensityUtils", "refreshRecord sparseArray ", sparseArrayD);
        return sparseArrayD;
    }

    private static void c(HiHealthData hiHealthData, HealthLifeBean healthLifeBean) {
        if (hiHealthData == null || healthLifeBean == null) {
            return;
        }
        int i = hiHealthData.getInt("TOTAL");
        if (healthLifeBean.getComplete() <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setRest(0);
            healthLifeBean.setSyncStatus(0);
            if (healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
            }
        }
        healthLifeBean.setResult(String.valueOf(i));
    }
}
