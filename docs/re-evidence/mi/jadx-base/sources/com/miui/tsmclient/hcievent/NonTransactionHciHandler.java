package com.miui.tsmclient.hcievent;

import com.miui.tsmclient.entity.NonTransactionHciEvent;
import com.miui.tsmclient.model.i;
import com.tsmclient.smartcard.Coder;

/* JADX INFO: loaded from: classes6.dex */
public class NonTransactionHciHandler implements IHciEventHandler {
    private NonTransactionHciEvent mNonTransactionHciEvent;

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        NonTransactionHciEvent nonTransactionHciEvent = this.mNonTransactionHciEvent;
        if (nonTransactionHciEvent == null) {
            throw new IllegalArgumentException(Coder.bytesToHexString(bArr) + " is not supported");
        }
        NonTransactionHciEvent.Event event = nonTransactionHciEvent.getEvent(Coder.bytesToHexString(bArr2));
        if (event == null) {
            return null;
        }
        HciEventInfo hciEventInfo = new HciEventInfo(Coder.bytesToHexString(bArr), HciEventInfo.HciEventType.getHciEventType(event.getType()));
        hciEventInfo.mTradeTime = j;
        hciEventInfo.setTradeState(event.isSuccess());
        hciEventInfo.setDescription(event.getDesc());
        return hciEventInfo;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        NonTransactionHciEvent nonTransactionHciEventA = i.b().a(Coder.bytesToHexString(bArr), Coder.bytesToHexString(bArr2));
        this.mNonTransactionHciEvent = nonTransactionHciEventA;
        return nonTransactionHciEventA != null;
    }
}
