package com.tsmclient.smartcard.terminal;

import com.tsmclient.smartcard.Coder;

/* JADX INFO: loaded from: classes6.dex */
public class TerminalUtils {
    private TerminalUtils() {
    }

    public static CommandApdu buildSetStatusApdu(String str, boolean z) {
        CommandApdu commandApduM212clone = z ? APDUConstants.COMM_PREFIX_ACTIVATE_CARD.m212clone() : APDUConstants.COMM_PREFIX_DEACTIVATE_CARD.m212clone();
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(str);
        byte[] bArr = new byte[bArrHexStringToBytes.length + 2];
        bArr[0] = 79;
        bArr[1] = (byte) (bArrHexStringToBytes.length & 255);
        System.arraycopy(bArrHexStringToBytes, 0, bArr, 2, bArrHexStringToBytes.length);
        commandApduM212clone.setData(bArr);
        return commandApduM212clone;
    }
}
