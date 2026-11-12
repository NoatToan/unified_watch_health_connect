package com.huami.watch.connect;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class ConnectionUtil {
    private static final String a = "Connection-Util";

    private static String a(String str) {
        String str2 = "";
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getErrorStream()));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || line.equals("null")) {
                    break;
                }
                str2 = str2 + line + "\n";
            }
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 == null || line2.equals("null")) {
                    break;
                }
                str2 = str2 + line2 + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(a, "Exec <" + str + "> : " + str2);
        return str2;
    }

    private static String b(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "huami_cpuid");
            if (TextUtils.isEmpty(string)) {
                String strA = a("cat proc/jz/efuse/chip_num");
                if (strA == null || !strA.startsWith("chip_num:")) {
                    return string;
                }
                String[] strArrSplit = strA.split(":");
                return strArrSplit.length == 2 ? strArrSplit[1].trim() : string;
            }
            Log.d(a, "From Settings CpuId : [" + string + "]");
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int c() {
        String strE = e("ro.build.huami.number");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.valueOf(strE).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private static String d() {
        String strE = e("ro.build.huami.model");
        Log.d(a, "Huami Model : " + strE);
        return strE;
    }

    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> f(String[] strArr) {
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject();
        map.put("config", jSONObject);
        try {
            Log.d(a, "Support Features : " + Arrays.toString(strArr));
            if (strArr != null && strArr.length > 0) {
                jSONObject.put("support", new JSONArray((Collection) Arrays.asList(strArr)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String getHuamiSN() {
        String strE = e("ro.sn.serial_numbers");
        Log.d(a, "Huami SN : " + strE);
        return strE;
    }

    public static String getPhoneExtraInfo(String[] strArr) {
        try {
            HashMap map = new HashMap();
            map.putAll(f(strArr));
            map.put("v", 1);
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getWatchExtraInfo(Context context, String[] strArr) {
        try {
            HashMap map = new HashMap();
            map.put("hmModel", d());
            map.putAll(f(strArr));
            map.put("v", 1);
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
