package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class FuturesGetChecked {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Ordering<Constructor<?>> f4699a;
    private static final Ordering<List<Class<?>>> d;

    interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    static GetCheckedTypeValidator a() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    static class GetCheckedTypeValidatorHolder {
        static final GetCheckedTypeValidator e = a();

        GetCheckedTypeValidatorHolder() {
        }

        enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;

            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                FuturesGetChecked.c(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        static GetCheckedTypeValidator a() {
            return FuturesGetChecked.a();
        }
    }

    private static boolean e(Class<? extends Exception> cls) {
        try {
            c(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static <X extends Exception> X c(Class<X> cls, Throwable th) {
        Iterator it = a(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) c((Constructor) it.next(), th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    private static <X extends Exception> List<Constructor<X>> a(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f4699a.sortedCopy(list);
    }

    static {
        Ordering<List<Class<?>>> orderingReverse = Ordering.natural().onResultOf(new Function() { // from class: aqu
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }).compound(Ordering.natural().onResultOf(new Function() { // from class: aqs
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        })).reverse();
        d = orderingReverse;
        f4699a = orderingReverse.onResultOf(new Function() { // from class: aqr
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        });
    }

    @CheckForNull
    private static <X> X c(Constructor<X> constructor, Throwable th) {
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

    static boolean b(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    static void c(Class<? extends Exception> cls) {
        Preconditions.checkArgument(b(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(e(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }
}
