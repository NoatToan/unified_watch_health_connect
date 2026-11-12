package com.huawei.watchface.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.c0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceBitmapUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WatchFaceBitmapUtil f30608c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f30609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f30610b;

    public static WatchFaceBitmapUtil getInstance() {
        HwLog.i("WatchFaceBitmapUtil", "getInstance");
        if (f30608c == null) {
            synchronized (WatchFaceBitmapUtil.class) {
                if (f30608c == null) {
                    f30608c = new WatchFaceBitmapUtil();
                }
            }
        }
        return f30608c;
    }

    public static Bitmap getSafeDecodeFile(String str) {
        try {
            return a(str, (BitmapFactory.Options) null);
        } catch (Exception e) {
            HwLog.e("WatchFaceBitmapUtil", "getSafeDecodeFile Exception" + HwLog.printException(e));
            return null;
        } catch (OutOfMemoryError e2) {
            HwLog.e("WatchFaceBitmapUtil", "getSafeDecodeFile OutOfMemoryError" + HwLog.printException((Error) e2));
            return null;
        }
    }

    public static Bitmap getVideoFrameAtTimeOne(String str) {
        Bitmap frameAtTime = null;
        if (TextUtils.isEmpty(str)) {
            HwLog.w("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- videoPath is empty");
            return null;
        }
        File file = PversionSdUtils.getFile(str);
        if (file == null || !file.exists()) {
            HwLog.w("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- video not exit");
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(1L, 2);
        } catch (RuntimeException e) {
            HwLog.e("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- RuntimeException:" + HwLog.printException((Exception) e));
        } catch (IllegalArgumentException e2) {
            HwLog.e("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- IllegalArgumentException:" + HwLog.printException((Exception) e2));
        } catch (Exception e3) {
            HwLog.e("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- Exception:" + HwLog.printException(e3));
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e4) {
                HwLog.e("WatchFaceBitmapUtil", "getVideoFrameAtTimeOne -- IOException:" + HwLog.printException((Exception) e4));
            }
        }
        return frameAtTime;
    }

    public static void saveBitmapToFile(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStreamB;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        if (bitmap == null) {
            return;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            File file = PversionSdUtils.getFile(str);
            if (!file.exists()) {
                CommonUtils.d(file);
            }
            File file2 = PversionSdUtils.getFile(str + str2);
            if (file2.exists()) {
                CommonUtils.a(file2);
            }
            fileOutputStreamB = PversionSdUtils.b(file2);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStreamB);
                try {
                    bitmap.compress(compressFormat, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(file2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStreamB;
                    try {
                        HwLog.e("WatchFaceBitmapUtil", "saveBitmapToFile IOException " + HwLog.printException((Exception) e));
                        fileOutputStreamB = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStreamB = fileOutputStream;
                        bufferedOutputStream2 = bufferedOutputStream;
                        bufferedOutputStream = bufferedOutputStream2;
                        c0.a(bufferedOutputStream);
                        c0.a(fileOutputStreamB);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0.a(bufferedOutputStream);
                    c0.a(fileOutputStreamB);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
                fileOutputStream = fileOutputStreamB;
                HwLog.e("WatchFaceBitmapUtil", "saveBitmapToFile IOException " + HwLog.printException((Exception) e));
                fileOutputStreamB = fileOutputStream;
                c0.a(bufferedOutputStream);
                c0.a(fileOutputStreamB);
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                c0.a(bufferedOutputStream);
                c0.a(fileOutputStreamB);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStreamB = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStreamB = null;
        }
        c0.a(bufferedOutputStream);
        c0.a(fileOutputStreamB);
    }

    public final int a(int i) {
        return (-16777216) | ((((63488 & i) >> 8) << 16) + (((i & 2016) >> 3) << 8) + ((i & 31) << 3));
    }

    public final void b(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
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

    public final void c(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == iArr.length - 1 || iArr[i2] != iArr[i2 + 1]) {
                a(dataOutputStream, iArr, i, i2);
                i = 1;
            } else {
                i++;
            }
        }
    }

    public void cropPngToRound(String str) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Path path = new Path();
                    path.addCircle(bitmapDecodeStream.getWidth() / 2.0f, bitmapDecodeStream.getHeight() / 2.0f, bitmapDecodeStream.getWidth() / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str)));
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                        bufferedOutputStream.flush();
                    } catch (IOException unused) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        HwLog.e("WatchFaceBitmapUtil", "cropPngToRound Exception");
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Exception unused2) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        HwLog.e("WatchFaceBitmapUtil", "cropPngToRound Exception");
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (OutOfMemoryError unused3) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        HwLog.e("WatchFaceBitmapUtil", "cropPngToRound OutOfMemoryError");
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        c0.a(fileInputStream2);
                        c0.a(bufferedOutputStream);
                        throw th;
                    }
                } catch (IOException unused4) {
                } catch (Exception unused5) {
                } catch (OutOfMemoryError unused6) {
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException unused7) {
            fileInputStream = null;
        } catch (Exception unused8) {
            fileInputStream = null;
        } catch (OutOfMemoryError unused9) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
            c0.a(fileInputStream2);
            c0.a(bufferedOutputStream);
            throw th;
        }
        c0.a(fileInputStream);
        c0.a(bufferedOutputStream);
    }

    public final void d(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
        dataOutputStream.writeByte((i >> 24) & 255);
    }

    public void a(String str, String str2, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("WatchFaceBitmapUtil", "createBinFile Failed, bitmapPath fileInputStream null");
            return;
        }
        Bitmap safeDecodeFile = getSafeDecodeFile(CommonUtils.filterFilePath(str));
        if (safeDecodeFile == null) {
            HwLog.i("WatchFaceBitmapUtil", "decode source bitmap file null");
            return;
        }
        if (i2 == 0 || i3 == 0) {
            HwLog.e("WatchFaceBitmapUtil", "dial width or height is 0");
            return;
        }
        int width = safeDecodeFile.getWidth();
        int height = safeDecodeFile.getHeight();
        if (i2 == width && i3 == height) {
            a(str, str2, i);
        } else {
            HwLog.e("WatchFaceBitmapUtil", "bitmap width or height is not dial width or height");
        }
    }

    public final void b(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i == 1) {
            b(dataOutputStream, iArr[i2]);
            if (i2 < iArr.length - 1) {
                b(dataOutputStream, iArr[i2 + 1]);
                return;
            } else {
                b(dataOutputStream, 0);
                return;
            }
        }
        if (i < 8) {
            for (int i3 = 0; i3 < i; i3++) {
                b(dataOutputStream, iArr[i2]);
            }
        } else {
            d(dataOutputStream, 591751049);
            b(dataOutputStream, iArr[i2]);
            b(dataOutputStream, iArr[i2]);
            d(dataOutputStream, i / 2);
        }
    }

    public final int[] c(DataInputStream dataInputStream, int i) throws IOException {
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

    public final void c(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        int i3 = iArr[i2];
        if (i >= 4 || (i3 & ViewCompat.MEASURED_SIZE_MASK) == 4548489) {
            c(dataOutputStream, 4548489);
            c(dataOutputStream, iArr[i2]);
            c(dataOutputStream, i);
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                c(dataOutputStream, iArr[i2]);
            }
        }
    }

    public final void b(DataOutputStream dataOutputStream, int i) throws IOException {
        a(dataOutputStream, (((i >> 19) & 31) << 11) + (((i >> 10) & 63) << 5) + ((i >> 3) & 31));
    }

    public void a(String str, String str2, int i) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            HwLog.i("WatchFaceBitmapUtil", "createBinFile Failed, bitmapPath fileInputStream null");
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(FileHelper.openOutputStream(new File(CommonUtils.filterFilePath(str2)), false)));
                try {
                    dataOutputStream.writeShort(17699);
                    HwLog.i("WatchFaceBitmapUtil", "createBinFile binFileType: " + i);
                    if (i == 2) {
                        dataOutputStream.writeShort(26101);
                    } else if (i == 1) {
                        dataOutputStream.writeShort(34824);
                    } else {
                        dataOutputStream.writeShort(34952);
                    }
                    Bitmap safeDecodeFile = getSafeDecodeFile(CommonUtils.filterFilePath(str));
                    if (safeDecodeFile == null) {
                        HwLog.i("WatchFaceBitmapUtil", "decode source bitmap file null");
                        HwSfpPolicyManagerHelper.setDefaultCeLabel(str2);
                        c0.a(dataOutputStream);
                        return;
                    }
                    int width = safeDecodeFile.getWidth();
                    int height = safeDecodeFile.getHeight();
                    a(dataOutputStream, width);
                    a(dataOutputStream, height);
                    int[] iArr = new int[width * height];
                    safeDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
                    if (2 == i) {
                        a(dataOutputStream, iArr);
                    } else if (1 == i) {
                        b(dataOutputStream, iArr);
                    } else {
                        c(dataOutputStream, iArr);
                    }
                    dataOutputStream.flush();
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(str2);
                    c0.a(dataOutputStream);
                } catch (IOException unused) {
                    dataOutputStream2 = dataOutputStream;
                    HwLog.i("WatchFaceBitmapUtil", "createBinFile, dataOutputStream.flush IOException");
                    dataOutputStream = dataOutputStream2;
                } catch (Exception unused2) {
                    dataOutputStream2 = dataOutputStream;
                    HwLog.i("WatchFaceBitmapUtil", "createBinFile, exception");
                    dataOutputStream = dataOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    c0.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        } catch (IOException unused3) {
        } catch (Exception unused4) {
        }
    }

    public final int b(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 16) | (dataInputStream.readByte() & 255) | ((dataInputStream.readByte() & 255) << 8);
    }

    public final int[] b(DataInputStream dataInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iB = b(dataInputStream);
            if (iB == 4548489) {
                int iB2 = b(dataInputStream) | (-16777216);
                int iB3 = b(dataInputStream);
                if (i2 + iB3 > i) {
                    iArr[i2] = iB | (-16777216);
                    iArr[i2 + 1] = iB2;
                    iArr[i2 + 2] = iB3 | (-16777216);
                    i2 += 3;
                } else {
                    for (int i3 = 0; i3 < iB3; i3++) {
                        iArr[i2] = iB2;
                        i2++;
                    }
                }
            } else {
                iArr[i2] = iB | (-16777216);
                i2++;
            }
        }
        HwLog.i("WatchFaceBitmapUtil", "read24BitPixels length : " + i);
        return iArr;
    }

    public final void c(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
        dataOutputStream.writeByte((i >> 16) & 255);
    }

    public final int c(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 24) | (dataInputStream.readByte() & 255) | ((dataInputStream.readByte() & 255) << 8) | ((dataInputStream.readByte() & 255) << 16);
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (i == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = (width * i2) + i3;
                int i5 = iArr[i4];
                int i6 = (((((16711680 & i5) >> 16) * 76) + (((65280 & i5) >> 8) * 150)) + ((i5 & 255) * 30)) >> 8;
                iArr[i4] = (i5 & (-16777216)) | (i6 << 16) | (i6 << 8) | i6;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        new Canvas(bitmapCreateBitmap).drawColor(i, PorterDuff.Mode.MULTIPLY);
        return bitmapCreateBitmap;
    }

    public boolean a(String str, String str2, String str3, int i, int i2, int i3) throws Throwable {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        DataOutputStream dataOutputStream3;
        if (TextUtils.isEmpty(str)) {
            HwLog.i("WatchFaceBitmapUtil", "createBinFile Failed, foregroundBitmapPath fileInputStream null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            HwLog.i("WatchFaceBitmapUtil", "createBinFile Failed, backgroundBitmapPath fileInputStream null");
            return false;
        }
        if (i2 != 0 && i3 != 0) {
            String strReplace = SafeString.replace(str3, WatchFaceConstant.BIN_SUFFIX, "_fg.bin");
            String strReplace2 = SafeString.replace(str3, WatchFaceConstant.BIN_SUFFIX, "_bg.bin");
            HwLog.i("WatchFaceBitmapUtil", "createBinFile binFileType: " + i);
            DataOutputStream dataOutputStream4 = null;
            try {
                FlavorConfig.safeHwLog("WatchFaceBitmapUtil", "fg path" + str);
                FlavorConfig.safeHwLog("WatchFaceBitmapUtil", "bg path" + str2);
                this.f30609a = getSafeDecodeFile(CommonUtils.filterFilePath(str));
                Bitmap safeDecodeFile = getSafeDecodeFile(CommonUtils.filterFilePath(str2));
                this.f30610b = safeDecodeFile;
                Bitmap bitmap = this.f30609a;
                if (bitmap == null) {
                    HwLog.i("WatchFaceBitmapUtil", "decode source foregroundBitmap file null");
                    c0.a(null);
                    c0.a(null);
                    c0.a(null);
                    return false;
                }
                if (safeDecodeFile == null) {
                    HwLog.i("WatchFaceBitmapUtil", "decode source backgroundBitmap file null");
                    c0.a(null);
                    c0.a(null);
                    c0.a(null);
                    return false;
                }
                int width = bitmap.getWidth();
                int height = this.f30609a.getHeight();
                if (i2 == width && height == i3) {
                    int width2 = this.f30610b.getWidth();
                    int height2 = this.f30610b.getHeight();
                    if (i2 == width2 && height2 == i3) {
                        dataOutputStream3 = new DataOutputStream(new BufferedOutputStream(FileHelper.openOutputStream(new File(CommonUtils.filterFilePath(str3)), false)));
                        try {
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(FileHelper.openOutputStream(new File(CommonUtils.filterFilePath(strReplace)), false)));
                            try {
                                try {
                                    dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(FileHelper.openOutputStream(new File(CommonUtils.filterFilePath(strReplace2)), false)));
                                    try {
                                        int[] iArr = new int[width * height];
                                        this.f30609a.getPixels(iArr, 0, width, 0, 0, width, height);
                                        int[] iArr2 = new int[width2 * height2];
                                        this.f30610b.getPixels(iArr2, 0, width2, 0, 0, width2, height2);
                                        if (2 == i) {
                                            a(dataOutputStream, iArr);
                                            a(dataOutputStream2, iArr2);
                                        } else if (1 == i) {
                                            b(dataOutputStream, iArr);
                                            b(dataOutputStream2, iArr2);
                                        } else {
                                            c(dataOutputStream, iArr);
                                            c(dataOutputStream2, iArr2);
                                        }
                                        int size = dataOutputStream.size();
                                        int size2 = dataOutputStream2.size();
                                        d(dataOutputStream3, size);
                                        d(dataOutputStream3, size2);
                                        HwLog.i("WatchFaceBitmapUtil", "createBinFile binFileType: size of fg is" + size + " size of bg is " + size2);
                                        dataOutputStream3.writeShort(17699);
                                        if (i == 2) {
                                            dataOutputStream3.writeShort(26101);
                                        } else if (i == 1) {
                                            dataOutputStream3.writeShort(34824);
                                        } else {
                                            dataOutputStream3.writeShort(34952);
                                        }
                                        a(dataOutputStream3, width);
                                        a(dataOutputStream3, height);
                                        if (2 == i) {
                                            a(dataOutputStream3, iArr);
                                        } else if (1 == i) {
                                            b(dataOutputStream3, iArr);
                                        } else {
                                            c(dataOutputStream3, iArr);
                                        }
                                        dataOutputStream3.writeShort(17699);
                                        if (i == 2) {
                                            dataOutputStream3.writeShort(26101);
                                        } else if (i == 1) {
                                            dataOutputStream3.writeShort(34824);
                                        } else {
                                            dataOutputStream3.writeShort(34952);
                                        }
                                        a(dataOutputStream3, width2);
                                        a(dataOutputStream3, height2);
                                        if (2 == i) {
                                            a(dataOutputStream3, iArr2);
                                        } else if (1 == i) {
                                            b(dataOutputStream3, iArr2);
                                        } else {
                                            c(dataOutputStream3, iArr2);
                                        }
                                        HwLog.i("WatchFaceBitmapUtil", "createBinFile binFileType: Total count of stream:" + dataOutputStream3.size());
                                        dataOutputStream3.flush();
                                        dataOutputStream.flush();
                                        dataOutputStream2.flush();
                                        c0.a(dataOutputStream3);
                                        c0.a(dataOutputStream);
                                        c0.a(dataOutputStream2);
                                        return true;
                                    } catch (IOException unused) {
                                        dataOutputStream4 = dataOutputStream2;
                                        HwLog.i("WatchFaceBitmapUtil", "createBinFile, dataOutputStream.flush IOException");
                                        c0.a(dataOutputStream3);
                                        c0.a(dataOutputStream);
                                        c0.a(dataOutputStream4);
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        dataOutputStream4 = dataOutputStream3;
                                        c0.a(dataOutputStream4);
                                        c0.a(dataOutputStream);
                                        c0.a(dataOutputStream2);
                                        throw th;
                                    }
                                } catch (IOException unused2) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream4;
                            }
                        } catch (IOException unused3) {
                            dataOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = null;
                            dataOutputStream2 = null;
                        }
                    }
                    HwLog.e("WatchFaceBitmapUtil", "foregroundBitmap with or height is not dial with or height");
                    c0.a(null);
                    c0.a(null);
                    c0.a(null);
                    return false;
                }
                HwLog.e("WatchFaceBitmapUtil", "foregroundBitmap with or height is not dial with or height");
                c0.a(null);
                c0.a(null);
                c0.a(null);
                return false;
            } catch (IOException unused4) {
                dataOutputStream = null;
                dataOutputStream3 = null;
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                dataOutputStream2 = null;
                c0.a(dataOutputStream4);
                c0.a(dataOutputStream);
                c0.a(dataOutputStream2);
                throw th;
            }
        } else {
            HwLog.e("WatchFaceBitmapUtil", "dial width or height is 0");
            return false;
        }
    }

    public final void a(DataOutputStream dataOutputStream, int[] iArr, int i, int i2) throws IOException {
        if (i >= 4) {
            d(dataOutputStream, 591751049);
            d(dataOutputStream, iArr[i2]);
            d(dataOutputStream, i);
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                d(dataOutputStream, iArr[i2]);
            }
        }
    }

    public final void a(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(i & 255);
        dataOutputStream.writeByte((i >> 8) & 255);
    }

    public final void a(DataOutputStream dataOutputStream, int[] iArr) throws IOException {
        int i = 0;
        int i2 = 1;
        while (i < iArr.length) {
            if (i == iArr.length - 1 || iArr[i] != iArr[i + 1]) {
                if (i2 == 1) {
                    b(dataOutputStream, iArr, i2, i);
                    i++;
                } else if (i2 >= 2 && i2 % 2 != 0) {
                    b(dataOutputStream, iArr, i2 - 1, i);
                    i--;
                } else {
                    b(dataOutputStream, iArr, i2, i);
                }
                i2 = 1;
            } else {
                i2++;
            }
            i++;
        }
    }

    public final int a(DataInputStream dataInputStream) throws IOException {
        return ((dataInputStream.readByte() & 255) << 8) | (dataInputStream.readByte() & 255);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00be: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:30:0x00bd */
    public void a(String str, String str2) {
        DataInputStream dataInputStream;
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStreamOpenOutputStream = null;
            try {
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(CommonUtils.filterFilePath(str))));
                    try {
                        int i = dataInputStream.readInt();
                        HwLog.i("WatchFaceBitmapUtil", "createPngFile headerFlag: " + i);
                        if (i != 1159956488 && i != 1159956616 && i != 1159947765) {
                            HwLog.i("WatchFaceBitmapUtil", "createPngFile, bin file header error");
                        } else {
                            int iA = a(dataInputStream);
                            int iA2 = a(dataInputStream);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(a(dataInputStream, i, iA * iA2), iA, iA2, Bitmap.Config.ARGB_8888);
                            StringBuilder sb = new StringBuilder("createPngFile bitmap : ");
                            sb.append(bitmapCreateBitmap != null);
                            HwLog.i("WatchFaceBitmapUtil", sb.toString());
                            if (i == 1159956488 && iA == iA2 && bitmapCreateBitmap != null) {
                                bitmapCreateBitmap = a(bitmapCreateBitmap);
                            }
                            if (bitmapCreateBitmap != null) {
                                File file = new File(CommonUtils.filterFilePath(str2));
                                fileOutputStreamOpenOutputStream = FileHelper.openOutputStream(file, false);
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                                HwLog.i("WatchFaceBitmapUtil", "redrawBitmap png size : " + bitmapCreateBitmap.getByteCount());
                                fileOutputStreamOpenOutputStream.flush();
                                HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
                            }
                        }
                        c0.a(dataInputStream);
                        c0.a(fileOutputStreamOpenOutputStream);
                    } catch (IOException unused) {
                        HwLog.i("WatchFaceBitmapUtil", "createPngFile IOException");
                        c0.a(dataInputStream);
                        c0.a(null);
                    } catch (Exception e) {
                        e = e;
                        HwLog.i("WatchFaceBitmapUtil", "createPngFile Exception:" + HwLog.printException(e));
                        c0.a(dataInputStream);
                        c0.a(null);
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        HwLog.e("WatchFaceBitmapUtil", "createPngFile OutOfMemoryError " + HwLog.printException((Error) e));
                        c0.a(dataInputStream);
                        c0.a(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStreamOpenOutputStream = fileOutputStream;
                    c0.a(fileOutputStreamOpenOutputStream);
                    c0.a(0);
                    throw th;
                }
            } catch (IOException unused2) {
                dataInputStream = null;
            } catch (Exception e3) {
                e = e3;
                dataInputStream = null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                c0.a(fileOutputStreamOpenOutputStream);
                c0.a(0);
                throw th;
            }
        } else {
            HwLog.i("WatchFaceBitmapUtil", "createPngFile Failed, binFilePath fileInputStream null");
        }
    }

    public final int[] a(DataInputStream dataInputStream, int i, int i2) {
        int[] iArr = new int[i2];
        if (i == 1159956488) {
            return b(dataInputStream, i2);
        }
        if (i == 1159947765) {
            return a(dataInputStream, i2);
        }
        return c(dataInputStream, i2);
    }

    public final int[] a(DataInputStream dataInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            try {
                int iC = c(dataInputStream);
                if (iC == 591751049) {
                    int iC2 = c(dataInputStream);
                    int iC3 = c(dataInputStream);
                    for (int i3 = 0; i3 < iC3 * 2; i3++) {
                        iArr[i2] = a(iC2 >> 16);
                        i2++;
                    }
                } else {
                    iArr[i2] = a(iC >> 16);
                    iArr[i2 + 1] = a(iC & 65535);
                    i2 += 2;
                }
            } catch (IOException e) {
                HwLog.i("WatchFaceBitmapUtil", "read16BitPixels IOException: " + HwLog.printException((Exception) e));
                return iArr;
            }
        }
        HwLog.i("WatchFaceBitmapUtil", "read16BitPixels length: " + i);
        return iArr;
    }

    public final Bitmap a(Bitmap bitmap) {
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

    public static Bitmap a(String str, BitmapFactory.Options options) {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            HwLog.e("WatchFaceBitmapUtil", "getSafeDecodeFile Exception " + HwLog.printException(e));
            bitmapDecodeFile = null;
        } catch (OutOfMemoryError e2) {
            HwLog.e("WatchFaceBitmapUtil", "getSafeDecodeFile OutOfMemoryError " + HwLog.printException((Error) e2));
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            options.inJustDecodeBounds = false;
            DisplayMetrics displayMetrics = Environment.getApplicationContext().getResources().getDisplayMetrics();
            options.inSampleSize = a(i, i2, displayMetrics.widthPixels, displayMetrics.heightPixels);
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        }
        HwSfpPolicyManagerHelper.setDefaultCeLabel(str);
        return bitmapDecodeFile;
    }

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        while (true) {
            if (i2 / i5 <= i4 && i / i5 <= i3) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public void a(String str, int i, int i2, int i3) throws IOException {
        float f;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        float f2 = i;
        RectF rectF = new RectF(0.0f, 0.0f, f2, i2);
        if (i == i2) {
            if (i3 > 0) {
                f = i3;
            } else {
                f = f2 / 2.0f;
            }
        } else if (i3 > 0) {
            f = i3;
        } else {
            f = 24.0f;
        }
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str)));
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
