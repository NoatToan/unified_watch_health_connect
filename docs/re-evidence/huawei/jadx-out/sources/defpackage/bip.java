package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes23.dex */
public class bip {
    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                bir.a("FileUtils", "close stream exception");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0078: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:49:0x0078 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    public static String d(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        Throwable e;
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream2;
        String str3;
        ?? r1 = 0;
        strC = null;
        strC = null;
        String strC = null;
        r1 = 0;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStream = new FileInputStream(str);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        byte[] bArr = new byte[131072];
                        long j = 0;
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                            j += (long) i;
                        }
                        if (j > 0) {
                            strC = bil.c(messageDigest.digest());
                        }
                    } catch (FileNotFoundException unused) {
                        bir.d("FileUtils", "getFileHashData FileNotFoundException");
                    } catch (IOException e2) {
                        e = e2;
                        str3 = "getFileHashData IOException";
                        bir.d("FileUtils", str3, e);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        str3 = "getFileHashData IllegalArgumentException";
                        bir.d("FileUtils", str3, e);
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        str3 = "getFileHashData IndexOutOfBoundsException";
                        bir.d("FileUtils", str3, e);
                    } catch (NoSuchAlgorithmException e5) {
                        e = e5;
                        str3 = "getFileHashData NoSuchAlgorithmException";
                        bir.d("FileUtils", str3, e);
                    }
                } catch (FileNotFoundException unused2) {
                    bufferedInputStream = null;
                } catch (IOException e6) {
                    e = e6;
                    bufferedInputStream = null;
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    bufferedInputStream = null;
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    bufferedInputStream = null;
                } catch (NoSuchAlgorithmException e9) {
                    e = e9;
                    bufferedInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    e((Closeable) r1);
                    e(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream = fileInputStream2;
                r1 = str;
                th = th2;
            }
        } catch (FileNotFoundException unused3) {
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (IOException e10) {
            e = e10;
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        e(bufferedInputStream);
        e(fileInputStream);
        return strC;
    }

    public static String e(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        if (i >= 100) {
            i = 100;
        }
        return percentInstance.format(((double) i) / 100.0d);
    }
}
