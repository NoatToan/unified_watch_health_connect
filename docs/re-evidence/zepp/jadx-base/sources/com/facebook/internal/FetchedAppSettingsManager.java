package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002hiB\t\b\u0002¢\u0006\u0004\bf\u0010gJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u0002028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u001cR\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u001cR\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u001cR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u001cR\u0016\u0010G\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010\u001cR\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010\u001cR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040J8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010\u001cR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010X\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010T0T0S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006j"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "", "loadAppSettingsAsync", "", "applicationId", "Lcom/facebook/internal/FetchedAppSettings;", "getAppSettingsWithoutQuery", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "callback", "getAppSettingsAsync", "c", "", "forceRequery", "queryAppSettings", "flag", "setIsUnityInit", "Lorg/json/JSONObject;", "a", "dialogConfigResponse", "", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "b", "settingsJSON", "parseAppSettingsFromJSON$facebook_core_release", "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/FetchedAppSettings;", "parseAppSettingsFromJSON", "Ljava/lang/String;", "TAG", "APP_SETTINGS_PREFS_STORE", "APP_SETTINGS_PREFS_KEY_FORMAT", GoogleApiAvailabilityLight.a, "APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING", "e", "APP_SETTING_NUX_CONTENT", "f", "APP_SETTING_NUX_ENABLED", "g", "APP_SETTING_DIALOG_CONFIGS", "h", "APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES", "i", "APP_SETTING_APP_EVENTS_SESSION_TIMEOUT", z.j, "APP_SETTING_APP_EVENTS_FEATURE_BITMASK", hl.k, "APP_SETTING_APP_EVENTS_EVENT_BINDINGS", "l", "APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD", "", "m", LogUtil.I, "AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", GoogleApiAvailabilityLight.b, "IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "o", "CODELESS_EVENTS_ENABLED_BITMASK_FIELD", com.google.android.exoplayer2.text.ttml.b.r, "TRACK_UNINSTALL_ENABLED_BITMASK_FIELD", DTransferConstants.SEARCH_KEY, "MONITOR_ENABLED_BITMASK_FIELD", "r", "APP_SETTING_SMART_LOGIN_OPTIONS", SOAP.XMLNS, "SMART_LOGIN_BOOKMARK_ICON_URL", "t", "SMART_LOGIN_MENU_ICON_URL", "u", "SDK_UPDATE_MESSAGE", "v", "APP_SETTING_APP_EVENTS_AAM_RULE", "w", "SUGGESTED_EVENTS_SETTING", "", "x", "Ljava/util/List;", "APP_SETTING_FIELDS", "y", "APPLICATION_FIELDS", "z", "Ljava/util/Map;", "fetchedAppSettings", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "kotlin.jvm.PlatformType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/util/concurrent/atomic/AtomicReference;", "loadingState", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "B", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchedAppSettingsCallbacks", "C", "Z", "printedSDKUpdatedMessage", LogUtil.D, "isUnityInit", "Lorg/json/JSONArray;", "E", "Lorg/json/JSONArray;", "unityEventBindings", "<init>", "()V", "FetchAppSettingState", "FetchedAppSettingsCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static boolean printedSDKUpdatedMessage = false;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static boolean isUnityInit = false;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static JSONArray unityEventBindings = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final String APPLICATION_FIELDS = "fields";

    @NotNull
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = FetchedAppSettingsManager.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final List<String> APP_SETTING_FIELDS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING});

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", com.alipay.sdk.m.f0.c.p, ContentDirectory.ERROR, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettings", "", "onSuccess", "onError", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(@Nullable FetchedAppSettings fetchedAppSettings);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences(FetchedAppSettingsManager.APP_SETTINGS_PREFS_STORE, 0);
                FetchedAppSettings appSettingsFromJSON$facebook_core_release = null;
                String string = sharedPreferences.getString(this.b, null);
                if (!Utility.isNullOrEmpty(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e) {
                        Utility.logd(Utility.LOG_TAG, e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        appSettingsFromJSON$facebook_core_release = FetchedAppSettingsManager.INSTANCE.parseAppSettingsFromJSON$facebook_core_release(this.c, jSONObject);
                    }
                }
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                JSONObject jSONObjectA = fetchedAppSettingsManager.a(this.c);
                if (jSONObjectA != null) {
                    fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(this.c, jSONObjectA);
                    sharedPreferences.edit().putString(this.b, jSONObjectA.toString()).apply();
                }
                if (appSettingsFromJSON$facebook_core_release != null) {
                    String sdkUpdateMessage = appSettingsFromJSON$facebook_core_release.getSdkUpdateMessage();
                    if (!FetchedAppSettingsManager.access$getPrintedSDKUpdatedMessage$p(fetchedAppSettingsManager) && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                        FetchedAppSettingsManager.printedSDKUpdatedMessage = true;
                        Log.w(FetchedAppSettingsManager.access$getTAG$p(fetchedAppSettingsManager), sdkUpdateMessage);
                    }
                }
                FetchedAppGateKeepersManager.queryAppGateKeepers(this.c, true);
                AutomaticAnalyticsLogger.logActivateAppEvent();
                FetchedAppSettingsManager.access$getLoadingState$p(fetchedAppSettingsManager).set(FetchedAppSettingsManager.access$getFetchedAppSettings$p(fetchedAppSettingsManager).containsKey(this.c) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
                fetchedAppSettingsManager.c();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ FetchedAppSettingsCallback a;

        public b(FetchedAppSettingsCallback fetchedAppSettingsCallback) {
            this.a = fetchedAppSettingsCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                this.a.onError();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements Runnable {
        public final /* synthetic */ FetchedAppSettingsCallback a;
        public final /* synthetic */ FetchedAppSettings b;

        public c(FetchedAppSettingsCallback fetchedAppSettingsCallback, FetchedAppSettings fetchedAppSettings) {
            this.a = fetchedAppSettingsCallback;
            this.b = fetchedAppSettings;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                this.a.onSuccess(this.b);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private FetchedAppSettingsManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject a(String applicationId) {
        GraphRequest graphRequestNewGraphPathRequest;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
            graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, applicationId, null);
            graphRequestNewGraphPathRequest.setForceApplicationRequest(true);
            graphRequestNewGraphPathRequest.setSkipClientToken(true);
            graphRequestNewGraphPathRequest.setParameters(bundle);
        } else {
            graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
            graphRequestNewGraphPathRequest.setForceApplicationRequest(true);
            graphRequestNewGraphPathRequest.setParameters(bundle);
        }
        JSONObject jsonObject = graphRequestNewGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject != null ? jsonObject : new JSONObject();
    }

    public static final /* synthetic */ Map access$getFetchedAppSettings$p(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return fetchedAppSettings;
    }

    public static final /* synthetic */ AtomicReference access$getLoadingState$p(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return loadingState;
    }

    public static final /* synthetic */ boolean access$getPrintedSDKUpdatedMessage$p(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return printedSDKUpdatedMessage;
    }

    public static final /* synthetic */ String access$getTAG$p(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return TAG;
    }

    private final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> b(JSONObject dialogConfigResponse) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (dialogConfigResponse != null && (jSONArrayOptJSONArray = dialogConfigResponse.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                FetchedAppSettings.DialogFeatureConfig dialogConfig = FetchedAppSettings.DialogFeatureConfig.INSTANCE.parseDialogConfig(jSONArrayOptJSONArray.optJSONObject(i));
                if (dialogConfig != null) {
                    String dialogName = dialogConfig.getDialogName();
                    Map map2 = (Map) map.get(dialogName);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(dialogName, map2);
                    }
                    map2.put(dialogConfig.getFeatureName(), dialogConfig);
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(FacebookSdk.getApplicationId());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new b(concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new c(concurrentLinkedQueue2.poll(), fetchedAppSettings2));
                    }
                }
            }
        }
    }

    @JvmStatic
    public static final void getAppSettingsAsync(@NotNull FetchedAppSettingsCallback callback) {
        fetchedAppSettingsCallbacks.add(callback);
        loadAppSettingsAsync();
    }

    @JvmStatic
    @Nullable
    public static final FetchedAppSettings getAppSettingsWithoutQuery(@Nullable String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    @JvmStatic
    public static final void loadAppSettingsAsync() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.c();
            return;
        }
        if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.c();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!(atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState2) || atomicReference.compareAndSet(FetchAppSettingState.ERROR, fetchAppSettingState2))) {
            INSTANCE.c();
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            FacebookSdk.getExecutor().execute(new a(applicationContext, String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1)), applicationId));
        }
    }

    @JvmStatic
    @Nullable
    public static final FetchedAppSettings queryAppSettings(@NotNull String applicationId, boolean forceRequery) {
        if (!forceRequery) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject jSONObjectA = fetchedAppSettingsManager.a(applicationId);
        if (jSONObjectA == null) {
            return null;
        }
        FetchedAppSettings appSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, jSONObjectA);
        if (Intrinsics.areEqual(applicationId, FacebookSdk.getApplicationId())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.c();
        }
        return appSettingsFromJSON$facebook_core_release;
    }

    @JvmStatic
    public static final void setIsUnityInit(boolean flag) {
        isUnityInit = flag;
        JSONArray jSONArray = unityEventBindings;
        if (jSONArray == null || !flag) {
            return;
        }
        UnityReflection.sendEventMapping(String.valueOf(jSONArray));
    }

    @NotNull
    public final FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(@NotNull String applicationId, @NotNull JSONObject settingsJSON) {
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES);
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.INSTANCE;
        FacebookRequestErrorClassification facebookRequestErrorClassificationCreateFromJSON = companion.createFromJSON(jSONArrayOptJSONArray);
        if (facebookRequestErrorClassificationCreateFromJSON == null) {
            facebookRequestErrorClassificationCreateFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = facebookRequestErrorClassificationCreateFromJSON;
        int iOptInt = settingsJSON.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && InternalSettings.isUnityApp()) {
            UnityReflection.sendEventMapping(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        FetchedAppSettings fetchedAppSettings2 = new FetchedAppSettings(settingsJSON.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false), settingsJSON.optString(APP_SETTING_NUX_CONTENT, ""), settingsJSON.optBoolean(APP_SETTING_NUX_ENABLED, false), settingsJSON.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, Constants.getDefaultAppEventsSessionTimeoutInSeconds()), SmartLoginOption.INSTANCE.parseOptions(settingsJSON.optLong(APP_SETTING_SMART_LOGIN_OPTIONS)), b(settingsJSON.optJSONObject(APP_SETTING_DIALOG_CONFIGS)), z, facebookRequestErrorClassification, settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL), settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL), z2, z3, jSONArrayOptJSONArray2, settingsJSON.optString(SDK_UPDATE_MESSAGE), z4, z5, settingsJSON.optString(APP_SETTING_APP_EVENTS_AAM_RULE), settingsJSON.optString(SUGGESTED_EVENTS_SETTING), settingsJSON.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD));
        fetchedAppSettings.put(applicationId, fetchedAppSettings2);
        return fetchedAppSettings2;
    }
}
