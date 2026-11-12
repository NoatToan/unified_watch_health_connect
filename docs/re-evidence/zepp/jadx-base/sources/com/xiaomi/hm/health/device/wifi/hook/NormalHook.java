package com.xiaomi.hm.health.device.wifi.hook;

import android.app.Application;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.BindWiFISettingHelper;
import com.xiaomi.hm.health.device.wifi.WifiSettingHook;
import com.xiaomi.hm.health.device.wifi.ui.HookWifiActivity;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/wifi/hook/NormalHook;", "Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$IWiFiControllerCallback;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "a", "", "ssid", "pwd", "", "setPwdString", "findSsid", "", "registerHook", "onPwdRequest", "Lcom/xiaomi/hm/health/device/wifi/ui/HookWifiActivity;", "activity", "regCurrentUI", "Ljava/lang/String;", "tag", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "c", "Ljava/lang/ref/WeakReference;", GoogleApiAvailabilityLight.a, "Ljava/lang/ref/WeakReference;", "hookWifiActivity", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NormalHook implements WifiSettingHook, IWiFiControllerProxy.IWiFiControllerCallback, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "WifiSettingHook";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String ssid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WeakReference<HookWifiActivity> hookWifiActivity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onPwdRequest error.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.wifi.hook.NormalHook$setPwdString$1", f = "NormalHook.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ WiFiControllerModule b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WiFiControllerModule wiFiControllerModule, String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = wiFiControllerModule;
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WiFiControllerModule wiFiControllerModule = this.b;
                    String str = this.c;
                    String str2 = this.d;
                    this.a = 1;
                    if (wiFiControllerModule.setPwd(str, str2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                HMLog.e("Hook", e);
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NormalHook() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.wifi.hook.NormalHook$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final IWiFiControllerProxy a() {
        try {
            HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
            if (device == null) {
                return null;
            }
            return BindWiFISettingHelper.INSTANCE.initIWiFiController(device);
        } catch (Exception e) {
            HMLog.e("NormalHook", e);
            return null;
        }
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // com.xiaomi.hm.health.device.wifi.WifiSettingHook
    @Nullable
    /* JADX INFO: renamed from: findSsid, reason: from getter */
    public String getSsid() {
        return this.ssid;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
    public void onAddWifiRequest(@Nullable String str) {
        IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onAddWifiRequest(this, str);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
    public void onCancel() {
        IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onCancel(this);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
    public void onPwdRequest(@NotNull String ssid) {
        HookWifiActivity hookWifiActivity;
        IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onPwdRequest(this, ssid);
        this.ssid = ssid;
        try {
            WeakReference<HookWifiActivity> weakReference = this.hookWifiActivity;
            if (weakReference != null && (hookWifiActivity = weakReference.get()) != null) {
                hookWifiActivity.finish();
            }
            Application context = DeviceXFunctionsKt.getContext();
            Intent intent = new Intent(context, (Class<?>) HookWifiActivity.class);
            intent.setFlags(276824064);
            context.startActivity(intent);
        } catch (Throwable th) {
            HMLog.warn("Hook", th, a.a);
        }
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
    public void onWiFiStateChanged(@NotNull WiFiConnectStatus wiFiConnectStatus) {
        IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onWiFiStateChanged(this, wiFiConnectStatus);
    }

    @Override // com.xiaomi.hm.health.device.wifi.WifiSettingHook
    public void regCurrentUI(@NotNull HookWifiActivity activity) {
        this.hookWifiActivity = new WeakReference<>(activity);
    }

    @Override // com.xiaomi.hm.health.device.wifi.WifiSettingHook
    public void registerHook() {
        try {
            IWiFiControllerProxy iWiFiControllerProxyA = a();
            if (iWiFiControllerProxyA == null) {
                return;
            }
            iWiFiControllerProxyA.setWiFiControllerCallback(this);
        } catch (Throwable th) {
            HMLog.e(this.tag, th, "set wifi hook error!", new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.device.wifi.WifiSettingHook
    public boolean setPwdString(@NotNull String ssid, @NotNull String pwd) {
        WiFiControllerModule wiFiControllerModule;
        if (ssid.length() == 0) {
            HMLog.e("NormalHook", "ssid is null or empty!", new Object[0]);
            return false;
        }
        HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
        if (device == null || (wiFiControllerModule = (WiFiControllerModule) device.getChannelModule(WiFiControllerModule.class)) == null) {
            return false;
        }
        return ((Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new b(wiFiControllerModule, ssid, pwd, null))).booleanValue();
    }
}
