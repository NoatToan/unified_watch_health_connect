package com.xiaomi.hm.health.bt.profile.dfu;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.alipay.sdk.m.l.c;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.dfu.NewDfuProfile;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001iB\u000f\u0012\u0006\u0010A\u001a\u00020<¢\u0006\u0004\bg\u0010hJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J:\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020\u000fH\u0016J\n\u00103\u001a\u0004\u0018\u000102H\u0016J\b\u00104\u001a\u00020\u000fH\u0016J\u0012\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u00107\u001a\u00020\nH\u0016J\n\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000208H\u0016R\u0019\u0010A\u001a\u00020<8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010FR\u001e\u0010K\u001a\n H*\u0004\u0018\u00010G0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010L\u001a\n H*\u0004\u0018\u00010G0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u001e\u0010M\u001a\n H*\u0004\u0018\u00010G0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020/0]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006j"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/NewDfuProfile;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseProfile;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "", "value", "", "f", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "g", "", "timeout", "h", GoogleApiAvailabilityLight.a, "clear", "", "isRunning", "running", "setRunning", PointCategory.INIT, "data", "sendData", "deInit", "initApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "queryProtocolInfo", "inDfu", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatueResponse;", "queryUpgradeStatus", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "firmwareType", "firmwareSize", "", "firmwareCRC32", "chunkSize", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeModel;", "mode", "Lcom/xiaomi/hm/health/bt/profile/dfu/ContinueModeExtraInfo;", "continueModeExtraInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/PrepareResponse;", "prepareTransfer", "fromBreakpoint", "Lcom/xiaomi/hm/health/bt/profile/dfu/StartTransferResponse;", "startTransfer", "stopTransfer", "byteArray", "transferData", "Lcom/xiaomi/hm/health/bt/profile/dfu/TransferContinueResponse;", "transferContinue", c.j, "Lcom/xiaomi/hm/health/bt/profile/dfu/ValidateResponse;", "getValidateResponse", "upgrade", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "getUpgradeResponse", "getChannelMtu", "Lcom/xiaomi/hm/health/bt/profile/base/LEParams;", "getLEParams", "leParams", "setLEParams", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "b", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Z", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "e", "Ljava/util/UUID;", "UUID_SERVICE_DFU_SERVICE", "UUID_CHARACTERISTIC_CPT", "UUID_CHARACTERISTIC_PKT", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "cpt", "i", "pkt", "", z.j, "Ljava/lang/Object;", "validateLock", hl.k, "upgradeLock", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$INotifyCallback;", "l", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$INotifyCallback;", "cptCallback", "Ljava/util/concurrent/atomic/AtomicReference;", "m", "Ljava/util/concurrent/atomic/AtomicReference;", "notifySyncSize", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/bt/profile/dfu/ValidateResponse;", "validateResponse", "o", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "upgradeStatusResponse", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NewDfuProfile extends HMBaseProfile implements DfuApi {

    @NotNull
    private static final String p = "NewDfuProfile";
    private static final int q = 30000;
    private static final int r = 208;
    private static final int s = 209;
    private static final int t = 210;
    private static final int u = 211;
    private static final int v = 212;
    private static final int w = 213;
    private static final int x = 214;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger referenceCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile boolean isRunning;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final UUID UUID_SERVICE_DFU_SERVICE;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final UUID UUID_CHARACTERISTIC_CPT;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final UUID UUID_CHARACTERISTIC_PKT;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic cpt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic pkt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Object validateLock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Object upgradeLock;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private volatile IGattCallback.INotifyCallback cptCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final AtomicReference<TransferContinueResponse> notifySyncSize;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private volatile ValidateResponse validateResponse;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private volatile UpgradeResponse upgradeStatusResponse;

    public NewDfuProfile(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.gattPeripheral = gattPeripheral;
        this.referenceCount = new AtomicInteger(0);
        this.UUID_SERVICE_DFU_SERVICE = GattUtils.uuid128(5424);
        this.UUID_CHARACTERISTIC_CPT = GattUtils.uuid128(5425);
        this.UUID_CHARACTERISTIC_PKT = GattUtils.uuid128(5426);
        this.validateLock = new Object();
        this.upgradeLock = new Object();
        this.notifySyncSize = new AtomicReference<>(null);
    }

    private final void d() {
        this.upgradeStatusResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NewDfuProfile newDfuProfile, byte[] bArr) {
        IGattCallback.INotifyCallback iNotifyCallback;
        Debug.fi(p, Intrinsics.stringPlus("cpt response: ", GattUtils.bytesToHexString(bArr)));
        if (bArr != null && bArr[0] == 16 && bArr[1] == -44) {
            newDfuProfile.f(ByteArrayKt.subArrayWithoutFirstTwoElement(bArr));
            newDfuProfile.watingNotify(newDfuProfile.pkt);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -43) {
            newDfuProfile.validateResponse = new ValidateResponse(bArr[2] & 255);
            newDfuProfile.watingNotify(newDfuProfile.validateLock);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -42) {
            newDfuProfile.upgradeStatusResponse = new UpgradeResponse(bArr[2] & 255);
            newDfuProfile.watingNotify(newDfuProfile.upgradeLock);
        } else {
            if (newDfuProfile.cptCallback == null || (iNotifyCallback = newDfuProfile.cptCallback) == null) {
                return;
            }
            iNotifyCallback.notify(bArr);
        }
    }

    private final void f(byte[] value) {
        BytesDecoder bytesDecoder = new BytesDecoder(value);
        this.notifySyncSize.set(new TransferContinueResponse(BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), bytesDecoder.readUInt8(-1), bytesDecoder.readInt32(-1)));
    }

    private final HMNotifyResponse g(byte[] cmd) {
        return h(cmd, 15000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HMNotifyResponse h(byte[] cmd, int timeout) {
        Debug.i(p, Intrinsics.stringPlus("sendCommand:", GattUtils.bytesToHexString(cmd)));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.cptCallback = new IGattCallback.INotifyCallback() { // from class: he5
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                NewDfuProfile.i(objectRef, countDownLatch, bArr);
            }
        };
        try {
            if (write(this.cpt, cmd)) {
                countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            Debug.fi(p, Intrinsics.stringPlus("sendCommand exception:", e.getMessage()));
        }
        this.cptCallback = null;
        return (HMNotifyResponse) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse] */
    public static final void i(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, byte[] bArr) {
        ?? hMNotifyResponse = new HMNotifyResponse();
        hMNotifyResponse.from(bArr);
        objectRef.element = hMNotifyResponse;
        countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public synchronized void clear() {
        this.referenceCount.set(0);
        deInit();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public synchronized boolean deInit() {
        Debug.fi(p, Intrinsics.stringPlus("deInit, referenceCount: ", this.referenceCount));
        if (this.referenceCount.get() > 0) {
            this.referenceCount.decrementAndGet();
        }
        if (this.referenceCount.get() > 0) {
            return false;
        }
        Debug.fi(p, "deInit");
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.cpt;
        if (bluetoothGattCharacteristic != null) {
            unregisterNotification(bluetoothGattCharacteristic);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public int getChannelMtu() {
        return getMtu().size();
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public LEParams getLEParams() {
        return this.gattPeripheral.getLEParams();
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public UpgradeResponse getUpgradeResponse(int timeout) {
        if (this.upgradeStatusResponse == null) {
            waiting(this.upgradeLock, timeout);
        }
        UpgradeResponse upgradeResponse = this.upgradeStatusResponse;
        this.upgradeStatusResponse = null;
        Debug.fi(p, String.valueOf(upgradeResponse));
        return upgradeResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @Nullable
    public ValidateResponse getValidateResponse() {
        if (this.validateResponse == null) {
            waiting(this.validateLock, 15000);
        }
        ValidateResponse validateResponse = this.validateResponse;
        this.validateResponse = null;
        Debug.fi(p, String.valueOf(validateResponse));
        return validateResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public synchronized boolean init() {
        Debug.fi(p, Intrinsics.stringPlus("init, referenceCount: ", this.referenceCount));
        if (this.referenceCount.get() >= 1) {
            this.referenceCount.incrementAndGet();
            return true;
        }
        BluetoothGattService service = getService(this.UUID_SERVICE_DFU_SERVICE);
        if (service == null) {
            Debug.fi(p, "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.UUID_CHARACTERISTIC_CPT);
        this.cpt = characteristic;
        if (characteristic == null) {
            Debug.fi(p, "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: ge5
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                NewDfuProfile.e(this.a, bArr);
            }
        })) {
            Debug.fi(p, "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.UUID_CHARACTERISTIC_PKT);
        this.pkt = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(p, "BluetoothGattCharacteristic pkt is null!!!");
            return false;
        }
        this.notifySyncSize.set(null);
        this.referenceCount.incrementAndGet();
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean initApi() {
        return init();
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
        HMNotifyResponse hMNotifyResponseG = g(byteArrayOutputStream.toByteArray());
        if (hMNotifyResponseG == null) {
            throw new Exception("Prepare transfer failed");
        }
        Debug.fi(p, Intrinsics.stringPlus("response:", hMNotifyResponseG));
        byte[] data = hMNotifyResponseG.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new PrepareResponse(hMNotifyResponseG.getCode() & 255, BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt32$default(bytesDecoder, 0L, 1, null));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public DfuProtocolInfo queryProtocolInfo() throws Exception {
        HMNotifyResponse hMNotifyResponseG = g(new byte[]{-48});
        if (hMNotifyResponseG == null) {
            throw new Exception("Query protocol failed");
        }
        Debug.fi(p, Intrinsics.stringPlus("response:", hMNotifyResponseG));
        byte[] data = hMNotifyResponseG.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new DfuProtocolInfo(hMNotifyResponseG.getCode() & 255, BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt16$default(bytesDecoder, 0, 1, null), BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public UpgradeStatueResponse queryUpgradeStatus(boolean inDfu) throws Exception {
        Debug.fi(p, "inDfu: " + inDfu + ", isRunning: " + getIsRunning());
        if (!inDfu && getIsRunning()) {
            return new UpgradeStatueResponse(1, UpgradeStatus.DFU_RUNNING, 0, 0, 0);
        }
        HMNotifyResponse hMNotifyResponseG = g(new byte[]{-47});
        if (hMNotifyResponseG == null) {
            throw new Exception("Query status failed");
        }
        Debug.fi(p, Intrinsics.stringPlus("response:", hMNotifyResponseG));
        byte[] data = hMNotifyResponseG.getData();
        if (data == null) {
            data = new byte[0];
        }
        BytesDecoder bytesDecoder = new BytesDecoder(data);
        return new UpgradeStatueResponse(hMNotifyResponseG.getCode() & 255, UpgradeStatus.INSTANCE.fromValue(BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null)), BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null), BytesDecoder.readInt32$default(bytesDecoder, 0, 1, null));
    }

    public final boolean sendData(@Nullable byte[] data) {
        return write(this.pkt, data);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean setLEParams(@NotNull LEParams leParams) {
        return this.gattPeripheral.setLEParams(leParams.getConnIntMin(), leParams.getConnIntMax(), leParams.getLatency(), leParams.getTimeout(), leParams.getAdvInt());
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public void setRunning(boolean running) {
        this.isRunning = running;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public StartTransferResponse startTransfer(boolean fromBreakpoint) throws Exception {
        HMNotifyResponse hMNotifyResponseG = g(new byte[]{-45, !fromBreakpoint ? 1 : 0});
        if (hMNotifyResponseG == null) {
            throw new Exception("Start transfer failed");
        }
        Debug.fi(p, Intrinsics.stringPlus("response:", hMNotifyResponseG));
        return new StartTransferResponse(hMNotifyResponseG.getCode() & 255);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public void stopTransfer() {
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    @NotNull
    public TransferContinueResponse transferContinue() {
        if (this.notifySyncSize.get() == null) {
            waiting(this.pkt, 15000);
        }
        TransferContinueResponse transferContinueResponse = this.notifySyncSize.get();
        Debug.fi(p, Intrinsics.stringPlus("notifySize:", transferContinueResponse));
        this.notifySyncSize.set(null);
        return transferContinueResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean transferData(@NotNull byte[] byteArray) {
        return sendData(byteArray);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean upgrade() {
        d();
        return write(this.cpt, new byte[]{-42});
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuApi
    public boolean validate() {
        return write(this.cpt, new byte[]{-43});
    }
}
