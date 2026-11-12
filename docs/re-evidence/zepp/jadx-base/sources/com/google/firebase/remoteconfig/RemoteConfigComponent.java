package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class RemoteConfigComponent {
    public static final String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60;
    public static final String DEFAULTS_FILE_NAME = "defaults";

    @VisibleForTesting
    public static final String DEFAULT_NAMESPACE = "firebase";
    public static final String FETCH_FILE_NAME = "fetch";
    private static final String j = "frc";
    private static final String k = "settings";
    private static final Clock l = DefaultClock.getInstance();
    private static final Random m = new Random();

    @GuardedBy("this")
    private final Map<String, FirebaseRemoteConfig> a;
    private final Context b;
    private final ExecutorService c;
    private final FirebaseApp d;
    private final FirebaseInstallationsApi e;
    private final FirebaseABTesting f;

    @Nullable
    private final Provider<AnalyticsConnector> g;
    private final String h;

    @GuardedBy("this")
    private Map<String, String> i;

    public RemoteConfigComponent(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider) {
        this(context, Executors.newCachedThreadPool(), firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    private ConfigCacheClient c(String str, String str2) {
        return ConfigCacheClient.getInstance(Executors.newCachedThreadPool(), ConfigStorageClient.getInstance(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    private ConfigGetParameterHandler g(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.c, configCacheClient, configCacheClient2);
    }

    @VisibleForTesting
    public static ConfigMetadataClient h(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, k), 0));
    }

    @Nullable
    private static Personalization i(FirebaseApp firebaseApp, String str, Provider<AnalyticsConnector> provider) {
        if (k(firebaseApp) && str.equals(DEFAULT_NAMESPACE)) {
            return new Personalization(provider);
        }
        return null;
    }

    private static boolean j(FirebaseApp firebaseApp, String str) {
        return str.equals(DEFAULT_NAMESPACE) && k(firebaseApp);
    }

    private static boolean k(FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnalyticsConnector l() {
        return null;
    }

    @VisibleForTesting
    public synchronized FirebaseRemoteConfig b(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        if (!this.a.containsKey(str)) {
            FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(this.b, firebaseApp, firebaseInstallationsApi, j(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient);
            firebaseRemoteConfig.u();
            this.a.put(str, firebaseRemoteConfig);
        }
        return this.a.get(str);
    }

    public FirebaseRemoteConfig d() {
        return get(DEFAULT_NAMESPACE);
    }

    @VisibleForTesting
    public synchronized ConfigFetchHandler e(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHandler(this.e, k(this.d) ? this.g : new Provider() { // from class: ib6
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return RemoteConfigComponent.l();
            }
        }, this.c, l, m, configCacheClient, f(this.d.getOptions().getApiKey(), str, configMetadataClient), configMetadataClient, this.i);
    }

    @VisibleForTesting
    public ConfigFetchHttpClient f(String str, String str2, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHttpClient(this.b, this.d.getOptions().getApplicationId(), str, str2, configMetadataClient.getFetchTimeoutInSeconds(), configMetadataClient.getFetchTimeoutInSeconds());
    }

    @KeepForSdk
    @VisibleForTesting
    public synchronized FirebaseRemoteConfig get(String str) {
        ConfigCacheClient configCacheClientC;
        ConfigCacheClient configCacheClientC2;
        ConfigCacheClient configCacheClientC3;
        ConfigMetadataClient configMetadataClientH;
        ConfigGetParameterHandler configGetParameterHandlerG;
        configCacheClientC = c(str, FETCH_FILE_NAME);
        configCacheClientC2 = c(str, ACTIVATE_FILE_NAME);
        configCacheClientC3 = c(str, DEFAULTS_FILE_NAME);
        configMetadataClientH = h(this.b, this.h, str);
        configGetParameterHandlerG = g(configCacheClientC2, configCacheClientC3);
        final Personalization personalizationI = i(this.d, str, this.g);
        if (personalizationI != null) {
            configGetParameterHandlerG.addListener(new BiConsumer() { // from class: hb6
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    personalizationI.logArmActive((String) obj, (ConfigContainer) obj2);
                }
            });
        }
        return b(this.d, str, this.e, this.f, this.c, configCacheClientC, configCacheClientC2, configCacheClientC3, e(str, configCacheClientC, configMetadataClientH), configGetParameterHandlerG, configMetadataClientH);
    }

    @VisibleForTesting
    public synchronized void setCustomHeaders(Map<String, String> map) {
        this.i = map;
    }

    @VisibleForTesting
    public RemoteConfigComponent(Context context, ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executorService;
        this.d = firebaseApp;
        this.e = firebaseInstallationsApi;
        this.f = firebaseABTesting;
        this.g = provider;
        this.h = firebaseApp.getOptions().getApplicationId();
        if (z) {
            Tasks.call(executorService, new Callable() { // from class: jb6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d();
                }
            });
        }
    }
}
