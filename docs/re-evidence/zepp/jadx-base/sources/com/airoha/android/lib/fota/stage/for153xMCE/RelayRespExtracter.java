package com.airoha.android.lib.fota.stage.for153xMCE;

import com.airoha.android.lib.util.Converter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class RelayRespExtracter {
    public static int extractRaceId(byte[] bArr) {
        return Converter.BytesToU16(bArr[5], bArr[4]);
    }

    public static byte extractRaceType(byte[] bArr) {
        return bArr[1];
    }

    public static byte[] extractRelayRespPacket(byte[] bArr) {
        return Arrays.copyOfRange(bArr, 8, bArr.length);
    }

    public static byte extractStatus(byte[] bArr) {
        return bArr[6];
    }

    public static boolean isExtractedWanted(byte[] bArr, byte b, int i) {
        return bArr[1] == b && Converter.BytesToU16(bArr[5], bArr[4]) == i;
    }
}
