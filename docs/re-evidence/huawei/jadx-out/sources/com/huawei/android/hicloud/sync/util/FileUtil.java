package com.huawei.android.hicloud.sync.util;

import defpackage.bcw;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FileUtil {
    public static final String TAG = "FileUtil";

    private static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 >>> 4) & 15];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr2);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                bcw.d(TAG, "Closeable exception" + e);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00da: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:61:0x00da */
    public static String getFileHashData(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        strA = null;
        strA = null;
        strA = null;
        strA = null;
        strA = null;
        strA = null;
        String strA = null;
        try {
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(str2);
                    fileInputStream2 = new FileInputStream(str);
                    try {
                        byte[] bArr = new byte[1024];
                        long j = 0;
                        while (true) {
                            int i = fileInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                            j += (long) i;
                        }
                        strA = j > 0 ? a(messageDigest.digest()) : null;
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                            bcw.d(TAG, "Close FileInputStream failed!");
                        }
                    } catch (FileNotFoundException e) {
                        e = e;
                        bcw.d(TAG, "getFileHashData FileNotFoundException" + e);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bcw.d(TAG, "getFileHashData IOException" + e);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        bcw.d(TAG, "getFileHashData IllegalArgumentException" + e);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        bcw.d(TAG, "getFileHashData IndexOutOfBoundsException" + e);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (NoSuchAlgorithmException e5) {
                        e = e5;
                        bcw.d(TAG, "getFileHashData NoSuchAlgorithmException" + e);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    }
                } catch (IOException unused2) {
                    bcw.d(TAG, "Close FileInputStream failed!");
                }
            } catch (FileNotFoundException e6) {
                e = e6;
                fileInputStream2 = null;
            } catch (IOException e7) {
                e = e7;
                fileInputStream2 = null;
            } catch (IllegalArgumentException e8) {
                e = e8;
                fileInputStream2 = null;
            } catch (IndexOutOfBoundsException e9) {
                e = e9;
                fileInputStream2 = null;
            } catch (NoSuchAlgorithmException e10) {
                e = e10;
                fileInputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException unused3) {
                        bcw.d(TAG, "Close FileInputStream failed!");
                    }
                }
                throw th;
            }
            return strA;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream3 = fileInputStream;
        }
    }
}
