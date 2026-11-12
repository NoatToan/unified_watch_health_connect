package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41737a = new Object();
    private static mjf e;

    private mjf() {
    }

    public static mjf a() {
        mjf mjfVar;
        LogUtil.a("WatchFaceBitmapUtil", "getInstance");
        synchronized (f41737a) {
            LogUtil.a("WatchFaceBitmapUtil", "getInstance() LOCK");
            if (e == null) {
                e = new mjf();
            }
            LogUtil.a("WatchFaceBitmapUtil", "getInstance");
            mjfVar = e;
        }
        return mjfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [mjf] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:43:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:43:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x009a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(java.lang.String r16, java.lang.String r17) {
        /*
            r15 = this;
            r1 = r15
            java.lang.String r2 = "createBinFile，outputStream.close IOException"
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            java.lang.String r3 = "WatchFaceBitmapUtil"
            if (r0 == 0) goto L15
            java.lang.String r0 = "createBinFile Failed, bitmapPath fileInputStream null"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.huawei.hwlogsmodel.LogUtil.j(r3, r0)
            return
        L15:
            r0 = 0
            r4 = 1
            r5 = 0
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.lang.String r9 = health.compact.a.CommonUtil.c(r17)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.FileOutputStream r8 = org.apache.commons.io.FileUtils.openOutputStream(r8)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r5 = 17699(0x4523, float:2.4802E-41)
            r6.writeShort(r5)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r5 = 34952(0x8888, float:4.8978E-41)
            r6.writeShort(r5)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            java.lang.String r5 = health.compact.a.CommonUtil.c(r16)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r5)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r7 != 0) goto L59
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            java.lang.String r7 = "decode source pictureBitmap file null"
            r5[r0] = r7     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            com.huawei.hwlogsmodel.LogUtil.j(r3, r5)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r6.close()     // Catch: java.io.IOException -> L51
            return
        L51:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            com.huawei.hwlogsmodel.LogUtil.e(r3, r0)
            goto La1
        L59:
            int r13 = r7.getWidth()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            int r14 = r7.getHeight()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r15.c(r6, r13)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r15.c(r6, r14)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            int r5 = r13 * r14
            int[] r5 = new int[r5]     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r9 = 0
            r11 = 0
            r12 = 0
            r8 = r5
            r10 = r13
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r15.a(r6, r5)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r6.flush()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            r6.close()     // Catch: java.io.IOException -> L7d
            return
        L7d:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            com.huawei.hwlogsmodel.LogUtil.e(r3, r0)
            goto La1
        L85:
            r0 = move-exception
            goto La3
        L87:
            r5 = r6
            goto L8b
        L89:
            r0 = move-exception
            goto La2
        L8b:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "createBinFile, outputStream.flush IOException"
            r4[r0] = r6     // Catch: java.lang.Throwable -> L89
            com.huawei.hwlogsmodel.LogUtil.e(r3, r4)     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.io.IOException -> L9a
            goto La1
        L9a:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            com.huawei.hwlogsmodel.LogUtil.e(r3, r0)
        La1:
            return
        La2:
            r6 = r5
        La3:
            if (r6 == 0) goto Lb0
            r6.close()     // Catch: java.io.IOException -> La9
            goto Lb0
        La9:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.huawei.hwlogsmodel.LogUtil.e(r3, r2)
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjf.a(java.lang.String, java.lang.String):void");
    }

    private void a(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == iArr.length - 1 || iArr[i2] != iArr[i2 + 1]) {
                e(dataOutputStream, iArr, i, i2);
                i = 1;
            } else {
                i++;
            }
        }
    }

    private void e(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i >= 4) {
            e(dataOutputStream, 591751049);
            e(dataOutputStream, iArr[i2]);
            e(dataOutputStream, i);
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                e(dataOutputStream, iArr[i2]);
            }
        }
    }

    private void c(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
    }

    private void e(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
        dataOutputStream.writeByte((i >> 24) & 255);
    }

    public void e(String str, String str2) {
        LogUtil.a("WatchFaceBitmapUtil", "create16BitBinFile enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WatchFaceBitmapUtil", "create16BitBinFile Failed, bitmapPath fileInputStream null");
            return;
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(new File((String) Objects.requireNonNull(CommonUtil.c(str2))))));
            try {
                dataOutputStream.writeShort(17699);
                dataOutputStream.writeShort(26101);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(CommonUtil.c(str));
                if (bitmapDecodeFile == null) {
                    LogUtil.j("WatchFaceBitmapUtil", "decode source bitmap file null");
                } else {
                    int width = bitmapDecodeFile.getWidth();
                    int height = bitmapDecodeFile.getHeight();
                    c(dataOutputStream, width);
                    c(dataOutputStream, height);
                    int i = width * height;
                    int[] iArr = new int[i];
                    LogUtil.a("WatchFaceBitmapUtil", "width * height = " + width + " * " + height + " = " + i);
                    bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
                    c(dataOutputStream, iArr);
                    StringBuilder sb = new StringBuilder("bin dataOutputStream size : ");
                    sb.append(dataOutputStream.size());
                    LogUtil.a("WatchFaceBitmapUtil", sb.toString());
                    dataOutputStream.flush();
                }
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("WatchFaceBitmapUtil", "create16BitBinFile, dataOutputStream.flush IOException");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [mjf] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.DataOutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ed -> B:37:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ef -> B:37:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x00f3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void b(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjf.b(java.lang.String, java.lang.String):void");
    }

    private void e(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == iArr.length - 1 || b(iArr[i2]) != b(iArr[i2 + 1])) {
                c(dataOutputStream, iArr, i, i2);
                i = 1;
            } else {
                i++;
            }
        }
    }

    private void c(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 0;
        int i2 = 1;
        while (i < iArr.length) {
            if (i == iArr.length - 1 || b(iArr[i]) != b(iArr[i + 1])) {
                if (i2 == 1) {
                    d(dataOutputStream, iArr, i2, i);
                    i++;
                } else if (i2 >= 2 && i2 % 2 != 0) {
                    d(dataOutputStream, iArr, i2 - 1, i);
                    i--;
                } else {
                    d(dataOutputStream, iArr, i2, i);
                }
                i2 = 1;
            } else {
                i2++;
            }
            i++;
        }
    }

    private void d(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i == 1) {
            b(dataOutputStream, b(iArr[i2]));
            if (i2 < iArr.length - 1) {
                b(dataOutputStream, b(iArr[i2 + 1]));
                return;
            } else {
                b(dataOutputStream, 0);
                return;
            }
        }
        if (i < 8) {
            for (int i3 = 0; i3 < i; i3++) {
                b(dataOutputStream, b(iArr[i2]));
            }
        } else {
            e(dataOutputStream, 591751049);
            b(dataOutputStream, b(iArr[i2]));
            b(dataOutputStream, b(iArr[i2]));
            e(dataOutputStream, i / 2);
        }
    }

    private void b(DataOutputStream dataOutputStream, int i) throws IOException {
        c(dataOutputStream, (((i >> 19) & 31) << 11) + (((i >> 10) & 63) << 5) + ((i >> 3) & 31));
    }

    private int b(int i) {
        int iAlpha = Color.alpha(i);
        if (iAlpha == 255) {
            return i;
        }
        return ((Color.blue(i) * iAlpha) / 255) | (((Color.red(i) * iAlpha) / 255) << 16) | (((Color.green(i) * iAlpha) / 255) << 8) | (-16777216);
    }

    private void c(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        int i3 = iArr[i2];
        if (i >= 4 || (i3 & ViewCompat.MEASURED_SIZE_MASK) == 4548489) {
            a(dataOutputStream, 4548489);
            a(dataOutputStream, b(iArr[i2]));
            a(dataOutputStream, i);
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                a(dataOutputStream, b(iArr[i2]));
            }
        }
    }

    private void a(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
    }
}
