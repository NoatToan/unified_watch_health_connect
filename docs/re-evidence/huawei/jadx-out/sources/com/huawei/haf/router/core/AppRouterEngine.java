package com.huawei.haf.router.core;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.NaviConsumer;
import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.model.RouteType;
import com.huawei.haf.router.facade.model.TypeKind;
import com.huawei.haf.router.facade.template.InterceptorHandler;
import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.haf.router.facade.template.ServiceProvider;
import com.huawei.haf.router.facade.template.SingleServiceProvider;
import com.huawei.openalliance.ad.constant.ParamConstants;
import health.compact.a.LogUtil;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AppRouterInterceptorService f6018a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile AppRouterDegradeService f6019c;
    private static volatile AppRouterPretreatmentService d;
    private static volatile AppRouterPathReplaceService e;

    AppRouterEngine() {
    }

    Guidepost d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new AppRouterHandleException("path parameter is invalid!");
        }
        String strE = a().e(str);
        return e(strE, b(strE), true);
    }

    Guidepost a(String str, String str2) {
        return e(str, str2, false);
    }

    Guidepost d(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            throw new AppRouterHandleException("uri parameter invalid!");
        }
        Uri uriD = a().d(uri);
        return new Guidepost(uriD.getPath(), b(uriD.getPath()), uriD);
    }

    private static Guidepost e(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new AppRouterHandleException("path parameter is invalid!");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new AppRouterHandleException("group parameter is invalid!");
        }
        if (!z) {
            str = a().e(str);
        }
        return new Guidepost(str, str2, null);
    }

    private static String b(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && str.startsWith("/") && (iIndexOf = str.indexOf("/", 1)) != -1) {
            String strSubstring = str.substring(1, iIndexOf);
            if (TextUtils.isEmpty(strSubstring)) {
                throw new AppRouterHandleException("Extract the default group failed! There's nothing between 2 '/'!");
            }
            return strSubstring;
        }
        throw new AppRouterHandleException("Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
    }

    <T> T a(Class<? extends T> cls) {
        if (!SingleServiceProvider.class.isAssignableFrom(cls)) {
            LogUtil.e("HAF_AppRouter", "The '", cls.getName(), "' does not implements SingleServiceProvider. It's recommended use navigate with path to obtain.");
        }
        String str = AppRouterStore.f6061a.get(cls.getName());
        if (str != null) {
            return (T) e(cls, e(str, b(str), true), (NaviConsumer) null);
        }
        return null;
    }

    <T> T e(Class<? extends T> cls, Guidepost guidepost, NaviConsumer naviConsumer) {
        T t = null;
        try {
            b(guidepost);
            T t2 = (T) guidepost.m();
            if (t2 == null) {
                return null;
            }
            if (!cls.isAssignableFrom(t2.getClass())) {
                LogUtil.e("HAF_AppRouter", "path:", guidepost.l(), ", ", t2.getClass().getName(), " is not ", cls.getName(), " class type.");
                return null;
            }
            if (naviConsumer == null) {
                return t2;
            }
            try {
                naviConsumer.accept(t2);
                return t2;
            } catch (AppRouterNotFoundException e2) {
                e = e2;
                t = t2;
            }
        } catch (AppRouterNotFoundException e3) {
            e = e3;
        }
        LogUtil.e("HAF_AppRouter", "navigate service, ex=", LogUtil.c(e));
        return t;
    }

    Object e(Context context, Guidepost guidepost, int i, NaviCallback naviCallback) {
        if (d().a(guidepost)) {
            try {
                b(guidepost);
                if (naviCallback != null) {
                    naviCallback.onFound(guidepost);
                }
                if (guidepost.s()) {
                    return d(guidepost, i, naviCallback);
                }
                e().d(guidepost, new InnerInterceptorCallback(guidepost, i, naviCallback));
                return null;
            } catch (AppRouterNotFoundException e2) {
                LogUtil.e("HAF_AppRouter", "navigation path=", guidepost.l(), " fail, ex=", LogUtil.c(e2));
                if (c()) {
                    HandlerExecutor.b(new InnerDebugToastRunning(context, String.format(Locale.ENGLISH, "There's no route matched!%s Path = [%s]%s Group = [%s]", System.lineSeparator(), guidepost.l(), System.lineSeparator(), guidepost.g())));
                }
                if (naviCallback != null) {
                    naviCallback.onLost(guidepost);
                } else {
                    b().a(context, guidepost);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object d(final Guidepost guidepost, final int i, final NaviCallback naviCallback) {
        final Context contextE = guidepost.e();
        int i2 = AnonymousClass2.f6023b[guidepost.n().getType().ordinal()];
        if (i2 == 1) {
            final Intent intent = new Intent(contextE, guidepost.n().getRouteClass());
            intent.putExtras(guidepost.d());
            int iF = guidepost.f();
            if (iF != 0) {
                intent.setFlags(iF);
            }
            if (!(contextE instanceof Activity)) {
                intent.addFlags(268435456);
            }
            String strA = guidepost.a();
            if (!TextUtils.isEmpty(strA)) {
                intent.setAction(strA);
            }
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.haf.router.core.AppRouterEngine.1
                @Override // java.lang.Runnable
                public void run() {
                    AppRouterEngine.c(i, contextE, intent, guidepost, naviCallback);
                }
            });
            return null;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return guidepost.m();
        }
        try {
            Object objNewInstance = guidepost.n().getRouteClass().newInstance();
            if (objNewInstance instanceof Fragment) {
                ((Fragment) objNewInstance).setArguments(guidepost.d());
                return objNewInstance;
            }
            if (objNewInstance instanceof androidx.fragment.app.Fragment) {
                ((androidx.fragment.app.Fragment) objNewInstance).setArguments(guidepost.d());
            }
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException e2) {
            LogUtil.d("HAF_AppRouter", "Fetch fragment instance error, ex=", LogUtil.c(e2));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.haf.router.core.AppRouterEngine$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6023b;

        static {
            int[] iArr = new int[RouteType.values().length];
            f6023b = iArr;
            try {
                iArr[RouteType.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6023b[RouteType.FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6023b[RouteType.HANDLER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6023b[RouteType.SERVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i, Context context, Intent intent, Guidepost guidepost, NaviCallback naviCallback) {
        if (i >= 0) {
            if (context instanceof Activity) {
                ActivityCompat.startActivityForResult((Activity) context, intent, i, guidepost.j());
            } else {
                LogUtil.e("HAF_AppRouter", "Must use [navigate(activity, ...)] to support [startActivityForResult]");
            }
        } else {
            ActivityCompat.startActivity(context, intent, guidepost.j());
        }
        if (-1 != guidepost.b() && -1 != guidepost.c() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(guidepost.b(), guidepost.c());
        }
        if (naviCallback != null) {
            naviCallback.onArrival(guidepost);
        }
    }

    private void b(String str, RouteGroup routeGroup) throws IllegalAccessException, InstantiationException {
        Class<? extends RouteGroup> cls = AppRouterStore.d.get(str);
        if (cls != null) {
            cls.newInstance().loadInto(AppRouterStore.e);
            AppRouterStore.d.remove(str);
        }
        if (routeGroup != null) {
            routeGroup.loadInto(AppRouterStore.e);
        }
    }

    private void b(Guidepost guidepost) {
        synchronized (this) {
            RouteMeta routeMeta = AppRouterStore.e.get(guidepost.l());
            if (routeMeta != null) {
                c(guidepost, routeMeta);
                return;
            }
            if (!AppRouterStore.d.containsKey(guidepost.g())) {
                throw new AppRouterNotFoundException("There is no route match the path [" + guidepost.l() + "], in group [" + guidepost.g() + "]");
            }
            try {
                try {
                    b(guidepost.g(), null);
                    if (c()) {
                        LogUtil.b("HAF_AppRouter", String.format(Locale.ENGLISH, "The group [%s] load %s, trigger by [%s]", guidepost.g(), "success", guidepost.l()));
                    }
                    b(guidepost);
                } catch (Throwable th) {
                    if (c()) {
                        LogUtil.b("HAF_AppRouter", String.format(Locale.ENGLISH, "The group [%s] load %s, trigger by [%s]", guidepost.g(), ParamConstants.CallbackMethod.ON_FAIL, guidepost.l()));
                    }
                    throw th;
                }
            } catch (IllegalAccessException | InstantiationException e2) {
                throw new AppRouterHandleException("Fatal exception when loading group meta. [" + e2.getMessage() + "]");
            }
        }
    }

    private static void c(Guidepost guidepost, RouteMeta routeMeta) {
        ServiceProvider serviceProviderE;
        guidepost.a(routeMeta);
        Uri uriO = guidepost.o();
        if (uriO != null) {
            Map<String, Integer> paramsType = routeMeta.getParamsType();
            if (!CollectionUtils.c(paramsType)) {
                a(guidepost, paramsType);
            }
            guidepost.e("NTwe23AtQb8U", uriO);
        }
        int i = AnonymousClass2.f6023b[routeMeta.getType().ordinal()];
        if (i == 2) {
            guidepost.r();
            return;
        }
        if (i != 3) {
            return;
        }
        Class<?> routeClass = routeMeta.getRouteClass();
        if (b(routeMeta)) {
            serviceProviderE = e((Class<? extends ServiceProvider>) routeClass);
        } else {
            serviceProviderE = AppRouterStore.h.get(routeClass);
            if (serviceProviderE == null) {
                serviceProviderE = e((Class<? extends ServiceProvider>) routeClass);
                AppRouterStore.h.put(routeClass, serviceProviderE);
            }
        }
        guidepost.b(serviceProviderE);
        guidepost.r();
    }

    private static boolean b(RouteMeta routeMeta) {
        return (routeMeta.getExtra() & 65536) == 65536;
    }

    private static ServiceProvider e(Class<? extends ServiceProvider> cls) {
        try {
            ServiceProvider serviceProviderNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            serviceProviderNewInstance.init(BaseApplication.b());
            return serviceProviderNewInstance;
        } catch (Exception e2) {
            LogUtil.d("HAF_AppRouter", "Init provider failed, ex=", LogUtil.c(e2));
            throw new AppRouterHandleException("Init provider failed!");
        }
    }

    private static void a(Guidepost guidepost, Map<String, Integer> map) {
        Map<String, String> mapA = AppRouterUtils.a(guidepost.o());
        if (mapA.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            b(guidepost, entry.getValue(), entry.getKey(), mapA.get(entry.getKey()));
        }
    }

    private static void b(Guidepost guidepost, Integer num, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (num == null) {
            guidepost.c(str, str2);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (iIntValue == TypeKind.BOOLEAN.type()) {
                guidepost.e(str, Boolean.parseBoolean(str2));
                return;
            }
            if (iIntValue == TypeKind.BYTE.type()) {
                guidepost.c(str, Byte.parseByte(str2));
                return;
            }
            if (iIntValue == TypeKind.SHORT.type()) {
                guidepost.e(str, Short.parseShort(str2));
                return;
            }
            if (iIntValue == TypeKind.INT.type()) {
                guidepost.a(str, Integer.parseInt(str2));
                return;
            }
            if (iIntValue == TypeKind.LONG.type()) {
                guidepost.b(str, Long.parseLong(str2));
                return;
            }
            if (iIntValue == TypeKind.CHAR.type()) {
                guidepost.b(str, e(str2));
                return;
            }
            if (iIntValue == TypeKind.FLOAT.type()) {
                guidepost.b(str, Float.parseFloat(str2));
                return;
            }
            if (iIntValue == TypeKind.DOUBLE.type()) {
                guidepost.a(str, Double.parseDouble(str2));
                return;
            }
            if (iIntValue == TypeKind.STRING.type()) {
                guidepost.c(str, str2);
            } else if (iIntValue != TypeKind.OBJECT.type()) {
                LogUtil.e("HAF_AppRouter", "setValue not support key=", str, ", type=", num, ", value=", str2);
            } else {
                guidepost.c(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.e("HAF_AppRouter", "setValue failed! key=", str, ", ex=", LogUtil.c(e2));
        }
    }

    private static char e(String str) {
        if (TextUtils.isEmpty(str)) {
            return (char) 0;
        }
        if (str.length() != 1) {
            LogUtil.e("HAF_AppRouter", "parseChar value=", str);
        }
        return str.charAt(0);
    }

    private static boolean c() {
        return !LogUtil.c();
    }

    private static AppRouterPathReplaceService a() {
        if (e == null) {
            synchronized (AppRouterEngine.class) {
                if (e == null) {
                    e = new AppRouterPathReplaceService();
                }
            }
        }
        return e;
    }

    private static AppRouterPretreatmentService d() {
        if (d == null) {
            synchronized (AppRouterEngine.class) {
                if (d == null) {
                    d = new AppRouterPretreatmentService();
                }
            }
        }
        return d;
    }

    private static AppRouterInterceptorService e() {
        if (f6018a == null) {
            synchronized (AppRouterEngine.class) {
                if (f6018a == null) {
                    f6018a = new AppRouterInterceptorService();
                }
            }
        }
        return f6018a;
    }

    private static AppRouterDegradeService b() {
        if (f6019c == null) {
            synchronized (AppRouterEngine.class) {
                if (f6019c == null) {
                    f6019c = new AppRouterDegradeService();
                }
            }
        }
        return f6019c;
    }

    static class InnerInterceptorCallback implements InterceptorHandler.InterceptorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NaviCallback f6026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Guidepost f6027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6028c;

        InnerInterceptorCallback(Guidepost guidepost, int i, NaviCallback naviCallback) {
            this.f6027b = guidepost;
            this.f6028c = i;
            this.f6026a = naviCallback;
        }

        @Override // com.huawei.haf.router.facade.template.InterceptorHandler.InterceptorCallback
        public void onContinue(Guidepost guidepost) {
            AppRouterEngine.d(guidepost, this.f6028c, this.f6026a);
        }

        @Override // com.huawei.haf.router.facade.template.InterceptorHandler.InterceptorCallback
        public void onInterrupt(Throwable th) {
            NaviCallback naviCallback = this.f6026a;
            if (naviCallback != null) {
                naviCallback.onInterrupt(this.f6027b);
            }
            LogUtil.b("HAF_AppRouter", "Navigation failed, termination by interceptor, ex=", LogUtil.c(th));
        }
    }

    static class InnerDebugToastRunning implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6024a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6025c;

        InnerDebugToastRunning(Context context, String str) {
            this.f6024a = context;
            this.f6025c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f6024a, this.f6025c, 1).show();
        }
    }
}
