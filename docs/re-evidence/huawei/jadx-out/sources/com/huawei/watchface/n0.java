package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.rsa.RSASign;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.util.HexUtil;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import com.huawei.wisecloud.drmclient.license.HwDrmLicense;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class n0 {

    public static class a {
        public static final Pattern f = Pattern.compile("^[a-z0-9A-Z]+$");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30499c;
        public String d;
        public String e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.e = str;
            this.f30497a = str2;
            this.f30498b = str3;
            this.f30499c = str4;
            this.d = str5;
        }

        public static boolean b(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return f.matcher(str).matches();
        }

        public static boolean c(String str) {
            return "2".equals(str);
        }

        public static boolean d(String str) {
            return "themeV2Cipher".equals(str);
        }

        public String a() {
            return this.f30497a + this.f30499c;
        }

        public static boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TextUtils.isDigitsOnly(str);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30502c;

        public void a(String str) {
            this.f30500a = str;
        }

        public String a() {
            return this.f30502c;
        }
    }

    public static boolean a(File file, ByteArrayOutputStream byteArrayOutputStream) throws Throwable {
        a aVarC = c(file);
        if (aVarC == null) {
            HwLog.e("DrmGcmUtils", "decryptFileByLicenseKey() Not gcm decryption.");
            return false;
        }
        String strA = aVarC.a();
        HwLog.e("DrmGcmUtils", "decryptFileByLicenseKey() productId2：" + strA);
        b bVarD = d(strA);
        if (bVarD != null) {
            return a(file, byteArrayOutputStream, bVarD);
        }
        HwLog.e("DrmGcmUtils", "decryptFileByLicenseKey() info is null in decryptFile.");
        return false;
    }

    public static String b(File file) {
        if (file != null) {
            return b(file.getPath());
        }
        HwLog.e("DrmGcmUtils", "getFileName() file is null");
        return "";
    }

    public static a c(File file) throws Throwable {
        String strA = a(file, 74);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        String strTrim = SafeString.substring(strA, 0, 32).trim();
        HwLog.i("DrmGcmUtils", "parserCipherV2HeaderInfo() --mark--" + strTrim);
        if (!a.d(strTrim)) {
            return null;
        }
        String strTrim2 = SafeString.substring(strA, 64, 66).trim();
        HwLog.i("DrmGcmUtils", "parserCipherV2HeaderInfo() --cipherVersion--" + strTrim2);
        if (!a.c(strTrim2)) {
            return null;
        }
        String strTrim3 = SafeString.substring(strA, 32, 64).trim();
        HwLog.i("DrmGcmUtils", "parserCipherV2HeaderInfo() --hitopId--" + strTrim3);
        if (!a.b(strTrim3)) {
            return null;
        }
        String strTrim4 = SafeString.substring(strA, 66, 70).trim();
        HwLog.i("DrmGcmUtils", "parserCipherV2HeaderInfo() --fileTypeStr--" + strTrim4);
        if (!a.a(strTrim4)) {
            return null;
        }
        String strTrim5 = SafeString.substring(strA, 70).trim();
        HwLog.i("DrmGcmUtils", "parserCipherV2HeaderInfo() --subTypeStr--" + strTrim5);
        return new a(strTrim, strTrim3, strTrim2, strTrim4, strTrim5);
    }

    public static b d(String str) {
        try {
            HwDrmLicense hwDrmLicenseB = k0.b(Environment.getApplicationContext(), str);
            if (hwDrmLicenseB == null) {
                HwLog.e("DrmGcmUtils", "parseInfoDrmLocalLicense() hwDrmLicense is null in GetLocalLicense");
                return null;
            }
            b bVarC = c(new String(hwDrmLicenseB.getSecretInfo(), StandardCharsets.UTF_8));
            if (bVarC == null) {
                HwLog.i("DrmGcmUtils", "parseInfoDrmLocalLicense() info == null ");
                return null;
            }
            bVarC.a(str);
            bVarC.f30502c = o1.a(hwDrmLicenseB.getEncrkey()).toUpperCase(Locale.ENGLISH);
            HwLog.i("DrmGcmUtils", "parseInfoDrmLocalLicense() return info message in parseInfoDrmLocalLicense");
            return bVarC;
        } catch (HwDrmException e) {
            HwLog.e("DrmGcmUtils", "parseInfoDrmLocalLicense() HwDrmException is caught in parseInfoDrmLocalLicense :" + HwLog.printException((Exception) e));
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.e("DrmGcmUtils", "getFileName() file is null");
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf == -1 ? str : SafeString.substring(str, iLastIndexOf + 1);
    }

    public static boolean a(File file, ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        HwLog.i("DrmGcmUtils", "decryptCipherV2() in.");
        File fileA = PversionSdUtils.a(Environment.getApplicationContext().getCacheDir(), "cacheCipherV2");
        if (fileA == null) {
            HwLog.e("DrmGcmUtils", "decryptCipherV2() cacheCipherV2Dir is null");
            return false;
        }
        if (!fileA.exists() && !fileA.mkdirs()) {
            HwLog.e("DrmGcmUtils", "decryptCipherV2() !mkdirs");
            return false;
        }
        byte[] bArr = new byte[1024];
        try {
            a(PversionSdUtils.a(file), 74, bArr, byteArrayOutputStream, HexUtil.hexStr2ByteArray(bVar.a()), HexUtil.hexStr2ByteArray(bVar.f30501b));
            HwLog.i("DrmGcmUtils", "decryptCipherV2() out.size=" + byteArrayOutputStream.size());
        } catch (IOException unused) {
            HwLog.e("DrmGcmUtils", "IOException 1111");
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zVerifySign = RSASign.verifySign(byteArrayOutputStream.toByteArray(), f4.a(str.trim()), (PublicKey) EncryptUtil.getPublicKey("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAlPkfn+ejz+p1Ayo5+Ci4VxCbqPZTmeJRYz4pT0NtLrDsenBCdJ7A5Zzawy9bWkYgIkS4jazt4WKUuX58GU4ebXDEoQaO0vdZWblQMpdV2J09uI/DA4EjLq7PU2VQbEgFsC9wywaU1cTyhcfhx7+" + DensityUtil.c(R.array.GCMKeyMiddle)[0] + Environment.getApplicationContext().getResources().getString(R.string.GCMDecodeKeys)), true);
        StringBuilder sb = new StringBuilder("decryptCipherV2() check file rsa sign : ");
        sb.append(zVerifySign);
        HwLog.i("DrmGcmUtils", sb.toString());
        return zVerifySign;
    }

    public static b c(String str) {
        b bVar = new b();
        try {
            bVar.f30501b = new JSONObject(str).optString("iv");
            HwLog.i("DrmGcmUtils", "getPkgInfo() return info message in getPkgInfo");
            return bVar;
        } catch (JSONException e) {
            HwLog.e("DrmGcmUtils", "getPkgInfo() JSONException is caught in getPkgInfo " + HwLog.printException((Exception) e));
            return null;
        }
    }

    public static void a(InputStream inputStream, int i, byte[] bArr, OutputStream outputStream, byte[] bArr2, byte[] bArr3) throws IOException {
        byte[] bArr4 = new byte[5242896];
        if (inputStream.read(bArr4, 0, i) == -1) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = inputStream.read(bArr4);
            if (i2 == -1) {
                return;
            }
            byte[] bArrDecrypt = AesGcm.decrypt(Arrays.copyOfRange(bArr4, 0, i2), bArr2, bArr3);
            if (!z) {
                System.arraycopy(bArrDecrypt, 0, bArr, 0, bArr.length);
                outputStream.write(bArrDecrypt, bArr.length, bArrDecrypt.length - bArr.length);
                z = true;
            } else {
                outputStream.write(bArrDecrypt, 0, bArrDecrypt.length);
            }
        }
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.e("DrmGcmUtils", "getDecryptWatchFacePath() originPath null");
            return null;
        }
        return a(PversionSdUtils.getFile(str));
    }

    public static byte[] a(File file) throws Throwable {
        if (!file.exists()) {
            HwLog.e("DrmGcmUtils", "getDecryptFile() --encryptFile do not exists");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((int) file.length()) * 2);
        a(file, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] a(MappedByteBuffer mappedByteBuffer, int i, int i2) {
        byte[] bArr = new byte[i2];
        if (mappedByteBuffer != null) {
            mappedByteBuffer.position(i);
            mappedByteBuffer.get(bArr, 0, i2);
            HwLog.i("DrmGcmUtils", "getByteFromMapBuffer() get productIds or hMacSha message from encryptFile in getByteFromMapBuffer");
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[SYNTHETIC] */
    public static String a(File file, int i) throws Throwable {
        FileChannel channel;
        RandomAccessFile randomAccessFileB;
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFileB = PversionSdUtils.b(file, "r");
            if (randomAccessFileB != null) {
                try {
                    channel = randomAccessFileB.getChannel();
                } catch (IOException e) {
                    e = e;
                    channel = null;
                    HwLog.e("DrmGcmUtils", "getFileBeginStr() fail " + b(file) + " exception" + HwLog.printException((Exception) e));
                    if (randomAccessFileB != null) {
                        try {
                            randomAccessFileB.close();
                        } catch (IOException e2) {
                            HwLog.e("DrmGcmUtils", "getFileBeginStr() raf.close " + b(file) + " exception " + HwLog.printException((Exception) e2));
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e3) {
                            HwLog.e("DrmGcmUtils", "getFileBeginStr() fc.close " + b(file) + "exception " + HwLog.printException((Exception) e3));
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    channel = null;
                    randomAccessFile = randomAccessFileB;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            HwLog.e("DrmGcmUtils", "getFileBeginStr() raf.close " + b(file) + " exception " + HwLog.printException((Exception) e4));
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                            throw th;
                        } catch (IOException e5) {
                            HwLog.e("DrmGcmUtils", "getFileBeginStr() fc.close " + b(file) + "exception " + HwLog.printException((Exception) e5));
                            throw th;
                        }
                    }
                    throw th;
                }
            } else {
                channel = null;
            }
            if (channel == null) {
                if (randomAccessFileB != null) {
                    try {
                        randomAccessFileB.close();
                    } catch (IOException e6) {
                        HwLog.e("DrmGcmUtils", "getFileBeginStr() raf.close " + b(file) + " exception " + HwLog.printException((Exception) e6));
                    }
                }
                if (channel == null) {
                    return "";
                }
                try {
                    channel.close();
                    return "";
                } catch (IOException e7) {
                    HwLog.e("DrmGcmUtils", "getFileBeginStr() fc.close " + b(file) + "exception " + HwLog.printException((Exception) e7));
                    return "";
                }
            }
            try {
                try {
                    String str = new String(a(channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load(), 0, i), "UTF-8");
                    if (randomAccessFileB != null) {
                        try {
                            randomAccessFileB.close();
                        } catch (IOException e8) {
                            HwLog.e("DrmGcmUtils", "getFileBeginStr() raf.close " + b(file) + " exception " + HwLog.printException((Exception) e8));
                        }
                    }
                    try {
                        channel.close();
                    } catch (IOException e9) {
                        HwLog.e("DrmGcmUtils", "getFileBeginStr() fc.close " + b(file) + "exception " + HwLog.printException((Exception) e9));
                    }
                    return str;
                } catch (IOException e10) {
                    e = e10;
                    HwLog.e("DrmGcmUtils", "getFileBeginStr() fail " + b(file) + " exception" + HwLog.printException((Exception) e));
                    if (randomAccessFileB != null) {
                        randomAccessFileB.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFileB;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                if (channel != null) {
                    channel.close();
                    throw th;
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            randomAccessFileB = null;
            channel = null;
        } catch (Throwable th3) {
            th = th3;
            channel = null;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            if (channel != null) {
                channel.close();
                throw th;
            }
            throw th;
        }
    }
}
