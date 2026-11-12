package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.FileUtils;
import com.huawei.hms.common.util.Logger;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NEED_UPDATE = 2;
    public static final int MODULE_NORMAL = 0;
    public static final int MODULE_NOT_EXIST = 1;
    public static final int MODULE_NOT_PRESET_HSF = 5;
    public static final int MODULE_NOT_READY = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13132b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13133c = -100;
    private static final String h = "com.huawei.hms.min_api_level:dynamic-api:huawei_module_dynamicloader";
    private static final String i = "com.huawei.hms.kit.api_level:huawei_module_dynamicloader";
    private static final int j = -1;
    private static int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static int n;
    private Context q;
    public static final VersionPolicy PREFER_REMOTE = new com.huawei.hms.feature.dynamic.e.e();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.huawei.hms.feature.dynamic.e.c();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.huawei.hms.feature.dynamic.e.d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.huawei.hms.feature.dynamic.e.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13131a = "DynamicModule";
    private static final ThreadLocal<HashMap<String, Boolean>> d = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, String>> e = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, IDynamicLoader>> f = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, ClassLoader>> g = new ThreadLocal<>();
    private static HashMap<String, Boolean> o = new HashMap<>();
    private static HashMap<String, Boolean> p = new HashMap<>();

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    public final Context getModuleContext() {
        return this.q;
    }

    public static Bundle queryHMSModuleBundle(Context context, String str, Bundle bundle) throws g, LoadingException {
        a aVar = null;
        try {
            if (!com.huawei.hms.feature.dynamic.f.c.a(context)) {
                Logger.w(f13131a, "No valid HMS Core in this device.");
                throw new g("HMS Core is not installed.", aVar);
            }
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new g("Query remote version failed: null contentResolver.", aVar);
            }
            Bundle bundleCall = contentResolver.call(Uri.parse("content://com.huawei.hms"), str, (String) null, bundle);
            if (bundleCall == null) {
                Logger.w(f13131a, "Failed to get bundle info:null.");
                throw new g("Query remote version failed: null bundle info.", aVar);
            }
            int i2 = bundleCall.getInt("errcode");
            String string = bundleCall.getString("loader_path");
            String str2 = f13131a;
            Logger.i(str2, "bundle info: errorCode:" + i2 + ", moduleVersion:" + bundleCall.getInt("module_version") + ", modulePath:" + bundleCall.getString("module_path") + ", loader_version:" + bundleCall.getInt("loader_version") + ", loaderPath:" + string + ", armeabiType:" + bundleCall.getInt("armeabiType"));
            if (i2 == 0) {
                return bundleCall;
            }
            Logger.w(str2, "Failed to get " + str + " bundle info, errcode:" + i2);
            throw new LoadingException("Query " + str + " unavailable, errorCode:" + i2, bundleCall);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new g("failed to get :" + str + " info from HMS Core.", aVar);
        }
    }

    public static Bundle queryHMSModuleBundle(Context context, String str) throws g, LoadingException {
        return queryHMSModuleBundle(context, str, null);
    }

    public static DynamicModule loadV3(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws LoadingException {
        bundle.putString("loader_version_type", com.huawei.hms.feature.dynamic.b.u);
        return b(context, versionPolicy, str, bundle);
    }

    public static DynamicModule loadV3(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        return loadV3(context, versionPolicy, str, new Bundle());
    }

    public static DynamicModule loadV2(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        Bundle bundle = new Bundle();
        bundle.putString("loader_version_type", "v2");
        return b(context, versionPolicy, str, bundle);
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        return b(context, versionPolicy, str, new Bundle());
    }

    public static void install(Context context, int i2) {
        String str = f13131a;
        Logger.i(str, "dynamic-api version: 10025300");
        if (context == null) {
            Logger.e(str, "The input context is null.");
            return;
        }
        try {
            n = i2;
            Logger.i(str, "Query HMS provider timeOut is set to:" + n + " ms.");
            IDynamicInstall iDynamicInstallB = b(context);
            if (iDynamicInstallB == null) {
                throw new LoadingException("Get dynamicInstaller failed.");
            }
            Bundle bundleInstall = iDynamicInstallB.install(ObjectWrapper.wrap(context), new Bundle());
            if (bundleInstall == null) {
                throw new LoadingException("Get install info failed: moduleBundle is null.");
            }
            com.huawei.hms.feature.dynamic.d.a().a(bundleInstall);
            Logger.i(str, "Install module success.");
        } catch (RemoteException | LoadingException | NullPointerException e2) {
            if (k == 2 || getLocalVersion(context, com.huawei.hms.feature.dynamic.b.e) <= 0) {
                Logger.w(f13131a, "Install module failed.", e2);
                return;
            }
            String str2 = f13131a;
            Logger.i(str2, "Ready to use local loader-fallback to retry:");
            try {
                Bundle bundleInstall2 = d(context).install(ObjectWrapper.wrap(context), new Bundle());
                if (bundleInstall2 == null) {
                    throw new LoadingException("Retry: get install info failed: moduleBundle is null.");
                }
                com.huawei.hms.feature.dynamic.d.a().a(bundleInstall2);
                Logger.i(str2, "Retry install module with local loader-fallback success.");
            } catch (RemoteException | LoadingException | NullPointerException e3) {
                Logger.w(f13131a, "Retry failed with local loader-fallback.", e3);
            }
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        try {
            Bundle bundleD = d(context, str);
            if (bundleD != null && !bundleD.isEmpty()) {
                return bundleD.getInt("module_version");
            }
            Logger.w(f13131a, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.");
        } catch (g e2) {
            Logger.w(f13131a, "Query remote module:" + str + " exception:" + e2);
            return 0;
        }
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
            synchronized (DynamicModule.class) {
                ThreadLocal<HashMap<String, Boolean>> threadLocal = d;
                if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                    Bundle bundleB = b(context, str);
                    if (bundleB.getInt("module_version") > 0) {
                        return bundleB;
                    }
                }
                if (threadLocal.get().get(str).booleanValue()) {
                    try {
                        return d(context, str);
                    } catch (g e2) {
                        Logger.w(f13131a, "Query remote module info in HMS failed.", e2);
                    }
                }
                return new Bundle();
            }
        } catch (LoadingException e3) {
            throw e3;
        } catch (Exception e4) {
            Logger.w(f13131a, "Get remote module info for " + str + " failed.", e4);
        }
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.e(f13131a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            String str2 = "com.huawei.hms.feature.dynamic.descriptors." + str + ".ModuleDescriptor";
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(f13131a, "Cannot find the class of module descriptor for " + str);
            return 0;
        } catch (Exception e2) {
            Logger.w(f13131a, "Get local module info failed.", e2);
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

    public static Set<String> getInstalledModuleInfo() {
        return com.huawei.hms.feature.dynamic.d.a().f13173c;
    }

    public static void enableLowEMUI(String str, boolean z) {
        p.put(str, Boolean.valueOf(z));
    }

    public static void enable3rdPhone(String str, boolean z) {
        o.put(str, Boolean.valueOf(z));
    }

    private static IDynamicInstall d(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(com.huawei.hms.feature.dynamic.b.g).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e2.getMessage());
        }
    }

    private static Bundle d(Context context, String str) throws g, LoadingException {
        try {
            Bundle bundleQueryHMSModuleBundle = queryHMSModuleBundle(context, str);
            String string = bundleQueryHMSModuleBundle.getString("loader_path");
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                e.set(new e(str, string));
                Logger.i(f13131a, "Query remote version by module name:" + str + " success.");
                return bundleQueryHMSModuleBundle;
            }
            Logger.w(f13131a, "The loader_path:" + string + " in query bundle is not available,change the module version to:-100");
            bundleQueryHMSModuleBundle.putInt("module_version", -100);
            return bundleQueryHMSModuleBundle;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new g("failed to Query remote version.", null);
        }
    }

    private static DynamicModule c(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                bool = (Boolean) ((HashMap) Objects.requireNonNull(d.get())).get(str);
                iDynamicLoader = (IDynamicLoader) ((HashMap) Objects.requireNonNull(f.get())).get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.");
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context contextA = a(context, str, bundle, iDynamicLoader);
            if (contextA != null) {
                return new DynamicModule(contextA);
            }
            throw new LoadingException("Failed to get remote module context: null");
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.");
        }
    }

    private static int c(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 128);
            if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getInt(i, -1);
            }
            Logger.w(f13131a, "packageInfo or applicationInfo or metaData is null.");
            return -1;
        } catch (Throwable th) {
            Logger.w(f13131a, "failed to getLoaderApiLevel: " + th.getMessage());
            return -1;
        }
    }

    private static int c(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getInt(h, -1);
            }
            Logger.w(f13131a, "applicationInfo or metaData is null.");
            return -1;
        } catch (Throwable unused) {
            Logger.w(f13131a, "failed to getLoaderMinApiLevel.");
            return -1;
        }
    }

    private static IDynamicInstall b(Context context) throws LoadingException {
        int i2;
        String string = null;
        int localVersion = 0;
        try {
            Bundle bundleA = a(context, (Bundle) null);
            string = bundleA.getString("loader_path");
            i2 = bundleA.getInt("loader_version");
        } catch (Exception e2) {
            Logger.w(f13131a, "Cannot get remote HMS dynamicLoader.", e2);
            i2 = 0;
        }
        try {
            localVersion = getLocalVersion(context, com.huawei.hms.feature.dynamic.b.e);
        } catch (Exception e3) {
            Logger.w(f13131a, "Cannot find local dynamicLoader fallback.", e3);
        }
        String str = f13131a;
        Logger.i(str, "DynamicLoader remoteHMSVersion:" + i2 + ", hmsLoaderPath:" + string + ", localLoaderVersion:" + localVersion);
        int iMax = Math.max(i2, localVersion);
        if (iMax <= 10009300) {
            Logger.w(str, "The current version:" + iMax + " is too low.");
            throw new LoadingException("The loader version:" + iMax + " is too low to support HFF.");
        }
        if (i2 <= localVersion) {
            Logger.i(str, "Choose local dynamicLoader fallback: ");
            k = 2;
            return d(context);
        }
        Logger.i(str, "Choose hms dynamicLoader: " + string);
        k = 1;
        return a(context, string);
    }

    private static DynamicModule b(Context context, String str, Bundle bundle) throws LoadingException {
        ClassLoader classLoader;
        synchronized (DynamicModule.class) {
            ThreadLocal<HashMap<String, ClassLoader>> threadLocal = g;
            if (threadLocal.get() == null || threadLocal.get().get(str) == null) {
                Logger.i(f13131a, "No available cached loader for module:" + str);
                classLoader = null;
            } else {
                Logger.i(f13131a, "Cached loader for module is available, ready to use it.");
                classLoader = threadLocal.get().get(str);
            }
        }
        IDynamicLoader iDynamicLoaderA = a(context, str, bundle.getString("loader_path"), classLoader);
        if (iDynamicLoaderA == null) {
            throw new LoadingException("Failed to get iDynamicLoader: null.");
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Context contextA = a(context, str, bundle, iDynamicLoaderA);
        if (contextA != null) {
            return new DynamicModule(contextA);
        }
        throw new LoadingException("New version policy: Failed to get module context: null.");
    }

    private static DynamicModule b(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws Throwable {
        String str2 = f13131a;
        Logger.i(str2, "dynamic-api version: 10025300");
        a(context, versionPolicy, str, bundle);
        try {
            int iA = a(context, str, bundle);
            if (iA >= 10015300) {
                Logger.i(str2, "Load start in new-version-policy.");
                return a(context, str, versionPolicy, bundle);
            }
            if (iA <= 0) {
                throw new LoadingException("Cannot find a valid dynamicLoader in HMS and local.");
            }
            Logger.i(str2, "Load start in old-version-policy.");
            return a(context, str, versionPolicy);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.e(f13131a, "Other exception:" + e3);
            throw new LoadingException("Load failed.");
        }
    }

    private static Bundle b(Context context, String str) throws LoadingException {
        boolean z = false;
        try {
            try {
                Class<?> clsA = a(context);
                Method declaredMethod = clsA.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = clsA.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader == null) {
                    try {
                        String str2 = f13131a;
                        Logger.i(str2, "No available cached loader, query remote.");
                        Bundle bundleD = d(context, str);
                        synchronized (DynamicModule.class) {
                            String str3 = (String) ((HashMap) Objects.requireNonNull(e.get())).get(str);
                            if (TextUtils.isEmpty(str3)) {
                                return bundleD;
                            }
                            if (!com.huawei.hms.feature.dynamic.f.c.a(context, str3)) {
                                Logger.w(str2, "The loaderPath is invalid.");
                                throw new LoadingException("getHMSModuleInfo: checkPathValidity failed.");
                            }
                            com.huawei.hms.feature.dynamic.e.a aVar = new com.huawei.hms.feature.dynamic.e.a(str3, ClassLoader.getSystemClassLoader());
                            a(str, aVar);
                            declaredMethod2.invoke(null, str, aVar);
                            d.set(new d(str));
                            return bundleD;
                        }
                    } catch (g unused) {
                    }
                } else if (classLoader != ClassLoader.getSystemClassLoader()) {
                    Logger.i(f13131a, "Cached loader is available, ready to use it.");
                    try {
                        a(str, classLoader);
                    } catch (LoadingException e2) {
                        Logger.w(f13131a, "Get loader interface failed.", e2);
                    }
                    z = true;
                }
            } catch (Exception e3) {
                Logger.w(f13131a, "failed to load.", e3);
            }
            HashMap<String, Boolean> map = new HashMap<>();
            map.put(str, Boolean.valueOf(z));
            d.set(map);
            return new Bundle();
        } catch (LoadingException e4) {
            throw e4;
        }
    }

    private static boolean a(boolean z) {
        return Build.VERSION.SDK_INT >= 34 && z;
    }

    private static boolean a(String str, int i2) {
        Logger.i(f13131a, "copyType: " + i2);
        if (i2 == 1) {
            Boolean bool = p.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        if (i2 != 2) {
            return i2 == 3 || i2 == 4;
        }
        Boolean bool2 = o.get(str);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    private static boolean a(Context context, Bundle bundle, String str) {
        int iC = c(context, str);
        int iA = a(bundle);
        if (iA == -1) {
            iA = c(context);
        }
        Logger.i(f13131a, "Required api_level: " + iA + ",  dynamicloader api_level : " + iC);
        return iA <= iC && iA != -1;
    }

    private static void a(String str, ClassLoader classLoader) throws LoadingException {
        try {
            f.set(new f(str, (IBinder) classLoader.loadClass(com.huawei.hms.feature.dynamic.b.f).getConstructor(new Class[0]).newInstance(new Object[0])));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to get loader interface:" + e2.getMessage());
        }
    }

    private static void a(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256 || bundle == null) {
            throw new LoadingException("Null param, please check it.");
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
            Logger.w(f13131a, "ClassLoader class not found when use client context.");
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

    private static IDynamicLoader a(Context context, String str, String str2, ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = new com.huawei.hms.feature.dynamic.e.a(str2, ClassLoader.getSystemClassLoader());
                g.set(new b(str, classLoader));
            } catch (Exception e2) {
                Logger.w(f13131a, "Get iDynamicLoader failed.", e2);
                return null;
            }
        }
        return IDynamicLoader.Stub.asInterface((IBinder) classLoader.loadClass(com.huawei.hms.feature.dynamic.b.f).getConstructor(new Class[0]).newInstance(new Object[0]));
    }

    private static IDynamicInstall a(Context context, String str) throws LoadingException {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (com.huawei.hms.feature.dynamic.f.c.a(context, str)) {
                        return IDynamicInstall.Stub.asInterface((IBinder) new com.huawei.hms.feature.dynamic.e.a(str, ClassLoader.getSystemClassLoader()).loadClass(com.huawei.hms.feature.dynamic.b.g).getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    Logger.w(f13131a, "check path failed: invalid.");
                    throw new LoadingException("getHMSDynamicInstaller: checkPathValidity failed.");
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e2.getMessage());
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.");
    }

    private static DynamicModule a(Context context, String str, VersionPolicy versionPolicy, Bundle bundle) throws LoadingException {
        int iA = a(versionPolicy);
        String string = bundle.getString("loader_path");
        String str2 = f13131a;
        Logger.i(str2, "The loader path for module:" + str + " is:" + string + ", and versionType is:" + iA);
        if (ModuleCopy.isPathInvalid(string)) {
            throw new LoadingException("Cannot find a valid dynamic loader in HMS or local.");
        }
        File file = new File(string);
        if (!file.exists()) {
            throw new LoadingException("dynamic loader does not exist.");
        }
        if (ModuleCopy.isLocalModuleFile(context, string) && !FileUtils.a(file)) {
            Logger.w(str2, "To set loader readOnly, isReadOnly: false.");
        }
        Boolean bool = p.get(str);
        Boolean bool2 = o.get(str);
        bundle.putString("module_name", str);
        bundle.putInt("version_strategy_type", iA);
        bundle.putBoolean(com.huawei.hms.feature.dynamic.b.x, bool != null ? bool.booleanValue() : false);
        bundle.putBoolean(com.huawei.hms.feature.dynamic.b.y, bool2 != null ? bool2.booleanValue() : false);
        try {
            return b(context, str, bundle);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.e(f13131a, "Other exception,", e3);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return new DynamicModule(context);
        }
    }

    private static DynamicModule a(Context context, String str, VersionPolicy versionPolicy) throws LoadingException {
        Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
        if (moduleInfo.getInt("module_version") <= 0) {
            if (moduleInfo.getInt("local_module_version") <= 0) {
                throw new LoadingException("Query remote version and local version failed.");
            }
            Logger.i(f13131a, "Remote version is invalid, use local context.");
            return new DynamicModule(context.getApplicationContext());
        }
        try {
            return c(context, str, moduleInfo);
        } catch (LoadingException e2) {
            Logger.w(f13131a, "Failed to load remote module.", e2);
            if (getLocalVersion(context, str) <= 0) {
                throw e2;
            }
            Logger.d(f13131a, "Local module version is valid, use local fallback.");
            return new DynamicModule(context.getApplicationContext());
        }
    }

    private static Bundle a(Context context, Bundle bundle) throws g {
        a aVar = null;
        try {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            FutureTask futureTask = new FutureTask(new c(context, bundle));
            executorServiceNewSingleThreadExecutor.execute(futureTask);
            Bundle bundle2 = (Bundle) futureTask.get(n, TimeUnit.MILLISECONDS);
            String string = bundle2.getString("loader_path");
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                Logger.i(f13131a, "Query HMS module:huawei_module_dynamicloader info success.");
                return bundle2;
            }
            Logger.w(f13131a, "The loader_path:" + string + " is not available.");
            throw new g("The loader_path in queryBundle is empty or not exist.", aVar);
        } catch (TimeoutException unused) {
            Logger.w(f13131a, "Query hms provider timeout: over " + n + " ms, choose the local loader fallback.");
            return new Bundle();
        } catch (Exception e2) {
            Logger.w(f13131a, "FutureTask: query provider exception.", e2);
            throw new g("failed to get :huawei_module_dynamicloader info.", aVar);
        }
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader, Bundle bundle2) throws LoadingException {
        Object objUnwrap;
        bundle.putInt("version_strategy_type", 4);
        if (AssetLoadManager.getAssetModuleInfo(context, str).getInt(com.huawei.hms.feature.dynamic.b.m, 0) <= 0) {
            Logger.i(f13131a, "No fallback module in assets.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        try {
            objUnwrap = ObjectWrapper.unwrap(iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt("module_version"), ObjectWrapper.wrap(bundle)));
        } catch (RemoteException e2) {
            Logger.w(f13131a, "tryWithAssetsModule RemoteException.", e2);
            objUnwrap = null;
        }
        if (!(objUnwrap instanceof Context)) {
            Logger.w(f13131a, "tryWithAssetsModule get dynamicContext failed: null or wrong type.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        Logger.i(f13131a, "get dynamic module context for:" + str + " from assets fallback success.");
        return (Context) objUnwrap;
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper iObjectWrapperLoad = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt("module_version"), ObjectWrapper.wrap(bundle));
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperLoad);
            if (objUnwrap == null) {
                Logger.w(f13131a, "Get remote context is null, module:" + str);
                return null;
            }
            if (objUnwrap instanceof Context) {
                Logger.i(f13131a, "Get context for module:" + str + " success.");
                return (Context) objUnwrap;
            }
            if (objUnwrap instanceof Bundle) {
                Logger.i(f13131a, "Get module info bundle for " + str);
                return a(context, str, bundle, iDynamicLoader, (Bundle) objUnwrap);
            }
            if (objUnwrap.getClass().getName().equals(LoadingException.class.getName())) {
                Bundle bundle2 = (Bundle) ObjectWrapper.unwrap(iObjectWrapperLoad).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(iObjectWrapperLoad), new Object[0]);
                Logger.w(f13131a, "Successfully get the bundle in exception.");
                throw new LoadingException("Failed to load, please check the bundle in exception.", bundle2);
            }
            Logger.w(f13131a, "Get remote context is null, module:" + str);
            return null;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.w(f13131a, "Failed to get module context for:" + str, e3);
            return null;
        }
    }

    public static class DynamicLoaderClassLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static HashMap<String, ClassLoader> f13134a = new HashMap<>();

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f13134a.put(str, classLoader);
        }

        public static ClassLoader getsClassLoader(String str) {
            return f13134a.get(str);
        }
    }

    private static int a(VersionPolicy versionPolicy) {
        if (versionPolicy instanceof com.huawei.hms.feature.dynamic.e.e) {
            return 1;
        }
        if (versionPolicy instanceof com.huawei.hms.feature.dynamic.e.d) {
            return 2;
        }
        return versionPolicy instanceof com.huawei.hms.feature.dynamic.e.c ? 3 : 0;
    }

    public static class LoadingException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bundle f13135a;

        public Bundle getBundle() {
            return this.f13135a;
        }

        public LoadingException(String str, Bundle bundle) {
            super(str);
            this.f13135a = bundle;
        }

        public LoadingException(String str) {
            super(str);
        }
    }

    private static int a(Bundle bundle) {
        if (bundle.containsKey(h)) {
            return bundle.getInt(h, -1);
        }
        return -1;
    }

    public class c implements Callable<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f13140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f13141b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle call() {
            try {
                return DynamicModule.queryHMSModuleBundle(this.f13140a, com.huawei.hms.feature.dynamic.b.e, this.f13141b);
            } catch (Exception e) {
                Logger.w(DynamicModule.f13131a, "Query provider error.", e);
                return new Bundle();
            }
        }

        public c(Context context, Bundle bundle) {
            this.f13140a = context;
            this.f13141b = bundle;
        }
    }

    public static class g extends Exception {
        public /* synthetic */ g(String str, a aVar) {
            this(str);
        }

        private g(String str) {
            super(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    private static int a(Context context, String str, Bundle bundle) throws Throwable {
        int i2;
        boolean zA;
        String str2;
        Bundle bundle2 = new Bundle();
        boolean z = false;
        LoadingException loadingException = null;
        try {
            bundle2 = queryHMSModuleBundle(context, com.huawei.hms.feature.dynamic.b.e, bundle);
            i2 = bundle2.getInt("module_version");
            try {
                zA = a(str, bundle2.getInt(com.huawei.hms.feature.dynamic.b.z));
            } catch (LoadingException e2) {
                e = e2;
                Logger.w(f13131a, "Get loader in HMS failed:" + e.getMessage());
                loadingException = e.getBundle() != null ? new LoadingException(e.getMessage(), e.getBundle()) : new LoadingException(e.getMessage());
                zA = false;
            } catch (Exception e3) {
                e = e3;
                Logger.w(f13131a, "Get hms loader info failed:" + e.getMessage());
                zA = false;
            }
        } catch (LoadingException e4) {
            e = e4;
            i2 = 0;
        } catch (Exception e5) {
            e = e5;
            i2 = 0;
        }
        Bundle assetModuleInfo = AssetLoadManager.getAssetModuleInfo(context, com.huawei.hms.feature.dynamic.b.e);
        int i3 = assetModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.m);
        String string = assetModuleInfo.getString("module_path");
        if (i2 == 0 && i3 == 0) {
            Logger.w(f13131a, "No available dynamic loader in HMS and asset.");
            if (loadingException == null) {
                return 0;
            }
            throw loadingException;
        }
        String str3 = f13131a;
        Logger.i(str3, "HMS loader version:" + i2 + ", asset loader version:" + i3);
        if (i2 <= i3) {
            Logger.i(str3, "Choose dynamicLoader in asset.");
            if (i2 == 0) {
            }
            i2 = i3;
            if (a(z)) {
            }
            bundle.putString("loader_path", string);
            bundle.putInt("loader_version", i2);
            return i2;
        }
        Logger.i(str3, "Choose dynamicLoader in HMS.");
        if (zA) {
            Logger.i(str3, "Need to copy HMS dynamicLoader to local dir.");
            ModuleCopy.copyModule(context, bundle2);
        }
        String string2 = bundle2.getString("module_path");
        if (!TextUtils.isEmpty(string2) && new File(string2).exists()) {
            if (ModuleCopy.isLocalModuleFile(context, string2) || com.huawei.hms.feature.dynamic.f.c.a(context, string2)) {
                string = string2;
            } else {
                str2 = "checkPathValidity failed, choose assets loader as default.";
            }
            if (a(z) || a(context, bundle, string)) {
                bundle.putString("loader_path", string);
                bundle.putInt("loader_version", i2);
                return i2;
            }
            Logger.i(str3, "The apiLeveL version of the loader is lower than the required apiLeveL version.");
            if (loadingException == null) {
                throw new LoadingException("The apiLeveL version of the loader is lower than the required apiLeveL version.");
            }
            throw loadingException;
        }
        str2 = "HMS dynamicloader is not available, choose assets loader as default.";
        Logger.i(str3, str2);
        z = true;
        i2 = i3;
        if (a(z)) {
        }
        bundle.putString("loader_path", string);
        bundle.putInt("loader_version", i2);
        return i2;
    }

    public class a extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f13137b;

        public a(String str, ClassLoader classLoader) {
            this.f13136a = str;
            this.f13137b = classLoader;
            put(str, classLoader);
        }
    }

    public class b extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f13139b;

        public b(String str, ClassLoader classLoader) {
            this.f13138a = str;
            this.f13139b = classLoader;
            put(str, classLoader);
        }
    }

    public class d extends HashMap<String, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13142a;

        public d(String str) {
            this.f13142a = str;
            put(str, Boolean.TRUE);
        }
    }

    public class e extends HashMap<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f13144b;

        public e(String str, String str2) {
            this.f13143a = str;
            this.f13144b = str2;
            put(str, str2);
        }
    }

    public class f extends HashMap<String, IDynamicLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IBinder f13146b;

        public f(String str, IBinder iBinder) {
            this.f13145a = str;
            this.f13146b = iBinder;
            put(str, IDynamicLoader.Stub.asInterface(iBinder));
        }
    }

    private DynamicModule(Context context) {
        this.q = context;
    }
}
