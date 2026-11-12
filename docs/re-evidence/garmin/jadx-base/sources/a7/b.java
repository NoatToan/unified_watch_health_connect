package a7;

import am.j;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import j20.x;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import vb.h;
import z6.a0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class b {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";

    public static class a {
        private a() {
        }

        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            x.l("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return a0.a(context).f202582b.areNotificationsEnabled() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? a.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int i14) {
        return context.getColor(i14);
    }

    public static ColorStateList getColorStateList(Context context, int i14) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        b7.g.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        b7.g.b bVar = new b7.g.b(resources, theme);
        synchronized (b7.g.f16257c) {
            try {
                SparseArray<b7.g.a> sparseArray = b7.g.f16256b.get(bVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i14)) == null) {
                    colorStateList = null;
                } else {
                    if (aVar.f16259b.equals(bVar.f16261a.getConfiguration())) {
                        Resources.Theme theme2 = bVar.f16262b;
                        if (theme2 != null || aVar.f16260c != 0) {
                            if (theme2 == null || aVar.f16260c != theme2.hashCode()) {
                            }
                        }
                        colorStateList = aVar.f16258a;
                    }
                    sparseArray.remove(i14);
                    colorStateList = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        resources.getValue(i14, typedValue, true);
        int i15 = typedValue.type;
        if (i15 < 28 || i15 > 31) {
            try {
                colorStateListA = b7.c.a(resources, resources.getXml(i14), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i14, theme);
        }
        synchronized (b7.g.f16257c) {
            try {
                WeakHashMap<b7.g.b, SparseArray<b7.g.a>> weakHashMap = b7.g.f16256b;
                SparseArray<b7.g.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i14, new b7.g.a(colorStateListA, bVar.f16261a.getConfiguration(), theme));
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return colorStateListA;
    }

    public static Context getContextForLanguage(Context context) {
        h7.g gVarA;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            Object systemService = context.getSystemService("locale");
            gVarA = systemService != null ? h7.g.b(z6.g.a(systemService)) : h7.g.f82327b;
        } else {
            gVarA = h7.g.a(z6.c.b(context));
        }
        if (i14 > 32 || gVarA.f82328a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocales(gVarA.f82328a.getLocaleList());
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return context.getDataDir();
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? a.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i14) {
        return context.getDrawable(i14);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return context.getMainExecutor();
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i14) {
        return getContextForLanguage(context).getString(i14);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (g.a(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (g.a(context, str) == 0) {
                return str;
            }
        }
        kg.f.n(j.m("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i14) {
        int i15 = i14 & 1;
        if (i15 != 0 && (i14 & 4) != 0) {
            h.s("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i15 != 0) {
            i14 |= 2;
        }
        int i16 = i14;
        int i17 = i16 & 2;
        if (i17 == 0 && (i16 & 4) == 0) {
            h.s("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i17 != 0 && (i16 & 4) != 0) {
            h.s("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i16);
        }
        return ((i16 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i16 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i14) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i14);
    }
}
