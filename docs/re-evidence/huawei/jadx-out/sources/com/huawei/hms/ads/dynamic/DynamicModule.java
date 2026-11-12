package com.huawei.hms.ads.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hms.ads.analysis.DynamicLoaderAnalysis;
import com.huawei.hms.ads.common.inter.LoaderCommonInter;
import com.huawei.hms.ads.common.inter.LoaderSpHandlerInter;
import com.huawei.hms.ads.dynamicloader.g;
import com.huawei.hms.ads.uiengineloader.aa;
import com.huawei.hms.ads.uiengineloader.af;
import com.huawei.hms.ads.uiengineloader.d;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NORMAL = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static LoaderSpHandlerInter f12758a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static LoaderCommonInter f12759b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12760c = "DynamicModule";
    private static final int d = 256;
    private static final int e = -100;
    private static final ThreadLocal<HashMap<String, Boolean>> f = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, String>> g = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, IDynamicLoader>> h = new ThreadLocal<>();
    private Context i;

    public final Context getModuleContext() {
        return this.i;
    }

    public static void setSpHandler(LoaderSpHandlerInter loaderSpHandlerInter) {
        f12758a = loaderSpHandlerInter;
    }

    public static void setCommonInter(LoaderCommonInter loaderCommonInter) {
        f12759b = loaderCommonInter;
    }

    public static Bundle queryHMSModuleBundle(Context context, String str) throws LoadingException, a {
        byte b2 = 0;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new a("Query remote version failed: null contentResolver.", b2);
            }
            Bundle bundleCall = contentResolver.call(Uri.parse("content://com.huawei.hms"), str, (String) null, (Bundle) null);
            if (bundleCall == null) {
                af.c(f12760c, "Failed to get bundle info:null.");
                throw new a("Query remote version failed: null bundle info.", b2);
            }
            int i = bundleCall.getInt("errcode");
            bundleCall.getString("loader_path");
            af.b(f12760c, "bundle info: errorCode:" + i + ", moduleVersion:" + bundleCall.getInt("module_version") + ", loader_version:" + bundleCall.getInt("loader_version") + ", armeabiType:" + bundleCall.getInt("armeabiType"));
            if (i == 0) {
                return bundleCall;
            }
            af.c(f12760c, "Failed to get " + str + " bundle info, errcode:" + i);
            throw new LoadingException("Query " + str + " unavailable, errorCode:" + i, bundleCall);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a("failed to get :" + str + " info.", b2);
        }
    }

    public static DynamicModule load(Context context, Integer num, String str, String str2) throws LoadingException {
        if (context == null || num == null || TextUtils.isEmpty(str) || str.length() > 256) {
            DynamicLoaderAnalysis.getInstance().onLoaderException(str, 1, "Null param, please check it.");
            throw new LoadingException("Null param, please check it.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.huawei.hms.ads.dynamic.a.n, str2);
        return a(context, num, str, bundle);
    }

    public static LoaderSpHandlerInter getSpHandler() {
        return f12758a;
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        try {
            Bundle bundleB = b(context, str);
            if (bundleB != null && !bundleB.isEmpty()) {
                return bundleB.getInt("module_version");
            }
            af.c(f12760c, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.");
        } catch (a e2) {
            af.c(f12760c, "Query remote module:" + str + " exception:" + e2.getClass().getSimpleName());
            return 0;
        }
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
            synchronized (DynamicModule.class) {
                ThreadLocal<HashMap<String, Boolean>> threadLocal = f;
                if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                    Bundle bundleA = a(context, str);
                    if (bundleA.getInt("module_version") > 0) {
                        return bundleA;
                    }
                }
                if (threadLocal.get().get(str).booleanValue()) {
                    try {
                        return b(context, str);
                    } catch (a e2) {
                        af.c(f12760c, "Query remote module info in HMS failed." + e2.getClass().getSimpleName());
                    }
                }
                return new Bundle();
            }
        } catch (LoadingException e3) {
            throw e3;
        } catch (Exception e4) {
            af.c(f12760c, "Get remote module info for " + str + " failed." + e4.getClass().getSimpleName());
        }
    }

    public static int getLocalVersion(Context context, String str) {
        String strConcat;
        if (context == null || str.length() == 0 || str.length() > 256) {
            af.d(f12760c, "Invalid context or moduleName.");
            return 0;
        }
        try {
            String str2 = "com.huawei.hms.ads.dynamic.descriptors." + str + ".ModuleDescriptor";
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            strConcat = "Cannot find the class of module descriptor for ".concat(String.valueOf(str));
            af.c(f12760c, strConcat);
            return 0;
        } catch (Exception e2) {
            strConcat = "Get local module info failed." + e2.getClass().getSimpleName();
            af.c(f12760c, strConcat);
            return 0;
        }
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString("module_name", str);
        bundle.putInt("local_module_version", localVersion);
        return bundle;
    }

    public static LoaderCommonInter getCommonInter() {
        return f12759b;
    }

    private static Bundle b(Context context, String str) throws LoadingException, a {
        try {
            Bundle bundleQueryHMSModuleBundle = queryHMSModuleBundle(context, str);
            String string = bundleQueryHMSModuleBundle.getString("loader_path");
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                g.set(new HashMap<String, String>(str, string) { // from class: com.huawei.hms.ads.dynamic.DynamicModule.2

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f12762a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ String f12763b;

                    {
                        this.f12762a = str;
                        this.f12763b = string;
                        put(str, string);
                    }
                });
                af.b(f12760c, "Query remote version by module name:" + str + " success.");
                return bundleQueryHMSModuleBundle;
            }
            af.c(f12760c, "The loaderPath in query bundle is not available,change the module version to:-100");
            bundleQueryHMSModuleBundle.putInt("module_version", -100);
            return bundleQueryHMSModuleBundle;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a("failed to Query remote version.", (byte) 0);
        }
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 256;
    }

    private static void a(String str, ClassLoader classLoader) throws LoadingException {
        try {
            h.set(new HashMap<String, IDynamicLoader>(str, (IBinder) classLoader.loadClass(com.huawei.hms.ads.dynamic.a.f12773b).getConstructor(new Class[0]).newInstance(new Object[0])) { // from class: com.huawei.hms.ads.dynamic.DynamicModule.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f12764a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ IBinder f12765b;

                {
                    this.f12764a = str;
                    this.f12765b = iBinder;
                    put(str, IDynamicLoader.Stub.asInterface(iBinder));
                }
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to get loader interface:" + e2.getMessage());
        }
    }

    private static Class<?> a(Context context) throws LoadingException {
        Class<?> clsLoadClass;
        try {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            clsLoadClass = context.getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
        } catch (ClassNotFoundException unused) {
            af.c(f12760c, "ClassLoader class not found when use client context.");
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            try {
                clsLoadClass = ((ClassLoader) Objects.requireNonNull(DynamicModule.class.getClassLoader())).loadClass(DynamicLoaderClassLoader.class.getName());
                if (clsLoadClass == null) {
                    throw new LoadingException("ClassLoader class is null.");
                }
            } catch (ClassNotFoundException unused2) {
                throw new LoadingException("ClassLoader class not found when use DynamicModule's classLoader.");
            }
        }
        return clsLoadClass;
    }

    private static DynamicModule a(Context context, String str, Integer num, Bundle bundle) throws LoadingException {
        int iIntValue = num.intValue();
        bundle.putString("module_name", str);
        bundle.putInt("version_strategy_type", iIntValue);
        try {
            g gVar = new g();
            af.b(f12760c, "new DynamicLoader.");
            Context contextA = a(context.getApplicationContext() == null ? context : context.getApplicationContext(), str, bundle, gVar);
            if (contextA != null) {
                return new DynamicModule(contextA);
            }
            throw new LoadingException("New version policy: Failed to get module context: null.");
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            af.d(f12760c, "Other exception," + e3.getClass().getSimpleName());
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return new DynamicModule(context);
        }
    }

    private static DynamicModule a(Context context, String str, Bundle bundle) throws LoadingException {
        g gVar = new g();
        af.b(f12760c, "new DynamicLoader.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Context contextA = a(context, str, bundle, gVar);
        if (contextA != null) {
            return new DynamicModule(contextA);
        }
        throw new LoadingException("New version policy: Failed to get module context: null.");
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static class DynamicLoaderClassLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static HashMap<String, ClassLoader> f12766a = new HashMap<>();

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f12766a.put(str, classLoader);
        }

        public static ClassLoader getsClassLoader(String str) {
            return f12766a.get(str);
        }
    }

    private static DynamicModule a(Context context, Integer num, String str, Bundle bundle) throws LoadingException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!aa.a(context)) {
                DynamicLoaderAnalysis.getInstance().onLoaderException(str, 2, "HMS not installed.");
                throw new LoadingException("HMS not installed.");
            }
            if (!d.a()) {
                String strA = d.a("ro.build.2b2c.partner.ext_channel");
                if (TextUtils.isEmpty(strA) || !strA.startsWith(com.huawei.hms.ads.dynamic.a.t)) {
                    DynamicLoaderAnalysis.getInstance().onLoaderException(str, 3, "Do not allow loading on other devices.");
                    throw new LoadingException("Do not allow loading on other devices.");
                }
            }
            af.b(f12760c, "Load start in new-version-policy.");
            DynamicModule dynamicModuleA = a(context, str, num, bundle);
            DynamicLoaderAnalysis.getInstance().onLoaderSuccess(str, System.currentTimeMillis() - jCurrentTimeMillis);
            return dynamicModuleA;
        } catch (LoadingException e2) {
            DynamicLoaderAnalysis.getInstance().onLoaderException(str, 4, e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            af.d(f12760c, "Other exception:" + e3.getClass().getSimpleName());
            DynamicLoaderAnalysis.getInstance().onLoaderException(str, 4, "Other exception, " + e3.getClass().getSimpleName());
            throw new LoadingException("Load failed.");
        }
    }

    public static class LoadingException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bundle f12767a;

        public Bundle getBundle() {
            return this.f12767a;
        }

        public LoadingException(String str, Bundle bundle) {
            super(str);
            this.f12767a = bundle;
        }

        public LoadingException(String str) {
            super(str);
        }
    }

    private static Bundle a(Context context, String str) throws LoadingException {
        boolean z = false;
        try {
            try {
                Class<?> clsA = a(context);
                Method declaredMethod = clsA.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = clsA.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader == null) {
                    try {
                        af.b(f12760c, "No available cached loader, query remote.");
                        Bundle bundleB = b(context, str);
                        synchronized (DynamicModule.class) {
                            String str2 = (String) ((HashMap) Objects.requireNonNull(g.get())).get(str);
                            if (TextUtils.isEmpty(str2)) {
                                return bundleB;
                            }
                            com.huawei.hms.ads.uiengineloader.g gVar = new com.huawei.hms.ads.uiengineloader.g(str2, ClassLoader.getSystemClassLoader());
                            a(str, gVar);
                            declaredMethod2.invoke(null, str, gVar);
                            f.set(new HashMap<String, Boolean>(str) { // from class: com.huawei.hms.ads.dynamic.DynamicModule.1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                final /* synthetic */ String f12761a;

                                {
                                    this.f12761a = str;
                                    put(str, Boolean.TRUE);
                                }
                            });
                            return bundleB;
                        }
                    } catch (a unused) {
                    }
                } else if (classLoader != ClassLoader.getSystemClassLoader()) {
                    af.b(f12760c, "Cached loader is available, ready to use it.");
                    try {
                        a(str, classLoader);
                    } catch (LoadingException e2) {
                        af.c(f12760c, "Get loader interface failed." + e2.getClass().getSimpleName());
                    }
                    z = true;
                }
            } catch (LoadingException e3) {
                throw e3;
            }
        } catch (Exception e4) {
            af.c(f12760c, "failed to load." + e4.getClass().getSimpleName());
        }
        HashMap<String, Boolean> map = new HashMap<>();
        map.put(str, Boolean.valueOf(z));
        f.set(map);
        return new Bundle();
    }

    /* JADX INFO: loaded from: classes33.dex */
    static final class a extends Exception {
        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper iObjectWrapperLoad = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt("module_version"), ObjectWrapper.wrap(bundle));
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperLoad);
            if (objUnwrap == null) {
                af.c(f12760c, "Get remote context is null, module:".concat(String.valueOf(str)));
                return null;
            }
            if (objUnwrap instanceof Context) {
                af.b(f12760c, "Get context for module:" + str + " success.");
                return (Context) objUnwrap;
            }
            if (!objUnwrap.getClass().getName().equals(LoadingException.class.getName())) {
                af.c(f12760c, "Get remote context is null, module:".concat(String.valueOf(str)));
                return null;
            }
            Bundle bundle2 = (Bundle) ObjectWrapper.unwrap(iObjectWrapperLoad).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(iObjectWrapperLoad), new Object[0]);
            af.c(f12760c, "Successfully get the bundle in exception.");
            throw new LoadingException("Failed to load, please check the bundle in exception.", bundle2);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            af.c(f12760c, "Failed to get module context for:" + str + " " + e3.getClass().getSimpleName());
            return null;
        }
    }

    private DynamicModule(Context context) {
        this.i = context;
    }
}
