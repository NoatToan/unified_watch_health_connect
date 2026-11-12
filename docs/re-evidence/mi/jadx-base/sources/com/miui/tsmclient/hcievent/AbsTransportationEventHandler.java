package com.miui.tsmclient.hcievent;

import com.miui.tsmclient.entity.CardConfigManager;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbsTransportationEventHandler implements IHciEventHandler {
    public abstract HciEventInfo doHandleData(String str, long j, ByteArray byteArray);

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public final HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        String strBytesToHexString = Coder.bytesToHexString(bArr);
        if (bArr2 == null || bArr2.length == 0) {
            return new HciEventInfo(strBytesToHexString, j, false);
        }
        HciEventInfo hciEventInfoDoHandleData = doHandleData(strBytesToHexString, j, ByteArray.wrap(bArr2));
        if (hciEventInfoDoHandleData != null) {
            CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(strBytesToHexString);
            hciEventInfoDoHandleData.setData(Coder.bytesToHexString(bArr2));
            if (cardConfig != null) {
                strBytesToHexString = cardConfig.getCardAid();
            }
            hciEventInfoDoHandleData.setHeadAid(strBytesToHexString);
        }
        return hciEventInfoDoHandleData;
    }
}
