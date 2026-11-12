package com.huawei.updatesdk.sdk.foundation.utils;

import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d {
    public static boolean d(String str) {
        return TextUtils.isEmpty(str) || b(str);
    }

    private static boolean c(String str) {
        return str.contains("%00") || str.contains(".\\.\\") || str.contains("./");
    }

    private static boolean b(String str) {
        return a(str) || c(str);
    }

    private static boolean a(String str) {
        return str.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE) || str.contains("..");
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        return file.delete();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a(FileUtil.TAG, "Closeable exception", e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    public static String a(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        String str3;
        ?? D = d(str);
        ?? r2 = 0;
        try {
            if (D != 0) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    long j = 0;
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                        j += (long) i;
                    }
                    String strA = j > 0 ? b.a(messageDigest.digest()) : null;
                    a(fileInputStream);
                    return strA;
                } catch (FileNotFoundException unused) {
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b(FileUtil.TAG, "getFileHashData FileNotFoundException");
                    a(fileInputStream);
                    return null;
                } catch (IOException e) {
                    e = e;
                    str3 = "getFileHashData IOException";
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a(FileUtil.TAG, str3, e);
                    a(fileInputStream);
                    return null;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    str3 = "getFileHashData IllegalArgumentException";
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a(FileUtil.TAG, str3, e);
                    a(fileInputStream);
                    return null;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    str3 = "getFileHashData IndexOutOfBoundsException";
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a(FileUtil.TAG, str3, e);
                    a(fileInputStream);
                    return null;
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                    str3 = "getFileHashData NoSuchAlgorithmException";
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a(FileUtil.TAG, str3, e);
                    a(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            } catch (IOException e5) {
                e = e5;
                fileInputStream = null;
            } catch (IllegalArgumentException e6) {
                e = e6;
                fileInputStream = null;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                fileInputStream = null;
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) r2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = D;
        }
    }
}
