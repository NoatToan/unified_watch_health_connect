package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public class Finalizer implements Runnable {
    private static final Logger d = Logger.getLogger(Finalizer.class.getName());
    private static final String e = "com.google.common.base.FinalizableReference";

    @NullableDecl
    private static final Constructor<Thread> f;

    @NullableDecl
    private static final Field g;
    private final WeakReference<Class<?>> a;
    private final PhantomReference<Object> b;
    private final ReferenceQueue<Object> c;

    static {
        Constructor<Thread> constructorB = b();
        f = constructorB;
        g = constructorB == null ? d() : null;
    }

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.c = referenceQueue;
        this.a = new WeakReference<>(cls);
        this.b = phantomReference;
    }

    private boolean a(Reference<?> reference) {
        Method methodC = c();
        if (methodC == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.b) {
                return false;
            }
            try {
                methodC.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                d.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.c.poll();
        } while (reference != null);
        return true;
    }

    @NullableDecl
    private static Constructor<Thread> b() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private Method c() {
        Class<?> cls = this.a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    @NullableDecl
    private static Field d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            d.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public static void startFinalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        if (!cls.getName().equals(e)) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        Finalizer finalizer = new Finalizer(cls, referenceQueue, phantomReference);
        String name = Finalizer.class.getName();
        Constructor<Thread> constructor = f;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, finalizer, name, 0L, Boolean.FALSE);
            } catch (Throwable th) {
                d.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, finalizer, name);
        }
        thread.setDaemon(true);
        try {
            Field field = g;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th2) {
            d.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.c.remove())) {
        }
    }
}
