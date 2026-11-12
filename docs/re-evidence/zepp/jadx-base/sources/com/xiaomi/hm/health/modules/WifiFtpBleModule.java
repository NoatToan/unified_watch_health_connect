package com.xiaomi.hm.health.modules;

import android.content.Context;
import com.huami.bluetooth.profile.channel.module.ApStatus;
import com.huami.bluetooth.profile.channel.module.ConnectStatus;
import com.huami.bluetooth.profile.channel.module.FtpServerStatus;
import com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.IWifiFtpModule;
import com.huami.watch.wififtp.WifiFtpModule;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0002J\u0010\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J+\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u000eH\u0016R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/modules/WifiFtpBleModule;", "Lcom/huami/watch/wififtp/IWifiFtpModule;", "Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", "Lcom/xiaomi/hm/health/modules/DataChannelWifiAp;", "b", "Lcom/huami/bluetooth/profile/channel/module/WifiFtpModule;", "Lcom/xiaomi/hm/health/modules/DataChannelFtp;", "a", "", "isBleDevice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getDeviceAddress", "", "getDeviceSource", "hasBoundDevice", "isDeviceConnected", "", PointCategory.INIT, "release", "ssid", "pwd", "keyMgmt", "sendEnableWifiAP", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDisableWifiAP", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEnableFtp", "sendDisableFtp", "getMusicInfoMaxLength", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WifiFtpBleModule implements IWifiFtpModule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseBleDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseBleDevice hMBaseBleDevice) {
            super(0);
            this.a = hMBaseBleDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HMBaseBleDevice hMBaseBleDevice = this.a;
            return "getMusicInfoMaxLength return default, as device source is: " + (hMBaseBleDevice == null ? null : hMBaseBleDevice.getMDeviceSource());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/FtpServerStatus;", "status", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<FtpServerStatus, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ FtpServerStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FtpServerStatus ftpServerStatus) {
                super(0);
                this.a = ftpServerStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "OnFTP State Changed: " + this.a;
            }
        }

        public b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0026  */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        public final void a(@NotNull FtpServerStatus ftpServerStatus) {
            HMLog.info("WifiFtpModule-BLE", new a(ftpServerStatus));
            int i = 1;
            if (ftpServerStatus.getStateCode() == 2) {
                String address = ftpServerStatus.getAddress();
                if (!(address == null || address.length() == 0)) {
                    i = 2;
                } else if (ftpServerStatus.getStateCode() != 0) {
                    i = 3;
                }
            } else if (ftpServerStatus.getStateCode() != 0) {
                i = 3;
            }
            WifiFtpModule.notifyFtpServerStateChanged(i, ftpServerStatus.getAddress(), ftpServerStatus.getUserName());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FtpServerStatus ftpServerStatus) {
            a(ftpServerStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.modules.WifiFtpBleModule", f = "WifiFtpBleModule.kt", i = {}, l = {63}, m = "sendDisableFtp", n = {}, s = {})
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
            return WifiFtpBleModule.this.sendDisableFtp(this);
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
            return "Send Disable Ftp!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.modules.WifiFtpBleModule", f = "WifiFtpBleModule.kt", i = {}, l = {53}, m = "sendDisableWifiAP", n = {}, s = {})
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
            return WifiFtpBleModule.this.sendDisableWifiAP(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Send Disable WifiAp!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.modules.WifiFtpBleModule", f = "WifiFtpBleModule.kt", i = {}, l = {58}, m = "sendEnableFtp", n = {}, s = {})
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
            return WifiFtpBleModule.this.sendEnableFtp(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Send Enable Ftp!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.modules.WifiFtpBleModule", f = "WifiFtpBleModule.kt", i = {}, l = {48}, m = "sendEnableWifiAP", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WifiFtpBleModule.this.sendEnableWifiAP(null, null, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, int i) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Send Enable WifiAp: [SSID: " + this.a + ", PWD: " + this.b + ", KeyMgmt: " + this.c + "]";
        }
    }

    public WifiFtpBleModule(@NotNull Context context) {
        this.context = context;
    }

    private final com.huami.bluetooth.profile.channel.module.WifiFtpModule a() {
        com.huami.bluetooth.profile.channel.module.WifiFtpModule wifiFtpModule;
        HMBaseDevice currentDeviceMili = ModulesUtil.getCurrentDeviceMili();
        if (currentDeviceMili == null || (wifiFtpModule = (com.huami.bluetooth.profile.channel.module.WifiFtpModule) currentDeviceMili.getChannelModule(com.huami.bluetooth.profile.channel.module.WifiFtpModule.class)) == null) {
            return null;
        }
        wifiFtpModule.setFtpListener(b.a);
        return wifiFtpModule;
    }

    private final WiFiControllerModule b() {
        WiFiControllerModule wiFiControllerModule;
        HMBaseDevice currentDeviceMili = ModulesUtil.getCurrentDeviceMili();
        if (currentDeviceMili == null || (wiFiControllerModule = (WiFiControllerModule) currentDeviceMili.getChannelModule(WiFiControllerModule.class)) == null) {
            return null;
        }
        wiFiControllerModule.setControllerCallback("WifiFtpModule", new IWiFiControllerCallback() { // from class: com.xiaomi.hm.health.modules.WifiFtpBleModule$initDataChannelWifiAp$1$1

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

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ApStatus a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ApStatus apStatus) {
                    super(0);
                    this.a = apStatus;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "OnWifiAP State Changed: " + this.a;
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onAddWifiRequest(@Nullable String str) {
                IWiFiControllerCallback.DefaultImpls.onAddWifiRequest(this, str);
            }

            @Override // com.huami.bluetooth.profile.channel.module.IWiFiControllerCallback
            public void onApStateChanged(@NotNull ApStatus status) {
                HMLog.info("WifiFtpModule-BLE", new a(status));
                int i2 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i2 == 1) {
                    WifiFtpModule.notifyWifiApStateChanged(13);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    WifiFtpModule.notifyWifiApStateChanged(11);
                }
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
        });
        return wiFiControllerModule;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    @NotNull
    public String getDeviceAddress(@NotNull Context context) {
        DeviceInfo deviceInfo;
        String deviceID;
        HMBaseDevice currentDeviceMili = ModulesUtil.getCurrentDeviceMili();
        return (currentDeviceMili == null || (deviceInfo = currentDeviceMili.getDeviceInfo()) == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID;
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public int getDeviceSource(@NotNull Context context) {
        DeviceInfo deviceInfo;
        HMDeviceSource deviceSource;
        HMBaseDevice currentDeviceMili = ModulesUtil.getCurrentDeviceMili();
        if (currentDeviceMili == null || (deviceInfo = currentDeviceMili.getDeviceInfo()) == null || (deviceSource = deviceInfo.getDeviceSource()) == null) {
            return 0;
        }
        return deviceSource.getValue();
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public int getMusicInfoMaxLength() {
        HMBaseDevice currentDeviceMili = ModulesUtil.getCurrentDeviceMili();
        HMBaseBleDevice hMBaseBleDevice = currentDeviceMili instanceof HMBaseBleDevice ? (HMBaseBleDevice) currentDeviceMili : null;
        boolean z = false;
        if (hMBaseBleDevice != null && hMBaseBleDevice.isHuamiOs()) {
            z = true;
        }
        if (z) {
            return -1;
        }
        HMLog.info("WifiFtpModule-BLE", new a(hMBaseBleDevice));
        return IWifiFtpModule.DefaultImpls.getMusicInfoMaxLength(this);
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public boolean hasBoundDevice(@NotNull Context context) {
        return true;
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public void init(@NotNull Context context) {
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public boolean isBleDevice() {
        return ModulesUtil.isCurrentDeviceMili();
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public boolean isDeviceConnected(@NotNull Context context) {
        return ModulesUtil.isCurrentDeviceConnected();
    }

    @Override // com.huami.watch.wififtp.IWifiFtpModule
    public void release() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.watch.wififtp.IWifiFtpModule
    @Nullable
    public Object sendDisableFtp(@NotNull Continuation<? super Boolean> continuation) {
        c cVar;
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
        Object objStopServer = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objStopServer);
            HMLog.info("WifiFtpModule-BLE", d.a);
            com.huami.bluetooth.profile.channel.module.WifiFtpModule wifiFtpModuleA = a();
            if (wifiFtpModuleA != null) {
                cVar.c = 1;
                objStopServer = wifiFtpModuleA.stopServer(cVar);
                if (objStopServer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objStopServer);
        Boolean bool = (Boolean) objStopServer;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.watch.wififtp.IWifiFtpModule
    @Nullable
    public Object sendDisableWifiAP(@NotNull Continuation<? super Boolean> continuation) {
        e eVar;
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
        Object objStopAp = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objStopAp);
            HMLog.info("WifiFtpModule-BLE", f.a);
            WiFiControllerModule wiFiControllerModuleB = b();
            if (wiFiControllerModuleB != null) {
                eVar.c = 1;
                objStopAp = wiFiControllerModuleB.stopAp(eVar);
                if (objStopAp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objStopAp);
        Boolean bool = (Boolean) objStopAp;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.watch.wififtp.IWifiFtpModule
    @Nullable
    public Object sendEnableFtp(@NotNull Continuation<? super Boolean> continuation) {
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
        Object objStartServer = gVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objStartServer);
            HMLog.info("WifiFtpModule-BLE", h.a);
            com.huami.bluetooth.profile.channel.module.WifiFtpModule wifiFtpModuleA = a();
            if (wifiFtpModuleA != null) {
                gVar.c = 1;
                objStartServer = wifiFtpModuleA.startServer(gVar);
                if (objStartServer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objStartServer);
        Boolean bool = (Boolean) objStartServer;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.watch.wififtp.IWifiFtpModule
    @Nullable
    public Object sendEnableWifiAP(@NotNull String str, @NotNull String str2, int i2, @NotNull Continuation<? super Boolean> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.c = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object objStartAp$default = iVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = iVar2.c;
        boolean zBooleanValue = false;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objStartAp$default);
            HMLog.info("WifiFtpModule-BLE", new j(str, str2, i2));
            WiFiControllerModule wiFiControllerModuleB = b();
            if (wiFiControllerModuleB != null) {
                iVar2.c = 1;
                objStartAp$default = WiFiControllerModule.startAp$default(wiFiControllerModuleB, str, str2, null, iVar2, 4, null);
                if (objStartAp$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objStartAp$default);
        Boolean bool = (Boolean) objStartAp$default;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
