package defpackage;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.template.ILogger;

/* JADX INFO: loaded from: classes.dex */
public final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile kb f23669a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f23670b = false;
    public static ILogger c;

    public static boolean b() {
        return u1s.h();
    }

    public static kb c() {
        if (!f23670b) {
            throw new InitException("ARouter::Init::Invoke init(context) first!");
        }
        if (f23669a == null) {
            synchronized (kb.class) {
                try {
                    if (f23669a == null) {
                        f23669a = new kb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23669a;
    }

    public static void d(Application application) {
        if (f23670b) {
            return;
        }
        ILogger iLogger = u1s.f35288a;
        c = iLogger;
        iLogger.info(ILogger.defaultTag, "ARouter init start.");
        f23670b = u1s.k(application);
        if (f23670b) {
            u1s.e();
        }
        u1s.f35288a.info(ILogger.defaultTag, "ARouter init over.");
    }

    public static synchronized void g() {
        u1s.n();
    }

    public static synchronized void h() {
        u1s.o();
    }

    public Postcard a(String str) {
        return u1s.j().f(str);
    }

    public Object e(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        return u1s.j().l(context, postcard, i, navigationCallback);
    }

    public <T> T f(Class<? extends T> cls) {
        return (T) u1s.j().m(cls);
    }
}
