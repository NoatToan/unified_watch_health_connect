package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.KeyValDbManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
class dkx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31925b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31926c = "";

    private static int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    public static edm c(String str) {
        edm edmVar = new edm();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParseIndexAllUtils", "parseIndexFile, indexAllJson is empty");
            return edmVar;
        }
        try {
            edmVar.c(a(c(str, edmVar)));
            return edmVar;
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "parseIndexFile exception");
            return edmVar;
        }
    }

    private static JSONObject c(String str, edm edmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        edmVar.d(jSONObject.optString("version"));
        String strOptString = jSONObject.optString("lang_version");
        f31926c = strOptString;
        edmVar.c(strOptString);
        edmVar.b(c(jSONObject.getJSONArray("lang_info")));
        String strOptString2 = jSONObject.optString("img_version");
        f31925b = strOptString2;
        edmVar.a(strOptString2);
        edmVar.d(c(jSONObject.getJSONArray("img_info")));
        d(jSONObject.optString(MapKeyNames.APP_INFO));
        return jSONObject;
    }

    private static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        KeyValDbManager.d(BaseApplication.b()).b("app_info_device_cloud", str);
    }

    public static edm e(String str) {
        edm edmVar = new edm();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParseIndexAllUtils", "getDownloadIndexBean, indexAllJson is empty");
            return edmVar;
        }
        try {
            c(str, edmVar);
            return edmVar;
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "getDownloadIndexBean exception");
            return edmVar;
        }
    }

    private static List<edo> c(JSONArray jSONArray) {
        LogUtil.a("ParseIndexAllUtils", "start getPathList");
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("ParseIndexAllUtils", "pathArray is no data");
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    LogUtil.j("ParseIndexAllUtils", "getPathList, jsonObject is null");
                } else {
                    edo edoVar = new edo();
                    edoVar.a(jSONObject.optString(BleConstants.KEY_PATH));
                    edoVar.e(jSONObject.optInt("size"));
                    edoVar.b(jSONObject.optString("digest"));
                    arrayList.add(edoVar);
                }
            } catch (JSONException unused) {
                LogUtil.e("ParseIndexAllUtils", "getPathList JSONException");
            }
        }
        LogUtil.a("ParseIndexAllUtils", "resourceList size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static List<edq> a(JSONObject jSONObject) {
        LogUtil.a("ParseIndexAllUtils", "start setKindList");
        ArrayList arrayList = new ArrayList(16);
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setKindList, jsonObject is empty");
            return arrayList;
        }
        try {
            if (!jSONObject.isNull(DeviceCategoryFragment.DEVICE_KIND)) {
                JSONArray jSONArray = jSONObject.getJSONArray(DeviceCategoryFragment.DEVICE_KIND);
                for (int i = 0; i < jSONArray.length(); i++) {
                    edq edqVar = new edq();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("kind_name");
                    edqVar.e(strOptString);
                    String strOptString2 = jSONObject2.optString("kind_id");
                    edqVar.c(strOptString2);
                    String string = jSONObject2.getString("resource_site");
                    edqVar.b(string);
                    edqVar.d(jSONObject2.optString("kind_tip", ""));
                    List<eds> listC = c(jSONObject2.getJSONArray("device_list"), strOptString2, strOptString, string);
                    if (listC.isEmpty()) {
                        LogUtil.j("ParseIndexAllUtils", "setKindList, kindName: ", strOptString, " device info is empty");
                    } else {
                        edqVar.a(listC);
                        arrayList.add(edqVar);
                    }
                }
                return arrayList;
            }
            LogUtil.j("ParseIndexAllUtils", "start jsonObject.isNull(DeviceIndexAllConstants.DEVICE_KIND)");
            return arrayList;
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setKindList JSONException");
        }
    }

    private static List<eds> c(JSONArray jSONArray, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("ParseIndexAllUtils", "getDeviceKindList, jsonArray is no data");
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                eds edsVar = new eds();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    d(edsVar, jSONObject);
                    a(edsVar, jSONObject);
                    edsVar.c(jSONObject.optInt("cloud_type"));
                    edsVar.f(str);
                    edsVar.j(str2);
                    String strOptString = jSONObject.optString("brand_name");
                    edsVar.d(strOptString);
                    edsVar.b(strOptString);
                    d(jSONObject, edsVar);
                    String strOptString2 = jSONObject.optString("device_name");
                    edsVar.h(strOptString2);
                    edsVar.c(jSONObject.optString("device_description"));
                    b(edsVar, jSONObject);
                    edsVar.b(d(jSONObject.optInt("bluetooth_type")));
                    edsVar.a(jSONObject.optString("bluetooth_match"));
                    e(jSONObject, edsVar);
                    edsVar.o(jSONObject.optString("publish_mode"));
                    int iOptInt = jSONObject.optInt("support_all_scan");
                    if (iOptInt == 0) {
                        iOptInt = 1;
                    }
                    edsVar.j(iOptInt);
                    e(str3, edsVar, jSONObject, strOptString2);
                    arrayList.add(edsVar);
                }
            } catch (JSONException unused) {
                LogUtil.e("ParseIndexAllUtils", "getDeviceList JSONException");
            }
        }
        return arrayList;
    }

    private static void e(String str, eds edsVar, JSONObject jSONObject, String str2) {
        int iOptInt = jSONObject.optInt("can_scan");
        if (iOptInt == 0) {
            iOptInt = 2;
        }
        edsVar.e(iOptInt);
        c(edsVar, jSONObject);
        a(jSONObject, edsVar);
        h(jSONObject, edsVar);
        c(jSONObject, edsVar);
        edsVar.i(jSONObject.optInt("is_aw70"));
        edsVar.d(jSONObject.optInt("device_relationship"));
        edsVar.m(str);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(AdShowExtras.DOWNLOAD_SOURCE);
        if (jSONObjectOptJSONObject != null) {
            LogUtil.d("ParseIndexAllUtils", "downloadSource device : ", str2);
            DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
            deviceDownloadSourceInfo.setSite(jSONObjectOptJSONObject.optInt("site"));
            deviceDownloadSourceInfo.setIndexName(jSONObjectOptJSONObject.optString("indexName"));
            deviceDownloadSourceInfo.setConfigurationPoint(jSONObjectOptJSONObject.optString("configurationPoint"));
            edsVar.a(deviceDownloadSourceInfo);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ecology_profile");
        if (jSONObjectOptJSONObject2 != null) {
            LogUtil.d("ParseIndexAllUtils", "ecology device : ", str2);
            edsVar.g(jSONObjectOptJSONObject2.optInt("ecology_type"));
            edsVar.a(jSONObjectOptJSONObject2.optInt(PluginPayAdapter.DEVICE_CATEGORY));
            edsVar.g(jSONObjectOptJSONObject2.optString("model"));
        }
        b(jSONObject, edsVar);
        e(edsVar);
    }

    private static void b(JSONObject jSONObject, eds edsVar) {
        try {
            if (!jSONObject.has("device_detail")) {
                LogUtil.d("ParseIndexAllUtils", "setDeviceDetails not have device detail");
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("device_detail");
            if (jSONArray == null) {
                LogUtil.j("ParseIndexAllUtils", "setDeviceDetails deviceDetailArray is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                edk edkVar = new edk();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                edkVar.d(jSONObject2.getString("uuid"));
                arrayList.add(edkVar.d());
                edkVar.a(jSONObject2.getString("digest"));
                edkVar.b(jSONObject2.getString("version"));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("download_source_site");
                if (jSONObjectOptJSONObject != null) {
                    DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
                    deviceDownloadSourceInfo.setSite(jSONObjectOptJSONObject.optInt("site"));
                    deviceDownloadSourceInfo.setIndexName(jSONObjectOptJSONObject.optString("indexName"));
                    deviceDownloadSourceInfo.setConfigurationPoint(jSONObjectOptJSONObject.optString("configurationPoint"));
                    edkVar.d(deviceDownloadSourceInfo);
                } else {
                    LogUtil.a("ParseIndexAllUtils", "setDeviceDetails downloadSource null");
                }
                if (jSONObject2.has("oobe")) {
                    edkVar.e(jSONObject2.getString("oobe"));
                }
                arrayList2.add(edkVar);
            }
            arrayList.addAll(edsVar.aa());
            edsVar.e(arrayList2);
            edsVar.c(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setDeviceDetails JSONException");
        }
    }

    private static void e(eds edsVar) {
        List<edk> listM = edsVar.m();
        if (listM == null || listM.size() == 0) {
            LogUtil.d("ParseIndexAllUtils", "setEzPluginIndexInfos devicePluginInfo is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM.size(); i++) {
            edx edxVar = new edx();
            edxVar.e(listM.get(i).d());
            edxVar.d(listM.get(i).b());
            edxVar.b(listM.get(i).a());
            edxVar.d(listM.get(i).e());
            d(edsVar, edxVar);
            edxVar.f(edsVar.y());
            edxVar.a(edsVar.a());
            edxVar.h(listM.get(i).c());
            arrayList.add(edxVar);
        }
        edsVar.a(arrayList);
    }

    private static void d(eds edsVar, edx edxVar) {
        if (edsVar.s().equals("wear_watch")) {
            edxVar.g("SMART_WATCH");
        } else if (edsVar.s().equals("wear_band") || edsVar.s().toUpperCase(Locale.getDefault()).equals("SPORTS_GENIE")) {
            edxVar.g("SMART_BAND");
        } else {
            edxVar.g(edsVar.s());
        }
    }

    private static void d(JSONObject jSONObject, eds edsVar) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setOtherBand jsonObject is null");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!jSONObject.isNull("brand_config")) {
                JSONArray jSONArray = jSONObject.getJSONArray("brand_config");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    edp edpVar = new edp();
                    if (!jSONObject2.isNull("country")) {
                        List<String> listAsList = Arrays.asList(jSONObject2.getString("country").split(";"));
                        if (!njy.e(listAsList)) {
                            edpVar.e(listAsList);
                            if (!jSONObject2.isNull("brand_name")) {
                                edpVar.a(jSONObject2.getString("brand_name"));
                                arrayList.add(edpVar);
                            }
                        }
                    }
                }
            }
            edsVar.b(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setOtherBand JSONException");
        }
    }

    private static void e(JSONObject jSONObject, eds edsVar) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setBluetoothList jsonObject is null.");
            return;
        }
        try {
            if (!jSONObject.isNull("bluetooth_name_new")) {
                jSONArray = jSONObject.getJSONArray("bluetooth_name_new");
            } else if (!jSONObject.isNull("bluetooth_name")) {
                jSONArray = jSONObject.getJSONArray("bluetooth_name");
            } else {
                LogUtil.j("ParseIndexAllUtils", "jsonObject no contain bluetooth_name_new ir bluetooth_name.");
                jSONArray = null;
            }
            a(jSONArray, edsVar);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setBluetoothList occur JSONException.");
        }
    }

    private static void a(JSONArray jSONArray, eds edsVar) {
        if (jSONArray == null) {
            LogUtil.j("ParseIndexAllUtils", "setBluetoothListDetails pairArray is null.");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            edsVar.d(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setBluetoothListDetails occur JSONException.");
        }
    }

    private static void a(JSONObject jSONObject, eds edsVar) {
        String str;
        String string;
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "getPublishVersion, jsonObject is null");
            return;
        }
        if (jSONObject.isNull("publish_version")) {
            return;
        }
        HashMap map = new HashMap(16);
        String string2 = null;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("publish_version");
            string = null;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (!jSONObject2.isNull("domestic")) {
                        string2 = jSONObject2.getString("domestic");
                    }
                    if (!jSONObject2.isNull("overseas")) {
                        string = jSONObject2.getString("overseas");
                    }
                } catch (JSONException unused) {
                    str = string2;
                    string2 = string;
                    LogUtil.e("ParseIndexAllUtils", "getPublishVersion JSONException");
                    string = string2;
                    string2 = str;
                }
            }
        } catch (JSONException unused2) {
            str = null;
        }
        if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
            LogUtil.j("ParseIndexAllUtils", "publicVersion parameters not configured.");
        } else {
            if (!TextUtils.isEmpty(string2)) {
                map.put("domestic", string2);
            }
            if (!TextUtils.isEmpty(string)) {
                map.put("overseas", string);
            }
        }
        edsVar.e(map);
    }

    private static void c(JSONObject jSONObject, eds edsVar) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setPairTypeLink, jsonObject is null");
            return;
        }
        if (jSONObject.isNull("pair_type")) {
            return;
        }
        HashMap map = new HashMap(16);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pair_type");
            String string = null;
            String string2 = null;
            String string3 = null;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("uuid")) {
                    string = jSONObject2.getString("uuid");
                }
                if (!jSONObject2.isNull("pair_format")) {
                    string2 = jSONObject2.getString("pair_format");
                }
                if (!jSONObject2.isNull("uri")) {
                    string3 = jSONObject2.getString("uri");
                }
                if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                    LogUtil.j("ParseIndexAllUtils", "current uuid setPairTypeLink parameters not configured.");
                } else {
                    edt edtVar = new edt();
                    if (!TextUtils.isEmpty(string)) {
                        edtVar.a(string);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        edtVar.c(string2);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        edtVar.e(string3);
                    }
                    map.put(string, edtVar);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setPairTypeLink JSONException");
        }
        edsVar.d(map);
    }

    private static void h(JSONObject jSONObject, eds edsVar) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setSecondResourceInfo, jsonObject is null");
            return;
        }
        if (jSONObject.isNull("second_resource")) {
            return;
        }
        HashMap map = new HashMap(16);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("second_resource");
            for (int i = 0; i < jSONArray.length(); i++) {
                ArrayList arrayList = new ArrayList(16);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.clear();
                arrayList.addAll(b(jSONObject2));
                edu eduVar = new edu();
                a(eduVar, arrayList);
                e(eduVar, jSONObject2);
                c(eduVar, jSONObject2);
                map.putAll(c(eduVar));
                LogUtil.d("ParseIndexAllUtils", "resourceBeanMap: ", map.toString());
            }
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setSecondResourceInfo JSONException");
        }
        edsVar.a(map);
        LogUtil.d("ParseIndexAllUtils", "setSecondResourceBeanMap:", edsVar.ac().toString());
    }

    private static void a(edu eduVar, List<String> list) {
        if (list != null) {
            eduVar.b(list);
            LogUtil.a("ParseIndexAllUtils", "setSecondResourceInfoPart secondResourceBean.getUuid: ", eduVar.g().toString());
        }
    }

    private static void e(edu eduVar, JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("device_name")) {
                String string = jSONObject.getString("device_name");
                if (!TextUtils.isEmpty(string)) {
                    eduVar.e(string);
                }
            }
            if (!jSONObject.isNull("device_description")) {
                String string2 = jSONObject.getString("device_description");
                if (!TextUtils.isEmpty(string2)) {
                    eduVar.b(string2);
                }
            }
            if (!jSONObject.isNull("second_icon")) {
                String string3 = jSONObject.getString("second_icon");
                if (!TextUtils.isEmpty(string3)) {
                    eduVar.a(b(string3));
                }
            }
            if (jSONObject.isNull("bluetooth_match")) {
                return;
            }
            eduVar.c(jSONObject.optString("bluetooth_match"));
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setSecondResourceDeal JSONException");
        }
    }

    private static void c(edu eduVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setUuidList, jsonObject is empty");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!jSONObject.isNull("bluetooth_name")) {
                JSONArray jSONArray = jSONObject.getJSONArray("bluetooth_name");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
            }
            eduVar.a(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "set uuid list is exception");
        }
    }

    private static Map<String, edu> c(edu eduVar) {
        HashMap map = new HashMap(16);
        map.put(eduVar.g().get(0), eduVar);
        return map;
    }

    private static List<String> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(16);
        try {
            LogUtil.a("ParseIndexAllUtils", "setParseUuidList jsonObjectSecond: ", jSONObject.toString());
            if (!jSONObject.isNull("uuid")) {
                JSONArray jSONArray = jSONObject.getJSONArray("uuid");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.j("ParseIndexAllUtils", "uuid is null");
                    } else {
                        arrayList.add(string);
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "setParseUuidList JSONException");
        }
        return arrayList;
    }

    private static void b(eds edsVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setImagePath, json object is null");
            return;
        }
        edsVar.i(b(jSONObject.optString("icon")));
        String strOptString = jSONObject.optString("icon_backup");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        edsVar.e(b(strOptString));
    }

    private static void c(eds edsVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setPairGuid, json object is null");
            return;
        }
        String strOptString = jSONObject.optString("pair_guide");
        edsVar.n(strOptString);
        if ("4".equals(strOptString) && jSONObject.has("pair_guide_array")) {
            HashMap map = new HashMap(16);
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("pair_guide_array");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String strValueOf = String.valueOf(itKeys.next());
                        map.put(strValueOf, jSONObject2.optString(strValueOf));
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("ParseIndexAllUtils", "setPairGuid json exception");
            }
            edsVar.c(map);
        }
    }

    private static void a(eds edsVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setPrivacyImagePaths, jsonObject is empty");
            return;
        }
        try {
            if (jSONObject.isNull("privacy_image")) {
                return;
            }
            HashMap map = new HashMap(16);
            JSONObject jSONObject2 = jSONObject.getJSONObject("privacy_image");
            LogUtil.j("ParseIndexAllUtils", "jsonMap is ", jSONObject2.toString());
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String strValueOf = String.valueOf(itKeys.next());
                map.put(strValueOf, b(jSONObject2.optString(strValueOf)));
            }
            edsVar.b(map);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "set privacyImagePaths is exception");
        }
    }

    private static void d(eds edsVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParseIndexAllUtils", "setUuidList, jsonObject is empty");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!jSONObject.isNull("uuid")) {
                JSONArray jSONArray = jSONObject.getJSONArray("uuid");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.j("ParseIndexAllUtils", "uuid is null");
                    } else {
                        arrayList.add(string);
                    }
                }
            }
            edsVar.c(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParseIndexAllUtils", "set uuid list is exception");
        }
    }

    private static String b(String str) {
        return (eek.d() + f31925b + File.separator + str) + ".webp";
    }
}
