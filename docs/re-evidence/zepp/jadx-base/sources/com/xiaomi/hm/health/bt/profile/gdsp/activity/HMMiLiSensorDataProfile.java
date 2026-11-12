package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.amazfit.AmazfitProfile;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.grsp.GSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.SensorDataFragment;
import com.xiaomi.hm.health.bt.profile.running.RunningProfile;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class HMMiLiSensorDataProfile extends HMBaseProfile {
    private static final byte[] i = {-1, -1, -1, -1, -1, -1};
    private static final UUID j = GattUtils.uuid16("FF0E");
    private static final UUID k = GattUtils.uuid128(65248);
    private static final UUID l = GattUtils.uuid128(UpdateUtils.STATE_DOWNLOAD_FAIL);
    private BluetoothGattCharacteristic b;
    private PipedInputStream c;
    private PipedOutputStream d;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;

    public HMMiLiSensorDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = -1;
        this.g = false;
        this.h = false;
        this.g = gattPeripheral instanceof RunningProfile;
        this.h = gattPeripheral instanceof AmazfitProfile;
    }

    private boolean c() {
        return write(this.b, new byte[]{2});
    }

    private int d(int currentIndex, int lastIndex) {
        Debug.fi(HMBaseProfile.TAG, "data index:" + currentIndex + ",last index:" + lastIndex);
        if ((lastIndex == 65534 && currentIndex == 0) || lastIndex + 1 == currentIndex) {
            return 0;
        }
        return (currentIndex - lastIndex) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "sensor data:" + GattUtils.bytesToHexString(bArr));
        try {
            int i2 = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
            int iD = d(i2, this.f);
            if (iD > 0) {
                Debug.fi(HMBaseProfile.TAG, "GSensor missingPackets:" + iD);
                this.d.write(i);
            }
            byte[] bArr2 = new byte[bArr.length - 2];
            System.arraycopy(bArr, 2, bArr2, 0, bArr.length - 2);
            this.d.write(bArr2);
            this.f = i2;
        } catch (IOException e) {
            Debug.fi(HMBaseProfile.TAG, e.getMessage());
        }
    }

    private boolean startTransfer() {
        this.f = -1;
        return write(this.b, new byte[]{1});
    }

    private boolean stopTransfer() {
        return write(this.b, new byte[]{0});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    public boolean feedDog() {
        return this.g ? c() : sync();
    }

    public void getSensorData(IHMSensorDataCallback callback) {
        Debug.fi(HMBaseProfile.TAG, "mIsD156:" + this.h + ",mIsShoe:" + this.g);
        boolean z = this.h;
        int i2 = z ? 65520 : 4095;
        int i3 = z ? 16 : 20;
        while (this.e) {
            try {
                int i4 = this.c.read() | (this.c.read() << 8);
                int i5 = (this.c.read() << 8) | this.c.read();
                int i6 = (this.c.read() << 8) | this.c.read();
                short s = (short) (((i4 & i2) << i3) >> 20);
                short s2 = (short) (((i5 & i2) << i3) >> 20);
                short s3 = (short) (((i6 & i2) << i3) >> 20);
                if (i4 == 65535 && i5 == 65535 && i6 == 65535) {
                    s = -1;
                    s2 = -1;
                    s3 = -1;
                }
                Debug.i(HMBaseProfile.TAG, "parse sensor data:[" + ((int) s) + "," + ((int) s2) + "," + ((int) s3) + "]");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new GSensorData(s, s2, s3));
                callback.onSensorData(new SensorDataFragment(arrayList));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(this.g ? k : HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, "get UUID_SERVICE_MILI_SERVICE return null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.g ? l : j);
        this.b = characteristic;
        if (characteristic != null) {
            return true;
        }
        Debug.fi(HMBaseProfile.TAG, "get UUID_CHARACTERISTIC_SENSOR_DATA return null!!!");
        return false;
    }

    public boolean startGetSensorData() {
        this.e = true;
        this.c = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.d = pipedOutputStream;
        try {
            pipedOutputStream.connect(this.c);
            setLep(39, 49, 0, 500, 0);
            if (!registerNotification(this.b, new IGattCallback.INotifyCallback() { // from class: y83
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    this.a.e(bArr);
                }
            })) {
                Debug.fi(HMBaseProfile.TAG, "registerNotification m_CharSensorData failed!!!");
                return false;
            }
            if (startTransfer()) {
                return true;
            }
            Debug.fi(HMBaseProfile.TAG, "startTransfer failed!!!");
            return false;
        } catch (IOException unused) {
            Debug.fi(HMBaseProfile.TAG, "m_SensorSourceOutputStream connect m_SensorSourceInputStream failed!!!");
            return false;
        }
    }

    public void stopGetSensorData() {
        this.e = false;
        unregisterNotification(this.b);
        stopTransfer();
        try {
            PipedInputStream pipedInputStream = this.c;
            if (pipedInputStream != null) {
                pipedInputStream.close();
                this.c = null;
            }
            PipedOutputStream pipedOutputStream = this.d;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
                this.d = null;
            }
        } catch (Exception unused) {
        }
    }
}
