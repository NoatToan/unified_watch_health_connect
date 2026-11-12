package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class egz {
    public static boolean b(int i, int i2) {
        return (i == 4 || i == 7 || i2 != 0) ? false : true;
    }

    private static boolean c(int i, int i2) {
        return i2 < 0 || i < 0 || i2 - i < 0;
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        if (c(i, i2)) {
            LogUtil.j("CommandCommandUtils", "Invalid parameter.");
            return new byte[0];
        }
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        LogUtil.a("CommandCommandUtils", "result.length = " + i3);
        for (int i4 = i; i4 < i2; i4++) {
            bArr2[i4 - i] = bArr[i4];
        }
        return bArr2;
    }

    public static void d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (c(i2, i3)) {
            LogUtil.j("CommandCommandUtils", "Invalid parameter.");
            return;
        }
        for (int i4 = i2; i4 < i3; i4++) {
            bArr[(i + i4) - i2] = bArr2[i4];
        }
    }
}
