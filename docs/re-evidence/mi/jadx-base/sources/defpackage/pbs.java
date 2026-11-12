package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class pbs extends a6t implements zh.b {
    public static final UUID f = tet.C(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f30222b;
    public byte[] c;
    public CountDownLatch d;
    public IHMSportListener e;

    public pbs(jet jetVar) {
        super(jetVar);
        this.f30222b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final qe a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        t5t.m(a6t.TAG, "command:" + tet.x(bArr));
        this.d = new CountDownLatch(1);
        if (!write(bluetoothGattCharacteristic, bArr)) {
            return null;
        }
        try {
            this.d.await(5L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        qe qeVarG = qe.g(this.c);
        t5t.m(a6t.TAG, "response:" + qeVarG);
        return qeVarG;
    }

    public void b(IHMSportListener iHMSportListener) {
        this.e = iHMSportListener;
    }

    public synchronized boolean c(SportCommand sportCommand, r6t r6tVar) {
        boolean z = false;
        if (this.f30222b == null) {
            t5t.m(a6t.TAG, "mCharSport is null!!!");
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sportCommand.getCommand());
            if (r6tVar == null || r6tVar.i() == null || r6tVar.i().length <= 0) {
                byteArrayOutputStream.write(r6t.y());
            } else {
                byteArrayOutputStream.write(r6tVar.i());
            }
            if (sportCommand != SportCommand.SHOW && sportCommand != SportCommand.NOTIFY && sportCommand != SportCommand.HEART) {
                qe qeVarA = a(this.f30222b, byteArrayOutputStream.toByteArray());
                if (qeVarA != null && qeVarA.k()) {
                    z = true;
                }
                return z;
            }
            return sendCommandWithNoResponse(this.f30222b, byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            t5t.m(a6t.TAG, "doSportCommand exception:" + e.getMessage());
            return false;
        }
    }

    public synchronized boolean d(SportConfig sportConfig) {
        if (this.f30222b == null) {
            t5t.m(a6t.TAG, "mCharSport is null!!!");
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(SportCommand.CONFIG.getCommand());
        byteArrayOutputStream.write(sportConfig.getVersion());
        byteArrayOutputStream.write(sportConfig.getSportKind().getKind());
        if (!sportConfig.isNeedDeviceClock()) {
            byteArrayOutputStream.write(1);
        }
        return a(this.f30222b, byteArrayOutputStream.toByteArray()) != null;
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f30222b;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return true;
    }

    @Override // zh.b
    public void e(byte[] bArr) {
        t5t.m(a6t.TAG, "notify:" + tet.x(bArr));
        if (bArr != null && bArr.length == 2 && bArr[0] == 17) {
            SportCommand sportCommandFromValue = SportCommand.fromValue(bArr[1]);
            IHMSportListener iHMSportListener = this.e;
            if (iHMSportListener != null) {
                iHMSportListener.onSportCommand(sportCommandFromValue);
                return;
            }
            return;
        }
        this.c = bArr;
        CountDownLatch countDownLatch = this.d;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public synchronized boolean f(SportCommand sportCommand, r6t r6tVar) {
        if (this.f30222b == null) {
            t5t.m(a6t.TAG, "mCharSport is null!!!");
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sportCommand.getCommand());
            if (r6tVar == null || r6tVar.i() == null || r6tVar.i().length <= 0) {
                byteArrayOutputStream.write(r6t.y());
            } else {
                byteArrayOutputStream.write(r6tVar.i());
            }
            return patchWrite(byteArrayOutputStream.toByteArray(), 6);
        } catch (Exception e) {
            t5t.m(a6t.TAG, "doSportCommand exception:" + e.getMessage());
            return false;
        }
    }

    @Override // defpackage.a6t
    public boolean init() {
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d(a6t.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = f;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f30222b = characteristic;
        if (characteristic != null) {
            return registerNotification(characteristic, this);
        }
        t5t.d(a6t.TAG, uuid2 + " is null!!!");
        return false;
    }

    public boolean n() {
        jet peripheral = getPeripheral();
        return peripheral != null && peripheral.z0() >= 11;
    }
}
