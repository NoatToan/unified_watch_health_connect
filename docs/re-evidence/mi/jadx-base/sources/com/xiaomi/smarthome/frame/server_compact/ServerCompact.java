package com.xiaomi.smarthome.frame.server_compact;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.ServerApi;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.ServerChooseCacheManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ServerCompact {
    public static final String AmericaAbbreviate = "us";
    public static final String ChinaMainLandAbbreviate = "cn";
    public static final String EuropeAbbreviate = "de";
    public static final String IndiaAbbreviate = "in";
    public static final String RussiaAbbreviate = "ru";
    public static final String SingaporeAbbreviate = "sg";
    private static final String TAG = "ServerCompact";

    public static ServerBean CN_SERVER() {
        return ServerConstants.CN_SERVER();
    }

    public static ServerBean DE_SERVER() {
        return ServerConstants.DE_SERVER();
    }

    public static ServerBean HK_SERVER() {
        return ServerConstants.HK_SERVER();
    }

    public static ServerBean IN_SERVER() {
        return ServerConstants.IN_SERVER();
    }

    public static ServerBean KR_SERVER() {
        return ServerConstants.KR_SERVER();
    }

    public static ServerBean RU_SERVER() {
        return ServerConstants.RU_SERVER();
    }

    public static ServerBean SG_SERVER() {
        return ServerConstants.SG_SERVER();
    }

    public static ServerBean ST_SERVER() {
        return ServerConstants.ST_SERVER();
    }

    public static ServerBean TW_SERVER() {
        return ServerConstants.TW_SERVER();
    }

    public static ServerBean US_SERVER() {
        return ServerConstants.US_SERVER();
    }

    public static String getCompatOldCountryCode(ServerBean serverBean) {
        return ServerChooseCacheManager.getInstance().getCompatOldCountryCode(serverBean);
    }

    public static ServerBean getCurrentServer(Context context) {
        return ServerApi.getInstance().getCurrentServer(context);
    }

    public static String getDownUrl(ServerBean serverBean, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        if (isChinaMainLand(serverBean) || isStaging(serverBean)) {
            return jSONObject.optString("cn");
        }
        if (isSingapore(serverBean)) {
            return jSONObject.optString("sg");
        }
        if (isAmerica(serverBean)) {
            return jSONObject.optString("us");
        }
        if (isEurope(serverBean)) {
            return jSONObject.optString("de");
        }
        if (isRussia(serverBean)) {
            return jSONObject.optString("ru");
        }
        return isIndia(serverBean) ? jSONObject.optString("in") : "";
    }

    public static String getDownUrlDefaultCN(ServerBean serverBean, JSONObject jSONObject) {
        String downUrl = getDownUrl(serverBean, jSONObject);
        if (TextUtils.isEmpty(downUrl)) {
            downUrl = jSONObject.optString("cn");
        }
        return downUrl == null ? "" : downUrl;
    }

    public static boolean isAmerica(ServerBean serverBean) {
        return ServerConstants.isAmerica(serverBean);
    }

    public static boolean isAmericaServer(ServerBean serverBean) {
        return ServerConstants.isAmericaServer(serverBean);
    }

    public static boolean isChinaMainLand(ServerBean serverBean) {
        return ServerConstants.isChinaMainLand(serverBean);
    }

    public static boolean isEurope(Context context) {
        return ServerApi.getInstance().isEurope(context);
    }

    public static boolean isEuropeServer(ServerBean serverBean) {
        return ServerConstants.isEuropeServer(serverBean);
    }

    public static boolean isIndia(ServerBean serverBean) {
        return ServerConstants.isIndia(serverBean);
    }

    public static boolean isIndiaServer(ServerBean serverBean) {
        return ServerConstants.isIndiaServer(serverBean);
    }

    public static boolean isInternationalServer(Context context) {
        return ServerApi.getInstance().isInternationalServer(context);
    }

    public static boolean isKorea(Context context) {
        return ServerApi.getInstance().isKorea(context);
    }

    public static boolean isRussia(ServerBean serverBean) {
        return ServerConstants.isRussia(serverBean);
    }

    public static boolean isRussiaServer(ServerBean serverBean) {
        return ServerConstants.isRussiaServer(serverBean);
    }

    public static boolean isSingapore(ServerBean serverBean) {
        return ServerConstants.isSingapore(serverBean);
    }

    public static boolean isSingaporeServer(ServerBean serverBean) {
        return ServerConstants.isSingaporeServer(serverBean);
    }

    public static boolean isStaging(ServerBean serverBean) {
        return ServerConstants.isStaging(serverBean);
    }

    public static boolean isTW(ServerBean serverBean) {
        return ServerConstants.isTW(serverBean);
    }

    public static boolean isUK(ServerBean serverBean) {
        return ServerConstants.isUK(serverBean);
    }

    public static boolean isAmerica(Context context) {
        return ServerApi.getInstance().isAmerica(context);
    }

    public static boolean isChinaMainLand(Context context) {
        return ServerApi.getInstance().isChinaMainLand(context);
    }

    public static boolean isEurope(ServerBean serverBean) {
        return ServerConstants.isEurope(serverBean);
    }

    public static boolean isIndia(Context context) {
        return ServerApi.getInstance().isIndia(context);
    }

    public static boolean isInternationalServer(ServerBean serverBean) {
        return ServerConstants.isInternationalServer(serverBean);
    }

    public static boolean isKorea(ServerBean serverBean) {
        return ServerConstants.isKorea(serverBean);
    }

    public static boolean isRussia(Context context) {
        return ServerApi.getInstance().isRussia(context);
    }

    public static boolean isSingapore(Context context) {
        return ServerApi.getInstance().isSingapore(context);
    }

    public static boolean isStaging(Context context) {
        return ServerApi.getInstance().isStaging(context);
    }

    public static boolean isTW(Context context) {
        return ServerApi.getInstance().isTW(context);
    }

    public static boolean isUK(Context context) {
        return ServerApi.getInstance().isUK(context);
    }
}
