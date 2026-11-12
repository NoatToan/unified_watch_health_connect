package io.jsonwebtoken.lang;

import defpackage.yya;
import java.io.InputStream;
import java.lang.reflect.GenericDeclaration;
import java.net.URL;

/* JADX INFO: loaded from: classes46.dex */
public final class Classes {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ClassLoaderAccessor f37892c = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.2
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        protected ClassLoader doGetClassLoader() {
            return Thread.currentThread().getContextClassLoader();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoaderAccessor f37890a = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.4
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        protected ClassLoader doGetClassLoader() {
            return Classes.class.getClassLoader();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ClassLoaderAccessor f37891b = new ExceptionIgnoringAccessor() { // from class: io.jsonwebtoken.lang.Classes.5
        @Override // io.jsonwebtoken.lang.Classes.ExceptionIgnoringAccessor
        protected ClassLoader doGetClassLoader() {
            return ClassLoader.getSystemClassLoader();
        }
    };

    interface ClassLoaderAccessor {
        URL getResource(String str);

        InputStream getResourceStream(String str);

        Class<?> loadClass(String str);
    }

    private Classes() {
    }

    public static <T> Class<T> b(String str) throws yya {
        GenericDeclaration genericDeclarationLoadClass = f37892c.loadClass(str);
        if (genericDeclarationLoadClass == null) {
            genericDeclarationLoadClass = (Class<T>) f37890a.loadClass(str);
        }
        if (genericDeclarationLoadClass == null) {
            genericDeclarationLoadClass = (Class<T>) f37891b.loadClass(str);
        }
        if (genericDeclarationLoadClass != null) {
            return (Class<T>) genericDeclarationLoadClass;
        }
        String str2 = "Unable to load class named [" + str + "] from the thread context, current, or system/application ClassLoaders.  All heuristics have been exhausted.  Class could not be found.";
        if (str != null && str.startsWith("io.jsonwebtoken.impl")) {
            str2 = str2 + "  Have you remembered to include the jjwt-impl.jar in your runtime classpath?";
        }
        throw new yya(str2);
    }

    static abstract class ExceptionIgnoringAccessor implements ClassLoaderAccessor {
        protected abstract ClassLoader doGetClassLoader() throws Throwable;

        private ExceptionIgnoringAccessor() {
        }

        @Override // io.jsonwebtoken.lang.Classes.ClassLoaderAccessor
        public Class<?> loadClass(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader == null) {
                return null;
            }
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        @Override // io.jsonwebtoken.lang.Classes.ClassLoaderAccessor
        public URL getResource(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                return classLoader.getResource(str);
            }
            return null;
        }

        @Override // io.jsonwebtoken.lang.Classes.ClassLoaderAccessor
        public InputStream getResourceStream(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                return classLoader.getResourceAsStream(str);
            }
            return null;
        }

        protected final ClassLoader getClassLoader() {
            try {
                return doGetClassLoader();
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
