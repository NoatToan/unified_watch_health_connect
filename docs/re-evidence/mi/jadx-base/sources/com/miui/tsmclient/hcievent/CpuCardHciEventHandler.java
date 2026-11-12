package com.miui.tsmclient.hcievent;

import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CpuCardHciEventHandler implements IHciEventHandler {
    private static final String AID_CPU_CARD_PREFIX = "A0000000006D696B65796361";
    private ByteArray TAG_AMOUNT = ByteArray.wrap(new byte[]{-47});
    private ByteArray TAG_BALANCE = ByteArray.wrap(new byte[]{-46});
    private ByteArray TAG_TERMINAL_NO = ByteArray.wrap(new byte[]{-45});
    private ByteArray TAG_MESSAGE_TITLE = ByteArray.wrap(new byte[]{-44});
    private ByteArray TAG_MESSAGE_DES = ByteArray.wrap(new byte[]{-43});

    private Map<ByteArray, ByteArray> parseData(ByteArray byteArray) {
        HashMap map = new HashMap();
        int i = 0;
        while (i < byteArray.length()) {
            ByteArray byteArrayDuplicate = byteArray.duplicate(i, 1);
            if (ByteArray.equals(byteArrayDuplicate, this.TAG_AMOUNT) || ByteArray.equals(byteArrayDuplicate, this.TAG_BALANCE) || ByteArray.equals(byteArrayDuplicate, this.TAG_TERMINAL_NO) || ByteArray.equals(byteArrayDuplicate, this.TAG_MESSAGE_TITLE) || ByteArray.equals(byteArrayDuplicate, this.TAG_MESSAGE_DES)) {
                int iBytesToInt = Coder.bytesToInt(byteArray.duplicate(i + 1, 1).toBytes());
                int i2 = i + 2;
                map.put(byteArrayDuplicate, byteArray.duplicate(i2, iBytesToInt));
                i = i2 + iBytesToInt;
            } else {
                i++;
            }
        }
        return map;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        LogUtils.d("handle CpuCardHciEventHandler");
        ByteArray value = null;
        if (bArr2 != null && bArr2.length >= 2) {
            Map<ByteArray, ByteArray> data = parseData(ByteArray.wrap(bArr2));
            if (data.size() > 0) {
                ByteArray value2 = null;
                for (Map.Entry<ByteArray, ByteArray> entry : data.entrySet()) {
                    if (ByteArray.equals(entry.getKey(), this.TAG_AMOUNT)) {
                        value = entry.getValue();
                    } else if (ByteArray.equals(entry.getKey(), this.TAG_BALANCE)) {
                        value2 = entry.getValue();
                    } else if (ByteArray.equals(entry.getKey(), this.TAG_TERMINAL_NO) || ByteArray.equals(entry.getKey(), this.TAG_MESSAGE_TITLE) || ByteArray.equals(entry.getKey(), this.TAG_MESSAGE_DES)) {
                        entry.getValue();
                    }
                }
                return new HciEventInfo(Coder.bytesToHexString(bArr), j, value == null ? 0 : Coder.bytesToInt(value.toBytes()), value2 != null ? Coder.bytesToInt(value2.toBytes()) : 0, true);
            }
        }
        return null;
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return Coder.bytesToHexString(bArr).startsWith(AID_CPU_CARD_PREFIX);
    }
}
