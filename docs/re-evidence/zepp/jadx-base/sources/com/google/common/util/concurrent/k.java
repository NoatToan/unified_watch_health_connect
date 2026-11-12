package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class k {
    private static final Ordering<Constructor<?>> a = Ordering.natural().onResultOf(new a()).reverse();

    public static class a implements Function<Constructor<?>, Boolean> {
        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    @VisibleForTesting
    public interface b {
        void a(Class<? extends Exception> cls);
    }

    @VisibleForTesting
    public static class c {
        public static final String a = c.class.getName() + "$ClassValueValidator";
        public static final b b = a();

        @IgnoreJRERequirement
        public enum a implements b {
            INSTANCE;

            private static final ClassValue<Boolean> isValidClass = new C0243a();

            /* JADX INFO: renamed from: com.google.common.util.concurrent.k$c$a$a, reason: collision with other inner class name */
            public static class C0243a extends ClassValue<Boolean> {
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean b(Class<?> cls) {
                    k.b(cls.asSubclass(Exception.class));
                    return Boolean.TRUE;
                }
            }

            @Override // com.google.common.util.concurrent.k.b
            public void a(Class<? extends Exception> cls) {
                isValidClass.get(cls);
            }
        }

        public enum b implements b {
            INSTANCE;

            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.k.b
            public void a(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it2 = validClasses.iterator();
                while (it2.hasNext()) {
                    if (cls.equals(it2.next().get())) {
                        return;
                    }
                }
                k.b(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        public static b a() {
            try {
                return (b) Class.forName(a).getEnumConstants()[0];
            } catch (Throwable unused) {
                return k.l();
            }
        }
    }

    private k() {
    }

    private static b a() {
        return c.b;
    }

    @VisibleForTesting
    public static void b(Class<? extends Exception> cls) {
        Preconditions.checkArgument(h(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(g(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @VisibleForTesting
    public static b c() {
        return c.a.INSTANCE;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public static <V, X extends Exception> V d(b bVar, Future<V> future, Class<X> cls) throws Exception {
        bVar.a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw j(cls, e);
        } catch (ExecutionException e2) {
            m(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    @CanIgnoreReturnValue
    public static <V, X extends Exception> V e(Future<V> future, Class<X> cls) throws Exception {
        return (V) d(a(), future, cls);
    }

    @CanIgnoreReturnValue
    public static <V, X extends Exception> V f(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        a().a(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw j(cls, e);
        } catch (ExecutionException e2) {
            m(e2.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw j(cls, e3);
        }
    }

    private static boolean g(Class<? extends Exception> cls) {
        try {
            j(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @VisibleForTesting
    public static boolean h(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    @NullableDecl
    private static <X> X i(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X j(Class<X> cls, Throwable th) {
        Iterator it2 = k(Arrays.asList(cls.getConstructors())).iterator();
        while (it2.hasNext()) {
            X x = (X) i((Constructor) it2.next(), th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    private static <X extends Exception> List<Constructor<X>> k(List<Constructor<X>> list) {
        return (List<Constructor<X>>) a.sortedCopy(list);
    }

    @VisibleForTesting
    public static b l() {
        return c.b.INSTANCE;
    }

    private static <X extends Exception> void m(Throwable th, Class<X> cls) throws Exception {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw j(cls, th);
        }
        throw new UncheckedExecutionException(th);
    }
}
