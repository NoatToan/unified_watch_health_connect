package com.huawei.appgallery.serviceverifykit.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.biw;
import defpackage.bjc;
import defpackage.bjf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceVerifyKit {

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5254c;
        private int k;
        private Intent m;
        private Context o;
        private String q;
        private String s;
        private ComponentType t;
        private String d = "AppGallery Verification";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5253b = "Huawei CBG Cloud Security Signer";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5252a = "com.huawei.appgallery.fingerprint_signature";
        private String e = "com.huawei.appgallery.sign_certchain";
        private Map<String, String[]> h = new HashMap();
        private Map<String, String> j = new HashMap();
        private Map<String, Integer> i = new HashMap();
        private List<String> g = new ArrayList();
        private List<e> f = new ArrayList();
        private int n = 0;
        private int l = 0;
        private String r = "verify_match_property";

        public enum ComponentType {
            ACTIVITY,
            SERVICE,
            BROADCAST
        }

        public Builder c(Intent intent, ComponentType componentType) {
            if (intent == null) {
                bjf.e.a("ServiceVerifyKit", "error input intent");
            } else {
                this.m = intent;
            }
            if (componentType == null) {
                bjf.e.a("ServiceVerifyKit", "error input type");
                return this;
            }
            this.t = componentType;
            return this;
        }

        public Builder c(List<String> list) {
            if (list.isEmpty()) {
                bjf.e.a("ServiceVerifyKit", "error input preferred package name");
                return this;
            }
            this.g = list;
            return this;
        }

        public Builder a(Context context) {
            this.o = context.getApplicationContext();
            return this;
        }

        public Builder b(String str) {
            if (TextUtils.isEmpty(str)) {
                bjf.e.a("ServiceVerifyKit", "error input signer key");
                return this;
            }
            this.f5252a = str;
            return this;
        }

        public Builder e(String str) {
            if (TextUtils.isEmpty(str)) {
                bjf.e.a("ServiceVerifyKit", "error input chain key");
                return this;
            }
            this.e = str;
            return this;
        }

        public String e() {
            ServiceVerifyKit serviceVerifyKit = new ServiceVerifyKit();
            com.huawei.appgallery.serviceverifykit.c.a aVar = new com.huawei.appgallery.serviceverifykit.c.a(this.o);
            this.j.put(this.f5252a, this.e);
            aVar.c(this.f5254c, this.d, this.f5253b, this.h, this.i, this.k, this.g, this.f, this.l, this.r, this.q, this.m, this.t, this.j, this.s);
            return serviceVerifyKit.a(aVar);
        }

        public Builder d(String str, String str2) {
            this.h.put(str, ServiceVerifyKit.d(this.h.get(str), str2));
            this.i.put(str, Integer.valueOf(this.n));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] d(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return strArr;
            }
        }
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(com.huawei.appgallery.serviceverifykit.c.a aVar) {
        List<biw> listD = aVar.d();
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        return new bjc().a(listD);
    }

    public static class e {
        private String d;
        private String e;

        public String d() {
            return this.e;
        }

        public String a() {
            return this.d;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class PkgVerifyBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f5256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5257c = "AppGallery Verification";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5255a = "Huawei CBG Cloud Security Signer";
        private String d = "com.huawei.appgallery.fingerprint_signature";
        private String e = "com.huawei.appgallery.sign_certchain";
        private final Map<String, String[]> f = new HashMap();

        public PkgVerifyBuilder(Context context) {
            this.f5256b = context;
        }
    }

    private ServiceVerifyKit() {
    }
}
