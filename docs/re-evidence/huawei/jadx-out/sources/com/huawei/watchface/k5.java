package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesCbcKS;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f30273a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f30274b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f30275c;

    static {
        HashSet hashSet = new HashSet();
        f30275c = hashSet;
        try {
            hashSet.add("storagePw");
            hashSet.add("savePw");
            f30273a.put("storagePw", d("storagePw"));
            f30273a.put("savePw", d("savePw"));
        } catch (Exception e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "init Exception:" + HwLog.printException(e));
        }
    }

    public static String a(String str, String str2) {
        String strDecrypt = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrD = d(str2);
                if (!ArrayUtils.a(bArrD)) {
                    strDecrypt = AesCbc.decrypt(str, bArrD);
                    if (!TextUtils.isEmpty(strDecrypt)) {
                        return strDecrypt;
                    }
                }
            }
            return str;
        } catch (RuntimeException e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "decrypt -- RuntimeException:" + HwLog.printException((Exception) e));
            return strDecrypt;
        } catch (Exception e2) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "decrypt -- Exception:" + HwLog.printException(e2));
            return strDecrypt;
        }
    }

    public static String b(String str, String str2) {
        String strDecrypt;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bArrD = d(str2);
        if (ArrayUtils.a(bArrD)) {
            return null;
        }
        try {
            strDecrypt = AesCbc.decrypt(str, bArrD);
        } catch (RuntimeException e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "decrypt -- RuntimeException:" + HwLog.printException((Exception) e));
            strDecrypt = null;
        } catch (Exception e2) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "decrypt -- Exception:" + HwLog.printException(e2));
            strDecrypt = null;
        }
        if (TextUtils.isEmpty(strDecrypt)) {
            return null;
        }
        return strDecrypt;
    }

    public static String c(String str, String str2) {
        String strEncrypt = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            byte[] bArrD = d(str2);
            if (ArrayUtils.a(bArrD)) {
                return "";
            }
            strEncrypt = AesCbc.encrypt(str, bArrD);
            return TextUtils.isEmpty(strEncrypt) ? "" : strEncrypt;
        } catch (Exception e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "encrypt Exception:" + HwLog.printException(e));
            return strEncrypt;
        }
    }

    public static byte[] e(String str) {
        String strA = e4.a(str, "KeyPref", "");
        byte[] bArr = new byte[0];
        if (TextUtils.isEmpty(strA)) {
            byte[] bArrA = a();
            e4.b(str, b(s.a(bArrA)), "KeyPref");
            HwLog.w(com.huawei.hms.network.embedded.x1.f15585a, "generate work key success, keytype is " + str);
            return bArrA;
        }
        try {
            return s.a(a(strA));
        } catch (IllegalArgumentException e) {
            HwLog.i(com.huawei.hms.network.embedded.x1.f15585a, "IllegalArgumentException" + HwLog.printException((Exception) e));
            return bArr;
        }
    }

    public static byte[] d(String str) {
        if (!f30275c.contains(str)) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "KeyAlias is illegal");
            return f30274b;
        }
        return c(str);
    }

    public static byte[] c(String str) {
        byte[] bArr;
        byte[] bArrE = null;
        try {
            if (f30273a.containsKey(str)) {
                bArr = (byte[]) f30273a.get(str);
                try {
                    if (!ArrayUtils.a(bArr)) {
                        return bArr;
                    }
                } catch (Exception e) {
                    e = e;
                    HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "getCommonKey Exception:" + HwLog.printException(e));
                    return bArr;
                }
            }
            bArrE = e(str);
            f30273a.put(str, bArrE);
            return bArrE;
        } catch (Exception e2) {
            e = e2;
            bArr = bArrE;
        }
    }

    public static byte[] a() {
        HwLog.d(com.huawei.hms.network.embedded.x1.f15585a, "genWKey");
        return EncryptUtil.generateSecureRandom(16);
    }

    public static String a(String str) {
        try {
            return AesCbcKS.decrypt("themeRootKey", str);
        } catch (ProviderException e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "用根密钥解密工作密钥发生异常 ：" + HwLog.printException((Exception) e));
            return str;
        } catch (Exception e2) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "用根密钥解密工作密钥发生异常 exception：" + HwLog.printException(e2));
            return str;
        }
    }

    public static String b(String str) {
        try {
            return AesCbcKS.encrypt("themeRootKey", str);
        } catch (ProviderException e) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "encryptWorkKey ProviderException ：" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.e(com.huawei.hms.network.embedded.x1.f15585a, "encryptWorkKey exception：" + HwLog.printException(e2));
            return "";
        }
    }
}
