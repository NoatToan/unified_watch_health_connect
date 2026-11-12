package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.framework.plugin.rn.constants.MiotNativeModuleConstants;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.MMKVManager;
import defpackage.aje;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RnDeviceUtils {
    public static final String CATEGORY_TV = "tv";

    public static String getCategory(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split(z.f14007a)) == null || strArrSplit.length <= 2) ? "" : strArrSplit[1];
    }

    public static boolean isTV(String str) {
        return TextUtils.equals(getCategory(str), CATEGORY_TV);
    }

    public static void processBleDiscoveredData() {
        try {
            String strJ = MMKVManager.getMMKV("pin_page_ble_data_save").j("ble_data");
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strJ);
            String strOptString = jSONObject.optString("mac");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("services");
            String[] strArr = new String[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                strArr[i] = jSONArrayOptJSONArray.optJSONObject(i).optString("uuid");
            }
            aje.b(MiJiaEnvironment.getAppContext()).d(new Intent().setAction(MiotNativeModuleConstants.DISCOVERSERVICES_CALLBACK).putExtra(MiotNativeModuleConstants.EMIT_MAC, strOptString).putExtra(MiotNativeModuleConstants.EMIT_UUID, strArr));
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString2 = jSONObjectOptJSONObject.optString("uuid");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("chars");
                String[] strArr2 = new String[jSONArrayOptJSONArray2.length()];
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    strArr2[i3] = jSONArrayOptJSONArray2.optString(i3);
                }
                aje.b(MiJiaEnvironment.getAppContext()).d(new Intent().setAction(MiotNativeModuleConstants.DISCOVERCHARACTERISTICS_CALLBACK).putExtra(MiotNativeModuleConstants.EMIT_MAC, strOptString).putExtra(MiotNativeModuleConstants.EMIT_SERVICEID, strOptString2).putExtra(MiotNativeModuleConstants.EMIT_UUID, strArr2));
            }
            RnPluginLog.addFrameworkLog("pin ble discover data : " + strJ);
            MMKVManager.getMMKV("pin_page_ble_data_save").u("ble_data", "");
        } catch (Exception e) {
            RnPluginLog.addFrameworkLog("pin ble discover err : " + Log.getStackTraceString(e));
        }
    }
}
