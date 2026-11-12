package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes23.dex */
public class cgq {
    private static cgq d;
    private static final Object e = new Object();

    private cgq() {
    }

    public static cgq e() {
        cgq cgqVar;
        LogUtil.a("PictureDealUtils", "getInstance");
        synchronized (e) {
            LogUtil.a("PictureDealUtils", "getInstance() LOCK");
            if (d == null) {
                d = new cgq();
            }
            LogUtil.a("PictureDealUtils", "getInstance");
            cgqVar = d;
        }
        return cgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [cgq] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.DataOutputStream] */
    public void c(Bitmap bitmap, String str) throws Throwable {
        ?? dataOutputStream;
        if (bitmap == null) {
            LogUtil.j("PictureDealUtils", "decode source bitmap file null");
            return;
        }
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(new File(CommonUtil.c(str)))));
                try {
                    dataOutputStream.writeShort(17699);
                    dataOutputStream.writeShort(34824);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    d(dataOutputStream, width);
                    d(dataOutputStream, height);
                    int i = width * height;
                    int[] iArr = new int[i];
                    LogUtil.a("PictureDealUtils", "width * height = " + width + " * " + height + " = " + i);
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    StringBuilder sb = new StringBuilder("org size : ");
                    sb.append(i * 4);
                    LogUtil.a("PictureDealUtils", sb.toString());
                    c(dataOutputStream, iArr);
                    LogUtil.a("PictureDealUtils", "bin dataOutputStream size : " + dataOutputStream.size());
                    dataOutputStream.flush();
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused) {
                        LogUtil.e("PictureDealUtils", "createBinFile，dataOutputStream.close IOException");
                        r2 = iArr;
                    }
                } catch (IOException unused2) {
                    r3 = dataOutputStream;
                    LogUtil.e("PictureDealUtils", "createBinFile, dataOutputStream.flush IOException");
                    r2 = r3;
                    if (r3 != 0) {
                        try {
                            r3.close();
                            r2 = r3;
                        } catch (IOException unused3) {
                            LogUtil.e("PictureDealUtils", "createBinFile，dataOutputStream.close IOException");
                            r2 = r3;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (dataOutputStream != 0) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused4) {
                            LogUtil.e("PictureDealUtils", "createBinFile，dataOutputStream.close IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = r2;
            }
        } catch (IOException unused5) {
        }
    }

    private void c(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == iArr.length - 1 || e(iArr[i2]) != e(iArr[i2 + 1])) {
                d(dataOutputStream, iArr, i, i2);
                i = 1;
            } else {
                i++;
            }
        }
    }

    private void d(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i >= 4) {
            b(dataOutputStream, 4548489);
            b(dataOutputStream, e(iArr[i2]));
            b(dataOutputStream, i);
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                b(dataOutputStream, e(iArr[i2]));
            }
        }
    }

    private void b(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
    }

    private void d(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
    }

    private int e(int i) {
        int iAlpha = Color.alpha(i);
        if (iAlpha == 255) {
            return i;
        }
        return ((Color.blue(i) * iAlpha) / 255) | (((Color.red(i) * iAlpha) / 255) << 16) | (((Color.green(i) * iAlpha) / 255) << 8) | (-16777216);
    }
}
