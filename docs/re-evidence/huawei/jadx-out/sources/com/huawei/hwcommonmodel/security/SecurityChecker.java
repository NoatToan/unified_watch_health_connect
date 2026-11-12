package com.huawei.hwcommonmodel.security;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import defpackage.llu;
import health.compact.a.LogUtil;
import health.compact.a.Sha256;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public class SecurityChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LogHelper f17220a = new LogHelper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f17221c;
    private static volatile Boolean d;
    private static final byte[] e;

    private static native String nativeGetSignature(Context context);

    private static native void nativeSetLogHelper(Object obj);

    static class LogHelper {
        private LogHelper() {
        }

        public void log(String str) {
            ReleaseLogUtil.d("R_SecurityChecker", str);
        }
    }

    static {
        f17221c = false;
        try {
            System.loadLibrary("apkSignatureCpp");
            nativeSetLogHelper(f17220a);
            f17221c = true;
        } catch (Throwable th) {
            ReleaseLogUtil.a("R_SecurityChecker", "apkSignatureCpp so not found or load failed: " + ExceptionUtils.c(th));
        }
        e = new byte[]{65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};
    }

    public static boolean e() {
        if (d != null) {
            return d.booleanValue();
        }
        if (c(BaseApplication.b().getPackageResourcePath())) {
            ReleaseLogUtil.e("R_SecurityChecker", "apkPath is error");
            d = true;
            return true;
        }
        String strA = a(d(BaseApplication.b()));
        if (strA != null && (!strA.startsWith("B92825C2BD") || !strA.endsWith("F4D3F00F05"))) {
            ReleaseLogUtil.e("R_SecurityChecker", "wrong App: java");
            d = true;
            return true;
        }
        if (f17221c) {
            String strNativeGetSignature = nativeGetSignature(BaseApplication.b());
            if (!StringUtils.g(strNativeGetSignature)) {
                strNativeGetSignature = strNativeGetSignature.toUpperCase(Locale.ROOT);
            }
            if (!StringUtils.g(strNativeGetSignature) && (!strNativeGetSignature.startsWith("B92825C2BD") || !strNativeGetSignature.endsWith("F4D3F00F05"))) {
                ReleaseLogUtil.e("R_SecurityChecker", "wrong App: native");
                d = true;
                return true;
            }
        } else {
            ReleaseLogUtil.e("R_SecurityChecker", "native library not loaded, skip native signature check");
        }
        ReleaseLogUtil.d("R_SecurityChecker", "app correct");
        d = false;
        return false;
    }

    private static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("cache/lspatch") || str.contains("cache/npatch") || str.contains("lsposed") || str.contains("xposed") || str.contains("edxposed");
    }

    private static String d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String strD = d();
            return !c(strD) ? strD : context.getApplicationInfo().sourceDir;
        } catch (Exception e2) {
            LogUtil.d("SecurityChecker", "Failed to get APK: " + e2.getMessage());
            return null;
        }
    }

    private static String d() {
        int iIndexOf;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            try {
                ArrayList<String> arrayList = new ArrayList();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.contains("base.apk") && (iIndexOf = line.indexOf("/")) > 0) {
                        String strTrim = line.substring(iIndexOf).trim();
                        int iIndexOf2 = strTrim.indexOf("base.apk") + 8;
                        if (iIndexOf2 > 0) {
                            String strSubstring = strTrim.substring(0, iIndexOf2);
                            if (strSubstring.contains(BaseApplication.d()) && !arrayList.contains(strSubstring)) {
                                arrayList.add(strSubstring);
                            }
                        }
                    }
                    LogUtil.d("SecurityChecker", "Failed to read ", e.getMessage());
                    return null;
                }
                for (String str : arrayList) {
                    if (!c(str) && new File(str).exists()) {
                        bufferedReader.close();
                        return str;
                    }
                }
                if (arrayList.isEmpty()) {
                    bufferedReader.close();
                    return null;
                }
                String str2 = (String) arrayList.get(0);
                bufferedReader.close();
                return str2;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            LogUtil.d("SecurityChecker", "Failed to read ", e2.getMessage());
            return null;
        }
        LogUtil.d("SecurityChecker", "Failed to read ", e2.getMessage());
        return null;
    }

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            LogUtil.d("SecurityChecker", "APK is null or empty");
            return null;
        }
        if (!new File(str).exists()) {
            return null;
        }
        String strB = b(str);
        String strD = d(str);
        if (strD != null && !strD.isEmpty()) {
            return strD;
        }
        if (strB == null || strB.isEmpty()) {
            return null;
        }
        return strB;
    }

    private static String b(String str) {
        byte[] bArr;
        byte[] bArrC;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (true) {
                    if (!enumerationEntries.hasMoreElements()) {
                        bArr = null;
                        break;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        try {
                            bArr = new byte[(int) zipEntryNextElement.getSize()];
                            inputStream.read(bArr);
                            if (inputStream == null) {
                                break;
                            }
                            inputStream.close();
                            break;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (bArr != null && (bArrC = c(bArr)) != null) {
                    String strA = llu.a(Sha256.c(bArrC), true);
                    zipFile.close();
                    return strA;
                }
                zipFile.close();
                return null;
            } catch (Throwable th3) {
                try {
                    zipFile.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e2) {
            LogUtil.d("SecurityChecker", "Error parsing ", e2);
            return null;
        }
    }

    private static byte[] c(byte[] bArr) {
        int i;
        try {
            try {
                List<? extends Certificate> certificates = CertificateFactory.getInstance("X.509").generateCertPath(new ByteArrayInputStream(bArr), "PKCS7").getCertificates();
                if (!certificates.isEmpty()) {
                    return ((X509Certificate) certificates.get(0)).getEncoded();
                }
            } catch (Exception e2) {
                LogUtil.b("SecurityChecker", "cert parse failed: " + e2.getMessage());
            }
            for (int i2 = 0; i2 < bArr.length - 10; i2++) {
                if (bArr[i2] == 48 && bArr[i2 + 1] == 130 && (i = (((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255)) + 4) >= 500 && i <= 3000 && i2 + i <= bArr.length) {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, i2, bArr2, 0, i);
                    return bArr2;
                }
            }
            return null;
        } catch (Exception e3) {
            LogUtil.d("SecurityChecker", "Error extracting cert ", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:4:0x000b, B:6:0x0017, B:7:0x0022, B:10:0x0034, B:13:0x004a, B:18:0x005e, B:19:0x0068, B:21:0x0073, B:26:0x0085, B:31:0x0095, B:32:0x009c, B:35:0x00a8, B:36:0x00b2, B:39:0x00b9, B:42:0x00c5), top: B:54:0x000b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:4:0x000b, B:6:0x0017, B:7:0x0022, B:10:0x0034, B:13:0x004a, B:18:0x005e, B:19:0x0068, B:21:0x0073, B:26:0x0085, B:31:0x0095, B:32:0x009c, B:35:0x00a8, B:36:0x00b2, B:39:0x00b9, B:42:0x00c5), top: B:54:0x000b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:4:0x000b, B:6:0x0017, B:7:0x0022, B:10:0x0034, B:13:0x004a, B:18:0x005e, B:19:0x0068, B:21:0x0073, B:26:0x0085, B:31:0x0095, B:32:0x009c, B:35:0x00a8, B:36:0x00b2, B:39:0x00b9, B:42:0x00c5), top: B:54:0x000b, outer: #1 }] */
    private static String d(String str) {
        byte[] bArr;
        byte[] bArrB;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                long jD = d(randomAccessFile);
                if (jD < 0) {
                    LogUtil.d("SecurityChecker", "Failed to find EOCD");
                } else {
                    randomAccessFile.seek(jD + 16);
                    long jB = b(randomAccessFile);
                    if (jB >= 32) {
                        randomAccessFile.seek(jB - 16);
                        byte[] bArr2 = new byte[16];
                        randomAccessFile.readFully(bArr2);
                        if (Arrays.equals(bArr2, e)) {
                            long j = jB - 24;
                            randomAccessFile.seek(j);
                            long jC = c(randomAccessFile);
                            if (jC == 0 || jC > jB) {
                                LogUtil.d("SecurityChecker", "Invalid block size");
                            } else {
                                randomAccessFile.seek((jB - jC) - 8);
                                c(randomAccessFile);
                                while (true) {
                                    if (randomAccessFile.getFilePointer() + 12 <= j) {
                                        long jC2 = c(randomAccessFile);
                                        if (jC2 >= 4 && jC2 <= 2147483647L) {
                                            int iB = (int) b(randomAccessFile);
                                            if (iB != 1896449818 && iB != -262969152) {
                                                randomAccessFile.skipBytes(((int) jC2) - 4);
                                            }
                                            bArr = new byte[((int) jC2) - 4];
                                            randomAccessFile.readFully(bArr);
                                        }
                                        if (bArr == null) {
                                            LogUtil.d("SecurityChecker", "No V2/V3 block found");
                                        } else {
                                            bArrB = b(bArr);
                                            if (bArrB == null) {
                                                String strA = llu.a(Sha256.c(bArrB), true);
                                                randomAccessFile.close();
                                                return strA;
                                            }
                                        }
                                    }
                                    bArr = null;
                                    if (bArr == null) {
                                        LogUtil.d("SecurityChecker", "No V2/V3 block found");
                                    } else {
                                        bArrB = b(bArr);
                                        if (bArrB == null) {
                                            String strA2 = llu.a(Sha256.c(bArrB), true);
                                            randomAccessFile.close();
                                            return strA2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                randomAccessFile.close();
                return null;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            LogUtil.d("SecurityChecker", "Error parsing V2/V3 ", e2);
            return null;
        }
    }

    private static byte[] b(byte[] bArr) {
        int iC;
        int i;
        int iC2;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList<byte[]> arrayList = new ArrayList();
            int iC3 = c(bArr, 0);
            int i2 = 4;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > iC3 + 4 || i2 >= bArr.length - 4 || (iC = c(bArr, i2)) <= 0 || (i = i3 + iC) > bArr.length) {
                    break;
                    break;
                    break;
                    break;
                }
                int iC4 = i2 + 12 + c(bArr, i2 + 8);
                int iC5 = c(bArr, iC4);
                int i4 = iC4 + 4;
                int i5 = i4;
                while (true) {
                    int i6 = i5 + 4;
                    if (i6 > iC5 + i4 || i5 >= bArr.length - 4 || (iC2 = c(bArr, i5)) <= 0 || iC2 > 3000 || i6 + iC2 > bArr.length) {
                        break;
                        break;
                        break;
                        break;
                        break;
                    }
                    byte[] bArr2 = new byte[iC2];
                    System.arraycopy(bArr, i6, bArr2, 0, iC2);
                    arrayList.add(bArr2);
                    i5 += iC2 + 4;
                }
                i2 = i;
            }
            for (byte[] bArr3 : arrayList) {
                try {
                    if (!((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr3))).getSubjectDN().getName().contains("CN=Android Debug")) {
                        return bArr3;
                    }
                } catch (Exception e2) {
                    LogUtil.d("SecurityChecker", "extract cert exception:", e2);
                }
            }
            if (!arrayList.isEmpty()) {
                return (byte[]) arrayList.get(0);
            }
            return a(bArr);
        } catch (Exception e3) {
            LogUtil.d("SecurityChecker", "Error extracting certificate from V2 block", e3);
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        int i;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            for (int i2 = 0; i2 < bArr.length - 10; i2++) {
                if (bArr[i2] == 48 && bArr[i2 + 1] == 130 && (i = (((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255)) + 4) >= 400 && i <= 3000 && i2 + i <= bArr.length) {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, i2, bArr2, 0, i);
                    try {
                        if (!((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr2))).getSubjectDN().getName().contains("CN=Android Debug")) {
                            return bArr2;
                        }
                    } catch (Exception e2) {
                        LogUtil.d("SecurityChecker", "extract cert exception:", e2);
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            LogUtil.d("SecurityChecker", "Error in pattern search", e3);
            return null;
        }
    }

    private static long d(RandomAccessFile randomAccessFile) throws Exception {
        long length = randomAccessFile.length();
        long j = length > 65557 ? length - 65557 : 0L;
        byte[] bArr = new byte[4];
        long j2 = 22;
        while (true) {
            length -= j2;
            if (length < j || length <= 0) {
                return -1L;
            }
            randomAccessFile.seek(length);
            randomAccessFile.readFully(bArr);
            if (bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 5 && bArr[3] == 6) {
                return length;
            }
            j2 = 1;
        }
    }

    private static long b(RandomAccessFile randomAccessFile) throws Exception {
        byte[] bArr = new byte[4];
        randomAccessFile.readFully(bArr);
        return c(bArr, 0);
    }

    private static long c(RandomAccessFile randomAccessFile) throws Exception {
        byte[] bArr = new byte[8];
        randomAccessFile.readFully(bArr);
        return b(bArr, 0);
    }

    private static long b(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static int c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
