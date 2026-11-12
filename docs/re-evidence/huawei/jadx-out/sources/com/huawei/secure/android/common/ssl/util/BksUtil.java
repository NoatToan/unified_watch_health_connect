package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class BksUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22898a = "BksUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22899b = "com.huawei.hwid";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22900c = "com.huawei.hwid";
    private static final String d = "com.huawei.hms";
    private static final String e = "com.huawei.hwid.tv";
    private static final String g = "files/hmsrootcas.bks";
    private static final String h = "4.0.2.300";
    private static final String i = "aegis";
    private static final String j = "hmsrootcas.bks";
    private static final long k = 604800000;
    private static final String l = "last_update_time";
    private static final String m = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";
    private static final String n = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";
    private static final String o = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";
    private static final String q = "";
    private static final String r = "bks_hash";
    private static final Uri f = Uri.parse("content://com.huawei.hwid");
    private static final String[] p = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    private BksUtil() {
    }

    private static boolean a(int i2) {
        return i2 >= 40002300;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:39:0x00a6 */
    private static void b(Context context) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStreamOpenInputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        InputStream inputStream = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.withAppendedPath(f, g));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = inputStreamOpenInputStream.read(bArr);
                            if (i2 <= -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                            d.b(f22898a, "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                            c.a(inputStreamOpenInputStream);
                            c.a((OutputStream) byteArrayOutputStream);
                            c.a(inputStream);
                            return;
                        }
                        byteArrayOutputStream.flush();
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        try {
                            String strA = f.a(r, "", context);
                            String strB = b(byteArrayOutputStream.toByteArray());
                            if (d(context) && strA.equals(strB)) {
                                d.c(f22898a, "bks not update");
                            } else {
                                d.c(f22898a, "update bks and sp");
                                a(byteArrayInputStream2, context);
                                f.b(r, strB, context);
                            }
                            c.a(inputStreamOpenInputStream);
                            c.a((OutputStream) byteArrayOutputStream);
                            c.a((InputStream) byteArrayInputStream2);
                        } catch (Exception e2) {
                            e = e2;
                            inputStream = byteArrayInputStream2;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStreamOpenInputStream;
                            byteArrayInputStream = byteArrayInputStream2;
                            c.a(inputStream);
                            c.a((OutputStream) byteArrayOutputStream);
                            c.a((InputStream) byteArrayInputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = null;
                    byteArrayOutputStream = null;
                    inputStream = inputStreamOpenInputStream;
                    c.a(inputStream);
                    c.a((OutputStream) byteArrayOutputStream);
                    c.a((InputStream) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpenInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    private static String c(Context context) {
        return a(context) + File.separator + "hmsrootcas.bks";
    }

    private static boolean d(Context context) {
        return new File(a(context) + File.separator + "hmsrootcas.bks").exists();
    }

    public static InputStream getBksFromTss(Context context) {
        synchronized (BksUtil.class) {
            d.c(f22898a, "get bks from tss begin");
            if (context != null) {
                ContextUtil.setContext(context);
            }
            Context contextUtil = ContextUtil.getInstance();
            if (contextUtil == null) {
                d.b(f22898a, "context is null");
                return null;
            }
            if (!b(e.a("com.huawei.hwid")) && !b(e.a("com.huawei.hms"))) {
                d.b(f22898a, "hms version code is too low : " + e.a("com.huawei.hwid"));
                return null;
            }
            if (!c(contextUtil, "com.huawei.hwid") && !b(contextUtil, "com.huawei.hms")) {
                d.b(f22898a, "hms sign error");
                return null;
            }
            b(contextUtil);
            return getFilesBksIS(contextUtil);
        }
    }

    public static InputStream getFilesBksIS(Context context) {
        if (!d(context)) {
            return null;
        }
        d.c(f22898a, "getFilesBksIS ");
        try {
            return new FileInputStream(c(context));
        } catch (FileNotFoundException unused) {
            d.b(f22898a, "FileNotFoundExceptio: ");
            return null;
        }
    }

    private static void a(InputStream inputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String strA = a(context);
        if (!new File(strA).exists()) {
            a(strA);
        }
        File file = new File(strA, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                d.c(f22898a, "write output stream ");
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i2 = inputStream.read(bArr, 0, 2048);
                        if (i2 == -1) {
                            c.a((OutputStream) fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    d.b(f22898a, " IOException");
                    c.a((OutputStream) fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    c.a((OutputStream) fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    private static boolean c(Context context, String str) {
        byte[] bArrA = a(context, str);
        for (String str2 : p) {
            if (str2.equalsIgnoreCase(c(bArrA))) {
                return true;
            }
        }
        return false;
    }

    private static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e2) {
            Log.e(f22898a, "NoSuchAlgorithmException" + e2.getMessage());
            return "";
        }
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            d.e(f22898a, "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            d.a(f22898a, "create directory  success");
            return 0;
        }
        d.b(f22898a, "create directory  failed");
        return -1;
    }

    private static String a(Context context) {
        return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + i;
    }

    private static byte[] a(Context context, String str) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                        if (packageInfo != null && (signingInfo = packageInfo.signingInfo) != null) {
                            if (signingInfo.hasMultipleSigners()) {
                                signingCertificateHistory = packageInfo.signingInfo.getApkContentsSigners();
                            } else {
                                signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
                            }
                            if (signingCertificateHistory != null && signingCertificateHistory.length > 0) {
                                return signingCertificateHistory[0].toByteArray();
                            }
                        }
                    } else {
                        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                        if (packageInfo2 != null && (signatureArr = packageInfo2.signatures) != null && signatureArr.length > 0) {
                            return signatureArr[0].toByteArray();
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f22898a, "PackageManager.NameNotFoundException : " + e2.getMessage());
            } catch (Exception e3) {
                Log.e(f22898a, "get pm exception : " + e3.getMessage());
            }
            return new byte[0];
        }
        Log.e(f22898a, "packageName is null or context is null");
        return new byte[0];
    }

    private static boolean b(String str) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.c(f22898a, "hms version code is : " + str);
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = h.split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i3 = 0;
        while (i3 < iMax) {
            if (i3 < length) {
                try {
                    i2 = Integer.parseInt(strArrSplit[i3]);
                } catch (Exception e2) {
                    d.b(f22898a, " exception : " + e2.getMessage());
                    return i3 >= length2;
                }
            } else {
                i2 = 0;
            }
            int i4 = i3 < length2 ? Integer.parseInt(strArrSplit2[i3]) : 0;
            if (i2 < i4) {
                return false;
            }
            if (i2 > i4) {
                return true;
            }
            i3++;
        }
        return true;
    }

    private static boolean b(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(c(a(context, str)));
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            d.b(f22898a, "inputstraem exception");
            return "";
        }
    }

    private static String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArr) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return "";
    }
}
