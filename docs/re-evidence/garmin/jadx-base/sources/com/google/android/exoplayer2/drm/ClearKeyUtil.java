package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
final class ClearKeyUtil {
    private static final String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return Util.SDK_INT >= 27 ? bArr : Util.getUtf8Bytes(base64ToBase64Url(Util.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.fromUtf8Bytes(bArr));
            StringBuilder sb3 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                if (i14 != 0) {
                    sb3.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                sb3.append("{\"k\":\"");
                sb3.append(base64UrlToBase64(jSONObject2.getString(JWKParameterNames.OCT_KEY_VALUE)));
                sb3.append("\",\"kid\":\"");
                sb3.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb3.append("\",\"kty\":\"");
                sb3.append(jSONObject2.getString(JWKParameterNames.KEY_TYPE));
                sb3.append("\"}");
            }
            sb3.append("]}");
            return Util.getUtf8Bytes(sb3.toString());
        } catch (JSONException e4) {
            String strValueOf = String.valueOf(Util.fromUtf8Bytes(bArr));
            Log.e(TAG, strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e4);
            return bArr;
        }
    }

    private static String base64ToBase64Url(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    private static String base64UrlToBase64(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
