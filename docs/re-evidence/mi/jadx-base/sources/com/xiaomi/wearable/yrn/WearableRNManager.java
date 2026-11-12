package com.xiaomi.wearable.yrn;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.soloader.SoLoader;
import com.reactnativecommunity.yrn.netinfo.NetInfoModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.helper.WearableRNRegisterInfoManager;
import com.xiaomi.wearable.yrn.provider.WearableControllerInfoProvider;
import com.xiaomi.wearable.yrn.provider.WearableRNLogProvider;
import com.xiaomi.wearable.yrn.provider.WearableRNProvider;
import com.xiaomi.yrn.channel.debugui.YRNDevModeActivity;
import defpackage.e1d;
import defpackage.gur;
import defpackage.jzr;
import defpackage.l1d;
import defpackage.lwr;
import defpackage.m1d;
import defpackage.vwr;
import defpackage.yur;
import defpackage.zxr;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J#\u0010\u0010\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0014J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00052\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0002¢\u0006\u0004\b+\u0010\u0004R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/wearable/yrn/WearableRNManager;", "", "", "initReactNative", "()V", "", "bundleName", "reloadBundle", "(Ljava/lang/String;)V", "checkBundleUpdate", "registerLifecycleListener", "", "Lgur;", "appConfigs", "Landroid/app/Application;", "context", "init", "(Ljava/util/List;Landroid/app/Application;)V", "preLoadBundle", "appName", "()Ljava/lang/String;", "appConfig", "()Lgur;", "bundleRootPath", i.d, "", "param", "", "sendJSEvent", "(Ljava/lang/String;Ljava/util/Map;)Z", "Lcom/facebook/react/bridge/WritableMap;", "map", "sendJSEventMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Z", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "rnDebugEntry", "(Landroid/app/Activity;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/reactnativecommunity/yrn/netinfo/NetInfoModule;", "providerNetInfoModule", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/reactnativecommunity/yrn/netinfo/NetInfoModule;", "manualRegisterModule", "TAG", "Ljava/lang/String;", "Le1d;", "_yrnProvider", "Le1d;", "mContext", "Landroid/app/Application;", "netInfoModule", "Lcom/reactnativecommunity/yrn/netinfo/NetInfoModule;", "isMainActivityReady", "Z", "isBundlePreLoaded", "isAppForegroundState", "<init>", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableRNManager {

    @NotNull
    public static final WearableRNManager INSTANCE = new WearableRNManager();

    @NotNull
    private static final String TAG = "WearableRNManager";
    private static e1d _yrnProvider;
    private static boolean isAppForegroundState;
    private static boolean isBundlePreLoaded;
    private static boolean isMainActivityReady;
    private static Application mContext;

    @Nullable
    private static NetInfoModule netInfoModule;

    private WearableRNManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkBundleUpdate() {
        reloadBundle("init");
        reloadBundle("sport");
    }

    private final void initReactNative() {
        Logger.i(TAG, "preLoadBundle initReactNative");
        e1d e1dVar = _yrnProvider;
        if (e1dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_yrnProvider");
            e1dVar = null;
        }
        e1dVar.initReactNative(appName());
    }

    private final void registerLifecycleListener() {
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: g8r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WearableRNManager.registerLifecycleListener$lambda$1((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerLifecycleListener$lambda$1(String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        AnyExtKt.io$default(null, new WearableRNManager$registerLifecycleListener$1$1(null), 1, null);
        return Unit.INSTANCE;
    }

    private final void reloadBundle(String bundleName) {
        if (vwr.g().k()) {
            return;
        }
        try {
            jzr jzrVarE = jzr.e();
            Method declaredMethod = jzr.class.getDeclaredMethod(PluginDeviceInfo.FICONOFF, new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(jzrVarE, new Object[0]);
            l1d l1dVar = objInvoke instanceof l1d ? (l1d) objInvoke : null;
            gur gurVar = (gur) CollectionsKt___CollectionsKt.first((List) WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList());
            if (l1dVar != null) {
                l1dVar.h(gurVar.j(), bundleName, new m1d() { // from class: com.xiaomi.wearable.yrn.WearableRNManager$reloadBundle$1$1
                    @Override // defpackage.m1d
                    public void onLoadFailure(String message) {
                    }

                    @Override // defpackage.m1d
                    public void onLoadStart() {
                    }

                    @Override // defpackage.m1d
                    public void onLoadSuccess(String bundlePath) {
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NotNull
    public final gur appConfig() {
        return (gur) CollectionsKt___CollectionsKt.first((List) WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList());
    }

    @NotNull
    public final String appName() {
        String strJ = ((gur) CollectionsKt___CollectionsKt.first((List) WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList())).j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getAppName(...)");
        return strJ;
    }

    @NotNull
    public final String bundleRootPath() {
        return yur.e(appConfig()) + File.separator + appName();
    }

    public final void init(@NotNull List<? extends gur> appConfigs, @NotNull Application context) {
        Intrinsics.checkNotNullParameter(appConfigs, "appConfigs");
        Intrinsics.checkNotNullParameter(context, "context");
        SoLoader.m(context, false);
        mContext = context;
        WearableRNRegisterInfoManager.INSTANCE.init(appConfigs);
        lwr.a(new WearableRNProvider());
        e1d e1dVarB = lwr.b();
        _yrnProvider = e1dVarB;
        Application application = null;
        if (e1dVarB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_yrnProvider");
            e1dVarB = null;
        }
        Application application2 = mContext;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            application = application2;
        }
        e1dVarB.init(application, new WearableControllerInfoProvider());
        zxr.e(true);
        zxr.f(new WearableRNLogProvider());
        Logger.i(TAG, "WearableRNManager init");
        registerLifecycleListener();
    }

    public final void manualRegisterModule() {
        isMainActivityReady = true;
        NetInfoModule netInfoModule2 = netInfoModule;
        if (netInfoModule2 != null) {
            netInfoModule2.setMainActivityReady(true);
        }
        NetInfoModule netInfoModule3 = netInfoModule;
        if (netInfoModule3 != null) {
            netInfoModule3.registerModule();
        }
    }

    public final void preLoadBundle() {
        if (!isBundlePreLoaded) {
            initReactNative();
        }
        isBundlePreLoaded = true;
    }

    @NotNull
    public final NetInfoModule providerNetInfoModule(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (netInfoModule == null) {
            NetInfoModule netInfoModule2 = new NetInfoModule(reactContext);
            netInfoModule = netInfoModule2;
            netInfoModule2.setMainActivityReady(isMainActivityReady);
        }
        NetInfoModule netInfoModule3 = netInfoModule;
        Intrinsics.checkNotNull(netInfoModule3);
        return netInfoModule3;
    }

    public final void rnDebugEntry(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) YRNDevModeActivity.class));
    }

    public final boolean sendJSEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> param) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        gur gurVar = (gur) CollectionsKt___CollectionsKt.first((List) WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList());
        e1d e1dVar = _yrnProvider;
        if (e1dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_yrnProvider");
            e1dVar = null;
        }
        return e1dVar.sendJSEvent(gurVar.j(), eventName, param);
    }

    public final boolean sendJSEventMap(@NotNull String eventName, @NotNull WritableMap map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(map, "map");
        gur gurVar = (gur) CollectionsKt___CollectionsKt.first((List) WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList());
        e1d e1dVar = _yrnProvider;
        if (e1dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_yrnProvider");
            e1dVar = null;
        }
        return e1dVar.sendJSEvent(gurVar.j(), eventName, map);
    }
}
