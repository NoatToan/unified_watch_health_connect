package com.xiaomi.hm.health.lightappstore;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.flutter.appletcompanionplugin.AppletPluginService;
import com.huami.flutter.appletcompanionplugin.HasJsAppInstalledCallback;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.jscompanion.CompanionHelper;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0013R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/lightappstore/LightAppStore;", "", "", "appId", "Lcom/huami/flutter/appletcompanionplugin/HasJsAppInstalledCallback;", "hasJsAppInstalledCallback", "", "hasJsAppInstalled", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "jumpAppStoreMainPage", "jumpAppSettingListPage", "jumpJsAppDeveloperModePage", "", "jsAppId", "jumpJsAppDetailPage", "openBackgroundDartEntryPoint", "dartEntrypointFunctionName", "a", "", LightAppStore.DEVELOPER_MODE_OPEN, "isOpen", "saveDeveloperModeValue", "Ljava/lang/String;", "BACKGROUND_ISOLATE", "b", "APP_STORE_MAIN_ENTRY_POINT", "c", "APP_SETTING_LIST_ENTRY_POINT", GoogleApiAvailabilityLight.a, "APP_JS_APP_DEVELOPER_ENTRY_POINT", "e", "APP_JS_APP_DETAIL_ENTRY_POINT", "f", "APP_STORE_KV_KIT_FILE_NAME", "g", "DEVELOPER_MODE_OPEN", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class LightAppStore {

    @NotNull
    public static final LightAppStore INSTANCE = new LightAppStore();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String BACKGROUND_ISOLATE = "backgroundIsolate";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String APP_STORE_MAIN_ENTRY_POINT = "main";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String APP_SETTING_LIST_ENTRY_POINT = "appSettingList";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String APP_JS_APP_DEVELOPER_ENTRY_POINT = "jsAppDeveloperMode";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String APP_JS_APP_DETAIL_ENTRY_POINT = "jsAppDetail";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String APP_STORE_KV_KIT_FILE_NAME = "appStoreKv";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String DEVELOPER_MODE_OPEN = "isDeveloperModeOpen";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Open background dart entry point exception.";
        }
    }

    private LightAppStore() {
    }

    private final void a(Context context, String dartEntrypointFunctionName) {
        FlutterEngineGroup flutterEngineGroup = new FlutterEngineGroup(BraceletApp.getContext());
        FlutterEngineCache.getInstance().put(dartEntrypointFunctionName, Intrinsics.areEqual("main", dartEntrypointFunctionName) ? flutterEngineGroup.createAndRunDefaultEngine(context) : flutterEngineGroup.createAndRunEngine(context, new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), dartEntrypointFunctionName)));
    }

    @JvmStatic
    public static final void hasJsAppInstalled(@NotNull String appId, @NotNull HasJsAppInstalledCallback hasJsAppInstalledCallback) {
        CompanionHelper.startAppletService();
        ((AppletPluginService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppletPluginService.class), null, null)).hasJsAppInstalled(appId, hasJsAppInstalledCallback);
    }

    @JvmStatic
    public static final void jumpAppSettingListPage(@NotNull Context context) {
        INSTANCE.a(context, APP_SETTING_LIST_ENTRY_POINT);
        context.startActivity(DefaultFlutterActivity.INSTANCE.withCachedEngine(APP_SETTING_LIST_ENTRY_POINT).build(context));
    }

    @JvmStatic
    public static final void jumpAppStoreMainPage(@NotNull Context context) {
        INSTANCE.a(context, "main");
        context.startActivity(DefaultFlutterActivity.INSTANCE.withCachedEngine("main").build(context));
    }

    @JvmStatic
    public static final void jumpJsAppDetailPage(@NotNull Context context, int jsAppId) {
        FlutterInjector.instance().flutterLoader().startInitialization(context);
        DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), APP_JS_APP_DETAIL_ENTRY_POINT);
        FlutterEngine flutterEngine = new FlutterEngine(context);
        flutterEngine.getNavigationChannel().setInitialRoute(String.valueOf(jsAppId));
        flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint);
        FlutterEngineCache.getInstance().put(APP_JS_APP_DETAIL_ENTRY_POINT, flutterEngine);
        Intent intentBuild = DefaultFlutterActivity.INSTANCE.withCachedEngine(APP_JS_APP_DETAIL_ENTRY_POINT).build(context);
        intentBuild.setFlags(268435456);
        context.startActivity(intentBuild);
    }

    @JvmStatic
    public static final void jumpJsAppDeveloperModePage(@NotNull Context context) {
        INSTANCE.a(context, APP_JS_APP_DEVELOPER_ENTRY_POINT);
        context.startActivity(DefaultFlutterActivity.INSTANCE.withCachedEngine(APP_JS_APP_DEVELOPER_ENTRY_POINT).build(context));
    }

    @JvmStatic
    public static final void openBackgroundDartEntryPoint(@NotNull Context context) {
        try {
            if (FlutterEngineCache.getInstance().get(BACKGROUND_ISOLATE) != null) {
                return;
            }
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            flutterLoader.startInitialization(context);
            flutterLoader.automaticallyRegisterPlugins();
            DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(flutterLoader.findAppBundlePath(), BACKGROUND_ISOLATE);
            FlutterEngine flutterEngine = new FlutterEngine(context);
            FlutterEngineCache.getInstance().put(BACKGROUND_ISOLATE, flutterEngine);
            flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint);
        } catch (Exception e) {
            HMLog.error$default(null, null, e, a.a, 3, null);
        }
    }

    public final boolean isDeveloperModeOpen() {
        return ((Boolean) KvKit.getKvPersistence$default("appStoreKv-" + HMLoginManager.getValidUid(), false, 2, null).getValue(DEVELOPER_MODE_OPEN, Boolean.FALSE)).booleanValue();
    }

    public final void saveDeveloperModeValue(boolean isOpen) {
        KvKit.getKvPersistence$default("appStoreKv-" + HMLoginManager.getValidUid(), false, 2, null).setValue(DEVELOPER_MODE_OPEN, Boolean.valueOf(isOpen));
    }
}
