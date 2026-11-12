package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.HandlerThread;
import com.huawei.android.hicloud.sync.logic.SyncProcessInterface;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class bda {
    private static final ArrayList<Integer> d;

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        d = arrayList;
        arrayList.add(2100);
        arrayList.add(2101);
        arrayList.add(2102);
        arrayList.add(2103);
        arrayList.add(2104);
        arrayList.add(2105);
        arrayList.add(2106);
        arrayList.add(500);
        arrayList.add(406);
        arrayList.add(404);
        arrayList.add(1002);
        arrayList.add(Integer.valueOf(ExceptionCode.CHECK_FILE_HASH_FAILED));
        arrayList.add(Integer.valueOf(ExceptionCode.CHECK_FILE_SIZE_FAILED));
        arrayList.add(1106);
        arrayList.add(3203);
        arrayList.add(3204);
        arrayList.add(3205);
        arrayList.add(3206);
        arrayList.add(3208);
        arrayList.add(3303);
        arrayList.add(3304);
        arrayList.add(3305);
        arrayList.add(3306);
        arrayList.add(3308);
    }

    public static long a(boolean z) {
        return z ? 100L : 200L;
    }

    public static int b(int i) {
        if (i > 100 || i <= 0) {
            return 100;
        }
        return i;
    }

    public static boolean b(List<String> list) {
        return list == null || list.size() == 0;
    }

    public static JSONArray c(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.getJSONArray(str);
        }
        return null;
    }

    public static boolean c(int i) {
        return i != 0;
    }

    public static int b(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return 0;
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            bcw.c("SyncUtil", "isNetWorkConnected context is null");
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 7)) {
                bcw.a("SyncUtil", "isNetWorkConnected ,status = " + activeNetworkInfo.isConnected());
                return activeNetworkInfo.isConnected();
            }
        } catch (Exception e) {
            bcw.d("SyncUtil", "isNetWorkConnected error." + e.toString());
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        bcw.c("SyncUtil", "hasPermission: packageName = " + str);
        if (context != null && str != null) {
            if (!bcv.a().equals(str)) {
                bcw.d("SyncUtil", "hasPermission: PackageName does not meet");
                return false;
            }
            String strE = bcv.e(context, str);
            if (strE.equals(bcv.a(context)) || strE.equals(bcv.c(context))) {
                return true;
            }
            bcw.d("SyncUtil", "hasPermission: isHiCloudSign does not meet");
            return false;
        }
        bcw.d("SyncUtil", "hasPermission: context or packageName is null");
        return false;
    }

    public static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null && str.length() > 1) {
            String strSubstring = str.substring(1, str.length() - 1);
            if (strSubstring.length() != 0) {
                for (String str2 : strSubstring.split(",")) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }

    public static String e(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static String e() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static ArrayList<String> a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList;
        return (bundle == null || (stringArrayList = bundle.getStringArrayList(str)) == null) ? new ArrayList<>(10) : stringArrayList;
    }

    public static boolean a(Context context) {
        bcw.c("SyncUtil", "checkHiCloudValidate");
        return b(context, bcv.a());
    }

    public static String b() {
        String string = UUID.randomUUID().toString();
        return string.substring(0, 8) + string.substring(9, 13) + string.substring(14, 18) + string.substring(19, 23) + string.substring(24);
    }

    public static void a(Context context, String str, Map<String, Long> map) {
        bdc bdcVarE = bdc.e(context);
        if (map == null || map.size() <= 0) {
            return;
        }
        bcw.c("SyncUtil", "saveKindsUpperLimits to sp");
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            if (-1 != jLongValue) {
                bdcVarE.b(str, key, jLongValue);
                bdcVarE.d(str, key, System.currentTimeMillis());
            }
        }
    }

    public static boolean c(Context context, String str, List<String> list, Map<String, Long> map) {
        boolean z = true;
        for (String str2 : list) {
            boolean z2 = System.currentTimeMillis() - bdc.e(context).c(str, str2) < 86400000;
            boolean z3 = map != null && map.containsKey(str2);
            if (!z2 || !z3) {
                bcw.e("SyncUtil", "getNewExceedLimitNum: need server, dataType = " + str2 + ", " + z2 + "|" + z3);
                z = false;
            }
        }
        return z;
    }

    public static void b(HandlerThread handlerThread) {
        if (handlerThread != null) {
            handlerThread.quitSafely();
            bcw.c("SyncUtil", "quit thread");
        }
    }

    public static void b(SyncProcessInterface syncProcessInterface) {
        if (syncProcessInterface != null) {
            syncProcessInterface.onSyncEnd();
        } else {
            bcw.d("SyncUtil", "processEndSync error: callback is null");
        }
    }
}
