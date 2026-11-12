package com.xiaomi.hm.health.bt.profile.gdsp.weight;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.weight.IWeightRecordParser;
import com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMWeightSyncDataProfile extends HMBaseProfile {
    private static final int i = 10;
    private static final int j = 13;
    private static final byte k = 1;
    private static final byte l = 2;
    private static final byte m = 3;
    private static final byte n = 4;
    private static final String o = "HMWeightSyncDataProfile";
    private BluetoothGattCharacteristic b;
    private boolean c;
    public UUID d;
    public UUID e;
    private IWeightRecordParser f;
    private int g;
    public final List<WeightAdvData> h;

    /* JADX WARN: Multi-variable type inference failed */
    public HMWeightSyncDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 4;
        this.h = new ArrayList();
        if (gattPeripheral instanceof IWeightRecordSync) {
            IWeightRecordSync iWeightRecordSync = (IWeightRecordSync) gattPeripheral;
            this.d = iWeightRecordSync.getSyncServiceUUID();
            this.e = iWeightRecordSync.getSyncCharacteristicUUID();
            this.f = iWeightRecordSync.getRecordParser();
            this.g = iWeightRecordSync.getIdLen();
        }
    }

    private byte[] c(byte cmd, long uid) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(cmd);
        for (int i2 = 0; i2 < this.g; i2++) {
            byteArrayOutputStream.write((byte) ((uid >> (i2 * 8)) & 255));
        }
        return byteArrayOutputStream.toByteArray();
    }

    private boolean d(long uid) {
        return sendCommandWithNoResponse(this.b, c((byte) 4, uid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.i(o, "getWeightDatas:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length <= 1) {
            atomicBoolean.set(true);
            watingNotify(this.b);
        } else {
            atomicBoolean.set(false);
            this.h.addAll(this.f.parse(bArr));
        }
    }

    private boolean f() {
        return sendCommandWithNoResponse(this.b, new byte[]{3});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    public int getDataSize(long uid) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(this.b, c((byte) 1, uid));
        byte[] originResponseData = hMNotifyResponseSendCommandWithResponse != null ? hMNotifyResponseSendCommandWithResponse.getOriginResponseData() : null;
        if (originResponseData == null || originResponseData.length < 3 || originResponseData[0] != 1) {
            f();
            return -1;
        }
        int i2 = (originResponseData[1] & 255) | ((originResponseData[2] & 255) << 8);
        if (i2 == 0) {
            f();
        }
        return i2;
    }

    public List<WeightAdvData> getWeightDatas(long uid, int expectSize) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!registerNotification(this.b, new IGattCallback.INotifyCallback() { // from class: ar3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.e(atomicBoolean, bArr);
            }
        })) {
            f();
            return null;
        }
        if (!sendCommandWithNoResponse(this.b, new byte[]{2})) {
            f();
            unregisterNotification(this.b);
            return null;
        }
        while (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            waiting(this.b, 10000);
        }
        f();
        if (expectSize == this.h.size()) {
            d(uid);
        }
        unregisterNotification(this.b);
        return this.h;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(this.d);
        if (service == null) {
            Debug.fi(o, this.d + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.e);
        this.b = characteristic;
        if (characteristic != null) {
            return true;
        }
        Debug.fi(o, this.e + " is null!!!");
        return false;
    }
}
