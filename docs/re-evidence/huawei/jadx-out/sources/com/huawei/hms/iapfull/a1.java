package com.huawei.hms.iapfull;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.content.PermissionChecker;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.secure.android.common.util.SafeBase64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a1 {
    public static String a(Context context, String str, String str2, String str3) {
        String str4 = (TextUtils.isEmpty(str3) || "CNY".equals(str3)) ? "¥" : "";
        if (context == null) {
            y0.a("PayPresenter", "context is null");
            return str;
        }
        String string = context.getString(R.string.hwpay_pay_normal_pay, str4, str);
        if ("string_cny_normal".equals(str2)) {
            return string;
        }
        if (!"string_cny_discount".equals(str2)) {
            return "string_cny_confirm".equals(str2) ? context.getString(R.string.hwpay_pay_confirm_pay, string) : str4;
        }
        return "-\u200e" + string;
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo = (context == null || PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) ? null : connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    private static boolean a(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        String strEncodeToString;
        Object obj2;
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                jSONObject.put(str, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                obj2 = (Short) obj;
            } else if (obj instanceof Long) {
                obj2 = (Long) obj;
            } else if (obj instanceof Float) {
                obj2 = (Float) obj;
            } else if (obj instanceof Double) {
                obj2 = (Double) obj;
            } else if (obj instanceof Boolean) {
                obj2 = (Boolean) obj;
            } else if (obj instanceof JSONObject) {
                obj2 = (JSONObject) obj;
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_val_type_", 2);
                if (bArr != null) {
                    try {
                        strEncodeToString = Base64.encodeToString(bArr, 2);
                        if (strEncodeToString == null) {
                            strEncodeToString = "";
                        }
                    } catch (Throwable unused) {
                        y0.a("Base64", "An exception occurred while encoding with Base64.");
                    }
                } else {
                    strEncodeToString = "";
                }
                jSONObject2.put("_byte_", strEncodeToString);
                jSONObject.put(str, jSONObject2);
            } else if (obj instanceof List) {
                List list = (List) obj;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("_val_type_", 1);
                jSONObject3.put("_list_size_", list.size());
                for (int i = 0; i < list.size(); i++) {
                    a("_list_item_" + i, list.get(i), jSONObject3);
                    if (list.get(i) instanceof b1) {
                        jSONObject3.put("_val_type_", 0);
                    }
                }
                jSONObject.put(str, jSONObject3);
            } else if (obj instanceof Map) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj3 : ((Map) obj).entrySet()) {
                    if (obj3 instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj3;
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (key instanceof b1) {
                            key = a((b1) key);
                        }
                        jSONArray.put(key);
                        if (value instanceof b1) {
                            value = a((b1) value);
                        }
                        jSONArray.put(value);
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("_val_type_", 3);
                jSONObject4.put("_map_", jSONArray.toString());
                jSONObject.put(str, jSONObject4);
            } else {
                if (obj instanceof b1) {
                    try {
                        jSONObject.put(str, a((b1) obj));
                    } catch (IllegalAccessException e) {
                        y0.a("JsonUtil", "IllegalAccessException , " + e.getMessage());
                    }
                }
                return false;
            }
            return true;
        }
        obj2 = (String) obj;
        jSONObject.put(str, obj2);
        return true;
    }

    public static String a() {
        String str;
        try {
            str = System.currentTimeMillis() + "_" + String.format(Locale.ROOT, "%06d", Integer.valueOf(SecureRandom.getInstanceStrong().nextInt(1000000)));
        } catch (NoSuchAlgorithmException unused) {
            y0.a("getStrongNoiseTamp", "getStrongNoiseTamp NoSuchAlgorithmException.");
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return System.currentTimeMillis() + "_" + String.format(Locale.ROOT, "%06d", Integer.valueOf(new SecureRandom().nextInt(1000000)));
    }

    public static String a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (!HwPayConstant.KEY_SIGN.equals(next)) {
                    Object string = jSONObject.get(next);
                    if (string instanceof Integer) {
                        if (((Integer) string).intValue() >= 0) {
                            string = ((Integer) string) + "";
                        }
                    }
                    if (string instanceof ArrayList) {
                        StringBuilder sb = new StringBuilder();
                        for (Map map2 : (List) string) {
                            if (sb.length() > 0) {
                                sb.append("#");
                            }
                            sb.append(a((Map<String, String>) map2));
                        }
                        string = sb.toString();
                    }
                    if (string instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) string;
                        StringBuilder sb2 = new StringBuilder();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            if (sb2.length() > 0) {
                                sb2.append("#");
                            }
                            sb2.append(a(jSONObject2));
                        }
                        string = sb2.toString();
                    }
                    if (string != null) {
                        map.put(next, string.toString());
                    }
                }
            } catch (JSONException unused) {
                y0.a("SignUtils", "json exception");
            }
        }
        return a(map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public static String a(String str, String str2) {
        String str3;
        PrivateKey privateKeyB = y0.b(str);
        if (privateKeyB != null) {
            try {
                if (((RSAPrivateKey) privateKeyB).getModulus().bitLength() <= 512) {
                    str3 = "getSignTypByBuildVersion. If the key length is less than 512 bytes, use RSA256.";
                } else {
                    if (HwPayConstant.SIGNTYPE_RSA256PSS.equalsIgnoreCase(str2)) {
                        y0.b("SignUtils", "getSignTypByBuildVersion.");
                        return HwPayConstant.SIGNTYPE_RSA256PSS;
                    }
                    str3 = "getSignTypByBuildVersion. Using Default Configuration RSA256";
                }
            } catch (Exception unused) {
                y0.a("SignUtil", "getPrivateKeyLength, Exception");
            }
        } else {
            str3 = "getSignTypByBuildVersion. If the key length is less than 512 bytes, use RSA256.";
        }
        y0.b("SignUtils", str3);
        return "RSA256";
    }

    public static String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                PrivateKey privateKeyB = y0.b(str);
                if (TextUtils.isEmpty(str2) || privateKeyB == null) {
                    y0.a("RSASign", "content or key is null");
                    return "";
                }
                try {
                    Signature signature = Signature.getInstance(HwPayConstant.SIGNTYPE_RSA256PSS.equals(str3) ? "SHA256WithRSA/PSS" : "SHA256WithRSA");
                    signature.initSign(privateKeyB);
                    signature.update(str2.getBytes("UTF-8"));
                    return SafeBase64.encodeToString(signature.sign(), 0);
                } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
                    return "";
                }
            }
            y0.a("RSASign", "sign content or key is null");
        }
        return "";
    }

    private static boolean b(String str) {
        return (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str)) ? false : true;
    }

    public static String b(b1 b1Var) {
        StringBuilder sb;
        String message;
        if (b1Var == null) {
            y0.a("JsonUtil", "createJsonString error, the input IMessageEntity is null");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = b1Var.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                for (Field field : superclass.getDeclaredFields()) {
                    boolean zIsAccessible = field.isAccessible();
                    field.setAccessible(true);
                    String name = field.getName();
                    Object obj = field.get(b1Var);
                    field.setAccessible(zIsAccessible);
                    a(name, obj, jSONObject);
                }
            } catch (IllegalAccessException e) {
                sb = new StringBuilder("catch IllegalAccessException ");
                message = e.getMessage();
                sb.append(message);
                y0.a("JsonUtil", sb.toString());
                return jSONObject.toString();
            } catch (JSONException e2) {
                sb = new StringBuilder("catch JSONException ");
                message = e2.getMessage();
                sb.append(message);
                y0.a("JsonUtil", sb.toString());
                return jSONObject.toString();
            }
        }
        return jSONObject.toString();
    }

    public static String b() {
        String str = Build.MODEL;
        if (!b(str)) {
            str = Build.DEVICE;
        }
        if (!b(str)) {
            str = Build.PRODUCT;
        }
        return !b(str) ? "0" : str;
    }

    public static boolean a(Intent intent) {
        boolean z;
        if (intent == null) {
            z = true;
        } else {
            try {
                intent.getStringExtra("ANYTHING");
                z = false;
            } catch (Exception unused) {
                z = true;
            }
        }
        y0.b("UIUtil", "checkIntent4DDOS: " + z);
        return z;
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public static void a(Activity activity, int i, int i2) {
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new f1(activity, i, i2));
    }

    public static Map<String, String> a(String str, String str2, boolean z) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str3 : str.split(str2)) {
                String[] strArrSplit = str3.split("=");
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[0];
                    String strSubstring = str3.substring(str4.length() + 1);
                    if (z) {
                        strSubstring = a(strSubstring);
                    }
                    map.put(str4, strSubstring);
                }
            }
        }
        return map;
    }

    public static String a(Map<String, String> map) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            String str2 = (String) arrayList.get(i);
            if (!HwPayConstant.KEY_SIGN.equals(str2) && (str = map.get(str2)) != null && !str.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : "&");
                sb.append(str2);
                sb.append("=");
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            i++;
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLDecoder.decode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                str2 = "WebFormerUtil decodeUrl UnsupportedEncodingException.";
                y0.a("decodeUrl", str2);
                return str;
            } catch (IllegalArgumentException unused2) {
                str2 = "WebFormerUtil decodeUrl IllegalArgumentException.";
                y0.a("decodeUrl", str2);
                return str;
            }
        }
        return str;
    }

    private static String a(b1 b1Var) throws IllegalAccessException, JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = b1Var.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                boolean zIsAccessible = field.isAccessible();
                field.setAccessible(true);
                String name = field.getName();
                Object obj = field.get(b1Var);
                field.setAccessible(zIsAccessible);
                a(name, obj, jSONObject);
            }
        }
        return jSONObject.toString();
    }
}
