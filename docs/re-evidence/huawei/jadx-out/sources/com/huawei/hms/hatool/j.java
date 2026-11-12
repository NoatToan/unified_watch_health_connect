package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static j f13441b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13442a;

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String strP = s.c().b().p();
        String strQ = s.c().b().q();
        if (!TextUtils.isEmpty(strP) && !TextUtils.isEmpty(strQ)) {
            return new Pair<>(strP, strQ);
        }
        Pair<String, String> pairE = x0.e(this.f13442a);
        s.c().b().k((String) pairE.first);
        s.c().b().l((String) pairE.second);
        return pairE;
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    static class a extends e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13444b;

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            return (z.k(this.f13443a, this.f13444b) ? 4 : 0) | (z.e(this.f13443a, this.f13444b) ? 2 : 0) | (z.h(this.f13443a, this.f13444b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f13443a, this.f13444b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f13443a, this.f13444b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return SHA.sha256Encrypt(str);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f13443a, this.f13444b);
        }

        public a(String str, String str2) {
            this.f13443a = str;
            this.f13444b = str2;
        }
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f13442a);
    }

    public String b(String str, String str2) {
        return i0.b(this.f13442a, str, str2);
    }

    public void a(Context context) {
        if (this.f13442a == null) {
            this.f13442a = context;
        }
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String strE = q0.e();
        if (TextUtils.isEmpty(strE)) {
            strE = d.a(this.f13442a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(strE)) {
                strE = UUID.randomUUID().toString().replace(Constants.LINK, "");
                d.b(this.f13442a, "global_v2", "uuid", strE);
            }
            q0.h(strE);
        }
        return strE;
    }

    public String a(String str, String str2) {
        return i0.a(this.f13442a, str, str2);
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            if (f13441b == null) {
                f13441b = new j();
            }
            jVar = f13441b;
        }
        return jVar;
    }
}
