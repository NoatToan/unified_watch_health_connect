package com.xiaomi.hm.health.device;

import android.content.Context;
import android.text.TextUtils;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.bluetooth.profile.channel.module.ApStatus;
import com.huami.bluetooth.profile.channel.module.ConnectStatus;
import com.huami.bluetooth.profile.channel.module.EapType;
import com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback;
import com.huami.bluetooth.profile.channel.module.Phase2Type;
import com.huami.bluetooth.profile.channel.module.WiFiConnectStatus;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.bluetooth.profile.channel.module.WiFiSecurityType;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.event.Event2WifiDeviceConnect;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002JU\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0013\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0013\u0010\"\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J%\u0010#\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$JC\u0010+\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0012\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J#\u00100\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u0010$J\u0013\u00101\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001d\u0010:\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"com/xiaomi/hm/health/device/BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "Lorg/koin/core/component/KoinComponent;", "", "ssid", "password", "", "securityType", "eapType", "phase2Type", LoseWeightPropertyKey.IDENTITY, "anonymousID", "", "addWiFi", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.twitter.sdk.android.tweetcomposer.g.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWiFi", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "eventBusConnect", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "getConfigWifiList", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "getWiFiConnectState", "isBluetoothEnable", "isDeviceConnect", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "type", "onClickHelp", "wifiConfigured", "setPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "accessToken", "region", "appPlatform", "appId", "appVersion", "setToken", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$IWiFiControllerCallback;", "callback", "setWiFiControllerCallback", "startAp", "stopAp", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "b", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1 implements IWiFiControllerProxy, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;
    public final /* synthetic */ HMBaseDevice c;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {76}, m = "addWiFi", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.addWiFi(null, null, 0, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {86}, m = "deleteWiFi", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.deleteWiFi(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {95}, m = "getConfigWifiList", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.getConfigWifiList(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ConnectStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ConnectStatus connectStatus) {
            super(0);
            this.a = connectStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getConfigWifiList:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {107}, m = "getWiFiConnectState", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.getWiFiConnectState(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ConnectStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ConnectStatus connectStatus) {
            super(0);
            this.a = connectStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getWiFiConnectState:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {134}, m = "setPassword", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.setPassword(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1", f = "BindWiFISettingHelper.kt", i = {}, l = {127}, m = "wifiConfigured", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1.this.wifiConfigured(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ ConnectStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ConnectStatus connectStatus) {
            super(0);
            this.a = connectStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " wifi is Configured:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1(HMBaseDevice hMBaseDevice) {
        this.c = hMBaseDevice;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceXNavigator b() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object addWiFi(@NotNull String str, @Nullable String str2, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.c = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objAddWiFi = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar2.c;
        boolean zBooleanValue = false;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objAddWiFi);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB != null) {
                WiFiSecurityType wiFiSecurityTypeFromValue = WiFiSecurityType.INSTANCE.fromValue(i2);
                EapType eapTypeFromValue = EapType.INSTANCE.fromValue(num);
                Phase2Type phase2TypeFromValue = Phase2Type.INSTANCE.fromValue(num2);
                aVar2.c = 1;
                objAddWiFi = wiFiControllerModuleB.addWiFi(str, str2, wiFiSecurityTypeFromValue, eapTypeFromValue, phase2TypeFromValue, str3, str4, aVar2);
                if (objAddWiFi == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objAddWiFi);
        Boolean bool = (Boolean) objAddWiFi;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object cancel(@NotNull Continuation<? super Unit> continuation) {
        WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
        if (wiFiControllerModuleB != null) {
            Object objCancel = wiFiControllerModuleB.cancel(continuation);
            return objCancel == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCancel : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object deleteWiFi(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objDeleteWiFi = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objDeleteWiFi);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB != null) {
                bVar.c = 1;
                objDeleteWiFi = wiFiControllerModuleB.deleteWiFi(str, bVar);
                if (objDeleteWiFi == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objDeleteWiFi);
        Boolean bool = (Boolean) objDeleteWiFi;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    public void eventBusConnect(boolean register) {
        new Event2WifiDeviceConnect().eventBusConnect(register);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object getConfigWifiList(@NotNull Continuation<? super List<WifiBean>> continuation) {
        c cVar;
        ConnectStatus connectStatus;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objQueryWiFiConnectStatus = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB == null) {
                connectStatus = null;
            } else {
                cVar.c = 1;
                objQueryWiFiConnectStatus = wiFiControllerModuleB.queryWiFiConnectStatus(cVar);
                if (objQueryWiFiConnectStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (connectStatus == null) {
                connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
            }
            HMLog.info(BindWiFISettingHelper.TAG, new d(connectStatus));
            if (TextUtils.isEmpty(connectStatus.getSsid())) {
                return null;
            }
            return CollectionsKt__CollectionsKt.mutableListOf(new WifiBean(connectStatus.getSsid(), null, com.huami.core.device.wifi_settings.bean.ConnectStatus.INSTANCE.fromValue(connectStatus.getStatus().getValue()), null, 1, null, connectStatus.getIp(), connectStatus.getMac(), 0, 298, null));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
        connectStatus = (ConnectStatus) objQueryWiFiConnectStatus;
        if (connectStatus == null) {
            connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
        }
        HMLog.info(BindWiFISettingHelper.TAG, new d(connectStatus));
        if (TextUtils.isEmpty(connectStatus.getSsid())) {
            return null;
        }
        return CollectionsKt__CollectionsKt.mutableListOf(new WifiBean(connectStatus.getSsid(), null, com.huami.core.device.wifi_settings.bean.ConnectStatus.INSTANCE.fromValue(connectStatus.getStatus().getValue()), null, 1, null, connectStatus.getIp(), connectStatus.getMac(), 0, 298, null));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object getWiFiConnectState(@NotNull Continuation<? super com.huami.core.device.wifi_settings.bean.WiFiConnectStatus> continuation) {
        e eVar;
        ConnectStatus connectStatus;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objQueryWiFiConnectStatus = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB == null) {
                connectStatus = null;
            } else {
                eVar.c = 1;
                objQueryWiFiConnectStatus = wiFiControllerModuleB.queryWiFiConnectStatus(eVar);
                if (objQueryWiFiConnectStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (connectStatus == null) {
                connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
            }
            HMLog.info(BindWiFISettingHelper.TAG, new f(connectStatus));
            return BindWiFISettingHelperKt.toWoFiConnectStatus(connectStatus);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
        connectStatus = (ConnectStatus) objQueryWiFiConnectStatus;
        if (connectStatus == null) {
            connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
        }
        HMLog.info(BindWiFISettingHelper.TAG, new f(connectStatus));
        return BindWiFISettingHelperKt.toWoFiConnectStatus(connectStatus);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    public boolean isBluetoothEnable() {
        return a().isBluetoothEnable();
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    public boolean isDeviceConnect() {
        HMBaseDevice device = a().getDevice(this.c.getDeviceType());
        if (device == null) {
            return false;
        }
        return device.isConnected();
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    public void onClickHelp(@NotNull Context context, @NotNull IWiFiControllerProxy.ClickType type) {
        b().onControllerProxyClickHelp(context, type);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object setPassword(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.c = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object pwd = gVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(pwd);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB != null) {
                if (str2 == null) {
                    str2 = "";
                }
                gVar.c = 1;
                pwd = wiFiControllerModuleB.setPwd(str, str2, gVar);
                if (pwd == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(pwd);
        Boolean bool = (Boolean) pwd;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object setToken(@NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super Unit> continuation) {
        WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
        if (wiFiControllerModuleB != null) {
            Object objSendToken = wiFiControllerModuleB.sendToken(str, str2, i2, i3, str3, str4, (64 & 64) != 0 ? null : null, continuation);
            return objSendToken == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSendToken : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    public void setWiFiControllerCallback(@Nullable final IWiFiControllerProxy.IWiFiControllerCallback callback) {
        WiFiControllerModule wiFiControllerModuleB;
        if (callback == null || (wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c)) == null) {
            return;
        }
        wiFiControllerModuleB.setControllerCallback("bindWifiSetting", new IWiFiControllerCallback() { // from class: com.xiaomi.hm.health.device.BindWiFISettingHelper$Companion$createIWiFiControllerProxy$1$setWiFiControllerCallback$1$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return " onAddWifiRequest:" + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return " onCancel....";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return " onPwdRequest:" + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public static final d a = new d();

                public d() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return " onWiFiStateChanged....";
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onAddWifiRequest(@Nullable String ssid) {
                IWiFiControllerCallback.DefaultImpls.onAddWifiRequest(this, ssid);
                HMLog.info(BindWiFISettingHelper.TAG, new a(ssid));
                callback.onAddWifiRequest(ssid);
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onApStateChanged(@NotNull ApStatus apStatus) {
                IWiFiControllerCallback.DefaultImpls.onApStateChanged(this, apStatus);
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onCancel() {
                IWiFiControllerCallback.DefaultImpls.onCancel(this);
                HMLog.info(BindWiFISettingHelper.TAG, b.a);
                callback.onCancel();
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onPwdRequest(@NotNull String ssid) {
                IWiFiControllerCallback.DefaultImpls.onPwdRequest(this, ssid);
                HMLog.info(BindWiFISettingHelper.TAG, new c(ssid));
                callback.onPwdRequest(ssid);
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onWiFiStateChanged(@NotNull ConnectStatus connectStatus) {
                IWiFiControllerCallback.DefaultImpls.onWiFiStateChanged(this, connectStatus);
                HMLog.info(BindWiFISettingHelper.TAG, d.a);
                callback.onWiFiStateChanged(BindWiFISettingHelperKt.toWoFiConnectStatus(connectStatus));
            }
        });
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object startAp(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
        if (wiFiControllerModuleB != null) {
            Object objStartAp$default = WiFiControllerModule.startAp$default(wiFiControllerModuleB, str, str2, null, continuation, 4, null);
            return objStartAp$default == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStartAp$default : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object stopAp(@NotNull Continuation<? super Unit> continuation) {
        WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
        if (wiFiControllerModuleB != null) {
            Object objStopAp = wiFiControllerModuleB.stopAp(continuation);
            return objStopAp == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStopAp : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy
    @Nullable
    public Object wifiConfigured(@NotNull Continuation<? super Boolean> continuation) {
        h hVar;
        ConnectStatus connectStatus;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.c = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objQueryWiFiConnectStatus = hVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
            WiFiControllerModule wiFiControllerModuleB = BindWiFISettingHelper.Companion.b(this.c);
            if (wiFiControllerModuleB == null) {
                connectStatus = null;
            } else {
                hVar.c = 1;
                objQueryWiFiConnectStatus = wiFiControllerModuleB.queryWiFiConnectStatus(hVar);
                if (objQueryWiFiConnectStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (connectStatus == null) {
                connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
            }
            HMLog.info(BindWiFISettingHelper.TAG, new i(connectStatus));
            return Boxing.boxBoolean(!TextUtils.isEmpty(connectStatus.getSsid()));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQueryWiFiConnectStatus);
        connectStatus = (ConnectStatus) objQueryWiFiConnectStatus;
        if (connectStatus == null) {
            connectStatus = new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
        }
        HMLog.info(BindWiFISettingHelper.TAG, new i(connectStatus));
        return Boxing.boxBoolean(!TextUtils.isEmpty(connectStatus.getSsid()));
    }
}
