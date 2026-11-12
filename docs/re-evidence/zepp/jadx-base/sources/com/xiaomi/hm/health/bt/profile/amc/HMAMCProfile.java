package com.xiaomi.hm.health.bt.profile.amc;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;

/* JADX INFO: loaded from: classes10.dex */
public class HMAMCProfile extends HMBaseProfile {
    private static final String b = "HMAMCProfile";

    public HMAMCProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return false;
    }

    public boolean sendMusicControl(HMMusicControl control) {
        if (control == null) {
            return false;
        }
        byte[] bleBytes = control.toBleBytes();
        Debug.fi(b, "cmd: " + GattUtils.bytesToHexString(bleBytes));
        if (bleBytes == null || bleBytes.length == 0 || !isSupportPatchWrite()) {
            return false;
        }
        return patchWrite(bleBytes, 3);
    }
}
