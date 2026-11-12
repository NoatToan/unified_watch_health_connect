package com.miui.tsmclient.hcievent;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes6.dex */
public class CQV2HciHandler extends AbsTransportationEventHandler {
    private static final ByteArray AID = ByteArray.wrap(new byte[]{67, 81, 81, SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 89, 83, 51, 49});

    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        ByteArray byteArrayDuplicate = byteArray.duplicate(2, 4);
        ByteArray byteArrayDuplicate2 = byteArray.duplicate(20, 4);
        ByteArray byteArrayDuplicate3 = byteArray.duplicate(7, 6);
        HciEventInfo hciEventInfo = new HciEventInfo(str, j, Coder.bytesToInt(byteArrayDuplicate.toBytes()), Coder.bytesToInt(byteArrayDuplicate2.toBytes()), false);
        hciEventInfo.setTerminalNo(Coder.bytesToHexString(byteArrayDuplicate3.toBytes()));
        return hciEventInfo;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return ByteArray.equals(ByteArray.wrap(bArr), AID) && (bArr2 == null ? 0 : bArr2.length) == 24;
    }
}
