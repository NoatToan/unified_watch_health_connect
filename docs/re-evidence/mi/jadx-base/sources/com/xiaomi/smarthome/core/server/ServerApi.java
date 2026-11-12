package com.xiaomi.smarthome.core.server;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.CoreIoCStub;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ServerApi implements CoreIoCStub {
    public static volatile ServerApi sInstance = new ServerApiDefaultImpl();

    public static ServerApi getInstance() {
        return sInstance;
    }

    public abstract ServerBean getCurrentServer(Context context);

    public abstract ServerBean getGlobalSettingServer();

    public abstract String getGlobalSettingServerEnv();

    public boolean isAmerica(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_US_TRUE_COUNTRY_CODE);
    }

    public boolean isChinaMainLand(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_CN_COUNTRY_CODE);
    }

    public abstract boolean isCoreReady();

    public boolean isEurope(Context context) {
        ServerBean currentServer = getCurrentServer(context);
        return currentServer != null && TextUtils.equals(currentServer.machineCode, "de");
    }

    public boolean isIndia(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), "IN");
    }

    public abstract boolean isInternationalServer();

    public boolean isInternationalServer(Context context) {
        return ServerConstants.isInternationalServer(getCurrentServer(context));
    }

    public boolean isKorea(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_KR_COUNTRY_CODE);
    }

    public boolean isRussia(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_RU_COUNTRY_CODE);
    }

    public boolean isSingapore(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_SG_COUNTRY_CODE);
    }

    public boolean isStaging(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), "st");
    }

    public boolean isTW(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.NEW_TW_COUNTRY_CODE);
    }

    public boolean isUK(Context context) {
        return ServerConstants.isInRegion(getCurrentServer(context), ServerConstants.GB_COUNTRY_CODE);
    }
}
