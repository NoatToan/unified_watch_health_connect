package defpackage;

import android.util.Base64;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33080b;
    public String c;
    public String d;

    public rz0() {
    }

    public rz0(KeyPair keyPair, int i) {
        if (keyPair != null) {
            if (i == 1) {
                this.f33079a = oz0.d(keyPair.getPrivate().getEncoded());
                this.c = oz0.d(keyPair.getPublic().getEncoded());
            } else if (i == 2) {
                this.f33079a = new String(Base64.encode(keyPair.getPrivate().getEncoded(), 0));
                this.c = new String(Base64.encode(keyPair.getPublic().getEncoded(), 0));
            }
            this.f33080b = l98.c(this.f33079a);
            this.d = l98.c(this.c);
        }
    }

    public static rz0 a(JSONObject jSONObject) {
        rz0 rz0Var = new rz0();
        try {
            rz0Var.f33079a = jSONObject.getString("privateKey");
            rz0Var.f33080b = jSONObject.getString("privateKeyMd5");
            rz0Var.c = jSONObject.getString("publicKey");
            rz0Var.d = jSONObject.getString("publicKeyMd5");
            return rz0Var;
        } catch (JSONException e) {
            ycm.a("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static rz0 b(String str) {
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            ycm.a("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String c() {
        return this.f33079a;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("privateKey", this.f33079a);
            jSONObject.put("privateKeyMd5", this.f33080b);
            jSONObject.put("publicKey", this.c);
            jSONObject.put("publicKeyMd5", this.d);
            return jSONObject.toString();
        } catch (JSONException unused) {
            ycm.a("Error: AirkanKeyPair to json string error!");
            return "";
        }
    }

    public String g() {
        return "AirkanKeyPair[privateKeyMd5: " + this.f33080b + ", publicKeyMd5: " + this.d + "]";
    }
}
