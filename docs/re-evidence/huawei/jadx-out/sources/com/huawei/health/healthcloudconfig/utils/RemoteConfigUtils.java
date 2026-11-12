package com.huawei.health.healthcloudconfig.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.AuthorizationUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigUtils {

    public interface ConfigCallback {
        void onFailure(Exception exc, String str);

        void onSuccess(String str);
    }

    public static void a(final String str, final ConfigCallback configCallback) {
        if (Utils.o()) {
            ReleaseLogUtil.c("R_RemoteConfigUtils", "downloadRemoteConfigInfo, not initialize agc oversea ");
            configCallback.onFailure(new Exception("isOversea not use agc"), "");
            return;
        }
        Task<ConfigValues> taskFetch = null;
        if (!AuthorizationUtils.c(null)) {
            configCallback.onFailure(new Exception("not authorize"), "");
            return;
        }
        if (AGConnectInstance.getInstance() == null) {
            AGConnectInstance.initialize(BaseApplication.b());
        }
        final AGConnectConfig aGConnectConfig = AGConnectConfig.getInstance();
        if (aGConnectConfig == null) {
            LogUtil.e("RemoteConfigUtils", "AGConnectConfig getInstance is null");
            configCallback.onFailure(new Exception("agc is null"), "");
            return;
        }
        try {
            taskFetch = aGConnectConfig.fetch(10L);
        } catch (InvalidParameterException e) {
            LogUtil.e("RemoteConfigUtils", "InvalidParameterException: ", LogAnonymous.b(e));
        }
        if (taskFetch == null) {
            LogUtil.e("RemoteConfigUtils", "task is null");
            configCallback.onFailure(new Exception("task is null"), "");
        } else {
            taskFetch.addOnSuccessListener(new OnSuccessListener<ConfigValues>() { // from class: com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.4
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ConfigValues configValues) {
                    try {
                        aGConnectConfig.apply(configValues);
                        String valueAsString = aGConnectConfig.getValueAsString(str);
                        LogUtil.a("RemoteConfigUtils", "RemoteConfig success, getValue is: ", valueAsString);
                        configCallback.onSuccess(valueAsString);
                    } catch (NullPointerException e2) {
                        ReleaseLogUtil.b("R_RemoteConfigUtils", "RemoteConfig failure, NullPointerException");
                        configCallback.onFailure(e2, "");
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.5
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    LogUtil.a("RemoteConfigUtils", "RemoteConfig, fetch onFailure = ", exc.getMessage());
                    aGConnectConfig.apply(aGConnectConfig.loadLastFetched());
                    String valueAsString = aGConnectConfig.getValueAsString(str);
                    LogUtil.a("RemoteConfigUtils", "RemoteConfig failure, lastConfig value = ", valueAsString);
                    configCallback.onFailure(exc, valueAsString);
                }
            });
        }
    }

    public static void b(String str, ConfigCallback configCallback, int i) {
        String str2 = "RemoteConfigUtils_" + str;
        String strC = KeyValDbManager.d(BaseApplication.b()).c(str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("RemoteConfigUtils", "trigger first download");
            c(str, str2, configCallback);
            return;
        }
        b bVar = (b) new Gson().fromJson(strC, b.class);
        if (System.currentTimeMillis() - bVar.f7127b >= ((long) i) * 86400000) {
            c(str, str2, configCallback);
        } else {
            LogUtil.a("RemoteConfigUtils", "return value from local cache");
            configCallback.onSuccess(bVar.f7126a);
        }
    }

    private static void c(String str, final String str2, final ConfigCallback configCallback) {
        a(str, new ConfigCallback() { // from class: com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.1
            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onSuccess(String str3) {
                b bVar = new b();
                bVar.f7127b = System.currentTimeMillis();
                bVar.f7126a = str3;
                KeyValDbManager.d(BaseApplication.b()).b(str2, new Gson().toJson(bVar));
                configCallback.onSuccess(str3);
            }

            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onFailure(Exception exc, String str3) {
                configCallback.onFailure(exc, str3);
            }
        });
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("value")
        public String f7126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("lastSyncTime")
        public long f7127b;

        private b() {
        }
    }
}
