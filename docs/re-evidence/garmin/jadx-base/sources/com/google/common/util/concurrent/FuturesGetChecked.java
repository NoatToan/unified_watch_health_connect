package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
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
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class FuturesGetChecked {
    private static final Ordering<List<Class<?>>> ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST;
    private static final Ordering<Constructor<?>> WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM;

    @VisibleForTesting
    public interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    @VisibleForTesting
    public static class GetCheckedTypeValidatorHolder {
        static final GetCheckedTypeValidator BEST_VALIDATOR = getBestValidator();

        public enum WeakSetValidator implements GetCheckedTypeValidator {
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
                FuturesGetChecked.checkExceptionClassValidity(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        public static GetCheckedTypeValidator getBestValidator() {
            return FuturesGetChecked.weakSetValidator();
        }
    }

    static {
        Ordering<List<Class<?>>> orderingReverse = Ordering.natural().onResultOf(new n(0)).compound(Ordering.natural().onResultOf(new n(1))).reverse();
        ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST = orderingReverse;
        WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM = orderingReverse.onResultOf(new n(2));
    }

    private FuturesGetChecked() {
    }

    private static GetCheckedTypeValidator bestGetCheckedTypeValidator() {
        return GetCheckedTypeValidatorHolder.BEST_VALIDATOR;
    }

    @VisibleForTesting
    public static void checkExceptionClassValidity(Class<? extends Exception> cls) {
        Preconditions.checkArgument(isCheckedException(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(hasConstructorUsableByGetChecked(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j8, TimeUnit timeUnit) throws Exception {
        bestGetCheckedTypeValidator().validateClass(cls);
        try {
            return future.get(j8, timeUnit);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw newWithCause(cls, e4);
        } catch (ExecutionException e14) {
            wrapAndThrowExceptionOrError(e14.getCause(), cls);
            e0.l();
            return null;
        } catch (TimeoutException e15) {
            throw newWithCause(cls, e15);
        }
    }

    private static boolean hasConstructorUsableByGetChecked(Class<? extends Exception> cls) {
        try {
            newWithCause(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @VisibleForTesting
    public static boolean isCheckedException(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(List list) {
        return Boolean.valueOf(list.contains(String.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$1(List list) {
        return Boolean.valueOf(list.contains(Throwable.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$2(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes());
    }

    private static <X> X newFromConstructor(Constructor<X> constructor, Throwable th3) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i14 = 0; i14 < parameterTypes.length; i14++) {
            Class<?> cls = parameterTypes[i14];
            if (cls.equals(String.class)) {
                objArr[i14] = th3.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i14] = th3;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X newWithCause(Class<X> cls, Throwable th3) {
        Iterator it = preferringStringsThenThrowables(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x14 = (X) newFromConstructor((Constructor) it.next(), th3);
            if (x14 != null) {
                if (x14.getCause() == null) {
                    x14.initCause(th3);
                }
                return x14;
            }
        }
        n23.j.w(androidx.core.view.j.i(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th3);
        return null;
    }

    private static <X extends Exception> List<Constructor<X>> preferringStringsThenThrowables(List<Constructor<X>> list) {
        return (List<Constructor<X>>) WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM.sortedCopy(list);
    }

    @VisibleForTesting
    public static GetCheckedTypeValidator weakSetValidator() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    private static <X extends Exception> void wrapAndThrowExceptionOrError(Throwable th3, Class<X> cls) throws Exception {
        if (th3 instanceof Error) {
            throw new ExecutionError((Error) th3);
        }
        if (!(th3 instanceof RuntimeException)) {
            throw newWithCause(cls, th3);
        }
        throw new UncheckedExecutionException(th3);
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(GetCheckedTypeValidator getCheckedTypeValidator, Future<V> future, Class<X> cls) throws Exception {
        getCheckedTypeValidator.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw newWithCause(cls, e4);
        } catch (ExecutionException e14) {
            wrapAndThrowExceptionOrError(e14.getCause(), cls);
            e0.l();
            return null;
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) {
        return (V) getChecked(bestGetCheckedTypeValidator(), future, cls);
    }
}
