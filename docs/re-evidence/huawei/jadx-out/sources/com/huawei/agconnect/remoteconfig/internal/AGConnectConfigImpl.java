package com.huawei.agconnect.remoteconfig.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.abtest.ABTestException;
import com.huawei.agconnect.abtest.AGConnectABTesting;
import com.huawei.agconnect.annotation.Singleton;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.AGCConfigException;
import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import com.huawei.agconnect.remoteconfig.ConfigValues;
import com.huawei.agconnect.remoteconfig.internal.server.RemoteConfigBackend;
import com.huawei.agconnect.remoteconfig.internal.storage.StoredCustomAttributes;
import com.huawei.agconnect.remoteconfig.internal.utils.DataProcessingFactory;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import com.huawei.hmf.tasks.Tasks;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public class AGConnectConfigImpl extends AGConnectConfig {
    private static final Executor k = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AGC-RemoteConfig-Thread");
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5041a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5042b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AGConnectABTesting f5043c;
    private final ConfigValuesImpl d;
    private final ConfigValuesImpl e;
    private final ConfigValuesImpl f;
    private final GetMergedValueHandler g;
    private final StoredCustomAttributes h;
    private final RemoteConfigBackend i;
    private final Handler j;

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void setEnableCollectUserPrivacy(boolean z) {
        this.f5042b = z;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void setDeveloperMode(boolean z) {
        Logger.v("AGConnectConfig", "set developer mode : " + z);
        Context context = AGConnectInstance.getInstance().getContext();
        if (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) {
            return;
        }
        this.f5041a = z;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void setCustomAttributes(Map<String, String> map) {
        this.h.a(map);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public ConfigValues loadLastFetched() {
        return this.f;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public String getValueAsString(String str) {
        return this.g.e(str);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Long getValueAsLong(String str) {
        return Long.valueOf(this.g.d(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Double getValueAsDouble(String str) {
        return Double.valueOf(this.g.c(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public byte[] getValueAsByteArray(String str) {
        return this.g.b(str);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Boolean getValueAsBoolean(String str) {
        return Boolean.valueOf(this.g.a(str));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public AGConnectConfig.SOURCE getSource(String str) {
        ConfigValuesImpl configValuesImpl = this.e;
        if (configValuesImpl != null && configValuesImpl.containKey(str)) {
            Logger.v("AGConnectConfig", "get source remote : " + str);
            return AGConnectConfig.SOURCE.REMOTE;
        }
        ConfigValuesImpl configValuesImpl2 = this.d;
        if (configValuesImpl2 == null || !configValuesImpl2.containKey(str)) {
            Logger.v("AGConnectConfig", "get source static : " + str);
            return AGConnectConfig.SOURCE.STATIC;
        }
        Logger.v("AGConnectConfig", "get source default : " + str);
        return AGConnectConfig.SOURCE.DEFAULT;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Map<String, Object> getMergedAll() {
        return this.g.a();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public boolean getEnableCollectUserPrivacy() {
        return this.f5042b;
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Map<String, String> getCustomAttributes() {
        return this.h.a();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Task<ConfigValues> fetchDiscrete(final long j, long j2) {
        ConfigContainer configContainerB = this.f.b();
        if (configContainerB == null) {
            return fetch(j);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (configContainerB.a(j)) {
            long jA = a(j2);
            Logger.i("AGConnectConfig", "discrete random time : " + jA);
            this.j.postDelayed(new Runnable() { // from class: com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    AGConnectConfigImpl.this.fetch(j);
                }
            }, jA * 1000);
        }
        taskCompletionSource.setResult(this.f);
        return taskCompletionSource.getTask();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Task<ConfigValues> fetch(final long j) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k.execute(new Runnable() { // from class: com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    taskCompletionSource.setResult((ConfigValues) Tasks.await(AGConnectConfigImpl.this.b(j)));
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public Task<ConfigValues> fetch() {
        return fetch(43200L);
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void clearAll() {
        Logger.v("AGConnectConfig", "clear all");
        this.d.a();
        this.e.a();
        this.f.a();
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void applyDefault(Map<String, Object> map) {
        Logger.v("AGConnectConfig", "apply default map");
        this.d.a(new ConfigContainer(DataProcessingFactory.a(map)));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void applyDefault(int i) {
        Logger.v("AGConnectConfig", "apply default resources");
        this.d.a(new ConfigContainer(DataProcessingFactory.a(i)));
    }

    @Override // com.huawei.agconnect.remoteconfig.AGConnectConfig
    public void apply(ConfigValues configValues) {
        Logger.v("AGConnectConfig", "apply config values");
        if (this.f != configValues) {
            throw new IllegalArgumentException("only can apply last fetched config values");
        }
        ConfigValuesImpl configValuesImpl = (ConfigValuesImpl) configValues;
        if (configValuesImpl.b() != null) {
            this.e.a(configValuesImpl.b());
            try {
                if (this.e.b().a() != null) {
                    Logger.v("AGConnectConfig", "replace experiments");
                    this.f5043c.replaceAllExperiments(this.e.b().a());
                }
            } catch (ABTestException e) {
                Logger.e("RemoteConfig", "ab test exception", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<ConfigValues> b(long j) {
        Logger.i("AGConnectConfig", "fetch : " + j);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (j <= 1) {
            j = 1;
        }
        Logger.i("AGConnectConfig", "isDeveloperMode:" + this.f5041a);
        if (!this.f5041a) {
            j = Math.max(j, 1800L);
        }
        ConfigContainer configContainerB = this.f.b();
        if (configContainerB == null || configContainerB.a(j)) {
            String strC = configContainerB != null ? configContainerB.c() : "";
            Logger.i("AGConnectConfig", "config send fetch request");
            this.i.getConfigFromRemote(strC, this.h.a()).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener<ConfigContainer>() { // from class: com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl.5
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ConfigContainer configContainer) {
                    Logger.v("AGConnectConfig", "fetch success");
                    AGConnectConfigImpl.this.f.a(configContainer);
                    taskCompletionSource.setResult(AGConnectConfigImpl.this.f);
                }
            }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl.4
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    Logger.v("AGConnectConfig", "fetch failure");
                    if (!(exc instanceof AGCConfigException) || ((AGCConfigException) exc).getCode() != 204091393) {
                        taskCompletionSource.setException(exc);
                        return;
                    }
                    Logger.i("AGConnectConfig", "data not modified");
                    ConfigContainer configContainerB2 = AGConnectConfigImpl.this.f.b();
                    if (configContainerB2 != null) {
                        configContainerB2.b(System.currentTimeMillis());
                        AGConnectConfigImpl.this.f.a(configContainerB2);
                    }
                    taskCompletionSource.setResult(AGConnectConfigImpl.this.f);
                }
            });
        } else {
            Logger.i("AGConnectConfig", "config use cache");
            taskCompletionSource.setResult(this.f);
        }
        return taskCompletionSource.getTask();
    }

    private long a(long j) {
        return (long) (j * ((new SecureRandom().nextInt(1000) + 1) / 1000.0f));
    }

    public AGConnectConfigImpl(Context context, AGConnectInstance aGConnectInstance) {
        ConfigValuesImpl configValuesImpl = new ConfigValuesImpl("defaultConfigValues", aGConnectInstance);
        this.d = configValuesImpl;
        ConfigValuesImpl configValuesImpl2 = new ConfigValuesImpl("appliedConfigValues", aGConnectInstance);
        this.e = configValuesImpl2;
        this.f = new ConfigValuesImpl("unusedConfigValues", aGConnectInstance);
        this.i = new RemoteConfigBackend(aGConnectInstance);
        this.f5043c = AGConnectABTesting.get(context, "REMOTE_CONFIG");
        this.g = new GetMergedValueHandler(configValuesImpl2, configValuesImpl);
        this.h = new StoredCustomAttributes(aGConnectInstance);
        this.j = new Handler(Looper.getMainLooper());
    }
}
