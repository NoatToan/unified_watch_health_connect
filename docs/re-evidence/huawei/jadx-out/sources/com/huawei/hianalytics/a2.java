package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.hash.PBKDF2;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static a2 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f11455c;

    public static a2 a() {
        if (f == null) {
            synchronized (a2.class) {
                if (f == null) {
                    f = new a2();
                }
            }
        }
        return f;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f11454b)) {
            synchronized (d) {
                d();
            }
        }
        return this.f11454b;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f11453a)) {
            synchronized (e) {
                e();
            }
        }
        return this.f11453a;
    }

    public final void d() {
        String strDecrypt;
        if (TextUtils.isEmpty(this.f11454b)) {
            String strA = c2.a("Privacy_MY", "PrivacyData");
            if (TextUtils.isEmpty(strA)) {
                strDecrypt = EncryptUtil.generateSecureRandomStr(16);
                HiLog.i("RootKeyManager", "load work key encrypt is gcm ks");
                String strEncrypt = AesGcmKsWrapper.encrypt("analytics_keystore_formal", strDecrypt);
                HiLog.si("RootKeyManager", "refresh local key to the sp");
                c2.a("Privacy_MY", "PrivacyData", strEncrypt);
                c2.b("Privacy_MY", "flashKeyTime", System.currentTimeMillis());
            } else {
                String strDecrypt2 = AesGcmKsWrapper.decrypt("analytics_keystore_formal", strA);
                if (TextUtils.isEmpty(strDecrypt2)) {
                    HiLog.i("RootKeyManager", "decrypt work key first");
                    strDecrypt = AesCbc.decrypt(strA, c());
                    if (TextUtils.isEmpty(strDecrypt)) {
                        strDecrypt = EncryptUtil.generateSecureRandomStr(16);
                        String strA2 = a(strDecrypt);
                        HiLog.si("RootKeyManager", "refresh local key to the sp");
                        c2.a("Privacy_MY", "PrivacyData", strA2);
                        c2.b("Privacy_MY", "flashKeyTime", System.currentTimeMillis());
                        g.a();
                    } else {
                        String strA3 = a(strDecrypt);
                        HiLog.si("RootKeyManager", "refresh local key to the sp");
                        c2.a("Privacy_MY", "PrivacyData", strA3);
                        c2.b("Privacy_MY", "flashKeyTime", System.currentTimeMillis());
                        g.a();
                    }
                } else {
                    strDecrypt = strDecrypt2;
                }
            }
            this.f11454b = strDecrypt;
        }
    }

    public final void e() throws Throwable {
        String strGenerateSecureRandomStr;
        String strGenerateSecureRandomStr2;
        String strGenerateSecureRandomStr3;
        String strGenerateSecureRandomStr4;
        if (TextUtils.isEmpty(this.f11453a)) {
            g gVar = new g();
            long jA = c2.a("Privacy_MY", "assemblyFlash", -1L);
            if (jA != -1 && System.currentTimeMillis() - jA <= 31536000000L) {
                strGenerateSecureRandomStr = gVar.a("aprpap");
                strGenerateSecureRandomStr2 = gVar.a("febdoc");
                strGenerateSecureRandomStr3 = gVar.a("marfil");
                strGenerateSecureRandomStr4 = gVar.a("maywnj");
            } else {
                strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(128);
                gVar.a("aprpap", strGenerateSecureRandomStr);
                strGenerateSecureRandomStr2 = EncryptUtil.generateSecureRandomStr(128);
                gVar.a("febdoc", strGenerateSecureRandomStr2);
                strGenerateSecureRandomStr3 = EncryptUtil.generateSecureRandomStr(128);
                gVar.a("marfil", strGenerateSecureRandomStr3);
                strGenerateSecureRandomStr4 = EncryptUtil.generateSecureRandomStr(128);
                gVar.a("maywnj", strGenerateSecureRandomStr4);
                c2.b("Privacy_MY", "assemblyFlash", System.currentTimeMillis());
            }
            byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(strGenerateSecureRandomStr);
            byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(strGenerateSecureRandomStr2);
            byte[] bArrHexStr2ByteArray3 = HexUtil.hexStr2ByteArray(strGenerateSecureRandomStr3);
            byte[] bArrHexStr2ByteArray4 = HexUtil.hexStr2ByteArray("f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc");
            int length = bArrHexStr2ByteArray.length;
            if (length > bArrHexStr2ByteArray2.length) {
                length = bArrHexStr2ByteArray2.length;
            }
            if (length > bArrHexStr2ByteArray3.length) {
                length = bArrHexStr2ByteArray3.length;
            }
            if (length > bArrHexStr2ByteArray4.length) {
                length = bArrHexStr2ByteArray4.length;
            }
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                cArr[i] = (char) (((bArrHexStr2ByteArray[i] ^ bArrHexStr2ByteArray2[i]) ^ bArrHexStr2ByteArray3[i]) ^ bArrHexStr2ByteArray4[i]);
            }
            this.f11453a = HexUtil.byteArray2HexStr(PBKDF2.pbkdf2(cArr, HexUtil.hexStr2ByteArray(strGenerateSecureRandomStr4), 10000, 128));
        }
    }

    public final String a(String str) {
        HiLog.i("RootKeyManager", "load work key encrypt is gcm ks");
        return AesGcmKsWrapper.encrypt("analytics_keystore_formal", str);
    }
}
