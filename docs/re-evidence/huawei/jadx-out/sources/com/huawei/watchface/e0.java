package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30121a = "e0";

    public static List a(String str) {
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(str)) {
            HwLog.e(f30121a, "parseAck , bitmapHex is empty");
            return arrayList;
        }
        byte[] bArrA = i1.a(str);
        StringBuilder sb = new StringBuilder(16);
        for (byte b2 : bArrA) {
            sb.append(new StringBuffer(a(b2)).reverse().toString());
        }
        String string = sb.toString();
        HwLog.i(f30121a, "parseAck, bufferStr = " + string);
        for (int i = 0; i < string.length(); i++) {
            if ("0".equalsIgnoreCase(string.charAt(i) + "")) {
                arrayList.add(0);
                HwLog.i(f30121a, "errorPackages, error package index = " + i);
            } else {
                arrayList.add(1);
            }
        }
        return arrayList;
    }

    public static String a(byte b2) {
        return "" + ((int) ((byte) ((b2 >> 7) & 1))) + ((int) ((byte) ((b2 >> 6) & 1))) + ((int) ((byte) ((b2 >> 5) & 1))) + ((int) ((byte) ((b2 >> 4) & 1))) + ((int) ((byte) ((b2 >> 3) & 1))) + ((int) ((byte) ((b2 >> 2) & 1))) + ((int) ((byte) ((b2 >> 1) & 1))) + ((int) ((byte) (b2 & 1)));
    }
}
