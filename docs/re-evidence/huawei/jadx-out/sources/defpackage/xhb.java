package defpackage;

import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xhb {
    public static List<Integer> c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(10);
        if (bArr == null || bArr.length == 0) {
            LogUtil.e("CommandUnpackageUtil", "parseAck, bitmapHex is empty");
            return arrayList;
        }
        StringBuilder sb = new StringBuilder(16);
        for (byte b2 : bArr) {
            sb.append(new StringBuffer(e(b2)).reverse().toString());
        }
        String string = sb.toString();
        for (int i = 0; i < string.length(); i++) {
            if ("0".equalsIgnoreCase(string.charAt(i) + "")) {
                arrayList.add(0);
            } else {
                arrayList.add(1);
            }
        }
        return arrayList;
    }

    private static String e(byte b2) {
        return "" + ((int) ((byte) ((b2 >> 7) & 1))) + ((int) ((byte) ((b2 >> 6) & 1))) + ((int) ((byte) ((b2 >> 5) & 1))) + ((int) ((byte) ((b2 >> 4) & 1))) + ((int) ((byte) ((b2 >> 3) & 1))) + ((int) ((byte) ((b2 >> 2) & 1))) + ((int) ((byte) ((b2 >> 1) & 1))) + ((int) ((byte) (b2 & 1)));
    }
}
