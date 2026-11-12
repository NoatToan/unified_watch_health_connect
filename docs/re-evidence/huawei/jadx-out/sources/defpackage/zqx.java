package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import net.openid.appauth.AuthorizationManagementRequest;
import net.openid.appauth.AuthorizationManagementResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zqx {
    zqx() {
    }

    static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String e(AuthorizationManagementRequest authorizationManagementRequest) {
        if (authorizationManagementRequest instanceof zqu) {
            return "authorization";
        }
        if (authorizationManagementRequest instanceof zra) {
            return "end_session";
        }
        return null;
    }

    public static AuthorizationManagementRequest b(String str, String str2) throws JSONException {
        zre.c(str, (Object) "jsonStr can not be null");
        JSONObject jSONObject = new JSONObject(str);
        if ("authorization".equals(str2)) {
            return zqu.e(jSONObject);
        }
        if ("end_session".equals(str2)) {
            return zra.e(jSONObject);
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    public static AuthorizationManagementResponse a(AuthorizationManagementRequest authorizationManagementRequest, Uri uri) {
        if (authorizationManagementRequest instanceof zqu) {
            return new zqt.a((zqu) authorizationManagementRequest).d(uri).c();
        }
        if (authorizationManagementRequest instanceof zra) {
            return new zqz.b((zra) authorizationManagementRequest).d(uri).b();
        }
        throw new IllegalArgumentException("Malformed request or uri");
    }
}
