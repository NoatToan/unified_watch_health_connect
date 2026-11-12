package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
import com.alibaba.android.arouter.facade.service.PretreatmentService;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class u1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ILogger f35288a = new yv5(ILogger.defaultTag);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f35289b = false;
    public static volatile boolean c = false;
    public static volatile boolean d = false;
    public static volatile u1s e = null;
    public static volatile boolean f = false;
    public static volatile ThreadPoolExecutor g = nw5.a();
    public static Handler h;
    public static Context i;
    public static InterceptorService j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Postcard f35290a;

        public a(Postcard postcard) {
            this.f35290a = postcard;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(u1s.i, "There's no route matched!\n Path = [" + this.f35290a.getPath() + "]\n Group = [" + this.f35290a.getGroup() + "]", 1).show();
        }
    }

    public class b implements InterceptorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35293b;
        public final /* synthetic */ NavigationCallback c;
        public final /* synthetic */ Postcard d;

        public b(Context context, int i, NavigationCallback navigationCallback, Postcard postcard) {
            this.f35292a = context;
            this.f35293b = i;
            this.c = navigationCallback;
            this.d = postcard;
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onContinue(Postcard postcard) {
            u1s.this.a(this.f35292a, postcard, this.f35293b, this.c);
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onInterrupt(Throwable th) {
            NavigationCallback navigationCallback = this.c;
            if (navigationCallback != null) {
                navigationCallback.onInterrupt(this.d);
            }
            u1s.f35288a.info(ILogger.defaultTag, "Navigation failed, termination by interceptor : " + th.getMessage());
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f35295b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ Postcard d;
        public final /* synthetic */ NavigationCallback e;

        public c(int i, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
            this.f35294a = i;
            this.f35295b = context;
            this.c = intent;
            this.d = postcard;
            this.e = navigationCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            u1s.this.q(this.f35294a, this.f35295b, this.c, this.d, this.e);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35296a;

        static {
            int[] iArr = new int[RouteType.values().length];
            f35296a = iArr;
            try {
                iArr[RouteType.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35296a[RouteType.PROVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35296a[RouteType.BOARDCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35296a[RouteType.CONTENT_PROVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35296a[RouteType.FRAGMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35296a[RouteType.METHOD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35296a[RouteType.SERVICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static void e() {
        j = (InterceptorService) kb.c().a("/arouter/service/interceptor").navigation();
    }

    public static boolean h() {
        return c;
    }

    public static u1s j() {
        if (!f) {
            throw new InitException("ARouterCore::Init::Invoke init(context) first!");
        }
        if (e == null) {
            synchronized (u1s.class) {
                try {
                    if (e == null) {
                        e = new u1s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static synchronized boolean k(Application application) {
        i = application;
        nre.c(application, g);
        f35288a.info(ILogger.defaultTag, "ARouter init success!");
        f = true;
        h = new Handler(Looper.getMainLooper());
        return true;
    }

    public static synchronized void n() {
        c = true;
        f35288a.info(ILogger.defaultTag, "ARouter openDebug");
    }

    public static synchronized void o() {
        f35288a.showLog(true);
        f35288a.info(ILogger.defaultTag, "ARouter openLog");
    }

    public final Object a(Context context, Postcard postcard, int i2, NavigationCallback navigationCallback) {
        if (context == null) {
            context = i;
        }
        Context context2 = context;
        int i3 = d.f35296a[postcard.getType().ordinal()];
        if (i3 == 1) {
            Intent intent = new Intent(context2, postcard.getDestination());
            intent.putExtras(postcard.getExtras());
            int flags = postcard.getFlags();
            if (-1 != flags) {
                intent.setFlags(flags);
            } else if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            String action = postcard.getAction();
            if (!p8p.b(action)) {
                intent.setAction(action);
            }
            p(new c(i2, context2, intent, postcard, navigationCallback));
            return null;
        }
        if (i3 == 2) {
            return postcard.getProvider();
        }
        if (i3 == 3 || i3 == 4 || i3 == 5) {
            try {
                Object objNewInstance = postcard.getDestination().getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof Fragment) {
                    ((Fragment) objNewInstance).setArguments(postcard.getExtras());
                } else if (objNewInstance instanceof androidx.fragment.app.Fragment) {
                    ((androidx.fragment.app.Fragment) objNewInstance).setArguments(postcard.getExtras());
                }
                return objNewInstance;
            } catch (Exception e2) {
                f35288a.error(ILogger.defaultTag, "Fetch fragment instance error, " + p8p.a(e2.getStackTrace()));
            }
        }
        return null;
    }

    public Postcard f(String str) {
        if (p8p.b(str)) {
            throw new HandlerException("ARouter::Parameter is invalid!");
        }
        PathReplaceService pathReplaceService = (PathReplaceService) kb.c().f(PathReplaceService.class);
        if (pathReplaceService != null) {
            str = pathReplaceService.forString(str);
        }
        return g(str, i(str), Boolean.TRUE);
    }

    public Postcard g(String str, String str2, Boolean bool) {
        PathReplaceService pathReplaceService;
        if (p8p.b(str) || p8p.b(str2)) {
            throw new HandlerException("ARouter::Parameter is invalid!");
        }
        if (!bool.booleanValue() && (pathReplaceService = (PathReplaceService) kb.c().f(PathReplaceService.class)) != null) {
            str = pathReplaceService.forString(str);
        }
        return new Postcard(str, str2);
    }

    public final String i(String str) {
        if (p8p.b(str) || !str.startsWith("/")) {
            throw new HandlerException("ARouter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String strSubstring = str.substring(1, str.indexOf("/", 1));
            if (p8p.b(strSubstring)) {
                throw new HandlerException("ARouter::Extract the default group failed! There's nothing between 2 '/'!");
            }
            return strSubstring;
        } catch (Exception e2) {
            f35288a.warning(ILogger.defaultTag, "Failed to extract default group! " + e2.getMessage());
            return null;
        }
    }

    public Object l(Context context, Postcard postcard, int i2, NavigationCallback navigationCallback) {
        PretreatmentService pretreatmentService = (PretreatmentService) kb.c().f(PretreatmentService.class);
        if (pretreatmentService != null && !pretreatmentService.onPretreatment(context, postcard)) {
            return null;
        }
        try {
            nre.b(postcard);
            if (navigationCallback != null) {
                navigationCallback.onFound(postcard);
            }
            if (postcard.isGreenChannel()) {
                return a(context, postcard, i2, navigationCallback);
            }
            j.doInterceptions(postcard, new b(context, i2, navigationCallback, postcard));
            return null;
        } catch (NoRouteFoundException e2) {
            f35288a.warning(ILogger.defaultTag, e2.getMessage());
            if (h()) {
                p(new a(postcard));
            }
            if (navigationCallback != null) {
                navigationCallback.onLost(postcard);
            } else {
                DegradeService degradeService = (DegradeService) kb.c().f(DegradeService.class);
                if (degradeService != null) {
                    degradeService.onLost(context, postcard);
                }
            }
            return null;
        }
    }

    public <T> T m(Class<? extends T> cls) {
        try {
            Postcard postcardA = nre.a(cls.getName());
            if (postcardA == null) {
                postcardA = nre.a(cls.getSimpleName());
            }
            if (postcardA == null) {
                return null;
            }
            nre.b(postcardA);
            return (T) postcardA.getProvider();
        } catch (NoRouteFoundException e2) {
            f35288a.warning(ILogger.defaultTag, e2.getMessage());
            return null;
        }
    }

    public final void p(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            h.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void q(int i2, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
        if (i2 < 0) {
            ni4.n(context, intent, postcard.getOptionsBundle());
        } else if (context instanceof Activity) {
            androidx.core.app.a.A((Activity) context, intent, i2, postcard.getOptionsBundle());
        } else {
            f35288a.warning(ILogger.defaultTag, "Must use [navigation(activity, ...)] to support [startActivityForResult]");
        }
        if (-1 != postcard.getEnterAnim() && -1 != postcard.getExitAnim() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(postcard.getEnterAnim(), postcard.getExitAnim());
        }
        if (navigationCallback != null) {
            navigationCallback.onArrival(postcard);
        }
    }
}
