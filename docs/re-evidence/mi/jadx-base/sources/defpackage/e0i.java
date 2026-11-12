package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
public class e0i {
    public static final e0i c = f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f16126b;

    public static final class a extends e0i {

        /* JADX INFO: renamed from: e0i$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0919a implements Executor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f16127a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f16127a.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // defpackage.e0i
        public Executor c() {
            return new ExecutorC0919a();
        }

        @Override // defpackage.e0i
        public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            return super.h(method, cls, obj, objArr);
        }
    }

    public e0i(boolean z) {
        this.f16125a = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f16126b = declaredConstructor;
    }

    public static e0i f() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new e0i(true);
    }

    public static e0i g() {
        return c;
    }

    public List<? extends la3.a> a(Executor executor) {
        xt5 xt5Var = new xt5(executor);
        return this.f16125a ? Arrays.asList(ca4.f5104a, xt5Var) : Collections.singletonList(xt5Var);
    }

    public int b() {
        return this.f16125a ? 2 : 1;
    }

    public Executor c() {
        return null;
    }

    public List<? extends dk4.a> d() {
        return this.f16125a ? Collections.singletonList(zbh.f41097a) : Collections.emptyList();
    }

    public int e() {
        return this.f16125a ? 1 : 0;
    }

    @IgnoreJRERequirement
    public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f16126b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public boolean i(Method method) {
        return this.f16125a && method.isDefault();
    }
}
