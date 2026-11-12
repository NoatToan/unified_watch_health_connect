package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public static String getCacheDirPath(Context context) {
        if (context == null) {
            return "";
        }
        return ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        if (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_FILE_NAME)) {
            return new ExternalStorageFile(str);
        }
        return new File(str);
    }

    public static File newSafeFile(String str) {
        if (str == null) {
            return null;
        }
        try {
            File fileNewFile = newFile(str);
            return !fileNewFile.exists() ? new File(str) : fileNewFile;
        } catch (RuntimeException unused) {
            Logger.w(TAG, "newFile is runtimeException");
            return new File(str);
        } catch (Throwable unused2) {
            Logger.w(TAG, "newFile is Throwable");
            return new File(str);
        }
    }

    public static String getCanonicalPath(String str) {
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e) {
            Logger.w(TAG, "the canonicalPath has IOException", e);
            return str;
        } catch (SecurityException e2) {
            Logger.w(TAG, "the canonicalPath has securityException", e2);
            return str;
        } catch (Exception e3) {
            Logger.w(TAG, "the canonicalPath has other Exception", e3);
            return str;
        }
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newFileInputStream  file is null");
            throw new FileNotFoundException("file is null");
        }
        if (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_INPUTSTREAM_NAME)) {
            return new ExternalStorageFileInputStream(str);
        }
        return new FileInputStream(str);
    }

    public static FileInputStream newSafeFileInputStream(String str) throws FileNotFoundException {
        try {
            return newFileInputStream(str);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileInputStream is fileNotFoundException");
            return new FileInputStream(str);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileInputStream is runtimeException");
            return new FileInputStream(str);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileInputStream is Throwable");
            return new FileInputStream(str);
        }
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
        if (file == null) {
            Logger.e(TAG, "newFileOutputStream  file is null");
            throw new FileNotFoundException("file is null");
        }
        if (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_OUTPUTSTREAM_NAME)) {
            return new ExternalStorageFileOutputStream(file);
        }
        return new FileOutputStream(file);
    }

    public static FileOutputStream newSafeFileOutputStream(File file) throws FileNotFoundException {
        try {
            return newFileOutputStream(file);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileOutputStream is fileNotFoundException");
            return new FileOutputStream(file);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileOutputStream is runtimeException");
            return new FileOutputStream(file);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileOutputStream is Throwable");
            return new FileOutputStream(file);
        }
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newFileOutputStream  file is null");
            throw new FileNotFoundException("file is null");
        }
        if (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(RANDOM_ACCESS_FILE_NAME)) {
            return new ExternalStorageRandomAccessFile(str, str2);
        }
        return new RandomAccessFile(str, str2);
    }

    public static RandomAccessFile newSafeRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newRandomAccessFile  file is null");
            throw new FileNotFoundException("file is null");
        }
        try {
            return newRandomAccessFile(str, str2);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newRandomAccessFile is fileNotFoundException");
            return new RandomAccessFile(str, str2);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newRandomAccessFile is runtimeException");
            return new RandomAccessFile(str, str2);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newRandomAccessFile is Throwable");
            return new RandomAccessFile(str, str2);
        }
    }

    public static void deleteSecure(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Logger.w(TAG, "deleteSecure exception");
    }

    public static void deleteSecure(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteSecure(newFile(str));
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0077 A[EXC_TOP_SPLITTER, PHI: r2 r10
      0x0077: PHI (r2v3 java.lang.String) = 
      (r2v8 java.lang.String)
      (r2v10 java.lang.String)
      (r2v12 java.lang.String)
      (r2v14 java.lang.String)
      (r2v16 java.lang.String)
      (r2v5 java.lang.String)
     binds: [B:52:0x0075, B:33:0x004b, B:38:0x0056, B:43:0x0061, B:48:0x006c, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r10v19 java.io.FileInputStream) = 
      (r10v14 java.io.FileInputStream)
      (r10v15 java.io.FileInputStream)
      (r10v16 java.io.FileInputStream)
      (r10v17 java.io.FileInputStream)
      (r10v18 java.io.FileInputStream)
      (r10v20 java.io.FileInputStream)
     binds: [B:52:0x0075, B:33:0x004b, B:38:0x0056, B:43:0x0061, B:48:0x006c, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static String getFileHashData(String str, String str2) throws Throwable {
        NoSuchAlgorithmException e;
        FileInputStream fileInputStreamNewSafeFileInputStream;
        IndexOutOfBoundsException e2;
        IllegalArgumentException e3;
        IOException e4;
        FileNotFoundException e5;
        ?? r2 = 0;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        String strByteArrayToHex = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStreamNewSafeFileInputStream = newSafeFileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    long j = 0;
                    while (true) {
                        int i = fileInputStreamNewSafeFileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                        j += (long) i;
                    }
                    strByteArrayToHex = j > 0 ? byteArrayToHex(messageDigest.digest()) : null;
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        try {
                            fileInputStreamNewSafeFileInputStream.close();
                        } catch (IOException unused) {
                            Logger.e(TAG, "Close FileInputStream failed!");
                        }
                    }
                } catch (FileNotFoundException e6) {
                    e5 = e6;
                    Logger.e(TAG, "getFileHashData FileNotFoundException", e5);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        fileInputStreamNewSafeFileInputStream.close();
                    }
                } catch (IOException e7) {
                    e4 = e7;
                    Logger.e(TAG, "getFileHashData IOException", e4);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        fileInputStreamNewSafeFileInputStream.close();
                    }
                } catch (IllegalArgumentException e8) {
                    e3 = e8;
                    Logger.e(TAG, "getFileHashData IllegalArgumentException", e3);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        fileInputStreamNewSafeFileInputStream.close();
                    }
                } catch (IndexOutOfBoundsException e9) {
                    e2 = e9;
                    Logger.e(TAG, "getFileHashData IndexOutOfBoundsException", e2);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        fileInputStreamNewSafeFileInputStream.close();
                    }
                } catch (NoSuchAlgorithmException e10) {
                    e = e10;
                    Logger.e(TAG, "getFileHashData NoSuchAlgorithmException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                        fileInputStreamNewSafeFileInputStream.close();
                    }
                }
            } catch (Throwable th) {
                r2 = str;
                th = th;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused2) {
                        Logger.e(TAG, "Close FileInputStream failed!");
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e11) {
            e5 = e11;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IOException e12) {
            e4 = e12;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IllegalArgumentException e13) {
            e3 = e13;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IndexOutOfBoundsException e14) {
            e2 = e14;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return strByteArrayToHex;
    }

    public static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            cArr[i + 1] = cArr2[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }
}
