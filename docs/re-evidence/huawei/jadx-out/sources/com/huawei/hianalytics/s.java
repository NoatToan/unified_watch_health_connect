package com.huawei.hianalytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static String b(Context context) {
        String serial;
        if (context == null || !t.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            serial = Build.getSerial();
        } catch (SecurityException unused) {
            HiLog.e("DeviceIdUtils", "no permissions");
            serial = "";
        }
        return serial.equalsIgnoreCase("unknown") ? "" : serial;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[Catch: all -> 0x0133, PHI: r1
      0x00c0: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v6 java.lang.String), (r1v6 java.lang.String), (r1v24 java.lang.String) binds: [B:25:0x0062, B:27:0x006a, B:29:0x0076, B:44:0x00bf] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6 A[Catch: all -> 0x0133, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2 A[Catch: all -> 0x0133, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: all -> 0x0133, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[Catch: all -> 0x0133, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e A[Catch: all -> 0x0133, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x001b, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:31:0x007a, B:32:0x0082, B:34:0x008b, B:37:0x0094, B:38:0x009a, B:42:0x00a9, B:40:0x009f, B:43:0x00b7, B:45:0x00c0, B:47:0x00c6, B:49:0x00e2, B:50:0x00ea, B:52:0x00f3, B:55:0x00fc, B:56:0x0102, B:60:0x0110, B:58:0x0107, B:61:0x011e, B:62:0x0127, B:12:0x0025, B:14:0x002e, B:17:0x0037, B:18:0x003d, B:22:0x004c, B:20:0x0042, B:23:0x0056), top: B:70:0x0003, inners: #0, #2, #3 }] */
    public static String c(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (s.class) {
            String str = k.b().a().k;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String string = "";
            SharedPreferences sharedPreferences3 = null;
            if (context == null) {
                HiLog.e("SharedPreUtils", "context is null");
                string = "";
            } else if (TextUtils.isEmpty("uuid") || TextUtils.isEmpty("global_v2")) {
                HiLog.e("SharedPreUtils", "spName or spKey is empty");
            } else {
                try {
                    sharedPreferences = context.getSharedPreferences(c2.b(context, "global_v2"), 0);
                } catch (Exception unused) {
                    HiLog.e("SharedPreUtils", "getSharedPreferences Exception");
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    string = sharedPreferences.getString("uuid", "");
                }
            }
            if (TextUtils.isEmpty(string) || string.length() <= 32) {
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString().replace(Constants.LINK, "");
                    k.b().a().k = string;
                    if (context == null) {
                        HiLog.e("SharedPreUtils", "context is null");
                    } else if (!TextUtils.isEmpty("uuid") || TextUtils.isEmpty("global_v2")) {
                        HiLog.e("SharedPreUtils", "spName or spKey is empty");
                    } else {
                        try {
                            sharedPreferences3 = context.getSharedPreferences(c2.b(context, "global_v2"), 0);
                        } catch (Exception unused2) {
                            HiLog.e("SharedPreUtils", "getSharedPreferences Exception");
                        }
                        if (sharedPreferences3 != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                            editorEdit.putString("uuid", string);
                            editorEdit.commit();
                        }
                    }
                } else {
                    k.b().a().k = string;
                }
                return string;
            }
            String strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Uuid_Sp_Key", string);
            if (TextUtils.isEmpty(strDecrypt)) {
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString().replace(Constants.LINK, "");
                    k.b().a().k = string;
                    if (context == null) {
                        HiLog.e("SharedPreUtils", "context is null");
                    } else if (TextUtils.isEmpty("uuid")) {
                        HiLog.e("SharedPreUtils", "spName or spKey is empty");
                    } else {
                        HiLog.e("SharedPreUtils", "spName or spKey is empty");
                    }
                } else {
                    k.b().a().k = string;
                }
                return string;
            }
            if (context == null) {
                HiLog.e("SharedPreUtils", "context is null");
            } else if (TextUtils.isEmpty("uuid") || TextUtils.isEmpty("global_v2")) {
                HiLog.e("SharedPreUtils", "spName or spKey is empty");
            } else {
                try {
                    sharedPreferences2 = context.getSharedPreferences(c2.b(context, "global_v2"), 0);
                } catch (Exception unused3) {
                    HiLog.e("SharedPreUtils", "getSharedPreferences Exception");
                    sharedPreferences2 = null;
                }
                if (sharedPreferences2 != null) {
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putString("uuid", strDecrypt);
                    editorEdit2.commit();
                }
            }
            string = strDecrypt;
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace(Constants.LINK, "");
                k.b().a().k = string;
                if (context == null) {
                    HiLog.e("SharedPreUtils", "context is null");
                } else if (TextUtils.isEmpty("uuid")) {
                    HiLog.e("SharedPreUtils", "spName or spKey is empty");
                } else {
                    HiLog.e("SharedPreUtils", "spName or spKey is empty");
                }
            } else {
                k.b().a().k = string;
            }
            return string;
            throw th;
        }
    }

    public static String a() {
        Method method;
        try {
            if (t.b()) {
                method = Class.forName("com.hihonor.android.os.Build").getMethod("getUDID", new Class[0]);
            } else {
                method = Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]);
            }
            return (String) method.invoke(null, new Object[0]);
        } catch (Exception unused) {
            HiLog.e("DeviceIdUtils", "getUDID failed");
            return "";
        }
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
