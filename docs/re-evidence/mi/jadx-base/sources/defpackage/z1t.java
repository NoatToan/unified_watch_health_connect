package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.a1;
import com.amap.api.col.p0003sl.la;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z1t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40793b = p0t.t("SRFZHZUVZT3BOa0ZiemZRQQ");
    public static final String c = p0t.t("FbGJzX3Nkaw");
    public static final String d = p0t.t("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");
    public static final String e = p0t.t("FQU5EU0RLMTA");
    public static final String f = p0t.t("FMTAw");
    public static boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40794a = "";

    public class a implements h0t.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z1t f40795a = new z1t();

        @Override // h0t.d
        public final la a(byte[] bArr, Map<String, String> map) {
            return new a1(bArr, map);
        }

        @Override // h0t.d
        public final Map<String, String> b() {
            return this.f40795a.d();
        }

        @Override // h0t.d
        public final String a() {
            return z1t.e();
        }

        @Override // h0t.d
        public final String b(String str, String str2, String str3, String str4) {
            return this.f40795a.c(str, str2, str3, str4);
        }

        @Override // h0t.d
        public final String a(Context context, String str) {
            return z1t.b(context, str);
        }
    }

    public static h0t.d a() {
        return new a();
    }

    public static String b(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(p0t.t("UY29kZQ")) != 1) {
                return "";
            }
            String strOptString = new JSONObject(jSONObject.optString(p0t.t("FZGF0YQ"))).optString(p0t.t("FYWRpdQ"));
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            a2t.b(strOptString);
            u1t.a(context).c(strOptString);
            return strOptString;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String e() {
        return a2t.a();
    }

    public final String c(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(p0t.t("LdGlk"), str);
            jSONObject.put(p0t.t("FZGl1"), str2);
            jSONObject.put(p0t.t("AZGl1Mg"), str3);
            jSONObject.put(p0t.t("EZGl1Mw"), str4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String strB = d2t.b();
        if (!TextUtils.isEmpty(strB)) {
            String strA = x1t.a(p4t.a((string + "\u0000").getBytes(), strB.getBytes()));
            if (!TextUtils.isEmpty(strA)) {
                try {
                    return p0t.t("Fa2V5PQ") + URLEncoder.encode(x1t.a(b2t.b(strB.getBytes("utf-8"), b2t.a(f())))) + p0t.t("SJmRhdGE9") + URLEncoder.encode(strA);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public final synchronized Map<String, String> d() {
        if (g) {
            return null;
        }
        g = true;
        HashMap map = new HashMap();
        map.put(p0t.t("FZW50"), p0t.t("FMg"));
        StringBuilder sb = new StringBuilder();
        sb.append(p0t.t("SY2hhbm5lbD0"));
        String str = c;
        sb.append(str);
        sb.append(p0t.t("SJmRpdj0"));
        String str2 = e;
        sb.append(str2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str2);
        stringBuffer.append(p0t.t("FQA"));
        stringBuffer.append(d);
        String strD = d2t.d(stringBuffer.toString());
        sb.append(p0t.t("FJnNpZ249"));
        sb.append(strD.toUpperCase(Locale.US));
        sb.append(p0t.t("SJm91dHB1dD1qc29u") + "\u0000");
        map.put(p0t.t("FaW4"), x1t.a(p4t.a(sb.toString().getBytes(), f40793b.getBytes())));
        map.put(p0t.t("Sa2V5dA"), f);
        return map;
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.f40794a)) {
            return this.f40794a;
        }
        String strA = j0t.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA");
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
        this.f40794a = string2;
        return string2;
    }
}
