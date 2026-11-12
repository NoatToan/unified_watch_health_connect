package com.xiaomi.hm.health.bt.profile.slre;

import android.bluetooth.BluetoothGattService;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class HMLFProfile {
    private static final String e = "HMLFProfile";
    private static final UUID f = GattUtils.uuid128(16);
    private BluetoothCharacteristic a;
    private ILFEventListener b;
    private HMDeviceType c;
    private EventHandler d;

    public interface EventHandler {
        void onMtuChanged(int mtu);

        void onPieceEvent(AsyncPieceEvent event);
    }

    public static class a implements EventHandler {
        private GattPeripheral a;

        public a(GattPeripheral gattPeripheral) {
            this.a = gattPeripheral;
        }

        private Mtu a() {
            GattPeripheral gattPeripheral = this.a;
            return gattPeripheral != null ? gattPeripheral.getMtu() : Mtu.createDefault();
        }

        @Override // com.xiaomi.hm.health.bt.profile.slre.HMLFProfile.EventHandler
        public void onMtuChanged(int mtu) {
            a().setAttMtuSize(mtu);
        }

        @Override // com.xiaomi.hm.health.bt.profile.slre.HMLFProfile.EventHandler
        public void onPieceEvent(AsyncPieceEvent event) {
            GattPeripheral gattPeripheral = this.a;
            if (gattPeripheral != null) {
                gattPeripheral.onPatchEvent(event);
            }
        }
    }

    public HMLFProfile(GattPeripheral gattPeripheral, HMDeviceType deviceType) {
        this(new HMBleBluetoothCharacteristic(gattPeripheral, IBaseProfile.UUID_SERVICE_MILI_SERVICE, f), deviceType, new a(gattPeripheral));
    }

    private void b(int mtu) {
        Debug.fi(e, "MTU_CHANGE:" + mtu);
        EventHandler eventHandler = this.d;
        if (eventHandler != null) {
            eventHandler.onMtuChanged(mtu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] value) {
        Debug.fi(e, "LF value:" + GattUtils.bytesToHexString(value));
        if (value == null || value.length < 1) {
            return;
        }
        LfType lfTypeFrom = LfType.from(value[0] & 255);
        if (lfTypeFrom == LfType.MTU_CHANGE) {
            b(GattUtils.bytesToInt(value, 1, 2));
            return;
        }
        if (lfTypeFrom == LfType.ASYNC_PIECE) {
            d(new AsyncPieceEvent(value[1] & 255, value[2] & 255, value[3] & 255));
            return;
        }
        HMLFEvent hMLFEvent = new HMLFEvent(this.c, lfTypeFrom);
        int length = value.length - 1;
        if (length > 0) {
            byte[] bArr = new byte[length];
            System.arraycopy(value, 1, bArr, 0, length);
            hMLFEvent.setExtra(bArr);
        }
        Debug.fi(e, "LF event:" + hMLFEvent);
        ILFEventListener iLFEventListener = this.b;
        if (iLFEventListener != null) {
            iLFEventListener.onLFEvent(hMLFEvent);
        }
    }

    private void d(AsyncPieceEvent event) {
        EventHandler eventHandler = this.d;
        if (eventHandler != null) {
            eventHandler.onPieceEvent(event);
        }
    }

    public static boolean isSupport(GattPeripheral gattPeripheral) {
        BluetoothGattService service = gattPeripheral.getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE);
        return (service == null || service.getCharacteristic(f) == null) ? false : true;
    }

    public boolean deInit() {
        this.a.unregisterNotification();
        return true;
    }

    public boolean init() {
        if (!this.a.init()) {
            return false;
        }
        this.a.registerNotification(new DataCallback() { // from class: d03
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public final void onReceived(byte[] bArr) {
                this.a.c(bArr);
            }
        });
        return true;
    }

    public void setListener(ILFEventListener listener) {
        this.b = listener;
    }

    public HMLFProfile(BluetoothCharacteristic characteristic, HMDeviceType deviceType, EventHandler eventHandler) {
        this.a = characteristic;
        this.c = deviceType;
        this.d = eventHandler;
    }
}
