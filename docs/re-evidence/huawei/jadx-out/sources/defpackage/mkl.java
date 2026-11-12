package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes10.dex */
public class mkl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mkl f41809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f41810c = new ConcurrentHashMap(24);
    private static final ConcurrentHashMap<Integer, Boolean> d = new ConcurrentHashMap<>(24);
    private static final Object e = new Object();

    private mkl() {
        synchronized (e) {
            Map<String, String> map = f41810c;
            map.clear();
            map.putAll(e());
        }
    }

    public static mkl d() {
        mkl mklVar;
        synchronized (mkl.class) {
            if (f41809b == null) {
                f41809b = new mkl();
            }
            mklVar = f41809b;
        }
        return mklVar;
    }

    public List<DeviceInfo> a(List<DeviceInfo> list) {
        if (list == null) {
            return list;
        }
        ArrayList<DeviceInfo> arrayList = new ArrayList(list);
        if (arrayList.size() > 0) {
            Map<String, String> map = f41810c;
            if (map.size() == 0) {
                LogUtil.j("HwDeviceRelationManager", "fillDeviceListRelation DEVICES_RELATION size is zero");
                map.putAll(e());
            }
        }
        for (DeviceInfo deviceInfo : arrayList) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            Map<String, String> map2 = f41810c;
            if (map2.containsKey(deviceIdentify)) {
                deviceInfo.setRelationship(map2.get(deviceIdentify));
            }
        }
        return arrayList;
    }

    public void b() {
        LogUtil.j("HwDeviceRelationManager", "retryConfigRelation");
        Map<String, String> map = f41810c;
        map.clear();
        map.putAll(e());
    }

    public boolean c(List<DeviceInfo> list, String str) {
        synchronized (e) {
            ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "updateDeviceListRelation tag is ", str);
            if (list == null) {
                LogUtil.j("HwDeviceRelationManager", "updateDeviceListRelation is null.");
                return false;
            }
            ArrayList arrayList = new ArrayList(list);
            if (!c(arrayList)) {
                LogUtil.j("HwDeviceRelationManager", "updateDeviceListRelation relationship is incorrect.");
                return false;
            }
            Iterator<String> it = f41810c.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    Iterator<DeviceInfo> it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            it.remove();
                            break;
                        }
                    } while (!next.equals(it2.next().getDeviceIdentify()));
                }
            }
            mwy.a(f41810c);
            for (DeviceInfo deviceInfo : arrayList) {
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (!TextUtils.isEmpty(deviceIdentify)) {
                    f41810c.put(deviceIdentify, deviceInfo.getRelationship());
                    ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "updateDeviceListRelation fuzzData: ", CommonUtil.n(deviceIdentify), " ship: ", deviceInfo.getRelationship());
                }
            }
            a();
            ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "updateDeviceListRelation relationship update success.");
            mwy.d(list);
            return true;
        }
    }

    public String a(String str) {
        String relationship = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HwDeviceRelationManager", "identify is empty");
            return null;
        }
        for (Map.Entry<String, String> entry : f41810c.entrySet()) {
            if (str.equals(entry.getKey())) {
                relationship = entry.getValue();
                break;
            }
        }
        if (!TextUtils.isEmpty(relationship)) {
            return relationship;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwDeviceRelationManager");
        if (deviceList.size() > 0) {
            relationship = deviceList.get(0).getRelationship();
        }
        ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "relationDeviceInfoList has relation is ", relationship);
        return relationship;
    }

    public boolean a(int i) {
        LogUtil.a("HwDeviceRelationManager", "isFollowDevice productType: ", Integer.valueOf(i));
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = d;
        if (concurrentHashMap.containsKey(Integer.valueOf(i))) {
            return concurrentHashMap.get(Integer.valueOf(i)).booleanValue();
        }
        String strA = mmx.a(i);
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strA);
        LogUtil.a("HwDeviceRelationManager", "is plugin download uuid:", strA, ", isPluginAvailable", Boolean.valueOf(zIsResourcesAvailable));
        if (zIsResourcesAvailable) {
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strA);
            LogUtil.a("HwDeviceRelationManager", "isFollowDevice success getPluginInfo.");
            if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                LogUtil.j("HwDeviceRelationManager", "isFollowDevice info or WearDeviceInfo is null");
            } else {
                if ("followed_relationship".equals(pluginInfoByUuid.i().bl())) {
                    concurrentHashMap.put(Integer.valueOf(i), true);
                    return true;
                }
                concurrentHashMap.put(Integer.valueOf(i), false);
                return false;
            }
        }
        return false;
    }

    private boolean c(List<DeviceInfo> list) {
        boolean z = false;
        int i = 0;
        for (DeviceInfo deviceInfo : list) {
            String relationship = deviceInfo.getRelationship();
            if ("main_relationship".equals(relationship)) {
                i++;
                if (i > 1) {
                    ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "isCorrectRelation is ", Boolean.valueOf(z));
                    return z;
                }
            } else if ("followed_relationship".equals(relationship)) {
                if (!a(deviceInfo.getProductType()) && !eel.d(deviceInfo.getProductType())) {
                    ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "isCorrectRelation is ", Boolean.valueOf(z));
                    return z;
                }
            } else {
                LogUtil.d("HwDeviceRelationManager", "isCorrectRelation else relation.");
            }
        }
        z = true;
        ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "isCorrectRelation is ", Boolean.valueOf(z));
        return z;
    }

    private void a() {
        Map<String, String> map = f41810c;
        if (map.size() != 0) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.array();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONStringer.object();
                    jSONStringer.key("type");
                    jSONStringer.value(entry.getKey());
                    jSONStringer.key("value");
                    jSONStringer.value(entry.getValue());
                    jSONStringer.endObject();
                }
                jSONStringer.endArray();
            } catch (JSONException unused) {
                ReleaseLogUtil.a("DEVMGR_HwDeviceRelationManager", "saveRelationMap JSONException.");
            }
            boolean zCommit = BaseApplication.getContext().getSharedPreferences("relation", 0).edit().putString("relation", jSONStringer.toString()).commit();
            if (zCommit) {
                return;
            }
            ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "saveRelationMap isSuccess: ", Boolean.valueOf(zCommit));
            lng.c("MultiDeviceMessage", "saveRelationMap isSuccess: " + zCommit);
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "DEVICES_RELATION is empty");
        boolean zCommit2 = BaseApplication.getContext().getSharedPreferences("relation", 0).edit().putString("relation", "").commit();
        if (zCommit2) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwDeviceRelationManager", "DEVICES_RELATION is empty, saveRelationMap isSuccess: ", Boolean.valueOf(zCommit2));
        lng.c("MultiDeviceMessage", "DEVICES_RELATION is empty, saveRelationMap isSuccess: " + zCommit2);
    }

    private Map<String, String> e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(24);
        String string = BaseApplication.getContext().getSharedPreferences("relation", 0).getString("relation", "");
        if (string.length() > 0) {
            try {
                Object objNextValue = new JSONTokener(string).nextValue();
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        concurrentHashMap.put(jSONObject.getString("type"), jSONObject.getString("value"));
                        LogUtil.a("HwDeviceRelationManager", "getRelationMap fuzzDataType: ", CommonUtil.n(jSONObject.getString("type")), " shipValue: ", jSONObject.getString("value"));
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("HwDeviceRelationManager", "getRelationMap JSONException.");
                lng.c("MultiDeviceMessage", "getRelationMap JSONException.");
            }
        }
        return concurrentHashMap;
    }
}
