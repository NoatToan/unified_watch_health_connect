package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.scankit.p.b4;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.y3;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13542a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13543b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13544c = false;
    static int d = Integer.MIN_VALUE;
    static int e = Integer.MIN_VALUE;
    private static volatile Context f;

    public static int a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("huawei_module_scankit_local", Integer.MAX_VALUE);
        } catch (PackageManager.NameNotFoundException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "NameNotFoundException");
            return Integer.MAX_VALUE;
        }
    }

    public static void b(Context context) throws IllegalAccessException, InvocationTargetException {
        context.getClassLoader().loadClass("com.huawei.hms.feature.DynamicModuleInitializer").getDeclaredMethod("initializeModule", Context.class).invoke(null, context);
    }

    static IRemoteCreator c(Context context) {
        Preconditions.checkNotNull(context);
        try {
            Context contextE = e(context);
            if (contextE == null) {
                return null;
            }
            Object objNewInstance = contextE.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
            if (objNewInstance instanceof IBinder) {
                return IRemoteCreator.Stub.asInterface((IBinder) objNewInstance);
            }
        } catch (ClassNotFoundException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalAccessException");
        } catch (InstantiationException unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "InstantiationException");
        } catch (NoSuchMethodException unused4) {
            o4.b(TrackConstants$Events.EXCEPTION, "NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            o4.b(TrackConstants$Events.EXCEPTION, "InvocationTargetException");
        }
        return null;
    }

    static IRemoteCreator d(Context context) {
        Preconditions.checkNotNull(context);
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
            if (objNewInstance instanceof IBinder) {
                return IRemoteCreator.Stub.asInterface((IBinder) objNewInstance);
            }
            return null;
        } catch (ClassNotFoundException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "IllegalAccessException");
            return null;
        } catch (InstantiationException unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "InvocationTargetException");
            return null;
        }
    }

    public static Context e(Context context) {
        Log.i("ScankitSDK", "ScankitSDK Version: SCAN2.13.0.303");
        b(context);
        if (f != null && !a()) {
            Log.i("ScankitSDK", "context has been inited");
            return f;
        }
        try {
            b4.f15996a = false;
            if (d == Integer.MIN_VALUE) {
                d = a(context);
            }
            Context moduleContext = DynamicModule.load(context.getApplicationContext(), DynamicModule.PREFER_REMOTE, "huawei_module_scankit").getModuleContext();
            if (e == Integer.MIN_VALUE) {
                e = DynamicModule.getRemoteVersion(context.getApplicationContext(), "huawei_module_scankit");
            }
            if (d >= 21200300) {
                f13544c = true;
            } else {
                f13544c = false;
            }
            String strB = y3.b(context);
            o4.d("ScankitSDK", "local Version: " + d + " remote Version: " + e);
            if (!a() && d < e && !strB.equals("com.huawei.scanner")) {
                f13542a = true;
                b4.f15996a = true;
                b4.f15997b = String.valueOf(e);
                Log.i("ScankitSDK", "use remote scankit " + e);
                f = moduleContext;
                return f;
            }
            o4.d("ScankitSDK", "use local Version: " + d);
            b(context);
            f13542a = false;
            f = null;
            return context;
        } catch (DynamicModule.LoadingException e2) {
            o4.b("ScankitSDK", "ClassNotFoundException exception " + e2.getMessage());
            b(context);
            return context;
        } catch (ClassNotFoundException unused) {
            o4.b("ScankitSDK", "ClassNotFoundException exception");
            b(context);
            return context;
        } catch (IllegalAccessException unused2) {
            o4.b("ScankitSDK", "IllegalAccessException exception");
            b(context);
            return context;
        } catch (NoSuchMethodException unused3) {
            o4.b("ScankitSDK", "NoSuchMethodException exception");
            b(context);
            return context;
        } catch (RuntimeException unused4) {
            o4.b("ScankitSDK", "other RuntimeException exception");
            b(context);
            return context;
        } catch (InvocationTargetException unused5) {
            o4.b("ScankitSDK", "InvocationTargetException exception");
            b(context);
            return context;
        } catch (Exception unused6) {
            o4.b("ScankitSDK", "Exception exception");
            b(context);
            return context;
        } catch (Throwable unused7) {
            o4.b("ScankitSDK", "Throwable exception");
            b(context);
            return context;
        }
    }

    public static boolean a() {
        return f13544c && f13542a && f13543b;
    }
}
