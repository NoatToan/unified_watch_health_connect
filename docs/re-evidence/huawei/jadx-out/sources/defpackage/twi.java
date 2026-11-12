package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes43.dex */
public class twi implements IChartStorageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BloodOxygenDayDetailFragmentPresenter f49731a;
    private DataInfos d;

    public twi(BloodOxygenDayDetailFragmentPresenter bloodOxygenDayDetailFragmentPresenter) {
        this.f49731a = bloodOxygenDayDetailFragmentPresenter;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos.isDayData() && !qnh.s(j)) {
            responseCallback.onResult(-1, null);
            return;
        }
        long jC = lsl.c(j);
        this.d = dataInfos;
        int i = AnonymousClass3.d[dataInfos.ordinal()];
        if (i == 1 || i == 2) {
            if (dataInfos == DataInfos.BloodOxygenDayHorizontal && qrs.c(100)) {
                LogUtil.j("BloodOxygenLineChartStorageHelper", "queryStepDayData read many times");
                return;
            } else {
                e(context, j, jC, responseCallback);
                return;
            }
        }
        LogUtil.j("R_BloodOxygen_BloodOxygenLineChartStorageHelper", "no case match !");
    }

    /* JADX INFO: renamed from: twi$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[DataInfos.values().length];
            d = iArr;
            try {
                iArr[DataInfos.BloodOxygenDayHorizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[DataInfos.BloodOxygenDayDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private HiDataReadOption e(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        LogUtil.a("BloodOxygenLineChartStorageHelper", "getReadOption startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{2103, 2107, DicDataTypeUtil.DataType.ALTITUDE_TYPE.value(), DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        return hiDataReadOption;
    }

    private void e(Context context, long j, long j2, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodOxygenLineChartStorageHelper", "requestDayOxygenData callback is null");
        } else {
            HiHealthNativeApi.a(context).readHiHealthData(e(j, j2), new a(responseCallback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        int i;
        List<HiHealthData> list;
        if (!(obj instanceof SparseArray)) {
            LogUtil.e("BloodOxygenLineChartStorageHelper", "data can not convert");
            responseCallback.onResult(-1, null);
            this.f49731a.notifyLatestBloodOxygen(-1, null);
            this.f49731a.notifyMaxAndMinBloodOxy(-1, null);
            this.f49731a.notifyRemindBloodOxygen(-1, null);
            this.f49731a.notifyAltitude(-1, null);
            this.f49731a.notifyLakelouise(-1, null);
            ObserverManagerUtil.e("BLOOD_AND_ALTITUDE_DATA", 0);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (this.d != DataInfos.BloodOxygenDayHorizontal) {
            ObserverManagerUtil.e("BLOOD_OXYGEN_RECORDS", sparseArray);
        }
        if (sparseArray.size() <= 0) {
            responseCallback.onResult(-1, null);
            this.f49731a.notifyLatestBloodOxygen(-1, null);
            this.f49731a.notifyMaxAndMinBloodOxy(-1, null);
            this.f49731a.notifyRemindBloodOxygen(-1, null);
            this.f49731a.notifyAltitude(-1, null);
            this.f49731a.notifyLakelouise(-1, null);
            ObserverManagerUtil.e("BLOOD_AND_ALTITUDE_DATA", 0);
            return;
        }
        List<HiHealthData> arrayList = new ArrayList<>(16);
        Object obj2 = sparseArray.get(2103);
        if (obj2 instanceof List) {
            List<HiHealthData> list2 = (List) obj2;
            LogUtil.a("BloodOxygenLineChartStorageHelper", "oxygenMeasureValueList.size :", Integer.valueOf(list2.size()));
            arrayList = list2;
        }
        List<HiHealthData> arrayList2 = new ArrayList<>(16);
        Object obj3 = sparseArray.get(2107);
        if (obj3 instanceof List) {
            List<HiHealthData> list3 = (List) obj3;
            LogUtil.a("BloodOxygenLineChartStorageHelper", "oxygenRemindValueList.size :", Integer.valueOf(list3.size()));
            arrayList2 = list3;
        }
        List<HiHealthData> arrayList3 = new ArrayList<>(16);
        Object obj4 = sparseArray.get(DicDataTypeUtil.DataType.ALTITUDE_TYPE.value());
        if (obj4 instanceof List) {
            List<HiHealthData> list4 = (List) obj4;
            LogUtil.a("BloodOxygenLineChartStorageHelper", "altitudeValueList.size :", Integer.valueOf(list4.size()));
            arrayList3 = list4;
        }
        if (njy.b(arrayList)) {
            i = njy.b(arrayList3) ? 1 : 2;
        } else {
            arrayList3.clear();
            i = 0;
        }
        ObserverManagerUtil.e("BLOOD_AND_ALTITUDE_DATA", Integer.valueOf(i));
        ArrayList arrayList4 = new ArrayList(16);
        Object obj5 = sparseArray.get(DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value());
        if (obj5 instanceof List) {
            List<HiHealthData> list5 = (List) obj5;
            LogUtil.a("BloodOxygenLineChartStorageHelper", "lakeLouiseValueList.size :", Integer.valueOf(list5.size()));
            list = list5;
        } else {
            list = arrayList4;
        }
        this.f49731a.notifyRemindBloodOxygen(0, arrayList2);
        this.f49731a.notifyLatestBloodOxygen(0, arrayList);
        this.f49731a.notifyMaxAndMinBloodOxy(0, arrayList);
        this.f49731a.notifyAltitude(0, arrayList3);
        this.f49731a.notifyLakelouise(0, list);
        HashMap map = new HashMap(16);
        if (!SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS").equals("true")) {
            arrayList3.clear();
            list.clear();
        }
        b(arrayList, arrayList2, arrayList3, list, map);
        if (map.size() > 0) {
            responseCallback.onResult(0, map);
        } else {
            responseCallback.onResult(-1, null);
        }
    }

    private void c(List<HiHealthData> list, List<HiHealthData> list2, Map<Long, IStorageModel> map) {
        fqt fqtVar;
        for (HiHealthData hiHealthData : list) {
            long startTime = hiHealthData.getStartTime();
            if (hiHealthData.getIntValue() <= 100 && hiHealthData.getIntValue() > 0) {
                map.put(Long.valueOf(startTime), new fqt(hiHealthData.getIntValue()));
            } else {
                LogUtil.j("BloodOxygenLineChartStorageHelper", "max > 100 or min <0");
            }
        }
        if (njy.b(list2)) {
            for (int i = 0; i < list2.size(); i++) {
                HiHealthData hiHealthData2 = list2.get(i);
                long startTime2 = hiHealthData2.getStartTime();
                if (map.get(Long.valueOf(startTime2)) instanceof fqt) {
                    fqtVar = (fqt) map.get(Long.valueOf(startTime2));
                    fqtVar.a(hiHealthData2.getIntValue());
                } else {
                    fqtVar = new fqt(0.0f);
                    fqtVar.a(hiHealthData2.getIntValue());
                }
                map.put(Long.valueOf(startTime2), fqtVar);
            }
        }
    }

    private void b(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, List<HiHealthData> list4, Map<Long, IStorageModel> map) {
        if (this.d == DataInfos.BloodOxygenDayHorizontal) {
            LogUtil.a("BloodOxygenLineChartStorageHelper", "setResultMap isHorizontal");
            c(list, list3, map);
            return;
        }
        HashSet hashSet = new HashSet(16);
        StringBuilder sb = new StringBuilder();
        for (HiHealthData hiHealthData : list2) {
            hashSet.add(Long.valueOf(hiHealthData.getStartTime()));
            sb.append(hiHealthData.getStartTime());
            sb.append(" ");
            sb.append(hiHealthData.getType());
            sb.append(" ");
            sb.append(hiHealthData.getIntValue());
            sb.append(",");
        }
        LogUtil.a("BloodOxygenLineChartStorageHelper", "setResultMap remind data = ", sb.toString());
        e(list, list3, list4, hashSet, map);
    }

    private void e(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, Set<Long> set, Map<Long, IStorageModel> map) {
        fqt fqtVar;
        fqt fqtVar2;
        StringBuilder sb = new StringBuilder();
        Iterator<HiHealthData> it = list.iterator();
        while (true) {
            float fE = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            HiHealthData next = it.next();
            if (next != null && next.getIntValue() > 0) {
                long startTime = next.getStartTime();
                sb.append(startTime);
                sb.append(" ");
                sb.append(next.getType());
                sb.append(" ");
                sb.append(next.getIntValue());
                sb.append(",");
                Calendar calendarD = d(startTime);
                IStorageModel iStorageModel = map.get(Long.valueOf(calendarD.getTimeInMillis()));
                if (iStorageModel instanceof fqt) {
                    fqtVar2 = (fqt) iStorageModel;
                    fE = fqtVar2.e();
                } else {
                    fqtVar2 = new fqt(0.0f);
                }
                fqt fqtVar3 = fqtVar2;
                float f = fE;
                if (set.contains(Long.valueOf(startTime))) {
                    fqtVar3.b(true);
                }
                c(map, next, calendarD, fqtVar3, f);
            }
        }
        if (njy.b(list2)) {
            HiHealthData[] hiHealthDataArr = new HiHealthData[2];
            int i = -1;
            int i2 = 0;
            while (i2 < list2.size()) {
                HiHealthData hiHealthData = list2.get(i2);
                long startTime2 = hiHealthData.getStartTime();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(startTime2);
                int i3 = calendar.get(11) * 2;
                int i4 = calendar.get(12) < 30 ? i3 + 1 : i3 + 2;
                if (i2 % 5 == 0) {
                    b(map, hiHealthData);
                } else {
                    int intValue = hiHealthData.getIntValue();
                    if (i == i4 || i == -1) {
                        HiHealthData hiHealthData2 = hiHealthDataArr[0];
                        if (hiHealthData2 == null || intValue < hiHealthData2.getIntValue()) {
                            hiHealthDataArr[0] = hiHealthData;
                        }
                        HiHealthData hiHealthData3 = hiHealthDataArr[1];
                        if (hiHealthData3 == null || intValue > hiHealthData3.getIntValue()) {
                            hiHealthDataArr[1] = hiHealthData;
                        }
                        if (i2 == list2.size() - 1) {
                            b(map, hiHealthDataArr[0]);
                            b(map, hiHealthDataArr[1]);
                        }
                    } else {
                        b(map, hiHealthDataArr[0]);
                        b(map, hiHealthDataArr[1]);
                        hiHealthDataArr = new HiHealthData[2];
                    }
                }
                i2++;
                i = i4;
            }
        }
        if (njy.b(list3)) {
            for (HiHealthData hiHealthData4 : list3) {
                long startTime3 = hiHealthData4.getStartTime();
                if (map.get(Long.valueOf(startTime3)) instanceof fqt) {
                    fqtVar = (fqt) map.get(Long.valueOf(startTime3));
                    fqtVar.d(hiHealthData4.getIntValue());
                } else {
                    fqtVar = new fqt(0.0f);
                    fqtVar.d(hiHealthData4.getIntValue());
                }
                map.put(Long.valueOf(startTime3), fqtVar);
            }
        }
        TreeMap treeMap = new TreeMap(new Comparator<Long>() { // from class: twi.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(Long l, Long l2) {
                return (int) (l2.longValue() - l.longValue());
            }
        });
        treeMap.putAll(map);
        new HashMap(16);
        HashMap map2 = new HashMap(16);
        for (Map.Entry entry : treeMap.entrySet()) {
            fqt fqtVar4 = (fqt) entry.getValue();
            fqtVar4.d(Math.round(fqtVar4.e()));
            map2.put((Long) entry.getKey(), fqtVar4);
        }
        treeMap.clear();
        treeMap.putAll(map2);
        LogUtil.a("BloodOxygenLineChartStorageHelper", "setHalfHourData all data = ", sb.toString());
    }

    private void b(Map<Long, IStorageModel> map, HiHealthData hiHealthData) {
        fqt fqtVar;
        if (hiHealthData == null) {
            return;
        }
        long startTime = hiHealthData.getStartTime();
        if (map.get(Long.valueOf(startTime)) instanceof fqt) {
            fqtVar = (fqt) map.get(Long.valueOf(startTime));
        } else {
            fqtVar = new fqt(0.0f);
        }
        fqtVar.a(hiHealthData.getIntValue());
        map.put(Long.valueOf(startTime), fqtVar);
    }

    private void c(Map<Long, IStorageModel> map, HiHealthData hiHealthData, Calendar calendar, fqt fqtVar, float f) {
        if (f == 0.0f) {
            fqtVar.d(hiHealthData.getIntValue());
            fqtVar.b(1);
        } else {
            int iD = fqtVar.d();
            float f2 = iD;
            int i = iD + 1;
            float intValue = ((f * f2) + hiHealthData.getIntValue()) / i;
            fqtVar.b(i);
            fqtVar.d(intValue);
        }
        map.put(Long.valueOf(calendar.getTimeInMillis()), fqtVar);
    }

    private Calendar d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(lsl.a(lsl.q(j)));
        if (calendar.get(12) / 30 == 0) {
            calendar.set(12, 14);
            calendar.set(13, 30);
        } else {
            calendar.set(12, 44);
            calendar.set(13, 30);
        }
        calendar.set(14, 0);
        return calendar;
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ResponseCallback<Map<Long, IStorageModel>> f49733a;
        private WeakReference<twi> d;

        private a(twi twiVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.d = new WeakReference<>(twiVar);
            this.f49733a = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            twi twiVar = this.d.get();
            if (twiVar == null) {
                LogUtil.j("BloodOxygenLineChartStorageHelper", "DataReadListener storageHelper is null");
                return;
            }
            ResponseCallback<Map<Long, IStorageModel>> responseCallback = this.f49733a;
            if (responseCallback != null) {
                twiVar.e(obj, responseCallback);
                this.f49733a = null;
            } else {
                LogUtil.j("BloodOxygenLineChartStorageHelper", "DataReadListener mCallback is null");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.d("BloodOxygenLineChartStorageHelper", "DataReadListener onResultIntent");
        }
    }
}
