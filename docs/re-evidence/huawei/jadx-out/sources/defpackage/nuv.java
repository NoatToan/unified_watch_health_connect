package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class nuv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static nuv f43776a;
    private MessageDigest e;

    public nuv() {
        try {
            this.e = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.e("Md5Calculator", "Md5Calculator NoSuchAlgorithmException error");
        }
    }

    private static nuv d() {
        if (f43776a == null) {
            f43776a = new nuv();
        }
        return f43776a;
    }

    public static String e(String str) throws Throwable {
        nuv nuvVarD = d();
        if (str == null) {
            LogUtil.j("Md5Calculator", "calculateMd5 filePath is null");
            return null;
        }
        nuvVarD.d(str);
        byte[] bArrDigest = nuvVarD.e.digest();
        nuvVarD.e.reset();
        return a(bArrDigest, 0, bArrDigest.length);
    }

    public static String c(String str) {
        if (str == null) {
            LogUtil.j("Md5Calculator", "getMd5Value value is null");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArrDigest = messageDigest.digest(str.getBytes("UTF-8"));
            messageDigest.reset();
            return a(bArrDigest, 0, bArrDigest.length);
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("Md5Calculator", "getMd5Value UnsupportedEncodingException error");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("Md5Calculator", "getMd5Value NoSuchAlgorithmException error");
            return null;
        }
    }

    private static String a(byte[] bArr, int i, int i2) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b2 = bArr[i3];
            sb.append(cArr[(b2 >>> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }

    private void d(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i > 0) {
                            this.e.update(bArr, 0, i);
                        } else {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                LogUtil.e("Md5Calculator", "digestMd5 IOException fileInputStream close error");
                                fileInputStream2 = i;
                            }
                        }
                        return;
                    }
                } catch (FileNotFoundException unused2) {
                    fileInputStream3 = fileInputStream;
                    LogUtil.e("Md5Calculator", "digestMd5 FileNotFoundException error");
                    fileInputStream2 = fileInputStream3;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                            fileInputStream2 = fileInputStream3;
                        } catch (IOException unused3) {
                            LogUtil.e("Md5Calculator", "digestMd5 IOException fileInputStream close error");
                            fileInputStream2 = fileInputStream3;
                        }
                    }
                } catch (IOException unused4) {
                    fileInputStream4 = fileInputStream;
                    LogUtil.e("Md5Calculator", "digestMd5 IOException error");
                    fileInputStream2 = fileInputStream4;
                    if (fileInputStream4 != null) {
                        try {
                            fileInputStream4.close();
                            fileInputStream2 = fileInputStream4;
                        } catch (IOException unused5) {
                            LogUtil.e("Md5Calculator", "digestMd5 IOException fileInputStream close error");
                            fileInputStream2 = fileInputStream4;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                            LogUtil.e("Md5Calculator", "digestMd5 IOException fileInputStream close error");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        }
    }
}
