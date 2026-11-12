package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.os.Build;
import android.util.Base64;
import com.huawei.agconnect.apms.Agent;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public final class znp {
    public static String b(String str) {
        return str.replaceAll(".debug", "").replaceAll(".release", "");
    }

    public static boolean e(String str) {
        return str != null && !str.isEmpty() && d(str) && str.length() <= 36 && str.length() >= 30;
    }

    public static Map<String, String> d(Context context) throws Exception {
        if (context == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV");
        map.put("X-PAYPAL-REQUEST-DATA-FORMAT", "NV");
        map.put("X-PAYPAL-SERVICE-VERSION", "1.0.0");
        map.put("Content-Type", "application/x-www-form-urlencoded");
        e(map, context);
        return map;
    }

    static boolean d(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9-]*$");
    }

    static boolean c(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0;
        }
        return !(obj instanceof Integer) || ((Integer) obj).intValue() == 0;
    }

    public static Map<String, String> a(Context context) throws Exception {
        if (context == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        e(map, context);
        return map;
    }

    public static List<String> e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(jSONArray.get(i)));
            }
        }
        return arrayList;
    }

    public static boolean a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static void b(Class<?> cls, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                a.e(cls.getClass(), 3, e);
            }
        }
    }

    static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject.has(next)) {
                try {
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (JSONException e) {
                    a.e((Class<?>) znp.class, 3, e);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject c(Sensor sensor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(c.d.e.NAME.toString(), sensor.getName());
        jSONObject.put(c.d.e.VENDOR.toString(), sensor.getVendor());
        jSONObject.put(c.d.e.POWER.toString(), String.format("%.8f", Float.valueOf(sensor.getPower())));
        jSONObject.put(c.d.e.VERSION.toString(), String.valueOf(sensor.getVersion()));
        jSONObject.put(c.d.e.RESOLUTION.toString(), String.format("%.8f", Float.valueOf(sensor.getResolution())));
        jSONObject.put(c.d.e.MAX_RANGE.toString(), String.format("%.8f", Float.valueOf(sensor.getMaximumRange())));
        jSONObject.put(c.d.e.FIFO_MAX_EVENT_COUNT.toString(), String.valueOf(sensor.getFifoMaxEventCount()));
        return jSONObject;
    }

    public static JSONArray d(Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    private static Map<String, String> e(Map<String, String> map, Context context) throws Exception {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String packageName = context.getPackageName();
        String strB = b(context);
        if (!c("5.5.1.release")) {
            map.put("comp_version", "5.5.1.release");
        }
        if (!c(str)) {
            map.put("os_version", str);
        }
        if (!c(Agent.OS_NAME)) {
            map.put("os_type", Agent.OS_NAME);
        }
        if (!c(str2)) {
            map.put("device_model", str2);
        }
        if (!c(packageName)) {
            map.put("app_id", packageName);
        }
        if (!c(strB)) {
            map.put("app_version", strB);
        }
        return map;
    }

    public static List<Integer> c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((Integer) jSONArray.get(i));
            }
        }
        return arrayList;
    }

    public static String b(Boolean[] boolArr) {
        String str;
        if (boolArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Boolean bool : boolArr) {
            if (bool.booleanValue()) {
                str = "1";
            } else {
                if (!bool.booleanValue()) {
                    str = "0";
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String c(boolean z) {
        return z ? UUID.randomUUID().toString() : UUID.randomUUID().toString().replaceAll(Constants.LINK, "");
    }

    static String a(String str) throws UnsupportedEncodingException {
        return new String(Base64.decode(str, 2), "UTF-8");
    }

    public static String b(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    private znp() {
    }
}
