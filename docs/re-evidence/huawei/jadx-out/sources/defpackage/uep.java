package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateListener;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AggregateOptionBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class uep implements IChartStorageHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicInteger f49991c = new AtomicInteger(0);
    private final Map<String, ResponseCallback<Map<Long, IStorageModel>>> d = new HashMap();

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        String strA = cVar.a();
        if (dataInfos.isDayData()) {
            if (!qnh.s(j)) {
                responseCallback.onResult(-1, null);
                return;
            }
            this.f49991c.getAndIncrement();
            this.d.put(strA, responseCallback);
            if (this.f49991c.get() == 4) {
                this.f49991c.set(0);
                ueg.c(j, j2, this.d);
                return;
            }
            return;
        }
        a(dataInfos, strA, e(j, j2, dataInfos, strA), responseCallback);
    }

    private List<HiAggregateOption> e(long j, long j2, DataInfos dataInfos, String str) {
        ArrayList arrayList = new ArrayList(16);
        AggregateOptionBuilder aggregateOptionBuilderD = new AggregateOptionBuilder().d(j, j2);
        if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(str)) {
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "HR_NORMAL_MAX", 46016));
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "HR_NORMAL_MIN", 46017));
            return arrayList;
        }
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(str)) {
            arrayList.add(aggregateOptionBuilderD.e(uei.e(dataInfos, "HR_REST"), "HR_REST", 46018));
            arrayList.add(aggregateOptionBuilderD.e(uei.e(dataInfos, "HR_SLEEP_REST"), "HR_SLEEP_REST", 46020));
            return arrayList;
        }
        if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(str)) {
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "HR_WARNING_MAX", 47003));
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "HR_WARNING_MIN", 47002));
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "HR_WARNING_DETAIL", 2101));
            return arrayList;
        }
        if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(str)) {
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "BRADYCARDIA_MAX", 47053));
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "BRADYCARDIA_MIN", 47052));
            arrayList.add(aggregateOptionBuilderD.e(uei.a(dataInfos), "BRADYCARDIA_DETAIL", 2102));
            return arrayList;
        }
        LogUtil.a("HeartRateStorageHelper", "showModeArg acquireDataLayerId is null");
        return arrayList;
    }

    private Map<String, ues> b(DataInfos dataInfos, String str, List<HiAggregateOption> list) {
        HashMap map = new HashMap(16);
        if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(str)) {
            map.put("HR_NORMAL_MAX", new ues(0, list.get(0).getGroupUnitType()));
            map.put("HR_NORMAL_MIN", new ues(1, list.get(1).getGroupUnitType()));
            return map;
        }
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(str)) {
            int groupUnitType = dataInfos.isYearData() ? 5 : list.get(0).getGroupUnitType();
            map.put("HR_REST", new ues(0, groupUnitType));
            map.put("HR_SLEEP_REST", new ues(1, groupUnitType));
            return map;
        }
        if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(str)) {
            map.put("HR_WARNING_MAX", new ues(0, list.get(0).getGroupUnitType()));
            map.put("HR_WARNING_MIN", new ues(1, list.get(1).getGroupUnitType()));
            map.put("HR_WARNING_DETAIL", new ues(2, list.get(2).getGroupUnitType()));
            return map;
        }
        if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(str)) {
            map.put("BRADYCARDIA_MAX", new ues(0, list.get(0).getGroupUnitType()));
            map.put("BRADYCARDIA_MIN", new ues(1, list.get(1).getGroupUnitType()));
            map.put("BRADYCARDIA_DETAIL", new ues(2, list.get(2).getGroupUnitType()));
            return map;
        }
        LogUtil.a("HeartRateStorageHelper", "loadQueryOptionsConstMap is other");
        return map;
    }

    public void a(final DataInfos dataInfos, final String str, List<HiAggregateOption> list, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        final Map<String, ues> mapB = b(dataInfos, str, list);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataEx(list, new HeartRateListener(responseCallback) { // from class: uep.2
            @Override // com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateListener
            public void onResultData(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                LogUtil.a("HeartRateStorageHelper", "queryStatisticsData dataList ", sparseArray, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                if (this.mCallback == null) {
                    LogUtil.j("HeartRateStorageHelper", "mCallback is null");
                    return;
                }
                if (sparseArray == null || sparseArray.size() == 0) {
                    LogUtil.j("HeartRateStorageHelper", "queryStatisticsData data is null type: ", str);
                    this.mCallback.onResult(-1, null);
                    return;
                }
                if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(str)) {
                    uei.a(sparseArray, dataInfos);
                }
                HashMap map = new HashMap(16);
                uep.this.e(map, sparseArray, str, (Map<String, ues>) mapB);
                LogUtil.a("HeartRateStorageHelper", "queryStatisticsData resultMap ", map);
                responseCallback.onResult(0, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<Long, IStorageModel> map, SparseArray<List<HiHealthData>> sparseArray, String str, Map<String, ues> map2) {
        if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(str)) {
            uei.a(map, "HR_NORMAL_MAX", sparseArray, map2.get("HR_NORMAL_MAX"));
            uei.a(map, "HR_NORMAL_MIN", sparseArray, map2.get("HR_NORMAL_MIN"));
            uei.e(map, false);
            return;
        }
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(str)) {
            uei.a(map, "HR_REST", sparseArray, map2.get("HR_REST"));
            uei.a(map, "HR_REST_DETAIL", sparseArray, map2.get("HR_REST_DETAIL"));
            uei.d(map, false);
        } else {
            if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(str)) {
                uei.a(map, "HR_WARNING_MAX", sparseArray, map2.get("HR_WARNING_MAX"));
                uei.a(map, "HR_WARNING_MIN", sparseArray, map2.get("HR_WARNING_MIN"));
                uei.a(map, "HR_WARNING_DETAIL", sparseArray.get(2), map2.get("HR_WARNING_MAX"));
                uei.b(map, false);
                return;
            }
            if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(str)) {
                uei.a(map, "BRADYCARDIA_MAX", sparseArray, map2.get("BRADYCARDIA_MAX"));
                uei.a(map, "BRADYCARDIA_MIN", sparseArray, map2.get("BRADYCARDIA_MIN"));
                uei.a(map, "BRADYCARDIA_DETAIL", sparseArray.get(2), map2.get("BRADYCARDIA_MAX"));
                uei.c(map, false);
                return;
            }
            LogUtil.j("HeartRateStorageHelper", "showModeArg.acquireDataLayerId(): ", str);
        }
    }
}
