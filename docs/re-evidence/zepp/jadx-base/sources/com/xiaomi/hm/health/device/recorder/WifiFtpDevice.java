package com.xiaomi.hm.health.device.recorder;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.APReason;
import com.huami.bluetooth.profile.channel.module.ApStatus;
import com.huami.bluetooth.profile.channel.module.ConnectStatus;
import com.huami.bluetooth.profile.channel.module.FtpServerStatus;
import com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.bluetooth.profile.channel.module.WifiFtpModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.musicupload.viewmodel.IWifiFtpDevice;
import com.huami.watch.musicupload.viewmodel.TransformMode;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u0003789B\u0007¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001c\u001a\u00020\u001b*\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00100\u001a\u00060-R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\u000601R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice;", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", PointCategory.INIT, "", "deInit", "disableWifi", "enable", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "enableFtp", "", "wifiName", "password", "enableWifi", "getAddress", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getDeviceSourceValue", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFtpStatusListener", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", "setWifiStatusListener", "Lcom/huami/bluetooth/profile/channel/module/APReason;", "toApReason", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", "wifiModule", "Lcom/huami/bluetooth/profile/channel/module/WifiFtpModule;", "c", "Lcom/huami/bluetooth/profile/channel/module/WifiFtpModule;", "ftpModule", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", "wifiStatusListener", "e", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "ftpStatusListener", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerWifiListener;", "f", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerWifiListener;", "innerWifiListener", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerFtpListener;", "g", "Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerFtpListener;", "innerFtpListener", "<init>", "()V", "Companion", "InnerFtpListener", "InnerWifiListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WifiFtpDevice implements IWifiFtpDevice {

    @NotNull
    private static final String h = "WifiFtpDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HMBaseDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WiFiControllerModule wifiModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private WifiFtpModule ftpModule;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IWifiFtpDevice.IDeviceWifiStatusListener wifiStatusListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IWifiFtpDevice.IDeviceFtpStatusListener ftpStatusListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final InnerWifiListener innerWifiListener = new InnerWifiListener();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final InnerFtpListener innerFtpListener = new InnerFtpListener();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerFtpListener;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/FtpServerStatus;", "", "Lcom/huami/bluetooth/profile/channel/module/IFTPStatusListener;", "ftpStatus", "invoke", "<init>", "(Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class InnerFtpListener implements Function1<FtpServerStatus, Unit> {
        public InnerFtpListener() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FtpServerStatus ftpServerStatus) {
            invoke2(ftpServerStatus);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@NotNull FtpServerStatus ftpStatus) {
            IWifiFtpDevice.IDeviceFtpStatusListener iDeviceFtpStatusListener;
            boolean zEnabled = ftpStatus.enabled();
            boolean zDisabled = ftpStatus.disabled();
            if (zEnabled) {
                IWifiFtpDevice.IDeviceFtpStatusListener iDeviceFtpStatusListener2 = WifiFtpDevice.this.ftpStatusListener;
                if (iDeviceFtpStatusListener2 == null) {
                    return;
                }
                iDeviceFtpStatusListener2.onFtpStatusChanged(true);
                return;
            }
            if (!zDisabled || (iDeviceFtpStatusListener = WifiFtpDevice.this.ftpStatusListener) == null) {
                return;
            }
            iDeviceFtpStatusListener.onFtpStatusChanged(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice$InnerWifiListener;", "Lcom/huami/bluetooth/profile/channel/module/IWiFiControllerCallback;", "Lcom/huami/bluetooth/profile/channel/module/ApStatus;", "status", "", "onApStateChanged", "<init>", "(Lcom/xiaomi/hm/health/device/recorder/WifiFtpDevice;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class InnerWifiListener implements IWiFiControllerCallback {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApStatus.values().length];
                iArr[ApStatus.OPEND.ordinal()] = 1;
                iArr[ApStatus.CLOSED.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public InnerWifiListener() {
        }

        @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
        public void onAddWifiRequest(@Nullable String str) {
            IWiFiControllerCallback.DefaultImpls.onAddWifiRequest(this, str);
        }

        @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
        public void onApStateChanged(@NotNull ApStatus status) {
            IWifiFtpDevice.IDeviceWifiStatusListener iDeviceWifiStatusListener;
            IWiFiControllerCallback.DefaultImpls.onApStateChanged(this, status);
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i != 1) {
                if (i == 2 && (iDeviceWifiStatusListener = WifiFtpDevice.this.wifiStatusListener) != null) {
                    iDeviceWifiStatusListener.onWifiStatusChanged(false);
                    return;
                }
                return;
            }
            IWifiFtpDevice.IDeviceWifiStatusListener iDeviceWifiStatusListener2 = WifiFtpDevice.this.wifiStatusListener;
            if (iDeviceWifiStatusListener2 == null) {
                return;
            }
            iDeviceWifiStatusListener2.onWifiStatusChanged(true);
        }

        @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
        public void onCancel() {
            IWiFiControllerCallback.DefaultImpls.onCancel(this);
        }

        @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
        public void onPwdRequest(@NotNull String str) {
            IWiFiControllerCallback.DefaultImpls.onPwdRequest(this, str);
        }

        @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
        public void onWiFiStateChanged(@NotNull ConnectStatus connectStatus) {
            IWiFiControllerCallback.DefaultImpls.onWiFiStateChanged(this, connectStatus);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.recorder.WifiFtpDevice$disableWifi$1", f = "WifiFtpDevice.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpDevice.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WiFiControllerModule wiFiControllerModule = WifiFtpDevice.this.wifiModule;
                if (wiFiControllerModule != null) {
                    this.a = 1;
                    obj = wiFiControllerModule.stopAp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.recorder.WifiFtpDevice$enableFtp$1", f = "WifiFtpDevice.kt", i = {}, l = {60, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ TransformMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TransformMode transformMode, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = transformMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpDevice.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean bool;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpPathGetter wifiFtpPathGetter = WifiFtpPathGetter.INSTANCE;
            APReason apReason = WifiFtpDevice.this.toApReason(this.c);
            this.a = 1;
            obj = wifiFtpPathGetter.getPath(apReason, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str = (String) obj;
            WifiFtpModule wifiFtpModule = WifiFtpDevice.this.ftpModule;
            if (wifiFtpModule != null) {
                this.a = 2;
                obj = wifiFtpModule.startServer(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.recorder.WifiFtpDevice$enableWifi$1", f = "WifiFtpDevice.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ TransformMode e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, TransformMode transformMode, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = transformMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpDevice.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WiFiControllerModule wiFiControllerModule = WifiFtpDevice.this.wifiModule;
                if (wiFiControllerModule != null) {
                    String str = this.c;
                    String str2 = this.d;
                    APReason apReason = WifiFtpDevice.this.toApReason(this.e);
                    this.a = 1;
                    obj = wiFiControllerModule.startAp(str, str2, apReason, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    public final void deInit() {
        WiFiControllerModule wiFiControllerModule = this.wifiModule;
        if (wiFiControllerModule != null) {
            wiFiControllerModule.removeControllerCallback(h);
        }
        WifiFtpModule wifiFtpModule = this.ftpModule;
        if (wifiFtpModule == null) {
            return;
        }
        wifiFtpModule.unregisterListener(this.innerFtpListener);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean disableWifi() {
        return ((Boolean) d.b(null, new a(null), 1, null)).booleanValue();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean enableFtp(boolean enable, @NotNull TransformMode mode) {
        return ((Boolean) d.b(null, new b(mode, null), 1, null)).booleanValue();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean enableWifi(@NotNull String wifiName, @NotNull String password, @NotNull TransformMode mode) {
        return ((Boolean) d.b(null, new c(wifiName, password, mode, null), 1, null)).booleanValue();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    @Nullable
    public String getAddress() {
        DeviceInfo deviceInfo;
        HMBaseDevice hMBaseDevice = this.device;
        if (hMBaseDevice == null || (deviceInfo = hMBaseDevice.getDeviceInfo()) == null) {
            return null;
        }
        return deviceInfo.getDeviceID();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public int getDeviceSourceValue(@NotNull Context context) {
        HMDeviceSource mDeviceSource;
        HMBaseDevice hMBaseDevice = this.device;
        if (hMBaseDevice == null || (mDeviceSource = hMBaseDevice.getMDeviceSource()) == null) {
            return 0;
        }
        return mDeviceSource.getValue();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public int getMusicInfoMaxLength() {
        return IWifiFtpDevice.DefaultImpls.getMusicInfoMaxLength(this);
    }

    public final boolean init(@Nullable HMBaseDevice device) {
        this.device = device;
        this.wifiModule = device == null ? null : (WiFiControllerModule) device.getChannelModule(WiFiControllerModule.class);
        this.ftpModule = device != null ? (WifiFtpModule) device.getChannelModule(WifiFtpModule.class) : null;
        WiFiControllerModule wiFiControllerModule = this.wifiModule;
        if (wiFiControllerModule != null) {
            wiFiControllerModule.setControllerCallback(h, this.innerWifiListener);
        }
        WifiFtpModule wifiFtpModule = this.ftpModule;
        if (wifiFtpModule != null) {
            wifiFtpModule.registerListener(this.innerFtpListener);
        }
        return (this.wifiModule == null || this.ftpModule == null) ? false : true;
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public void setFtpStatusListener(@Nullable IWifiFtpDevice.IDeviceFtpStatusListener listener) {
        this.ftpStatusListener = listener;
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public void setWifiStatusListener(@Nullable IWifiFtpDevice.IDeviceWifiStatusListener listener) {
        this.wifiStatusListener = listener;
    }

    @NotNull
    public final APReason toApReason(@NotNull TransformMode transformMode) {
        if (transformMode == TransformMode.Music) {
            return APReason.Music;
        }
        if (transformMode == TransformMode.Record) {
            return APReason.Record;
        }
        return transformMode == TransformMode.ModemLog ? APReason.ModemLog : APReason.INSTANCE.fromValue(transformMode.getValue());
    }
}
