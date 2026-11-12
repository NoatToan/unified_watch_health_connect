package com.xiaomi.hm.health.bt.profile.dfu;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.dfu.HMDfuProfile;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class HMDfuProfile extends HMBaseProfile {
    private static final byte j = 0;
    private static final byte k = 1;
    private static final byte l = 3;
    private static final byte m = 4;
    private static final byte n = 5;
    private static final byte o = 6;
    private static final byte p = 32;
    private static final byte q = -96;
    public static final byte r = 0;
    public static final byte s = 1;
    private final UUID b;
    private final UUID c;
    private final UUID d;
    private BluetoothGattCharacteristic e;
    private BluetoothGattCharacteristic f;
    private volatile IGattCallback.INotifyCallback g;
    private volatile int h;
    private AtomicInteger i;

    public HMDfuProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = GattUtils.uuid128(5424);
        this.c = GattUtils.uuid128(5425);
        this.d = GattUtils.uuid128(5426);
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 1;
        this.i = new AtomicInteger(-1);
    }

    private long[] i(byte type, int size, long crc, short syncSize, int continueFlag, byte voiceType, int voiceId, boolean isSilent) throws Exception {
        return j(type, size, crc, syncSize, continueFlag, voiceType, voiceId, isSilent, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "cpt response: " + GattUtils.bytesToHexString(bArr));
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == 32) {
            this.h = bArr[2];
            return;
        }
        if (bArr == null || bArr.length != 6 || bArr[0] != 16 || bArr[1] != 6) {
            if (this.g != null) {
                this.g.notify(bArr);
            }
        } else {
            this.i.set(((bArr[5] & 255) << 24) | (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16));
            watingNotify(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    private HMNotifyResponse p(byte[] cmd) {
        return q(cmd, 15000);
    }

    private HMNotifyResponse q(byte[] cmd, int timeout) {
        Debug.i(HMBaseProfile.TAG, "sendCommand:" + GattUtils.bytesToHexString(cmd));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        this.g = new IGattCallback.INotifyCallback() { // from class: zt2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMDfuProfile.o(hMNotifyResponse, countDownLatch, bArr);
            }
        };
        try {
            if (write(this.e, cmd)) {
                countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "sendCommand exception:" + e.getMessage());
        }
        this.g = null;
        return hMNotifyResponse;
    }

    public boolean d() {
        HMNotifyResponse hMNotifyResponseP = p(new byte[]{5});
        return hMNotifyResponseP != null && hMNotifyResponseP.isSuccess((byte) 5);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.e;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public byte[] e(byte type, int size, long crc, short syncSize) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(type);
        byteArrayOutputStream.write(GattUtils.intToBytes(size));
        byteArrayOutputStream.write(GattUtils.intToBytes((int) crc));
        if (syncSize > 0) {
            byteArrayOutputStream.write(GattUtils.shortToBytes(syncSize));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean f(int sum) {
        if (this.i.get() == -1) {
            waiting(this.f, 15000);
        }
        boolean z = this.i.get() == sum;
        Debug.fi(HMBaseProfile.TAG, "notifySize:" + this.i.get() + ",writeSize:" + sum);
        this.i.set(-1);
        return z;
    }

    public boolean g() {
        return write(this.e, new byte[]{0});
    }

    public DfuConfig getConfig() {
        HMNotifyResponse hMNotifyResponseP = p(new byte[]{q});
        if (hMNotifyResponseP == null || !hMNotifyResponseP.isSuccess(q)) {
            return null;
        }
        return DfuConfig.parse(hMNotifyResponseP.getData());
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize) throws Exception {
        return getFwInfo(type, size, crc, syncSize, (byte) 0, 0);
    }

    public int getState() {
        HMNotifyResponse hMNotifyResponseP = p(new byte[]{1, HMFirmwareType.FIRMWARE_QUERY.getValue()});
        if (hMNotifyResponseP == null) {
            return 0;
        }
        Debug.i(HMBaseProfile.TAG, "response:" + hMNotifyResponseP);
        return hMNotifyResponseP.getCode();
    }

    public int h() {
        return this.h;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(this.b);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.e = characteristic;
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: au2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.n(bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.d);
        this.f = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(HMBaseProfile.TAG, "BluetoothGattCharacteristic pkt is null!!!");
            return false;
        }
        this.i.set(-1);
        return true;
    }

    public long[] j(byte type, int size, long crc, short syncSize, int continueFlag, byte voiceType, int voiceId, boolean isSilent, int allSize) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(type);
        byteArrayOutputStream.write(GattUtils.intToBytes(size));
        byteArrayOutputStream.write(GattUtils.intToBytes((int) crc));
        if (syncSize >= 0) {
            byteArrayOutputStream.write(GattUtils.shortToBytes(syncSize));
        }
        if (continueFlag >= 0) {
            byteArrayOutputStream.write((byte) (continueFlag & 255));
        }
        if (allSize >= 0) {
            byteArrayOutputStream.write(GattUtils.intToBytes(allSize));
        }
        if (type == HMFirmwareType.FIRMWARE_VOICE.getValue()) {
            byteArrayOutputStream.write(voiceType);
            byteArrayOutputStream.write(GattUtils.intToBytes(voiceId));
        }
        HMNotifyResponse hMNotifyResponseP = p(byteArrayOutputStream.toByteArray());
        if (hMNotifyResponseP == null || !hMNotifyResponseP.isSuccess((byte) 1)) {
            return null;
        }
        byte[] data = hMNotifyResponseP.getData();
        return new long[]{((data[2] & 255) << 16) | (data[0] & 255) | ((data[1] & 255) << 8) | ((data[3] & 255) << 24), ((long) (((data[7] & 255) << 24) | ((data[5] & 255) << 8) | (data[4] & 255) | ((data[6] & 255) << 16))) & 4294967295L};
    }

    public long[] k(byte type, int size, long crc, short syncSize, int continueFlag, int allSize) throws Exception {
        return j(type, size, crc, syncSize, continueFlag, (byte) 0, 0, false, allSize);
    }

    public long[] l(byte type, int size, long crc, short syncSize, byte[] extraParams) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(e(type, size, crc, syncSize));
        if (extraParams != null && extraParams.length > 0) {
            byteArrayOutputStream.write(extraParams);
        }
        return m(byteArrayOutputStream.toByteArray());
    }

    public long[] m(byte[] cmd) throws Exception {
        HMNotifyResponse hMNotifyResponseP = p(cmd);
        if (!hMNotifyResponseP.isSuccess((byte) 1)) {
            return null;
        }
        byte[] data = hMNotifyResponseP.getData();
        return new long[]{((data[2] & 255) << 16) | (data[0] & 255) | ((data[1] & 255) << 8) | ((data[3] & 255) << 24), ((long) (((data[7] & 255) << 24) | ((data[5] & 255) << 8) | (data[4] & 255) | ((data[6] & 255) << 16))) & 4294967295L};
    }

    public boolean sendData(byte[] data) {
        return write(this.f, data);
    }

    public boolean start(byte type) {
        HMNotifyResponse hMNotifyResponseP = p(new byte[]{3, type});
        return hMNotifyResponseP != null && hMNotifyResponseP.isSuccess((byte) 3);
    }

    public boolean stop(int timeout) {
        HMNotifyResponse hMNotifyResponseQ = q(new byte[]{4}, timeout);
        return hMNotifyResponseQ != null && hMNotifyResponseQ.isSuccess((byte) 4);
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize, byte voiceType, int voiceId) throws Exception {
        return i(type, size, crc, syncSize, -1, voiceType, voiceId, false);
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize, int continueFlag) throws Exception {
        return i(type, size, crc, syncSize, continueFlag, (byte) 0, 0, false);
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize, int continueFlag, boolean isSilent) throws Exception {
        return i(type, size, crc, syncSize, continueFlag, (byte) 0, 0, isSilent);
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize, int continueFlag, byte voiceType, int voiceId) throws Exception {
        return j(type, size, crc, syncSize, continueFlag, voiceType, voiceId, false, -1);
    }
}
