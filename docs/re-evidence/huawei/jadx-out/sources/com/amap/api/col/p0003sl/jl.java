package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2896a = iy.c("SRFZHZUVZT3BOa0ZiemZRQQ");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2897b = iy.c("FbGJzX3Nkaw");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f2898c = iy.c("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");
    private static final String d = iy.c("FQU5EU0RLMTA");
    private static final String e = iy.c("FMTAw");
    private static boolean f = false;
    private String g = "";

    public static ip.a a() {
        return new ip.a() { // from class: com.amap.api.col.3sl.jl.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private jl f2899a = new jl();

            @Override // com.amap.api.col.3sl.ip.a
            public final la a(byte[] bArr, Map<String, String> map) {
                return new ks(bArr, map);
            }

            @Override // com.amap.api.col.3sl.ip.a
            public final String a() {
                return jl.c();
            }

            @Override // com.amap.api.col.3sl.ip.a
            public final String a(Context context, String str) {
                return jl.a(context, str);
            }

            @Override // com.amap.api.col.3sl.ip.a
            public final Map<String, String> b() {
                return this.f2899a.b();
            }

            @Override // com.amap.api.col.3sl.ip.a
            public final String a(String str, String str2, String str3, String str4) {
                return this.f2899a.a(str, str2, str3, str4);
            }
        };
    }

    public static String a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(iy.c("UY29kZQ")) == 1) {
                String strOptString = new JSONObject(jSONObject.optString(iy.c("FZGF0YQ"))).optString(iy.c("FYWRpdQ"));
                if (!TextUtils.isEmpty(strOptString)) {
                    jm.a(strOptString);
                    jh.a(context).a(strOptString);
                    return strOptString;
                }
                return "";
            }
            return "";
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final Map<String, String> b() {
        synchronized (this) {
            if (f) {
                return null;
            }
            f = true;
            HashMap map = new HashMap();
            map.put(iy.c("FZW50"), iy.c("FMg"));
            StringBuilder sb = new StringBuilder();
            sb.append(iy.c("SY2hhbm5lbD0"));
            String str = f2897b;
            sb.append(str);
            sb.append(iy.c("SJmRpdj0"));
            String str2 = d;
            sb.append(str2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str).append(str2).append(iy.c("FQA")).append(f2898c);
            String strA = jo.a(stringBuffer.toString());
            sb.append(iy.c("FJnNpZ249"));
            sb.append(strA.toUpperCase(Locale.US));
            sb.append(iy.c("SJm91dHB1dD1qc29u") + "\u0000");
            map.put(iy.c("FaW4"), jj.a(kp.a(sb.toString().getBytes(), f2896a.getBytes())));
            map.put(iy.c("Sa2V5dA"), e);
            return map;
        }
    }

    private String d() {
        if (!TextUtils.isEmpty(this.g)) {
            return this.g;
        }
        String strA = iq.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strA.length(); i++) {
            stringBuffer.append((char) (strA.charAt(i) - (i % 48)));
        }
        String string = stringBuffer.toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i2 = 0; i2 < string.length() / 2; i2++) {
            stringBuffer2.append((char) ((string.charAt(i2) + string.charAt((string.length() - 1) - i2)) / 2));
        }
        String string2 = stringBuffer2.toString();
        this.g = string2;
        return string2;
    }

    public final String a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(iy.c("LdGlk"), str);
            jSONObject.put(iy.c("FZGl1"), str2);
            jSONObject.put(iy.c("AZGl1Mg"), str3);
            jSONObject.put(iy.c("EZGl1Mw"), str4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String strA = jo.a();
        if (!TextUtils.isEmpty(strA)) {
            String strA2 = jj.a(kp.a((string + "\u0000").getBytes(), strA.getBytes()));
            if (!TextUtils.isEmpty(strA2)) {
                try {
                    return iy.c("Fa2V5PQ") + URLEncoder.encode(jj.a(jn.a(strA.getBytes("utf-8"), jn.a(d())))) + iy.c("SJmRhdGE9") + URLEncoder.encode(strA2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static String c() {
        return jm.a();
    }
}
