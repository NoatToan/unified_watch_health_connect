package com.xiaomi.onetrack.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13745a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13746b = "gender";
    public static final String c = "birthday";
    public static final String d = "phone";
    public static final String e = "job";
    public static final String f = "hobby";
    public static final String g = "region";
    public static final String h = "province";
    public static final String i = "city";
    private String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f13747k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f13748r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13750b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        public a a(String str) {
            this.f13749a = str;
            return this;
        }

        public a b(String str) {
            this.f13750b = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.d = str;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a f(String str) {
            this.f = str;
            return this;
        }

        public a g(String str) {
            this.g = str;
            return this;
        }

        public a h(String str) {
            this.h = str;
            return this;
        }

        public a i(String str) {
            this.i = str;
            return this;
        }

        public ao a() {
            ao aoVar = new ao();
            aoVar.o = this.f;
            aoVar.n = this.e;
            aoVar.f13748r = this.i;
            aoVar.m = this.d;
            aoVar.q = this.h;
            aoVar.l = this.c;
            aoVar.j = this.f13749a;
            aoVar.p = this.g;
            aoVar.f13747k = this.f13750b;
            return aoVar;
        }
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.j);
            jSONObject.put("gender", this.f13747k);
            jSONObject.put("birthday", this.l);
            jSONObject.put("phone", this.m);
            jSONObject.put("job", this.n);
            jSONObject.put("hobby", this.o);
            jSONObject.put("region", this.p);
            jSONObject.put("province", this.q);
            jSONObject.put("city", this.f13748r);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return j().toString();
    }

    private ao() {
    }

    public String a() {
        return this.j;
    }

    public String b() {
        return this.f13747k;
    }

    public String c() {
        return this.l;
    }

    public String d() {
        return this.m;
    }

    public String e() {
        return this.n;
    }

    public String f() {
        return this.o;
    }

    public String g() {
        return this.p;
    }

    public String h() {
        return this.q;
    }

    public String i() {
        return this.f13748r;
    }
}
