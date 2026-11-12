package com.miui.tsmclient.hcievent;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.terminal.APDUConstants;

/* JADX INFO: loaded from: classes6.dex */
public class TicketHciEventHandler extends AbsTransportationEventHandler {
    private static final byte STATION_STATUS_IN = 1;
    private static final byte STATION_STATUS_OUT = 16;
    private static final byte STATION_STATUS_REFUSED = -1;

    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        int i = 0;
        byte b2 = byteArray.get(0);
        if (b2 != 1) {
            if (b2 == 16) {
                i = 1;
            } else {
                i = -1;
                if (b2 == -1) {
                    i = 2;
                }
            }
        }
        return new HciEventInfo(str, j, i);
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        ByteArray byteArrayWrap = ByteArray.wrap(bArr);
        return ByteArray.equals(byteArrayWrap, APDUConstants.AID_ST_ONE_DAY_PASS) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_ST_THREE_DAY_PASS);
    }
}
