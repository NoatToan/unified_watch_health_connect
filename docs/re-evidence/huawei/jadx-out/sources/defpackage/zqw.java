package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.collection.ArrayMap;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Collections;
import java.util.Map;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class zqw extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f54506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54508c;
    public final int d;
    public final int e;

    public static final class b {
        public static final zqw e = zqw.d(0, "Invalid discovery document");
        public static final zqw j = zqw.d(1, "User cancelled flow");
        public static final zqw h = zqw.d(2, "Flow cancelled programmatically");
        public static final zqw g = zqw.d(3, "Network error");
        public static final zqw i = zqw.d(4, "Server error");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final zqw f54512a = zqw.d(5, "JSON deserialization error");
        public static final zqw f = zqw.d(6, "Token response construction error");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zqw f54514c = zqw.d(7, "Invalid registration response");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zqw f54513b = zqw.d(8, "Unable to parse ID Token");
        public static final zqw d = zqw.d(9, "Invalid ID Token");
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final zqw f54509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zqw f54510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zqw f54511c;
        public static final zqw d;
        public static final zqw e;
        public static final zqw f;
        public static final zqw g;
        public static final zqw h;
        public static final zqw i;
        public static final zqw j;
        private static final Map<String, zqw> k;

        static {
            zqw zqwVarC = zqw.c(1000, "invalid_request");
            f54510b = zqwVarC;
            zqw zqwVarC2 = zqw.c(1001, "unauthorized_client");
            f = zqwVarC2;
            zqw zqwVarC3 = zqw.c(1002, "access_denied");
            e = zqwVarC3;
            zqw zqwVarC4 = zqw.c(1003, "unsupported_response_type");
            g = zqwVarC4;
            zqw zqwVarC5 = zqw.c(1004, "invalid_scope");
            f54509a = zqwVarC5;
            zqw zqwVarC6 = zqw.c(1005, "server_error");
            j = zqwVarC6;
            zqw zqwVarC7 = zqw.c(1006, "temporarily_unavailable");
            h = zqwVarC7;
            zqw zqwVarC8 = zqw.c(1007, null);
            f54511c = zqwVarC8;
            zqw zqwVarC9 = zqw.c(1008, null);
            d = zqwVarC9;
            i = zqw.d(9, "Response state param did not match request state");
            k = zqw.c(zqwVarC, zqwVarC2, zqwVarC3, zqwVarC4, zqwVarC5, zqwVarC6, zqwVarC7, zqwVarC8, zqwVarC9);
        }

        public static zqw c(String str) {
            zqw zqwVar = k.get(str);
            return zqwVar != null ? zqwVar : d;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final zqw f54515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zqw f54516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zqw f54517c;
        public static final zqw d;
        public static final zqw e;
        private static final Map<String, zqw> f;
        public static final zqw h;
        public static final zqw i;
        public static final zqw j;

        static {
            zqw zqwVarG = zqw.g(2000, "invalid_request");
            e = zqwVarG;
            zqw zqwVarG2 = zqw.g(2001, "invalid_client");
            d = zqwVarG2;
            zqw zqwVarG3 = zqw.g(2002, "invalid_grant");
            f54516b = zqwVarG3;
            zqw zqwVarG4 = zqw.g(2003, "unauthorized_client");
            j = zqwVarG4;
            zqw zqwVarG5 = zqw.g(2004, "unsupported_grant_type");
            i = zqwVarG5;
            zqw zqwVarG6 = zqw.g(2005, "invalid_scope");
            f54517c = zqwVarG6;
            zqw zqwVarG7 = zqw.g(2006, null);
            f54515a = zqwVarG7;
            zqw zqwVarG8 = zqw.g(2007, null);
            h = zqwVarG8;
            f = zqw.c(zqwVarG, zqwVarG2, zqwVarG3, zqwVarG4, zqwVarG5, zqwVarG6, zqwVarG7, zqwVarG8);
        }

        public static zqw a(String str) {
            zqw zqwVar = f.get(str);
            return zqwVar != null ? zqwVar : h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zqw d(int i, String str) {
        return new zqw(0, i, null, str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zqw c(int i, String str) {
        return new zqw(1, i, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zqw g(int i, String str) {
        return new zqw(2, i, str, null, null, null);
    }

    public static zqw e(zqw zqwVar, Throwable th) {
        return new zqw(zqwVar.d, zqwVar.e, zqwVar.f54508c, zqwVar.f54507b, zqwVar.f54506a, th);
    }

    public static zqw c(zqw zqwVar, String str, String str2, Uri uri) {
        int i = zqwVar.d;
        int i2 = zqwVar.e;
        if (str == null) {
            str = zqwVar.f54508c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = zqwVar.f54507b;
        }
        String str4 = str2;
        if (uri == null) {
            uri = zqwVar.f54506a;
        }
        return new zqw(i, i2, str3, str4, uri, null);
    }

    public static zqw d(Uri uri) {
        String queryParameter = uri.getQueryParameter(VastAttribute.ERROR);
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        zqw zqwVarC = a.c(queryParameter);
        int i = zqwVarC.d;
        int i2 = zqwVarC.e;
        if (queryParameter2 == null) {
            queryParameter2 = zqwVarC.f54507b;
        }
        return new zqw(i, i2, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : zqwVarC.f54506a, null);
    }

    public static zqw d(String str) throws JSONException {
        zre.c(str, (Object) "jsonStr cannot be null or empty");
        return c(new JSONObject(str));
    }

    public static zqw c(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json cannot be null");
        return new zqw(jSONObject.getInt("type"), jSONObject.getInt("code"), JsonUtil.c(jSONObject, VastAttribute.ERROR), JsonUtil.c(jSONObject, "errorDescription"), JsonUtil.f(jSONObject, "errorUri"), null);
    }

    public static zqw e(Intent intent) {
        zre.c(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return d(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, zqw> c(zqw... zqwVarArr) {
        ArrayMap arrayMap = new ArrayMap(zqwVarArr != null ? zqwVarArr.length : 0);
        if (zqwVarArr != null) {
            for (zqw zqwVar : zqwVarArr) {
                String str = zqwVar.f54508c;
                if (str != null) {
                    arrayMap.put(str, zqwVar);
                }
            }
        }
        return Collections.unmodifiableMap(arrayMap);
    }

    public zqw(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.d = i;
        this.e = i2;
        this.f54508c = str;
        this.f54507b = str2;
        this.f54506a = uri;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.d(jSONObject, "type", this.d);
        JsonUtil.d(jSONObject, "code", this.e);
        JsonUtil.a(jSONObject, VastAttribute.ERROR, this.f54508c);
        JsonUtil.a(jSONObject, "errorDescription", this.f54507b);
        JsonUtil.e(jSONObject, "errorUri", this.f54506a);
        return jSONObject;
    }

    public String d() {
        return a().toString();
    }

    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", d());
        return intent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zqw)) {
            return false;
        }
        zqw zqwVar = (zqw) obj;
        return this.d == zqwVar.d && this.e == zqwVar.e;
    }

    public int hashCode() {
        return ((this.d + 31) * 31) + this.e;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthorizationException: " + d();
    }
}
