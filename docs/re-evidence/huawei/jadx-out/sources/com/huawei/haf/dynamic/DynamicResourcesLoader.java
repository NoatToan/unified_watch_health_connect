package com.huawei.haf.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.HafRuntimeException;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.CommonConstant;
import com.huawei.haf.handler.HandlerExecutor;
import health.compact.a.LogUtil;
import health.compact.a.MagicBuild;
import health.compact.a.ProcessUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicResourcesLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f5936a;
    private static volatile boolean d;
    private static int f;
    private static int g;
    private static final Set<String> e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Context, Resources> f5937b = new WeakHashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f5938c = new Object();
    private static WebViewLoadPolicy h = new WebViewLoadPolicy();
    private static String[] j = CommonConstant.e;
    private static WeakReference i = new WeakReference(BaseApplication.b().getAssets());

    private DynamicResourcesLoader() {
    }

    public static void b(WebViewLoadPolicy webViewLoadPolicy) {
        if (webViewLoadPolicy != null) {
            h = webViewLoadPolicy;
        }
    }

    public static void b(Context context) {
        if (Looper.myLooper() == null) {
            throw new HafRuntimeException("WebView cannot be initialized on a thread that has no Looper.");
        }
        a(context, "preloadWebViewResources", System.currentTimeMillis());
    }

    public static boolean e(String str) {
        return e.contains(str);
    }

    public static boolean c(Context context, Resources resources, Collection<String> collection) throws DynamicLoaderException {
        if (CollectionUtils.a(collection)) {
            collection = e;
        }
        return a(context, resources, collection, false);
    }

    private static boolean c(Context context, Resources resources, boolean z) throws DynamicLoaderException {
        Collection<String> collectionB = b(context, resources);
        int size = collectionB.size();
        Set<String> set = e;
        boolean z2 = true;
        if (!set.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList(set);
            arrayList.removeAll(collectionB);
            for (String str : arrayList) {
                if (b(context, resources, str)) {
                    size++;
                } else {
                    if (z) {
                        e.remove(str);
                    }
                    z2 = false;
                }
            }
        }
        if (z) {
            f = size;
            g = f(context);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, String str, long j2) {
        try {
            Context applicationContext = context.getApplicationContext();
            boolean zA = a(applicationContext, a(applicationContext).getResources(), (Collection<String>) e, true);
            LogUtil.b("HAF_ResourcesLoader", str, d ? " ok." : " fail.", " result=", String.valueOf(zA), ", cost time=", Long.valueOf(System.currentTimeMillis() - j2), "ms, ", context.getClass().getSimpleName());
        } catch (DynamicLoaderException e2) {
            LogUtil.e("HAF_ResourcesLoader", str, ", exception=", LogUtil.c(e2));
        }
    }

    private static boolean a(Context context, Resources resources, Collection<String> collection, boolean z) throws DynamicLoaderException {
        boolean z2;
        boolean zC;
        int i2;
        int i3;
        int length;
        int size;
        int size2;
        Context applicationContext = context.getApplicationContext();
        Resources resources2 = a(applicationContext).getResources();
        boolean z3 = false;
        boolean z4 = c(context, a(applicationContext, z)) || z || b(resources2);
        Map map = Collections.EMPTY_MAP;
        synchronized (f5938c) {
            Set<String> set = e;
            z2 = (collection != set && set.addAll(collection)) || z4 || c(applicationContext);
            if (resources != resources2) {
                z3 = f5937b.put(context, resources) != resources;
                if (!z2 && z3) {
                    map = new HashMap(1);
                    map.put(context, resources);
                }
            }
            if (z2) {
                Map<Context, Resources> map2 = f5937b;
                map = map2.isEmpty() ? Collections.EMPTY_MAP : new HashMap(map2);
                zC = c(applicationContext, resources2, true);
                h(applicationContext);
                c(resources2);
            } else {
                zC = true;
            }
            i2 = f;
            i3 = g;
            length = j.length;
            size = set.size();
            size2 = f5937b.size();
        }
        boolean zA = a(resources2, resources, (Map<Context, Resources>) map, zC);
        if (!z2 && !z3) {
            return zA;
        }
        LogUtil.b("HAF_ResourcesLoader", "cacheSize=", Integer.valueOf(size), ", splitResLen=", Integer.valueOf(i3), ", appResLen=", Integer.valueOf(i2), ", sharedLibsLen=", Integer.valueOf(length), ", ctxNum=", Integer.valueOf(size2 + 1), ", result=", Boolean.valueOf(zA), ", ", context.getClass().getSimpleName());
        return zA;
    }

    private static boolean a(Resources resources, Resources resources2, Map<Context, Resources> map, boolean z) {
        if (resources2 != resources) {
            z = map.isEmpty();
        }
        int size = map.size();
        if (size == 0) {
            return z;
        }
        HashSet hashSet = new HashSet(size);
        hashSet.add(resources.getAssets());
        int i2 = 0;
        for (Map.Entry<Context, Resources> entry : map.entrySet()) {
            Resources value = entry.getValue();
            if (hashSet.contains(value.getAssets())) {
                i2++;
                if (resources2 == value) {
                    z = true;
                }
            } else {
                try {
                    if (c(entry.getKey(), value, false)) {
                        hashSet.add(value.getAssets());
                        if (resources2 == value) {
                            z = true;
                        }
                    }
                } catch (DynamicLoaderException unused) {
                }
            }
        }
        int i3 = size + 1;
        int size2 = hashSet.size();
        int i4 = (i3 - size2) - i2;
        if (i4 != 0) {
            LogUtil.b("HAF_ResourcesLoader", "ctxNum=", Integer.valueOf(i3), ", assetNum=", Integer.valueOf(size2), ", dupNum=", Integer.valueOf(i2), ", failNum=", Integer.valueOf(i4));
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context a(Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Resources resources) {
        return i.get() != resources.getAssets();
    }

    private static void c(Resources resources) {
        AssetManager assets = resources.getAssets();
        if (i.get() != assets) {
            i = new WeakReference(assets);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(Context context, boolean z) {
        if (!d || !c(context)) {
            return z;
        }
        d = false;
        return true;
    }

    private static boolean c(Context context) {
        return j != d(context);
    }

    private static void h(Context context) {
        j = d(context);
    }

    private static String[] d(Context context) {
        String[] strArr = context.getApplicationInfo().sharedLibraryFiles;
        return strArr == null ? CommonConstant.e : strArr;
    }

    private static boolean c(Context context, boolean z) {
        if (d) {
            return false;
        }
        if (!h.a(context)) {
            d = true;
            return false;
        }
        if (z || h.b(context)) {
            return b(context, h.d(context));
        }
        return false;
    }

    private static boolean b(Context context, boolean z) {
        if (z) {
            boolean zE = WebViewFactoryProviderAdapter.e();
            if (WebViewFactoryProviderAdapter.d()) {
                if (!WebViewFactoryProviderAdapter.c()) {
                    return zE;
                }
                d = true;
                return true;
            }
        }
        synchronized (f5938c) {
            if (!d && !f5936a) {
                f5936a = true;
                try {
                    d = g(context);
                    boolean z2 = d;
                    f5936a = false;
                    return z2;
                } catch (Throwable th) {
                    f5936a = false;
                    throw th;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.IllegalStateException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    private static boolean g(Context context) {
        String message;
        boolean z;
        AssetManager assets;
        Context applicationContext = context.getApplicationContext();
        Resources resources = a(applicationContext).getResources();
        AssetManager assets2 = resources.getAssets();
        try {
            new WebView(applicationContext).destroy();
        } catch (IllegalStateException e2) {
            e = e2;
            if (Build.VERSION.SDK_INT >= 28 && (message = e.getMessage()) != null && message.contains("WebView")) {
                LogUtil.e("HAF_ResourcesLoader", "loadWebViewResources disabled, ex=", LogUtil.c(e));
            }
            if (e != 0) {
                LogUtil.e("HAF_ResourcesLoader", "loadWebViewResources fail, ex=", LogUtil.c(e));
                z = false;
            } else {
                z = true;
            }
            assets = resources.getAssets();
            if (assets2 != assets) {
                LogUtil.b("HAF_ResourcesLoader", "loadWebViewResources ok, resources have changed, oldAsset=", assets2, ", newAsset=", assets);
                if (context instanceof Activity) {
                    HandlerExecutor.c(new DelayCheckRunnable(context));
                }
            } else if (z) {
                LogUtil.b("HAF_ResourcesLoader", "loadWebViewResources ok, resources no changed, asset=", assets2);
            }
            return z;
        } catch (UnsupportedOperationException e3) {
            LogUtil.e("HAF_ResourcesLoader", "loadWebViewResources unsupported, ex=", LogUtil.c(e3));
        } catch (Exception e4) {
            e = e4;
        }
        e = 0;
        if (e != 0) {
            LogUtil.e("HAF_ResourcesLoader", "loadWebViewResources fail, ex=", LogUtil.c(e));
            z = false;
        } else {
            z = true;
        }
        assets = resources.getAssets();
        if (assets2 != assets) {
            LogUtil.b("HAF_ResourcesLoader", "loadWebViewResources ok, resources have changed, oldAsset=", assets2, ", newAsset=", assets);
            if (context instanceof Activity) {
                HandlerExecutor.c(new DelayCheckRunnable(context));
            }
        } else if (z) {
            LogUtil.b("HAF_ResourcesLoader", "loadWebViewResources ok, resources no changed, asset=", assets2);
        }
        return z;
    }

    private static boolean b(Context context, Resources resources, String str) throws DynamicLoaderException {
        try {
            return AndroidPlatformV21.d(resources, str);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamicLoaderException("Failed to addResources " + str + " for " + context.getClass().getName(), e2);
        }
    }

    private static int f(Context context) throws DynamicLoaderException {
        String[] strArrE = e(context, "");
        Set<String> set = e;
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set);
            arrayList.removeAll(Arrays.asList(strArrE));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                strArrE = e(context, (String) it.next());
            }
        }
        return strArrE.length;
    }

    private static String[] e(Context context, String str) throws DynamicLoaderException {
        try {
            return AndroidPlatformV21.d(a(context), str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
            throw new DynamicLoaderException("Failed to updateSplitResDirs '" + str + "' for " + context.getClass().getName(), e2);
        }
    }

    private static Collection<String> b(Context context, Resources resources) throws DynamicLoaderException {
        try {
            return b(resources.getAssets());
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamicLoaderException("Failed to get all loaded module resources for " + context.getClass().getName(), e2);
        }
    }

    private static Collection<String> b(AssetManager assetManager) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = VersionCompat.e().invoke(assetManager, new Object[0]);
            for (Object obj : objInvoke instanceof Object[] ? (Object[]) objInvoke : CommonConstant.f5921a) {
                Object objInvoke2 = VersionCompat.c().invoke(obj, new Object[0]);
                if (objInvoke2 instanceof String) {
                    arrayList.add((String) objInvoke2);
                }
            }
        } else {
            Object obj2 = VersionCompat.i().get(assetManager);
            Object[] objArr = obj2 instanceof Object[] ? (Object[]) obj2 : CommonConstant.f5921a;
            boolean z = false;
            for (int i2 = 1; i2 <= objArr.length; i2++) {
                try {
                    Object objInvoke3 = VersionCompat.a().invoke(assetManager, Integer.valueOf(i2));
                    if (objInvoke3 instanceof String) {
                        arrayList.add((String) objInvoke3);
                    }
                } catch (IndexOutOfBoundsException | InvocationTargetException e2) {
                    if (!z) {
                        LogUtil.e("HAF_ResourcesLoader", "Unable to get cookie name for resources index=", Integer.valueOf(i2), ", ex=", LogUtil.c(e2));
                        z = true;
                    }
                }
            }
        }
        return arrayList;
    }

    public static class WebViewLoadPolicy {
        public boolean d(Context context) {
            return false;
        }

        final boolean a(Context context) {
            return e(context);
        }

        protected boolean e(Context context) {
            return ProcessUtil.b();
        }

        public boolean b(Context context) {
            if (context instanceof Activity) {
                return true;
            }
            return MagicBuild.f36615a && MagicBuild.f36616b >= 36;
        }
    }

    static class AndroidPlatformV21 extends VersionCompat {
        private AndroidPlatformV21() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean d(Resources resources, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            AssetManager assets = resources.getAssets();
            Object objInvoke = VersionCompat.b().invoke(assets, str);
            int iIntValue = objInvoke instanceof Integer ? ((Integer) objInvoke).intValue() : 0;
            boolean z = iIntValue > 0;
            LogUtil.b("HAF_ResourcesLoader", "addResources ", b(str), ", index=", Integer.valueOf(iIntValue), ", result=", Boolean.valueOf(z), ", asset=", assets);
            return z;
        }

        private static String b(String str) {
            int iLastIndexOf = str.lastIndexOf(File.separatorChar);
            return iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 1) : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String[] d(Context context, String str) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
            Object obj = f().get(context);
            Field fieldD = d();
            Object obj2 = fieldD.get(obj);
            String[] strArr = obj2 instanceof String[] ? (String[]) obj2 : null;
            if (!CollectionUtils.c(str)) {
                String[] strArr2 = {str};
                if (strArr == null) {
                    fieldD.set(obj, strArr2);
                    return strArr2;
                }
                for (String str2 : strArr) {
                    if (!str.equals(str2)) {
                    }
                }
                String[] strArr3 = new String[strArr.length + 1];
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                System.arraycopy(strArr2, 0, strArr3, strArr.length, 1);
                fieldD.set(obj, strArr3);
                return strArr3;
            }
            if (strArr == null) {
                return CommonConstant.e;
            }
            return strArr;
        }
    }

    static class VersionCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f5940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f5941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f5942c;
        private static Method d;
        private static Method e;
        private static Field f;
        private static Field i;

        private VersionCompat() {
        }

        static Field i() throws NoSuchFieldException {
            if (f == null) {
                f = ReflectionUtils.c((Class<?>) AssetManager.class, "mStringBlocks");
            }
            return f;
        }

        static Method b() throws NoSuchMethodException {
            if (f5940a == null) {
                f5940a = ReflectionUtils.e((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
            }
            return f5940a;
        }

        static Method a() throws NoSuchMethodException {
            if (e == null) {
                e = ReflectionUtils.e((Class<?>) AssetManager.class, "getCookieName", (Class<?>[]) new Class[]{Integer.TYPE});
            }
            return e;
        }

        static Method c() throws NoSuchMethodException, ClassNotFoundException {
            if (f5941b == null) {
                f5941b = ReflectionUtils.e(ReflectionUtils.e("android.content.res.ApkAssets"), "getAssetPath", (Class<?>[]) new Class[0]);
            }
            return f5941b;
        }

        static Method e() throws NoSuchMethodException {
            if (d == null) {
                d = ReflectionUtils.e((Class<?>) AssetManager.class, "getApkAssets", (Class<?>[]) new Class[0]);
            }
            return d;
        }

        static Field f() throws NoSuchFieldException, ClassNotFoundException {
            if (f5942c == null) {
                f5942c = ReflectionUtils.c(ReflectionUtils.e("android.app.ContextImpl"), "mPackageInfo");
            }
            return f5942c;
        }

        static Field d() throws NoSuchFieldException, ClassNotFoundException {
            if (i == null) {
                i = ReflectionUtils.c(ReflectionUtils.e("android.app.LoadedApk"), "mSplitResDirs");
            }
            return i;
        }
    }

    static class WebViewFactoryProviderAdapter implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static boolean f5943a;
        private static volatile Boolean e;
        private final Object d;

        private WebViewFactoryProviderAdapter(Object obj) {
            this.d = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("createWebView".equals(method.getName())) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object objInvoke = method.invoke(this.d, objArr);
                d(jCurrentTimeMillis);
                return objInvoke;
            }
            return method.invoke(this.d, objArr);
        }

        static boolean e() {
            return e == null;
        }

        static boolean d() {
            if (e != null) {
                return e.booleanValue();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = "";
            synchronized (DynamicResourcesLoader.f5938c) {
                if (e != null) {
                    return e.booleanValue();
                }
                try {
                    e = Boolean.valueOf(a());
                } catch (Exception e2) {
                    e = Boolean.FALSE;
                    str = ", ex=" + LogUtil.c(e2);
                }
                LogUtil.b("HAF_ResourcesLoader", "Install hooks to sense creation of WebView, result=", e, ", cost time=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "ms", str);
                return e.booleanValue();
            }
        }

        static boolean c() {
            boolean z;
            synchronized (DynamicResourcesLoader.f5938c) {
                z = f5943a;
            }
            return z;
        }

        private static void d(long j) {
            Context contextB = BaseApplication.b();
            if (a(contextB)) {
                synchronized (DynamicResourcesLoader.f5938c) {
                    f5943a = true;
                    try {
                        DynamicResourcesLoader.a(contextB, "createWebView notify checkOrUpdateResources", j);
                        f5943a = false;
                    } catch (Throwable th) {
                        f5943a = false;
                        throw th;
                    }
                }
            }
        }

        private static boolean a(Context context) {
            return DynamicResourcesLoader.a(context, false) || !DynamicResourcesLoader.d || DynamicResourcesLoader.b(DynamicResourcesLoader.a(context).getResources());
        }

        private static boolean a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            ClassLoader classLoader = BaseApplication.b().getClassLoader();
            Class<?> clsE = ReflectionUtils.e("android.webkit.WebViewFactory", classLoader);
            return ReflectionUtils.a(clsE, "sProviderInstance", Proxy.newProxyInstance(classLoader, new Class[]{ReflectionUtils.e("android.webkit.WebViewFactoryProvider", classLoader)}, new WebViewFactoryProviderAdapter(ReflectionUtils.e(clsE, "getProvider", (Class<?>[]) null).invoke(null, null))));
        }
    }

    static class DelayCheckRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f5939b;

        DelayCheckRunnable(Context context) {
            this.f5939b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            DynamicResourcesLoader.a(this.f5939b, "delay notify checkOrUpdateResources", System.currentTimeMillis());
        }
    }
}
