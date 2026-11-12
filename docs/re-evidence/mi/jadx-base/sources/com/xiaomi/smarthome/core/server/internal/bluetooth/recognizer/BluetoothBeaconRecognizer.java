package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BtConstants;
import com.xiaomi.smarthome.core.server.internal.bluetooth.ComboCollector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.BleAdvertiseItem;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.BleAdvertisement;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotPacketParser;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothBeaconRecognizer implements IBluetoothRecognizer {
    private BluetoothBeaconRecognizer() {
    }

    public static BluetoothBeaconRecognizer newInstance() {
        return new BluetoothBeaconRecognizer();
    }

    private MiotBleAdvPacket parseMiotBleAdvPacket(BleAdvertisement bleAdvertisement) {
        MiotBleAdvPacket miotBleAdvPacket = null;
        try {
            Iterator<BleAdvertiseItem> it = bleAdvertisement.getItems().iterator();
            while (it.hasNext() && (miotBleAdvPacket = MiotPacketParser.parse(it.next())) == null) {
            }
        } catch (Exception unused) {
        }
        return miotBleAdvPacket;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizer
    public BluetoothRecognizeResult recognize(BluetoothSearchResult bluetoothSearchResult) {
        BleAdvertisement bleAdvertisement;
        MiotBleAdvPacket miotBleAdvPacket;
        BluetoothRecognizeResult bluetoothRecognizeResult = new BluetoothRecognizeResult();
        if (bluetoothSearchResult.getScanRecord() != null && (miotBleAdvPacket = parseMiotBleAdvPacket((bleAdvertisement = new BleAdvertisement(bluetoothSearchResult.getScanRecord())))) != null) {
            if (miotBleAdvPacket.productId > 0) {
                BluetoothCache.setPropProductId(bluetoothSearchResult.getAddress(), miotBleAdvPacket.productId);
                bluetoothRecognizeResult.packet4Pid = miotBleAdvPacket;
            }
            if (!TextUtils.isEmpty(miotBleAdvPacket.mac)) {
                BluetoothCache.setPropSMac(bluetoothSearchResult.getAddress(), miotBleAdvPacket.mac);
            }
            if (miotBleAdvPacket.isComboPacket() && !TextUtils.isEmpty(miotBleAdvPacket.comboKey)) {
                BluetoothLog.v("BluetoothBeaconRecognizer addCombo, comboKey = " + miotBleAdvPacket.comboKey + ", address = " + bluetoothSearchResult.getAddress() + ", pid = " + miotBleAdvPacket.productId);
                ComboCollector.addCombo(miotBleAdvPacket.comboKey, bluetoothSearchResult.getAddress());
                if (miotBleAdvPacket.frameControl != null) {
                    ComboCollector.addComboAuthMode(bluetoothSearchResult.getAddress(), miotBleAdvPacket.frameControl.authMode);
                }
                BluetoothCache.setPropType(bluetoothSearchResult.getAddress(), 1);
            }
            if (miotBleAdvPacket.frameControl != null || miotBleAdvPacket.productId == 91) {
                bluetoothRecognizeResult.model = BluetoothService.getBleCoreProvider().getModelByProductId(miotBleAdvPacket.productId);
            }
            if (miotBleAdvPacket.productId == 5662) {
                bluetoothRecognizeResult.model = BtConstants.UWB_TAG_MODEL;
            }
            BluetoothLog.v("BluetoothBeaconRecognizer productId=" + miotBleAdvPacket.productId + ",model=" + bluetoothRecognizeResult.model);
            if (!TextUtils.isEmpty(bluetoothRecognizeResult.model)) {
                bluetoothRecognizeResult.packet = miotBleAdvPacket;
                bluetoothRecognizeResult.rssi = bluetoothSearchResult.getRssi();
                String beaconName = bleAdvertisement.parseBeaconName();
                if (!TextUtils.isEmpty(beaconName)) {
                    BluetoothCache.setPropBeaconName(bluetoothSearchResult.getAddress(), beaconName);
                }
            }
        }
        return bluetoothRecognizeResult;
    }
}
