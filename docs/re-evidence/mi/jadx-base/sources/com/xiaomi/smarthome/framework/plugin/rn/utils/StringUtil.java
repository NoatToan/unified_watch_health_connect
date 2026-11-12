package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtil {
    public static final String BASE_64 = "base-64";
    public static final String DEFAULT_CHARSET = "base-64";
    public static final String HEX_STRING = "hex-string";
    public static final String INT_ARRAY = "int-array";
    private static final String TAG = "StringUtil";
    public static final String UTF_8 = "utf-8";

    @RequiresApi(api = 8)
    public static String encode(byte[] bArr, String str) throws UnsupportedEncodingException {
        String lowerCase = !TextUtils.isEmpty(str) ? str.toLowerCase() : "base-64";
        if (TextUtils.equals("utf-8", lowerCase)) {
            return new String(bArr, lowerCase);
        }
        if (TextUtils.equals("base-64", lowerCase)) {
            return Base64.encodeToString(bArr, 2);
        }
        if (TextUtils.equals(HEX_STRING, lowerCase)) {
            return MIOTUtils.byte2String(bArr);
        }
        if (TextUtils.equals(INT_ARRAY, lowerCase)) {
            return toJSONArrayString(bArr);
        }
        MRnLog.w(TAG, "unsupported charsetName:" + lowerCase);
        throw new UnsupportedEncodingException(String.format("%s is not supported", lowerCase));
    }

    public static String toJSONArrayString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            sb.append(bArr[i] & 255);
            i++;
            if (i >= bArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(",");
        }
    }
}
