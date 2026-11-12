package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessManager;", "", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "onActivityPaused", "onActivityDestroyed", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "", "applicationId", "checkCodelessSession$facebook_core_release", "(Ljava/lang/String;)V", "checkCodelessSession", "", "isDebugOnEmulator$facebook_core_release", "()Z", "isDebugOnEmulator", "getCurrentDeviceSessionID$facebook_core_release", "()Ljava/lang/String;", "getCurrentDeviceSessionID", "getIsAppIndexingEnabled$facebook_core_release", "getIsAppIndexingEnabled", "appIndexingEnabled", "updateAppIndexing$facebook_core_release", "(Z)V", "updateAppIndexing", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "a", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "viewIndexingTrigger", "Landroid/hardware/SensorManager;", "b", "Landroid/hardware/SensorManager;", "sensorManager", "Lcom/facebook/appevents/codeless/ViewIndexer;", "c", "Lcom/facebook/appevents/codeless/ViewIndexer;", "viewIndexer", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "deviceSessionID", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "f", "isAppIndexingEnabled", "g", "Z", "isCheckingSession", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CodelessManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static SensorManager sensorManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static ViewIndexer viewIndexer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static String deviceSessionID;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static volatile boolean isCheckingSession;

    @NotNull
    public static final CodelessManager INSTANCE = new CodelessManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                boolean z = true;
                GraphRequest graphRequestNewPostRequest = companion.newPostRequest(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{this.a}, 1)), null, null);
                Bundle parameters = graphRequestNewPostRequest.getParameters();
                if (parameters == null) {
                    parameters = new Bundle();
                }
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
                JSONArray jSONArray = new JSONArray();
                String str = Build.MODEL;
                if (str == null) {
                    str = "";
                }
                jSONArray.put(str);
                if ((attributionIdentifiers != null ? attributionIdentifiers.getAndroidAdvertiserId() : null) != null) {
                    jSONArray.put(attributionIdentifiers.getAndroidAdvertiserId());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                jSONArray.put(AppEventUtility.isEmulator() ? "1" : "0");
                Locale currentLocale = Utility.getCurrentLocale();
                jSONArray.put(currentLocale.getLanguage() + "_" + currentLocale.getCountry());
                String string = jSONArray.toString();
                parameters.putString(Constants.DEVICE_SESSION_ID, CodelessManager.getCurrentDeviceSessionID$facebook_core_release());
                parameters.putString(Constants.EXTINFO, string);
                graphRequestNewPostRequest.setParameters(parameters);
                JSONObject graphObject = graphRequestNewPostRequest.executeAndWait().getGraphObject();
                CodelessManager codelessManager = CodelessManager.INSTANCE;
                AtomicBoolean atomicBooleanAccess$isAppIndexingEnabled$p = CodelessManager.access$isAppIndexingEnabled$p(codelessManager);
                if (graphObject == null || !graphObject.optBoolean(Constants.APP_INDEXING_ENABLED, false)) {
                    z = false;
                }
                atomicBooleanAccess$isAppIndexingEnabled$p.set(z);
                if (CodelessManager.access$isAppIndexingEnabled$p(codelessManager).get()) {
                    ViewIndexer viewIndexerAccess$getViewIndexer$p = CodelessManager.access$getViewIndexer$p(codelessManager);
                    if (viewIndexerAccess$getViewIndexer$p != null) {
                        viewIndexerAccess$getViewIndexer$p.schedule();
                    }
                } else {
                    CodelessManager.access$setDeviceSessionID$p(codelessManager, null);
                }
                CodelessManager.access$setCheckingSession$p(codelessManager, false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "onShake", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements ViewIndexingTrigger.OnShakeListener {
        public final /* synthetic */ FetchedAppSettings a;
        public final /* synthetic */ String b;

        public b(FetchedAppSettings fetchedAppSettings, String str) {
            this.a = fetchedAppSettings;
            this.b = str;
        }

        @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
        public final void onShake() {
            FetchedAppSettings fetchedAppSettings = this.a;
            boolean z = fetchedAppSettings != null && fetchedAppSettings.getCodelessEventsEnabled();
            boolean z2 = FacebookSdk.getCodelessSetupEnabled();
            if (z && z2) {
                CodelessManager.checkCodelessSession$facebook_core_release(this.b);
            }
        }
    }

    private CodelessManager() {
    }

    public static final /* synthetic */ String access$getDeviceSessionID$p(CodelessManager codelessManager) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            return deviceSessionID;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    public static final /* synthetic */ ViewIndexer access$getViewIndexer$p(CodelessManager codelessManager) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            return viewIndexer;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isAppIndexingEnabled$p(CodelessManager codelessManager) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            return isAppIndexingEnabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isCheckingSession$p(CodelessManager codelessManager) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return false;
        }
        try {
            return isCheckingSession;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return false;
        }
    }

    public static final /* synthetic */ void access$setCheckingSession$p(CodelessManager codelessManager, boolean z) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCheckingSession = z;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final /* synthetic */ void access$setDeviceSessionID$p(CodelessManager codelessManager, String str) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            deviceSessionID = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final /* synthetic */ void access$setViewIndexer$p(CodelessManager codelessManager, ViewIndexer viewIndexer2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            viewIndexer = viewIndexer2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void checkCodelessSession$facebook_core_release(@Nullable String applicationId) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            FacebookSdk.getExecutor().execute(new a(applicationId));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentDeviceSessionID$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean getIsAppIndexingEnabled$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean isDebugOnEmulator$facebook_core_release() {
        CrashShieldHandler.isObjectCrashing(CodelessManager.class);
        return false;
    }

    @JvmStatic
    public static final void onActivityDestroyed(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            CodelessMatcher.INSTANCE.getInstance().destroy(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void onActivityPaused(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().remove(activity);
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.unschedule();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void onActivityResumed(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().add(activity);
                Context applicationContext = activity.getApplicationContext();
                String applicationId = FacebookSdk.getApplicationId();
                FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                if ((appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) || isDebugOnEmulator$facebook_core_release()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    sensorManager = sensorManager2;
                    if (sensorManager2 == null) {
                        return;
                    }
                    if (sensorManager2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    viewIndexer = new ViewIndexer(activity);
                    ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                    viewIndexingTrigger2.setOnShakeListener(new b(appSettingsWithoutQuery, applicationId));
                    SensorManager sensorManager3 = sensorManager;
                    if (sensorManager3 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    sensorManager3.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                    if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        ViewIndexer viewIndexer2 = viewIndexer;
                        if (viewIndexer2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        viewIndexer2.schedule();
                    }
                }
                if (!isDebugOnEmulator$facebook_core_release() || isAppIndexingEnabled.get()) {
                    return;
                }
                checkCodelessSession$facebook_core_release(applicationId);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @JvmStatic
    public static final void updateAppIndexing$facebook_core_release(boolean appIndexingEnabled) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }
}
