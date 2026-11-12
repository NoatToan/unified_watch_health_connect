package com.xiaomi.hm.health.bt.classic;

import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.alipay.sdk.m.l.c;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.classic.NewDfuProfile;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.dfu.ContinueModeExtraInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.DfuProtocolInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.PrepareResponse;
import com.xiaomi.hm.health.bt.profile.dfu.StartTransferResponse;
import com.xiaomi.hm.health.bt.profile.dfu.TransferContinueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeModel;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.profile.dfu.ValidateResponse;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 d2\u00020\u0001:\u0001dB\u000f\u0012\u0006\u0010E\u001a\u00020B¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J:\u0010*\u001a\u00020)2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0011H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u0010\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u00020\u0011H\u0016J\n\u00105\u001a\u0004\u0018\u000104H\u0016J\b\u00106\u001a\u00020\u0011H\u0016J\u0012\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u00109\u001a\u00020\fH\u0016J\n\u0010;\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020:H\u0016J\u0016\u0010A\u001a\u00020\u00042\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u0002010O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0018\u0010T\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lcom/xiaomi/hm/health/bt/classic/NewDfuProfile;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "", "value", "", GoogleApiAvailabilityLight.a, Constant.h, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "e", "b", "Ljava/lang/Object;", IconCompat.EXTRA_OBJ, "", "timeout", "f", "g", "clear", "", "isRunning", "running", "setRunning", "data", "sendData", "write", "deInit", "initApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "queryProtocolInfo", "inDfu", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatueResponse;", "queryUpgradeStatus", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "firmwareType", "firmwareSize", "", "firmwareCRC32", "chunkSize", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeModel;", "mode", "Lcom/xiaomi/hm/health/bt/profile/dfu/ContinueModeExtraInfo;", "continueModeExtraInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/PrepareResponse;", "prepareTransfer", "fromBreakpoint", "Lcom/xiaomi/hm/health/bt/profile/dfu/StartTransferResponse;", "startTransfer", "stopTransfer", "byteArray", "transferData", "Lcom/xiaomi/hm/health/bt/profile/dfu/TransferContinueResponse;", "transferContinue", c.j, "Lcom/xiaomi/hm/health/bt/profile/dfu/ValidateResponse;", "getValidateResponse", "upgrade", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "getUpgradeResponse", "getChannelMtu", "Lcom/xiaomi/hm/health/bt/profile/base/LEParams;", "getLEParams", "leParams", "setLEParams", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "func", "setMtuFunc", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "a", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", NotificationCompat.CATEGORY_TRANSPORT, "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "c", "Z", "Ljava/lang/Object;", "validateLock", "upgradeLock", "continueLock", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "notifySyncSize", "h", "Lcom/xiaomi/hm/health/bt/profile/dfu/ValidateResponse;", "validateResponse", "i", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "upgradeStatusResponse", "Ljava/util/concurrent/atomic/AtomicBoolean;", z.j, "Ljava/util/concurrent/atomic/AtomicBoolean;", "reObtainMtu", hl.k, "Lkotlin/jvm/functions/Function0;", "mtuFunc", "l", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "mtu", "<init>", "(Lcom/xiaomi/hm/health/bt/classic/ITransport;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NewDfuProfile implements DfuApi {

    @NotNull
    private static final String m = "NewDfuProfile";
    private static final int n = 30000;
    private static final int o = 5000;
    private static final int p = 208;
    private static final int q = 209;
    private static final int r = 210;
    private static final int s = 211;
    private static final int t = 212;
    private static final int u = 213;
    private static final int v = 214;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ITransport transport;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile boolean isRunning;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private volatile ValidateResponse validateResponse;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private volatile UpgradeResponse upgradeStatusResponse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function0<? extends Mtu> mtuFunc;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Mtu mtu;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger referenceCount = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Object validateLock = new Object();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Object upgradeLock = new Object();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Object continueLock = new Object();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AtomicReference<TransferContinueResponse> notifySyncSize = new AtomicReference<>(null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean reObtainMtu = new AtomicBoolean(true);

    public NewDfuProfile(@NotNull ITransport iTransport) {
        this.transport = iTransport;
    }

    private final void b() {
        this.upgradeStatusResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NewDfuProfile newDfuProfile, byte[] bArr) {
        Debug.fi(m, Intrinsics.stringPlus("cpt response: ", GattUtils.bytesToHexString(bArr)));
        if (bArr != null && bArr[0] == 16 && bArr[1] == -44) {
            newDfuProfile.d(ByteArrayKt.subArrayWithoutFirstTwoElement(bArr));
            newDfuProfile.g(newDfuProfile.continueLock);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -43) {
            newDfuProfile.validateResponse = new ValidateResponse(bArr[2] & 255);
            newDfuProfile.g(newDfuProfile.validateLock);
        } else if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -42) {
            newDfuProfile.upgradeStatusResponse = new UpgradeResponse(bArr[2] & 255);
            newDfuProfile.g(newDfuProfile.upgradeLock);
        }
    }

    private final void d(byte[] value) {
        BytesDecoder bytesDecoder = new BytesDecoder(value);
        this.notifySyncSize.set(new TransferContinueResponse(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), bytesDecoder.readUInt8(-1), bytesDecoder.readInt32(-1)));
    }

    private final HMNotifyResponse e(byte[] cmd) {
        return this.transport.sendCommandWithResponse(Protocol.DFU_CP, cmd, 5000);
    }

    private final void f(Object obj, int timeout) {
        synchronized (obj) {
            try {
                obj.wait(timeout);
            } catch (Exception unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void g(Object obj) {
        synchronized (obj) {
            obj.notify();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public synchronized void clear() {
        this.referenceCount.set(0);
        this.mtuFunc = null;
        this.mtu = null;
        deInit();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public synchronized boolean deInit() {
        Debug.fi(m, Intrinsics.stringPlus("deInit, referenceCount: ", this.referenceCount));
        if (this.referenceCount.get() > 0) {
            this.referenceCount.decrementAndGet();
        }
        if (this.referenceCount.get() > 0) {
            return false;
        }
        this.transport.unregisterNotification(Protocol.DFU_CP);
        Debug.fi(m, "deInit");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public int getChannelMtu() {
        if (this.mtu == null && this.reObtainMtu.compareAndSet(true, false)) {
            Function0<? extends Mtu> function0 = this.mtuFunc;
            this.mtu = function0 == null ? null : function0.invoke();
        }
        Mtu mtu = this.mtu;
        if (mtu == null) {
            return 512;
        }
        return mtu.size();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public LEParams getLEParams() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public UpgradeResponse getUpgradeResponse(int timeout) {
        if (this.upgradeStatusResponse == null) {
            f(this.upgradeLock, timeout);
        }
        UpgradeResponse upgradeResponse = this.upgradeStatusResponse;
        this.upgradeStatusResponse = null;
        Debug.fi(m, String.valueOf(upgradeResponse));
        return upgradeResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public ValidateResponse getValidateResponse() {
        if (this.validateResponse == null) {
            f(this.validateLock, 5000);
        }
        ValidateResponse validateResponse = this.validateResponse;
        this.validateResponse = null;
        Debug.fi(m, String.valueOf(validateResponse));
        return validateResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean initApi() {
        Debug.fi(m, Intrinsics.stringPlus("init, referenceCount: ", this.referenceCount));
        this.notifySyncSize.set(null);
        this.referenceCount.incrementAndGet();
        this.transport.registerNotification(Protocol.DFU_CP, new IGattCallback.INotifyCallback() { // from class: fe5
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                NewDfuProfile.c(this.a, bArr);
            }
        });
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public boolean getIsRunning() {
        return this.isRunning;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public PrepareResponse prepareTransfer(@NotNull HMFirmwareType firmwareType, int firmwareSize, long firmwareCRC32, int chunkSize, @NotNull UpgradeModel mode, @Nullable ContinueModeExtraInfo continueModeExtraInfo) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{-46, firmwareType.getValue()}, GattUtils.intToBytes(firmwareSize)), GattUtils.numberToBytes(firmwareCRC32, 4)), GattUtils.shortToBytes((short) chunkSize)), new byte[]{(byte) mode.getValue()}));
        if (continueModeExtraInfo != null) {
            byteArrayOutputStream.write(continueModeExtraInfo.getFirmwareIndex());
            if (continueModeExtraInfo.isFirst()) {
                byteArrayOutputStream.write(continueModeExtraInfo.getFirmwareCount());
                byteArrayOutputStream.write(GattUtils.numberToBytes(continueModeExtraInfo.getFirmwareTotalSize(), 4));
            }
        }
        HMNotifyResponse hMNotifyResponseE = e(byteArrayOutputStream.toByteArray());
        if (hMNotifyResponseE == null) {
            throw new Exception("Prepare transfer failed");
        }
        Debug.fi(m, Intrinsics.stringPlus("response:", hMNotifyResponseE));
        byte[] data = hMNotifyResponseE.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new PrepareResponse(hMNotifyResponseE.getCode() & 255, BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public DfuProtocolInfo queryProtocolInfo() throws Exception {
        HMNotifyResponse hMNotifyResponseE = e(new byte[]{-48});
        if (hMNotifyResponseE == null) {
            throw new Exception("Query protocol failed");
        }
        Debug.fi(m, Intrinsics.stringPlus("response:", hMNotifyResponseE));
        byte[] data = hMNotifyResponseE.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new DfuProtocolInfo(hMNotifyResponseE.getCode() & 255, BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public UpgradeStatueResponse queryUpgradeStatus(boolean inDfu) throws Exception {
        Debug.fi(m, "inDfu: " + inDfu + ", isRunning: " + getIsRunning());
        if (!inDfu && getIsRunning()) {
            return new UpgradeStatueResponse(1, UpgradeStatus.DFU_RUNNING, 0, 0, 0);
        }
        HMNotifyResponse hMNotifyResponseE = e(new byte[]{-47});
        if (hMNotifyResponseE == null) {
            throw new Exception("Query status failed");
        }
        Debug.fi(m, Intrinsics.stringPlus("response:", hMNotifyResponseE));
        byte[] data = hMNotifyResponseE.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new UpgradeStatueResponse(hMNotifyResponseE.getCode() & 255, UpgradeStatus.INSTANCE.fromValue(BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null)), BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null));
    }

    public final boolean sendData(@Nullable byte[] data) {
        return this.transport.sendCommandNoResponse(Protocol.DFU_PACKET, data);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean setLEParams(@NotNull LEParams leParams) {
        return true;
    }

    public final void setMtuFunc(@NotNull Function0<? extends Mtu> func) {
        this.mtuFunc = func;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public void setRunning(boolean running) {
        this.isRunning = running;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public StartTransferResponse startTransfer(boolean fromBreakpoint) throws Exception {
        HMNotifyResponse hMNotifyResponseE = e(new byte[]{-45, !fromBreakpoint ? 1 : 0});
        if (hMNotifyResponseE == null) {
            throw new Exception("Start transfer failed");
        }
        Debug.fi(m, Intrinsics.stringPlus("response:", hMNotifyResponseE));
        return new StartTransferResponse(hMNotifyResponseE.getCode() & 255);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public void stopTransfer() {
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public TransferContinueResponse transferContinue() {
        if (this.notifySyncSize.get() == null) {
            f(this.continueLock, 5000);
        }
        TransferContinueResponse transferContinueResponse = this.notifySyncSize.get();
        Debug.fi(m, Intrinsics.stringPlus("notifySize:", transferContinueResponse));
        this.notifySyncSize.set(null);
        return transferContinueResponse == null ? new TransferContinueResponse(-1, -1, -1) : transferContinueResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean transferData(@NotNull byte[] byteArray) {
        return sendData(byteArray);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean upgrade() {
        b();
        HMNotifyResponse hMNotifyResponseE = e(new byte[]{-42});
        return hMNotifyResponseE != null && hMNotifyResponseE.isSuccess();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean validate() {
        HMNotifyResponse hMNotifyResponseE = e(new byte[]{-43});
        return hMNotifyResponseE != null && hMNotifyResponseE.isSuccess();
    }

    public final boolean write(@Nullable byte[] data) {
        return this.transport.sendCommandNoResponse(Protocol.DFU_PACKET, data);
    }
}
