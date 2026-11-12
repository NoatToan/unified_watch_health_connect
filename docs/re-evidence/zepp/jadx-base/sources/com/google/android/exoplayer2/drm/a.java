package com.google.android.exoplayer2.drm;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private static final String a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] request) {
        return Util.SDK_INT >= 27 ? request : Util.getUtf8Bytes(c(Util.fromUtf8Bytes(request)));
    }

    public static byte[] b(byte[] response) {
        if (Util.SDK_INT >= 27) {
            return response;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.fromUtf8Bytes(response));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString(hl.k)));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return Util.getUtf8Bytes(sb.toString());
        } catch (JSONException e) {
            String strValueOf = String.valueOf(Util.fromUtf8Bytes(response));
            Log.e(a, strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e);
            return response;
        }
    }

    private static String c(String base64) {
        return base64.replace('+', '-').replace('/', '_');
    }

    private static String d(String base64Url) {
        return base64Url.replace('-', '+').replace('_', '/');
    }
}
