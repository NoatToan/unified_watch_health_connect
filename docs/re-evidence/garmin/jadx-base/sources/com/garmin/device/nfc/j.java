package com.garmin.device.nfc;

import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    public enum a {
        FAILED(0),
        SUCCESS(1),
        BUSY(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f50918a;

        a(int i14) {
            this.f50918a = (byte) i14;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "[None]";
        }
        StringBuffer stringBuffer = new StringBuffer("[ ");
        for (byte b14 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b14)));
            stringBuffer.append(StringUtils.SPACE);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static boolean b(i iVar, NfcCommandHandler.e eVar) {
        return c(iVar, eVar) == a.SUCCESS;
    }

    public static a c(i iVar, NfcCommandHandler.e eVar) {
        if (iVar == null) {
            return a.FAILED;
        }
        byte[] bArrD = iVar.d();
        if (bArrD == null || bArrD.length < 2 || (bArrD[0] & UnsignedBytes.MAX_VALUE) != eVar.f50841a) {
            return a.FAILED;
        }
        byte b14 = bArrD[1];
        a aVar = a.SUCCESS;
        if (b14 == aVar.f50918a) {
            return aVar;
        }
        a aVar2 = a.BUSY;
        return b14 == aVar2.f50918a ? aVar2 : a.FAILED;
    }
}
