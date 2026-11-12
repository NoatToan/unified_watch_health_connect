package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.json.JsonSanitizer;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthDeviceApi;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class emr {
    private CommonUiResponse<List<List<HiHealthData>>> e;

    private emr() {
    }

    public static emr d() {
        return c.f33205a;
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final emr f33205a = new emr();
    }

    public void d(long j, long j2, int i, String str, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setDeviceUuid(str);
        hiDataReadOption.setReadType(2);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{10001});
        if (i != 0) {
            hiDataReadOption.setCount(i);
        }
        LogUtil.a("HealthDataInteractor", "getBloodSugarData readOption: ", hiDataReadOption.toString(), "; code: ", CommonUtil.n(str));
        nkb.d().b(BaseApplication.getContext(), hiDataReadOption, iBaseResponseCallback);
    }

    public void e(final CommonUiResponse<HiHealthData> commonUiResponse) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hiDataReadOption.setTimeInterval(0L, jCurrentTimeMillis);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(HiHealthDataType.e(10001));
        nkb.d().b(BaseApplication.getContext(), hiDataReadOption, new IBaseResponseCallback() { // from class: ene
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f33221b.c(jCurrentTimeMillis, commonUiResponse, i, obj);
            }
        });
    }

    /* synthetic */ void c(long j, CommonUiResponse commonUiResponse, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "queryLastBloodSugarData time = ", Long.valueOf(System.currentTimeMillis() - j));
        a(i, obj, (CommonUiResponse<HiHealthData>) commonUiResponse);
    }

    public void c(String str, final CommonUiResponse<HiHealthData> commonUiResponse) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d(0L, jCurrentTimeMillis, 1, str, new IBaseResponseCallback() { // from class: emw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(jCurrentTimeMillis, commonUiResponse, i, obj);
            }
        });
    }

    /* synthetic */ void d(long j, CommonUiResponse commonUiResponse, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "queryLastBloodSugarData time = ", Long.valueOf(System.currentTimeMillis() - j));
        a(i, obj, (CommonUiResponse<HiHealthData>) commonUiResponse);
    }

    private <T> void a(int i, T t, CommonUiResponse<HiHealthData> commonUiResponse) {
        if (i != 0) {
            commonUiResponse.onResponse(100001, null);
        } else if (t instanceof List) {
            commonUiResponse.onResponse(0, (HiHealthData) ((List) t).get(0));
        }
    }

    public void b(HiHealthData hiHealthData, final CommonUiResponse<Integer> commonUiResponse) {
        if (hiHealthData == null) {
            LogUtil.j("HealthDataInteractor", "getLatestBloodSugarDataOneDay healthData is null");
            return;
        }
        long startTime = hiHealthData.getStartTime();
        LogUtil.a("HealthDataInteractor", "getLatestBloodSugarDataOneDay latestTime = ", Long.valueOf(startTime));
        if (startTime == SharedPreferenceManager.d("blood_sugar_module_id", "latest_one_day_time", 0L)) {
            LogUtil.a("HealthDataInteractor", "getLatestBloodSugarDataOneDay latestTime has not changed");
            int iC = SharedPreferenceManager.c("blood_sugar_module_id", "latest_one_day_measure_count", 0);
            if (iC > 0) {
                commonUiResponse.onResponse(0, Integer.valueOf(iC));
                return;
            }
            return;
        }
        SharedPreferenceManager.c("blood_sugar_module_id", "latest_one_day_time", startTime);
        long jA = ift.a(startTime);
        long jC = ift.c(startTime);
        LogUtil.a("HealthDataInteractor", "getLatestBloodSugarDataOneDay startTime = ", Long.valueOf(jA), " endTime = ", Long.valueOf(jC));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d(jA, jC, 0, hiHealthData.getDeviceUuid(), new IBaseResponseCallback() { // from class: emz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.b(jCurrentTimeMillis, commonUiResponse, i, obj);
            }
        });
    }

    /* synthetic */ void b(long j, CommonUiResponse commonUiResponse, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "getLatestBloodSugarDataOneDay time = ", Long.valueOf(System.currentTimeMillis() - j));
        c(i, obj, commonUiResponse);
    }

    private <T> void c(int i, T t, CommonUiResponse<Integer> commonUiResponse) {
        if (i != 0) {
            commonUiResponse.onResponse(100001, 0);
        } else if (t instanceof List) {
            int size = ((List) t).size();
            SharedPreferenceManager.d("blood_sugar_module_id", "latest_one_day_measure_count", size);
            LogUtil.j("HealthDataInteractor", "handleLatestDataOneDay blood sugar measure count = ", Integer.valueOf(size));
            commonUiResponse.onResponse(0, Integer.valueOf(size));
        }
    }

    public void e(String str, CommonUiResponse<List<List<HiHealthData>>> commonUiResponse) {
        d(0L, System.currentTimeMillis(), str, commonUiResponse);
    }

    public void d(long j, long j2, String str, CommonUiResponse<List<List<HiHealthData>>> commonUiResponse) {
        this.e = commonUiResponse;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d(j, j2, 0, str, new IBaseResponseCallback() { // from class: enc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.b(jCurrentTimeMillis, i, obj);
            }
        });
    }

    /* synthetic */ void b(long j, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "readBloodSugarData time = ", Long.valueOf(System.currentTimeMillis() - j));
        a(obj);
    }

    private <T> void a(T t) {
        LogUtil.a("HealthDataInteractor", "handleBloodSugarData enter");
        if (t instanceof List) {
            e((List<HiHealthData>) t);
        }
        LogUtil.a("HealthDataInteractor", "handleBloodSugarData end");
    }

    private void e(List<HiHealthData> list) {
        LogUtil.a("HealthDataInteractor", "handleBloodSugarData dataList.size = ", Integer.valueOf(list.size()));
        List<List<HiHealthData>> listA = a(list);
        LogUtil.a("HealthDataInteractor", "handleBloodSugarData dataLists.size = ", Integer.valueOf(listA.size()));
        CommonUiResponse<List<List<HiHealthData>>> commonUiResponse = this.e;
        if (commonUiResponse != null) {
            commonUiResponse.onResponse(0, listA);
        }
    }

    private List<List<HiHealthData>> a(List<HiHealthData> list) {
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: emu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        });
        for (HiHealthData hiHealthData : list) {
            long jD = ift.d(qrk.h(hiHealthData.getEndTime()));
            List<HiHealthData> list2 = (List) treeMap.get(Long.valueOf(jD));
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                treeMap.put(Long.valueOf(jD), arrayList);
                arrayList.add(hiHealthData);
            } else {
                a(list2, hiHealthData);
            }
        }
        return new ArrayList(treeMap.values());
    }

    private void a(List<HiHealthData> list, HiHealthData hiHealthData) {
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType() > hiHealthData.getType()) {
                size = i;
                break;
            }
        }
        list.add(size, hiHealthData);
    }

    public void b(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HealthDataInteractor", "deleteBloodSugarData");
        nkb.d().d(BaseApplication.getContext(), i, j, j2, iBaseResponseCallback);
    }

    public void b(HiHealthData hiHealthData, String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HealthDataInteractor", "insertBloodSugarData");
        nkb.d().d(BaseApplication.getContext(), hiHealthData, str, iBaseResponseCallback);
    }

    public void e(HiHealthData hiHealthData, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(HiDataSourceFetchOption.builder().c(1).b(new int[]{hiHealthData.getClientId()}).a(), new HiDataClientListener() { // from class: emy
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                emr.a(iBaseResponseCallback, list);
            }
        });
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, List list) {
        if (njy.e(list)) {
            LogUtil.j("HealthDataInteractor", "getBloodSugarDataOrigin clientList is null");
            iBaseResponseCallback.a(100001, null);
        } else {
            LogUtil.a("HealthDataInteractor", "getBloodSugarDataOrigin SUCCESS");
            iBaseResponseCallback.a(0, ((HiHealthClient) list.get(0)).getPackageName());
        }
    }

    public void e(int i, String str, HiDataClientListener hiDataClientListener) {
        HiHealthDeviceApi.d(BaseApplication.getContext()).fetchDataClientByUniqueId(i, str, hiDataClientListener);
    }

    public void c(Context context, final CommonUiResponse<HiUserInfo> commonUiResponse) {
        HiHealthNativeApi.a(context).fetchUserData(new HiCommonListener() { // from class: emr.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("HealthDataInteractor", "contrastCalorieInfoForApp data is fail");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("HealthDataInteractor", "setDeviceWeightData userInfos is null or size is zero");
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (hiUserInfo == null) {
                    LogUtil.j("HealthDataInteractor", "setDeviceWeightData onSuccess HiUserInfo is null");
                } else {
                    commonUiResponse.onResponse(0, hiUserInfo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("HealthDataInteractor", "setDeviceWeightData fetchUserData falied");
            }
        });
    }

    public void a(CommonUiResponse<HeartRateZoneMgr> commonUiResponse) {
        LogUtil.a("HealthDataInteractor", "setRopeHeartRateZone");
        commonUiResponse.onResponse(0, nkd.c().d());
    }

    public void c(final CommonUiResponse<Pair<Set<Long>, Map<Long, List<HiHealthData>>>> commonUiResponse) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        nkb.d().b(0L, jCurrentTimeMillis, new int[]{283}, new IBaseResponseCallback() { // from class: ena
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(jCurrentTimeMillis, commonUiResponse, i, obj);
            }
        });
    }

    /* synthetic */ void e(long j, CommonUiResponse commonUiResponse, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "queryRopeData time = ", Long.valueOf(System.currentTimeMillis() - j), ", onResult errorCode = ", Integer.valueOf(i));
        if (!(obj instanceof List)) {
            LogUtil.j("HealthDataInteractor", "objData is not instance of List");
            commonUiResponse.onResponse(-1, null);
        } else {
            c((List<HiHealthData>) obj, (CommonUiResponse<Pair<Set<Long>, Map<Long, List<HiHealthData>>>>) commonUiResponse);
        }
    }

    private void c(List<HiHealthData> list, CommonUiResponse<Pair<Set<Long>, Map<Long, List<HiHealthData>>>> commonUiResponse) {
        List<HiHealthData> listC = c(list);
        if (njy.e(listC)) {
            LogUtil.a("HealthDataInteractor", "handleRopeData filterRopeData is null");
            commonUiResponse.onResponse(-1, null);
            return;
        }
        Map<Long, List<HiHealthData>> mapD = d(listC);
        if (mapD.isEmpty()) {
            LogUtil.a("HealthDataInteractor", "handleRopeData map is null");
            commonUiResponse.onResponse(-1, null);
        } else {
            LogUtil.a("HealthDataInteractor", "handleRopeData dataList.size = ", Integer.valueOf(list.size()), ", map.size = ", Integer.valueOf(mapD.size()));
            commonUiResponse.onResponse(0, new Pair<>(mapD.keySet(), mapD));
        }
    }

    private List<HiHealthData> c(List<HiHealthData> list) {
        HiTrackMetaData hiTrackMetaData;
        Map<String, String> extendTrackMap;
        ArrayList arrayList = null;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiTrackMetaData = (HiTrackMetaData) qqt.e(JsonSanitizer.sanitize(hiHealthData.getMetaData()), HiTrackMetaData.class)) != null && (extendTrackMap = hiTrackMetaData.getExtendTrackMap()) != null && extendTrackMap.size() != 0 && !TextUtils.isEmpty(extendTrackMap.get("enduranceAbilityRank"))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.a("HealthDataInteractor", "filterRopeDataWithoutRank, healthDataList.size = ", Integer.valueOf(arrayList == null ? 0 : arrayList.size()));
        return arrayList;
    }

    private Map<Long, List<HiHealthData>> d(List<HiHealthData> list) {
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: emx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        });
        for (HiHealthData hiHealthData : list) {
            long jB = ift.b(hiHealthData.getStartTime());
            List<HiHealthData> list2 = (List) treeMap.get(Long.valueOf(jB));
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                treeMap.put(Long.valueOf(jB), arrayList);
                arrayList.add(hiHealthData);
            } else {
                a(list2, hiHealthData);
            }
        }
        return treeMap;
    }

    public void a(HiHealthData hiHealthData, CommonUiResponse<njd> commonUiResponse) {
        if (hiHealthData == null) {
            LogUtil.j("HealthDataInteractor", "getTrackDetailData healthData is null");
        } else {
            a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), commonUiResponse);
        }
    }

    public void a(long j, long j2, final CommonUiResponse<njd> commonUiResponse) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        jxh.a(j, j2, new IBaseResponseCallback() { // from class: emv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                emr.a(jCurrentTimeMillis, commonUiResponse, i, obj);
            }
        });
    }

    static /* synthetic */ void a(long j, CommonUiResponse commonUiResponse, int i, Object obj) {
        LogUtil.a("HealthDataInteractor", "getTrackDetailData time = ", Long.valueOf(System.currentTimeMillis() - j), ", onResponse errorCode = ", Integer.valueOf(i));
        if (!(obj instanceof njd)) {
            LogUtil.j("HealthDataInteractor", "objData is not instance of HWHealthDataManager.PathData");
        } else {
            commonUiResponse.onResponse(0, (njd) obj);
        }
    }
}
