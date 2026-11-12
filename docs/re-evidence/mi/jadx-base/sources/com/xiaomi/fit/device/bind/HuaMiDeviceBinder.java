package com.xiaomi.fit.device.bind;

import android.content.Intent;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.device.bind.HuaMiDeviceBinder;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.huami.HuaMiDeviceTool;
import com.xiaomi.fit.device.huami.HuaMiInternalApiCaller;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.ui.bind.BindDataTrackerKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.q12;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0094@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00064"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiDeviceBinder;", "Lcom/xiaomi/fit/device/bind/BaseDeviceBinder;", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "", "checkDeviceBind", "(Lcom/xiaomi/fitness/device/manager/a;)V", "bindDevice", "bindDeviceToServer", "", "needCheckLockRegion", "()Z", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiDevice", "isParallel", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;)Z", "unbindHuaMiDevice", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Lcom/xiaomi/fitness/device/manager/a;)V", "", "random", "publicKeyHashString", "getSignKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "disconnectBluetooth", "()V", "", "from", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "code", "unbind", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", BroadcastsKt.SILENT_PUSHING_CANCEL, "mac", "Ljava/lang/String;", "model", "mCanceled", "Z", "isBindStart", "setBindStart", "(Z)V", "Lcom/xiaomi/fit/device/bind/HuaMiRequest;", "mHuaMiRequest$delegate", "Lkotlin/Lazy;", "getMHuaMiRequest", "()Lcom/xiaomi/fit/device/bind/HuaMiRequest;", "mHuaMiRequest", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiDeviceBinder extends BaseDeviceBinder {
    private static final int ERROR_CODE_BIND_TO_SERVER = 8;
    private static final int ERROR_CODE_BIND_TO_SERVER_FAILURE = 10;
    private static final int ERROR_CODE_BIND_TO_SERVER_SUCCESS = 9;
    private static final int ERROR_CODE_CHECK_BIND = 1;
    private static final int ERROR_CODE_CHECK_IS_PARALLEL = 12;
    private static final int ERROR_CODE_CONNECT_TIMEOUT = 3;
    private static final int ERROR_CODE_DISCONNECTED = 4;
    private static final int ERROR_CODE_HAVE_BOUND = 2;
    private static final int ERROR_CODE_REQUEST_DEVICES = 11;
    private static final int ERROR_CODE_START_VERIFY_SIGNATURE = 5;
    private static final int ERROR_CODE_SUCCESS = 0;
    private static final int ERROR_CODE_VERIFY_DENY = 7;
    private static final int ERROR_CODE_VERIFY_FAILURE = 6;
    private boolean isBindStart;
    private boolean mCanceled;

    /* JADX INFO: renamed from: mHuaMiRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHuaMiRequest;

    @NotNull
    private final String mac;

    @NotNull
    private final String model;

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiDeviceBinder$unbindHuaMiDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiDeviceBinder$unbindHuaMiDevice$1", f = "HuaMiDeviceBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.xiaomi.fitness.device.manager.a $callback;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        int label;
        final /* synthetic */ HuaMiDeviceBinder this$0;

        /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiDeviceBinder$unbindHuaMiDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiDeviceBinder$unbindHuaMiDevice$1$1", f = "HuaMiDeviceBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ com.xiaomi.fitness.device.manager.a $callback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03611(com.xiaomi.fitness.device.manager.a aVar, Continuation<? super C03611> continuation) {
                super(2, continuation);
                this.$callback = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03611(this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws RemoteException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.xiaomi.fitness.device.manager.a aVar = this.$callback;
                if (aVar != null) {
                    aVar.onBindFailure(12);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15081(HuamiApiCaller huamiApiCaller, HuaMiDeviceBinder huaMiDeviceBinder, com.xiaomi.fitness.device.manager.a aVar, Continuation<? super C15081> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.this$0 = huaMiDeviceBinder;
            this.$callback = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15081(this.$huamiDevice, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                boolean zUnbindSync = this.$huamiDevice.unbindSync();
                Logger.i(this.this$0.getTAG() + ": unbind this parallel:" + zUnbindSync, new Object[0]);
            } catch (Exception e) {
                Logger.e("HuaMiDeviceBinder", "unbindHuaMiDevice: " + e);
            }
            AnyExtKt.main$default(null, new C03611(this.$callback, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaMiDeviceBinder(@NotNull WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        String mac = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        this.mac = mac;
        this.model = deviceInfo.getModel();
        this.mHuaMiRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fic
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuaMiDeviceBinder.mHuaMiRequest_delegate$lambda$0();
            }
        });
    }

    private final void bindDevice(final com.xiaomi.fitness.device.manager.a callback) {
        Logger.i("start bind device(" + this.mac + ")", new Object[0]);
        this.isBindStart = true;
        BindDataTrackerKt.reportBindStart();
        HuaMiDeviceTool.INSTANCE.getInstance().bind(this.mac, new IDeviceBaseCallback() { // from class: com.xiaomi.fit.device.bind.HuaMiDeviceBinder.bindDevice.1
            @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
            public void onConnectionStateChange(int status, int state, int errorCode) throws RemoteException {
                Logger.i(HuaMiDeviceBinder.this.getTAG() + ":onConnectionStateChange: status=" + status + ", state=" + state + ", errorCode=" + errorCode, new Object[0]);
                if (HuaMiDeviceBinder.this.getIsBindStart()) {
                    if (status == HuamiDevice.CONNECT) {
                        if (state == HuamiDevice.CONNECTING_TIMEOUT) {
                            com.xiaomi.fitness.device.manager.a aVar = callback;
                            if (aVar != null) {
                                aVar.onConnectFailure(3);
                            }
                            HuaMiDeviceBinder.this.reportBindFailure(3, "connect timeout");
                            return;
                        }
                        if (state == HuamiDevice.DISCONNECTED) {
                            com.xiaomi.fitness.device.manager.a aVar2 = callback;
                            if (aVar2 != null) {
                                aVar2.onConnectFailure(4);
                            }
                            HuaMiDeviceBinder.this.reportBindFailure(4, "device disconnect");
                            return;
                        }
                        if (state == HuamiDevice.CONNECTED) {
                            com.xiaomi.fitness.device.manager.a aVar3 = callback;
                            if (aVar3 != null) {
                                aVar3.onPairingSuccess(null);
                            }
                            HuaMiDeviceBinder.this.bindDeviceToServer(callback);
                            return;
                        }
                        return;
                    }
                    if (status == HuamiDevice.AUTH) {
                        if (state == HuamiDevice.KNOCK) {
                            com.xiaomi.fitness.device.manager.a aVar4 = callback;
                            if (aVar4 != null) {
                                aVar4.onConnectSuccess();
                                return;
                            }
                            return;
                        }
                        if (state != HuamiDevice.KNOCK_SUCCESS) {
                            if (state == HuamiDevice.DENY) {
                                HuaMiDeviceTool.INSTANCE.getInstance().removeHuaMiDevice(HuaMiDeviceBinder.this.mac);
                                com.xiaomi.fitness.device.manager.a aVar5 = callback;
                                if (aVar5 != null) {
                                    aVar5.onPairingFailure(7);
                                }
                                HuaMiDeviceBinder.this.reportBindFailure(7, "pair deny");
                                return;
                            }
                            if (state == HuamiDevice.SUCCESS || state != HuamiDevice.FAILED) {
                                return;
                            }
                            HuaMiDeviceTool.INSTANCE.getInstance().removeHuaMiDevice(HuaMiDeviceBinder.this.mac);
                            com.xiaomi.fitness.device.manager.a aVar6 = callback;
                            if (aVar6 != null) {
                                aVar6.onPairingFailure(6);
                            }
                            HuaMiDeviceBinder.this.reportBindFailure(6, "fail to bind");
                        }
                    }
                }
            }

            @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
            public String onGetSignData(String sha256Base64, String publicKeyHashString) {
                Logger.i(HuaMiDeviceBinder.this.getTAG(), "onGetSignData sha256Base64:" + sha256Base64 + ",publicKeyHashString:" + publicKeyHashString);
                if (TextUtils.isEmpty(sha256Base64) || TextUtils.isEmpty(publicKeyHashString) || HuaMiDeviceBinder.this.mCanceled) {
                    return null;
                }
                HuaMiDeviceBinder huaMiDeviceBinder = HuaMiDeviceBinder.this;
                Intrinsics.checkNotNull(sha256Base64);
                Intrinsics.checkNotNull(publicKeyHashString);
                return huaMiDeviceBinder.getSignKey(sha256Base64, publicKeyHashString);
            }

            @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
            public void onStepChanged(int p0) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDeviceToServer(final com.xiaomi.fitness.device.manager.a callback) throws RemoteException {
        Logger.i(getTAG(), "bindDeviceToServer start");
        HuaMiInternalApiCaller huaMiDevice = HuaMiDeviceTool.INSTANCE.getInstance().getHuaMiDevice(this.mac);
        if (huaMiDevice == null) {
            Logger.i(getTAG() + "bindDeviceToServer huaMiDevice == null", new Object[0]);
            if (callback != null) {
                callback.onConnectFailure(4);
                return;
            }
            return;
        }
        if (needCheckLockRegion() && isParallel(huaMiDevice)) {
            unbindHuaMiDevice(huaMiDevice, callback);
            return;
        }
        DeviceInfoExt deviceInfo = huaMiDevice.getDeviceInfo();
        if (deviceInfo == null) {
            Logger.i(getTAG() + "bindDeviceToServer deviceInfo == null", new Object[0]);
            return;
        }
        setMDid("huami." + deviceInfo.getSn());
        setSn(deviceInfo.getSn());
        BindRequestData bindRequestDataCreate = BindRequestData.INSTANCE.create(deviceInfo.getSn(), this.mac, deviceInfo.getDeviceId(), deviceInfo.getDeviceType(), deviceInfo.getDeviceSource(), deviceInfo.getAuthKey(), deviceInfo.getFirmwareVersion(), deviceInfo.getSoftwareVersion(), deviceInfo.getSystemVersion(), deviceInfo.getSystemModel(), deviceInfo.getHardwareVersion());
        Logger.d(getTAG() + bindRequestDataCreate, new Object[0]);
        getMHuaMiRequest().bindDevice(bindRequestDataCreate, new Function1() { // from class: gic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiDeviceBinder.bindDeviceToServer$lambda$3(this.f19024a, callback, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: hic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiDeviceBinder.bindDeviceToServer$lambda$4(callback, this, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDeviceToServer$lambda$3(HuaMiDeviceBinder this$0, com.xiaomi.fitness.device.manager.a aVar, boolean z) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setBindSuccess(true);
        HuaMiInternalApiCaller huaMiDevice = HuaMiDeviceTool.INSTANCE.getInstance().getHuaMiDevice(this$0.mac);
        if (huaMiDevice != null) {
            huaMiDevice.updateDid(this$0.getMDid());
        }
        String str = this$0.model;
        String mDid = this$0.getMDid();
        String str2 = this$0.mac;
        String sn = this$0.getSn();
        if (sn == null) {
            sn = "";
        }
        this$0.onBindSuccess(str, mDid, str2, sn);
        if (aVar != null) {
            aVar.onBindSuccess(this$0.getMDid());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDeviceToServer$lambda$4(com.xiaomi.fitness.device.manager.a aVar, HuaMiDeviceBinder this$0, ApiException it) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (aVar != null) {
            aVar.onBindFailure(10);
        }
        this$0.reportBindFailure(8, "bind to server fail");
        return Unit.INSTANCE;
    }

    private final void checkDeviceBind(final com.xiaomi.fitness.device.manager.a callback) {
        getMHuaMiRequest().checkDeviceBind(this.mac, this.model, new Function1() { // from class: dic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiDeviceBinder.checkDeviceBind$lambda$1(callback, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: eic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiDeviceBinder.checkDeviceBind$lambda$2(this.f16675a, callback, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceBind$lambda$1(com.xiaomi.fitness.device.manager.a aVar, boolean z) throws RemoteException {
        if (aVar != null) {
            aVar.onBindFailure(1003);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceBind$lambda$2(HuaMiDeviceBinder this$0, com.xiaomi.fitness.device.manager.a aVar, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.bindDevice(aVar);
        return Unit.INSTANCE;
    }

    private final void disconnectBluetooth() {
        if (RomUtils.isXiaomi() && Settings.Secure.getInt(ApplicationExtKt.getApplication().getContentResolver(), "bluetooth_unlock_status", 0) == 1 && Intrinsics.areEqual(Settings.Secure.getString(ApplicationExtKt.getApplication().getContentResolver(), "bluetooth_address_to_unlock"), this.mac)) {
            Intent intent = new Intent("com.xiaomi.hm.health.ACTION_DEVICE_UNBIND_APPLICATION");
            intent.setClassName(Constants.SETTINGS_PACKAGE, "com.android.settings.MiuiBluetoothDeviceActionReceiver");
            ApplicationExtKt.getApplication().sendBroadcast(intent);
        }
    }

    private final HuaMiRequest getMHuaMiRequest() {
        return (HuaMiRequest) this.mHuaMiRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSignKey(String random, String publicKeyHashString) throws InterruptedException {
        if (this.mCanceled) {
            return null;
        }
        byte[] bytes = this.mac.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strI = q12.i(bytes);
        Intrinsics.checkNotNullExpressionValue(strI, "encode(...)");
        String serverSign = getMHuaMiRequest().getServerSign(strI, random, publicKeyHashString);
        if (this.mCanceled) {
            return null;
        }
        Logger.d(getTAG(), "serverSign = " + serverSign);
        return serverSign;
    }

    private final boolean isParallel(HuamiApiCaller huamiDevice) {
        return huamiDevice.isMiliMainLand() && !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HuaMiRequest mHuaMiRequest_delegate$lambda$0() {
        return new HuaMiRequest();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.fitness.device.manager.bean.Product] */
    private final boolean needCheckLockRegion() {
        List<String> features;
        ?? productByModel = DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductByModel(getMDeviceInfo().getModel());
        return (productByModel == 0 || (features = productByModel.getFeatures()) == null || !features.contains(Feature.LOCK_REGION)) ? false : true;
    }

    private final void unbindHuaMiDevice(HuamiApiCaller huamiDevice, com.xiaomi.fitness.device.manager.a callback) {
        Logger.i(getTAG() + ": This device(" + this.mac + ") is parallel, and unbind it", new Object[0]);
        AnyExtKt.io$default(null, new C15081(huamiDevice, this, callback, null), 1, null);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void bind(int from, @Nullable com.xiaomi.fitness.device.manager.a callback) {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
        checkDeviceBind(callback);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void cancel() {
        super.cancel();
        HuaMiInternalApiCaller huaMiDevice = HuaMiDeviceTool.INSTANCE.getInstance().getHuaMiDevice(this.mac);
        if (huaMiDevice != null) {
            huaMiDevice.disconnect();
        }
        this.mCanceled = true;
    }

    /* JADX INFO: renamed from: isBindStart, reason: from getter */
    public final boolean getIsBindStart() {
        return this.isBindStart;
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.zd4
    public /* bridge */ /* synthetic */ void onDisconnect() {
        super.onDisconnect();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
        super.onRemoveFailure(i);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveSuccess() {
        super.onRemoveSuccess();
    }

    public final void setBindStart(boolean z) {
        this.isBindStart = z;
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder
    @Nullable
    public Object unbind(int i, @NotNull Continuation<? super Integer> continuation) {
        String mac;
        disconnectBluetooth();
        if (isDeviceConnect() && (mac = getMDeviceInfo().getMac()) != null && mac.length() != 0) {
            HuaMiInternalApiCaller huaMiDevice = HuaMiDeviceTool.INSTANCE.getInstance().getHuaMiDevice(mac);
            DeviceModelExtKt.logi("unbind HuaMi device, result is " + (huaMiDevice != null ? Boxing.boxBoolean(huaMiDevice.unbindSync()) : null));
        }
        return Boxing.boxInt(i);
    }
}
