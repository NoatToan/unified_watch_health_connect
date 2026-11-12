package com.xiaomi.ai.domain.mobileapp.adapter;

import com.google.gson.JsonObject;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.AppItem;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.parser.ResourceSuite;
import defpackage.klo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ContextAdapter {
    public static final String MIUI_HOME_PACKAGE = "com.miui.home";
    public static final int ONLY_CLOSE_VERSION = 302000004;

    public static void adapt(MobileAppIntention mobileAppIntention, JsonObject jsonObject, int i) {
        if (mobileAppIntention == null || mobileAppIntention.getScore() < 0.5d || jsonObject == null || jsonObject.isJsonNull()) {
            return;
        }
        adaptDownloadNow(mobileAppIntention, jsonObject);
        adaptOnlyClose(mobileAppIntention, jsonObject, i);
    }

    private static void adaptDownloadNow(MobileAppIntention mobileAppIntention, JsonObject jsonObject) {
        if (parseDeviceLock(jsonObject)) {
            mobileAppIntention.setDownloadNow(false);
        }
    }

    private static void adaptOnlyClose(MobileAppIntention mobileAppIntention, JsonObject jsonObject, int i) {
        if (ActionType.CLOSE.toString().equals(mobileAppIntention.getAction()) && mobileAppIntention.getName().isEmpty() && mobileAppIntention.getTag().isEmpty()) {
            String forcegroundApp = parseForcegroundApp(jsonObject);
            boolean z = (klo.f(forcegroundApp) || MIUI_HOME_PACKAGE.equals(forcegroundApp)) ? false : true;
            if (Device.isTV(mobileAppIntention.getDevice()) || !z) {
                mobileAppIntention.setScore(0.0d);
            } else if (i < 302000004) {
                mobileAppIntention.setScore(0.0d);
            } else {
                mobileAppIntention.setScore(1.0d);
                mobileAppIntention.setAction(ActionType.CLOSE_CURRENT.toString());
            }
        }
    }

    public static void devicePkgNameApapt(MobileAppIntention mobileAppIntention) {
        if (Device.isTV(mobileAppIntention.getDevice())) {
            for (MobileAppIntention.ShowApp showApp : mobileAppIntention.getApps()) {
                if (showApp.getPackageName() != null && showApp.getPackageName().startsWith("none") && !showApp.getPackageName().contains(".")) {
                    showApp.setPackageName("");
                }
            }
        }
    }

    public static String deviceRewriteApapt(String str, Device device) {
        Map<String, List<AppItem>> map;
        Map<String, Map<String, List<AppItem>>> deviceNameToAppItemsMap = ResourceSuite.getInstance().getUpdateResource().getDeviceNameToAppItemsMap();
        return (deviceNameToAppItemsMap == null || (map = deviceNameToAppItemsMap.get(device.getAppName())) == null || !str.startsWith("播放") || !map.keySet().contains(str.substring(2))) ? str : str.replace("播放", "");
    }

    public static void deviceScoreApapt(MobileAppIntention mobileAppIntention) {
        if (Device.isTV(mobileAppIntention.getDevice())) {
            mobileAppIntention.setScore(mobileAppIntention.getScore() <= 0.98d ? mobileAppIntention.getScore() : 0.98d);
            if (mobileAppIntention.getOnlyAppName()) {
                mobileAppIntention.setScore(mobileAppIntention.getScore() <= 0.9d ? mobileAppIntention.getScore() : 0.9d);
            }
        }
    }

    private static boolean parseDeviceLock(JsonObject jsonObject) {
        if (jsonObject == null || jsonObject.isJsonNull()) {
            return false;
        }
        JsonObject asJsonObject = jsonObject.has("device_status") ? jsonObject.get("device_status").getAsJsonObject() : null;
        return asJsonObject != null && asJsonObject.has("device_lock") && asJsonObject.get("device_lock").getAsBoolean();
    }

    public static String parseForcegroundApp(JsonObject jsonObject) {
        JsonObject asJsonObject;
        if (jsonObject == null || !jsonObject.has("forceground_app") || (asJsonObject = jsonObject.get("forceground_app").getAsJsonObject()) == null || !asJsonObject.has("pkg_name")) {
            return "";
        }
        String asString = asJsonObject.get("pkg_name").getAsString();
        return !klo.f(asString) ? asString : "";
    }
}
