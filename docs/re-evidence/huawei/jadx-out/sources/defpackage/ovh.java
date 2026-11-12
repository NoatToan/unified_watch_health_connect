package defpackage;

import android.util.SparseArray;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ovh extends BaseCalculator {
    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        c(i, jA, jA2, countDownLatch);
        e(i, jA, jA2, countDownLatch);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_HealthDataCalculator", "getBloodSugarRecordData.await(): catch a InterruptedException");
        }
    }

    private void c(final int i, long j, long j2, final CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_HealthDataCalculator", "aggregateHiHealthDataEx: start -> ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(j, j2));
        arrayList.add(b(j, j2));
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: ovf
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public final void onResult(SparseArray sparseArray, int i2, int i3) {
                this.e.e(countDownLatch, i, sparseArray, i2, i3);
            }
        });
    }

    /* synthetic */ void e(CountDownLatch countDownLatch, int i, SparseArray sparseArray, int i2, int i3) {
        if (i2 != 0 || sparseArray == null || sparseArray.size() == 0) {
            ReleaseLogUtil.b("PLGACHIEVE_HealthDataCalculator", "aggregateHiHealthDataEx: errorCode -> ", Integer.valueOf(i2));
            countDownLatch.countDown();
            return;
        }
        insertData(i, EnumAnnualType.REPORT_HEALTH.value(), 10068, e((List) sparseArray.get(0)).toString());
        insertData(i, EnumAnnualType.REPORT_HEALTH.value(), 10069, a((List) sparseArray.get(1)).toString());
        LogUtil.a("PLGACHIEVE_HealthDataCalculator", "aggregateHiHealthDataEx: end -> ", Integer.valueOf(i));
        countDownLatch.countDown();
    }

    private JsonObject e(List<HiHealthData> list) {
        JsonObject jsonObject = new JsonObject();
        if (CollectionUtils.a(list)) {
            return jsonObject;
        }
        Iterator<HiHealthData> it = list.iterator();
        double d = 0.0d;
        String str = "";
        String strJ = str;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d2 = 0.0d;
        while (it.hasNext()) {
            HiHealthData next = it.next();
            int i4 = next.getInt("allCount");
            int i5 = next.getInt("happyCount");
            int i6 = next.getInt("peaceCount");
            int i7 = next.getInt("unHappyCount");
            i3 += i7;
            JsonObject jsonObject2 = jsonObject;
            Iterator<HiHealthData> it2 = it;
            String strJ2 = str;
            String str2 = strJ;
            double d3 = i4;
            double d4 = ((double) i5) / d3;
            if (Double.compare(d4, d) >= 0) {
                strJ2 = HiDateUtil.j(next.getStartTime());
                d = d4;
            }
            double d5 = ((double) i7) / d3;
            if (Double.compare(d5, d2) >= 0) {
                strJ = HiDateUtil.j(next.getStartTime());
                d2 = d5;
            } else {
                strJ = str2;
            }
            i += i5;
            i2 += i6;
            it = it2;
            jsonObject = jsonObject2;
            str = strJ2;
        }
        JsonObject jsonObject3 = jsonObject;
        jsonObject3.addProperty("happyMonth", str);
        jsonObject3.addProperty("unHappyMonth", strJ);
        jsonObject3.addProperty("happyCount", Integer.valueOf(i));
        jsonObject3.addProperty("peaceCount", Integer.valueOf(i2));
        jsonObject3.addProperty("unHappyCount", Integer.valueOf(i3));
        return jsonObject3;
    }

    private JsonObject a(List<HiHealthData> list) {
        JsonObject jsonObject = new JsonObject();
        if (!CollectionUtils.a(list)) {
            String strJ = "";
            double d = 0.0d;
            double d2 = 0.0d;
            String strJ2 = "";
            for (HiHealthData hiHealthData : list) {
                double d3 = hiHealthData.getDouble("stressAvgScore");
                if (Double.compare(d3, d) >= 0) {
                    strJ = HiDateUtil.j(hiHealthData.getStartTime());
                    d = d3;
                }
                if (Double.compare(d2, 0.0d) <= 0 || Double.compare(d3, d2) <= 0) {
                    strJ2 = HiDateUtil.j(hiHealthData.getStartTime());
                    d2 = d3;
                }
            }
            jsonObject.addProperty("maxAvgScoreMonth", strJ);
            jsonObject.addProperty("monthMaxAvgScore", Integer.valueOf((int) CommonUtil.e(d, 0)));
            jsonObject.addProperty("minAvgScoreMonth", strJ2);
            jsonObject.addProperty("monthMinAvgScore", Integer.valueOf((int) CommonUtil.e(d2, 0)));
        }
        return jsonObject;
    }

    private void e(final int i, long j, long j2, final CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_HealthDataCalculator", "readHiHealthDataEx: start -> ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(e(j, j2));
        final boolean zEquals = "1".equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005));
        if (zEquals) {
            arrayList.add(a(j, j2));
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataEx(arrayList, new HiDataReadResultListener() { // from class: ovh.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (i2 != 0 || !(obj instanceof SparseArray)) {
                    ReleaseLogUtil.b("PLGACHIEVE_HealthDataCalculator", "readHiHealthDataEx(onResult): errorCode -> ", Integer.valueOf(i2));
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() != 0) {
                    ovh.this.insertData(i, EnumAnnualType.REPORT_HEALTH.value(), 10070, ovh.this.d((List) sparseArray.get(DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value())).toString());
                    if (zEquals) {
                        ovh.this.insertData(i, EnumAnnualType.REPORT_HEALTH.value(), 10071, ovh.this.b((List) sparseArray.get(47401)).toString());
                    }
                    LogUtil.a("PLGACHIEVE_HealthDataCalculator", "readHiHealthDataEx: end -> ", Integer.valueOf(i));
                    countDownLatch.countDown();
                    return;
                }
                ReleaseLogUtil.b("PLGACHIEVE_HealthDataCalculator", "readHiHealthDataEx(onResult): sparseArray is empty");
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                ReleaseLogUtil.c("PLGACHIEVE_HealthDataCalculator", "readHiHealthDataEx(onResultIntent): errorCode -> ", Integer.valueOf(i3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JsonObject d(List<HiHealthData> list) {
        JsonObject jsonObject = new JsonObject();
        if (!CollectionUtils.a(list)) {
            jsonObject.addProperty("checkupCount", Integer.valueOf(list.size()));
        }
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JsonObject b(List<HiHealthData> list) {
        JsonObject jsonObject = new JsonObject();
        if (CollectionUtils.a(list)) {
            return jsonObject;
        }
        JsonArray jsonArray = new JsonArray(list.size());
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(Integer.valueOf(HiDateUtil.d(it.next().getStartTime())));
        }
        jsonObject.add(ParsedFieldTag.RECORD_DAY, jsonArray);
        return jsonObject;
    }

    private HiAggregateOption d(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(j, j2);
        hiAggregateOption.setGroupUnitType(5);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSort("start_time", 0);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.EMOTION_STATUS_ALL_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_HAPPY_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_PEACE_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_UNHAPPY_COUNT.value()});
        hiAggregateOption.setConstantsKey(new String[]{"allCount", "happyCount", "peaceCount", "unHappyCount"});
        return hiAggregateOption;
    }

    private HiAggregateOption b(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(j, j2);
        hiAggregateOption.setGroupUnitType(5);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setSort("start_time", 0);
        hiAggregateOption.setType(new int[]{44306});
        hiAggregateOption.setConstantsKey(new String[]{"stressAvgScore"});
        return hiAggregateOption;
    }

    private HiDataReadProOption e(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value()});
        hiDataReadOption.setSortOrder(0);
        return HiDataReadProOption.builder().e(hiDataReadOption).a(1).b();
    }

    private HiDataReadProOption a(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{47401});
        hiDataReadOption.setSortOrder(0);
        return HiDataReadProOption.builder().e(hiDataReadOption).b(HiJsonUtil.d(new HiDataFilter(new HiDataFilter.DataFilterExpression(47401, "=", CommonUtils.j(HiHealthDataType.b(10016)))))).b();
    }
}
