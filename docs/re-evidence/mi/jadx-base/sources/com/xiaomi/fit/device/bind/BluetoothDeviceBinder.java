package com.xiaomi.fit.device.bind;

import android.os.RemoteException;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.utils.BleUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.wearable.NearbyService;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.mq2;
import defpackage.s33;
import defpackage.s7r;
import defpackage.txo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/device/bind/BluetoothDeviceBinder;", "Lcom/xiaomi/fit/device/bind/BaseDeviceBinder;", "", "removePair", "()V", "", "from", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "version", "onConnected", "status", "", "message", "onConnectFailure", "(ILjava/lang/String;)V", "code", "onBindFailure", BroadcastsKt.SILENT_PUSHING_CANCEL, "unbind", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fit/device/bind/a;", "wearBinder", "Lcom/xiaomi/fit/device/bind/a;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothDeviceBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDeviceBinder.kt\ncom/xiaomi/fit/device/bind/BluetoothDeviceBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
public class BluetoothDeviceBinder extends BaseDeviceBinder {
    private a wearBinder;

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.BluetoothDeviceBinder$removePair$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.BluetoothDeviceBinder$removePair$1", f = "BluetoothDeviceBinder.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BluetoothDeviceBinder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String mac = BluetoothDeviceBinder.this.getMDeviceInfo().getMac();
            if (mac == null) {
                mac = "";
            }
            boolean zG = s33.g(mac);
            Logger.i(BluetoothDeviceBinder.this.getTAG(), "removePair() called " + zG);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothDeviceBinder(@NotNull WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePair() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    public static /* synthetic */ Object unbind$suspendImpl(final BluetoothDeviceBinder bluetoothDeviceBinder, final int i, Continuation<? super Integer> continuation) {
        if (i == -1 || i == 0) {
            if (bluetoothDeviceBinder.isDeviceConnect()) {
                DeviceModelExtKt.logi("unbind reset ERASE_ALL");
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 0;
                txo txoVar = new txo();
                txoVar.j0(1);
                s7rVar.c0(txoVar);
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.device.bind.BluetoothDeviceBinder$unbind$2$1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        this.this$0.removePair();
                        safeContinuation.resumeWith(Result.m886constructorimpl(Integer.valueOf(code)));
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        this.this$0.removePair();
                        Continuation<Integer> continuation2 = safeContinuation;
                        Result.Companion companion = Result.Companion;
                        continuation2.resumeWith(Result.m886constructorimpl(Integer.valueOf(i)));
                    }
                }, 8000);
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
            bluetoothDeviceBinder.removePair();
        }
        return Boxing.boxInt(i);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void bind(int from, @Nullable final com.xiaomi.fitness.device.manager.a callback) throws InterruptedException, RemoteException {
        super.bind(from, callback);
        if (!getMDeviceInfo().getBindServer()) {
            BleUtil.INSTANCE.discovery();
            DeviceInfo deviceInfoConvert = DeviceModelExtKt.convert(getMDeviceInfo());
            if (deviceInfoConvert.getCreateBondWithoutDialog()) {
                NearbyService.INSTANCE.createBondWithoutDialog(deviceInfoConvert.getAddress());
            }
            IMiWearCoreClient.INSTANCE.getInstance().openUnauthConnection(deviceInfoConvert, new com.xiaomi.wearable.core.a.AbstractBinderC0858a() { // from class: com.xiaomi.fit.device.bind.BluetoothDeviceBinder.bind.2
                @Override // com.xiaomi.wearable.core.a
                public void onConnectFailed(int code, String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Logger.i(BluetoothDeviceBinder.this.getTAG(), "onConnectFailed() called with: code = " + code + ", message = " + message);
                    BluetoothDeviceBinder.this.onConnectFailure(code, message);
                }

                @Override // com.xiaomi.wearable.core.a
                public void onConnected(int version) {
                    Logger.i(BluetoothDeviceBinder.this.getTAG(), "onConnected() called with: version = " + version);
                    BluetoothDeviceBinder.this.onConnected(version, callback);
                }

                @Override // com.xiaomi.wearable.core.a
                public void onDisconnect() {
                    Logger.i(BluetoothDeviceBinder.this.getTAG(), "onDisconnect() called");
                    BluetoothDeviceBinder.this.onConnectFailure(1, "");
                }
            });
            return;
        }
        String mac = getMDeviceInfo().getMac();
        if (mac != null) {
            String upperCase = mac.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            requestDevice(upperCase);
        }
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void cancel() {
        super.cancel();
        a aVar = this.wearBinder;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wearBinder");
                aVar = null;
            }
            aVar.cancel();
        }
        IMiWearCoreClient companion = IMiWearCoreClient.INSTANCE.getInstance();
        String mac = getMDeviceInfo().getMac();
        if (mac == null) {
            mac = "";
        }
        companion.closeUnauthConnection(mac);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.kj2
    public void onBindFailure(int code, @Nullable String message) {
        String mac = getMDeviceInfo().getMac();
        if (mac != null) {
            IMiWearCoreClient.INSTANCE.getInstance().closeUnauthConnection(mac);
        }
        super.onBindFailure(code, message);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.zd4
    public void onConnectFailure(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String mac = getMDeviceInfo().getMac();
        if (mac != null) {
            IMiWearCoreClient.INSTANCE.getInstance().closeUnauthConnection(mac);
        }
        super.onConnectFailure(status, message);
    }

    public final void onConnected(int version, @Nullable com.xiaomi.fitness.device.manager.a callback) {
        if (callback != null) {
            try {
                callback.onConnectSuccess();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        a mq2Var = version == 0 ? new mq2(DeviceModelExtKt.convert(getMDeviceInfo())) : new WearBinderV2("", false, DeviceModelExtKt.convert(getMDeviceInfo()));
        this.wearBinder = mq2Var;
        mq2Var.start(this);
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

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder
    @Nullable
    public Object unbind(int i, @NotNull Continuation<? super Integer> continuation) {
        return unbind$suspendImpl(this, i, continuation);
    }
}
