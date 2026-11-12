package com.huawei.hms.hatool;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes3.dex */
public class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m1 f13467b = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f13468a = new a();

    public String c() {
        return this.f13468a.f13469a;
    }

    public long b() {
        return this.f13468a.f13471c;
    }

    public void a(String str, String str2) {
        long jB = b();
        String strC = w0.c(str, str2);
        if (strC == null || strC.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jB == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
            String strA = h0.a(strC, strGenerateSecureRandomStr);
            this.f13468a.a(jCurrentTimeMillis);
            this.f13468a.b(strGenerateSecureRandomStr);
            this.f13468a.a(strA);
            return;
        }
        if (System.currentTimeMillis() - jB > 43200000) {
            String strGenerateSecureRandomStr2 = EncryptUtil.generateSecureRandomStr(16);
            String strA2 = h0.a(strC, strGenerateSecureRandomStr2);
            this.f13468a.a(jB);
            this.f13468a.b(strGenerateSecureRandomStr2);
            this.f13468a.a(strA2);
        }
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f13471c = 0;

        void b(String str) {
            m1.this.f13468a.f13469a = str;
        }

        void a(String str) {
            m1.this.f13468a.f13470b = str;
        }

        void a(long j) {
            m1.this.f13468a.f13471c = j;
        }

        a() {
        }
    }

    public String a() {
        return this.f13468a.f13470b;
    }

    public static m1 d() {
        return f13467b;
    }
}
