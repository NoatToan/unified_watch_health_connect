package com.miui.tsmclient.hcievent;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;

/* JADX INFO: loaded from: classes6.dex */
public class SZTHciHandler extends AbsTransportationEventHandler {
    private static final int LENGTH_TOP_UP_DATA = 23;
    private static final int LENGTH_TRANSACTION_DATA = 17;

    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        ByteArray byteArrayDuplicate;
        ByteArray byteArrayDuplicate2;
        int length = byteArray.length();
        ByteArray byteArrayDuplicate3 = ByteArray.EMPTY;
        boolean z = true;
        if (23 <= length) {
            byteArrayDuplicate = byteArray.duplicate(1, 4);
            byteArrayDuplicate2 = byteArrayDuplicate3;
            byteArrayDuplicate3 = byteArray.duplicate(19, 4);
        } else if (17 == length) {
            ByteArray byteArrayDuplicate4 = byteArray.duplicate(3, 4);
            ByteArray byteArrayDuplicate5 = byteArray.duplicate(7, 4);
            byteArrayDuplicate2 = byteArray.duplicate(11, 6);
            z = ByteArray.equals(ByteArray.wrap((byte) 0), byteArray.duplicate(1, 1)) ? false : true;
            byteArrayDuplicate3 = byteArrayDuplicate5;
            byteArrayDuplicate = byteArrayDuplicate4;
        } else {
            byteArrayDuplicate = byteArrayDuplicate3;
            byteArrayDuplicate2 = byteArrayDuplicate;
        }
        HciEventInfo hciEventInfo = new HciEventInfo(str, j, Coder.bytesToInt(byteArrayDuplicate.toBytes()), z ? Coder.bytesToInt(byteArrayDuplicate3.toBytes()) - Integer.MIN_VALUE : 0, false);
        hciEventInfo.setTradeState(z);
        hciEventInfo.setTerminalNo(Coder.bytesToHexString(byteArrayDuplicate2.toBytes()));
        return hciEventInfo;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return ByteArray.equals(ByteArray.wrap(bArr), APDUConstants.AID_SZT);
    }
}
