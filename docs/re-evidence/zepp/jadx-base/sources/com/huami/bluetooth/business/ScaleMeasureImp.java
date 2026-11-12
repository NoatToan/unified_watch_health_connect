package com.huami.bluetooth.business;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.weight.AmazfitScaleProfile;
import com.xiaomi.hm.health.bt.profile.weight.AmazfitScaleRecordParser;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0017\u0012\u0006\u0010*\u001a\u00020&\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J#\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\nR\u0019\u0010*\u001a\u00020&8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b+\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010K\u001a\n H*\u0004\u0018\u00010G0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/huami/bluetooth/business/ScaleMeasureImp;", "Lcom/huami/bluetooth/business/IScaleMeasureApi;", "Lcom/huami/bluetooth/business/IDeviceLifeCycle;", "", "c", GoogleApiAvailabilityLight.a, "a", "onConnecting", "onConnectFailed", "onConnectTimeout", "", "isForce", "onCreate", "onDestroy", "onConnected", "onDisConnect", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", Scopes.PROFILE, "setChannel", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "callback", "registerDeviceInfoCallback", "registerConnectCallback", "", "byteArray", "onData", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "registerMeasureListener", "", "userId", ParamKey.memberId, "selectUser", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "breakMeasure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedConnecWhileWeighting", "", LogUtil.I, "getDeviceSource", "()I", "deviceSource", "b", "Z", "isConnecting", "()Z", "setConnecting", "(Z)V", "isDestroy", "setDestroy", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "dataCallback", "Lcom/huami/bluetooth/business/IChannel;", "e", "Lcom/huami/bluetooth/business/IChannel;", "channel", "f", "Lkotlin/jvm/functions/Function0;", "deviceInfoCallback", "g", "connectCallback", "Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleRecordParser;", "h", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleRecordParser;", "parser", "Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback;", "i", "Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback;", "bleScanCallback", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "kotlin.jvm.PlatformType", z.j, "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "scanOption", "", "deviceAddress", "<init>", "(ILjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScaleMeasureImp implements IScaleMeasureApi, IDeviceLifeCycle {

    @NotNull
    private static final String k = "ScaleMeasureImp";
    private static final int l = 1;
    private static final int m = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isConnecting;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isDestroy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private HMCallback<WeightAdvData> dataCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IChannel channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function0<DeviceInfo> deviceInfoCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> connectCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy parser = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IBleScanCallback bleScanCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final BleScanOption scanOption;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.business.ScaleMeasureImp", f = "ScaleMeasureImp.kt", i = {}, l = {130}, m = "breakMeasure", n = {}, s = {})
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
            return ScaleMeasureImp.this.breakMeasure(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleRecordParser;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<AmazfitScaleRecordParser> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AmazfitScaleRecordParser invoke() {
            return new AmazfitScaleRecordParser(ScaleMeasureImp.this.getDeviceSource(), null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.business.ScaleMeasureImp", f = "ScaleMeasureImp.kt", i = {}, l = {122}, m = "selectUser", n = {}, s = {})
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
            return ScaleMeasureImp.this.selectUser(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<byte[], Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
            ScaleMeasureImp.this.onData(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public ScaleMeasureImp(int i, @NotNull String str) {
        this.deviceSource = i;
        IBleScanCallback iBleScanCallback = new IBleScanCallback() { // from class: com.huami.bluetooth.business.ScaleMeasureImp$bleScanCallback$1
            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanError(@Nullable BleScanOption option) {
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanStart(@Nullable BleScanOption option) {
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanStop(@Nullable BleScanOption option) {
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanedDevice(@Nullable AdvData data, @Nullable BleScanOption option) {
                Debug.fi("ScaleMeasureImp", Intrinsics.stringPlus("Adv Raw data:", GattUtils.bytesToHexString(data == null ? null : data.getRawData())));
                Debug.fi("ScaleMeasureImp", Intrinsics.stringPlus("Adv Weight:", data == null ? null : data.weightData));
                if ((data != null ? data.weightData : null) != null) {
                    data.weightData.setSourceValue(this.a.getDeviceSource());
                    HMCallback hMCallback = this.a.dataCallback;
                    if (hMCallback != null) {
                        hMCallback.sendOnDataMessage(data.weightData);
                    }
                }
                this.a.a();
            }
        };
        this.bleScanCallback = iBleScanCallback;
        this.scanOption = new BleScanOption.Builder().scanTimeout(-1).callback(iBleScanCallback).filterAddress(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this.isConnecting) {
            return;
        }
        Debug.fi(k, "连接秤设备");
        Function0<Unit> function0 = this.connectCallback;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    private final AmazfitScaleRecordParser b() {
        return (AmazfitScaleRecordParser) this.parser.getValue();
    }

    private final void c() {
        d();
        BleScanCenter.getInstance().startScan(this.scanOption);
    }

    private final void d() {
        BleScanCenter.getInstance().stopScan(this.scanOption);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    @Nullable
    public Object breakMeasure(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        boolean z;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objSendData = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        boolean z2 = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendData);
            IChannel iChannel = this.channel;
            if (iChannel == null) {
                Debug.fi(k, "Channel not ready for send break command");
            } else {
                if (iChannel == null) {
                    z = false;
                } else {
                    aVar.c = 1;
                    objSendData = iChannel.sendData(new byte[]{2}, aVar);
                    if (objSendData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Debug.fi(k, Intrinsics.stringPlus("Break command send result:", Boxing.boxBoolean(z)));
                if (z) {
                    z2 = true;
                }
            }
            return Boxing.boxBoolean(z2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objSendData);
        if (((Boolean) objSendData).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Debug.fi(k, Intrinsics.stringPlus("Break command send result:", Boxing.boxBoolean(z)));
        if (z) {
            z2 = true;
        }
        return Boxing.boxBoolean(z2);
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: isConnecting, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    /* JADX INFO: renamed from: isDestroy, reason: from getter */
    public final boolean getIsDestroy() {
        return this.isDestroy;
    }

    public final boolean isNeedConnecWhileWeighting() {
        return this.deviceSource == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectFailed() {
        this.isConnecting = false;
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectTimeout() {
        this.isConnecting = false;
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnected() {
        this.isConnecting = false;
        d();
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnecting() {
        this.isConnecting = true;
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onCreate(boolean isForce) {
        this.isConnecting = true;
        if (isForce) {
            return;
        }
        c();
    }

    public final void onData(@NotNull byte[] byteArray) {
        DeviceInfo deviceInfoInvoke;
        DeviceInfo deviceInfoInvoke2;
        HMDeviceSource deviceSource;
        for (WeightAdvData weightAdvData : b().parse(byteArray)) {
            Function0<DeviceInfo> function0 = this.deviceInfoCallback;
            Integer numValueOf = null;
            weightAdvData.setDeviceId((function0 == null || (deviceInfoInvoke = function0.invoke()) == null) ? null : deviceInfoInvoke.getDeviceID());
            Function0<DeviceInfo> function1 = this.deviceInfoCallback;
            if (function1 != null && (deviceInfoInvoke2 = function1.invoke()) != null && (deviceSource = deviceInfoInvoke2.getDeviceSource()) != null) {
                numValueOf = Integer.valueOf(deviceSource.getValue());
            }
            weightAdvData.setSourceValue(numValueOf == null ? HMDeviceSource.VDEVICE.getValue() : numValueOf.intValue());
            HMCallback<WeightAdvData> hMCallback = this.dataCallback;
            if (hMCallback != null) {
                hMCallback.sendOnDataMessage(weightAdvData);
            }
            Debug.fi(k, GattUtils.bytesToHexString(byteArray));
            Debug.fi(k, Intrinsics.stringPlus("Connected Measure:", weightAdvData));
            Debug.fi(k, String.valueOf(weightAdvData.getMeasureData()));
        }
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDestroy() {
        this.isConnecting = false;
        this.isDestroy = true;
        d();
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDisConnect() {
        if (this.isDestroy) {
            return;
        }
        this.isConnecting = false;
        c();
    }

    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    public void registerConnectCallback(@NotNull Function0<Unit> callback) {
        this.connectCallback = callback;
    }

    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    public void registerDeviceInfoCallback(@NotNull Function0<DeviceInfo> callback) {
        this.deviceInfoCallback = callback;
    }

    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    public void registerMeasureListener(@NotNull HMCallback<WeightAdvData> callback) {
        this.dataCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    @Nullable
    public Object selectUser(long j, long j2, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendData = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendData);
            IChannel iChannel = this.channel;
            if (iChannel != null) {
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{1}, GattUtils.numberToBytes(j, 6)), GattUtils.numberToBytes(j2, 6));
                cVar.c = 1;
                objSendData = iChannel.sendData(bArrPlus, cVar);
                if (objSendData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objSendData);
        if (((Boolean) objSendData).booleanValue()) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.bluetooth.business.IScaleMeasureApi
    public void setChannel(@NotNull BaseProfile profile) {
        AmazfitScaleProfile.Companion companion = AmazfitScaleProfile.INSTANCE;
        BleBusinessChannelImp bleBusinessChannelImp = new BleBusinessChannelImp(profile, companion.getCOMPOSITION_SERVICE(), companion.getMEASUREMENT_UUID());
        bleBusinessChannelImp.registerDataCallback(new d());
        this.channel = bleBusinessChannelImp;
    }

    public final void setConnecting(boolean z) {
        this.isConnecting = z;
    }

    public final void setDestroy(boolean z) {
        this.isDestroy = z;
    }
}
