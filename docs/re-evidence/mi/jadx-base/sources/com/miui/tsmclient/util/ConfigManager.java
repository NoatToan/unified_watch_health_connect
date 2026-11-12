package com.miui.tsmclient.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.GroupConfigInfo;
import com.miui.tsmclient.entity.LogCaptureConfig;
import com.miui.tsmclient.entity.ServiceWhitelist;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.request.ConfigListRequest;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigManager {
    public static final String DKF_SERVICE_WHITELIST = "DKF_SERVICE_WHITELIST";
    public static final String ICCOA2_DKF_SERVICE_WHITELIST = "ICCOA2_SERVICE_WHITELIST";
    private static final String LOG_CAPTURE_CONFIG = "LOG_CAPTURE_CONFIG";
    private static final long LOG_CAPTURE_REQUEST_INTERVAL = 86400000;
    private static final String LOG_CONFIG_CARD_NAME = "ALL";
    public static final String MI_TSM_SERVICE_WHITELIST = "MI_TSM_SERVICE_WHITELIST";
    private static volatile ConfigManager sInstance;
    private ConfigListRequest mConfigRequest;
    private final WeakReference<Context> mContextRef;
    private long mLogConfigRequestTime;
    private final List<LogCaptureConfig> mLogCaptureConfigs = new CopyOnWriteArrayList();
    private final Map<String, List<ServiceWhitelist>> mWhiteListMap = new ConcurrentHashMap();

    private ConfigManager(Context context) {
        this.mContextRef = new WeakReference<>(context);
        initLogCaptureConfig();
        initWhiteListConfigs();
    }

    public static ConfigManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (ConfigManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ConfigManager(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private String getPrefName(String str) {
        if (TextUtils.equals(str, DKF_SERVICE_WHITELIST)) {
            return PrefUtils.PREF_KEY_DKF_SERVICE_WHITELIST;
        }
        if (TextUtils.equals(str, MI_TSM_SERVICE_WHITELIST)) {
            return PrefUtils.PREF_KEY_MI_TSM_SERVICE_WHITELIST;
        }
        if (TextUtils.equals(str, ICCOA2_DKF_SERVICE_WHITELIST)) {
            return PrefUtils.PREF_KEY_ICCOA_DKF_SERVICE_WHITELIST;
        }
        return null;
    }

    private List<ServiceWhitelist> getWhiteList(String str) {
        return this.mWhiteListMap.containsKey(str) ? this.mWhiteListMap.get(str) : new ArrayList();
    }

    private void initLogCaptureConfig() {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        this.mLogConfigRequestTime = PrefUtils.getLong(context, PrefUtils.PREF_KEY_CAPTURE_LOG_TIME, 0L);
        List list = (List) new Gson().fromJson(PrefUtils.getString(context, PrefUtils.PREF_KEY_CAPTURE_LOG_CONTENT, ""), new TypeToken<List<LogCaptureConfig>>() { // from class: com.miui.tsmclient.util.ConfigManager.4
        }.getType());
        if (ObjectUtils.isCollectionEmpty((List<?>) list)) {
            return;
        }
        this.mLogCaptureConfigs.addAll(list);
    }

    private void initWhiteListConfig(String str) {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        List list = (List) new Gson().fromJson(PrefUtils.getString(context, getPrefName(str), null), new TypeToken<List<ServiceWhitelist>>() { // from class: com.miui.tsmclient.util.ConfigManager.3
        }.getType());
        this.mWhiteListMap.put(str, ObjectUtils.isCollectionEmpty((List<?>) list) ? new ArrayList() : new ArrayList(list));
    }

    private void initWhiteListConfigs() {
        initWhiteListConfig(MI_TSM_SERVICE_WHITELIST);
        initWhiteListConfig(DKF_SERVICE_WHITELIST);
        initWhiteListConfig(ICCOA2_DKF_SERVICE_WHITELIST);
    }

    public void clearServiceWhiteList(String str) {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        this.mWhiteListMap.remove(str);
        PrefUtils.remove(context, getPrefName(str));
    }

    public List<LogCaptureConfig> getLogCaptureConfig() {
        Context context = this.mContextRef.get();
        if (context == null) {
            return new CopyOnWriteArrayList();
        }
        if (System.currentTimeMillis() - this.mLogConfigRequestTime <= 86400000) {
            return this.mLogCaptureConfigs;
        }
        HttpClient.getInstance(context).cancel(this.mConfigRequest);
        if (this.mConfigRequest == null) {
            this.mConfigRequest = new ConfigListRequest(null, LOG_CAPTURE_CONFIG, null);
        }
        try {
            GroupConfigInfo groupConfigInfo = (GroupConfigInfo) HttpClient.getInstance(context).execute(this.mConfigRequest).getResult();
            if (this.mConfigRequest.isSuccess()) {
                this.mLogCaptureConfigs.clear();
                List infoList = groupConfigInfo.getInfoList("ALL", LOG_CAPTURE_CONFIG, new TypeToken<List<LogCaptureConfig>>() { // from class: com.miui.tsmclient.util.ConfigManager.2
                }.getType());
                if (!ObjectUtils.isCollectionEmpty((List<?>) infoList) && !ObjectUtils.isCollectionEmpty((List<?>) infoList.get(0))) {
                    this.mLogCaptureConfigs.addAll((Collection) infoList.get(0));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mLogConfigRequestTime = jCurrentTimeMillis;
                PrefUtils.putLong(context, PrefUtils.PREF_KEY_CAPTURE_LOG_TIME, jCurrentTimeMillis);
                PrefUtils.putString(context, PrefUtils.PREF_KEY_CAPTURE_LOG_CONTENT, ObjectUtils.isCollectionEmpty(groupConfigInfo.getContentList("ALL", LOG_CAPTURE_CONFIG)) ? "" : groupConfigInfo.getContentList("ALL", LOG_CAPTURE_CONFIG).get(0));
            }
        } catch (IOException e) {
            LogUtils.e("ConfigListRequest Exception occurred on ConfigUtils", e);
        }
        return this.mLogCaptureConfigs;
    }

    public List<ServiceWhitelist> getServiceWhiteList(boolean z, String str) throws AuthApiException {
        Context context = this.mContextRef.get();
        if (context == null) {
            return new ArrayList();
        }
        List<ServiceWhitelist> whiteList = getWhiteList(str);
        if (!z) {
            return new ArrayList(whiteList);
        }
        ConfigListRequest configListRequest = new ConfigListRequest(null, str, null);
        try {
            GroupConfigInfo groupConfigInfo = (GroupConfigInfo) HttpClient.getInstance(context).execute(configListRequest).getResult();
            if (configListRequest.isSuccess()) {
                whiteList.clear();
                List infoList = groupConfigInfo.getInfoList(str, new TypeToken<List<ServiceWhitelist>>() { // from class: com.miui.tsmclient.util.ConfigManager.1
                }.getType(), new Gson());
                if (!ObjectUtils.isCollectionEmpty((List<?>) infoList)) {
                    whiteList.addAll((Collection) infoList.get(0));
                }
                PrefUtils.putString(context, getPrefName(str), ObjectUtils.isCollectionEmpty(groupConfigInfo.getContentList(null, str)) ? "" : groupConfigInfo.getContentList(null, str).get(0));
                this.mWhiteListMap.put(str, whiteList);
            } else if (groupConfigInfo != null) {
                throw new AuthApiException(groupConfigInfo.getErrorCode(), groupConfigInfo.getErrorDesc());
            }
        } catch (InternalIOException e) {
            LogUtils.e("ConfigListRequest InternalIOException occurred on ConfigManager", e);
            throw new AuthApiException(e.getErrorCode(), e.getMessage());
        } catch (IOException e2) {
            LogUtils.e("ConfigListRequest IOException occurred on ConfigManager", e2);
        }
        return new ArrayList(whiteList);
    }
}
