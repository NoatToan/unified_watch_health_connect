package com.sifli.ezip;

import android.os.Build;
import com.xiaomi.smarthome.CpuConstant;

/* JADX INFO: loaded from: classes6.dex */
public class sifliEzipUtil {
    static {
        System.loadLibrary("ezip");
    }

    public static synchronized byte[] a(byte[] bArr, int i, int i2) {
        int i3;
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            int length = strArr.length;
            while (i3 < length) {
                String str = strArr[i3];
                i3 = (str.contains(CpuConstant.CPU_ARMEABI_V8A) || str.contains(CpuConstant.CPU_ARMEABIV7) || str.contains(CpuConstant.CPU_ARMEABI)) ? 0 : i3 + 1;
                StringBuilder sb = new StringBuilder();
                sb.append("mi limit 2.3.10, color ");
                sb.append(0);
                sb.append(", bin ");
                sb.append(3);
                sb.append(", board ");
                sb.append(2);
                sb.append(", data len ");
                sb.append(bArr.length);
                sb.append(", width ");
                sb.append(i);
                sb.append(", height ");
                sb.append(i2);
                return png2EzipPixel(bArr, bArr.length, i, i2, "rgb888", 0, 3, 2);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static native byte[] png2EzipNDK(byte[] bArr, long j, String str, int i, int i2);

    private static native byte[] png2EzipPixel(byte[] bArr, long j, int i, int i2, String str, int i3, int i4, int i5);

    private static native byte[] png2EzipSequenceWithTypeNDK(byte[] bArr, int[] iArr, String str, int i, int i2, int i3);

    private static native byte[] png2EzipWithTypeNDK(byte[] bArr, long j, String str, int i, int i2, int i3);

    private static native byte[] pngTestGetNDK(byte[] bArr, long j, String str, int i, int i2, int i3);
}
