package com.huawei.hms.health;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.result.HealthKitAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.utils.UIUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class aacs {
    public static boolean aab(long j) {
        return j >= 1388505600000000000L && j <= 4102415999000000000L;
    }

    public static boolean aab(List list) {
        return list != null && list.size() >= 0 && list.size() <= 1000;
    }

    public static boolean aaba(long j) {
        return j >= 1388505600000L && j <= 4102415999000L;
    }

    public static boolean aabb(Context context) {
        if (!aaba(context)) {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager == null) {
                aabz.aabc("util", "mPowerManager is null");
                return false;
            }
            if (!(!powerManager.isInteractive())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    public static boolean aab(Context context, String str, String str2) {
        PackageInfo packageInfo;
        byte[] byteArray;
        String strAab;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str2, 64)) != null) {
                    byteArray = packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbAab = com.huawei.hms.health.aab.aab("PackageManager.NameNotFoundException : ");
                sbAab.append(e.getMessage());
                aabz.aab("util", sbAab.toString(), true);
            } catch (Exception e2) {
                StringBuilder sbAab2 = com.huawei.hms.health.aab.aab("Exception : ");
                sbAab2.append(e2.getMessage());
                aabz.aab("util", sbAab2.toString(), true);
            }
            if (byteArray != null || byteArray.length <= 0) {
                strAab = "";
            } else {
                try {
                    strAab = aab(MessageDigest.getInstance("SHA-256").digest(byteArray));
                } catch (NoSuchAlgorithmException e3) {
                    StringBuilder sbAab3 = com.huawei.hms.health.aab.aab("NoSuchAlgorithmException");
                    sbAab3.append(e3.getMessage());
                    aabz.aab("util", sbAab3.toString());
                    strAab = "";
                }
            }
            return str.equalsIgnoreCase(strAab);
        }
        aabz.aab("util", "packageName is null or context is null");
        byteArray = new byte[0];
        if (byteArray != null) {
            strAab = "";
        } else {
            strAab = "";
        }
        return str.equalsIgnoreCase(strAab);
    }

    public static <T> T aab(String str, Type type) {
        T t = null;
        if (str == null) {
            aabz.aab("util", "fromJson --> json is null");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                try {
                    new JSONObject(str);
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                new JSONArray(str);
            }
            t = (T) new Gson().fromJson(TextUtils.isEmpty(str) ? "" : new StringBuffer(JsonSanitizer.sanitize(str)).toString(), type);
        } catch (JsonSyntaxException unused3) {
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("fromJson --> JsonSyntaxException.");
            sbAab.append(type.toString());
            aabz.aab("util", sbAab.toString());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbAab2 = com.huawei.hms.health.aab.aab("fromJson(String json, Class<T> classOfT), time = ");
        sbAab2.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbAab2.toString();
        return t;
    }

    public static <T> List<T> aab(String str, Class<T> cls) {
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    new JSONObject(str);
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                new JSONArray(str);
            }
            ArrayList arrayList = new ArrayList();
            try {
                JsonArray asJsonArray = new JsonParser().parse(TextUtils.isEmpty(str) ? "" : new StringBuffer(JsonSanitizer.sanitize(str)).toString()).getAsJsonArray();
                if (asJsonArray != null) {
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Gson().fromJson(it.next(), (Class) cls));
                    }
                }
            } catch (JsonSyntaxException | IllegalStateException unused3) {
                aabz.aab("util", "getListFromJSON Error, Json syntax is wrong");
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static <T> void aab(Parcel parcel, List<T> list, Parcelable.Creator<T> creator) {
        int size = list.size();
        int i = parcel.readInt();
        int i2 = 0;
        if (i > 300000) {
            i = 300000;
        }
        while (true) {
            T tCreateFromParcel = null;
            if (i2 >= size || i2 >= i) {
                break;
            }
            if (parcel.readInt() != 0) {
                tCreateFromParcel = creator.createFromParcel(parcel);
            }
            list.set(i2, tCreateFromParcel);
            i2++;
        }
        while (i2 < i) {
            list.add(parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            i2++;
        }
        while (i2 < size) {
            list.remove(i);
            i2++;
        }
    }

    public static String aabd(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(str.getBytes(StandardCharsets.ISO_8859_1)));
            byte[] bArr = new byte[256];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i < 0) {
                    return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            str2 = "compressGzip catch IOException.";
            aabz.aabc("util", str2);
            aabz.aabc("util", "return default Gzipped value.");
            return "";
        } catch (Exception unused2) {
            str2 = "compressGzip catch basic exception.";
            aabz.aabc("util", str2);
            aabz.aabc("util", "return default Gzipped value.");
            return "";
        } catch (Throwable unused3) {
            str2 = "catch Throwable";
            aabz.aabc("util", str2);
            aabz.aabc("util", "return default Gzipped value.");
            return "";
        }
    }

    public static boolean aabc(String str) {
        return aab(str, 1, 1000);
    }

    public static boolean aabb(String str) {
        return str == null || str.length() <= 10000;
    }

    public static boolean aaba(String str) {
        return str != null && str.length() != 0 && str.length() >= 1 && str.length() <= 300;
    }

    private static boolean aaba(Context context) {
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return Build.VERSION.SDK_INT >= 28 ? keyguardManager.isKeyguardLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        }
        aabz.aabc("util", "mKeyguardManager is null");
        return false;
    }

    public static void aaba(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.equals(str2)) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.API_EXCEPTION_ERROR));
        }
    }

    public static boolean aab(String str, int i, int i2) {
        return str != null && str.length() != 0 && str.length() >= i && str.length() <= i2;
    }

    public static boolean aab(String str) {
        return aab(str, 1, 980);
    }

    public static boolean aab(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = UIUtil.getProcessName(context, Process.myPid());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, processName)) {
                StringBuilder sbAab = com.huawei.hms.health.aab.aab("appProcess.importance is ");
                sbAab.append(runningAppProcessInfo.importance);
                aabz.aabb("util", sbAab.toString());
                boolean z = runningAppProcessInfo.importance <= 200;
                aabz.aabb("util", "isForeground is " + z);
                return !z;
            }
        }
        return true;
    }

    public static boolean aab(long j, long j2) {
        return System.currentTimeMillis() - j > j2;
    }

    public static void aab(Intent intent, String str) {
        String packageName;
        if (intent == null) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.INPUT_PARAM_MISSING));
        }
        if (TextUtils.isEmpty(intent.getPackage())) {
            packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : "";
        } else {
            packageName = intent.getPackage();
        }
        aaba(packageName, str);
    }

    public static void aab(long j, long j2, TimeUnit timeUnit) {
        int i = aab.aab[timeUnit.ordinal()];
        if (i == 1) {
            if (j2 - j >= 2678400000L) {
                throw new SecurityException(String.valueOf(HiHealthStatusCodes.QUERY_TIME_EXCEED_LIMIT));
            }
        } else if (i == 2 && j2 - j >= 2678400000000000L) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.QUERY_TIME_EXCEED_LIMIT));
        }
    }

    private static String aab(byte[] bArr) {
        String hexString;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 255;
            if (i2 < 16) {
                StringBuilder sbAab = com.huawei.hms.health.aab.aab("0");
                sbAab.append(Integer.toHexString(bArr[i] & 255));
                hexString = sbAab.toString();
            } else {
                hexString = Integer.toHexString(i2);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }

    public static String aab(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception unused) {
            aabz.aabc("util", "strFormat exception");
            return str;
        }
    }

    public static String aab(String str, String str2) {
        return str + "." + str2;
    }

    static /* synthetic */ class aab {
        static final /* synthetic */ int[] aab;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            aab = iArr;
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aab[TimeUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String aab(Object obj) {
        String json = null;
        if (obj == null) {
            aabz.aab("util", "toJson --> object is null");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            json = new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping().enableComplexMapKeySerialization().setLenient().create().toJson(obj);
        } catch (JsonSyntaxException unused) {
            aabz.aab("util", "toJson --> JsonSyntaxException.");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbAab = com.huawei.hms.health.aab.aab("toJson(Object object), time = ");
        sbAab.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbAab.toString();
        return json;
    }

    public static Intent aab(int i, AuthAccount authAccount) {
        HealthKitAuthResult healthKitAuthResult = new HealthKitAuthResult();
        healthKitAuthResult.setAuthAccount(authAccount);
        healthKitAuthResult.setStatus(new Status(i));
        Intent intent = new Intent();
        try {
            intent.putExtra("HEALTHKIT_AUTH_RESULT", healthKitAuthResult.toJson());
            return intent;
        } catch (JSONException unused) {
            aabz.aab("util", "JSONException");
            return intent;
        }
    }
}
