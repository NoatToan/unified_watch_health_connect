package defpackage;

import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwcloudjs.a;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
class dlb {
    public static String d(File file) {
        if (file == null) {
            LogUtil.e("IndexParser", "readFileToData, file == null");
            return null;
        }
        LogUtil.b("IndexParser", "enter readFileToData: fileName = ", file.getName());
        if (!file.exists()) {
            LogUtil.e("IndexParser", "readFileToData, file not exist");
            return null;
        }
        try {
            return FileUtils.a(file, CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        } catch (IOException e) {
            LogUtil.e("IndexParser", "readFileToData, ex=", LogUtil.c(e));
            return "";
        }
    }

    public static dkw a(String str) {
        LogUtil.b("IndexParser", "parseIndexFile enter parseIndexFile:");
        dkw dkwVar = new dkw();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("IndexParser", "parseIndexFile indexJson is empty or null");
            return dkwVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("plugins")) {
                dkwVar.b(jSONObject.optString("version"));
                dkwVar.c(jSONObject.optString("updatedTime"));
                dkwVar.d(c(jSONObject.getJSONArray("plugins")));
                return dkwVar;
            }
            xjt.o("parseIndexFile plugins convert exception.");
            ReleaseLogUtil.c("R_IndexParser", "parseIndexFile plugins convert exception");
            return dkwVar;
        } catch (JSONException unused) {
            LogUtil.d("IndexParser", "parseIndexFile JSONException");
            return dkwVar;
        }
    }

    private static List<edx> c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.e("IndexParser", "parsePlugins jsonArrayPlugins is null or no data");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    LogUtil.e("IndexParser", "parsePlugins jsonObject is null.");
                } else {
                    a(jSONObject, arrayList);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parsePlugins JSONException");
            }
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, List<edx> list) throws JSONException {
        edx edxVar = new edx();
        d(jSONObject, edxVar);
        if (jSONObject.has("applyRules")) {
            e(edxVar, jSONObject);
        }
        if (jSONObject.has("wearkind") && !jSONObject.isNull("wearkind")) {
            edxVar.g(jSONObject.getString("wearkind"));
        }
        if (jSONObject.has("publish_mode") && !jSONObject.isNull("publish_mode")) {
            edxVar.f(jSONObject.getString("publish_mode"));
        }
        if (jSONObject.has(x2.PROTOCOL) && !jSONObject.isNull(x2.PROTOCOL)) {
            edxVar.i(jSONObject.getString(x2.PROTOCOL));
        }
        if (jSONObject.has("support_mode") && !jSONObject.isNull("support_mode")) {
            edxVar.j(jSONObject.getString("support_mode"));
        }
        if (jSONObject.has("publish_version") && !jSONObject.isNull("publish_version")) {
            c(edxVar, jSONObject);
        }
        if (jSONObject.has(AdShowExtras.DOWNLOAD_SOURCE) && !jSONObject.isNull(AdShowExtras.DOWNLOAD_SOURCE)) {
            a(edxVar, jSONObject.optJSONObject(AdShowExtras.DOWNLOAD_SOURCE));
        }
        if (jSONObject.has("oobe")) {
            edxVar.h(jSONObject.getString("oobe"));
        }
        list.add(edxVar);
    }

    private static void d(JSONObject jSONObject, edx edxVar) throws JSONException {
        if (!jSONObject.isNull("uuid")) {
            edxVar.e(jSONObject.getString("uuid"));
        }
        if (!jSONObject.isNull("version")) {
            edxVar.b(jSONObject.getString("version"));
        }
        if (!jSONObject.isNull("digest")) {
            edxVar.d(jSONObject.getString("digest"));
        }
        if (!jSONObject.isNull("filename")) {
            edxVar.a(jSONObject.getString("filename"));
        }
        if (!jSONObject.isNull("fileSize")) {
            edxVar.e(CommonUtil.e(jSONObject.getString("fileSize"), 0));
        }
        if (!jSONObject.isNull("fileCount")) {
            edxVar.a(jSONObject.getLong("fileCount"));
        }
        if (jSONObject.isNull("descUrl")) {
            return;
        }
        edxVar.c(jSONObject.getString("descUrl"));
    }

    private static void e(edx edxVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.isNull("applyRules") || (jSONObject2 = jSONObject.getJSONObject("applyRules")) == null) {
            return;
        }
        edw edwVar = new edw();
        if (jSONObject2.has("minAppVersion")) {
            edwVar.b(jSONObject2.getString("minAppVersion"));
        }
        if (jSONObject2.has("minIndexVersion")) {
            edwVar.a(jSONObject2.getString("minIndexVersion"));
        }
        edxVar.c(edwVar);
    }

    public static edl b(String str) {
        edl edlVar = new edl();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("IndexParser", "parseDescJsonFile descriptionJson is empty or null");
            return edlVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            edlVar.c(jSONObject.optString("form"));
            edlVar.i(jSONObject.optString("updatedTime"));
            edlVar.g(jSONObject.optString("uuid"));
            edlVar.h(jSONObject.optString("version"));
            a(edlVar, jSONObject);
            b(edlVar, jSONObject);
            e(edlVar, jSONObject);
            edlVar.a(CommonUtil.e(jSONObject.optString("fileSize"), 0));
            edlVar.b(jSONObject.optString("filename"));
            edlVar.a(jSONObject.optString("fileType"));
            edlVar.d(jSONObject.optString("digest"));
            d(edlVar, jSONObject);
            c(edlVar, jSONObject);
            return edlVar;
        } catch (JSONException unused) {
            LogUtil.d("IndexParser", "parseDescJsonFile JSONException");
            return edlVar;
        }
    }

    private static void a(edl edlVar, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("name");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    String string = jSONObject2.getString("en_us");
                    edlVar.j(jSONObject2.getString("en_us"));
                    LogUtil.c("IndexParser", "parsePluginName name_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("IndexParser", "parsePluginName name_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parsePluginName JSONException");
            }
        }
    }

    private static void e(edl edlVar, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("description");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    String string = jSONObject2.getString("en_us");
                    edlVar.e(string);
                    LogUtil.c("IndexParser", "parsePluginAuthorization description_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("IndexParser", "parsePluginAuthorization description_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parsePluginAuthorization JSONException");
            }
        }
    }

    private static void b(edl edlVar, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("authorization");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("permissions");
        if (jSONArrayOptJSONArray != null) {
            LogUtil.c("IndexParser", "parsePluginDescription jsonArrayPermissions = ", jSONArrayOptJSONArray);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("prompt");
        if (jSONArrayOptJSONArray2 == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    String string = jSONObject2.getString("en_us");
                    edlVar.f(string);
                    LogUtil.c("IndexParser", "parsePluginDescription authorization_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("IndexParser", "parsePluginDescription authorization_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parsePluginDescription JSONException");
            }
        }
    }

    private static void c(edl edlVar, JSONObject jSONObject) throws JSONException {
        edy edyVarC;
        if (!jSONObject.has("userLicenseInfo")) {
            LogUtil.d("IndexParser", "parseUserLicenseInfoList , JSON does not have the userLicenseInfo tag ");
            return;
        }
        LogUtil.d("IndexParser", "parseUserLicenseInfoList. has userLicenseInfo");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userLicenseInfo");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.d("IndexParser", "parseUserLicenseInfoList , userLicenseJsonArray is null or empty ");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayOptJSONArray.get(i);
            if ((obj instanceof JSONObject) && (edyVarC = c((JSONObject) obj)) != null) {
                LogUtil.b("IndexParser", "parseUserLicenseInfoList userLicenseInfo :", edyVarC.toString());
                arrayList.add(edyVarC);
            }
        }
        edlVar.c(arrayList);
    }

    private static edy c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        edy edyVar = new edy();
        if (jSONObject.has("url")) {
            edyVar.a(jSONObject.optString("url"));
        }
        if (jSONObject.has("user_license_name")) {
            edyVar.e(jSONObject.optString("user_license_name"));
        }
        if (jSONObject.has("productDeviceId")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productDeviceId");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                LogUtil.b("IndexParser", "parseUserLicenseInfo deviceIdJsonArray is null or empty");
            } else {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArrayOptJSONArray.get(i);
                    if (obj instanceof String) {
                        String str = (String) obj;
                        LogUtil.b("IndexParser", "parseUserLicenseInfo deviceId :", str);
                        arrayList.add(str);
                    }
                }
                edyVar.d(arrayList);
                return edyVar;
            }
        }
        return edyVar;
    }

    private static void d(edl edlVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("wear_device_info")) {
            edz edzVar = new edz();
            JSONObject jSONObject2 = jSONObject.getJSONObject("wear_device_info");
            b(edlVar, edzVar, jSONObject2);
            e(edzVar, jSONObject2);
            k(edzVar, jSONObject2);
            d(edzVar, jSONObject2);
            i(edzVar, jSONObject2);
            h(edzVar, jSONObject2);
            j(edzVar, jSONObject2);
            b(edzVar, jSONObject2);
            c(edzVar, jSONObject2);
            a(edzVar, jSONObject2);
            r(edzVar, jSONObject2);
            c(edlVar, edzVar, jSONObject2);
            a(edlVar, edzVar, jSONObject2);
            n(edzVar, jSONObject2);
            q(edzVar, jSONObject2);
            edlVar.d(edzVar);
            LogUtil.b("IndexParser", "parseWearDeviceInfo deviceInfo :", edzVar.toString());
        }
    }

    private static void q(edz edzVar, JSONObject jSONObject) throws JSONException {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseWearFunctionSupport param is null.");
            return;
        }
        if (jSONObject.has("help_support")) {
            edzVar.e(jSONObject.getBoolean("help_support"));
        }
        if (jSONObject.has("hotline_support")) {
            edzVar.j(jSONObject.getBoolean("hotline_support"));
        }
        if (jSONObject.has("huafen_support")) {
            edzVar.g(jSONObject.getBoolean("huafen_support"));
        }
    }

    private static void n(edz edzVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("IndexParser", "parseWearDeviceEarphoneInfo enter");
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseWearDeviceEarphoneInfo param is null.");
            return;
        }
        if (jSONObject.has("earphone_find_uri")) {
            edzVar.w(jSONObject.getString("earphone_find_uri"));
        }
        if (jSONObject.has("earphone_product_id")) {
            edzVar.ac(jSONObject.getString("earphone_product_id"));
        }
    }

    private static void a(edl edlVar, edz edzVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("IndexParser", "parseWearDevicePairGuide enter");
        if (edlVar == null || edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseWearDevicePairGuide param is null.");
            return;
        }
        if (!jSONObject.has("pair_guide_steps")) {
            LogUtil.e("IndexParser", "WEAR_DEVICE_PAIR_GUIDE_STEPS has no this key.");
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("pair_guide_steps");
        if (jSONObject2.has("pair_guide_steps_description")) {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("pair_guide_steps_description");
            LogUtil.b("IndexParser", "pairGuideDescArray param has WEAR_DEVICE_PAIR_GUIDE_STEPS_DESC_KEY.");
            if (jSONArrayOptJSONArray == null) {
                LogUtil.e("IndexParser", "pairGuideDescArray param is null.");
                return;
            } else {
                List<String> listC = c(edlVar, jSONArrayOptJSONArray);
                if (listC instanceof ArrayList) {
                    edzVar.l((ArrayList<String>) listC);
                }
            }
        }
        if (jSONObject2.has("pair_guide_steps_img")) {
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("pair_guide_steps_img");
            if (jSONArrayOptJSONArray2 == null) {
                LogUtil.b("IndexParser", "pairGuideImgArray param is null.");
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>(jSONArrayOptJSONArray2.length());
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray2.optString(i));
            }
            LogUtil.b("IndexParser", "guideImgList param is :", arrayList.toString());
            edzVar.n(arrayList);
        }
    }

    private static List<String> c(edl edlVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            List<String> listD = dkz.d(jSONArray.optString(i), edlVar);
            if (listD != null && !listD.isEmpty()) {
                arrayList.add(listD.get(0));
            }
        }
        LogUtil.b("IndexParser", "guideDescList param is :", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static void r(edz edzVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("IndexParser", "parseWearDeviceProductInfo enter");
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseWearDeviceInfoModelImage param is null.");
            return;
        }
        LogUtil.c("IndexParser", "parseWearDeviceProductInfo wearObject:", jSONObject.toString());
        if (jSONObject.has(a.d)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(a.d);
            LogUtil.b("IndexParser", "parseWearDeviceProductInfo productObject:", jSONObject2.toString());
            edzVar.d(jSONObject2.toString());
            if (jSONObject2.has("product_default")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("product_default");
                if (jSONObject3.has("entry_image_sku")) {
                    c(edzVar, jSONObject3, "entry_image_sku");
                }
                if (jSONObject3.has("home_background_image_sku")) {
                    c(edzVar, jSONObject3, "home_background_image_sku");
                }
                if (jSONObject3.has("ota_background_image_sku")) {
                    c(edzVar, jSONObject3, "ota_background_image_sku");
                }
                if (jSONObject3.has("disconnect_background_image_sku")) {
                    c(edzVar, jSONObject3, "disconnect_background_image_sku");
                }
                if (jSONObject3.has("ear_muff_install")) {
                    c(edzVar, jSONObject3, "ear_muff_install");
                }
                if (jSONObject3.has("ear_muff_removal")) {
                    LogUtil.b("IndexParser", "defaultObject.has(DownloadResourceConstants.ERA_MUFF_REMOVAL)");
                    c(edzVar, jSONObject3, "ear_muff_removal");
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.b("IndexParser", "parseWearDeviceProductInfo wearObject no product key");
    }

    private static void c(edl edlVar, edz edzVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("IndexParser", "parseWearDeviceUserGuide enter");
        if (edlVar == null || edzVar == null || jSONObject == null) {
            LogUtil.b("IndexParser", "parseWearDeviceUserGuide param is null.");
            return;
        }
        if (jSONObject.has("user_guide")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("user_guide");
            LogUtil.b("IndexParser", "userGuideLineObject.has(DownloadResourceConstants.WEAR_DEVICE_USER_GUIDE_LINE_KEY)");
            if (jSONObject2.has("guide_data")) {
                c(edlVar, edzVar, jSONObject2.optJSONArray("guide_data"));
            }
            if (jSONObject2.has("guide_frame")) {
                edzVar.f(jSONObject2.optInt("guide_frame"));
            }
            if (jSONObject2.has("is_text_center")) {
                int iOptInt = jSONObject2.optInt("is_text_center");
                LogUtil.b("IndexParser", "userGuideLineObject has WEAR_DEVICE_TEXT_CENTER: ", Integer.valueOf(iOptInt));
                edzVar.i(iOptInt);
            }
            if (jSONObject2.has("design_guide_data")) {
                d(edlVar, edzVar, jSONObject2.optJSONArray("design_guide_data"));
            }
            if (jSONObject2.has("xiao_yi_guide_data")) {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("xiao_yi_guide_data");
                LogUtil.b("IndexParser", "userGuideLineObject has WEAR_DEVICE_XIAO_YI_GUIDE: ", jSONArrayOptJSONArray);
                b(edlVar, edzVar, jSONArrayOptJSONArray);
            }
        }
    }

    private static void d(edl edlVar, edz edzVar, JSONArray jSONArray) throws JSONException {
        LogUtil.b("IndexParser", "enter parseDesignGuideData");
        if (jSONArray == null) {
            LogUtil.b("IndexParser", "parseDesignGuideData param is null.");
        } else {
            edzVar.e(a(edlVar, jSONArray));
        }
    }

    private static void b(edl edlVar, edz edzVar, JSONArray jSONArray) throws JSONException {
        LogUtil.b("IndexParser", "enter parseXiaoYiGuideData");
        if (jSONArray == null) {
            LogUtil.b("IndexParser", "parseXiaoYiGuideData param is null.");
        } else {
            edzVar.m(a(edlVar, jSONArray));
        }
    }

    private static void c(edl edlVar, edz edzVar, JSONArray jSONArray) throws JSONException {
        LogUtil.b("IndexParser", "enter parseUserGuideData");
        if (jSONArray == null) {
            LogUtil.b("IndexParser", "parseUserGuideData param is null.");
        } else {
            edzVar.o(a(edlVar, jSONArray));
        }
    }

    private static ArrayList<edr> a(edl edlVar, JSONArray jSONArray) throws JSONException {
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray2;
        ArrayList<edr> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            edr edrVar = new edr();
            a(edrVar, edlVar, jSONObjectOptJSONObject);
            if (jSONObjectOptJSONObject.has("guide_description_list") && (jSONArray2 = jSONObjectOptJSONObject.getJSONArray("guide_description_list")) != null) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    List<String> listD = dkz.d(jSONArray2.getString(i2), edlVar);
                    if (listD.size() > 0) {
                        arrayList2.add(listD.get(0));
                    }
                }
                edrVar.b(arrayList2);
            }
            if (jSONObjectOptJSONObject.has("guide_image") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("guide_image")) != null) {
                ArrayList<String> arrayList3 = new ArrayList<>(jSONArrayOptJSONArray.length());
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    arrayList3.add(jSONArrayOptJSONArray.optString(i3));
                }
                edrVar.d(arrayList3);
            }
            if (jSONObjectOptJSONObject.has("design_guide_hiLinkDeviceId") && (strOptString = jSONObjectOptJSONObject.optString("design_guide_hiLinkDeviceId")) != null) {
                edrVar.c(strOptString);
            }
            arrayList.add(edrVar);
        }
        return arrayList;
    }

    private static void a(edr edrVar, edl edlVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("IndexParser", "enter parseUserGuidLineString");
        if (edlVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseUserGuidLineString param is null");
            return;
        }
        if (jSONObject.has("guide_title")) {
            List<String> listD = dkz.d(jSONObject.optString("guide_title"), edlVar);
            if (listD.size() > 0) {
                edrVar.e(listD.get(0));
            }
        }
        if (jSONObject.has("guide_description")) {
            List<String> listD2 = dkz.d(jSONObject.optString("guide_description"), edlVar);
            if (listD2.size() > 0) {
                edrVar.b(listD2.get(0));
            }
        }
    }

    private static void c(edz edzVar, JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        if (str.equals("entry_image_sku")) {
            edzVar.f(arrayList);
            return;
        }
        if (str.equals("home_background_image_sku")) {
            edzVar.d(arrayList);
            return;
        }
        if (str.equals("ota_background_image_sku")) {
            edzVar.k(arrayList);
            return;
        }
        if (str.equals("disconnect_background_image_sku")) {
            edzVar.h(arrayList);
            return;
        }
        if (str.equals("ear_muff_install")) {
            edzVar.j(arrayList);
        } else if (str.equals("ear_muff_removal")) {
            edzVar.i(arrayList);
        } else {
            LogUtil.e("IndexParser", "parseWearDeviceImageList else branch.");
        }
    }

    private static void b(edl edlVar, edz edzVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("entry_img")) {
            edzVar.ai(jSONObject.getString("entry_img"));
        }
        if (jSONObject.has("buy_url")) {
            edzVar.j(jSONObject.getString("buy_url"));
        }
        if (jSONObject.has("des_img")) {
            m(edzVar, jSONObject);
        }
        if (jSONObject.has("guide")) {
            o(edzVar, jSONObject);
        }
        if (jSONObject.has("home_img_new")) {
            edzVar.ab(jSONObject.getString("home_img_new"));
        }
        if (jSONObject.has("home_background_img")) {
            edzVar.ab(jSONObject.getString("home_background_img"));
        }
        if (jSONObject.has("home_background_power_img")) {
            edzVar.z(jSONObject.getString("home_background_power_img"));
        }
        if (jSONObject.has("update_img")) {
            edzVar.aq(jSONObject.getString("update_img"));
        }
        if (jSONObject.has("device_brand")) {
            edzVar.c(jSONObject.getString("device_brand"));
        }
        if (jSONObject.has("bluetooth_name")) {
            l(edzVar, jSONObject);
        }
        if (jSONObject.has("device_string")) {
            c(edzVar, edlVar, jSONObject.getJSONArray("device_string"));
        } else {
            edzVar.d(false);
        }
        if (jSONObject.has("esim_img")) {
            f(edzVar, jSONObject);
        }
        if (jSONObject.has("esim_operator_url")) {
            g(edzVar, jSONObject);
        }
        if (jSONObject.has("pair_img")) {
            LogUtil.b("IndexParser", "wearObject has pairImg ", jSONObject.getString("pair_img"));
            edzVar.aj(jSONObject.getString("pair_img"));
        }
    }

    private static void m(edz edzVar, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("des_img");
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        edzVar.b(arrayList);
    }

    private static void o(edz edzVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("guide");
        if (jSONObject2.has("guide_img")) {
            edzVar.aa(jSONObject2.getString("guide_img"));
        }
        if (jSONObject2.has("ani_img")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ani_img");
            ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
            edzVar.g(arrayList);
        }
        if (jSONObject2.has("background_img")) {
            edzVar.ad(jSONObject2.getString("background_img"));
        }
    }

    private static void f(edz edzVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("esim_img");
        if (jSONObject2.has("cmcc_install_guide_img")) {
            edzVar.i(jSONObject2.getString("cmcc_install_guide_img"));
        }
        if (jSONObject2.has("cmcc_open_guide_img")) {
            edzVar.n(jSONObject2.getString("cmcc_open_guide_img"));
        }
        if (jSONObject2.has("cmcc_install_guide_standalone_img")) {
            edzVar.f(jSONObject2.getString("cmcc_install_guide_standalone_img"));
        }
        if (jSONObject2.has("cucc_install_guide_img")) {
            edzVar.q(jSONObject2.getString("cucc_install_guide_img"));
        }
        if (jSONObject2.has("cucc_open_guide_img")) {
            edzVar.p(jSONObject2.getString("cucc_open_guide_img"));
        }
        if (jSONObject2.has("ctcc_install_guide_img")) {
            edzVar.o(jSONObject2.getString("ctcc_install_guide_img"));
        }
        if (jSONObject2.has("ctcc_open_guide_img")) {
            edzVar.m(jSONObject2.getString("ctcc_open_guide_img"));
        }
        if (jSONObject2.has("cmcc_install_guide_img_no_text")) {
            edzVar.g(jSONObject2.getString("cmcc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("cucc_install_guide_img_no_text")) {
            edzVar.t(jSONObject2.getString("cucc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("ctcc_install_guide_img_no_text")) {
            edzVar.l(jSONObject2.getString("ctcc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("operator_open_guide_img_no_text")) {
            edzVar.ae(jSONObject2.getString("operator_open_guide_img_no_text"));
        }
    }

    private static void g(edz edzVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("esim_operator_url");
        if (jSONObject2.has("cucc_operator_url")) {
            edzVar.v(jSONObject2.getString("cucc_operator_url"));
        }
        if (jSONObject2.has("ctcc_operator_url")) {
            edzVar.r(jSONObject2.getString("ctcc_operator_url"));
        }
        if (jSONObject2.has("cmcc_operator_standalone_url")) {
            edzVar.k(jSONObject2.getString("cmcc_operator_standalone_url"));
        }
        if (jSONObject2.has("cucc_operator_standalone_url")) {
            edzVar.u(jSONObject2.getString("cucc_operator_standalone_url"));
        }
        if (jSONObject2.has("ctcc_operator_standalone_url")) {
            edzVar.s(jSONObject2.getString("ctcc_operator_standalone_url"));
        }
    }

    private static void l(edz edzVar, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("bluetooth_name");
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        edzVar.a(arrayList);
    }

    private static void c(edz edzVar, edl edlVar, JSONArray jSONArray) throws JSONException {
        if (edzVar == null || edlVar == null || jSONArray == null) {
            LogUtil.e("IndexParser", "parseDescriptionDeviceString param is null");
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null) {
                a(edzVar, edlVar, string);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    private static void a(edz edzVar, edl edlVar, String str) throws JSONException {
        byte b2;
        str.hashCode();
        switch (str) {
            case "pairCompleteTips":
                b2 = 0;
                break;
            case "track_device_name":
                b2 = 1;
                break;
            case "description":
                b2 = 2;
                break;
            case "pair_guide":
                b2 = 3;
                break;
            case "briefDescription":
                b2 = 4;
                break;
            case "deviceName":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            d(edzVar, edlVar);
            return;
        }
        if (b2 == 1) {
            List<String> listD = dkz.d("track_device_name", edlVar);
            if (listD.size() > 0) {
                edzVar.ar(listD.get(0));
                return;
            }
            return;
        }
        if (b2 == 2) {
            List<String> listD2 = dkz.d("description", edlVar);
            if (listD2.size() > 0) {
                if (listD2 instanceof ArrayList) {
                    edzVar.c((ArrayList<String>) listD2);
                    return;
                } else {
                    edzVar.c(new ArrayList<>(listD2));
                    return;
                }
            }
            return;
        }
        if (b2 == 3) {
            List<String> listD3 = dkz.d("pair_guide", edlVar);
            if (listD3.size() > 0) {
                edzVar.al(listD3.get(0));
                return;
            }
            return;
        }
        if (b2 == 4) {
            List<String> listD4 = dkz.d("briefDescription", edlVar);
            if (listD4.size() > 0) {
                edzVar.b(listD4.get(0));
                return;
            }
            return;
        }
        if (b2 == 5) {
            List<String> listD5 = dkz.d("deviceName", edlVar);
            if (listD5.size() > 0) {
                edzVar.x(listD5.get(0));
                return;
            }
            return;
        }
        d(edzVar, edlVar, str);
    }

    private static void d(edz edzVar, edl edlVar, String str) {
        str.hashCode();
        if (str.equals("awakenDevice")) {
            List<String> listD = dkz.d("awakenDevice", edlVar);
            if (listD.size() > 0) {
                edzVar.e(listD.get(0));
            }
        }
    }

    private static void d(edz edzVar, edl edlVar) {
        List<String> listD = dkz.d("pairCompleteTips", edlVar);
        if (listD.size() > 0) {
            edzVar.an(listD.get(0));
        }
    }

    private static void e(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionAppVersion param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("direct_version");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        HashMap map = new HashMap(16);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                if (!jSONObject2.isNull("domestic")) {
                    i = jSONObject2.getInt("domestic");
                    LogUtil.c("IndexParser", "appVersionDomestic : ", Integer.valueOf(i));
                }
                if (!jSONObject2.isNull("overseas")) {
                    i2 = jSONObject2.getInt("overseas");
                    LogUtil.c("IndexParser", "appVersionOverseas : ", Integer.valueOf(i2));
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parseDescriptionAppVersion JSONException");
            }
        }
        if (i == -1 && i2 == -1) {
            LogUtil.b("IndexParser", "AppVersion parameters not configured.");
            return;
        }
        if (i != -1) {
            map.put("domestic", Integer.valueOf(i));
        }
        if (i2 != -1) {
            map.put("overseas", Integer.valueOf(i2));
        }
        edzVar.d(map);
    }

    private static void c(edx edxVar, JSONObject jSONObject) {
        if (edxVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parsePublishVersion param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("publish_version");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        HashMap map = new HashMap(16);
        String string = null;
        String string2 = null;
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("domestic")) {
                    string = jSONObject2.getString("domestic");
                    LogUtil.c("IndexParser", "publishVersionDomestic : ", string);
                }
                if (!jSONObject2.isNull("overseas")) {
                    string2 = jSONObject2.getString("overseas");
                    LogUtil.c("IndexParser", "publishVersionOverseas : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parsePublishVersion JSONException");
            }
        }
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            LogUtil.e("IndexParser", "publicVersion parameters not configured.");
            return;
        }
        if (!TextUtils.isEmpty(string)) {
            map.put("domestic", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            map.put("overseas", string2);
        }
        edxVar.a(map);
    }

    private static void a(edx edxVar, JSONObject jSONObject) {
        if (edxVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDownloadSource param is null");
            return;
        }
        DeviceDownloadSourceInfo deviceDownloadSourceInfo = new DeviceDownloadSourceInfo(null);
        if (jSONObject.has("site")) {
            deviceDownloadSourceInfo.setSite(jSONObject.optInt("site"));
        }
        if (jSONObject.has("configurationPoint")) {
            deviceDownloadSourceInfo.setConfigurationPoint(jSONObject.optString("configurationPoint"));
        }
        if (jSONObject.has("indexName")) {
            deviceDownloadSourceInfo.setIndexName(jSONObject.optString("indexName"));
        }
        edxVar.d(deviceDownloadSourceInfo);
    }

    private static void h(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseLegalInformation param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("legal_information");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.e("IndexParser", "parseLegalInformation jsonArrayLegalInformation is null");
            return;
        }
        HashMap map = new HashMap(16);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("user_agreement")) {
                    String string = jSONObject2.getString("user_agreement");
                    LogUtil.c("IndexParser", "legalUserAgreementUrl : ", string);
                    map.put("user_agreement", string);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parseHonorHelpUrl JSONException");
            }
        }
        if (map.isEmpty()) {
            return;
        }
        edzVar.a(map);
    }

    private static void i(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionHelpUrl param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("new_honor_help_url");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        HashMap map = new HashMap(16);
        String string = "";
        String string2 = "";
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    string = jSONObject2.getString("en_us");
                    LogUtil.c("IndexParser", "honorHelpUrl_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    string2 = jSONObject2.getString("zh_rCN");
                    LogUtil.c("IndexParser", "honorHelpUrl_zh_rCN : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parseHonorHelpUrl JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("IndexParser", "honorHelpUrlEnEnglish : ", string, " helpUrlEnChinese : ", string2);
            return;
        }
        map.put("en_us", string);
        map.put("zh_rCN", string2);
        edzVar.c(map);
    }

    private static void k(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseProductWearHomeBackground param is null");
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("product_wearhome_background");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.e("IndexParser", "parseProductWearHomeBackground productBackground is null");
            return;
        }
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            HashMap map2 = new HashMap();
            map.put(strOptString, map2);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strOptString);
            if (jSONObjectOptJSONObject2 != null) {
                map2.put(CervicalMucusRecord.Sensation.LIGHT, jSONObjectOptJSONObject2.optString(CervicalMucusRecord.Sensation.LIGHT, ""));
                map2.put("dark", jSONObjectOptJSONObject2.optString("dark", ""));
            }
        }
        edzVar.e(map);
    }

    private static void d(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionHelpUrl param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("help_url");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        HashMap map = new HashMap(16);
        String string = "";
        String string2 = "";
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    string = jSONObject2.getString("en_us");
                    LogUtil.c("IndexParser", "helpUrl_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    string2 = jSONObject2.getString("zh_rCN");
                    LogUtil.c("IndexParser", "helpUrl_zh_rCN : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parseDescriptionHelpUrl JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("IndexParser", "helpUrlEnEnglish : ", string, " helpUrlEnChinese : ", string2);
            return;
        }
        map.put("en_us", string);
        map.put("zh_rCN", string2);
        edzVar.b(map);
    }

    private static void j(edz edzVar, JSONObject jSONObject) {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionUpgradeCycle param is null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("upgrade_cycle");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        HashMap map = new HashMap(16);
        String string = "";
        String string2 = "";
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("upgrade_start")) {
                    string = jSONObject2.getString("upgrade_start");
                    LogUtil.c("IndexParser", "UpdateCycle_start : ", string);
                }
                if (!jSONObject2.isNull("upgrade_end")) {
                    string2 = jSONObject2.getString("upgrade_end");
                    LogUtil.c("IndexParser", "UpdateCycle_end : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("IndexParser", "parseDescriptionUpgradeCycle JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("IndexParser", "UpdateCycle_start : ", string, " UpdateCycle_end : ", string2);
            return;
        }
        map.put("upgrade_start", string);
        map.put("upgrade_end", string2);
        edzVar.h(map);
    }

    private static void b(edz edzVar, JSONObject jSONObject) throws JSONException {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionAllType param is null");
            return;
        }
        if (!jSONObject.has("hi_device_type")) {
            LogUtil.b("IndexParser", "parseDescriptionAllType not has hi_device_type");
        } else {
            edzVar.g(jSONObject.getInt("hi_device_type"));
        }
        if (jSONObject.has(DeviceCategoryFragment.DEVICE_TYPE)) {
            edzVar.c(jSONObject.getInt(DeviceCategoryFragment.DEVICE_TYPE));
        }
        if (jSONObject.has("aw70_period")) {
            edzVar.b(jSONObject.getInt("aw70_period"));
            LogUtil.b("IndexParser", "parseDescriptionAllType deviceInfo.getAw70Period() = ", Integer.valueOf(edzVar.b()));
        }
        if (jSONObject.has("package_name")) {
            edzVar.ah(jSONObject.getString("package_name"));
            LogUtil.b("IndexParser", "parseDescriptionAllType deviceInfo.getPackageName() = ", edzVar.bd());
        }
        if (jSONObject.has("bluetooth_type")) {
            edzVar.e(jSONObject.getInt("bluetooth_type"));
        }
        if (jSONObject.has("wear_type")) {
            edzVar.as(jSONObject.getString("wear_type"));
        }
        if (jSONObject.has(PluginPayAdapter.DEVICE_CATEGORY)) {
            edzVar.a(jSONObject.getInt(PluginPayAdapter.DEVICE_CATEGORY));
        }
        if (jSONObject.has("device_shapes")) {
            edzVar.d(jSONObject.getInt("device_shapes"));
        }
        if (jSONObject.has("is_porsche")) {
            edzVar.a(jSONObject.getBoolean("is_porsche"));
        }
        if (jSONObject.has("support_ear_muff_guide")) {
            edzVar.c(jSONObject.getBoolean("support_ear_muff_guide"));
        }
        if (jSONObject.has("device_relationship")) {
            edzVar.ak(jSONObject.getString("device_relationship"));
        }
    }

    private static void c(edz edzVar, JSONObject jSONObject) throws JSONException {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionSupportOrNot param is null");
            return;
        }
        if (jSONObject.has("br_and_ble")) {
            edzVar.b(jSONObject.getBoolean("br_and_ble"));
        }
        if (jSONObject.has("support_midware")) {
            edzVar.i(jSONObject.getBoolean("support_midware"));
        }
        if (jSONObject.has("wlan_anto_download")) {
            edzVar.j(jSONObject.getInt("wlan_anto_download"));
        }
        if (jSONObject.has("heart_rate_function")) {
            edzVar.h(jSONObject.getInt("heart_rate_function"));
        }
        if (jSONObject.has("pair_model_bt_name")) {
            edzVar.am(jSONObject.getString("pair_model_bt_name"));
        }
    }

    private static void a(edz edzVar, JSONObject jSONObject) throws JSONException {
        if (edzVar == null || jSONObject == null) {
            LogUtil.e("IndexParser", "parseDescriptionFunctionalField param is null");
            return;
        }
        if (jSONObject.has("nps_name")) {
            edzVar.ag(jSONObject.getString("nps_name"));
        }
        if (jSONObject.has("club_url")) {
            edzVar.h(jSONObject.getString("club_url"));
        }
        if (jSONObject.has("earphone_manager_uri")) {
            edzVar.y(jSONObject.getString("earphone_manager_uri"));
        }
        if (jSONObject.has("honor_club_url")) {
            edzVar.af(jSONObject.getString("honor_club_url"));
        }
        if (jSONObject.has("bi_name")) {
            edzVar.a(jSONObject.getString("bi_name"));
        }
        if (jSONObject.has("track_logo_image")) {
            edzVar.ap(jSONObject.getString("track_logo_image"));
        }
    }
}
