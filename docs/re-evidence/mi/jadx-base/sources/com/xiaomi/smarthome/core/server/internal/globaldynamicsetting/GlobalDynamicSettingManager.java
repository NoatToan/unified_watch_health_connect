package com.xiaomi.smarthome.core.server.internal.globaldynamicsetting;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.setting.ServerSetting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class GlobalDynamicSettingManager {
    public static final String GLOBAL_DYNAMIC_SETTING_PREFS = "com.xiaomi.smarthome.globaldynamicsetting";
    private static final String TAG = "GlobalDynamicSettingManager";
    private static volatile GlobalDynamicSettingManager sInstance;
    private static Object sLock = new Object();
    private boolean isShowIntelligentAssistant;
    private SharedPreferences mGlobalDynamicSettingPrefs;
    private volatile ServerBean mServer;
    private volatile String mServerEnv;
    private boolean mIsInitialized = false;
    private Context mAppContext = MiJiaEnvironment.getAppContext();

    private GlobalDynamicSettingManager() {
        init();
    }

    public static GlobalDynamicSettingManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new GlobalDynamicSettingManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void init() {
        boolean z;
        synchronized (sLock) {
            try {
                z = this.mIsInitialized;
                if (!z) {
                    this.mIsInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        this.mGlobalDynamicSettingPrefs = this.mAppContext.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0);
        this.mServer = ServerChooseCacheManager.getInstance().parseCurrentServerFromMMKV(this.mAppContext);
        this.mServerEnv = this.mGlobalDynamicSettingPrefs.getString(GlobalDynamicSettingConst.SERVER_ENV, "release");
    }

    private boolean isValidateServerEnv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase("release") || str.equalsIgnoreCase(ServerSetting.SERVER_ENV_PREVIEW) || str.equalsIgnoreCase("at") || str.equalsIgnoreCase("st");
    }

    private void saveServer() {
        ServerChooseCacheManager.getInstance().saveServer(this.mAppContext, this.mServer);
    }

    private synchronized void saveServerEnv() {
        if (!TextUtils.isEmpty(this.mServerEnv)) {
            SharePrefsManager.setSettingString(this.mGlobalDynamicSettingPrefs, GlobalDynamicSettingConst.SERVER_ENV, this.mServerEnv);
        }
    }

    public void getCommonConfig(AsyncCallback<JSONObject, Error> asyncCallback) {
        try {
            asyncCallback.onSuccess(new JSONObject(this.mGlobalDynamicSettingPrefs.getString(GlobalDynamicSettingConst.LOCALE_COMMON_CONFIG, "")));
        } catch (Exception e) {
            e.printStackTrace();
            asyncCallback.onFailure(new Error(-1, e.toString()));
        }
    }

    public ServerBean getServer() {
        return this.mServer;
    }

    public String getServerEnv() {
        return this.mServerEnv;
    }

    public boolean isInternationalServer() {
        return ServerCompact.isInternationalServer(this.mServer);
    }

    public boolean isShowIntelligentAssistant() {
        return this.isShowIntelligentAssistant;
    }

    public synchronized void saveCommonConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            SharePrefsManager.setSettingStringAsync(this.mGlobalDynamicSettingPrefs, GlobalDynamicSettingConst.LOCALE_COMMON_CONFIG, jSONObject.toString());
        }
    }

    public synchronized void setServer(ServerBean serverBean) {
        this.mServer = serverBean;
        saveServer();
    }

    public synchronized void setServerEnv(String str) {
        if (isValidateServerEnv(str)) {
            this.mServerEnv = str;
            saveServerEnv();
        }
    }

    public void setShowIntelligentAssistant(boolean z) {
        this.isShowIntelligentAssistant = z;
    }

    public static GlobalDynamicSettingManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new GlobalDynamicSettingManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }
}
