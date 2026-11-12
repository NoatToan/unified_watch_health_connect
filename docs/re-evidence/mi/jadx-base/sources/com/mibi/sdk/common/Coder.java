package com.mibi.sdk.common;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Base64InputStream;
import android.util.Base64OutputStream;
import com.mibi.sdk.common.utils.MibiLog;
import com.miuipub.internal.hybrid.SignUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class Coder {
    public static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR};
    private static final String[] HEX_DIGITS_UPPERCASE = {"0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, "A", c.f13755a, "C", "D", "E", "F"};
    private static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String TAG = "Coder";

    public static String byteArrayToString(byte[] bArr) {
        return byteArrayToString(bArr, false);
    }

    public static String byteToHexString(byte b2) {
        return byteToHexString(b2, false);
    }

    public static final String decodeAES(String str, String str2) {
        byte[] bArrDecodeBase64Bytes;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (bArrDecodeBase64Bytes = decodeBase64Bytes(str2)) != null && bArrDecodeBase64Bytes.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecodeBase64Bytes, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                byte[] bArrDecodeBase64Bytes2 = decodeBase64Bytes(str);
                if (bArrDecodeBase64Bytes2 == null) {
                    return null;
                }
                return new String(cipher.doFinal(bArrDecodeBase64Bytes2));
            } catch (IllegalArgumentException e) {
                MibiLog.e(TAG, "illegal argument" + e.getMessage());
                if (CommonConstants.isGlobalHost()) {
                    MibiLog.d(TAG, "is global host, maybe the account's region is not cn");
                }
                return null;
            } catch (InvalidAlgorithmParameterException e2) {
                MibiLog.e(TAG, "algorithm param invalid, " + e2.getMessage());
                return null;
            } catch (InvalidKeyException e3) {
                MibiLog.e(TAG, "key invalid, " + e3.getMessage());
                return null;
            } catch (NoSuchAlgorithmException e4) {
                MibiLog.e(TAG, "no such algorithm, " + e4.getMessage());
            } catch (BadPaddingException e5) {
                MibiLog.e(TAG, "bad padding, " + e5.getMessage());
                return null;
            } catch (IllegalBlockSizeException e6) {
                MibiLog.e(TAG, "illegal block size, " + e6.getMessage());
                return null;
            } catch (NoSuchPaddingException e7) {
                MibiLog.e(TAG, "no such padding, " + e7.getMessage());
                return null;
            } catch (Exception e8) {
                MibiLog.e(TAG, e8.getMessage());
                return null;
            }
        }
        return null;
    }

    public static final String decodeBase64(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static final byte[] decodeBase64Bytes(String str) {
        return Base64.decode(str, 0);
    }

    public static final InputStream decodeBase64Stream(InputStream inputStream) {
        return new Base64InputStream(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00d1 A[Catch: Exception -> 0x00cd, TryCatch #1 {Exception -> 0x00cd, blocks: (B:64:0x00c9, B:68:0x00d1, B:70:0x00d6), top: B:87:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6 A[Catch: Exception -> 0x00cd, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cd, blocks: (B:64:0x00c9, B:68:0x00d1, B:70:0x00d6), top: B:87:0x00c9 }] */
    public static boolean decodeFileAES(String str, String str2, String str3) throws Throwable {
        byte[] bArrDecodeBase64Bytes;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (bArrDecodeBase64Bytes = decodeBase64Bytes(str3)) == null || bArrDecodeBase64Bytes.length != 16) {
            return false;
        }
        CipherOutputStream cipherOutputStream = null;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file.isFile()) {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file2.createNewFile();
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        try {
                            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecodeBase64Bytes, "AES");
                            IvParameterSpec ivParameterSpec = new IvParameterSpec("0102030405060708".getBytes());
                            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                            cipher.init(2, secretKeySpec, ivParameterSpec);
                            CipherOutputStream cipherOutputStream2 = new CipherOutputStream(fileOutputStream, cipher);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = fileInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    cipherOutputStream2.write(bArr, 0, i);
                                    cipherOutputStream2.flush();
                                }
                                cipherOutputStream = cipherOutputStream2;
                            } catch (Exception e) {
                                cipherOutputStream = cipherOutputStream2;
                                e = e;
                                e.printStackTrace();
                                if (cipherOutputStream != null) {
                                    try {
                                        cipherOutputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        return false;
                                    }
                                } else {
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                }
                                return false;
                            } catch (Throwable th) {
                                cipherOutputStream = cipherOutputStream2;
                                th = th;
                                if (cipherOutputStream != null) {
                                    try {
                                        cipherOutputStream.close();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                        return false;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                fileInputStream = null;
                fileOutputStream = null;
            }
            if (cipherOutputStream != null) {
                try {
                    cipherOutputStream.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return false;
                }
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (fileInputStream == null) {
                return true;
            }
            fileInputStream.close();
            return true;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream = null;
        }
    }

    public static String encodeAES(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            MibiLog.d(TAG, "data or key/iv invalid");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, getSecretKeySpec(str2), getIvParameterSpec(str3));
            return encodeBase64(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            MibiLog.d(TAG, "encodeAes failed : " + e.getMessage(), e);
            return null;
        }
    }

    public static final String encodeBase64(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    public static final byte[] encodeBase64Bytes(String str) {
        return Base64.encode(str.getBytes(), 2);
    }

    public static final OutputStream encodeBase64Stream(OutputStream outputStream) {
        return new Base64OutputStream(outputStream, 2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x010e A[Catch: Exception -> 0x0117, TryCatch #20 {Exception -> 0x0117, blocks: (B:101:0x0109, B:103:0x010e, B:105:0x0113), top: B:156:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0113 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #20 {Exception -> 0x0117, blocks: (B:101:0x0109, B:103:0x010e, B:105:0x0113), top: B:156:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0122 A[Catch: Exception -> 0x012b, TryCatch #3 {Exception -> 0x012b, blocks: (B:109:0x011d, B:111:0x0122, B:113:0x0127), top: B:149:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0127 A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #3 {Exception -> 0x012b, blocks: (B:109:0x011d, B:111:0x0122, B:113:0x0127), top: B:149:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0136 A[Catch: Exception -> 0x013f, TryCatch #24 {Exception -> 0x013f, blocks: (B:117:0x0131, B:119:0x0136, B:121:0x013b), top: B:160:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x013b A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #24 {Exception -> 0x013f, blocks: (B:117:0x0131, B:119:0x0136, B:121:0x013b), top: B:160:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x014a A[Catch: Exception -> 0x0153, TryCatch #23 {Exception -> 0x0153, blocks: (B:125:0x0145, B:127:0x014a, B:129:0x014f), top: B:158:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x014f A[Catch: Exception -> 0x0153, TRY_LEAVE, TryCatch #23 {Exception -> 0x0153, blocks: (B:125:0x0145, B:127:0x014a, B:129:0x014f), top: B:158:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3 A[Catch: Exception -> 0x00ec, TryCatch #1 {Exception -> 0x00ec, blocks: (B:83:0x00de, B:85:0x00e3, B:87:0x00e8), top: B:147:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8 A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ec, blocks: (B:83:0x00de, B:85:0x00e3, B:87:0x00e8), top: B:147:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa A[Catch: Exception -> 0x0103, TryCatch #34 {Exception -> 0x0103, blocks: (B:93:0x00f5, B:95:0x00fa, B:97:0x00ff), top: B:162:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ff A[Catch: Exception -> 0x0103, TRY_LEAVE, TryCatch #34 {Exception -> 0x0103, blocks: (B:93:0x00f5, B:95:0x00fa, B:97:0x00ff), top: B:162:0x00f5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v11, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v12, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v13, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v14, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r6v9, types: [javax.crypto.CipherInputStream] */
    public static boolean encodeFileAES(String str, String str2, String str3) throws Throwable {
        byte[] bArrDecodeBase64Bytes;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (bArrDecodeBase64Bytes = decodeBase64Bytes(str3)) == null || bArrDecodeBase64Bytes.length != 16) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecodeBase64Bytes, "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream2 = new FileInputStream((String) str);
                try {
                    str = new FileOutputStream((String) str2);
                    try {
                        str2 = new CipherInputStream(fileInputStream2, cipher);
                        while (true) {
                            try {
                                int i = str2.read(bArr);
                                if (i == -1) {
                                    str.flush();
                                    try {
                                        fileInputStream2.close();
                                        str.close();
                                        str2.close();
                                        return true;
                                    } catch (Exception unused) {
                                        return false;
                                    }
                                }
                                str.write(bArr, 0, i);
                                str.flush();
                            } catch (FileNotFoundException e) {
                                e = e;
                                fileInputStream = fileInputStream2;
                                r15 = str;
                                r16 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r15 != 0) {
                                            r15.close();
                                        }
                                        if (r16 != 0) {
                                            r16.close();
                                        }
                                    } catch (Exception unused2) {
                                        return false;
                                    }
                                } else {
                                    if (r15 != 0) {
                                        r15.close();
                                    }
                                    if (r16 != 0) {
                                        r16.close();
                                    }
                                }
                                return false;
                            } catch (IOException e2) {
                                e = e2;
                                fileInputStream = fileInputStream2;
                                r13 = str;
                                r14 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r13 != 0) {
                                            r13.close();
                                        }
                                        if (r14 != 0) {
                                            r14.close();
                                        }
                                    } catch (Exception unused3) {
                                        return false;
                                    }
                                } else {
                                    if (r13 != 0) {
                                        r13.close();
                                    }
                                    if (r14 != 0) {
                                        r14.close();
                                    }
                                }
                                return false;
                            } catch (InvalidAlgorithmParameterException e3) {
                                e = e3;
                                fileInputStream = fileInputStream2;
                                r11 = str;
                                r12 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r11 != 0) {
                                            r11.close();
                                        }
                                        if (r12 != 0) {
                                            r12.close();
                                        }
                                    } catch (Exception unused4) {
                                        return false;
                                    }
                                } else {
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                }
                                return false;
                            } catch (InvalidKeyException e4) {
                                e = e4;
                                fileInputStream = fileInputStream2;
                                r9 = str;
                                r10 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r9 != 0) {
                                            r9.close();
                                        }
                                        if (r10 != 0) {
                                            r10.close();
                                        }
                                    } catch (Exception unused5) {
                                        return false;
                                    }
                                } else {
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                }
                                return false;
                            } catch (NoSuchAlgorithmException e5) {
                                e = e5;
                                fileInputStream = fileInputStream2;
                                r7 = str;
                                r8 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        if (r8 != 0) {
                                            r8.close();
                                        }
                                    } catch (Exception unused6) {
                                        return false;
                                    }
                                } else {
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                }
                                return false;
                            } catch (NoSuchPaddingException e6) {
                                e = e6;
                                fileInputStream = fileInputStream2;
                                r5 = str;
                                r6 = str2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (r5 != 0) {
                                            r5.close();
                                        }
                                        if (r6 != 0) {
                                            r6.close();
                                        }
                                    } catch (Exception unused7) {
                                        return false;
                                    }
                                } else {
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    if (r6 != 0) {
                                        r6.close();
                                    }
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception unused8) {
                                        return false;
                                    }
                                }
                                if (str != 0) {
                                    str.close();
                                }
                                if (str2 != 0) {
                                    str2.close();
                                }
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        str2 = 0;
                    } catch (IOException e8) {
                        e = e8;
                        str2 = 0;
                    } catch (InvalidAlgorithmParameterException e9) {
                        e = e9;
                        str2 = 0;
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        str2 = 0;
                    } catch (NoSuchAlgorithmException e11) {
                        e = e11;
                        str2 = 0;
                    } catch (NoSuchPaddingException e12) {
                        e = e12;
                        str2 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = 0;
                    }
                } catch (FileNotFoundException e13) {
                    e = e13;
                    str = 0;
                    str2 = 0;
                } catch (IOException e14) {
                    e = e14;
                    str = 0;
                    str2 = 0;
                } catch (InvalidAlgorithmParameterException e15) {
                    e = e15;
                    str = 0;
                    str2 = 0;
                } catch (InvalidKeyException e16) {
                    e = e16;
                    str = 0;
                    str2 = 0;
                } catch (NoSuchAlgorithmException e17) {
                    e = e17;
                    str = 0;
                    str2 = 0;
                } catch (NoSuchPaddingException e18) {
                    e = e18;
                    str = 0;
                    str2 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    str = 0;
                    str2 = 0;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e19) {
            e = e19;
            r15 = 0;
            r16 = 0;
        } catch (IOException e20) {
            e = e20;
            r13 = 0;
            r14 = 0;
        } catch (InvalidAlgorithmParameterException e21) {
            e = e21;
            r11 = 0;
            r12 = 0;
        } catch (InvalidKeyException e22) {
            e = e22;
            r9 = 0;
            r10 = 0;
        } catch (NoSuchAlgorithmException e23) {
            e = e23;
            r7 = 0;
            r8 = 0;
        } catch (NoSuchPaddingException e24) {
            e = e24;
            r5 = 0;
            r6 = 0;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
            str2 = 0;
        }
    }

    public static final String encodeMD5(String str) {
        byte[] bArrEncodeMD5Bytes = encodeMD5Bytes(str);
        if (bArrEncodeMD5Bytes != null) {
            return byteArrayToString(bArrEncodeMD5Bytes);
        }
        return null;
    }

    public static final byte[] encodeMD5Bytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_MD5);
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final String encodeSHA(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_SHA);
            messageDigest.update(str.getBytes());
            return byteArrayToString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final byte[] encodeSHABytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_SHA);
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String encryptRSA(String str, String str2) {
        PublicKey rSAPubKey;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (rSAPubKey = getRSAPubKey(str)) == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPubKey);
            return encodeBase64(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            MibiLog.d(TAG, "encrypt rsa failed : " + e.getMessage(), e);
            return null;
        }
    }

    public static String generateAESRandom() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[Cipher.getInstance("AES/CBC/PKCS5Padding").getBlockSize()];
            secureRandom.nextBytes(bArr);
            return encodeBase64(bArr);
        } catch (Exception e) {
            MibiLog.d(TAG, "generate random aes key/iv failed : " + e.getMessage(), e);
            return null;
        }
    }

    private static IvParameterSpec getIvParameterSpec(String str) {
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        if (bArrDecodeBase64Bytes == null || bArrDecodeBase64Bytes.length != 16) {
            return null;
        }
        return new IvParameterSpec(bArrDecodeBase64Bytes);
    }

    private static PublicKey getRSAPubKey(String str) {
        try {
            return KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(decodeBase64Bytes(str)));
        } catch (Exception e) {
            MibiLog.d(TAG, "get rsa pubKey failed : " + e.getMessage(), e);
            return null;
        }
    }

    private static SecretKeySpec getSecretKeySpec(String str) {
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        if (bArrDecodeBase64Bytes == null || bArrDecodeBase64Bytes.length != 16) {
            return null;
        }
        return new SecretKeySpec(bArrDecodeBase64Bytes, "AES");
    }

    public static String byteArrayToString(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(byteToHexString(b2, z));
        }
        return stringBuffer.toString();
    }

    public static String byteToHexString(byte b2, boolean z) {
        int i = b2;
        if (b2 < 0) {
            i = b2 + 256;
        }
        int i2 = i / 16;
        int i3 = i % 16;
        if (z) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = HEX_DIGITS_UPPERCASE;
            sb.append(strArr[i2]);
            sb.append(strArr[i3]);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        String[] strArr2 = HEX_DIGITS;
        sb2.append(strArr2[i2]);
        sb2.append(strArr2[i3]);
        return sb2.toString();
    }

    public static final String encodeBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static final String encodeMD5(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_MD5);
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i > 0) {
                                messageDigest.update(bArr, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        fileInputStream.close();
                        return byteArrayToString(messageDigest.digest());
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return null;
                    }
                } catch (NoSuchAlgorithmException e4) {
                    e4.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return null;
                }
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    public static final String encodeAES(String str, String str2) {
        byte[] bArrDecodeBase64Bytes;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (bArrDecodeBase64Bytes = decodeBase64Bytes(str2)) != null && bArrDecodeBase64Bytes.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecodeBase64Bytes, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                return encodeBase64(cipher.doFinal(str.getBytes()));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }
}
