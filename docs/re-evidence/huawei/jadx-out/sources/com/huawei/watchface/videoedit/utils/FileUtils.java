package com.huawei.watchface.videoedit.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.operation.ble.BleConstants;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.c0;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import com.huawei.watchface.videoedit.sysc.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes20.dex */
public class FileUtils {
    private static final int BYTE_SIZE = 4096;
    public static final String CACHE_FOLDER = "app_video_project";
    private static final String FORMAT = "HwVideoEditor_%d_%02d_%02d_%02d%02d%02d%03d.mp4";
    private static final String FORMAT_PHOTO = "IMG_%d_%02d_%02d_%02d%02d%02d%03d.jpg";
    public static final String SAVE_FOLDER = "Pictures/VideoEditor";
    public static final File SAVE_PATH = new File(Environment.getExternalStorageDirectory(), SAVE_FOLDER);
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    public static boolean checkZipHasFile(String str, String str2) throws Throwable {
        ZipFile zipFile;
        HwLog.i(TAG, "checkZipHasFile() zipFilePath:" + str + ", targetFileName: " + str2);
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        if (enumerationEntries.nextElement().getName().equals(str2)) {
                            HwLog.i(TAG, "checkZipHasFile() has" + str2);
                            c0.a(zipFile);
                            return true;
                        }
                    }
                    c0.a(zipFile);
                    return false;
                } catch (IOException unused) {
                    zipFile2 = zipFile;
                    HwLog.e(TAG, "checkZipHasFile() " + str2 + " is not exist");
                    c0.a(zipFile2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    c0.a(zipFile);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = zipFile2;
        }
    }

    public static Optional<File> copyAssetsResource(Context context, String str) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        InputStream inputStreamOpen;
        RuntimeException e2;
        IOException e3;
        FileNotFoundException e4;
        FileOutputStream fileOutputStream2;
        if (context == null || str == null) {
            HwLog.e(TAG, "context or path is null, can not copy assets resource.");
            return Optional.empty();
        }
        File file = new File(context.getDir(CACHE_FOLDER, 0), str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            DfxGuard.getPolicy().onWriteDisk();
            HwLog.i(TAG, "copyAssetsResource file mkdir:" + parentFile.mkdirs());
        }
        if (!file.exists()) {
            InputStream inputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream3 = null;
            try {
                try {
                    if (str.startsWith("/")) {
                        str = SafeString.substring(str, 1);
                    }
                    inputStreamOpen = context.getAssets().open(str);
                    try {
                        fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            DfxGuard.getPolicy().onWriteDisk();
                            while (true) {
                                int i = inputStreamOpen.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            HwLog.d(TAG, "copy resource success ");
                        } catch (FileNotFoundException e5) {
                            e4 = e5;
                            fileOutputStream3 = fileOutputStream2;
                            HwLog.e("copyAssetsResource:", "FileNotFoundException" + HwLog.printException((Exception) e4));
                            fileOutputStream2 = fileOutputStream3;
                        } catch (IOException e6) {
                            e3 = e6;
                            fileOutputStream3 = fileOutputStream2;
                            HwLog.e("copyAssetsResource:", "IOException" + HwLog.printException((Exception) e3));
                            fileOutputStream2 = fileOutputStream3;
                        } catch (RuntimeException e7) {
                            e2 = e7;
                            fileOutputStream3 = fileOutputStream2;
                            HwLog.e("copyAssetsResource:", "RuntimeException" + HwLog.printException((Exception) e2));
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Exception e8) {
                            e = e8;
                            fileOutputStream3 = fileOutputStream2;
                            HwLog.e(BleConstants.WEIGHT_KEY, "copy Assets resource failed" + HwLog.printException(e));
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamOpen;
                            fileOutputStream = fileOutputStream2;
                            Utils.closeSilently(inputStream);
                            Utils.closeSilently(fileOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e9) {
                        e4 = e9;
                    } catch (IOException e10) {
                        e3 = e10;
                    } catch (RuntimeException e11) {
                        e2 = e11;
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = context;
                    fileOutputStream = null;
                }
            } catch (FileNotFoundException e13) {
                e4 = e13;
                inputStreamOpen = null;
            } catch (IOException e14) {
                e3 = e14;
                inputStreamOpen = null;
            } catch (RuntimeException e15) {
                e2 = e15;
                inputStreamOpen = null;
            } catch (Exception e16) {
                e = e16;
                inputStreamOpen = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            Utils.closeSilently(inputStreamOpen);
            Utils.closeSilently(fileOutputStream2);
        }
        return Optional.ofNullable(file);
    }

    public static String getCacheFilePath() {
        return getCacheFilePath(false);
    }

    public static int getFileSize(String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        int iAvailable = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    iAvailable = fileInputStream.available();
                } catch (IOException e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    HwLog.e(TAG, "getFileSize---IOException: " + HwLog.printException((Exception) e));
                    fileInputStream = fileInputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    c0.a(fileInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            c0.a(fileInputStream);
            return iAvailable;
        } catch (Throwable th3) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th = th3;
            fileInputStream = fileInputStream3;
        }
    }

    public static boolean renameTo(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            FlavorConfig.safeHwLog(TAG, "rename() old file path:" + file.getCanonicalPath() + ",new file path:" + file2.getCanonicalPath());
            return file.renameTo(file2);
        } catch (Exception e) {
            HwLog.e(TAG, "rename() exception" + HwLog.printException(e));
            return false;
        }
    }

    public static String getCacheFilePath(boolean z) {
        String str = z ? FORMAT_PHOTO : FORMAT;
        Calendar calendar = Calendar.getInstance();
        String str2 = String.format(Locale.ROOT, str, Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), Integer.valueOf(calendar.get(14)));
        HwLog.d(TAG, "getCacheFilePath");
        return str2;
    }
}
