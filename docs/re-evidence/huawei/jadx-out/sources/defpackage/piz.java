package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import com.huawei.pluginmgr.hwwear.bean.DeviceFittingsBean;
import health.compact.a.KeyValDbManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class piz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45474a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f45475c = "";

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

    public static piw e(String str) {
        piw piwVar = new piw();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParesIndexAllUtils", "parseIndexFile, indexAllJson is empty");
            return piwVar;
        }
        try {
            piwVar.d(d(e(str, piwVar)));
            return piwVar;
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "parseIndexFile exception");
            return piwVar;
        }
    }

    private static JSONObject e(String str, piw piwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        piwVar.c(jSONObject.optString("version"));
        String strOptString = jSONObject.optString("lang_version");
        f45474a = strOptString;
        piwVar.a(strOptString);
        piwVar.c(b(jSONObject.getJSONArray("lang_info")));
        String strOptString2 = jSONObject.optString("img_version");
        f45475c = strOptString2;
        piwVar.b(strOptString2);
        piwVar.e(b(jSONObject.getJSONArray("img_info")));
        c(jSONObject.optString(MapKeyNames.APP_INFO));
        return jSONObject;
    }

    private static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        KeyValDbManager.d(BaseApplication.b()).b("app_info_device_cloud", str);
    }

    private static List<pjb> b(JSONArray jSONArray) {
        LogUtil.a("ParesIndexAllUtils", "start getPathList");
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("ParesIndexAllUtils", "pathArray is no data");
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    LogUtil.j("ParesIndexAllUtils", "getPathList, jsonObject is null");
                } else {
                    pjb pjbVar = new pjb();
                    pjbVar.d(jSONObject.optString(BleConstants.KEY_PATH));
                    pjbVar.d(jSONObject.optInt("size"));
                    pjbVar.a(jSONObject.optString("digest"));
                    arrayList.add(pjbVar);
                }
            } catch (JSONException unused) {
                LogUtil.e("ParesIndexAllUtils", "getPathList JSONException");
            }
        }
        LogUtil.a("ParesIndexAllUtils", "resourceList size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static List<piv> d(JSONObject jSONObject) {
        LogUtil.a("ParesIndexAllUtils", "start setKindList");
        ArrayList arrayList = new ArrayList(16);
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setKindList, jsonObject is empty");
            return arrayList;
        }
        try {
            if (!jSONObject.isNull(DeviceCategoryFragment.DEVICE_KIND)) {
                JSONArray jSONArray = jSONObject.getJSONArray(DeviceCategoryFragment.DEVICE_KIND);
                for (int i = 0; i < jSONArray.length(); i++) {
                    piv pivVar = new piv();
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("kind_name");
                    pivVar.b(strOptString);
                    String strOptString2 = jSONObject2.optString("kind_id");
                    pivVar.c(strOptString2);
                    String string = jSONObject2.getString("resource_site");
                    pivVar.e(string);
                    List<pjc> listB = b(jSONObject2.getJSONArray("device_list"), strOptString2, strOptString, string);
                    if (listB.isEmpty()) {
                        LogUtil.j("ParesIndexAllUtils", "setKindList, kindName: ", strOptString, " device info is empty");
                    } else {
                        pivVar.e(listB);
                        arrayList.add(pivVar);
                    }
                }
                return arrayList;
            }
            LogUtil.j("ParesIndexAllUtils", "start jsonObject.isNull(DevicePluginConstants.DEVICE_KIND)");
            return arrayList;
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "setKindList JSONException");
        }
    }

    private static List<pjc> b(JSONArray jSONArray, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.j("ParesIndexAllUtils", "getDeviceKindList, jsonArray is no data");
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                pjc pjcVar = new pjc();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    pjcVar.g(e(jSONObject));
                    d(pjcVar, jSONObject);
                    pjcVar.d(jSONObject.optInt("cloud_type"));
                    pjcVar.f(str);
                    pjcVar.i(str2);
                    String strOptString = jSONObject.optString("brand_name");
                    pjcVar.a(strOptString);
                    pjcVar.c(strOptString);
                    d(jSONObject, pjcVar);
                    String strOptString2 = jSONObject.optString("device_name");
                    pjcVar.g(strOptString2);
                    pjcVar.e(jSONObject.optString("device_description"));
                    b(pjcVar, jSONObject);
                    pjcVar.b(d(jSONObject.optInt("bluetooth_type")));
                    pjcVar.d(jSONObject.optString("bluetooth_match"));
                    pjcVar.j(jSONObject.optInt("jump_to_product_page"));
                    pjcVar.h(jSONObject.optInt("product_page"));
                    pjcVar.d(a(jSONObject));
                    pjcVar.l(jSONObject.optString("publish_mode"));
                    int iOptInt = jSONObject.optInt("support_all_scan");
                    if (iOptInt == 0) {
                        iOptInt = 1;
                    }
                    pjcVar.g(iOptInt);
                    c(str3, pjcVar, jSONObject, strOptString2);
                    arrayList.add(pjcVar);
                }
            } catch (JSONException unused) {
                LogUtil.e("ParesIndexAllUtils", "getDeviceList JSONException");
            }
        }
        return arrayList;
    }

    private static void c(String str, pjc pjcVar, JSONObject jSONObject, String str2) {
        int iOptInt = jSONObject.optInt("can_scan");
        if (iOptInt == 0) {
            iOptInt = 2;
        }
        pjcVar.e(iOptInt);
        a(pjcVar, jSONObject);
        c(jSONObject, pjcVar);
        pjcVar.f(jSONObject.optInt("is_aw70"));
        pjcVar.a(jSONObject.optInt("device_relationship"));
        pjcVar.n(str);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(AdShowExtras.DOWNLOAD_SOURCE);
        if (jSONObjectOptJSONObject != null) {
            LogUtil.a("ParesIndexAllUtils", "downloadSource device : ", str2);
            DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
            deviceDownloadSourceInfo.setSite(jSONObjectOptJSONObject.optInt("site"));
            deviceDownloadSourceInfo.setIndexName(jSONObjectOptJSONObject.optString("indexName"));
            deviceDownloadSourceInfo.setConfigurationPoint(jSONObjectOptJSONObject.optString("configurationPoint"));
            pjcVar.d(deviceDownloadSourceInfo);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ecology_profile");
        if (jSONObjectOptJSONObject2 != null) {
            LogUtil.a("ParesIndexAllUtils", "ecology device : ", str2);
            pjcVar.i(jSONObjectOptJSONObject2.optInt("ecology_type"));
            pjcVar.c(jSONObjectOptJSONObject2.optInt(PluginPayAdapter.DEVICE_CATEGORY));
            pjcVar.h(jSONObjectOptJSONObject2.optString("model"));
        }
        pjcVar.b(c(jSONObject));
        e(jSONObject, pjcVar);
        c(pjcVar);
    }

    private static List<DeviceFittingsBean> c(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(16);
        if (!jSONObject.isNull("fittings")) {
            LogUtil.a("ParesIndexAllUtils", "setDeviceFittings entry");
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("fittings");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 == null) {
                        LogUtil.j("ParesIndexAllUtils", "setDeviceFittings fittingsJsonObject is null");
                    } else {
                        DeviceFittingsBean deviceFittingsBean = new DeviceFittingsBean(null);
                        deviceFittingsBean.setBluetoothMatch(jSONObject2.optString("bluetooth_match"));
                        deviceFittingsBean.setBluetoothNameList(a(jSONObject2));
                        deviceFittingsBean.setUuidList(e(jSONObject2));
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(AdShowExtras.DOWNLOAD_SOURCE);
                        if (jSONObjectOptJSONObject != null) {
                            DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
                            deviceDownloadSourceInfo.setSite(jSONObjectOptJSONObject.optInt("site"));
                            deviceDownloadSourceInfo.setIndexName(jSONObjectOptJSONObject.optString("indexName"));
                            deviceDownloadSourceInfo.setConfigurationPoint(jSONObjectOptJSONObject.optString("configurationPoint"));
                            deviceFittingsBean.setDeviceDownloadSourceInfo(deviceDownloadSourceInfo);
                        } else {
                            LogUtil.a("ParesIndexAllUtils", "setDeviceFittings downloadSource null");
                        }
                        arrayList.add(deviceFittingsBean);
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("ParesIndexAllUtils", "setDeviceFittings is JSONException");
            }
        }
        return arrayList;
    }

    private static void e(JSONObject jSONObject, pjc pjcVar) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("device_detail");
            if (jSONArray == null) {
                LogUtil.j("ParesIndexAllUtils", "setDeviceDetails deviceDetailArray is null");
                return;
            }
            List<String> listS = pjcVar.s();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                piy piyVar = new piy();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                piyVar.d(jSONObject2.getString("uuid"));
                listS.add(piyVar.c());
                piyVar.e(jSONObject2.getString("digest"));
                piyVar.a(jSONObject2.getString("version"));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("download_source_site");
                if (jSONObjectOptJSONObject == null) {
                    LogUtil.a("ParesIndexAllUtils", "setDeviceDetails downloadSource null");
                } else {
                    DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
                    deviceDownloadSourceInfo.setSite(jSONObjectOptJSONObject.optInt("site"));
                    deviceDownloadSourceInfo.setIndexName(jSONObjectOptJSONObject.optString("indexName"));
                    deviceDownloadSourceInfo.setConfigurationPoint(jSONObjectOptJSONObject.optString("configurationPoint"));
                    piyVar.c(deviceDownloadSourceInfo);
                }
                arrayList.add(piyVar);
            }
            pjcVar.a(arrayList);
            pjcVar.g(listS);
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "setDeviceDetails JSONException");
        }
    }

    private static void c(pjc pjcVar) {
        List<piy> listA = pjcVar.a();
        if (listA == null || listA.size() == 0) {
            LogUtil.a("ParesIndexAllUtils", "setEzPluginIndexInfos devicePluginInfo is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            phz phzVar = new phz();
            phzVar.b(listA.get(i).c());
            phzVar.e(listA.get(i).d());
            phzVar.c(listA.get(i).e());
            phzVar.d(listA.get(i).a());
            d(pjcVar, phzVar);
            phzVar.j(pjcVar.l());
            phzVar.e(pjcVar.c());
            arrayList.add(phzVar);
        }
        pjcVar.e(arrayList);
    }

    private static void d(pjc pjcVar, phz phzVar) {
        if (pjcVar.n().equals("wear_watch")) {
            phzVar.i("SMART_WATCH");
        } else if (pjcVar.n().equals("wear_band") || pjcVar.n().toUpperCase(Locale.ENGLISH).equals("SPORTS_GENIE")) {
            phzVar.i("SMART_BAND");
        } else {
            phzVar.i(pjcVar.n());
        }
    }

    private static void d(JSONObject jSONObject, pjc pjcVar) {
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setOtherBand jsonObject is null");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!jSONObject.isNull("brand_config")) {
                JSONArray jSONArray = jSONObject.getJSONArray("brand_config");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    pix pixVar = new pix();
                    if (!jSONObject2.isNull("country")) {
                        List<String> listAsList = Arrays.asList(jSONObject2.getString("country").split(";"));
                        if (!njy.e(listAsList)) {
                            pixVar.b(listAsList);
                            if (!jSONObject2.isNull("brand_name")) {
                                pixVar.e(jSONObject2.getString("brand_name"));
                                arrayList.add(pixVar);
                            }
                        }
                    }
                }
            }
            pjcVar.c(arrayList);
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "setOtherBand JSONException");
        }
    }

    private static List<String> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setUuidList, jsonObject is empty");
            return arrayList;
        }
        try {
            if (!jSONObject.isNull("bluetooth_name")) {
                JSONArray jSONArray = jSONObject.getJSONArray("bluetooth_name");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "set uuid list is exception");
        }
        return arrayList;
    }

    private static void c(JSONObject jSONObject, pjc pjcVar) {
        String str;
        String string;
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "getPublishVersion, jsonObject is null");
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
                    LogUtil.e("ParesIndexAllUtils", "getPublishVersion JSONException");
                    string = string2;
                    string2 = str;
                }
            }
        } catch (JSONException unused2) {
            str = null;
        }
        if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
            LogUtil.j("ParesIndexAllUtils", "publicVersion parameters not configured.");
        } else {
            if (!TextUtils.isEmpty(string2)) {
                map.put("domestic", string2);
            }
            if (!TextUtils.isEmpty(string)) {
                map.put("overseas", string);
            }
        }
        pjcVar.b(map);
    }

    private static void b(pjc pjcVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setImagePath, json object is null");
            return;
        }
        pjcVar.j(d(jSONObject.optString("icon")));
        String strOptString = jSONObject.optString("icon_backup");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        pjcVar.b(d(strOptString));
    }

    private static void a(pjc pjcVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setPairGuid, json object is null");
            return;
        }
        String strOptString = jSONObject.optString("pair_guide");
        pjcVar.o(strOptString);
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
                LogUtil.e("ParesIndexAllUtils", "setPairGuid json exception");
            }
            pjcVar.d(map);
        }
    }

    private static void d(pjc pjcVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setPrivacyImagePaths, jsonObject is empty");
            return;
        }
        try {
            if (jSONObject.isNull("privacy_image")) {
                return;
            }
            HashMap map = new HashMap(16);
            JSONObject jSONObject2 = jSONObject.getJSONObject("privacy_image");
            LogUtil.j("ParesIndexAllUtils", "jsonMap is ", jSONObject2.toString());
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String strValueOf = String.valueOf(itKeys.next());
                map.put(strValueOf, d(jSONObject2.optString(strValueOf)));
            }
            pjcVar.c(map);
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "set privacyImagePaths is exception");
        }
    }

    private static List<String> e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONObject == null) {
            LogUtil.j("ParesIndexAllUtils", "setUuidList, jsonObject is empty");
            return arrayList;
        }
        try {
            if (!jSONObject.isNull("uuid")) {
                JSONArray jSONArray = jSONObject.getJSONArray("uuid");
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.j("ParesIndexAllUtils", "uuid is null");
                    } else {
                        arrayList.add(string);
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ParesIndexAllUtils", "set uuid list is exception");
        }
        return arrayList;
    }

    private static String d(String str) {
        return (pir.a() + f45475c + File.separator + str) + ".webp";
    }
}
