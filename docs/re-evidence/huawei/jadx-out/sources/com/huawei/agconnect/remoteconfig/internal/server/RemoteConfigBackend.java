package com.huawei.agconnect.remoteconfig.internal.server;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.AGCInstanceID;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.CPUModelUtil;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.agconnect.remoteconfig.AGCConfigException;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.internal.ConfigContainer;
import com.huawei.agconnect.remoteconfig.internal.ConfigHaManager;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigBackend {
    private final BackendService.Options options;
    private final RequestThrottle.Throttle throttle;

    public Task<ConfigContainer> getConfigFromRemote(String str, Map<String, String> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        buildRequest(str, map).addOnSuccessListener(new OnSuccessListener<RemoteConfigRequest>() { // from class: com.huawei.agconnect.remoteconfig.internal.server.RemoteConfigBackend.1
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(RemoteConfigRequest remoteConfigRequest) {
                BackendService.sendRequest(remoteConfigRequest, 1, RemoteConfigResponse.class, RemoteConfigBackend.this.options).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<RemoteConfigResponse>() { // from class: com.huawei.agconnect.remoteconfig.internal.server.RemoteConfigBackend.1.2
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public void onSuccess(RemoteConfigResponse remoteConfigResponse) {
                        if (remoteConfigResponse.isSuccess()) {
                            taskCompletionSource.setResult(new ConfigContainer(remoteConfigResponse.getParameters(), remoteConfigResponse.getExperiments(), remoteConfigResponse.getTag()));
                        } else {
                            taskCompletionSource.setException(new AGCConfigException(remoteConfigResponse.getRet().getMsg(), remoteConfigResponse.getRet().getCode()));
                        }
                    }
                }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.remoteconfig.internal.server.RemoteConfigBackend.1.1
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        if (exc instanceof AGCServerException) {
                            AGCServerException aGCServerException = (AGCServerException) exc;
                            if (1 == aGCServerException.getCode()) {
                                taskCompletionSource.setException(new AGCConfigException(aGCServerException.getErrMsg(), 1, RemoteConfigBackend.this.throttle.getEndTime()));
                                return;
                            }
                        }
                        taskCompletionSource.setException(exc);
                    }
                });
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Map<String, String>> getUserProperties(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            HashMap map2 = new HashMap(10);
            map2.put(MedalConstants.EVENT_KEY, entry.getKey());
            map2.put("value", entry.getValue());
            arrayList.add(map2);
        }
        return arrayList;
    }

    private Task<RemoteConfigRequest> buildRequest(final String str, final Map<String, String> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ConfigHaManager.a().a(false).addOnSuccessListener(new OnSuccessListener<Map<String, String>>() { // from class: com.huawei.agconnect.remoteconfig.internal.server.RemoteConfigBackend.2
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public void onSuccess(Map<String, String> map2) {
                String str2;
                Context context = AGConnectInstance.getInstance().getContext();
                RemoteConfigRequest remoteConfigRequest = new RemoteConfigRequest();
                remoteConfigRequest.setTag(str);
                remoteConfigRequest.setVersionName(RemoteConfigBackend.this.appVersion(context));
                try {
                    str2 = ",HarmonyOS " + ((String) Class.forName("ohos.system.version.SystemVersion").getDeclaredMethod("getVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (Throwable unused) {
                    Logger.w("RemoteConfig", "not find package ohos.system.version.SystemVersion");
                    str2 = "";
                }
                remoteConfigRequest.setPlatformVersion("Android " + Build.VERSION.RELEASE + str2);
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                remoteConfigRequest.setLanguage(locale.getLanguage());
                remoteConfigRequest.setScript(locale.getScript());
                remoteConfigRequest.setCountry(locale.getCountry());
                remoteConfigRequest.setDateTime(System.currentTimeMillis());
                remoteConfigRequest.setAaId(AGCInstanceID.getInstance(context).getId());
                remoteConfigRequest.setCustomProperties(RemoteConfigBackend.this.getUserProperties(map));
                remoteConfigRequest.setUserProperties(AGConnectConfig.getInstance().getEnableCollectUserPrivacy() ? RemoteConfigBackend.this.getUserProperties(map2) : null);
                remoteConfigRequest.setDeviceChip(AGConnectConfig.getInstance().getEnableCollectUserPrivacy() ? CPUModelUtil.getCpuModel() : null);
                taskCompletionSource.setResult(remoteConfigRequest);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String appVersion(Context context) {
        PackageInfo packageInfoSafeGetPackageInfo = SafeAppInfo.safeGetPackageInfo(context.getPackageManager(), context.getPackageName(), 16384);
        if (packageInfoSafeGetPackageInfo != null) {
            return packageInfoSafeGetPackageInfo.versionName;
        }
        return null;
    }

    public RemoteConfigBackend(AGConnectInstance aGConnectInstance) {
        RequestThrottle.Throttle throttle = RequestThrottle.getInstance().get("RemoteConfig-Fetch");
        this.throttle = throttle;
        this.options = new BackendService.Options.Builder().apiKey(true).throttle(throttle).app(aGConnectInstance).build();
    }
}
