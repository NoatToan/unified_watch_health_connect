package defpackage;

import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwcloudjs.a;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class phw {
    public static String e(File file) {
        if (file == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "readFileToData, file == null");
            return null;
        }
        LogUtil.b("EzPlugin_EzPluginIndexParser", "enter readFileToData: fileName = ", file.getName());
        if (!file.exists()) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "readFileToData, file not exist");
            return null;
        }
        try {
            return FileUtils.a(file, CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        } catch (IOException e) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "readFileToData, ex=", LogUtil.c(e));
            return "";
        }
    }

    public static pio c(String str) {
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseIndexFile enter parseIndexFile:");
        pio pioVar = new pio();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseIndexFile indexJson is empty or null");
            return pioVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("plugins")) {
                pioVar.d(jSONObject.optString("version"));
                pioVar.c(jSONObject.optString("updatedTime"));
                pioVar.c(b(jSONObject.getJSONArray("plugins")));
                return pioVar;
            }
        } catch (JSONException unused) {
            LogUtil.d("EzPlugin_EzPluginIndexParser", "parseIndexFile JSONException");
        }
        return pioVar;
    }

    private static List<phz> b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parsePlugins jsonArrayPlugins is null or no data");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    LogUtil.e("EzPlugin_EzPluginIndexParser", "parsePlugins jsonObject is null.");
                } else {
                    a(jSONObject, arrayList);
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parsePlugins JSONException");
            }
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, List<phz> list) throws JSONException {
        phz phzVar = new phz();
        b(jSONObject, phzVar);
        if (jSONObject.has("applyRules")) {
            b(phzVar, jSONObject);
        }
        if (jSONObject.has("wearkind") && !jSONObject.isNull("wearkind")) {
            phzVar.i(jSONObject.getString("wearkind"));
        }
        if (jSONObject.has("publish_mode") && !jSONObject.isNull("publish_mode")) {
            phzVar.j(jSONObject.getString("publish_mode"));
        }
        if (jSONObject.has(x2.PROTOCOL) && !jSONObject.isNull(x2.PROTOCOL)) {
            phzVar.h(jSONObject.getString(x2.PROTOCOL));
        }
        if (jSONObject.has("support_mode") && !jSONObject.isNull("support_mode")) {
            phzVar.f(jSONObject.getString("support_mode"));
        }
        if (jSONObject.has("publish_version") && !jSONObject.isNull("publish_version")) {
            e(phzVar, jSONObject);
        }
        if (jSONObject.has(AdShowExtras.DOWNLOAD_SOURCE) && !jSONObject.isNull(AdShowExtras.DOWNLOAD_SOURCE)) {
            c(phzVar, jSONObject.optJSONObject(AdShowExtras.DOWNLOAD_SOURCE));
        }
        list.add(phzVar);
    }

    private static void b(JSONObject jSONObject, phz phzVar) throws JSONException {
        if (!jSONObject.isNull("uuid")) {
            phzVar.b(jSONObject.getString("uuid"));
        }
        if (!jSONObject.isNull("version")) {
            phzVar.c(jSONObject.getString("version"));
        }
        if (!jSONObject.isNull("digest")) {
            phzVar.e(jSONObject.getString("digest"));
        }
        if (!jSONObject.isNull("filename")) {
            phzVar.d(jSONObject.getString("filename"));
        }
        if (!jSONObject.isNull("fileSize")) {
            phzVar.c(CommonUtil.e(jSONObject.getString("fileSize"), 0));
        }
        if (!jSONObject.isNull("fileCount")) {
            phzVar.a(jSONObject.getLong("fileCount"));
        }
        if (jSONObject.isNull("descUrl")) {
            return;
        }
        phzVar.a(jSONObject.getString("descUrl"));
    }

    private static void b(phz phzVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.isNull("applyRules") || (jSONObject2 = jSONObject.getJSONObject("applyRules")) == null) {
            return;
        }
        pim pimVar = new pim();
        if (jSONObject2.has("minAppVersion")) {
            pimVar.c(jSONObject2.getString("minAppVersion"));
        }
        if (jSONObject2.has("minIndexVersion")) {
            pimVar.a(jSONObject2.getString("minIndexVersion"));
        }
        phzVar.d(pimVar);
    }

    public static pic a(String str) {
        pic picVar = new pic();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescJsonFile descriptionJson is empty or null");
            return picVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            picVar.a(jSONObject.optString("form"));
            picVar.i(jSONObject.optString("updatedTime"));
            picVar.f(jSONObject.optString("uuid"));
            picVar.g(jSONObject.optString("version"));
            d(picVar, jSONObject);
            a(picVar, jSONObject);
            c(picVar, jSONObject);
            picVar.b(CommonUtil.e(jSONObject.optString("fileSize"), 0));
            picVar.e(jSONObject.optString("filename"));
            picVar.b(jSONObject.optString("fileType"));
            picVar.d(jSONObject.optString("digest"));
            e(picVar, jSONObject);
            b(picVar, jSONObject);
            return picVar;
        } catch (JSONException unused) {
            LogUtil.d("EzPlugin_EzPluginIndexParser", "parseDescJsonFile JSONException");
            return picVar;
        }
    }

    private static void b(pic picVar, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customization");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseCustomizationInfo jsonObjectCustomization is null");
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("CMCC_AI");
        if (jSONObjectOptJSONObject2 == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseCustomizationInfo jsonObjectCmccAi is null");
            return;
        }
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseCustomizationInfo parse CMCC_AI");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("supportProduct");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseCustomizationInfo cmccProductArray is null");
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        phx phxVar = new phx();
        phx.d dVar = new phx.d();
        dVar.a(jSONObjectOptJSONObject2.optInt("entry"));
        dVar.e(jSONObjectOptJSONObject2.optString("CMCCProductId"));
        dVar.c(jSONObjectOptJSONObject2.optString("CMCCProductKey"));
        dVar.c(arrayList);
        phxVar.b(dVar);
        picVar.c(phxVar);
    }

    private static void d(pic picVar, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("name");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    String string = jSONObject2.getString("en_us");
                    picVar.j(jSONObject2.getString("en_us"));
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginName name_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginName name_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parsePluginName JSONException");
            }
        }
    }

    private static void c(pic picVar, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("description");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.isNull("en_us")) {
                    String string = jSONObject2.getString("en_us");
                    picVar.c(string);
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginAuthorization description_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginAuthorization description_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parsePluginAuthorization JSONException");
            }
        }
    }

    private static void a(pic picVar, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("authorization");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("permissions");
        if (jSONArrayOptJSONArray != null) {
            LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginDescription jsonArrayPermissions = ", jSONArrayOptJSONArray);
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
                    picVar.h(string);
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginDescription authorization_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "parsePluginDescription authorization_zh_rCN : ", jSONObject2.getString("zh_rCN"));
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parsePluginDescription JSONException");
            }
        }
    }

    private static void e(pic picVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("wear_device_info")) {
            phv phvVar = new phv();
            JSONObject jSONObject2 = jSONObject.getJSONObject("wear_device_info");
            b(picVar, phvVar, jSONObject2);
            b(phvVar, jSONObject2);
            e(phvVar, jSONObject2);
            h(phvVar, jSONObject2);
            f(phvVar, jSONObject2);
            a(phvVar, jSONObject2);
            d(phvVar, jSONObject2);
            c(phvVar, jSONObject2);
            m(phvVar, jSONObject2);
            a(picVar, phvVar, jSONObject2);
            e(picVar, phvVar, jSONObject2);
            picVar.a(phvVar);
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceInfo deviceInfo :", phvVar.toString());
        }
    }

    private static void e(pic picVar, phv phvVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDevicePairGuide enter");
        if (picVar == null || phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseWearDevicePairGuide param is null.");
            return;
        }
        if (!jSONObject.has("pair_guide_steps")) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "WEAR_DEVICE_PAIR_GUIDE_STEPS has no this key.");
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("pair_guide_steps");
        if (jSONObject2.has("pair_guide_steps_description")) {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("pair_guide_steps_description");
            LogUtil.b("EzPlugin_EzPluginIndexParser", "pairGuideDescArray param has WEAR_DEVICE_PAIR_GUIDE_STEPS_DESC_KEY.");
            if (jSONArrayOptJSONArray == null) {
                LogUtil.e("EzPlugin_EzPluginIndexParser", "pairGuideDescArray param is null.");
                return;
            } else {
                List<String> listA = a(picVar, jSONArrayOptJSONArray);
                if (listA instanceof ArrayList) {
                    phvVar.n((ArrayList<String>) listA);
                }
            }
        }
        if (jSONObject2.has("pair_guide_steps_img")) {
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("pair_guide_steps_img");
            if (jSONArrayOptJSONArray2 == null) {
                LogUtil.b("EzPlugin_EzPluginIndexParser", "pairGuideImgArray param is null.");
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>(jSONArrayOptJSONArray2.length());
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray2.optString(i));
            }
            LogUtil.b("EzPlugin_EzPluginIndexParser", "guideImgList param is :", arrayList.toString());
            phvVar.l(arrayList);
        }
    }

    private static List<String> a(pic picVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            List<String> listB = EzPluginManager.b(jSONArray.optString(i), picVar);
            if (listB != null && !listB.isEmpty()) {
                arrayList.add(listB.get(0));
            }
        }
        LogUtil.b("EzPlugin_EzPluginIndexParser", "guideDescList param is :", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static void m(phv phvVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceProductInfo enter");
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseWearDeviceInfoModelImage param is null.");
            return;
        }
        LogUtil.c("EzPlugin_EzPluginIndexParser", "parseWearDeviceProductInfo wearObject:", jSONObject.toString());
        if (jSONObject.has(a.d)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(a.d);
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceProductInfo productObject:", jSONObject2.toString());
            phvVar.b(jSONObject2.toString());
            if (jSONObject2.has("product_default")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("product_default");
                if (jSONObject3.has("entry_image_sku")) {
                    a(phvVar, jSONObject3, "entry_image_sku");
                }
                if (jSONObject3.has("home_background_image_sku")) {
                    a(phvVar, jSONObject3, "home_background_image_sku");
                }
                if (jSONObject3.has("ota_background_image_sku")) {
                    a(phvVar, jSONObject3, "ota_background_image_sku");
                }
                if (jSONObject3.has("disconnect_background_image_sku")) {
                    a(phvVar, jSONObject3, "disconnect_background_image_sku");
                }
                if (jSONObject3.has("ear_muff_install")) {
                    a(phvVar, jSONObject3, "ear_muff_install");
                }
                if (jSONObject3.has("ear_muff_removal")) {
                    LogUtil.b("EzPlugin_EzPluginIndexParser", "defaultObject.has(EzPluginConstants.ERA_MUFF_REMOVAL)");
                    a(phvVar, jSONObject3, "ear_muff_removal");
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceProductInfo wearObject no product key");
    }

    private static void a(pic picVar, phv phvVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceUserGuide enter");
        if (picVar == null || phvVar == null || jSONObject == null) {
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseWearDeviceUserGuide param is null.");
            return;
        }
        if (jSONObject.has("user_guide")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("user_guide");
            LogUtil.b("EzPlugin_EzPluginIndexParser", "userGuideLineObject.has(EzPluginConstants.WEAR_DEVICE_USER_GUIDE_LINE_KEY)");
            if (jSONObject2.has("guide_data")) {
                e(picVar, phvVar, jSONObject2.optJSONArray("guide_data"));
            }
        }
    }

    private static void e(pic picVar, phv phvVar, JSONArray jSONArray) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        LogUtil.b("EzPlugin_EzPluginIndexParser", "enter parseUserGuideData");
        if (jSONArray == null) {
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseUserGuideData param is null.");
            return;
        }
        ArrayList<pje> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            pje pjeVar = new pje();
            b(pjeVar, picVar, jSONObjectOptJSONObject);
            if (jSONObjectOptJSONObject.has("guide_image") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("guide_image")) != null) {
                LogUtil.b("EzPlugin_EzPluginIndexParser", "guide data has image");
                ArrayList<String> arrayList2 = new ArrayList<>(jSONArrayOptJSONArray.length());
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList2.add(jSONArrayOptJSONArray.optString(i2));
                }
                pjeVar.c(arrayList2);
            }
            arrayList.add(pjeVar);
        }
        phvVar.j(arrayList);
    }

    private static void b(pje pjeVar, pic picVar, JSONObject jSONObject) throws JSONException {
        LogUtil.b("EzPlugin_EzPluginIndexParser", "enter parseUserGuidLineString");
        if (picVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseUserGuidLineString param is null");
            return;
        }
        if (jSONObject.has("guide_title")) {
            List<String> listB = EzPluginManager.b(jSONObject.optString("guide_title"), picVar);
            if (listB.size() > 0) {
                pjeVar.b(listB.get(0));
            }
        }
        if (jSONObject.has("guide_description")) {
            List<String> listB2 = EzPluginManager.b(jSONObject.optString("guide_description"), picVar);
            if (listB2.size() > 0) {
                pjeVar.e(listB2.get(0));
            }
        }
    }

    private static void a(phv phvVar, JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        if (str.equals("entry_image_sku")) {
            phvVar.h(arrayList);
            return;
        }
        if (str.equals("home_background_image_sku")) {
            phvVar.d(arrayList);
            return;
        }
        if (str.equals("ota_background_image_sku")) {
            phvVar.m(arrayList);
            return;
        }
        if (str.equals("disconnect_background_image_sku")) {
            phvVar.c(arrayList);
            return;
        }
        if (str.equals("ear_muff_install")) {
            phvVar.g(arrayList);
        } else if (str.equals("ear_muff_removal")) {
            phvVar.f(arrayList);
        } else {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseWearDeviceImageList else branch.");
        }
    }

    private static void b(pic picVar, phv phvVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("entry_img")) {
            phvVar.u(jSONObject.getString("entry_img"));
        }
        if (jSONObject.has("buy_url")) {
            phvVar.g(jSONObject.getString("buy_url"));
        }
        if (jSONObject.has("des_img")) {
            o(phvVar, jSONObject);
        }
        if (jSONObject.has("guide")) {
            n(phvVar, jSONObject);
        }
        if (jSONObject.has("home_img_new")) {
            phvVar.w(jSONObject.getString("home_img_new"));
        }
        if (jSONObject.has("home_background_img")) {
            phvVar.w(jSONObject.getString("home_background_img"));
        }
        if (jSONObject.has("home_background_power_img")) {
            phvVar.v(jSONObject.getString("home_background_power_img"));
        }
        if (jSONObject.has("update_img")) {
            phvVar.ai(jSONObject.getString("update_img"));
        }
        if (jSONObject.has("device_brand")) {
            phvVar.e(jSONObject.getString("device_brand"));
        }
        if (jSONObject.has("bluetooth_name")) {
            g(phvVar, jSONObject);
        }
        if (jSONObject.has("device_string")) {
            b(phvVar, picVar, jSONObject.getJSONArray("device_string"));
        } else {
            phvVar.c(false);
        }
        if (jSONObject.has("esim_img")) {
            i(phvVar, jSONObject);
        }
        if (jSONObject.has("esim_operator_url")) {
            j(phvVar, jSONObject);
        }
    }

    private static void o(phv phvVar, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("des_img");
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        phvVar.e(arrayList);
    }

    private static void n(phv phvVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("guide");
        if (jSONObject2.has("guide_img")) {
            phvVar.y(jSONObject2.getString("guide_img"));
        }
        if (jSONObject2.has("ani_img")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ani_img");
            ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
            phvVar.i(arrayList);
        }
        if (jSONObject2.has("background_img")) {
            phvVar.q(jSONObject2.getString("background_img"));
        }
    }

    private static void i(phv phvVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("esim_img");
        if (jSONObject2.has("cmcc_install_guide_img")) {
            phvVar.j(jSONObject2.getString("cmcc_install_guide_img"));
        }
        if (jSONObject2.has("cmcc_open_guide_img")) {
            phvVar.f(jSONObject2.getString("cmcc_open_guide_img"));
        }
        if (jSONObject2.has("cucc_install_guide_img")) {
            phvVar.n(jSONObject2.getString("cucc_install_guide_img"));
        }
        if (jSONObject2.has("cucc_open_guide_img")) {
            phvVar.t(jSONObject2.getString("cucc_open_guide_img"));
        }
        if (jSONObject2.has("ctcc_install_guide_img")) {
            phvVar.o(jSONObject2.getString("ctcc_install_guide_img"));
        }
        if (jSONObject2.has("ctcc_open_guide_img")) {
            phvVar.l(jSONObject2.getString("ctcc_open_guide_img"));
        }
        if (jSONObject2.has("cmcc_install_guide_img_no_text")) {
            phvVar.i(jSONObject2.getString("cmcc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("cucc_install_guide_img_no_text")) {
            phvVar.p(jSONObject2.getString("cucc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("ctcc_install_guide_img_no_text")) {
            phvVar.k(jSONObject2.getString("ctcc_install_guide_img_no_text"));
        }
        if (jSONObject2.has("operator_open_guide_img_no_text")) {
            phvVar.ab(jSONObject2.getString("operator_open_guide_img_no_text"));
        }
    }

    private static void j(phv phvVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("esim_operator_url");
        if (jSONObject2.has("cucc_operator_url")) {
            phvVar.r(jSONObject2.getString("cucc_operator_url"));
        }
        if (jSONObject2.has("ctcc_operator_url")) {
            phvVar.m(jSONObject2.getString("ctcc_operator_url"));
        }
    }

    private static void g(phv phvVar, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("bluetooth_name");
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        phvVar.a(arrayList);
    }

    private static void b(phv phvVar, pic picVar, JSONArray jSONArray) throws JSONException {
        if (phvVar == null || picVar == null || jSONArray == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionDeviceString param is null");
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null) {
                d(phvVar, picVar, string);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    private static void d(phv phvVar, pic picVar, String str) throws JSONException {
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
            c(phvVar, picVar);
            return;
        }
        if (b2 == 1) {
            List<String> listB = EzPluginManager.b("track_device_name", picVar);
            if (listB.size() > 0) {
                phvVar.af(listB.get(0));
                return;
            }
            return;
        }
        if (b2 == 2) {
            List<String> listB2 = EzPluginManager.b("description", picVar);
            if (listB2.size() > 0) {
                if (listB2 instanceof ArrayList) {
                    phvVar.b((ArrayList<String>) listB2);
                    return;
                } else {
                    phvVar.b(new ArrayList<>(listB2));
                    return;
                }
            }
            return;
        }
        if (b2 == 3) {
            List<String> listB3 = EzPluginManager.b("pair_guide", picVar);
            if (listB3.size() > 0) {
                phvVar.ad(listB3.get(0));
                return;
            }
            return;
        }
        if (b2 == 4) {
            List<String> listB4 = EzPluginManager.b("briefDescription", picVar);
            if (listB4.size() > 0) {
                phvVar.d(listB4.get(0));
                return;
            }
            return;
        }
        if (b2 == 5) {
            List<String> listB5 = EzPluginManager.b("deviceName", picVar);
            if (listB5.size() > 0) {
                phvVar.s(listB5.get(0));
                return;
            }
            return;
        }
        a(phvVar, picVar, str);
    }

    private static void a(phv phvVar, pic picVar, String str) {
        str.hashCode();
        if (str.equals("awakenDevice")) {
            List<String> listB = EzPluginManager.b("awakenDevice", picVar);
            if (listB.size() > 0) {
                phvVar.c(listB.get(0));
            }
        }
    }

    private static void c(phv phvVar, pic picVar) {
        List<String> listB = EzPluginManager.b("pairCompleteTips", picVar);
        if (listB.size() > 0) {
            phvVar.z(listB.get(0));
        }
    }

    private static void b(phv phvVar, JSONObject jSONObject) {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionAppVersion param is null");
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
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "appVersionDomestic : ", Integer.valueOf(i));
                }
                if (!jSONObject2.isNull("overseas")) {
                    i2 = jSONObject2.getInt("overseas");
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "appVersionOverseas : ", Integer.valueOf(i2));
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parseDescriptionAppVersion JSONException");
            }
        }
        if (i == -1 && i2 == -1) {
            LogUtil.b("EzPlugin_EzPluginIndexParser", "AppVersion parameters not configured.");
            return;
        }
        if (i != -1) {
            map.put("domestic", Integer.valueOf(i));
        }
        if (i2 != -1) {
            map.put("overseas", Integer.valueOf(i2));
        }
        phvVar.b(map);
    }

    private static void e(phz phzVar, JSONObject jSONObject) {
        if (phzVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parsePublishVersion param is null");
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
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "publishVersionDomestic : ", string);
                }
                if (!jSONObject2.isNull("overseas")) {
                    string2 = jSONObject2.getString("overseas");
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "publishVersionOverseas : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parsePublishVersion JSONException");
            }
        }
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "publicVersion parameters not configured.");
            return;
        }
        if (!TextUtils.isEmpty(string)) {
            map.put("domestic", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            map.put("overseas", string2);
        }
        phzVar.e(map);
    }

    private static void c(phz phzVar, JSONObject jSONObject) {
        if (phzVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDownloadSource param is null");
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
        phzVar.d(deviceDownloadSourceInfo);
    }

    private static void h(phv phvVar, JSONObject jSONObject) {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionHelpUrl param is null");
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
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "honorHelpUrl_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    string2 = jSONObject2.getString("zh_rCN");
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "honorHelpUrl_zh_rCN : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parseHonorHelpUrl JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "honorHelpUrlEnEnglish : ", string, " helpUrlEnChinese : ", string2);
            return;
        }
        map.put("en_us", string);
        map.put("zh_rCN", string2);
        phvVar.d(map);
    }

    private static void e(phv phvVar, JSONObject jSONObject) {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionHelpUrl param is null");
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
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "helpUrl_enUs : ", string);
                }
                if (!jSONObject2.isNull("zh_rCN")) {
                    string2 = jSONObject2.getString("zh_rCN");
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "helpUrl_zh_rCN : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parseDescriptionHelpUrl JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "helpUrlEnEnglish : ", string, " helpUrlEnChinese : ", string2);
            return;
        }
        map.put("en_us", string);
        map.put("zh_rCN", string2);
        phvVar.c(map);
    }

    private static void f(phv phvVar, JSONObject jSONObject) {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionUpgradeCycle param is null");
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
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "UpdateCycle_start : ", string);
                }
                if (!jSONObject2.isNull("upgrade_end")) {
                    string2 = jSONObject2.getString("upgrade_end");
                    LogUtil.c("EzPlugin_EzPluginIndexParser", "UpdateCycle_end : ", string2);
                }
            } catch (JSONException unused) {
                LogUtil.d("EzPlugin_EzPluginIndexParser", "parseDescriptionUpgradeCycle JSONException");
            }
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "UpdateCycle_start : ", string, " UpdateCycle_end : ", string2);
            return;
        }
        map.put("upgrade_start", string);
        map.put("upgrade_end", string2);
        phvVar.a(map);
    }

    private static void a(phv phvVar, JSONObject jSONObject) throws JSONException {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionAllType param is null");
            return;
        }
        LogUtil.b("EzPlugin_EzPluginIndexParser", "parseDescriptionAllType wearObject:", jSONObject.toString());
        if (!jSONObject.has("hi_device_type")) {
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseDescriptionAllType not has hi_device_type");
        } else {
            phvVar.g(jSONObject.getInt("hi_device_type"));
        }
        if (jSONObject.has(DeviceCategoryFragment.DEVICE_TYPE)) {
            phvVar.c(jSONObject.getInt(DeviceCategoryFragment.DEVICE_TYPE));
        }
        if (jSONObject.has("aw70_period")) {
            phvVar.d(jSONObject.getInt("aw70_period"));
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseDescriptionAllType deviceInfo.getAw70Period() = ", Integer.valueOf(phvVar.a()));
        }
        if (jSONObject.has("package_name")) {
            phvVar.ac(jSONObject.getString("package_name"));
            LogUtil.b("EzPlugin_EzPluginIndexParser", "parseDescriptionAllType deviceInfo.getPackageName() = ", phvVar.i());
        }
        if (jSONObject.has("bluetooth_type")) {
            phvVar.e(jSONObject.getInt("bluetooth_type"));
        }
        if (jSONObject.has("wear_type")) {
            phvVar.aj(jSONObject.getString("wear_type"));
        }
        if (jSONObject.has(PluginPayAdapter.DEVICE_CATEGORY)) {
            phvVar.a(jSONObject.getInt(PluginPayAdapter.DEVICE_CATEGORY));
        }
        if (jSONObject.has("device_shapes")) {
            phvVar.b(jSONObject.getInt("device_shapes"));
        }
        if (jSONObject.has("is_porsche")) {
            phvVar.e(jSONObject.getBoolean("is_porsche"));
        }
        if (jSONObject.has("support_ear_muff_guide")) {
            phvVar.a(jSONObject.getBoolean("support_ear_muff_guide"));
        }
        if (jSONObject.has("device_relationship")) {
            phvVar.ag(jSONObject.getString("device_relationship"));
        }
    }

    private static void d(phv phvVar, JSONObject jSONObject) throws JSONException {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionSupportOrNot param is null");
            return;
        }
        if (jSONObject.has("br_and_ble")) {
            phvVar.d(jSONObject.getBoolean("br_and_ble"));
        }
        if (jSONObject.has("support_midware")) {
            phvVar.b(jSONObject.getBoolean("support_midware"));
        }
        if (jSONObject.has("wlan_anto_download")) {
            phvVar.h(jSONObject.getInt("wlan_anto_download"));
        }
        if (jSONObject.has("heart_rate_function")) {
            phvVar.i(jSONObject.getInt("heart_rate_function"));
        }
        if (jSONObject.has("pair_model_bt_name")) {
            phvVar.ae(jSONObject.getString("pair_model_bt_name"));
        }
    }

    private static void c(phv phvVar, JSONObject jSONObject) throws JSONException {
        if (phvVar == null || jSONObject == null) {
            LogUtil.e("EzPlugin_EzPluginIndexParser", "parseDescriptionFunctionalField param is null");
            return;
        }
        if (jSONObject.has("nps_name")) {
            phvVar.aa(jSONObject.getString("nps_name"));
        }
        if (jSONObject.has("club_url")) {
            phvVar.h(jSONObject.getString("club_url"));
        }
        if (jSONObject.has("honor_club_url")) {
            phvVar.x(jSONObject.getString("honor_club_url"));
        }
        if (jSONObject.has("bi_name")) {
            phvVar.a(jSONObject.getString("bi_name"));
        }
        if (jSONObject.has("track_logo_image")) {
            phvVar.ah(jSONObject.getString("track_logo_image"));
        }
    }
}
