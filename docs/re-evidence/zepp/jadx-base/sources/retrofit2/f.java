package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes23.dex */
class f {
    private static final f a = c();

    public static class a extends f {

        /* JADX INFO: renamed from: retrofit2.f$a$a, reason: collision with other inner class name */
        public static class ExecutorC1216a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        @Override // retrofit2.f
        public CallAdapter.Factory a(@Nullable Executor executor) {
            if (executor != null) {
                return new c(executor);
            }
            throw new AssertionError();
        }

        @Override // retrofit2.f
        public Executor b() {
            return new ExecutorC1216a();
        }
    }

    @IgnoreJRERequirement
    public static class b extends f {
        @Override // retrofit2.f
        public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // retrofit2.f
        public boolean f(Method method) {
            return method.isDefault();
        }
    }

    private static f c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new f();
        }
    }

    public static f d() {
        return a;
    }

    public CallAdapter.Factory a(@Nullable Executor executor) {
        return executor != null ? new c(executor) : retrofit2.b.a;
    }

    @Nullable
    public Executor b() {
        return null;
    }

    @Nullable
    public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    public boolean f(Method method) {
        return false;
    }
}
