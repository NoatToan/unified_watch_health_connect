package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealthservice.store.interfaces.IDataClient;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class lfv implements IDataClient {
    private static Context d;
    private static final Map<Integer, d> e = new TreeMap<Integer, d>(new Comparator() { // from class: lft
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lfv.c((Integer) obj, (Integer) obj2);
        }
    }) { // from class: lfv.2
        {
            put(1000, new d("DataPointManager", null, true));
            put(3000, new d("HealthDataPointSensitiveManager", "HealthDataPointManager", true));
            put(21000, new d("DataSessionManager", null, false));
            put(22099, new d("HealthDataSessionManager", null, false));
            put(22100, new d("DataCoreSessionManagerAll", null, false));
            put(22107, new d("DataCoreSessionManager", null, true));
            put(22199, new d("DataCoreSessionManagerAll", null, false));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwi f40052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwt f40053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwg f40054c;
    private kxq f;
    private kwy j;

    static /* synthetic */ int c(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    private lfv() {
        this.j = kwy.b(d);
        this.f = kxq.c();
        this.f40054c = kwg.b();
        this.f40053b = kwt.b();
        this.f40052a = kwi.b();
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final lfv f40057a = new lfv();
    }

    public static lfv d(Context context) {
        if (context != null) {
            d = context.getApplicationContext();
        }
        return e.f40057a;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public HiHealthClient saveDeviceInfo(HiDeviceInfo hiDeviceInfo, int i) {
        if (hiDeviceInfo == null) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "saveDeviceInfo() deviceInfo == null");
            return null;
        }
        if (!kwy.b(d).e(hiDeviceInfo, false)) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "saveDeviceInfo() isInserted false");
            return null;
        }
        b(i, hiDeviceInfo.getDeviceUniqueCode());
        HiUserInfo hiUserInfoA = this.f.a(this.f40054c.d(i), 0);
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setHiDeviceInfo(hiDeviceInfo);
        hiHealthClient.setHiUserInfo(hiUserInfoA);
        LogUtil.a("HiH_HiDataClntStr", "saveDeviceInfo() client = ", hiHealthClient, ", appId=", Integer.valueOf(i));
        ReleaseLogUtil.d("HiH_HiDataClntStr", "saveDeviceInfo  client and appId");
        return hiHealthClient;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public HiHealthClient saveDeviceInfoWithUserInfo(HiDeviceInfo hiDeviceInfo, HiUserInfo hiUserInfo, int i) throws Throwable {
        if (hiDeviceInfo == null || hiUserInfo == null || i <= 0) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "saveDeviceInfoWithUserInfo() deviceInfo == null or userInfo == null or app <= 0 ");
            return null;
        }
        if (!this.j.e(hiDeviceInfo, false)) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "saveDeviceInfoWithUserInfo() isInserted false");
            return null;
        }
        String strD = this.f40054c.d(i);
        hiUserInfo.setHuid(strD);
        this.f.c(hiUserInfo, strD, 0);
        b(i, hiDeviceInfo.getDeviceUniqueCode());
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setHiDeviceInfo(hiDeviceInfo);
        hiHealthClient.setHiUserInfo(hiUserInfo);
        LogUtil.d("HiH_HiDataClntStr", "saveDeviceInfoWithUserInfo() client = ", hiHealthClient);
        return hiHealthClient;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public List<HiHealthClient> getHealthClientList(String str, int i) {
        HiDeviceInfo hiDeviceInfoB = this.j.b(str);
        HiUserInfo hiUserInfoA = this.f.a(this.f40054c.d(i), 0);
        ArrayList arrayList = new ArrayList(10);
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setHiDeviceInfo(hiDeviceInfoB);
        hiHealthClient.setHiUserInfo(hiUserInfoA);
        arrayList.add(hiHealthClient);
        LogUtil.d("HiH_HiDataClntStr", "getHealthClientList() client = ", hiHealthClient);
        return arrayList;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public List<HiHealthClient> getAllHealthClientList(int i) {
        int iC = kxi.c(d, i);
        List<Integer> listI = this.f40053b.i(iC);
        if (HiCommonUtil.b(listI)) {
            LogUtil.j("HiH_HiDataClntStr", "getAllHealthClientList() deviceIds is null who = ", Integer.valueOf(iC));
            return null;
        }
        List<HiDeviceInfo> listC = this.j.c(listI);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("HiH_HiDataClntStr", "getAllHealthClientList() deviceInfos is null devices = ", listI);
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        for (HiDeviceInfo hiDeviceInfo : listC) {
            HiHealthClient hiHealthClient = new HiHealthClient();
            hiHealthClient.setHiDeviceInfo(hiDeviceInfo);
            arrayList.add(hiHealthClient);
        }
        return arrayList;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public List<HiHealthClient> getHealthClientListByTime(int i, HiTimeInterval hiTimeInterval, int i2) {
        return b(e(i, hiTimeInterval), hiTimeInterval, i2);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public List<HiHealthClient> getHealthClientMergedListByTime(List<Integer> list, HiTimeInterval hiTimeInterval, int i) {
        return b(d(list, hiTimeInterval), hiTimeInterval, i);
    }

    private List<HiHealthClient> b(List<Integer> list, HiTimeInterval hiTimeInterval, int i) {
        HiHealthClient hiHealthClientD;
        if (HiCommonUtil.b(list)) {
            LogUtil.j("HiH_HiDataClntStr", "getHealthClientListByTime dataClientIDs is null timeInterval = ", hiTimeInterval);
            return null;
        }
        int iC = kxi.c(d, i);
        if (iC <= 0) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "getHealthClientListByTime who <= 0 app = ", Integer.valueOf(i));
            return null;
        }
        LogUtil.j("HiH_HiDataClntStr", "getClientsByIds userId end", Integer.valueOf(iC));
        List<kym> listC = this.f40053b.c(iC, list);
        LogUtil.j("HiH_HiDataClntStr", "getClientsByIds healthContexts end");
        c();
        ReleaseLogUtil.d("HiH_HiDataClntStr", "getClientsByIds start");
        if (njy.e(listC)) {
            LogUtil.j("HiH_HiDataClntStr", "getAllClientsByUserAndClientIds is null dataClients = ", list);
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        HashSet hashSet = new HashSet();
        for (kym kymVar : listC) {
            if (kymVar != null && (hiHealthClientD = d(kymVar.b(), kymVar.d())) != null) {
                String str = hiHealthClientD.getDeviceUuid().toUpperCase().replaceAll(":", "").replaceAll("#ANDROID21", "") + hiHealthClientD.getAppId();
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    arrayList.add(hiHealthClientD);
                }
            }
        }
        ReleaseLogUtil.d("HiH_HiDataClntStr", "getClientsByIds end");
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    private List<Integer> d(List<Integer> list, HiTimeInterval hiTimeInterval) {
        List<Integer> listD;
        HashSet hashSet = new HashSet();
        ReleaseLogUtil.d("HiH_HiDataClntStr", "getDataClientIds start");
        for (Map.Entry<String, Set<Integer>> entry : d(list).entrySet()) {
            int[] iArrA = a(entry.getValue());
            if (iArrA.length != 0) {
                String key = entry.getKey();
                key.hashCode();
                switch (key) {
                    case "HealthDataPointSensitiveManager":
                    case "HealthDataPointManager":
                        listD = ljq.a(d, iArrA[0]).d(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), iArrA);
                        break;
                    case "DataStressPointManager":
                        listD = kxd.e(d).c(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), iArrA);
                        break;
                    case "DataSequenceManager":
                        listD = kws.e(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), iArrA);
                        break;
                    case "DataCoreSessionManager":
                        listD = kwu.c(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), iArrA);
                        break;
                    case "DataPointManager":
                        listD = kwq.e(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), iArrA);
                        break;
                    case "DataCoreSessionManagerAll":
                        listD = kwu.c(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
                        break;
                    case "HealthDataSessionManager":
                        listD = kxg.c(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
                        break;
                    case "DataSessionManager":
                        listD = kwv.e(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
                        break;
                    default:
                        listD = null;
                        break;
                }
                if (listD != null) {
                    hashSet.addAll(listD);
                }
            }
        }
        ReleaseLogUtil.d("HiH_HiDataClntStr", "getDataClientIds end");
        return new ArrayList(hashSet);
    }

    private int[] a(Collection<Integer> collection) {
        collection.remove(null);
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    private void b(int i, String str) {
        if (i == kud.a().c()) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "SaveDeviceInfoWithUserInfo, and Insert the DataClient table");
            kyn.d(d).e(i, i, 0, str);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40056b;
        private final boolean d;

        d(String str, String str2, boolean z) {
            this.f40055a = str;
            this.f40056b = str2;
            this.d = z;
        }

        void a(Map<String, Set<Integer>> map, int i, boolean z) {
            String str = z ? this.f40055a : this.f40056b;
            if (str == null) {
                return;
            }
            if (this.d || !map.containsKey(str)) {
                lfv.a(map, i, str);
            }
        }
    }

    private void a(Map<String, Set<Integer>> map, int i) {
        Map.Entry<Integer, d> next;
        boolean zI;
        if (HiHealthDataType.t(i)) {
            a(map, i, "DataStressPointManager");
            return;
        }
        Iterator<Map.Entry<Integer, d>> it = e.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                int iIntValue = next.getKey().intValue();
                if (i <= iIntValue) {
                    if (iIntValue == 3000) {
                        zI = ljq.i(d, i);
                        break;
                    }
                }
            } else {
                next = null;
            }
            zI = true;
            break;
        }
        if (next == null) {
            if (HiHealthDictManager.a(d).e(i) == 0) {
                a(map, i, ljq.i(d, i) ? "HealthDataPointSensitiveManager" : "HealthDataPointManager");
                return;
            }
            LogUtil.d("HiH_HiDataClntStr", "getHealthClientListByTime other condition");
            HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(d).a(i);
            if (hiHealthDictTypeA == null || hiHealthDictTypeA.c() != 1) {
                return;
            }
            Set<Integer> setD = d(map, "DataSequenceManager");
            setD.add(Integer.valueOf(i));
            map.put("DataSequenceManager", setD);
            return;
        }
        next.getValue().a(map, i, zI);
    }

    private Map<String, Set<Integer>> d(List<Integer> list) {
        HashMap map = new HashMap();
        for (Integer num : list) {
            if (num != null) {
                a(map, num.intValue());
            }
        }
        Set<Integer> setD = d(map, "DataPointManager");
        if (setD.contains(2)) {
            setD.add(901);
        }
        if (map.containsKey("DataCoreSessionManagerAll")) {
            map.remove("DataCoreSessionManager");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Map<String, Set<Integer>> map, int i, String str) {
        Set<Integer> setD = d(map, str);
        setD.add(Integer.valueOf(i));
        map.put(str, setD);
    }

    private static Set<Integer> d(Map<String, Set<Integer>> map, String str) {
        Set<Integer> set = map.get(str);
        return set == null ? new HashSet() : set;
    }

    private List<Integer> e(int i, HiTimeInterval hiTimeInterval) {
        if (i <= 1000) {
            if (2 == i) {
                return kwq.e(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), new int[]{2, 901});
            }
            return kwq.e(d).b(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), i);
        }
        if (i <= 3000) {
            return ljq.a(d, i).c(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), i);
        }
        if (i <= 21000) {
            return kwv.e(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
        }
        if (i <= 22099) {
            return kxg.c(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
        }
        if (i <= 22107 && i >= 22101) {
            return kwu.c(d).e(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), i);
        }
        if (i <= 22199) {
            return kwu.c(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime());
        }
        if (HiHealthDictManager.a(d).e(i) == 0) {
            return ljq.a(d, i).c(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), i);
        }
        LogUtil.d("HiH_HiDataClntStr", "getHealthClientListByTime other condition");
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(d).a(i);
        if (hiHealthDictTypeA == null || hiHealthDictTypeA.c() != 1) {
            return null;
        }
        return kws.e(d).a(hiTimeInterval.getStartTime(), hiTimeInterval.getEndTime(), new int[]{i});
    }

    private void c() {
        String androidId = FoundationCommonUtil.getAndroidId(d);
        HiDeviceInfo hiDeviceInfoB = this.j.b(androidId);
        if (hiDeviceInfoB == null) {
            LogUtil.e("HiH_HiDataClntStr", "updateModelColumnOnLocalPhone device ", e(androidId), "is not exist!");
            return;
        }
        int deviceId = hiDeviceInfoB.getDeviceId();
        LogUtil.a("HiH_HiDataClntStr", "updateModelColumnOnLocalPhone deviceInfo:", Integer.valueOf(deviceId), "--", e(hiDeviceInfoB.getDeviceUniqueCode()));
        if (HiCommonUtil.a(hiDeviceInfoB.getModel())) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("model", kwd.c());
            this.j.b(hiDeviceInfoB.getDeviceId(), contentValues);
        }
    }

    private String e(String str) {
        if (!HiCommonUtil.a(str) && str.length() > 8) {
            return str.substring(0, 4) + str.substring(str.length() - 4, str.length());
        }
        return "";
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataClient
    public List<HiHealthClient> getHealthClientListByUserId(int i, HiDataSourceFetchOption hiDataSourceFetchOption) {
        if (hiDataSourceFetchOption == null) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "fetchOption is null");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(10);
        if (hiDataSourceFetchOption.getFetchType() == null) {
            ReleaseLogUtil.e("HiH_HiDataClntStr", "FetchType is null");
            return new ArrayList();
        }
        int iIntValue = hiDataSourceFetchOption.getFetchType().intValue();
        if (iIntValue == 0) {
            List<kym> listA = this.f40053b.a(i);
            if (HiCommonUtil.b(listA)) {
                LogUtil.j("HiH_HiDataClntStr", "getHealthClientListByUserId healthContexts is null who = ", Integer.valueOf(i));
                return Collections.EMPTY_LIST;
            }
            for (kym kymVar : listA) {
                HiHealthClient hiHealthClientD = d(kymVar.b(), kymVar.d());
                if (hiHealthClientD != null) {
                    arrayList.add(hiHealthClientD);
                }
            }
        } else {
            if (iIntValue != 1) {
                LogUtil.j("HiH_HiDataClntStr", "Unsupport data source fetch type ", hiDataSourceFetchOption.getFetchType());
                return arrayList;
            }
            if (HiCommonUtil.e(hiDataSourceFetchOption.getClientIds())) {
                ReleaseLogUtil.e("HiH_HiDataClntStr", "ClientIds is null or empty");
                return new ArrayList();
            }
            for (int i2 : hiDataSourceFetchOption.getClientIds()) {
                HiHealthClient hiHealthClientD2 = d(this.f40053b.d(i2), this.f40053b.c(i2));
                if (hiHealthClientD2 != null) {
                    hiHealthClientD2.setClientId(i2);
                    arrayList.add(hiHealthClientD2);
                }
            }
        }
        return arrayList;
    }

    private HiHealthClient d(int i, int i2) {
        HiAppInfo hiAppInfoC = this.f40052a.c(i);
        HiDeviceInfo hiDeviceInfoB = this.j.b(i2);
        if (hiAppInfoC == null || hiDeviceInfoB == null) {
            LogUtil.j("HiH_HiDataClntStr", "appInfo is null or deviceInfo is null");
            return null;
        }
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setHiAppInfo(hiAppInfoC);
        hiHealthClient.setHiDeviceInfo(hiDeviceInfoB);
        return hiHealthClient;
    }
}
