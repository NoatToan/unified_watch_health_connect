package com.xmlywind.sdk.common.utils;

import com.xmlywind.logger.SigmobLog;
import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes22.dex */
public final class k {
    private static final String a = "k";

    public static String a(String str) {
        if (str != null) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            try {
                byte[] bytes = str.getBytes("UTF-8");
                MessageDigest messageDigest = MessageDigest.getInstance("md5");
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr2 = new char[bArrDigest.length * 2];
                int length = bArrDigest.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    byte b = bArrDigest[i];
                    int i3 = i2 + 1;
                    cArr2[i2] = cArr[(b >>> 4) & 15];
                    cArr2[i3] = cArr[b & 15];
                    i++;
                    i2 = i3 + 1;
                }
                return new String(cArr2);
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
        return null;
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String b(String str) {
        FileInputStream fileInputStream;
        DigestInputStream digestInputStream;
        String strA = null;
        if (str != null) {
            try {
                if (new File(str).exists()) {
                    try {
                        fileInputStream = new FileInputStream(str);
                        try {
                            digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("md5"));
                            try {
                                while (digestInputStream.read(new byte[1024]) > 0) {
                                }
                                strA = a(digestInputStream.getMessageDigest().digest());
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    SigmobLog.e(th.getMessage());
                                }
                                digestInputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    SigmobLog.e(th.getMessage());
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th3) {
                                            SigmobLog.e(th3.getMessage());
                                        }
                                    }
                                    if (digestInputStream != null) {
                                    }
                                    return strA;
                                } finally {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th4) {
                                            SigmobLog.e(th4.getMessage());
                                        }
                                    }
                                    if (digestInputStream != null) {
                                        try {
                                            digestInputStream.close();
                                        } catch (Throwable th5) {
                                            SigmobLog.e(th5.getMessage());
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            digestInputStream = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        fileInputStream = null;
                        digestInputStream = null;
                    }
                }
            } catch (Throwable th8) {
            }
        }
        return strA;
    }
}
