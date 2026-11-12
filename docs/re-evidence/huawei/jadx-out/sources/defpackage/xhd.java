package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes20.dex */
public class xhd {
    private static xhd d;
    private static final Object e = new Object();

    private int d(int i) {
        return (-16777216) | ((((63488 & i) >> 8) << 16) + (((i & 2016) >> 3) << 8) + ((i & 31) << 3));
    }

    private xhd() {
    }

    public static xhd b() {
        xhd xhdVar;
        synchronized (e) {
            LogUtil.b("BitmapUtil", "getInstance() LOCK");
            if (d == null) {
                d = new xhd();
            }
            xhdVar = d;
        }
        return xhdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public void c(String str, String str2) throws Throwable {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("BitmapUtil", "createBinFile Failed, bitmapPath fileInputStream null");
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(new File(cop.b(str2)))));
                try {
                    dataOutputStream.writeShort(17699);
                    dataOutputStream.writeShort(34952);
                    String strB = cop.b(str);
                    if (new File(strB).length() >= 10485760) {
                        LogUtil.e("BitmapUtil", "The file size exceeds 10 MB.");
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused) {
                            Object[] objArr = {"createBinFile，outputStream.close IOException"};
                            LogUtil.d("BitmapUtil", objArr);
                            r0 = objArr;
                        }
                    } else {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strB);
                        if (bitmapDecodeFile == null) {
                            LogUtil.e("BitmapUtil", "decode source pictureBitmap file null");
                            try {
                                dataOutputStream.close();
                            } catch (IOException unused2) {
                                Object[] objArr2 = {"createBinFile，outputStream.close IOException"};
                                LogUtil.d("BitmapUtil", objArr2);
                                r0 = objArr2;
                            }
                        } else {
                            int width = bitmapDecodeFile.getWidth();
                            int height = bitmapDecodeFile.getHeight();
                            d(dataOutputStream, width);
                            d(dataOutputStream, height);
                            int[] iArr = new int[Math.multiplyExact(width, height)];
                            bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
                            d(dataOutputStream, iArr);
                            dataOutputStream.flush();
                            try {
                                dataOutputStream.close();
                            } catch (IOException unused3) {
                                Object[] objArr3 = {"createBinFile，outputStream.close IOException"};
                                LogUtil.d("BitmapUtil", objArr3);
                                r0 = objArr3;
                            }
                        }
                    }
                } catch (IOException unused4) {
                    dataOutputStream2 = dataOutputStream;
                    Object[] objArr4 = new Object[1];
                    objArr4[r0] = "createBinFile, outputStream.flush IOException";
                    LogUtil.d("BitmapUtil", objArr4);
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException unused5) {
                            LogUtil.d("BitmapUtil", "createBinFile，outputStream.close IOException");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused6) {
                            LogUtil.d("BitmapUtil", "createBinFile，outputStream.close IOException");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused7) {
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = dataOutputStream2;
        }
    }

    private void d(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == iArr.length - 1 || iArr[i2] != iArr[i2 + 1]) {
                c(dataOutputStream, iArr, i, i2);
                i = 1;
            } else {
                i++;
            }
        }
    }

    private void c(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i >= 4) {
            a(dataOutputStream, 591751049);
            a(dataOutputStream, iArr[i2]);
            a(dataOutputStream, i);
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                a(dataOutputStream, iArr[i2]);
            }
        }
    }

    private int[] e(DataInputStream dataInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iC = c(dataInputStream);
            if (iC == 591751049) {
                int iC2 = c(dataInputStream);
                int iC3 = c(dataInputStream);
                for (int i3 = 0; i3 < iC3; i3++) {
                    iArr[i2] = iC2;
                    i2++;
                }
            } else {
                iArr[i2] = iC;
                i2++;
            }
        }
        return iArr;
    }

    private void d(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
    }

    private void a(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
        dataOutputStream.writeByte((i >> 24) & 255);
    }

    private int b(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 8) | (dataInputStream.readByte() & 255);
    }

    private int c(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 24) | (dataInputStream.readByte() & 255) | ((dataInputStream.readByte() & 255) << 8) | ((dataInputStream.readByte() & 255) << 16);
    }

    private int a(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 16) | (dataInputStream.readByte() & 255) | ((dataInputStream.readByte() & 255) << 8);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[Catch: IOException -> 0x00f2, TRY_LEAVE, TryCatch #4 {IOException -> 0x00f2, blocks: (B:47:0x00e9, B:49:0x00ee), top: B:58:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:45:0x00e5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public void b(String str, String str2) throws Throwable {
        DataInputStream dataInputStream;
        Object[] objArr;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.b("BitmapUtil", "createPngFile Failed, binFilePath fileInputStream null");
            return;
        }
        DataInputStream dataInputStream2 = 0;
        fileOutputStreamOpenOutputStream = null;
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            try {
                dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(cop.b(str))));
                try {
                    int i = dataInputStream.readInt();
                    if (i == 1159956488 || i == 1159956616 || i == 1159947765) {
                        int iB = b(dataInputStream);
                        int iB2 = b(dataInputStream);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c(dataInputStream, i, Math.multiplyExact(iB, iB2)), iB, iB2, Bitmap.Config.ARGB_8888);
                        StringBuilder sb = new StringBuilder("createPngFile bitmap : ");
                        sb.append(bitmapCreateBitmap != null);
                        LogUtil.b("BitmapUtil", sb.toString());
                        if (i == 1159956488 && iB == iB2 && bitmapCreateBitmap != null) {
                            bitmapCreateBitmap = d(bitmapCreateBitmap);
                        }
                        if (bitmapCreateBitmap != null) {
                            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(cop.b(str2)));
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                            LogUtil.b("BitmapUtil", "redrawBitmap png size : " + bitmapCreateBitmap.getByteCount());
                            fileOutputStreamOpenOutputStream.flush();
                        }
                    } else {
                        LogUtil.b("BitmapUtil", "createPngFile, bin file header error");
                    }
                    try {
                        dataInputStream.close();
                        if (fileOutputStreamOpenOutputStream != null) {
                            fileOutputStreamOpenOutputStream.close();
                        }
                    } catch (IOException unused) {
                        LogUtil.b("BitmapUtil", "createPngFile close failed, IOException");
                    }
                } catch (IOException unused2) {
                    LogUtil.b("BitmapUtil", "createPngFile IOException");
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException unused3) {
                            LogUtil.b("BitmapUtil", "createPngFile close failed, IOException");
                            return;
                        }
                    }
                    if (0 != 0) {
                        dataInputStream2.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = objArr;
                if (dataInputStream2 != 0) {
                    try {
                        dataInputStream2.close();
                        if (dataInputStream2 != 0) {
                            dataInputStream2.close();
                        }
                    } catch (IOException unused4) {
                        LogUtil.b("BitmapUtil", "createPngFile close failed, IOException");
                        throw th;
                    }
                } else if (dataInputStream2 != 0) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (IOException unused5) {
            dataInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream2 != 0) {
                dataInputStream2.close();
                if (dataInputStream2 != 0) {
                    dataInputStream2.close();
                }
            } else if (dataInputStream2 != 0) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    private int[] b(DataInputStream dataInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            try {
                int iC = c(dataInputStream);
                if (iC == 591751049) {
                    int iC2 = c(dataInputStream);
                    int iC3 = c(dataInputStream);
                    for (int i3 = 0; i3 < iC3 * 2; i3++) {
                        iArr[i2] = d(iC2 >> 16);
                        i2++;
                    }
                } else {
                    iArr[i2] = d(iC >> 16);
                    iArr[i2 + 1] = d(iC & 65535);
                    i2 += 2;
                }
            } catch (IOException e2) {
                LogUtil.b("BitmapUtil", "read16BitPixels IOException: " + ExceptionUtils.c(e2));
                return iArr;
            }
        }
        LogUtil.b("BitmapUtil", "read16BitPixels length: " + i);
        return iArr;
    }

    private int[] c(DataInputStream dataInputStream, int i, int i2) throws IOException {
        int[] iArr = new int[i2];
        if (i == 1159956488) {
            return c(dataInputStream, i2);
        }
        if (i == 1159947765) {
            return b(dataInputStream, i2);
        }
        return e(dataInputStream, i2);
    }

    private int[] c(DataInputStream dataInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iA = a(dataInputStream);
            if (iA == 4548489) {
                int iA2 = a(dataInputStream);
                int iA3 = a(dataInputStream);
                if (iA3 > i) {
                    LogUtil.e("BitmapUtil", "length less than count.");
                    break;
                }
                for (int i3 = 0; i3 < iA3; i3++) {
                    iArr[i2] = iA2 | (-16777216);
                    i2++;
                }
            } else {
                iArr[i2] = iA | (-16777216);
                i2++;
            }
        }
        LogUtil.b("BitmapUtil", "read24BitPixels length : " + i);
        return iArr;
    }

    private Bitmap d(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-12434878);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, bitmap.getWidth() / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }
}
