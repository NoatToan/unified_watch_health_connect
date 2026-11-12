package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes3.dex */
public class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o0 f13475c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13477b;

    private boolean f() {
        return true;
    }

    public void b() {
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        if (c(b(strGenerateSecureRandomStr))) {
            this.f13476a = strGenerateSecureRandomStr;
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f13476a)) {
            this.f13476a = c();
        }
        return this.f13476a;
    }

    private static void g() {
        synchronized (o0.class) {
            if (f13475c == null) {
                f13475c = new o0();
            }
        }
    }

    private String e() {
        if (TextUtils.isEmpty(this.f13477b)) {
            this.f13477b = new x().a();
        }
        return this.f13477b;
    }

    public static o0 d() {
        if (f13475c == null) {
            g();
        }
        return f13475c;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    private String c() {
        String strA = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strA)) {
            return a(strA);
        }
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        c(b(strGenerateSecureRandomStr));
        return strGenerateSecureRandomStr;
    }

    private String b(String str) {
        return f() ? AesGcmKS.encrypt("analytics_keystore", str) : n.b(str, e());
    }

    private String a(String str) {
        String strDecrypt = f() ? AesGcmKS.decrypt("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(strDecrypt)) {
            return strDecrypt;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String strA = n.a(str, e());
        if (!TextUtils.isEmpty(strA)) {
            if (f()) {
                c(b(strA));
                x.c();
            }
            return strA;
        }
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        c(b(strGenerateSecureRandomStr));
        if (f()) {
            x.c();
        }
        return strGenerateSecureRandomStr;
    }
}
