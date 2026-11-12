package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n23.j;
import o2.c;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Throwables {

    @J2ktIncompatible
    @GwtIncompatible
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @VisibleForTesting
    @J2ktIncompatible
    @GwtIncompatible
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceDepthMethod;

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceElementMethod;

    @J2ktIncompatible
    @GwtIncompatible
    private static final Object jla;

    static {
        Object jla2 = getJLA();
        jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod(jla2) : null;
    }

    private Throwables() {
    }

    public static List<Throwable> getCausalChain(Throwable th3) {
        Preconditions.checkNotNull(th3);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th3);
        boolean z14 = false;
        Throwable cause = th3;
        while (true) {
            th3 = th3.getCause();
            if (th3 == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th3);
            if (th3 == cause) {
                j.w("Loop in causal chain detected.", th3);
                return null;
            }
            if (z14) {
                cause = cause.getCause();
            }
            z14 = !z14;
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th3, Class<X> cls) {
        try {
            return cls.cast(th3.getCause());
        } catch (ClassCastException e4) {
            e4.initCause(th3);
            throw e4;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getJlaMethod(String str, Class<?>... clsArr) {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th3) {
        boolean z14 = false;
        Throwable cause = th3;
        while (true) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                return th3;
            }
            if (cause2 == cause) {
                j.w("Loop in causal chain detected.", cause2);
                return null;
            }
            if (z14) {
                cause = cause.getCause();
            }
            z14 = !z14;
            th3 = cause2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getSizeMethod(Object obj) {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(obj, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th3) {
        StringWriter stringWriter = new StringWriter();
        th3.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @J2ktIncompatible
    @GwtIncompatible
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            c.p(e4);
            return null;
        } catch (InvocationTargetException e14) {
            throw propagate(e14.getCause());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static List<StackTraceElement> jlaStackTrace(final Throwable th3) {
        Preconditions.checkNotNull(th3);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int i14) {
                Method method = Throwables.getStackTraceElementMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(method, obj, th3, Integer.valueOf(i14));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.getStackTraceDepthMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(method, obj, th3)).intValue();
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th3) {
        return lazyStackTraceIsLazy() ? jlaStackTrace(th3) : Collections.unmodifiableList(Arrays.asList(th3.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable th3) {
        throwIfUnchecked(th3);
        throw new RuntimeException(th3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th3, Class<X> cls) throws X {
        if (th3 != null) {
            throwIfInstanceOf(th3, cls);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th3, Class<X1> cls, Class<X2> cls2) throws X {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th3, cls);
        propagateIfPossible(th3, cls2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th3, Class<X> cls) throws X {
        Preconditions.checkNotNull(th3);
        if (cls.isInstance(th3)) {
            throw cls.cast(th3);
        }
    }

    public static void throwIfUnchecked(Throwable th3) {
        Preconditions.checkNotNull(th3);
        if (th3 instanceof RuntimeException) {
            throw ((RuntimeException) th3);
        }
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfPossible(Throwable th3, Class<X> cls) throws X {
        propagateIfInstanceOf(th3, cls);
        propagateIfPossible(th3);
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(Throwable th3) {
        if (th3 != null) {
            throwIfUnchecked(th3);
        }
    }
}
