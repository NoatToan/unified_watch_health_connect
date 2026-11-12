package com.huami.devicex.funapi;

import android.app.Application;
import android.content.res.Resources;
import androidx.annotation.StringRes;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.injection.AboutUrlManagerApi;
import com.huami.devicex.injection.AppNotificationApi;
import com.huami.devicex.injection.AppStateApi;
import com.huami.devicex.injection.AvatarManagerApi;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.DeviceStoreApi;
import com.huami.devicex.injection.SensorHubControllerApi;
import com.huami.devicex.injection.SportManagerApi;
import com.huami.devicex.injection.SyncedStatusApiFactory;
import com.huami.devicex.injection.WebBrowserApi;
import com.huami.devicex.injection.action.SportInfoActionFactory;
import com.huami.devicex.injection.basic.AdProviderApi;
import com.huami.devicex.injection.basic.DeviceTokenApi;
import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.huami.devicex.injection.basic.HmConfigApi;
import com.huami.devicex.injection.basic.NetworkProxy;
import com.huami.devicex.injection.basic.StressUserCaseApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.data.SyncDataApi;
import com.huami.devicex.injection.data.WeatherApi;
import com.huami.devicex.injection.keeper.StatusRefreshApi;
import com.huami.devicex.injection.other.QQLoginApi;
import com.huami.devicex.injection.other.ThirdAuthManagerApi;
import com.huami.devicex.manager.FlavorService;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.jsbridge.api.NavigateApiExHandler;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0010\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u0006\u0010\f\u001a\u00020\u000b\u001a\u0006\u0010\u000e\u001a\u00020\r\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u0006\u0010\u001a\u001a\u00020\u0019\u001a\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u0006\u0010\u001e\u001a\u00020\u001d\u001a\u0006\u0010 \u001a\u00020\u001f\u001a\u0006\u0010\"\u001a\u00020!\u001a\u0006\u0010$\u001a\u00020#\u001a\u0006\u0010&\u001a\u00020%\u001a\u0006\u0010(\u001a\u00020'\u001a\u0006\u0010*\u001a\u00020)\u001a\u0006\u0010,\u001a\u00020+\u001a\u0006\u0010.\u001a\u00020-\u001a\u0006\u00100\u001a\u00020/\u001a\u0006\u00102\u001a\u000201\u001a\u0006\u00104\u001a\u000203\u001a\u0006\u00106\u001a\u000205\u001a\b\u00108\u001a\u0004\u0018\u000107\u001a\u0006\u0010:\u001a\u000209\u001a\u0006\u0010<\u001a\u00020;\u001a\u0006\u0010>\u001a\u00020=¨\u0006?"}, d2 = {"Landroid/app/Application;", "getDeviceXApplication", "getContext", "Landroid/content/res/Resources;", "getResources", "", "id", "", "getString", "Lcom/huami/devicex/injection/AppStateApi;", "getAppStateApi", "Lcom/huami/devicex/injection/SensorHubControllerApi;", "getSensorHubControllerApi", "Lcom/huami/devicex/injection/basic/StressUserCaseApi;", "getStressUserCaseApi", "Lcom/huami/devicex/injection/WebBrowserApi;", "getWebBrowserApi", "Lcom/huami/devicex/injection/DeviceStoreApi;", "getDeviceStoreApi", "Lcom/huami/devicex/injection/BuildConfigApi;", "getBuildConfigApi", "Lcom/huami/devicex/injection/SyncedStatusApiFactory;", "getSyncedStatusApiFactory", "Lcom/huami/devicex/injection/SportManagerApi;", "getSportManagerApi", "Lcom/huami/devicex/injection/other/ThirdAuthManagerApi;", "getThirdAuthManagerApi", "Lcom/huami/devicex/injection/basic/NetworkProxy;", "getNetworkProxy", "Lcom/huami/discovery/bridge/jsbridge/api/JsBridgeApi;", "getJsBridgeApi", "Lcom/huami/devicex/injection/AppNotificationApi;", "getAppNotificationApi", "Lcom/huami/devicex/injection/basic/DeviceTokenApi;", "getDeviceTokenApi", "Lcom/huami/devicex/injection/AboutUrlManagerApi;", "getAboutUrlManagerApi", "Lcom/huami/devicex/injection/keeper/StatusRefreshApi;", "getStatusRefreshApi", "Lcom/huami/devicex/injection/basic/AdProviderApi;", "getAdProviderApi", "Lcom/huami/devicex/injection/other/QQLoginApi;", "getQQLoginApi", "Lcom/huami/devicex/injection/AvatarManagerApi;", "getAvatarManagerApi", "Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "getGoalFunctionsApi", "Lcom/huami/devicex/injection/data/SyncDataApi;", "getSyncDataApi", "Lcom/huami/devicex/injection/action/SportInfoActionFactory;", "getSportInfoActionFactory", "Lcom/huami/devicex/injection/basic/HmConfigApi;", "getHmConfigApi", "Lcom/huami/discovery/bridge/jsbridge/api/NavigateApiExHandler;", "getNavigateApiExHandler", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "getAgpsTimeStoreApi", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "getPropertyStoreApi", "Lcom/huami/devicex/injection/data/WeatherApi;", "getWeatherApi", "Lcom/huami/devicex/manager/FlavorService;", "getFlavorService", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class DeviceXFunctionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cannot get AGPSTime store. " + Thread.currentThread().getName();
        }
    }

    @NotNull
    public static final AboutUrlManagerApi getAboutUrlManagerApi() {
        return (AboutUrlManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AboutUrlManagerApi.class), null, null);
    }

    @NotNull
    public static final AdProviderApi getAdProviderApi() {
        return (AdProviderApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AdProviderApi.class), null, null);
    }

    @Nullable
    public static final AgpsTimeStore getAgpsTimeStoreApi() {
        try {
            return DeviceXBuilder.INSTANCE.getAgpsTimeStoreApi$devicex_zeppRelease();
        } catch (Throwable unused) {
            try {
                HMLog.warn$default(null, null, a.a, 3, null);
            } catch (Throwable unused2) {
            }
            return null;
        }
    }

    @NotNull
    public static final AppNotificationApi getAppNotificationApi() {
        return (AppNotificationApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppNotificationApi.class), null, null);
    }

    @NotNull
    public static final AppStateApi getAppStateApi() {
        return DeviceXBuilder.INSTANCE.getAppStateApi$devicex_zeppRelease();
    }

    @NotNull
    public static final AvatarManagerApi getAvatarManagerApi() {
        return (AvatarManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AvatarManagerApi.class), null, null);
    }

    @NotNull
    public static final BuildConfigApi getBuildConfigApi() {
        return (BuildConfigApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(BuildConfigApi.class), null, null);
    }

    @NotNull
    public static final Application getContext() {
        return DeviceXBuilder.INSTANCE.getContext();
    }

    @NotNull
    public static final DeviceStoreApi getDeviceStoreApi() {
        return (DeviceStoreApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceStoreApi.class), null, null);
    }

    @NotNull
    public static final DeviceTokenApi getDeviceTokenApi() {
        return (DeviceTokenApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceTokenApi.class), null, null);
    }

    @NotNull
    public static final Application getDeviceXApplication() {
        return getContext();
    }

    @NotNull
    public static final FlavorService getFlavorService() {
        return DeviceXBuilder.INSTANCE.getFlavor();
    }

    @NotNull
    public static final GoalFunctionsApi getGoalFunctionsApi() {
        return (GoalFunctionsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(GoalFunctionsApi.class), null, null);
    }

    @NotNull
    public static final HmConfigApi getHmConfigApi() {
        return (HmConfigApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HmConfigApi.class), null, null);
    }

    @NotNull
    public static final JsBridgeApi getJsBridgeApi() {
        return (JsBridgeApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(JsBridgeApi.class), null, null);
    }

    @NotNull
    public static final NavigateApiExHandler getNavigateApiExHandler() {
        return (NavigateApiExHandler) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NavigateApiExHandler.class), null, null);
    }

    @NotNull
    public static final NetworkProxy getNetworkProxy() {
        return (NetworkProxy) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NetworkProxy.class), null, null);
    }

    @NotNull
    public static final PropertyStoreApi getPropertyStoreApi() {
        return (PropertyStoreApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), null, null);
    }

    @NotNull
    public static final QQLoginApi getQQLoginApi() {
        return (QQLoginApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(QQLoginApi.class), null, null);
    }

    @NotNull
    public static final Resources getResources() {
        Resources resources = getContext().getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalAccessError("未初始化成功");
    }

    @NotNull
    public static final SensorHubControllerApi getSensorHubControllerApi() {
        return (SensorHubControllerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SensorHubControllerApi.class), null, null);
    }

    @NotNull
    public static final SportInfoActionFactory getSportInfoActionFactory() {
        return (SportInfoActionFactory) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportInfoActionFactory.class), null, null);
    }

    @NotNull
    public static final SportManagerApi getSportManagerApi() {
        return (SportManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportManagerApi.class), null, null);
    }

    @NotNull
    public static final StatusRefreshApi getStatusRefreshApi() {
        return (StatusRefreshApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StatusRefreshApi.class), null, null);
    }

    @NotNull
    public static final StressUserCaseApi getStressUserCaseApi() {
        return (StressUserCaseApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StressUserCaseApi.class), null, null);
    }

    @NotNull
    public static final String getString(@StringRes int i) {
        try {
            return getContext().getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public static final SyncDataApi getSyncDataApi() {
        return (SyncDataApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SyncDataApi.class), null, null);
    }

    @NotNull
    public static final SyncedStatusApiFactory getSyncedStatusApiFactory() {
        return (SyncedStatusApiFactory) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SyncedStatusApiFactory.class), null, null);
    }

    @NotNull
    public static final ThirdAuthManagerApi getThirdAuthManagerApi() {
        return (ThirdAuthManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ThirdAuthManagerApi.class), null, null);
    }

    @NotNull
    public static final WeatherApi getWeatherApi() {
        return DeviceXBuilder.INSTANCE.getWeatherApi$devicex_zeppRelease();
    }

    @NotNull
    public static final WebBrowserApi getWebBrowserApi() {
        return (WebBrowserApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebBrowserApi.class), null, null);
    }
}
