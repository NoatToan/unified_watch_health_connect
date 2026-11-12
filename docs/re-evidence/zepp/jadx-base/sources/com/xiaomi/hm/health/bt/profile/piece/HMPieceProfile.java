package com.xiaomi.hm.health.bt.profile.piece;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.SparseArray;
import com.alipay.sdk.m.n.a;
import com.facebook.login.widget.ToolTipPopup;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.piece.HMPieceProfile;
import com.xiaomi.hm.health.bt.profile.slre.AsyncPieceEvent;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class HMPieceProfile {
    public static final int VERSION_11 = 11;
    private static final int g = 4;
    private static final String h = "HMPieceProfile";
    private static final int i = 6000;
    private static final byte j = 0;
    private static final byte k = 64;
    private static final byte l = -128;
    private static final byte m = -64;
    private static final UUID n = GattUtils.uuid128(32);
    private BluetoothGattCharacteristic a;
    private GattPeripheral b = null;
    private SparseArray<AsyncPieceResult> c = new SparseArray<>();
    private int d = 0;
    private IGattCallback.INotifyCallback e = null;
    private IGattCallback.INotifyCallback f = new IGattCallback.INotifyCallback() { // from class: hc3
        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
        public final void notify(byte[] bArr) {
            this.a.c(bArr);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(byte[] bArr) {
        Debug.fi(h, "patchWrite notify:" + GattUtils.bytesToHexString(bArr));
        IGattCallback.INotifyCallback iNotifyCallback = this.e;
        if (iNotifyCallback != null) {
            iNotifyCallback.notify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    private synchronized PieceResult e(byte[] data, int profileType) {
        Debug.i(h, "patchWrite origin:" + GattUtils.bytesToHexString(data));
        int length = data.length;
        int size = (this.d >= 4 ? this.b.getMtu().size() : 20) - 3;
        int i2 = length / size;
        int i3 = length % size;
        int i4 = i2 + (i3 == 0 ? 0 : 1);
        byte b = HMBleConfig.APP_ID;
        int i5 = 0;
        while (true) {
            int i6 = i4 - 1;
            if (i5 >= i6) {
                if (i3 == 0) {
                    i3 = size;
                }
                byte[] bArr = new byte[i3 + 3];
                bArr[0] = b;
                bArr[1] = (byte) (profileType | (i4 > 1 ? a.g : -64));
                bArr[2] = (byte) (i6 % 255);
                System.arraycopy(data, i6 * size, bArr, 3, i3);
                Debug.i(h, "patchWrite:" + GattUtils.bytesToHexString(bArr));
                HMNotifyResponse hMNotifyResponseG = g(bArr);
                Debug.i(h, "response:" + hMNotifyResponseG);
                if (hMNotifyResponseG == null) {
                    return null;
                }
                return PieceResult.parse(hMNotifyResponseG.getOriginResponseData(), b, bArr[1] & 255);
            }
            byte[] bArr2 = new byte[size + 3];
            bArr2[0] = b;
            bArr2[1] = (byte) ((i5 == 0 ? 0 : 64) | profileType);
            bArr2[2] = (byte) (i5 % 255);
            System.arraycopy(data, i5 * size, bArr2, 3, size);
            Debug.i(h, "patchWrite:" + GattUtils.bytesToHexString(bArr2));
            if (!f(bArr2)) {
                Debug.i(h, "writeNoResponse failed!!!");
                return null;
            }
            i5++;
        }
    }

    private boolean f(byte[] cmd) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        GattPeripheral gattPeripheral = this.b;
        if (gattPeripheral == null || (bluetoothGattCharacteristic = this.a) == null) {
            return false;
        }
        return gattPeripheral.sendCommandWithNoResponse(bluetoothGattCharacteristic, cmd);
    }

    private HMNotifyResponse g(byte[] cmd) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        GattPeripheral gattPeripheral = this.b;
        if (gattPeripheral == null || (bluetoothGattCharacteristic = this.a) == null) {
            return null;
        }
        if (!gattPeripheral.hasNotification(bluetoothGattCharacteristic)) {
            return this.b.sendCommandWithResponse(this.a, cmd, 6000);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        this.e = new IGattCallback.INotifyCallback() { // from class: gc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMPieceProfile.d(hMNotifyResponse, countDownLatch, bArr);
            }
        };
        this.b.sendCommandWithNoResponse(this.a, cmd);
        try {
            countDownLatch.await(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        return hMNotifyResponse;
    }

    public int getVersion() {
        return this.d;
    }

    public synchronized boolean init(GattPeripheral gattPeripheral, boolean resident) {
        this.b = gattPeripheral;
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = gattPeripheral.getService(uuid);
        if (service == null) {
            Debug.fi(h, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = n;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.a = characteristic;
        if (characteristic == null) {
            Debug.fi(h, uuid2 + " is null!!!");
            return false;
        }
        byte[] bArr = gattPeripheral.read(characteristic);
        Debug.i(h, "data:" + GattUtils.bytesToHexString(bArr));
        if (bArr != null && bArr.length == 1) {
            this.d = bArr[0] & 255;
            Debug.fi(h, "piece profile version:" + this.d);
        }
        if (!resident) {
            return true;
        }
        return gattPeripheral.registerNotification(this.a, this.f);
    }

    public synchronized boolean isSupport() {
        return this.a != null;
    }

    public void onEvent(AsyncPieceEvent event) {
        Debug.fi(h, "onEvent:" + event);
        AsyncPieceResult asyncPieceResult = this.c.get(event.getProtocol());
        if (asyncPieceResult != null) {
            asyncPieceResult.unlock(event);
        }
    }

    public boolean patchWrite(byte[] data, int profileType) {
        PieceResult pieceResultE = e(data, profileType);
        Debug.fi(h, "PieceResult:" + pieceResultE);
        if (pieceResultE == null || !pieceResultE.isPieceSuccess()) {
            return false;
        }
        if (!pieceResultE.isProfileSuccess() && pieceResultE.getProfileState() != 255) {
            return false;
        }
        int timeout = pieceResultE.getTimeout();
        if (timeout == 0) {
            return true;
        }
        if (this.c.get(profileType) != null) {
            Debug.fi(h, "return as same profile async task running!");
            return false;
        }
        AsyncPieceResult asyncPieceResult = new AsyncPieceResult();
        this.c.put(profileType, asyncPieceResult);
        asyncPieceResult.lock(timeout);
        return asyncPieceResult.getEvent() != null;
    }
}
