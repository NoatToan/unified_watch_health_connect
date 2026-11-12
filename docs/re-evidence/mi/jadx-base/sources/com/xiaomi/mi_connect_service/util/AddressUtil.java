package com.xiaomi.mi_connect_service.util;

/* JADX INFO: loaded from: classes11.dex */
public class AddressUtil {
    public static String convertMacAddressToString(byte[] bArr) {
        if (bArr == null || bArr.length != 6) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x:", Byte.valueOf(b2)));
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    public static byte[] convertStringToMacAddress(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 6) {
            return null;
        }
        byte[] bArr = new byte[6];
        for (int i = 0; i < strArrSplit.length; i++) {
            bArr[i] = (byte) (Integer.parseInt(strArrSplit[i], 16) & 255);
        }
        return bArr;
    }
}
