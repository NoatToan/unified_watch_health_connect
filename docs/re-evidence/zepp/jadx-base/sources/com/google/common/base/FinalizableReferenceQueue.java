package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
public class FinalizableReferenceQueue implements Closeable {
    private static final String e = "com.google.common.base.internal.Finalizer";
    public final ReferenceQueue<Object> a;
    public final PhantomReference<Object> b;
    public final boolean c;
    private static final Logger d = Logger.getLogger(FinalizableReferenceQueue.class.getName());
    private static final Method f = c(d(new d(), new a(), new b()));

    public static class a implements c {
        private static final String a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        @Override // com.google.common.base.FinalizableReferenceQueue.c
        @NullableDecl
        public Class<?> a() {
            try {
                return c(b()).loadClass(FinalizableReferenceQueue.e);
            } catch (Exception e) {
                FinalizableReferenceQueue.d.log(Level.WARNING, a, (Throwable) e);
                return null;
            }
        }

        public URL b() throws IOException {
            String str = FinalizableReferenceQueue.e.replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        public URLClassLoader c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    public static class b implements c {
        @Override // com.google.common.base.FinalizableReferenceQueue.c
        public Class<?> a() {
            try {
                return Class.forName(FinalizableReferenceQueue.e);
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    public interface c {
        @NullableDecl
        Class<?> a();
    }

    public static class d implements c {

        @VisibleForTesting
        public static boolean a;

        @Override // com.google.common.base.FinalizableReferenceQueue.c
        @NullableDecl
        public Class<?> a() {
            if (a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(FinalizableReferenceQueue.e);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.a = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.b = phantomReference;
        boolean z = true;
        try {
            f.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (Throwable th) {
            d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.c = z;
    }

    public static Method c(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    private static Class<?> d(c... cVarArr) {
        for (c cVar : cVarArr) {
            Class<?> clsA = cVar.a();
            if (clsA != null) {
                return clsA;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        if (this.c) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.a.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((FinalizableReference) referencePoll).finalizeReferent();
            } catch (Throwable th) {
                d.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.enqueue();
        b();
    }
}
