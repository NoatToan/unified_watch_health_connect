package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0007J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0019\u001a\u00020\u0012H\u0007J\b\u0010\u001a\u001a\u00020\u0012H\u0007J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u001c\u001a\u00020\u0012H\u0007R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010(\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010)\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00104\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u001eR\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u001eR\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u001eR\u0016\u0010>\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010\u001eR\u0016\u0010@\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010\u001eR\u0016\u0010B\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010\u001eR\u0016\u0010D\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010\u001eR\u0016\u0010F\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010\u001e¨\u0006I"}, d2 = {"Lcom/facebook/UserSettingsManager;", "", "", "b", "", "Lcom/facebook/UserSettingsManager$a;", "userSettings", "c", "([Lcom/facebook/UserSettingsManager$a;)V", "a", "userSetting", "i", "g", GoogleApiAvailabilityLight.a, "f", "e", "logIfAutoAppLinkEnabled", "h", "", "flag", "setAutoInitEnabled", "getAutoInitEnabled", "setAutoLogAppEventsEnabled", "getAutoLogAppEventsEnabled", "setAdvertiserIDCollectionEnabled", "getAdvertiserIDCollectionEnabled", "getCodelessSetupEnabled", "setMonitorEnabled", "getMonitorEnabled", "", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "isFetchingCodelessStatus", "EVENTS_CODELESS_SETUP_ENABLED", "", "J", "TIMEOUT_7D", "ADVERTISER_ID_KEY", "APPLICATION_FIELDS", "Lcom/facebook/UserSettingsManager$a;", "autoInitEnabled", "autoLogAppEventsEnabled", z.j, "advertiserIDCollectionEnabled", hl.k, "codelessSetupEnabled", "l", "monitorEnabled", "m", "USER_SETTINGS", GoogleApiAvailabilityLight.b, "USER_SETTINGS_BITMASK", "Landroid/content/SharedPreferences;", "o", "Landroid/content/SharedPreferences;", "userSettingPref", com.google.android.exoplayer2.text.ttml.b.r, "LAST_TIMESTAMP", DTransferConstants.SEARCH_KEY, "VALUE", "r", "AUTOLOG_APPEVENT_NOT_SET_WARNING", SOAP.XMLNS, "ADVERTISERID_COLLECTION_NOT_SET_WARNING", "t", "ADVERTISERID_COLLECTION_FALSE_WARNING", "u", "AUTO_APP_LINK_WARNING", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UserSettingsManager {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final long TIMEOUT_7D = 604800000;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String ADVERTISER_ID_KEY = "advertiser_id";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String APPLICATION_FIELDS = "fields";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static SharedPreferences userSettingPref = null;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final String LAST_TIMESTAMP = "last_timestamp";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final String VALUE = "value";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final String AUTOLOG_APPEVENT_NOT_SET_WARNING = "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";

    @NotNull
    public static final UserSettingsManager INSTANCE = new UserSettingsManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = UserSettingsManager.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final a autoInitEnabled = new a(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final a autoLogAppEventsEnabled = new a(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final a advertiserIDCollectionEnabled = new a(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final a codelessSetupEnabled = new a(false, EVENTS_CODELESS_SETUP_ENABLED);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final a monitorEnabled = new a(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"com/facebook/UserSettingsManager$a", "", "", "e", "a", "Ljava/lang/Boolean;", GoogleApiAvailabilityLight.a, "()Ljava/lang/Boolean;", "i", "(Ljava/lang/Boolean;)V", "value", "", "b", "J", "c", "()J", "h", "(J)V", "lastTS", "Z", "()Z", "f", "(Z)V", "defaultVal", "", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "key", "<init>", "(ZLjava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Boolean value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long lastTS;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean defaultVal;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private String key;

        public a(boolean z, @NotNull String str) {
            this.defaultVal = z;
            this.key = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getLastTS() {
            return this.lastTS;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        public final boolean e() {
            Boolean bool = this.value;
            return bool != null ? bool.booleanValue() : this.defaultVal;
        }

        public final void f(boolean z) {
            this.defaultVal = z;
        }

        public final void g(@NotNull String str) {
            this.key = str;
        }

        public final void h(long j) {
            this.lastTS = j;
        }

        public final void i(@Nullable Boolean bool) {
            this.value = bool;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ long a;

        public b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings;
            JSONObject graphObject;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
                if (UserSettingsManager.access$getAdvertiserIDCollectionEnabled$p(userSettingsManager).e() && (fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false)) != null && fetchedAppSettingsQueryAppSettings.getCodelessEventsEnabled()) {
                    AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
                    String androidAdvertiserId = (attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null) ? null : attributionIdentifiers.getAndroidAdvertiserId();
                    if (androidAdvertiserId != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(UserSettingsManager.ADVERTISER_ID_KEY, androidAdvertiserId);
                        bundle.putString("fields", UserSettingsManager.EVENTS_CODELESS_SETUP_ENABLED);
                        if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
                            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, FacebookSdk.getApplicationId(), null);
                            graphRequestNewGraphPathRequest.setSkipClientToken(true);
                            graphRequestNewGraphPathRequest.setParameters(bundle);
                            graphObject = graphRequestNewGraphPathRequest.executeAndWait().getGraphObject();
                        } else {
                            GraphRequest graphRequestNewGraphPathRequest2 = GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
                            graphRequestNewGraphPathRequest2.setParameters(bundle);
                            graphObject = graphRequestNewGraphPathRequest2.executeAndWait().getGraphObject();
                        }
                        if (graphObject != null) {
                            UserSettingsManager.access$getCodelessSetupEnabled$p(userSettingsManager).i(Boolean.valueOf(graphObject.optBoolean(UserSettingsManager.EVENTS_CODELESS_SETUP_ENABLED, false)));
                            UserSettingsManager.access$getCodelessSetupEnabled$p(userSettingsManager).h(this.a);
                            UserSettingsManager.access$writeSettingToCache(userSettingsManager, UserSettingsManager.access$getCodelessSetupEnabled$p(userSettingsManager));
                        }
                    }
                }
                UserSettingsManager.access$isFetchingCodelessStatus$p(userSettingsManager).set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private UserSettingsManager() {
    }

    private final void a() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            a aVar = codelessSetupEnabled;
            g(aVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.getValue() == null || jCurrentTimeMillis - aVar.getLastTS() >= TIMEOUT_7D) {
                aVar.i(null);
                aVar.h(0L);
                if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                    FacebookSdk.getExecutor().execute(new b(jCurrentTimeMillis));
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final /* synthetic */ a access$getAdvertiserIDCollectionEnabled$p(UserSettingsManager userSettingsManager) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return null;
        }
        try {
            return advertiserIDCollectionEnabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return null;
        }
    }

    public static final /* synthetic */ a access$getCodelessSetupEnabled$p(UserSettingsManager userSettingsManager) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return null;
        }
        try {
            return codelessSetupEnabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isFetchingCodelessStatus$p(UserSettingsManager userSettingsManager) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return null;
        }
        try {
            return isFetchingCodelessStatus;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$writeSettingToCache(UserSettingsManager userSettingsManager, a aVar) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            userSettingsManager.i(aVar);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    private final void b() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (FacebookSdk.isInitialized() && isInitialized.compareAndSet(false, true)) {
                userSettingPref = FacebookSdk.getApplicationContext().getSharedPreferences(USER_SETTINGS, 0);
                c(autoLogAppEventsEnabled, advertiserIDCollectionEnabled, autoInitEnabled);
                a();
                f();
                e();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void c(a... userSettings) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (a aVar : userSettings) {
                if (aVar == codelessSetupEnabled) {
                    a();
                } else if (aVar.getValue() == null) {
                    g(aVar);
                    if (aVar.getValue() == null) {
                        d(aVar);
                    }
                } else {
                    i(aVar);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void d(a userSetting) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            h();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.containsKey(userSetting.getKey())) {
                    return;
                }
                userSetting.i(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
                return;
            } catch (PackageManager.NameNotFoundException e) {
                Utility.logd(TAG, e);
                return;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        CrashShieldHandler.handleThrowable(th, this);
    }

    private final void e() {
        int i;
        int i2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get() && FacebookSdk.isInitialized()) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                int i3 = 0;
                int i4 = ((autoInitEnabled.e() ? 1 : 0) << 0) | 0 | ((autoLogAppEventsEnabled.e() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.e() ? 1 : 0) << 2) | ((monitorEnabled.e() ? 1 : 0) << 3);
                int i5 = userSettingPref.getInt(USER_SETTINGS_BITMASK, 0);
                if (i5 != i4) {
                    userSettingPref.edit().putInt(USER_SETTINGS_BITMASK, i4).apply();
                    try {
                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                        if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                            String[] strArr = {FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, FacebookSdk.MONITOR_ENABLED_PROPERTY};
                            boolean[] zArr = {true, true, true, true};
                            i2 = 0;
                            i = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                try {
                                    i |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i3 = i2;
                                    i2 = i3;
                                    i3 = i;
                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i3);
                                    bundle.putInt("initial", i2);
                                    bundle.putInt("previous", i5);
                                    bundle.putInt("current", i4);
                                    internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                }
                            }
                            i3 = i;
                        } else {
                            i2 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i3);
                    bundle2.putInt("initial", i2);
                    bundle2.putInt("previous", i5);
                    bundle2.putInt("current", i4);
                    internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void f() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                if (!applicationInfo.metaData.containsKey(FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY)) {
                    Log.w(TAG, AUTOLOG_APPEVENT_NOT_SET_WARNING);
                }
                if (!applicationInfo.metaData.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                    Log.w(TAG, ADVERTISERID_COLLECTION_NOT_SET_WARNING);
                }
                if (getAdvertiserIDCollectionEnabled()) {
                    return;
                }
                Log.w(TAG, ADVERTISERID_COLLECTION_FALSE_WARNING);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void g(a userSetting) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            h();
            try {
                String string = userSettingPref.getString(userSetting.getKey(), "");
                String str = string != null ? string : "";
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.i(Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.h(jSONObject.getLong(LAST_TIMESTAMP));
                    return;
                }
                return;
            } catch (JSONException e) {
                Utility.logd(TAG, e);
                return;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        CrashShieldHandler.handleThrowable(th, this);
    }

    @JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.b();
            return advertiserIDCollectionEnabled.e();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean getAutoInitEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.b();
            return autoInitEnabled.e();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.b();
            return autoLogAppEventsEnabled.e();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.b();
            return codelessSetupEnabled.e();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean getMonitorEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.b();
            return monitorEnabled.e();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
            return false;
        }
    }

    private final void h() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void i(a userSetting) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            h();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put(LAST_TIMESTAMP, userSetting.getLastTS());
                userSettingPref.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                e();
            } catch (Exception e) {
                Utility.logd(TAG, e);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final void logIfAutoAppLinkEnabled() {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
            Bundle bundle = new Bundle();
            if (!Utility.isAutoAppLinkSetup()) {
                bundle.putString("SchemeWarning", AUTO_APP_LINK_WARNING);
                Log.w(TAG, AUTO_APP_LINK_WARNING);
            }
            internalAppEventsLogger.logEvent("fb_auto_applink", bundle);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    @JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            a aVar = advertiserIDCollectionEnabled;
            aVar.i(Boolean.valueOf(flag));
            aVar.h(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.i(aVar);
            } else {
                INSTANCE.b();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    @JvmStatic
    public static final void setAutoInitEnabled(boolean flag) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            a aVar = autoInitEnabled;
            aVar.i(Boolean.valueOf(flag));
            aVar.h(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.i(aVar);
            } else {
                INSTANCE.b();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    @JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            a aVar = autoLogAppEventsEnabled;
            aVar.i(Boolean.valueOf(flag));
            aVar.h(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.i(aVar);
            } else {
                INSTANCE.b();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }

    @JvmStatic
    public static final void setMonitorEnabled(boolean flag) {
        if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
            return;
        }
        try {
            a aVar = monitorEnabled;
            aVar.i(Boolean.valueOf(flag));
            aVar.h(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.i(aVar);
            } else {
                INSTANCE.b();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, UserSettingsManager.class);
        }
    }
}
