package com.huawei.ui.main.stories.fitness.interactors;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartEnumDetailHelper;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qmf;
import defpackage.qmg;
import defpackage.qqn;
import defpackage.qrk;
import defpackage.uji;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes19.dex */
public class StepModuleChartStorageHelper implements IChartStorageHelper, IChartEnumDetailHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27077c = false;
    private List<Integer> g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27079b = qqn.d(R.color.active_hours_default);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27078a = qqn.d(R.color.active_time_color);
    private int i = qqn.d(R.color.three_circle_hour_unmark_normal);
    private int j = qqn.d(R.color.three_circle_hour_ummark_focus);
    private int d = qqn.d(R.color.three_circle_hour_current_unmark_normal);
    private int e = qqn.d(R.color.three_circle_hour_current_unmark_focus);
    private long h = 0;

    private int c(int i) {
        if (i == 2) {
            return 40002;
        }
        if (i == 4) {
            return 40003;
        }
        if (i == 3) {
            return 40004;
        }
        if (i == 5) {
            return SmartMsgConstant.MSG_TYPE_RIDE_USER;
        }
        if (i == 7) {
            return 47101;
        }
        return i;
    }

    public StepModuleChartStorageHelper() {
        this.g.add(2);
        this.g.add(4);
        this.g.add(3);
        this.g.add(5);
    }

    public void b(List<Integer> list) {
        if (list == null) {
            LogUtil.j("StepModuleChartStorageHelper", "specifiedPreloadHiHealthDataTypes preloadHiHealthDataTypes is null  ");
        } else {
            this.g.clear();
            this.g.addAll(list);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartEnumDetailHelper
    public List<Integer> queryDetailDayData() {
        return this.g;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos == null || responseCallback == null) {
            LogUtil.j("StepModuleChartStorageHelper", "queryStepDayData stepDataType and callback == null ");
            return;
        }
        long j3 = j2 - 1;
        int iE = e(dataInfos);
        if (dataInfos.isTimeStrengthData() || dataInfos.isActiveHoursData()) {
            if (dataInfos.isYearData()) {
                a(context, j, j3, iE, responseCallback);
                LogUtil.d("StepModuleChartStorageHelper", "isYearData start  ", Long.valueOf(j), "endTime", Long.valueOf(j3), "dataType  ", Integer.valueOf(iE));
                return;
            } else if (dataInfos.isDayData()) {
                b(context, j, j3, iE, responseCallback);
                LogUtil.d("StepModuleChartStorageHelper", "isDayData start  ", Long.valueOf(j), "  endTime", Long.valueOf(j3), "  dataType  ", Integer.valueOf(iE));
                return;
            } else {
                e(context, j, j3, iE, responseCallback);
                LogUtil.d("StepModuleChartStorageHelper", "is weekAndMonth start  ", Long.valueOf(j), "  endTime", Long.valueOf(j3), "  dataType  ", Integer.valueOf(iE));
                return;
            }
        }
        float fD = d(dataInfos);
        a aVarE = e(j, responseCallback, j3, iE, fD);
        if (dataInfos.isYearData()) {
            c(context, aVarE);
        } else if (dataInfos.isDayData()) {
            a(j, dataInfos, responseCallback, fD, aVarE);
        } else {
            a(context, aVarE);
        }
    }

    private void a(long j, DataInfos dataInfos, ResponseCallback<Map<Long, IStorageModel>> responseCallback, float f, a aVar) {
        String strC;
        SparseArray<List<HiHealthData>> sparseArrayD;
        if (!dataInfos.isStepData()) {
            strC = "";
            sparseArrayD = null;
        } else {
            strC = qrk.c(j);
            sparseArrayD = uji.d(strC);
            if (f27077c && sparseArrayD != null && sparseArrayD.size() == 2) {
                LogUtil.a("StepModuleChartStorageHelper", "show step day data use cache");
                d(sparseArrayD, f, responseCallback);
            }
        }
        LogUtil.a("StepModuleChartStorageHelper", "query step day data start");
        this.h = System.currentTimeMillis();
        b(aVar, sparseArrayD, strC);
    }

    private a e(long j, ResponseCallback<Map<Long, IStorageModel>> responseCallback, long j2, int i, float f) {
        a aVar = new a();
        aVar.b(j);
        aVar.a(j2);
        aVar.e(i);
        aVar.d(f);
        aVar.c(responseCallback);
        return aVar;
    }

    private float d(DataInfos dataInfos) {
        if (dataInfos.isDistanceData()) {
            if (UnitUtil.f()) {
                return ((float) UnitUtil.e(1.0d, 3)) * 0.001f;
            }
            return 0.001f;
        }
        if (!dataInfos.isClimbData()) {
            return dataInfos.isCaloriesData() ? 0.001f : 1.0f;
        }
        if (UnitUtil.f()) {
            return ((float) UnitUtil.e(1.0d, 1)) * 0.1f;
        }
        return 0.1f;
    }

    private void e(Context context, long j, long j2, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{i});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new StepModuleReadListener(responseCallback, i) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.2
            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleReadListener
            public void onResultIntentData(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleReadListener
            public void onResultData(Object obj, int i2, int i3) {
                if (obj == null) {
                    return;
                }
                LogUtil.a("StepModuleChartStorageHelper", "requestDayMiddleAndHighStrengthBarData data", obj.toString(), "  errorCode", Integer.valueOf(i2), " anchor", Integer.valueOf(i3));
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("StepModuleChartStorageHelper", "data instance fail");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() == 0) {
                    LogUtil.j("StepModuleChartStorageHelper", "requestDayMiddleAndHighStrengthBarData data is null");
                    this.mCallback.onResult(-1, null);
                    return;
                }
                Object obj2 = sparseArray.get(this.mDataType);
                if (!njy.b(obj2, HiHealthData.class)) {
                    LogUtil.j("StepModuleChartStorageHelper", "stepObj instance fail");
                    return;
                }
                HashMap map = new HashMap();
                for (HiHealthData hiHealthData : (List) obj2) {
                    if (hiHealthData != null) {
                        long startTime = hiHealthData.getStartTime();
                        map.put(Long.valueOf(startTime + 43200000), new qmf(hiHealthData.getFloatValue()));
                    }
                }
                this.mCallback.onResult(0, map);
            }
        });
    }

    private void b(Context context, final long j, long j2, final int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{i});
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new StepModuleReadListener(responseCallback, i) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.5
            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleReadListener
            public void onResultIntentData(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleReadListener
            public void onResultData(Object obj, int i2, int i3) {
                Map<Long, IStorageModel> mapA;
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("StepModuleChartStorageHelper", "data instance fail");
                    return;
                }
                LogUtil.a("StepModuleChartStorageHelper", "requestHalfHourMiddleAndHighStrengthBarData errorCode", Integer.valueOf(i2), " anchor", Integer.valueOf(i3));
                SparseArray sparseArray = (SparseArray) obj;
                int i4 = 0;
                if (sparseArray.size() == 0) {
                    LogUtil.j("StepModuleChartStorageHelper", " data is null");
                    if (i == DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()) {
                        mapA = StepModuleChartStorageHelper.this.a();
                    } else {
                        mapA = null;
                        i4 = -1;
                    }
                    this.mCallback.onResult(i4, mapA);
                    return;
                }
                Object obj2 = sparseArray.get(this.mDataType);
                if (njy.b(obj2, HiHealthData.class)) {
                    List list = (List) obj2;
                    Map<Long, IStorageModel> mapE = StepModuleChartStorageHelper.this.e((List<HiHealthData>) list);
                    if (i == DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()) {
                        mapE = StepModuleChartStorageHelper.this.d((List<HiHealthData>) list, j);
                    }
                    this.mCallback.onResult(0, mapE);
                    return;
                }
                LogUtil.j("StepModuleChartStorageHelper", "stepObj instance fail");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, IStorageModel> e(List<HiHealthData> list) {
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                LogUtil.d("StepModuleChartStorageHelper", " requestHalfHourMiddleAndHighStrengthBarData   ", Float.valueOf(hiHealthData.getFloatValue()));
                Calendar calendarA = a(hiHealthData.getStartTime());
                IStorageModel iStorageModel = (IStorageModel) map.get(Long.valueOf(calendarA.getTimeInMillis()));
                qmf qmfVar = iStorageModel instanceof qmf ? (qmf) iStorageModel : null;
                if (qmfVar == null) {
                    map.put(Long.valueOf(calendarA.getTimeInMillis()), new qmf(1.0f));
                } else {
                    map.put(Long.valueOf(calendarA.getTimeInMillis()), new qmf(qmfVar.b() + 1.0f));
                }
            }
        }
        return map;
    }

    private void a(Context context, long j, long j2, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        b(context, responseCallback, d(i, j, j2));
    }

    private void b(Context context, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiAggregateOption> list) {
        HiHealthManager.d(context).aggregateHiHealthDataEx(list, new StepModuleAggregateListener(responseCallback, 0.0f) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.4
            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleAggregateListener
            public void onResultData(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                if (sparseArray == null) {
                    this.mCallback.onResult(-1, null);
                    return;
                }
                if (sparseArray.size() == 0) {
                    LogUtil.j("StepModuleChartStorageHelper", " data is null");
                    this.mCallback.onResult(-1, null);
                    return;
                }
                List<HiHealthData> list2 = sparseArray.get(0);
                List<HiHealthData> list3 = sparseArray.get(1);
                HashMap map = new HashMap();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    try {
                        HiHealthData hiHealthData = list2.get(i3);
                        HiHealthData hiHealthData2 = list3.get(i3);
                        long startTime = hiHealthData.getStartTime();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(startTime);
                        calendar.set(5, 1);
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        float f = hiHealthData.getFloat("content");
                        float f2 = hiHealthData2.getFloat("sum");
                        if (Math.abs(f) < 1.0E-4d) {
                            map.put(Long.valueOf(calendar.getTimeInMillis() + 1296000000), new qmg(f, f2, 0));
                        } else {
                            map.put(Long.valueOf(calendar.getTimeInMillis() + 1296000000), new qmg(f, f2, Math.round(f2 / f)));
                        }
                    } catch (Exception e) {
                        LogUtil.e("StepModuleChartStorageHelper", LogAnonymous.b(e));
                    }
                }
                this.mCallback.onResult(0, map);
            }
        });
    }

    private int e(DataInfos dataInfos) {
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
        if (dataInfos.isSportRunData()) {
            return 258;
        }
        if (dataInfos.isSportWalkData()) {
            return 257;
        }
        if (dataInfos.isSportBikeData()) {
            return 259;
        }
        if (dataInfos.isTimeStrengthData()) {
            return dataInfos.isSumData() ? 47101 : 7;
        }
        if (!dataInfos.isActiveHoursData()) {
            return 40002;
        }
        if (dataInfos.isSumData()) {
            return DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value();
        }
        return DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value();
    }

    private void a(Context context, a aVar) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(aVar.b());
        hiAggregateOption.setEndTime(aVar.c());
        hiAggregateOption.setAggregateType(1);
        int iA = aVar.a();
        String[] strArrB = b(iA);
        int[] iArrE = e(iA);
        hiAggregateOption.setConstantsKey(strArrB);
        hiAggregateOption.setType(iArrE);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        e(context, aVar.d(), aVar.e(), arrayList);
    }

    private void e(Context context, float f, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiAggregateOption> list) {
        if (responseCallback == null) {
            LogUtil.j("StepModuleChartStorageHelper", "aggregateOptionHealthData callback == null");
        } else {
            HiHealthManager.d(context).aggregateHiHealthDataEx(list, new StepModuleAggregateListener(responseCallback, f) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.1
                @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleAggregateListener
                public void onResultData(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                    if (sparseArray == null || sparseArray.size() == 0) {
                        LogUtil.j("StepModuleChartStorageHelper", "readStepDataAsDayUnit triggered but the data is null");
                        if (this.mCallback != null) {
                            this.mCallback.onResult(-1, null);
                            return;
                        }
                        return;
                    }
                    List<HiHealthData> list2 = sparseArray.get(0);
                    HashMap map = new HashMap();
                    for (HiHealthData hiHealthData : list2) {
                        if (hiHealthData != null && StepModuleChartStorageHelper.this.a(hiHealthData) != 0.0f) {
                            qmf qmfVar = new qmf(hiHealthData.getFloat("sum") * this.mTransferRate);
                            map.put(Long.valueOf(hiHealthData.getStartTime() + 43200000), qmfVar);
                            qmfVar.put(MotionType.SUM, StepModuleChartStorageHelper.this.a(hiHealthData) * this.mTransferRate);
                            qmfVar.put(MotionType.WALK, StepModuleChartStorageHelper.this.e(hiHealthData) * this.mTransferRate);
                            qmfVar.put(MotionType.RUN, StepModuleChartStorageHelper.this.c(hiHealthData) * this.mTransferRate);
                            qmfVar.put(MotionType.BIKE, StepModuleChartStorageHelper.this.d(hiHealthData) * this.mTransferRate);
                            qmfVar.put(MotionType.CLIMB, StepModuleChartStorageHelper.this.b(hiHealthData) * this.mTransferRate);
                            float f2 = hiHealthData.getFloat("sum");
                            float f3 = this.mTransferRate;
                            float motionType = qmfVar.getMotionType(MotionType.WALK) + qmfVar.getMotionType(MotionType.RUN) + qmfVar.getMotionType(MotionType.BIKE) + qmfVar.getMotionType(MotionType.CLIMB);
                            if (f2 * f3 < motionType) {
                                qmfVar.put(MotionType.SUM, motionType);
                            }
                        }
                    }
                    this.mCallback.onResult(0, map);
                }
            });
        }
    }

    private void c(Context context, a aVar) {
        ResponseCallback<Map<Long, IStorageModel>> responseCallbackE = aVar.e();
        if (responseCallbackE == null) {
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jB = aVar.b();
        hiAggregateOption.setStartTime(jB);
        long jC = aVar.c();
        hiAggregateOption.setEndTime(jC);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setConstantsKey(new String[]{"content"});
        int iA = aVar.a();
        hiAggregateOption.setType(new int[]{iA});
        hiAggregateOption.setGroupUnitType(5);
        hiAggregateOption.setReadType(0);
        LogUtil.a("StepModuleChartStorageHelper", "getFitnessDataDetail aggregateOption=", hiAggregateOption.toString());
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(jB);
        hiAggregateOption2.setEndTime(jC);
        hiAggregateOption2.setAggregateType(1);
        String[] strArrB = b(iA);
        int[] iArrE = e(iA);
        hiAggregateOption2.setConstantsKey(strArrB);
        hiAggregateOption2.setType(iArrE);
        hiAggregateOption2.setGroupUnitType(5);
        hiAggregateOption2.setReadType(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        arrayList.add(hiAggregateOption2);
        b(context, aVar.d(), responseCallbackE, arrayList);
    }

    private void b(Context context, float f, ResponseCallback<Map<Long, IStorageModel>> responseCallback, List<HiAggregateOption> list) {
        HiHealthManager.d(context).aggregateHiHealthDataEx(list, new StepModuleAggregateListener(responseCallback, f) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.3
            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleAggregateListener
            public void onResultData(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                if (sparseArray == null || sparseArray.size() == 0) {
                    LogUtil.j("StepModuleChartStorageHelper", "triggered but the data is null");
                    if (this.mCallback != null) {
                        this.mCallback.onResult(-1, null);
                        return;
                    }
                    return;
                }
                List<HiHealthData> list2 = sparseArray.get(0);
                List<HiHealthData> list3 = sparseArray.get(1);
                HashMap map = new HashMap();
                if (list2 == null || list3 == null) {
                    return;
                }
                HashMap map2 = new HashMap();
                for (HiHealthData hiHealthData : list3) {
                    String string = Long.toString(hiHealthData.getDay());
                    if (string.length() >= 7) {
                        map2.put(string.substring(0, 7), hiHealthData);
                    }
                }
                try {
                    StepModuleChartStorageHelper.this.c(map, list2, list3, map2, this.mTransferRate, 1296000000L);
                } catch (Exception e) {
                    LogUtil.e("StepModuleChartStorageHelper", LogAnonymous.b(e));
                }
                this.mCallback.onResult(0, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Map<Long, IStorageModel> map, List<HiHealthData> list, List<HiHealthData> list2, Map<String, HiHealthData> map2, float f, long j) {
        HiHealthData hiHealthData;
        HiHealthData hiHealthData2;
        qmg qmgVar;
        HiHealthData hiHealthData3 = null;
        int i = 0;
        while (i < list.size()) {
            if (list.size() != list2.size()) {
                hiHealthData = list.get(i);
                String string = Long.toString(hiHealthData.getDay());
                if (string.length() >= 7) {
                    hiHealthData3 = map2.get(string.substring(0, 7));
                }
                hiHealthData2 = hiHealthData3;
            } else {
                hiHealthData = list.get(i);
                hiHealthData2 = list2.get(i);
            }
            if (hiHealthData2 != null && a(hiHealthData2) != 0.0f) {
                long startTime = hiHealthData.getStartTime();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(startTime);
                calendar.set(5, 1);
                calendar.set(11, 0);
                calendar.set(12, 0);
                float f2 = hiHealthData.getFloat("content") * f;
                float f3 = hiHealthData2.getFloat("sum") * f;
                if (Math.abs(f2) < 1.0E-4d) {
                    qmgVar = new qmg(f2, f3, 0);
                } else {
                    qmgVar = new qmg(f2, f3, Math.round(f3 / f2));
                }
                map.put(Long.valueOf(calendar.getTimeInMillis() + j), qmgVar);
                qmgVar.put(MotionType.SUM, a(hiHealthData2) * f);
                qmgVar.put(MotionType.WALK, e(hiHealthData2) * f);
                qmgVar.put(MotionType.RUN, c(hiHealthData2) * f);
                qmgVar.put(MotionType.BIKE, d(hiHealthData2) * f);
                qmgVar.put(MotionType.CLIMB, b(hiHealthData2) * f);
                float motionType = qmgVar.getMotionType(MotionType.WALK) + qmgVar.getMotionType(MotionType.RUN) + qmgVar.getMotionType(MotionType.BIKE) + qmgVar.getMotionType(MotionType.CLIMB);
                if (f3 < motionType) {
                    qmgVar.put(MotionType.SUM, motionType);
                }
            }
            i++;
            hiHealthData3 = hiHealthData2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(HiHealthData hiHealthData) {
        return hiHealthData.getFloat("sum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float e(HiHealthData hiHealthData) {
        return hiHealthData.getFloat("walk");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float c(HiHealthData hiHealthData) {
        return hiHealthData.getFloat("run");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float d(HiHealthData hiHealthData) {
        return hiHealthData.getFloat("bike");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(HiHealthData hiHealthData) {
        return hiHealthData.getFloat("climb");
    }

    private String[] b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sum");
        if (a(i, MotionType.WALK)) {
            arrayList.add("walk");
        }
        if (a(i, MotionType.RUN)) {
            arrayList.add("run");
        }
        if (a(i, MotionType.BIKE)) {
            arrayList.add("bike");
        }
        if (a(i, MotionType.CLIMB)) {
            arrayList.add("climb");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private int[] e(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(c(i, MotionType.SUM)));
        if (a(i, MotionType.WALK)) {
            arrayList.add(Integer.valueOf(c(i, MotionType.WALK)));
        }
        if (a(i, MotionType.RUN)) {
            arrayList.add(Integer.valueOf(c(i, MotionType.RUN)));
        }
        if (a(i, MotionType.BIKE)) {
            arrayList.add(Integer.valueOf(c(i, MotionType.BIKE)));
        }
        if (a(i, MotionType.CLIMB)) {
            arrayList.add(Integer.valueOf(c(i, MotionType.CLIMB)));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    private boolean a(int i, MotionType motionType) {
        if (i == 40002) {
            return motionType == MotionType.SUM || motionType == MotionType.WALK || motionType == MotionType.RUN || motionType == MotionType.CLIMB;
        }
        if (i == 40004) {
            return motionType == MotionType.SUM || motionType == MotionType.WALK || motionType == MotionType.RUN || motionType == MotionType.BIKE || motionType == MotionType.CLIMB;
        }
        return i == 40003 && (motionType == MotionType.SUM || motionType == MotionType.WALK || motionType == MotionType.RUN || motionType == MotionType.BIKE || motionType == MotionType.CLIMB);
    }

    private int c(int i, MotionType motionType) {
        if (i == 40002) {
            if (motionType == MotionType.SUM) {
                return 40002;
            }
            if (motionType == MotionType.WALK) {
                return 40011;
            }
            if (motionType == MotionType.RUN) {
                return 40012;
            }
            if (motionType == MotionType.CLIMB) {
                return 40013;
            }
            throw new RuntimeException("only support walk,run,climb in steps");
        }
        if (i == 40004) {
            if (motionType == MotionType.SUM) {
                return 40004;
            }
            if (motionType == MotionType.WALK) {
                return 40031;
            }
            if (motionType == MotionType.RUN) {
                return 40032;
            }
            if (motionType == MotionType.BIKE) {
                return 40033;
            }
            if (motionType == MotionType.CLIMB) {
                return 40034;
            }
            throw new RuntimeException("only support walk,run,bike,climb in distance");
        }
        if (i == 40003) {
            if (motionType == MotionType.SUM) {
                return 40003;
            }
            if (motionType == MotionType.WALK) {
                return 40021;
            }
            if (motionType == MotionType.RUN) {
                return 40022;
            }
            if (motionType == MotionType.BIKE) {
                return 40023;
            }
            if (motionType == MotionType.CLIMB) {
                return 40024;
            }
            throw new RuntimeException("only support walk,run,bike,climb in calories");
        }
        if (i == 40005 && motionType == MotionType.SUM) {
            return SmartMsgConstant.MSG_TYPE_RIDE_USER;
        }
        throw new RuntimeException("only support steps,distance,calories");
    }

    private void b(a aVar, SparseArray<List<HiHealthData>> sparseArray, String str) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jB = aVar.b();
        hiAggregateOption.setStartTime(jB);
        long jC = aVar.c();
        hiAggregateOption.setEndTime(jC);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"content"});
        int iA = aVar.a();
        hiAggregateOption.setType(new int[]{iA});
        hiAggregateOption.setAlignType(20001);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setReadType(0);
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(jB);
        hiAggregateOption2.setEndTime(jC);
        hiAggregateOption2.setAggregateType(1);
        hiAggregateOption2.setConstantsKey(new String[]{"sum"});
        hiAggregateOption2.setType(new int[]{c(iA)});
        hiAggregateOption2.setGroupUnitType(3);
        hiAggregateOption2.setReadType(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        arrayList.add(hiAggregateOption2);
        e(aVar, arrayList, sparseArray, str);
    }

    private void e(final a aVar, List<HiAggregateOption> list, final SparseArray<List<HiHealthData>> sparseArray, final String str) {
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataEx(list, new StepModuleAggregateListener(aVar.e(), aVar.d()) { // from class: com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.8
            @Override // com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper.StepModuleAggregateListener
            public void onResultData(SparseArray<List<HiHealthData>> sparseArray2, int i, int i2) {
                ReleaseLogUtil.d("StepModuleChartStorageHelper", "query step day data success: ", Long.valueOf(System.currentTimeMillis() - StepModuleChartStorageHelper.this.h), "ms");
                if (sparseArray2 == null || sparseArray2.size() == 0) {
                    LogUtil.j("StepModuleChartStorageHelper", "triggered but the data is null");
                    if (this.mCallback != null) {
                        this.mCallback.onResult(-1, null);
                        return;
                    }
                    return;
                }
                if (njy.e(sparseArray2.get(1))) {
                    LogUtil.j("StepModuleChartStorageHelper", "step stat list is empty");
                    if (this.mCallback != null) {
                        this.mCallback.onResult(-1, null);
                        return;
                    }
                    return;
                }
                if (aVar.a() == 2 && StepModuleChartStorageHelper.f27077c) {
                    boolean unused = StepModuleChartStorageHelper.f27077c = false;
                    if (uji.d((SparseArray<List<HiHealthData>>) sparseArray, sparseArray2)) {
                        LogUtil.a("StepModuleChartStorageHelper", "query step day data and cache data is same");
                        return;
                    }
                    uji.d(str, sparseArray2);
                }
                StepModuleChartStorageHelper.this.d(sparseArray2, this.mTransferRate, this.mCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<List<HiHealthData>> sparseArray, float f, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiHealthData hiHealthData;
        qmf qmfVar;
        float fB;
        Map<Long, IStorageModel> map = new HashMap<>();
        List<HiHealthData> arrayList = sparseArray.get(0);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        ReleaseLogUtil.d("StepModuleChartStorageHelper", "parseStepDayData stepList size is ", Integer.valueOf(arrayList.size()));
        float fE = 0.0f;
        for (HiHealthData hiHealthData2 : arrayList) {
            if (hiHealthData2 != null && hiHealthData2.getFloat("content") != 0.0f) {
                Calendar calendarA = a(hiHealthData2.getStartTime());
                IStorageModel iStorageModel = map.get(Long.valueOf(calendarA.getTimeInMillis()));
                if (iStorageModel instanceof qmf) {
                    qmf qmfVar2 = (qmf) iStorageModel;
                    qmfVar = qmfVar2;
                    fB = qmfVar2.b();
                } else {
                    qmfVar = new qmf(0.0f);
                    fB = 0.0f;
                }
                fE = e(map, fE, hiHealthData2, calendarA, qmfVar, fB, f);
            }
        }
        List<HiHealthData> list = sparseArray.get(1);
        if (njy.b(list) && (hiHealthData = list.get(0)) != null) {
            qmf qmfVarA = a(map, hiHealthData);
            float f2 = (hiHealthData.getFloat("sum") * f) - fE;
            if (f2 >= 0.0f) {
                qmfVarA.put(MotionType.SUM, qmfVarA.getMotionType(MotionType.SUM) + f2);
                map.put(Long.valueOf(lsl.c(hiHealthData.getStartTime())), qmfVarA);
            }
        }
        if (responseCallback != null) {
            responseCallback.onResult(0, b(map));
        }
    }

    private Map<Long, IStorageModel> b(Map<Long, IStorageModel> map) {
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: ujj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return StepModuleChartStorageHelper.a((Long) obj, (Long) obj2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public static /* synthetic */ int a(Long l, Long l2) {
        return (int) (l.longValue() - l2.longValue());
    }

    private qmf a(Map<Long, IStorageModel> map, HiHealthData hiHealthData) {
        IStorageModel iStorageModel = map.get(Long.valueOf(lsl.r(hiHealthData.getStartTime())));
        if (iStorageModel instanceof qmf) {
            return (qmf) iStorageModel;
        }
        LogUtil.j("StepModuleChartStorageHelper", "!storageModel instanceof BarChartDataStorageModel");
        return new qmf(0.0f);
    }

    private float e(Map<Long, IStorageModel> map, float f, HiHealthData hiHealthData, Calendar calendar, qmf qmfVar, float f2, float f3) {
        qmfVar.b(f2 + (hiHealthData.getFloat("content") * f3));
        float f4 = f + (hiHealthData.getFloat("content") * f3);
        map.put(Long.valueOf(calendar.getTimeInMillis()), qmfVar);
        int type = hiHealthData.getType();
        qmfVar.put(MotionType.SUM, qmfVar.b());
        if (type == 20002) {
            qmfVar.put(MotionType.WALK, qmfVar.getMotionType(MotionType.WALK) + (hiHealthData.getFloat("content") * f3));
            return f4;
        }
        if (type == 20003) {
            qmfVar.put(MotionType.RUN, qmfVar.getMotionType(MotionType.RUN) + (hiHealthData.getFloat("content") * f3));
            return f4;
        }
        if (type == 20005) {
            qmfVar.put(MotionType.BIKE, qmfVar.getMotionType(MotionType.BIKE) + (hiHealthData.getFloat("content") * f3));
            return f4;
        }
        if (type == 20004) {
            qmfVar.put(MotionType.CLIMB, qmfVar.getMotionType(MotionType.CLIMB) + (hiHealthData.getFloat("content") * f3));
        }
        return f4;
    }

    private Calendar a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(12) / 30 == 0) {
            calendar.set(12, 14);
            calendar.set(13, 30);
            return calendar;
        }
        calendar.set(12, 44);
        calendar.set(13, 30);
        return calendar;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f27086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f27088c;
        private int d;
        private ResponseCallback<Map<Long, IStorageModel>> e;

        a() {
        }

        public long b() {
            return this.f27088c;
        }

        public void b(long j) {
            this.f27088c = j;
        }

        public long c() {
            return this.f27086a;
        }

        public void a(long j) {
            this.f27086a = j;
        }

        public int a() {
            return this.d;
        }

        public void e(int i) {
            this.d = i;
        }

        public float d() {
            return this.f27087b;
        }

        public void d(float f) {
            this.f27087b = f;
        }

        public ResponseCallback<Map<Long, IStorageModel>> e() {
            return this.e;
        }

        public void c(ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.e = responseCallback;
        }
    }

    public static abstract class StepModuleAggregateListener implements HiAggregateListenerEx {
        protected ResponseCallback<Map<Long, IStorageModel>> mCallback;
        protected float mTransferRate;

        public abstract void onResultData(SparseArray<List<HiHealthData>> sparseArray, int i, int i2);

        public StepModuleAggregateListener(ResponseCallback<Map<Long, IStorageModel>> responseCallback, float f) {
            this.mCallback = responseCallback;
            this.mTransferRate = f;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            onResultData(sparseArray, i, i2);
            LogUtil.j("StepModuleChartStorageHelper", "StepModuleAggregateListener onResult ANCHOR", Integer.valueOf(i2));
            if (i2 == 2 || i == 1) {
                this.mCallback = null;
            }
        }
    }

    public static abstract class StepModuleReadListener implements HiDataReadResultListener {
        protected ResponseCallback<Map<Long, IStorageModel>> mCallback;
        protected int mDataType;

        public abstract void onResultData(Object obj, int i, int i2);

        public abstract void onResultIntentData(int i, Object obj, int i2, int i3);

        protected StepModuleReadListener(ResponseCallback<Map<Long, IStorageModel>> responseCallback, int i) {
            this.mCallback = responseCallback;
            this.mDataType = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.j("StepModuleChartStorageHelper", "StepModuleReadListener onResult", "anchor", Integer.valueOf(i2));
            onResultData(obj, i, i2);
            if (i2 == 2 || i == 1) {
                this.mCallback = null;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.j("StepModuleChartStorageHelper", "StepModuleReadListener onResultIntent", "anchor", Integer.valueOf(i3));
            onResultIntentData(i, obj, i2, i3);
            if (i3 == 2 || i2 == 1) {
                this.mCallback = null;
            }
        }
    }

    public static void b(boolean z) {
        f27077c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, IStorageModel> d(List<HiHealthData> list, long j) {
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                map.put(Long.valueOf(a(hiHealthData.getStartTime()).getTimeInMillis()), new qmf(4.0f, 0.0f, this.f27079b, this.f27078a));
            }
        }
        if (lsl.aa(j)) {
            e(map);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, IStorageModel> a() {
        HashMap map = new HashMap(16);
        List<Long> listD = d();
        long timeInMillis = a(lsl.s(System.currentTimeMillis())).getTimeInMillis();
        for (Long l : listD) {
            if (l.longValue() == timeInMillis) {
                map.put(l, new qmf(3.999f, 0.0f, this.d, this.e));
                return map;
            }
            map.put(l, new qmf(3.999f, 0.0f, this.i, this.j));
        }
        return map;
    }

    private void e(Map<Long, IStorageModel> map) {
        List<Long> listD = d();
        long timeInMillis = a(lsl.s(System.currentTimeMillis())).getTimeInMillis();
        if (!map.containsKey(Long.valueOf(timeInMillis))) {
            map.put(Long.valueOf(timeInMillis), new qmf(3.999f, 0.0f, this.d, this.e));
        }
        for (Long l : listD) {
            l.longValue();
            if (!map.containsKey(l)) {
                map.put(l, new qmf(3.999f, 0.0f, this.i, this.j));
            }
        }
    }

    private List<Long> d() {
        ArrayList arrayList = new ArrayList();
        int iD = CardConstants.d(System.currentTimeMillis());
        for (int i = 0; i <= iD; i++) {
            arrayList.add(Long.valueOf(a(i)));
        }
        return arrayList;
    }

    private long a(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return a(calendar.getTimeInMillis()).getTimeInMillis();
    }

    private List<HiAggregateOption> d(int i, long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setConstantsKey(new String[]{"content"});
        hiAggregateOption.setType(new int[]{i});
        hiAggregateOption.setGroupUnitType(5);
        hiAggregateOption.setReadType(0);
        LogUtil.a("StepModuleChartStorageHelper", "getFitnessDataDetail aggregateOption=", hiAggregateOption.toString());
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(j);
        hiAggregateOption2.setEndTime(j2);
        hiAggregateOption2.setAggregateType(1);
        hiAggregateOption2.setConstantsKey(new String[]{"sum"});
        hiAggregateOption2.setType(new int[]{i});
        hiAggregateOption2.setGroupUnitType(5);
        hiAggregateOption2.setReadType(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        arrayList.add(hiAggregateOption2);
        return arrayList;
    }
}
