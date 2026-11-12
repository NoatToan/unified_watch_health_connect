package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsh {
    public static String a(byte b2) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append((int) ((byte) ((b2 >> 7) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 6) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 5) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 4) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 3) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 2) & 1)));
        stringBuffer.append((int) ((byte) ((b2 >> 1) & 1)));
        stringBuffer.append((int) ((byte) (b2 & 1)));
        return stringBuffer.toString();
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 2);
        } catch (NumberFormatException unused) {
            LogUtil.e("CommandPackageUtil", "stringToInt NumberFormatException");
            return 0;
        }
    }

    public static int e(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(a(bArr[5]));
        stringBuffer.append(a(bArr[6]));
        stringBuffer.append(a(bArr[7]));
        stringBuffer.append(a(bArr[8]));
        return a(stringBuffer.toString());
    }
}
