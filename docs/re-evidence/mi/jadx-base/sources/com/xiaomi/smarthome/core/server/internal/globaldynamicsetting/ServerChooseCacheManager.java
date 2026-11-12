package com.xiaomi.smarthome.core.server.internal.globaldynamicsetting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.tencent.mmkv.MMKV;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ServerChooseCacheManager {
    private static final String TAG = "ServerDataManager";
    private static volatile ServerChooseCacheManager sInstance;
    private volatile SharedPreferences _editor;
    private final Map<String, ServerBean> sFilterBannedServer;
    private final Map<String, String> sNewCountryCodeToOldCodeMap;
    private final Map<String, Pair<String, String>> sOldCountryCodeToNewMap;

    private ServerChooseCacheManager() {
        ArrayMap arrayMap = new ArrayMap();
        this.sOldCountryCodeToNewMap = arrayMap;
        arrayMap.put("in", Pair.create(ServerConstants.NEW_SG_COUNTRY_CODE, "sg"));
        arrayMap.put("us", Pair.create(ServerConstants.NEW_SG_COUNTRY_CODE, "sg"));
        arrayMap.put("de", Pair.create(ServerConstants.NEW_DE_COUNTRY_CODE, "de"));
        arrayMap.put("tr", Pair.create(ServerConstants.NEW_SG_COUNTRY_CODE, "sg"));
        arrayMap.put("cn", Pair.create(ServerConstants.NEW_CN_COUNTRY_CODE, "cn"));
        arrayMap.put(ServerConstants.OLD_TW_COUNTRY_CODE, Pair.create(ServerConstants.NEW_TW_COUNTRY_CODE, "sg"));
        arrayMap.put(ServerConstants.OLD_HK_COUNTRY_CODE, Pair.create(ServerConstants.NEW_HK_COUNTRY_CODE, "sg"));
        arrayMap.put("sg", Pair.create(ServerConstants.NEW_SG_COUNTRY_CODE, "sg"));
        arrayMap.put("i2", Pair.create("IN", "i2"));
        arrayMap.put(ServerConstants.OLD_US_TRUE_COUNTRY_CODE, Pair.create(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, "us"));
        arrayMap.put("kr", Pair.create(ServerConstants.NEW_KR_COUNTRY_CODE, "sg"));
        arrayMap.put("ru", Pair.create(ServerConstants.NEW_RU_COUNTRY_CODE, "ru"));
        arrayMap.put("st", Pair.create("st", "st"));
        ArrayMap arrayMap2 = new ArrayMap();
        this.sFilterBannedServer = arrayMap2;
        arrayMap2.put("IR", ServerConstants.SG_SERVER());
        arrayMap2.put("CU", ServerConstants.US_SERVER());
        arrayMap2.put("KP", ServerConstants.SG_SERVER());
        arrayMap2.put("SY", ServerConstants.SG_SERVER());
        arrayMap2.put("SD", ServerConstants.SG_SERVER());
        arrayMap2.put("VE", ServerConstants.US_SERVER());
        ArrayMap arrayMap3 = new ArrayMap();
        this.sNewCountryCodeToOldCodeMap = arrayMap3;
        arrayMap3.put(ServerConstants.NEW_CN_COUNTRY_CODE, "cn");
        arrayMap3.put(ServerConstants.NEW_TW_COUNTRY_CODE, ServerConstants.OLD_TW_COUNTRY_CODE);
        arrayMap3.put(ServerConstants.NEW_HK_COUNTRY_CODE, ServerConstants.OLD_HK_COUNTRY_CODE);
        arrayMap3.put(ServerConstants.NEW_SG_COUNTRY_CODE, "sg");
        arrayMap3.put("IN", "i2");
        arrayMap3.put(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, ServerConstants.OLD_US_TRUE_COUNTRY_CODE);
        arrayMap3.put(ServerConstants.NEW_DE_COUNTRY_CODE, "de");
        arrayMap3.put(ServerConstants.NEW_KR_COUNTRY_CODE, "kr");
        arrayMap3.put(ServerConstants.NEW_RU_COUNTRY_CODE, "ru");
        arrayMap3.put("st", "st");
    }

    private SharedPreferences getEditor(Context context) {
        SharedPreferences sharedPreferences;
        if (this._editor == null) {
            synchronized (ServerChooseCacheManager.class) {
                if (this._editor == null) {
                    try {
                        sharedPreferences = MMKV.G("globaldynamicsetting", 2);
                    } catch (Exception e) {
                        MiJiaLog.writeLogOnGrey(LogType.LOG_INTERNAL, TAG, Log.getStackTraceString(e));
                        sharedPreferences = context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0);
                    }
                    this._editor = sharedPreferences;
                    return sharedPreferences;
                }
            }
        }
        return this._editor;
    }

    public static ServerChooseCacheManager getInstance() {
        if (sInstance == null) {
            synchronized (ServerChooseCacheManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ServerChooseCacheManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private boolean invokedFromMain(Context context) {
        return ProcessUtil.isMainProcess(context);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    @Deprecated
    private ServerBean parseCurrentServerFromSpfs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0);
        String string = sharedPreferences.getString(GlobalDynamicSettingConst.SERVER_NEW, "");
        if (TextUtils.isEmpty(string)) {
            string = sharedPreferences.getString(GlobalDynamicSettingConst.SERVER, "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            try {
                ServerBean serverBeanFormJson = ServerBean.formJson(new JSONObject(string));
                MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromSpfs: new " + serverBeanFormJson.dump());
                ServerBean serverBean = this.sFilterBannedServer.get(serverBeanFormJson.countryCode);
                if (serverBean == null) {
                    return serverBeanFormJson;
                }
                if (MiJiaEnvironment.isDebugBuildType()) {
                    MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromSpfs: map banned server: " + serverBeanFormJson.dump() + " ;to: " + serverBean.dump());
                }
                if (invokedFromMain(context)) {
                    saveServer(context, serverBean);
                }
                return (ServerBean) serverBean.clone();
            } catch (Exception unused) {
                Pair<String, String> pair = this.sOldCountryCodeToNewMap.get(string);
                ServerBean serverBeanFromCountryAndMachineCode = ServerBean.fromCountryAndMachineCode((String) pair.first, (String) pair.second);
                if (invokedFromMain(context)) {
                    saveServer(context, serverBeanFromCountryAndMachineCode);
                }
                if (MiJiaEnvironment.isDebugBuildType()) {
                    MiJiaLog.onlyLogcat(TAG, String.format("原来服务器是： %s,静默迁移到： %s", string, serverBeanFromCountryAndMachineCode.countryCode));
                    MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromSpfs: old " + serverBeanFromCountryAndMachineCode.dump());
                }
                return serverBeanFromCountryAndMachineCode;
            }
        } catch (Exception e) {
            if (MiJiaEnvironment.isDebugBuildType()) {
                e.printStackTrace();
            }
            MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromSpfs: null");
            return null;
        }
        if (MiJiaEnvironment.isDebugBuildType()) {
            e.printStackTrace();
        }
        MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromSpfs: null");
        return null;
    }

    public String getCompatOldCountryCode(ServerBean serverBean) {
        return serverBean == null ? "" : this.sNewCountryCodeToOldCodeMap.get(serverBean.countryCode);
    }

    public ServerBean parseCurrentServerFromMMKV(Context context) {
        String string = getEditor(context).getString("server_json", null);
        MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromMMKV: new " + string);
        try {
            if (TextUtils.isEmpty(string)) {
                ServerBean currentServerFromSpfs = parseCurrentServerFromSpfs(context);
                if (invokedFromMain(context)) {
                    saveServer(context, currentServerFromSpfs);
                }
                return currentServerFromSpfs;
            }
            ServerBean serverBeanFormJson = ServerBean.formJson(new JSONObject(string));
            MiJiaLog.onlyLogcat(TAG, "parseCurrentServerFromMMKV: new server: " + serverBeanFormJson);
            return serverBeanFormJson;
        } catch (Exception unused) {
            return parseCurrentServerFromSpfs(context);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void saveServer(Context context, ServerBean serverBean) {
        String json;
        if (invokedFromMain(context)) {
            if (serverBean == null) {
                json = "";
            } else {
                try {
                    json = serverBean.toJson();
                } catch (Exception e) {
                    if (MiJiaEnvironment.isDebugBuildType()) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            getEditor(context).edit().putString("server_json", json).apply();
            context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0).edit().putString(GlobalDynamicSettingConst.SERVER_NEW, json).commit();
            StringBuilder sb = new StringBuilder();
            sb.append("saveServer: ");
            sb.append(serverBean != null ? serverBean.dump() : null);
            MiJiaLog.onlyLogcat(TAG, sb.toString());
        }
    }
}
