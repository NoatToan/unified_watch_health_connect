package com.huawei.hms.maps.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.MapClientIdentify;
import com.huawei.hms.maps.utils.DynamicUtil;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f14180a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ICreator f14181b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f14182c = true;
    private static volatile boolean d = false;
    private static int e;
    private static SharedPreferences f;

    public static void a() {
        f14180a = null;
        f14181b = null;
    }

    public static ICreator b(Context context) {
        synchronized (mab.class) {
            Preconditions.checkNotNull(context);
            ICreator iCreator = f14181b;
            if (iCreator != null) {
                return iCreator;
            }
            LogM.i("MapCreator", "Making Creator dynamically");
            ICreator iCreator2 = null;
            try {
                Context contextE = e(context);
                if (contextE == null) {
                    LogM.e("MapCreator", "getRemoteMapContext failed");
                    return null;
                }
                Object objNewInstance = contextE.getClassLoader().loadClass("com.huawei.hms.maps.CreatorImpl").newInstance();
                if (objNewInstance instanceof IBinder) {
                    ICreator iCreatorAsInterface = ICreator.Stub.asInterface((IBinder) objNewInstance);
                    iCreatorAsInterface.init(ObjectWrapper.wrap(contextE.getResources()), 1000);
                    iCreator2 = iCreatorAsInterface;
                }
                f14181b = iCreator2;
                return iCreator2;
            } catch (Throwable unused) {
                LogM.e("MapCreator", "loadClass failed");
                f14180a = null;
                DynamicUtil.setDynamicModule(null);
                return null;
            }
        }
    }

    public static ICreator a(Context context) {
        if (!DynamicUtil.isAndroidN()) {
            return f14181b;
        }
        LogM.i("MapCreator", "get creator async.");
        return b(context);
    }

    protected static void b(boolean z) {
        f14182c = z;
    }

    public static void a(boolean z) {
        SharedPreferences sharedPreferences = f;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean("providerUpdateFlag", z).apply();
    }

    public static SharedPreferences f(Context context) {
        if (f == null) {
            f = context.getSharedPreferences("com.huawei.hmsmap.updateFlag", 0);
        }
        return f;
    }

    public static Context e(Context context) {
        MapClientIdentify.setAppContext(context);
        Context context2 = f14180a;
        if (context2 != null) {
            return context2;
        }
        Context contextD = d(context);
        f14180a = contextD;
        return contextD;
    }

    private static Context d(Context context) {
        String str;
        String str2;
        try {
            DynamicUtil.handlerDynamicLoadAfterLogic("huawei_module_huaweimaps", context);
            if (DynamicUtil.getDynamicModule() == null) {
                synchronized (mab.class) {
                    if (DynamicUtil.getDynamicModule() == null) {
                        DynamicUtil.setDynamicModule(DynamicModule.loadV3(context, DynamicModule.PREFER_HIGHEST_OR_REMOTE_VERSION, "huawei_module_huaweimaps"));
                    }
                }
            }
            if (DynamicUtil.getDynamicModule() != null) {
                return DynamicUtil.getDynamicModule().getModuleContext();
            }
        } catch (DynamicModule.LoadingException e2) {
            LogM.e("MapCreator", "Loading mapRoute dynamically failed, exception is " + e2.getMessage());
            try {
                Bundle bundle = e2.getBundle();
                if (bundle == null || bundle.getInt("errcode") != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getRemoteContext: LoadingException: ");
                    if (bundle == null) {
                        str = "bundle = null";
                    } else {
                        str = "errcode = " + bundle.getInt("errcode");
                    }
                    sb.append(str);
                    sb.append(", and retryCount is ");
                    sb.append(e);
                    LogM.e("MapCreator", sb.toString());
                    if (!DynamicUtil.isAndroidN() && !d && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException unused) {
                            LogM.e("MapCreator", "InterruptedException: getRemoteContext failed.");
                        }
                        int i = e;
                        if (i < 200) {
                            e = i + 1;
                            return d(context);
                        }
                        str2 = "Failed to obtain remote context. The maximum number of times has been reached.";
                        LogM.e("MapCreator", str2);
                    }
                } else {
                    LogM.e("MapCreator", "getRemoteContext: LoadingException: errcode = " + bundle.getInt("errcode"));
                    Intent intent = (Intent) bundle.getParcelable("resolution");
                    if (intent == null) {
                        LogM.e("MapCreator", "null intent, please check it.");
                        return null;
                    }
                    LogM.e("MapCreator", "get intent successfully.");
                    intent.setFlags(268435456);
                    if (f14182c) {
                        try {
                            context.startActivity(intent);
                            f14182c = false;
                            LogM.e("MapCreator", "startUpdateActivity Success.");
                        } catch (ActivityNotFoundException unused2) {
                            str2 = "startActivity error ActivityNotFound.";
                            LogM.e("MapCreator", str2);
                        }
                    }
                }
            } catch (Throwable unused3) {
                LogM.e("MapCreator", "get bundleInfo error: ");
            }
        }
        return null;
    }

    public static ICreator c(Context context) {
        d = true;
        ICreator iCreatorB = b(context);
        d = false;
        return iCreatorB;
    }
}
