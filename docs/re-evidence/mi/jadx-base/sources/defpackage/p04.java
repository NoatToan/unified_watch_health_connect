package defpackage;

import com.miui.circulate.device.api.Constant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class p04 {
    public static byte[] a(byte[] bArr) {
        return wlq.f38110a >= 27 ? bArr : wlq.i0(c(wlq.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (wlq.f38110a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(wlq.E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString(Constant.KeyValue.KEY_COLUMN)));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return wlq.i0(sb.toString());
        } catch (JSONException e) {
            String strValueOf = String.valueOf(wlq.E(bArr));
            toe.d("ClearKeyUtil", strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
