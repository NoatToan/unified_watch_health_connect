package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsRequest;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.google.firebase.crashlytics.internal.settings.network.SettingsSpiCall;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SettingsController implements SettingsDataProvider {
    private static final String j = "existing_instance_identifier";
    private static final String k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final Context a;
    private final SettingsRequest b;
    private final SettingsJsonParser c;
    private final CurrentTimeProvider d;
    private final CachedSettingsIo e;
    private final SettingsSpiCall f;
    private final DataCollectionArbiter g;
    private final AtomicReference<Settings> h;
    private final AtomicReference<TaskCompletionSource<AppSettingsData>> i;

    public class a implements SuccessContinuation<Void, Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@Nullable Void r5) throws Exception {
            JSONObject jSONObjectInvoke = SettingsController.this.f.invoke(SettingsController.this.b, true);
            if (jSONObjectInvoke != null) {
                SettingsData settingsJson = SettingsController.this.c.parseSettingsJson(jSONObjectInvoke);
                SettingsController.this.e.writeCachedSettings(settingsJson.getExpiresAtMillis(), jSONObjectInvoke);
                SettingsController.this.l(jSONObjectInvoke, "Loaded settings: ");
                SettingsController settingsController = SettingsController.this;
                settingsController.m(settingsController.b.instanceId);
                SettingsController.this.h.set(settingsJson);
                ((TaskCompletionSource) SettingsController.this.i.get()).trySetResult(settingsJson.getAppSettingsData());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.trySetResult(settingsJson.getAppSettingsData());
                SettingsController.this.i.set(taskCompletionSource);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = settingsRequest;
        this.d = currentTimeProvider;
        this.c = settingsJsonParser;
        this.e = cachedSettingsIo;
        this.f = settingsSpiCall;
        this.g = dataCollectionArbiter;
        atomicReference.set(com.google.firebase.crashlytics.internal.settings.a.f(currentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new SettingsRequest(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new DefaultSettingsSpiCall(String.format(Locale.US, k, str), httpRequestFactory), dataCollectionArbiter);
    }

    private SettingsData j(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        SettingsData settingsData = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject cachedSettings = this.e.readCachedSettings();
                if (cachedSettings != null) {
                    SettingsData settingsJson = this.c.parseSettingsJson(cachedSettings);
                    if (settingsJson != null) {
                        l(cachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.d.getCurrentTimeMillis();
                        if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) || !settingsJson.isExpired(currentTimeMillis)) {
                            try {
                                Logger.getLogger().v("Returning cached settings.");
                                settingsData = settingsJson;
                            } catch (Exception e) {
                                e = e;
                                settingsData = settingsJson;
                                Logger.getLogger().e("Failed to get cached settings", e);
                            }
                        } else {
                            Logger.getLogger().v("Cached settings have expired.");
                        }
                    } else {
                        Logger.getLogger().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    Logger.getLogger().d("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return settingsData;
    }

    private String k() {
        return CommonUtils.getSharedPrefs(this.a).getString(j, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(JSONObject jSONObject, String str) throws JSONException {
        Logger.getLogger().d(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean m(String str) {
        SharedPreferences.Editor editorEdit = CommonUtils.getSharedPrefs(this.a).edit();
        editorEdit.putString(j, str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public Task<AppSettingsData> getAppSettings() {
        return this.i.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public Settings getSettings() {
        return this.h.get();
    }

    public boolean i() {
        return !k().equals(this.b.instanceId);
    }

    public Task<Void> loadSettingsData(Executor executor) {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE, executor);
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, Executor executor) throws Throwable {
        SettingsData settingsDataJ;
        if (!i() && (settingsDataJ = j(settingsCacheBehavior)) != null) {
            this.h.set(settingsDataJ);
            this.i.get().trySetResult(settingsDataJ.getAppSettingsData());
            return Tasks.forResult(null);
        }
        SettingsData settingsDataJ2 = j(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (settingsDataJ2 != null) {
            this.h.set(settingsDataJ2);
            this.i.get().trySetResult(settingsDataJ2.getAppSettingsData());
        }
        return this.g.waitForDataCollectionPermission(executor).onSuccessTask(executor, new a());
    }
}
