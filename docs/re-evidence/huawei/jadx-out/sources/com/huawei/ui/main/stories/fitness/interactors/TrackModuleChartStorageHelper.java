package com.huawei.ui.main.stories.fitness.interactors;

import android.content.Context;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportDataStaticsInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import defpackage.iwn;
import defpackage.jry;
import defpackage.lsl;
import defpackage.njy;
import defpackage.ntx;
import defpackage.qmf;
import defpackage.uke;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class TrackModuleChartStorageHelper implements IChartStorageHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27089b;

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos == null || responseCallback == null) {
            LogUtil.a("TrackModuleChartStorageHelper", "queryStepDayData: stepDataType or callback == null");
            return;
        }
        this.f27089b = c(dataInfos);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        String str = simpleDateFormat.format(Long.valueOf(j));
        String str2 = simpleDateFormat.format(Long.valueOf(j2));
        int i = this.f27089b;
        if (i != 10001) {
            if (i == 0) {
                e(context, j, j2, dataInfos, responseCallback);
                return;
            } else {
                b(context, j, j2, dataInfos, responseCallback);
                return;
            }
        }
        LogUtil.a("TrackModuleChartStorageHelper", "startTime:", Long.valueOf(j), "", "--startTime :", Long.valueOf(j), "dataType:", Integer.valueOf(i), "-statTimeS:", str, "-endTimeS:", str2);
        if (dataInfos.isAllData()) {
            a(j, j2, 6, responseCallback);
            return;
        }
        if (dataInfos.isYearData()) {
            a(j, j2, 5, responseCallback);
        } else if (!dataInfos.isMonthData() && !dataInfos.isWeekData()) {
            LogUtil.j("TrackModuleChartStorageHelper", "stepDataType error");
        } else {
            a(j, j2, 3, responseCallback);
        }
    }

    private HiSportStatDataAggregateOption a(long j, long j2, DataInfos dataInfos) {
        int i;
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{30001, 288, 289});
        hiSportStatDataAggregateOption.setType(new int[]{Constants.REBACK_MARKET_ENTRANCE, 42005, Constants.REBACK_MARKET_RESULT_CODE, 42008, 42254, 42255, 42253, 5, 4});
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_Duration_Sum", "Track_Count_Sum", "Track_Calorie_Sum", "Track_Abnormal_Count_Sum", "Track_5124", "Track_5125", "Track_5123", "Track_Diving_Count", "Track_Diving_Time_Sum"});
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setReadType(0);
        if (dataInfos.isAllData()) {
            i = 6;
        } else {
            i = dataInfos.isYearData() ? 5 : 3;
        }
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        return hiSportStatDataAggregateOption;
    }

    private void e(Context context, long j, long j2, DataInfos dataInfos, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        int i;
        HiSportStatDataAggregateOption hiSportStatDataAggregateOptionA = a(j, j2, dataInfos);
        if (dataInfos.isAllData()) {
            i = 6;
        } else {
            i = dataInfos.isYearData() ? 5 : 3;
        }
        final ArrayList arrayList = new ArrayList(2);
        final AtomicInteger atomicInteger = new AtomicInteger(2);
        final a aVar = new a(this);
        final int i2 = i;
        HiHealthNativeApi.a(context).aggregateSportStatData(hiSportStatDataAggregateOptionA, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                atomicInteger.decrementAndGet();
                if (list == null) {
                    LogUtil.j("TrackModuleChartStorageHelper", "setAllSportBarView track data is null");
                }
                arrayList.add(list);
                if (atomicInteger.intValue() == 0) {
                    aVar.d(arrayList, i2, responseCallback);
                }
            }
        });
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            return;
        }
        final int i3 = i;
        recordApi.acquireSummaryFitnessRecord(new ntx.d().b(j).d(j2).d(i).a(), new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                atomicInteger.decrementAndGet();
                if (obj == null) {
                    LogUtil.j("TrackModuleChartStorageHelper", "setAllSportBarView fitness data is null");
                }
                arrayList.add(obj);
                if (atomicInteger.intValue() == 0) {
                    aVar.d(arrayList, i3, responseCallback);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    private void b(Context context, long j, long j2, DataInfos dataInfos, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        int[] iArr;
        String[] strArr;
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption;
        jry jryVarA = jry.a(BaseApplication.getContext());
        if (jryVarA.b(dataInfos.getSportType()) == null || jryVarA.b(dataInfos.getSportType()).getSportDataStatics() == null) {
            LogUtil.e("TrackModuleChartStorageHelper", "can not find sport getDataType in json");
            return;
        }
        LogUtil.a("TrackModuleChartStorageHelper", "mSportType:", Integer.valueOf(dataInfos.getSportType()));
        List<HwSportDataStaticsInfo> sportDataStatics = jryVarA.b(dataInfos.getSportType()).getSportDataStatics();
        int[] iArrC = jryVarA.c(sportDataStatics);
        String[] strArrD = jryVarA.d(sportDataStatics);
        if (iArrC == null || strArrD == null || iArrC.length < 1 || strArrD.length < 1) {
            LogUtil.e("TrackModuleChartStorageHelper", "typesSum or constantKeySum data is error");
            return;
        }
        int[] iArr2 = {iArrC[0]};
        String[] strArr2 = {strArrD[0]};
        int sportType = dataInfos.getSportType();
        if (sportType == 286) {
            String[] strArrD2 = jryVarA.d(jryVarA.b(HeartRateThresholdConfig.HEART_RATE_LIMIT).getSportDataStatics());
            iArr = new int[]{iArrC[0], 42405, 42406};
            strArr = new String[]{strArrD[0], strArrD2[0], strArrD2[1]};
        } else {
            if (sportType == 217) {
                List<HwSportDataStaticsInfo> sportDataStatics2 = jryVarA.b(229).getSportDataStatics();
                iArr = new int[]{42352, iArrC[0]};
                strArr = new String[]{strArrD[0], jryVarA.d(sportDataStatics2)[0]};
            }
            String[] strArr3 = strArr2;
            hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
            hiSportStatDataAggregateOption.setSortOrder(1);
            hiSportStatDataAggregateOption.setStartTime(j);
            hiSportStatDataAggregateOption.setEndTime(j2);
            hiSportStatDataAggregateOption.setAggregateType(1);
            hiSportStatDataAggregateOption.setReadType(0);
            hiSportStatDataAggregateOption.setConstantsKey(strArr3);
            hiSportStatDataAggregateOption.setType(iArr2);
            if (sportType == 287) {
                hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{sportType, ComponentInfo.PluginPay_A_N});
            } else {
                hiSportStatDataAggregateOption.setHiHealthTypes(iwn.c(sportType));
            }
            e(context, strArr3, dataInfos, responseCallback, hiSportStatDataAggregateOption);
        }
        strArr2 = strArr;
        iArr2 = iArr;
        String[] strArr4 = strArr2;
        hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(strArr4);
        hiSportStatDataAggregateOption.setType(iArr2);
        if (sportType == 287) {
            hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{sportType, ComponentInfo.PluginPay_A_N});
        } else {
            hiSportStatDataAggregateOption.setHiHealthTypes(iwn.c(sportType));
        }
        e(context, strArr4, dataInfos, responseCallback, hiSportStatDataAggregateOption);
    }

    private void a(long j, long j2, final int i, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("TrackModuleChartStorageHelper", "requestFitnessData recordApi is null.");
        } else {
            recordApi.acquireSummaryFitnessRecord(new ntx.d().b(j).d(j2).d(i).a(), new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    responseCallback.onResult(0, TrackModuleChartStorageHelper.this.d(obj, i));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, IStorageModel> d(Object obj, int i) {
        HashMap map = new HashMap();
        if (obj == null || !njy.b(obj, FitnessTrackRecord.class)) {
            LogUtil.j("TrackModuleChartStorageHelper", "objData is null or objData is not List");
            return map;
        }
        long j = i == 7 ? 0L : i == 6 ? com.huawei.openalliance.ad.constant.Constants.TWO_WEEK : 43200000L;
        if (!njy.b(obj, FitnessTrackRecord.class)) {
            LogUtil.j("TrackModuleChartStorageHelper", "objData instance fail!");
            return map;
        }
        for (FitnessTrackRecord fitnessTrackRecord : (List) obj) {
            if (fitnessTrackRecord != null) {
                long jAcquireMonthZeroTime = fitnessTrackRecord.acquireMonthZeroTime();
                if (i == 7) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jAcquireMonthZeroTime);
                    calendar.set(2, 5);
                    calendar.set(5, 30);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    jAcquireMonthZeroTime = calendar.getTimeInMillis();
                }
                float fAcquireSumExerciseTime = (fitnessTrackRecord.acquireSumExerciseTime() / 1000.0f) / 60.0f;
                LogUtil.a("TrackModuleChartStorageHelper", "fitnessTrackRecords startTime:", Long.valueOf(jAcquireMonthZeroTime), "-duringMin:", Float.valueOf(fAcquireSumExerciseTime));
                map.put(Long.valueOf(jAcquireMonthZeroTime + j), new qmf(fAcquireSumExerciseTime));
            }
        }
        return map;
    }

    private int c(DataInfos dataInfos) {
        if (dataInfos.isStepData()) {
            return dataInfos.isSumData() ? 40002 : 2;
        }
        if (dataInfos.isCaloriesData()) {
            return dataInfos.isSumData() ? 40003 : 4;
        }
        if (dataInfos.isDistanceData()) {
            return dataInfos.isSumData() ? 40004 : 3;
        }
        if (dataInfos.isClimbData()) {
            if (dataInfos.isSumData()) {
                return SmartMsgConstant.MSG_TYPE_RIDE_USER;
            }
            return 5;
        }
        if (dataInfos.isSportFitnessData()) {
            return 10001;
        }
        return d(dataInfos);
    }

    private int d(DataInfos dataInfos) {
        jry jryVarA = jry.a(BaseApplication.getContext());
        if (jryVarA.b(dataInfos.getSportType()) == null || jryVarA.b(dataInfos.getSportType()).getSportDataStatics() == null) {
            LogUtil.e("TrackModuleChartStorageHelper", "can not find sport getDataType in json");
            return 258;
        }
        LogUtil.a("TrackModuleChartStorageHelper", "mSportType:", Integer.valueOf(dataInfos.getSportType()));
        if (dataInfos.getSportType() == 0) {
            return 0;
        }
        int[] iArrC = jryVarA.c(jryVarA.b(dataInfos.getSportType()).getSportDataStatics());
        if (iArrC == null || iArrC.length < 1) {
            LogUtil.e("TrackModuleChartStorageHelper", "typesId is wrong");
            return 258;
        }
        int i = iArrC[0];
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    i2 = 21;
                    if (i != 21) {
                        i2 = 22;
                        if (i != 22) {
                            LogUtil.e("TrackModuleChartStorageHelper", "typesSum is not time or distance", Integer.valueOf(i));
                            return 40002;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private void e(Context context, final String[] strArr, final DataInfos dataInfos, ResponseCallback<Map<Long, IStorageModel>> responseCallback, HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        int i;
        if (dataInfos.isAllData()) {
            i = 6;
        } else {
            i = dataInfos.isYearData() ? 5 : 3;
        }
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        HiHealthNativeApi.a(context).aggregateSportStatData(hiSportStatDataAggregateOption, new SportDataModuleReadListener(responseCallback) { // from class: com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.4
            @Override // com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.SportDataModuleReadListener
            public void onResultData(List<HiHealthData> list, int i2, int i3) {
                if (this.mCallback == null) {
                    LogUtil.j("TrackModuleChartStorageHelper", "requestTrackStatData callback is null");
                    return;
                }
                HashMap map = new HashMap();
                if (list != null && list.size() > 0) {
                    TrackModuleChartStorageHelper.this.c(strArr, list, map, dataInfos);
                    this.mCallback.onResult(i2, map);
                } else {
                    LogUtil.j("TrackModuleChartStorageHelper", "aggregateHiHealthDataEx requestTrackBarData onResult is null");
                    this.mCallback.onResult(-1, null);
                }
            }

            @Override // com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper.SportDataModuleReadListener
            public void onResultIntentData(int i2, List<HiHealthData> list, int i3, int i4) {
                if (this.mCallback == null) {
                    LogUtil.j("TrackModuleChartStorageHelper", "requestTrackStatData callback is null");
                } else {
                    LogUtil.a("TrackModuleChartStorageHelper", "onResultIntent");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String[] strArr, List<HiHealthData> list, Map<Long, IStorageModel> map, DataInfos dataInfos) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.e("TrackModuleChartStorageHelper", "hiHealthData is null");
                return;
            }
            int i = hiHealthData.getInt("hihealth_type");
            long jE = e(hiHealthData, dataInfos);
            double d = hiHealthData.getDouble(strArr[0]);
            if (dataInfos.getSportType() == 286 && (i == 286 || i == 30001)) {
                double d2 = hiHealthData.getDouble(e(i, strArr));
                if (strArr.length > 2) {
                    double d3 = hiHealthData.getDouble(strArr[2]);
                    d2 -= d3;
                    LogUtil.a("TrackModuleChartStorageHelper", "handleYearTrackBarData, abnormalValue:", Double.valueOf(d3), ", value:", Double.valueOf(d2));
                }
                e(map, jE, d2);
            } else if (i == 287 || i == 291) {
                e(map, jE, d);
            } else if (dataInfos.getSportType() == 217) {
                for (String str : strArr) {
                    e(map, jE, hiHealthData.getDouble(str));
                }
            } else {
                map.put(Long.valueOf(jE), new qmf(e(d)));
            }
        }
    }

    private long e(HiHealthData hiHealthData, DataInfos dataInfos) {
        long startTime = hiHealthData.getStartTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        calendar.set(11, 0);
        calendar.set(12, 0);
        if (dataInfos.isAllData()) {
            calendar.set(2, 5);
            calendar.set(5, 30);
            return calendar.getTimeInMillis();
        }
        if (!dataInfos.isYearData()) {
            return startTime + 43200000;
        }
        calendar.set(5, 1);
        return calendar.getTimeInMillis() + com.huawei.openalliance.ad.constant.Constants.TWO_WEEK;
    }

    private float e(double d) {
        int i = this.f27089b;
        if (i == 4) {
            return ((float) d) / 60000.0f;
        }
        if (i == 5) {
            return (float) d;
        }
        if (i == 21) {
            return ((float) d) / 60.0f;
        }
        if (i != 22) {
            return UnitUtil.f() ? (float) ((d / 1000.0d) * UnitUtil.e(1.0d, 3)) : ((float) d) / 1000.0f;
        }
        if (UnitUtil.f()) {
            return (float) UnitUtil.d(UnitUtil.e(d / 10.0d, 1), 1);
        }
        return (float) UnitUtil.d(d / 10.0d, 1);
    }

    private void e(Map<Long, IStorageModel> map, long j, double d) {
        if (map.containsKey(Long.valueOf(j))) {
            IStorageModel iStorageModel = map.get(Long.valueOf(j));
            if (iStorageModel instanceof qmf) {
                map.put(Long.valueOf(j), new qmf(((qmf) iStorageModel).b() + e(d)));
                return;
            }
            return;
        }
        map.put(Long.valueOf(j), new qmf(e(d)));
    }

    private String e(int i, String[] strArr) {
        return (i != 30001 || strArr.length <= 1) ? strArr[0] : strArr[1];
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<TrackModuleChartStorageHelper> f27098b;
        private Map<Long, IStorageModel> e = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<Long, IStorageModel> f27099c = new HashMap();

        private long b(int i) {
            if (i == 6) {
                return 0L;
            }
            if (i == 5) {
                return com.huawei.openalliance.ad.constant.Constants.TWO_WEEK;
            }
            return 43200000L;
        }

        private float c(double d) {
            return (float) (d / 1000.0d);
        }

        private float e(double d) {
            return (float) ((d / 1000.0d) / 60.0d);
        }

        a(TrackModuleChartStorageHelper trackModuleChartStorageHelper) {
            this.f27098b = new WeakReference<>(trackModuleChartStorageHelper);
        }

        void d(List<Object> list, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            if (list.size() < 2) {
                responseCallback.onResult(-1, null);
                return;
            }
            if (list.get(0) == null && list.get(1) == null) {
                responseCallback.onResult(-1, null);
                return;
            }
            long jB = b(i);
            for (Object obj : list) {
                if (njy.b(obj, HiHealthData.class)) {
                    if (obj instanceof List) {
                        a((List) obj, i, jB);
                    }
                } else if (njy.b(obj, FitnessTrackRecord.class)) {
                    if (obj instanceof List) {
                        d((List<FitnessTrackRecord>) obj, i, jB);
                    }
                } else {
                    LogUtil.a("TrackModuleChartStorageHelper", "wrong type");
                }
            }
            e(responseCallback);
        }

        private void a(List<HiHealthData> list, int i, long j) {
            if (list == null) {
                LogUtil.j("TrackModuleChartStorageHelper", "collectTrackSportData trackRecords is null");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, 5);
            calendar.set(5, 30);
            calendar.set(11, 0);
            calendar.set(12, 0);
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jC = c(i, list.get(i2).getStartTime());
                calendar.setTimeInMillis(jC);
                uke ukeVarC = c(list.get(i2));
                long j2 = jC + j;
                if (this.e.containsKey(Long.valueOf(j2))) {
                    uke ukeVar = (uke) this.e.get(Long.valueOf(j2));
                    ukeVarC.put(DataLayerType.DURATION, ukeVarC.getCeil(DataLayerType.DURATION) + ukeVar.getCeil(DataLayerType.DURATION));
                    ukeVarC.put(DataLayerType.TIMES, ukeVarC.getCeil(DataLayerType.TIMES) + ukeVar.getCeil(DataLayerType.TIMES));
                    ukeVarC.put(DataLayerType.CALORIES, ukeVarC.getCeil(DataLayerType.CALORIES) + ukeVar.getCeil(DataLayerType.CALORIES));
                }
                this.e.put(Long.valueOf(j2), ukeVarC);
            }
        }

        private uke c(HiHealthData hiHealthData) {
            uke ukeVar = new uke();
            ukeVar.put(DataLayerType.DURATION, e((hiHealthData.getDouble("Track_Duration_Sum") + hiHealthData.getDouble("Track_5124")) - hiHealthData.getDouble("Track_Diving_Time_Sum")));
            DataLayerType dataLayerType = DataLayerType.TIMES;
            float f = hiHealthData.getFloat("Track_Count_Sum");
            float f2 = hiHealthData.getFloat("Track_5125");
            ukeVar.put(dataLayerType, ((f + f2) - hiHealthData.getFloat("Track_Abnormal_Count_Sum")) - hiHealthData.getFloat("Track_Diving_Count"));
            ukeVar.put(DataLayerType.CALORIES, c(hiHealthData.getDouble("Track_Calorie_Sum") + hiHealthData.getDouble("Track_5123")));
            return ukeVar;
        }

        private void d(List<FitnessTrackRecord> list, int i, long j) {
            if (list == null) {
                LogUtil.j("TrackModuleChartStorageHelper", "collectFitnessSportData fitnessRecords is null");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, 5);
            calendar.set(5, 30);
            calendar.set(11, 0);
            calendar.set(12, 0);
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jC = c(i, list.get(i2).acquireMonthZeroTime());
                calendar.setTimeInMillis(jC);
                this.f27099c.put(Long.valueOf(jC + j), e(list.get(i2)));
            }
        }

        private uke e(FitnessTrackRecord fitnessTrackRecord) {
            uke ukeVar = new uke();
            ukeVar.put(DataLayerType.DURATION, e(fitnessTrackRecord.acquireSumExerciseTime()));
            ukeVar.put(DataLayerType.TIMES, fitnessTrackRecord.acquireSumExerciseTimes());
            ukeVar.put(DataLayerType.CALORIES, c(fitnessTrackRecord.acquireSumCalorie()));
            return ukeVar;
        }

        private long c(int i, long j) {
            if (i == 6) {
                return lsl.t(j);
            }
            return i == 5 ? lsl.p(j) : j;
        }

        private void e(ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            if (this.e.isEmpty()) {
                responseCallback.onResult(0, this.f27099c);
                return;
            }
            if (this.f27099c.isEmpty()) {
                responseCallback.onResult(0, this.e);
                return;
            }
            for (Map.Entry<Long, IStorageModel> entry : this.f27099c.entrySet()) {
                if (this.e.containsKey(entry.getKey())) {
                    if (!(this.e.get(entry.getKey()) instanceof uke) || !(entry.getValue() instanceof uke)) {
                        break;
                    }
                    uke ukeVar = (uke) this.e.get(entry.getKey());
                    uke ukeVar2 = (uke) entry.getValue();
                    uke ukeVar3 = new uke();
                    ukeVar3.put(DataLayerType.DURATION, ukeVar.getCeil(DataLayerType.DURATION) + ukeVar2.getCeil(DataLayerType.DURATION));
                    ukeVar3.put(DataLayerType.TIMES, ukeVar.getCeil(DataLayerType.TIMES) + ukeVar2.getCeil(DataLayerType.TIMES));
                    ukeVar3.put(DataLayerType.CALORIES, ukeVar.getCeil(DataLayerType.CALORIES) + ukeVar2.getCeil(DataLayerType.CALORIES));
                    this.e.put(entry.getKey(), ukeVar3);
                } else {
                    this.e.put(entry.getKey(), entry.getValue());
                }
            }
            responseCallback.onResult(0, this.e);
        }
    }

    public static abstract class SportDataModuleReadListener implements HiAggregateListener {
        protected ResponseCallback<Map<Long, IStorageModel>> mCallback;

        public abstract void onResultData(List<HiHealthData> list, int i, int i2);

        public abstract void onResultIntentData(int i, List<HiHealthData> list, int i2, int i3);

        protected SportDataModuleReadListener(ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.mCallback = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.j("TrackModuleChartStorageHelper", "StepModuleReadListener onResult", "anchor", Integer.valueOf(i2));
            onResultData(list, i, i2);
            if (i2 == 2 || i == 1) {
                this.mCallback = null;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.j("TrackModuleChartStorageHelper", "StepModuleReadListener onResultIntent", "anchor", Integer.valueOf(i3));
            onResultIntentData(i, list, i2, i3);
            if (i3 == 2 || i2 == 1) {
                this.mCallback = null;
            }
        }
    }
}
