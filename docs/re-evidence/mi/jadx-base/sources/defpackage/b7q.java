package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b7q extends q6q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3900b;
    public final String c;
    public final boolean d;

    public b7q(String str, boolean z, byte[] bArr) {
        super(3);
        this.c = str;
        this.d = z;
        this.f3900b = bArr;
    }

    public static b7q b(JSONObject jSONObject) {
        byte[] bArr;
        String string;
        jpe.h("UDTOperationController", "fromJSONObject");
        String str = null;
        bArrDecode = null;
        byte[] bArrDecode = null;
        boolean z = true;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("operation");
            if (jSONObject2.has("topic")) {
                string = jSONObject2.getString("topic");
                try {
                    jpe.h("UDTOperationController", "topic is : " + string);
                } catch (JSONException e) {
                    e = e;
                    bArr = bArrDecode;
                    str = string;
                    e.printStackTrace();
                    string = str;
                    bArrDecode = bArr;
                }
            } else {
                string = null;
            }
            if (jSONObject2.has("isControlCmd")) {
                z = jSONObject2.getBoolean("isControlCmd");
                jpe.h("UDTOperationController", "isCtrlCommand is : " + z);
            }
            if (jSONObject2.has("rawData")) {
                bArrDecode = Base64.decode(jSONObject2.getString("rawData"), 0);
                jpe.h("UDTOperationController", "rawData length is : " + bArrDecode.length);
            }
        } catch (JSONException e2) {
            e = e2;
            bArr = null;
        }
        return new b7q(string, z, bArrDecode);
    }

    @Override // defpackage.q6q
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("topic", this.c);
            jSONObject.put("isControlCmd", this.d);
            String strEncodeToString = Base64.encodeToString(this.f3900b, 0);
            if (strEncodeToString != null) {
                jSONObject.put("rawData", strEncodeToString);
            }
            jSONObjectA.put("operation", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectA;
    }

    public byte[] c() {
        return this.f3900b;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }
}
