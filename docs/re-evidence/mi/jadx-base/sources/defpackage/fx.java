package defpackage;

import android.bluetooth.BluetoothDevice;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi;
import com.xiaomi.hm.health.bt.sdk.fw.IUpgradeCallback;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u001d\u0010!\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*¨\u00060"}, d2 = {"Lfx;", "Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "", "connect", "()V", "disconnect", "Lkotlin/Function1;", "", "callback", "setConnectStatusCallback", "(Lkotlin/jvm/functions/Function1;)V", "", "isConnected", "()Z", "", "uid", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "syncWeightData", "(J)Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "enable", "enablePartMeasure", "(Z)Z", "Lcom/xiaomi/hm/health/bt/profile/weight/IOFMeasurementCallback;", "forceStart", "startOneFootMeasure", "(Lcom/xiaomi/hm/health/bt/profile/weight/IOFMeasurementCallback;Z)V", "stopOneFootMeasure", "unit", "setUnit", "(I)Z", "clearHistoryData", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "setWeightDataCallback", "(Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "", "path", "Lcom/xiaomi/hm/health/bt/sdk/fw/IUpgradeCallback;", "upgradeFirmware", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/sdk/fw/IUpgradeCallback;)V", "Lcom/xiaomi/hm/health/bt/sdk/DeviceInfoExt;", "getDeviceInfo", "()Lcom/xiaomi/hm/health/bt/sdk/DeviceInfoExt;", "Lbys;", "weightDevice", "<init>", "(Lbys;)V", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class fx implements IWeightDeviceApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f18331b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final bys f18332a;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lfx$a;", "", "", "CONNECTED", "I", "CONNECTING", "CONNECTING_TIMEOUT", "DISCONNECTED", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18333a;

        static {
            int[] iArr = new int[wt.values().length];
            try {
                iArr[wt.CONNECTING_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wt.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wt.AUTH_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18333a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"fx$c", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "", LifecycleConstantKt.ON_START, DeviceTagInterface.CUSTOM_TAG_TYPE, PluginDeviceInfo.FMODEL, "", "result", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class c extends HMCallback<WeightSyncResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<WeightSyncResult> f18334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f18335b;

        public c(Ref.ObjectRef<WeightSyncResult> objectRef, CountDownLatch countDownLatch) {
            this.f18334a = objectRef;
            this.f18335b = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(@Nullable WeightSyncResult t) {
            t5t.d("BfsWeightDeviceApiImpl", "同步到到体脂秤数据:" + t);
            this.f18334a.element = t;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            t5t.d("BfsWeightDeviceApiImpl", "同步体脂秤历史记录结果:" + result);
            this.f18335b.countDown();
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            t5t.d("BfsWeightDeviceApiImpl", "开始同步同步体脂秤数据");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"fx$d", "Ljys;", "", "none", "", PluginDeviceInfo.FMODEL, "(I)V", "", "result", "onFwStop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onFwProgress", "(Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class d implements jys {
        public final /* synthetic */ IUpgradeCallback t;

        public d(IUpgradeCallback iUpgradeCallback) {
            this.t = iUpgradeCallback;
        }

        @Override // defpackage.jys
        public void a(int none) {
            t5t.d("BfsWeightDeviceApiImpl", "开始升级固件:" + none);
        }

        @Override // defpackage.jys
        public void onFwProgress(@NotNull Progress progress) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.t.onProgress(progress);
        }

        @Override // defpackage.jys
        public void onFwStop(boolean result) {
            this.t.onFinish(result);
        }
    }

    public fx(@NotNull bys weightDevice) {
        Intrinsics.checkNotNullParameter(weightDevice, "weightDevice");
        this.f18332a = weightDevice;
    }

    public static final void a(Function1 callback, BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        int i = wtVar == null ? -1 : b.f18333a[wtVar.ordinal()];
        if (i == 1) {
            callback.invoke2(3);
            return;
        }
        if (i == 2) {
            callback.invoke2(2);
        } else if (i != 3) {
            callback.invoke2(0);
        } else {
            callback.invoke2(1);
        }
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public boolean clearHistoryData() {
        return this.f18332a.e1();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void connect() {
        this.f18332a.X0(true);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void disconnect() {
        this.f18332a.G();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public boolean enablePartMeasure(boolean enable) {
        return this.f18332a.o1(enable);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    @Nullable
    public DeviceInfoExt getDeviceInfo() {
        g4s g4sVarO;
        if (!isConnected() || (g4sVarO = this.f18332a.O()) == null) {
            return null;
        }
        hws hwsVarO0 = g4sVarO.o0();
        qd qdVarI = g4sVarO.I();
        DeviceInfoExt deviceInfoExt = new DeviceInfoExt();
        deviceInfoExt.setMacAddress(this.f18332a.L().getAddress());
        deviceInfoExt.setDeviceId(g4sVarO.G());
        deviceInfoExt.setSn(g4sVarO.a());
        deviceInfoExt.setFirmwareVersion(g4sVarO.e0());
        deviceInfoExt.setHardwareVersion(g4sVarO.i0());
        deviceInfoExt.setPnpId(g4sVarO.q0());
        deviceInfoExt.setPnpVersion(g4sVarO.s0());
        deviceInfoExt.setDeviceType(qdVarI.a().a());
        deviceInfoExt.setDeviceSource(qdVarI.b());
        if (hwsVarO0 != null) {
            deviceInfoExt.setVendorId(hwsVarO0.f20555a);
            deviceInfoExt.setVendorSource(hwsVarO0.f20556b);
        }
        return deviceInfoExt;
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public boolean isConnected() {
        return this.f18332a.V();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void setConnectStatusCallback(@NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18332a.q(new IHMConnectionCallback() { // from class: cus
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar) {
                fx.a(callback, bluetoothDevice, sdVar, wtVar);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public boolean setUnit(int unit) {
        return this.f18332a.m1(kf.a((byte) unit));
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void setWeightDataCallback(@NotNull HMCallback<WeightAdvData> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18332a.n1(callback);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void startOneFootMeasure(@NotNull IOFMeasurementCallback callback, boolean forceStart) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18332a.l1(callback, forceStart);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public boolean stopOneFootMeasure() {
        return this.f18332a.g1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    @NotNull
    public WeightSyncResult syncWeightData(long uid) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f18332a.j1(uid, new c(objectRef, countDownLatch));
        countDownLatch.await();
        WeightSyncResult weightSyncResult = (WeightSyncResult) objectRef.element;
        return weightSyncResult == null ? new WeightSyncResult() : weightSyncResult;
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IWeightDeviceApi
    public void upgradeFirmware(@NotNull String path, @NotNull IUpgradeCallback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18332a.D0(new xd(path, yd.FIRMWARE), new d(callback));
    }
}
