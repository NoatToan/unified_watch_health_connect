package com.xiaomi.onetrack.api;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13757a = "H5DataModel";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13758b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f13759a = "event";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f13760b = "session_id";
        public static String c = "instance_id";
        public static String d = "platform";
        public static String e = "e_ts";
        public static String f = "tz";
        public static String g = "sdk_ver";
        public static String h = "app_id";
        public static String i = "channel";
        public static String j = "uid";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static String f13761k = "uid_type";
    }

    public d(JSONObject jSONObject) {
        this.f13758b = a(jSONObject, a.f13759a);
        try {
            this.c = Long.parseLong(a(jSONObject, a.e));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b(f13757a, "e_ts parse error: " + e.getMessage());
        }
        this.d = a(jSONObject, a.h);
        this.e = a(jSONObject, a.i);
        this.f = a(jSONObject, a.j);
        this.g = a(jSONObject, a.f13761k);
    }

    private String a(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        return objOpt == null ? "" : String.valueOf(objOpt);
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public String toString() {
        return "H5DataModel{eventName='" + this.f13758b + "', e_ts=" + this.c + ", appId='" + this.d + "', channel='" + this.e + "', uid='" + this.f + "', uidType='" + this.g + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public String a() {
        return this.f13758b;
    }
}
