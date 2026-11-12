package defpackage;

import android.graphics.Bitmap;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.Base64;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class rcn {
    public static String d(Bitmap bitmap) {
        String str = null;
        if (bitmap == null) {
            LogUtil.d("DeviceConnectManagerUtils", "bitmapToBase64Encode bitmap is null");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            str = "data:image/png;base64," + Base64.b(byteArrayOutputStream.toByteArray());
            LogUtil.b("DeviceConnectManagerUtils", "bitmapToBase64Encode result: ", str);
        } catch (IOException e) {
            LogUtil.d("DeviceConnectManagerUtils", "bitmapToBase64Encode exception1: ", ExceptionUtils.c(e));
        } finally {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                LogUtil.d("DeviceConnectManagerUtils", "bitmapToBase64Encode exception2: ", ExceptionUtils.c(e2));
            }
        }
        return str;
    }

    public static boolean c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("isCloudDevice")) {
                return jSONObject.optBoolean("isCloudDevice");
            }
            return false;
        } catch (JSONException unused) {
            LogUtil.d("DeviceConnectManagerUtils", "isCloudDevice is error");
            return false;
        }
    }

    public static int e(int i) {
        int iB = lvi.a(i).b();
        return (iB != -1 || edg.e().get(Integer.valueOf(i)) == null) ? iB : edg.e().get(Integer.valueOf(i)).intValue();
    }

    public static ArrayList<String> b(int i) {
        return lvi.e(i);
    }

    public static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("name")) {
                return jSONObject.optString("name");
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.d("DeviceConnectManagerUtils", "getDeviceName is error");
            return "";
        }
    }

    public static String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pin")) {
                return jSONObject.optString("pin");
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.d("DeviceConnectManagerUtils", "getDeviceName is error");
            return "";
        }
    }
}
