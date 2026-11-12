package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.onetrack.OneTrack;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class k8j {
    public static Class<?> f;
    public static Class<?> g;
    public static Class<?> h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f23591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23592b;
    public Object c;
    public final ExecutorService d;
    public final Handler e;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: k8j$a$a, reason: collision with other inner class name */
        public class RunnableC0990a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f23594a;

            public RunnableC0990a(int i) {
                this.f23594a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f23594a);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        public final /* synthetic */ void b() {
            try {
                String str = (String) k8j.h.getMethod("getInstallReferrer", new Class[0]).invoke(k8j.f.getMethod("getInstallReferrer", new Class[0]).invoke(k8j.this.f23592b, new Object[0]), new Object[0]);
                SharedPreferences.Editor editorEdit = k8j.this.f23591a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                k8j.f.getMethod("endConnection", new Class[0]).invoke(k8j.this.f23592b, new Object[0]);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                e.printStackTrace(printStream);
            }
        }

        public void c() {
        }

        public void d(int i) {
            if (i != 0) {
                return;
            }
            k8j.this.d.execute(new Runnable() { // from class: j8j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22528a.b();
                }
            });
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        k8j.this.e.post(new RunnableC0990a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                k8j.this.e.post(new b());
                return null;
            } catch (Exception e) {
                throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
            }
        }

        public a() {
        }
    }

    static {
        try {
            f = tbd.class;
            g = ubd.class;
            h = yak.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    public k8j(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor;
        this.e = new Handler(Looper.getMainLooper());
        this.f23591a = context.getSharedPreferences("react-native-device-info", 0);
        if (f == null || g == null || h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: i8j
            @Override // java.lang.Runnable
            public final void run() {
                this.f20884a.h(context);
            }
        });
    }

    public final /* synthetic */ void h(Context context) {
        try {
            Object objInvoke = f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f23592b = objInvoke.getClass().getMethod(OneTrack.Param.BUILD, new Class[0]).invoke(objInvoke, new Object[0]);
            this.c = Proxy.newProxyInstance(g.getClassLoader(), new Class[]{g}, new a());
            f.getMethod("startConnection", g).invoke(this.f23592b, this.c);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
            e.printStackTrace(printStream);
        }
    }
}
