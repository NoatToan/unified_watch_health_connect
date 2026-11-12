package com.xiaomi.hm.health.bt.sdk;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import defpackage.bys;
import defpackage.f5t;
import defpackage.fx;
import defpackage.gdt;
import defpackage.h3t;
import defpackage.jms;
import defpackage.ovs;
import defpackage.sd;
import defpackage.t5t;
import defpackage.vws;
import defpackage.wt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001?B\u000f\u0012\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b(\u0010#J'\u0010+\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010:\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/WeightBinder;", "Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback;", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "createBleDevice", "(Landroid/bluetooth/BluetoothDevice;)Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "Lgdt;", "advData", "", "isOnly", "", "handleWeightValue", "(Lgdt;Z)V", "Lsd;", "type", "onDeviceConnected", "(Landroid/bluetooth/BluetoothDevice;Lsd;)V", "onDeviceDisconnected", "(Lsd;)V", "Landroid/content/Context;", "context", "Lcom/xiaomi/hm/health/bt/sdk/IBindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startBind", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/sdk/IBindListener;)V", "bind", "(Landroid/bluetooth/BluetoothDevice;)V", "reSearch", "()V", "stopBind", "Lf5t;", "option", "onScanStart", "(Lf5t;)V", "onScanError", "data", "onScanedDevice", "(Lgdt;Lf5t;)V", "onScanStop", "Lwt;", "status", "onConnectionStatusChanged", "(Landroid/bluetooth/BluetoothDevice;Lsd;Lwt;)V", "ctx", "Landroid/content/Context;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "mStableWeightValue", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "", "mLastScanAddress", "Ljava/lang/String;", "mListener", "Lcom/xiaomi/hm/health/bt/sdk/IBindListener;", "weightDeviceApi", "Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "Ljava/util/concurrent/ConcurrentHashMap;", "mDeviceHashMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Landroid/content/Context;)V", "Companion", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class WeightBinder implements IBleScanCallback, IHMConnectionCallback {
    public static final int MAX_SCAN_TIME = 60000;

    @NotNull
    private static final String TAG = "WeightBinder";

    @NotNull
    private final Context ctx;

    @NotNull
    private final ConcurrentHashMap<String, gdt> mDeviceHashMap;

    @Nullable
    private String mLastScanAddress;

    @Nullable
    private IBindListener mListener;
    private final f5t mScanOpt;

    @Nullable
    private gdt mStableWeightAdvData;

    @Nullable
    private WeightAdvData mStableWeightValue;

    @Nullable
    private IWeightDeviceApi weightDeviceApi;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13576a;

        static {
            int[] iArr = new int[wt.values().length];
            try {
                iArr[wt.AUTH_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wt.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13576a = iArr;
        }
    }

    public WeightBinder(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.mScanOpt = new f5t.b().c(this).b(60000).f(false).e(vws.e0).e(jms.d0).g();
        this.mDeviceHashMap = new ConcurrentHashMap<>();
    }

    private final IWeightDeviceApi createBleDevice(BluetoothDevice device) {
        gdt gdtVar = this.mStableWeightAdvData;
        Intrinsics.checkNotNull(gdtVar);
        bys ovsVar = gdtVar.c(jms.d0) ? new ovs(this.ctx, device) : new bys(this.ctx, device);
        ovsVar.B(false);
        ovsVar.q(this);
        ovsVar.x(true);
        return new fx(ovsVar);
    }

    private final void handleWeightValue(gdt advData, boolean isOnly) {
        IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            BluetoothDevice bluetoothDevice = advData.f18871a;
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice, "advData.device");
            WeightAdvData weightAdvData = advData.n;
            Intrinsics.checkNotNullExpressionValue(weightAdvData, "advData.weightData");
            iBindListener.onBindWeightValue(bluetoothDevice, weightAdvData, isOnly);
        }
    }

    private final void onDeviceConnected(BluetoothDevice device, sd type) {
        IWeightDeviceApi iWeightDeviceApi = this.weightDeviceApi;
        if (iWeightDeviceApi == null) {
            IBindListener iBindListener = this.mListener;
            if (iBindListener != null) {
                iBindListener.onBindFailure(BindWeightError.API_NULL);
                return;
            }
            return;
        }
        if (iWeightDeviceApi.getDeviceInfo() == null) {
            IBindListener iBindListener2 = this.mListener;
            if (iBindListener2 != null) {
                iBindListener2.onBindFailure(BindWeightError.READ_DEVICE_INFO_ERROR);
                return;
            }
            return;
        }
        IBindListener iBindListener3 = this.mListener;
        if (iBindListener3 != null) {
            iBindListener3.onBindSuccess(iWeightDeviceApi);
        }
    }

    private final void onDeviceDisconnected(sd type) {
        IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            iBindListener.onBindFailure(BindWeightError.DISCONNECTED);
        }
    }

    public final void bind(@NotNull BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        h3t.H().y(this.mScanOpt);
        this.weightDeviceApi = createBleDevice(device);
    }

    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(@NotNull BluetoothDevice device, @NotNull sd type, @NotNull wt status) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        int i = b.f13576a[status.ordinal()];
        if (i == 1) {
            onDeviceConnected(device, type);
        } else {
            if (i != 2) {
                return;
            }
            onDeviceDisconnected(type);
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(@Nullable f5t option) {
        t5t.d(TAG, "扫描秤设备出错");
        IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            iBindListener.onBindFailure(BindWeightError.SCAN_ERROR);
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(@Nullable f5t option) {
        t5t.d(TAG, "开始扫描秤设备");
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(@Nullable f5t option) {
        IBindListener iBindListener;
        if (this.mStableWeightValue != null || (iBindListener = this.mListener) == null) {
            return;
        }
        iBindListener.onBindFailure(BindWeightError.NO_DEVICE);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(@Nullable gdt data, @Nullable f5t option) {
        t5t.m(TAG, "onScanedDevice:" + data);
        if (data == null) {
            return;
        }
        String address = data.f18871a.getAddress();
        ConcurrentHashMap<String, gdt> concurrentHashMap = this.mDeviceHashMap;
        Intrinsics.checkNotNullExpressionValue(address, "address");
        concurrentHashMap.put(address, data);
        WeightAdvData weightAdvData = data.n;
        if (weightAdvData == null || this.mListener == null) {
            return;
        }
        if (weightAdvData.isFinish() && !weightAdvData.isStable() && Intrinsics.areEqual(address, this.mLastScanAddress)) {
            data.n.setValue(0.0f);
            handleWeightValue(data, this.mDeviceHashMap.size() == 1);
        }
        if (weightAdvData.isFinish()) {
            return;
        }
        if (weightAdvData.isStable() || weightAdvData.isOverload()) {
            this.mStableWeightValue = weightAdvData;
            this.mStableWeightAdvData = data;
            h3t.H().y(this.mScanOpt);
        }
        handleWeightValue(data, this.mDeviceHashMap.size() == 1);
        this.mLastScanAddress = address;
    }

    public final void reSearch() {
        this.weightDeviceApi = null;
        this.mStableWeightValue = null;
        this.mStableWeightAdvData = null;
        h3t.H().y(this.mScanOpt);
        h3t.H().l(this.mScanOpt);
    }

    public final void startBind(@NotNull Context context, @NotNull IBindListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
        h3t.x(context);
        h3t.H().l(this.mScanOpt);
    }

    public final void stopBind() {
        this.weightDeviceApi = null;
        this.mStableWeightValue = null;
        this.mStableWeightAdvData = null;
        h3t.H().y(this.mScanOpt);
    }
}
