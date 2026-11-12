package com.huawei.watchface.mvp.model.crypt;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import com.huawei.watchface.c0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes20.dex */
public final class PversionSdUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f30334a;

    static {
        f30334a = Build.VERSION.SDK_INT >= 28 && CommonUtils.I();
    }

    public static FileInputStream a(String str) {
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (strFilterFilePath != null) {
            return !f30334a ? new FileInputStream(strFilterFilePath) : new ExternalStorageFileInputStream(strFilterFilePath);
        }
        HwLog.e("PversionSdUtils", "filePath is null");
        return null;
    }

    public static RandomAccessFile b(File file, String str) {
        if (file != null && !TextUtils.isEmpty(str)) {
            return !f30334a ? new RandomAccessFile(file, str) : new ExternalStorageRandomAccessFile(file, str);
        }
        HwLog.e("PversionSdUtils", "file or model is null or empty");
        return null;
    }

    public static void copyFile(String str, String str2) {
        FileInputStream fileInputStreamA = null;
        try {
            fileInputStreamA = a(str);
            a(fileInputStreamA, str2);
        } catch (Exception e) {
            HwLog.e("PversionSdUtils", "PversionSdUtilscopyFile fis Exception:" + HwLog.printException(e));
        } finally {
            if (fileInputStreamA != null) {
                try {
                    fileInputStreamA.close();
                } catch (Exception e2) {
                    HwLog.e("PversionSdUtils", "PversionSdUtilscopyFile fis Exception:" + HwLog.printException(e2));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f A[Catch: Exception -> 0x007f, all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x007f, blocks: (B:15:0x0053, B:24:0x006f, B:27:0x007b, B:19:0x005d), top: B:42:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[Catch: Exception -> 0x007f, all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x007f, blocks: (B:15:0x0053, B:24:0x006f, B:27:0x007b, B:19:0x005d), top: B:42:0x0053 }] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00a4: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x00a3 */
    public static void copyFileFromMedia(String str, Uri uri, String str2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        Closeable closeable;
        InputStream inputStreamA;
        FlavorConfig.safeHwLog("PversionSdUtils", "srcFile =" + str + "destFile = " + str2);
        Closeable closeable2 = null;
        inputStream = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        InputStream inputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    inputStreamA = a(str);
                } else {
                    if (uri == null) {
                        HwLog.w("PversionSdUtils", "copyFileFromMedia -- null uri");
                        c0.a(null);
                        c0.a(null);
                        return;
                    }
                    HwLog.i("PversionSdUtils", "copyFileFromMedia -- ParcelFileDescriptor");
                    ContentResolver contentResolver = Environment.getApplicationContext().getContentResolver();
                    if (contentResolver == null) {
                        HwLog.w("PversionSdUtils", "copyFileFromMedia -- null ContentResolver");
                        c0.a(null);
                        c0.a(null);
                        return;
                    }
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    try {
                        inputStreamA = contentResolver.openInputStream(uri);
                        if (inputStreamA == null) {
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                inputStreamA = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            }
                            if (inputStream == null) {
                                HwLog.e("PversionSdUtils", "copyFileFromMedia -- fis is null.Create failed!");
                                c0.a(parcelFileDescriptorOpenFileDescriptor);
                                c0.a(inputStream);
                            } else {
                                a(inputStream, str2);
                                c0.a(parcelFileDescriptorOpenFileDescriptor);
                                c0.a(inputStream);
                            }
                        }
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    } catch (Exception e) {
                        e = e;
                        HwLog.e("PversionSdUtils", "PversionSdUtilscopyFileFromMedia -- copyFile fis Exception:" + HwLog.printException(e));
                    }
                }
                parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptor;
                inputStream = inputStreamA;
                if (inputStream == null) {
                    HwLog.e("PversionSdUtils", "copyFileFromMedia -- fis is null.Create failed!");
                    c0.a(parcelFileDescriptorOpenFileDescriptor);
                    c0.a(inputStream);
                } else {
                    a(inputStream, str2);
                    c0.a(parcelFileDescriptorOpenFileDescriptor);
                    c0.a(inputStream);
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                c0.a(closeable2);
                c0.a(0);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
            c0.a(closeable2);
            c0.a(0);
            throw th;
        }
    }

    public static File getFile(String str) {
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (strFilterFilePath != null) {
            return !f30334a ? new File(strFilterFilePath) : new ExternalStorageFile(strFilterFilePath);
        }
        HwLog.e("PversionSdUtils", "filePath is null");
        return null;
    }

    public static FileInputStream a(File file) {
        if (file == null) {
            HwLog.e("PversionSdUtils", "filePath is null");
            return null;
        }
        if (!f30334a) {
            return new FileInputStream(file);
        }
        return new ExternalStorageFileInputStream(file);
    }

    public static FileOutputStream b(File file) {
        if (file == null) {
            HwLog.e("PversionSdUtils", "file is null");
            return null;
        }
        if (!f30334a) {
            return new FileOutputStream(file);
        }
        return new ExternalStorageFileOutputStream(file);
    }

    public static File a(File file, String str) {
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (strFilterFilePath == null) {
            HwLog.e("PversionSdUtils", "childPath is null");
            return null;
        }
        if (file == null) {
            HwLog.e("PversionSdUtils", "parent is null");
            return null;
        }
        if (!f30334a) {
            return new File(file, strFilterFilePath);
        }
        return new ExternalStorageFile(file, strFilterFilePath);
    }

    public static long a() {
        if (!"mounted".equals(android.os.Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(CommonUtils.c((Context) null).getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            HwLog.e("PversionSdUtils", "getAvailCount Exception");
            return -1L;
        }
    }

    public static void a(InputStream inputStream, String str) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        IOException e;
        OutputStream outputStreamB;
        File file = getFile(str + "_tmp");
        if (file.exists()) {
            HwLog.i("PversionSdUtils", "PversionSdUtilscopyFile:" + file.delete());
        }
        OutputStream outputStream = null;
        try {
            outputStreamB = b(file);
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStreamB);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                        }
                        bufferedOutputStream.flush();
                        File file2 = getFile(str);
                        if (file2.exists()) {
                            HwLog.i("PversionSdUtils", "PversionSdUtilscopyFile:" + file2.delete());
                        }
                        boolean zRenameTo = file.renameTo(file2);
                        HwSfpPolicyManagerHelper.setDefaultCeLabel(file2);
                        HwLog.i("PversionSdUtils", "PversionSdUtilsrename:" + zRenameTo);
                        a(bufferedInputStream, bufferedOutputStream, outputStreamB);
                    } catch (IOException e2) {
                        e = e2;
                        outputStream = outputStreamB;
                        try {
                            HwLog.i("PversionSdUtils", "PversionSdUtilscopyFile Exception:" + file.delete() + HwLog.printException((Exception) e));
                            a(bufferedInputStream, bufferedOutputStream, outputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamB = outputStream;
                            outputStream = bufferedOutputStream;
                            a(bufferedInputStream, outputStream, outputStreamB);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = bufferedOutputStream;
                        a(bufferedInputStream, outputStream, outputStreamB);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    a(bufferedInputStream, outputStream, outputStreamB);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream = null;
                bufferedInputStream = null;
                outputStream = outputStreamB;
                HwLog.i("PversionSdUtils", "PversionSdUtilscopyFile Exception:" + file.delete() + HwLog.printException((Exception) e));
                a(bufferedInputStream, bufferedOutputStream, outputStream);
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
                bufferedInputStream = null;
                outputStream = outputStreamB;
                outputStreamB = outputStream;
                outputStream = bufferedOutputStream;
                a(bufferedInputStream, outputStream, outputStreamB);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            outputStreamB = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
            bufferedInputStream = null;
        }
    }

    public static void a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        try {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        } catch (IOException e) {
            HwLog.e("PversionSdUtils", "closeIO IOException " + HwLog.printException((Exception) e));
        }
    }

    public static boolean a(Context context, String str, String str2, String str3) throws Throwable {
        Bitmap bitmapA = CommonUtils.a(str);
        if (bitmapA == null) {
            HwLog.i("PversionSdUtils", "isSaveImg bitmap == null ");
            return false;
        }
        String latonaBackgroundSavedPath = str3.equals("1") ? LatonaWatchFaceProvider.getInstance(context).getLatonaBackgroundSavedPath() : null;
        WatchFaceBitmapUtil.saveBitmapToFile(bitmapA, Bitmap.CompressFormat.PNG, latonaBackgroundSavedPath, str2);
        bitmapA.recycle();
        if (getFile(latonaBackgroundSavedPath + str2).exists()) {
            HwLog.i("PversionSdUtils", "image save success");
            return true;
        }
        HwLog.i("PversionSdUtils", "image save failed");
        return false;
    }
}
