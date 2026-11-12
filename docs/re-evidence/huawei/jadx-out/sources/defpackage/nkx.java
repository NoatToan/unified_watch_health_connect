package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nkx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f43229c = new Object();
    private static volatile nkx d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43230b = BaseApplication.getContext();

    private nkx() {
    }

    public static nkx e() {
        if (d == null) {
            synchronized (f43229c) {
                if (d == null) {
                    d = new nkx();
                }
            }
        }
        return d;
    }

    public void b(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr = {OnRegisterSkinAttrsListener.REGISTER_BY_SCAN};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setConstantsKey(new String[]{"trackData"});
        hiDataReadOption.setCount(1);
        HiHealthManager.d(this.f43230b).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkx.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                nkx.this.d(obj, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard callback is null.");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard onResult data not instanceof SparseArray");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard onResult map is empty.");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard onResult obj not instanceof List");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard return map list is empty.");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            LogUtil.j("Track_HWHealthDataManager", "getTrackDetailForSportCard return hiHealthData is null.");
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, nlt.d(hiHealthData));
        }
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{30002});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setConstantsKey(new String[]{"trackData"});
        hiDataReadOption.setCount(1);
        HiHealthManager.d(this.f43230b).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkx.6
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                nkx.this.a(obj, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData callback is null");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData onResult data not instanceof SparseArray");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData onResult data is empty");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        Object obj2 = sparseArray.get(30002);
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData onResult data not instanceof List");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData onResult list is empty");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData != null) {
            SharedPreferenceManager.c("privacy_center", "sport_record", String.valueOf(hiHealthData.getStartTime()));
            iBaseResponseCallback.a(0, nlt.d(hiHealthData));
        } else {
            iBaseResponseCallback.a(100001, null);
            LogUtil.j("Track_HWHealthDataManager", "acquireLastTrackSimplifyData onResult hiHealthData is null");
        }
    }

    private static <T> T[] b(T[] tArr, T[]... tArr2) {
        int length = tArr.length;
        for (T[] tArr3 : tArr2) {
            length += tArr3.length;
        }
        T[] tArr4 = (T[]) Arrays.copyOf(tArr, length);
        int length2 = tArr.length;
        for (T[] tArr5 : tArr2) {
            System.arraycopy(tArr5, 0, tArr4, length2, tArr5.length);
            length2 += tArr5.length;
        }
        return tArr4;
    }

    public void c(long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(4);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{287, ComponentInfo.PluginPay_A_N});
        int[] iArr = {22};
        LogUtil.a("Track_HWHealthDataManager", "types", iArr);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_28722"});
        hiSportStatDataAggregateOption.setType(iArr);
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        hiSportStatDataAggregateOption.setReadType(0);
        HiHealthNativeApi.a(this.f43230b).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: nkx.8
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Track_HWHealthDataManager", "requestDivingMaxDepth callback is null");
                    return;
                }
                HashMap map = new HashMap();
                if (!njy.e(list)) {
                    iBaseResponseCallback.a(i2, nkx.this.d(list, "Track_28722", map, z));
                } else {
                    LogUtil.j("Track_HWHealthDataManager", "requestDivingMaxDepth() all run data null or empty ");
                    iBaseResponseCallback.a(i2, map);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Object, Double> d(List<HiHealthData> list, String str, Map<Object, Double> map, boolean z) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                if (!z) {
                    map.put(Long.valueOf(hiHealthData.getLong("start_time")), Double.valueOf(hiHealthData.getDouble(str)));
                } else {
                    map.put(hiHealthData.getInt("hihealth_type") + "#" + hiHealthData.getLong("start_time"), Double.valueOf(hiHealthData.getDouble(str)));
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(258);
        arrayList.add(257);
        arrayList.add(259);
        arrayList.add(264);
        arrayList.add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE));
        arrayList.add(282);
        arrayList.add(281);
        arrayList.add(227);
        if (njy.b(list)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                next.intValue();
                if (arrayList.contains(next)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<Integer> list) {
        list.add(0, 0);
        list.add(1, 258);
        list.add(2, 257);
        list.add(3, 259);
        list.add(4, 10001);
    }

    public static void a(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("Track_HWHealthDataManager", "requestSortSportTypeList  callback is null");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setReadType(0);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSportTypeList(hiDataReadOption, new HiCommonListener() { // from class: nkx.7
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (!njy.b(obj, Integer.class)) {
                    LogUtil.e("Track_HWHealthDataManager", "data is null or not fit integer");
                    return;
                }
                ArrayList arrayList = (ArrayList) obj;
                nkx.h(arrayList);
                nkx.c(arrayList);
                nkx.a(arrayList);
                iBaseResponseCallback.a(0, arrayList);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                iBaseResponseCallback.a(0, new ArrayList());
            }
        });
    }

    public static void b(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("Track_HWHealthDataManager", "requestSubSortSportTypeList callback is null");
            return;
        }
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            recordApi.acquireFitnessRecordCategoryList(iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<Integer> list) {
        if (njy.e(list)) {
            LogUtil.e("Track_HWHealthDataManager", "sportTypeList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(262);
        arrayList.add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM));
        e(list, arrayList, 262);
        arrayList.clear();
        arrayList.add(217);
        arrayList.add(218);
        arrayList.add(219);
        arrayList.add(229);
        arrayList.add(230);
        arrayList.add(231);
        arrayList.add(232);
        arrayList.add(233);
        e(list, arrayList, 217);
        arrayList.clear();
        arrayList.add(287);
        arrayList.add(Integer.valueOf(ComponentInfo.PluginPay_A_N));
        arrayList.add(288);
        arrayList.add(289);
        e(list, arrayList, 287);
        arrayList.clear();
        arrayList.add(286);
        arrayList.add(Integer.valueOf(HeartRateThresholdConfig.HEART_RATE_LIMIT));
        e(list, arrayList, 286);
    }

    private static void e(List<Integer> list, List<Integer> list2, int i) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list2) {
            num.intValue();
            int iIndexOf = list.indexOf(num);
            arrayList.add(Integer.valueOf(iIndexOf));
            c(list, iIndexOf);
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                iIntValue = -1;
                break;
            }
            iIntValue = ((Integer) it.next()).intValue();
        } while (iIntValue < 0);
        if (iIntValue < 0) {
            return;
        }
        list.add(iIntValue, Integer.valueOf(i));
    }

    private static void c(List<Integer> list, int i) {
        if (njy.e(list, i)) {
            return;
        }
        list.remove(i);
    }

    public void c(long j, long j2, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        d(new ntx.d().b(j).d(j2).c(i).a(), z, iBaseResponseCallback);
    }

    public void d(ntx ntxVar, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArrA;
        if (ntxVar == null) {
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(ntxVar.a(), ntxVar.e());
        if (ntxVar.f() == 0) {
            iArrA = null;
        } else if (ntxVar.d() != null) {
            iArrA = ntxVar.d();
        } else {
            iArrA = a(ntxVar.f());
        }
        hiDataReadOption.setType(iArrA);
        hiDataReadOption.setCount(ntxVar.c());
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(this.f43230b).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: nkx.10
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                nkx.this.b(obj, i, z, iBaseResponseCallback);
            }
        });
    }

    public void d(long j, long j2, int[] iArr, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        d(new ntx.d().b(j).d(j2).a(iArr).a(), z, iBaseResponseCallback);
    }

    private int[] a(int i) {
        if (i == 217) {
            return new int[]{i, 218, 219, 229, 230, 231, 232, 233};
        }
        if (i == 262) {
            return new int[]{i, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM};
        }
        if (i == 257) {
            return new int[]{i, 281, 282};
        }
        if (i == 258) {
            return new int[]{i, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 227};
        }
        if (i == 286) {
            return new int[]{i, HeartRateThresholdConfig.HEART_RATE_LIMIT};
        }
        if (i == 287) {
            return new int[]{i, 288, 289, ComponentInfo.PluginPay_A_N};
        }
        return new int[]{i};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_HWHealthDataManager", "requestTrackSimplifyData callback is null.");
            return;
        }
        if (obj instanceof SparseArray) {
            SparseArray sparseArray = (SparseArray) obj;
            if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                iBaseResponseCallback.a(i, null);
                LogUtil.j("Track_HWHealthDataManager", "requestTrackSimplifyData onResult obj not instanceof List");
                return;
            }
            List<HiHealthData> list = (List) sparseArray.get(i);
            if (list.isEmpty()) {
                LogUtil.j("Track_HWHealthDataManager", "requestTrackSimplifyData onResult list is empty");
                iBaseResponseCallback.a(i, null);
            } else {
                if (z) {
                    iBaseResponseCallback.a(i, g(list));
                } else {
                    iBaseResponseCallback.a(i, list);
                }
                LogUtil.j("Track_HWHealthDataManager", "requestTrackSimplifyData list.size = ", Integer.valueOf(list.size()));
            }
        }
    }

    private String g(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("Track_HWHealthDataManager", "getMaxmetByTrackData trackData is null or empty.");
            return null;
        }
        int i = 0;
        long endTime = 0;
        int iIntValue = 0;
        for (HiHealthData hiHealthData : list) {
            try {
                Map<String, Integer> wearSportData = ((HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class)).getWearSportData();
                if (wearSportData != null && wearSportData.containsKey("max_met")) {
                    if (wearSportData.get("max_met") != null) {
                        iIntValue = wearSportData.get("max_met").intValue();
                    }
                    if (iIntValue > i) {
                        endTime = hiHealthData.getEndTime();
                        i = iIntValue;
                    }
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("Track_HWHealthDataManager", "analyzeTrackSimplifyData trackMetaData is error");
            }
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(endTime));
        stringBuffer.append(Constants.LINK);
        stringBuffer.append(String.valueOf(i));
        return stringBuffer.toString();
    }

    public void b(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr;
        String[] strArr;
        int[] iArr2;
        String[] strArr2;
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_HWHealthDataManager", "requestTotalSportTimes callback is null.");
            return;
        }
        switch (i) {
            case 257:
                iArr = new int[]{42055, 42056};
                strArr = new String[]{"Track_Walk_Count_Sum", "Track_Walk_Abnormal_Count_Sum"};
                iArr2 = iArr;
                strArr2 = strArr;
                break;
            case 258:
                iArr = new int[]{42105, 42106};
                strArr = new String[]{"Track_Run_Count_Sum", "Track_Run_Abnormal_Count_Sum"};
                iArr2 = iArr;
                strArr2 = strArr;
                break;
            case 259:
                iArr = new int[]{42155, 42156};
                strArr = new String[]{"Track_Ride_Count_Sum", "Track_Ride_Abnormal_Count_Sum"};
                iArr2 = iArr;
                strArr2 = strArr;
                break;
            default:
                iArr2 = null;
                strArr2 = null;
                break;
        }
        d(iBaseResponseCallback, b(j, j2, 1, iArr2, strArr2), i, j, j2);
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback, HiAggregateOption hiAggregateOption, int i, long j, long j2) {
        if (i == 283) {
            HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
            hiSportStatDataAggregateOption.setSortOrder(1);
            hiSportStatDataAggregateOption.setStartTime(j);
            hiSportStatDataAggregateOption.setEndTime(j2);
            hiSportStatDataAggregateOption.setAggregateType(1);
            hiSportStatDataAggregateOption.setGroupUnitType(7);
            hiSportStatDataAggregateOption.setReadType(0);
            hiSportStatDataAggregateOption.setConstantsKey(new String[]{"TIME"});
            hiSportStatDataAggregateOption.setType(new int[]{5});
            hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{i});
            HiHealthNativeApi.a(this.f43230b).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: nkx.1
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i2, int i3) {
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 == null) {
                        LogUtil.j("Track_HWHealthDataManager", "requestTrackStatData callback is null");
                    } else {
                        iBaseResponseCallback2.a(i2, list);
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                    if (iBaseResponseCallback == null) {
                        LogUtil.j("Track_HWHealthDataManager", "requestTrackStatData callback is null");
                    } else {
                        LogUtil.a("Track_HWHealthDataManager", "onResultIntent");
                    }
                }
            });
            return;
        }
        HiHealthManager.d(this.f43230b).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkx.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("Track_HWHealthDataManager", "requestTrackStatData callback is null");
                } else {
                    iBaseResponseCallback2.a(i2, list);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005c  */
    public void b(long j, long j2, int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr;
        String[] strArr;
        LogUtil.a("Track_HWHealthDataManager", "requestTrackStatDistance sportType = ", Integer.valueOf(i2), " timeUnit = ", Integer.valueOf(i));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        if (i2 != 282) {
            switch (i2) {
                case 257:
                    iArr = new int[]{42052};
                    strArr = new String[]{"Track_Walk_Distance_Sum"};
                    break;
                case 258:
                case 260:
                    iArr = new int[]{42102};
                    strArr = new String[]{"Track_Run_Distance_Sum"};
                    break;
                case 259:
                    iArr = new int[]{42152};
                    strArr = new String[]{"Track_Ride_Distance_Sum"};
                    break;
                default:
                    LogUtil.j("Track_HWHealthDataManager", "requestTrackStatDistance not supported");
                    return;
            }
        } else {
            iArr = new int[]{42052};
            strArr = new String[]{"Track_Walk_Distance_Sum"};
        }
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setType(iArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        HiHealthManager.d(this.f43230b).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: nkx.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i3, int i4) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("Track_HWHealthDataManager", "requestTrackStatDistance callback is null");
                } else {
                    iBaseResponseCallback2.a(i3, sparseArray);
                }
            }
        });
    }

    public void c(long j, long j2, int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWHealthDataManager", "requestTrackStatData sportType = ", Integer.valueOf(i2), " timeUnit = ", Integer.valueOf(i));
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(7);
        hiSportStatDataAggregateOption.setReadType(0);
        jry jryVarA = jry.a(this.f43230b);
        if (jryVarA.b(i2) == null || jryVarA.b(i2).getSportDataStatics() == null) {
            LogUtil.e("Track_HWHealthDataManager", "can not find sport type in json");
            return;
        }
        LogUtil.a("Track_HWHealthDataManager", "mSportType:", Integer.valueOf(i2));
        int[] iArrE = e(jryVarA, i2);
        hiSportStatDataAggregateOption.setConstantsKey(b(jryVarA, i2));
        hiSportStatDataAggregateOption.setType(iArrE);
        if (i2 == 287) {
            hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{i2, ComponentInfo.PluginPay_A_N});
        } else {
            hiSportStatDataAggregateOption.setHiHealthTypes(iwn.c(i2));
        }
        HiHealthNativeApi.a(this.f43230b).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: nkx.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("Track_HWHealthDataManager", "requestTrackStatData callback is null");
                } else {
                    iBaseResponseCallback2.a(i3, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Track_HWHealthDataManager", "requestTrackStatData callback is null");
                } else {
                    LogUtil.a("Track_HWHealthDataManager", "onResultIntent");
                }
            }
        });
    }

    private int[] e(jry jryVar, int i) {
        int[] iArrC = jryVar.c(jryVar.b(i).getSportDataStatics());
        if (i == 286) {
            int[] iArr = new int[iArrC.length + 6];
            System.arraycopy(new int[]{42405, 42406, 42404, 42403, 42413, 23}, 0, iArr, 0, 6);
            System.arraycopy(iArrC, 0, iArr, 6, iArrC.length);
            return iArr;
        }
        if (i != 217) {
            return iArrC;
        }
        int[] iArr2 = {42352, 42362, 42355, 42356, 42354, 42353};
        int[] iArr3 = nub.f43727a;
        int length = iArr3.length;
        int i2 = 0;
        while (i2 < length) {
            int[] iArrC2 = jryVar.c(jryVar.b(iArr3[i2]).getSportDataStatics());
            int[] iArr4 = new int[iArr2.length + iArrC2.length];
            System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
            System.arraycopy(iArrC2, 0, iArr4, iArr2.length, iArrC2.length);
            i2++;
            iArr2 = iArr4;
        }
        return iArr2;
    }

    private String[] b(jry jryVar, int i) {
        String[] strArrD = jryVar.d(jryVar.b(i).getSportDataStatics());
        if (i == 286) {
            return (String[]) b(jryVar.d(jryVar.b(HeartRateThresholdConfig.HEART_RATE_LIMIT).getSportDataStatics()), strArrD);
        }
        if (i == 217) {
            for (int i2 : nub.f43727a) {
                strArrD = (String[]) b(strArrD, jryVar.d(jryVar.b(i2).getSportDataStatics()));
            }
        }
        return strArrD;
    }

    public void d(long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWHealthDataManager", "requestSportStatSum", " timeUnit = ", Integer.valueOf(i));
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setType(new int[]{com.huawei.operation.utils.Constants.REBACK_MARKET_ENTRANCE, 42005, com.huawei.operation.utils.Constants.REBACK_MARKET_RESULT_CODE, 42008, 5, 4});
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_Duration_Sum", "Track_Count_Sum", "Track_Calorie_Sum", "Track_Abnormal_Count_Sum", "Track_Diving_Count", "Track_Diving_Time_Sum"});
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{30001, 288, 289});
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        hiSportStatDataAggregateOption.setSortOrder(1);
        HiHealthNativeApi.a(this.f43230b).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: nkx.9
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.e("Track_HWHealthDataManager", "requestSportStatSum callback is null");
                } else {
                    iBaseResponseCallback2.a(i2, list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                if (iBaseResponseCallback == null) {
                    LogUtil.e("Track_HWHealthDataManager", "requestSportStatSum callback is null");
                } else {
                    LogUtil.a("Track_HWHealthDataManager", "requestSportStatSum onResultIntent");
                }
            }
        });
    }

    private HiAggregateOption b(long j, long j2, int i, int[] iArr, String[] strArr) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(i);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setType(iArr);
        return hiAggregateOption;
    }
}
