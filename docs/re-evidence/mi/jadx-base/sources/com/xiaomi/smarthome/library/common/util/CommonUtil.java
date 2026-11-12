package com.xiaomi.smarthome.library.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.smarthome.CpuConstant;
import com.xiaomi.smarthome.library.deviceId.DeviceIdCompat;
import com.xiaomi.smarthome.library.securecompact.SettingsSecureCompat;
import defpackage.trh;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CommonUtil {
    public static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public static void asserts(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    public static boolean checkPermissions(Context context, String str) {
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            return trh.a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), context.getPackageName()) == 0;
        }
        return context.checkSelfPermission(str) == 0;
    }

    public static String dumpMapToString(Map<? extends Object, ? extends Object> map) {
        if (map == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<? extends Object, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String dumpMemoryInfo(Context context, boolean z) {
        if (context == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            sb.append("total_mem " + ((memoryInfo.totalMem / 1024.0d) / 1024.0d) + "MB");
            sb.append("avai_mem " + (((double) (memoryInfo.availMem >> 10)) / 1024.0d) + "MB");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("is_low_mem ");
            sb2.append(memoryInfo.lowMemory);
            sb.append(sb2.toString());
            sb.append("threshold " + ((memoryInfo.threshold / 1024.0d) / 1024.0d) + "MB");
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = "crash-" + new SimpleDateFormat().format(new Date()) + "-" + jCurrentTimeMillis + ".hprof";
                File externalFilesDir = context.getExternalFilesDir("external");
                if (externalFilesDir != null) {
                    Debug.dumpHprofData(externalFilesDir.getPath() + "/crash_log/" + str);
                }
                Debug.MemoryInfo memoryInfo2 = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo2);
                sb.append("nat_mem " + ((Debug.getNativeHeapAllocatedSize() / 1024.0d) / 1024.0d) + "MB");
                sb.append("nat_free_mem " + ((((double) Debug.getNativeHeapFreeSize()) / 1024.0d) / 1024.0d) + "MB");
                sb.append("nat_heap_size " + ((((double) Debug.getNativeHeapSize()) / 1024.0d) / 1024.0d) + "MB");
                sb.append("d_priv_dir " + (((double) memoryInfo2.dalvikPrivateDirty) / 1024.0d) + "MB");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("d_pss ");
                sb3.append(memoryInfo2.dalvikPss);
                sb.append(sb3.toString());
                sb.append("d_pss " + memoryInfo2.dalvikSharedDirty);
                sb.append("d_pss " + memoryInfo2.nativePrivateDirty);
                sb.append("d_pss " + memoryInfo2.nativePss);
                sb.append("d_pss " + memoryInfo2.nativeSharedDirty);
                sb.append("d_pss " + memoryInfo2.otherPrivateDirty);
                sb.append("d_pss " + memoryInfo2.otherPss);
                sb.append("d_pss " + memoryInfo2.otherSharedDirty);
            }
            sb.append("应用可使用最大内存 " + ((Runtime.getRuntime().maxMemory() / 1024.0d) / 1024.0d) + "MB");
            sb.append("应用空闲内存 " + ((((double) Runtime.getRuntime().freeMemory()) / 1024.0d) / 1024.0d) + "MB");
            sb.append("应用占用总内存 " + ((((double) Runtime.getRuntime().totalMemory()) / 1024.0d) / 1024.0d) + "MB");
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return th.getMessage();
        }
    }

    public static String dumpPidStatus() {
        StringBuilder sb = new StringBuilder();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/" + Process.myPid() + "/status", "r");
            while (randomAccessFile.readLine() != null) {
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String getAesKeyAndroidId32Bytes(Context context) {
        String androidId = getAndroidId(context);
        if (TextUtils.isEmpty(androidId)) {
            return null;
        }
        if (androidId.length() >= 32) {
            return androidId.substring(0, 32);
        }
        StringBuilder sb = new StringBuilder(androidId);
        for (int length = androidId.length(); length < 32; length++) {
            sb.append(androidId.charAt(length % androidId.length()));
        }
        return sb.toString();
    }

    public static String getAndroidId(Context context) {
        if (context == null) {
            return null;
        }
        return SettingsSecureCompat.getAndroidId();
    }

    public static boolean getAppOps(Context context) {
        if (Build.MANUFACTURER.toLowerCase().contains(RomUtils.VIVO)) {
            return getFloatPermissionStatus(context) == 0;
        }
        return Settings.canDrawOverlays(context);
    }

    @SuppressLint({"MissingPermission"})
    private static String getDeviceUniqueID(Context context) {
        return DeviceIdCompat.getDeviceId(context);
    }

    public static int getFloatPermissionStatus(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        String packageName = context.getPackageName();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.iqoo.secure.provider.secureprovider/allowfloatwindowapp"), null, "pkgname = ?", new String[]{packageName}, null);
        if (cursorQuery == null) {
            return getFloatPermissionStatus2(context);
        }
        cursorQuery.getColumnNames();
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return getFloatPermissionStatus2(context);
        }
        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("currentlmode"));
        cursorQuery.close();
        return i;
    }

    private static int getFloatPermissionStatus2(Context context) {
        String packageName = context.getPackageName();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/float_window_apps"), null, "pkgname = ?", new String[]{packageName}, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("currentmode"));
                cursorQuery.close();
                return i;
            }
            cursorQuery.close();
        }
        return 1;
    }

    public static String getSystemCpuAbi() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean isSystemSupportArm64() {
        return CpuConstant.CPU_ARMEABI_V8A.equalsIgnoreCase(getSystemCpuAbi());
    }

    public static Uri requireNonNull(Uri... uriArr) {
        if (uriArr == null) {
            return null;
        }
        for (Uri uri : uriArr) {
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }

    public static void runMainThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (isMainThread()) {
            runnable.run();
        } else {
            MAIN_HANDLER.post(runnable);
        }
    }

    public static void runOnThread(Handler handler, Runnable runnable) {
        if (handler.getLooper() != Looper.myLooper()) {
            handler.post(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void silentCloseInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void silentCloseOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void startActivity(Context context, Intent intent, int i) {
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, i);
            return;
        }
        intent.addFlags(268435456);
        intent.addFlags(131072);
        context.startActivity(intent);
    }
}
