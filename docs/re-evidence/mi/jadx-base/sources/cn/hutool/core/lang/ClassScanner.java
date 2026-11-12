package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.ClassScanner;
import defpackage.au3;
import defpackage.d8q;
import defpackage.i04;
import defpackage.irk;
import defpackage.sm9;
import defpackage.tt3;
import defpackage.yz3;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes.dex */
public class ClassScanner implements Serializable {
    private static final long serialVersionUID = 1;
    private final Charset charset;
    private final sm9<Class<?>> classFilter;
    private ClassLoader classLoader;
    private final Set<Class<?>> classes;
    private boolean initialize;
    private final String packageDirName;
    private final String packageName;
    private final String packageNameWithDot;
    private final String packagePath;

    public ClassScanner() {
        this(null);
    }

    private void addIfAccept(String str) {
        if (tt3.F(str)) {
            return;
        }
        int length = str.length();
        int length2 = this.packageName.length();
        if (length == length2) {
            if (str.equals(this.packageName)) {
                addIfAccept(loadClass(str));
            }
        } else if (length > length2) {
            if (".".equals(this.packageNameWithDot) || str.startsWith(this.packageNameWithDot)) {
                addIfAccept(loadClass(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanAllPackageByAnnotation$0(Class cls, Class cls2) {
        return cls2.isAnnotationPresent(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanAllPackageBySuper$2(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) && !cls.equals(cls2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanPackageByAnnotation$1(Class cls, Class cls2) {
        return cls2.isAnnotationPresent(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanPackageBySuper$3(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) && !cls.equals(cls2);
    }

    private Class<?> loadClass(String str) {
        ClassLoader classLoaderB = this.classLoader;
        if (classLoaderB == null) {
            classLoaderB = yz3.b();
            this.classLoader = classLoaderB;
        }
        try {
            return Class.forName(str, this.initialize, classLoaderB);
        } catch (ClassNotFoundException | NoClassDefFoundError | UnsupportedClassVersionError unused) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Class<?>> scanAllPackage() {
        return scanAllPackage("", null);
    }

    public static Set<Class<?>> scanAllPackageByAnnotation(String str, final Class<? extends Annotation> cls) {
        return scanAllPackage(str, new sm9() { // from class: c04
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return ClassScanner.lambda$scanAllPackageByAnnotation$0(cls, (Class) obj);
            }
        });
    }

    public static Set<Class<?>> scanAllPackageBySuper(String str, final Class<?> cls) {
        return scanAllPackage(str, new sm9() { // from class: b04
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return ClassScanner.lambda$scanAllPackageBySuper$2(cls, (Class) obj);
            }
        });
    }

    private void scanFile(File file, String str) {
        File[] fileArrListFiles;
        if (!file.isFile()) {
            if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                scanFile(file2, str == null ? subPathBeforePackage(file) : str);
            }
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.endsWith(".class")) {
            addIfAccept(absolutePath.substring(str.length(), absolutePath.length() - 6).replace(File.separatorChar, '.'));
        } else if (absolutePath.endsWith(".jar")) {
            try {
                scanJar(new JarFile(file));
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
    }

    private void scanJar(JarFile jarFile) {
        for (JarEntry jarEntry : new EnumerationIter(jarFile.entries())) {
            String strQ = tt3.Q(jarEntry.getName(), "/");
            if (tt3.G(this.packagePath) || strQ.startsWith(this.packagePath)) {
                if (strQ.endsWith(".class") && !jarEntry.isDirectory()) {
                    addIfAccept(loadClass(strQ.substring(0, strQ.length() - 6).replace('/', '.')));
                }
            }
        }
    }

    private void scanJavaClassPaths() {
        for (String str : i04.l()) {
            scanFile(new File(d8q.a(str, au3.e())), null);
        }
    }

    public static Set<Class<?>> scanPackage() {
        return scanPackage("", null);
    }

    public static Set<Class<?>> scanPackageByAnnotation(String str, final Class<? extends Annotation> cls) {
        return scanPackage(str, new sm9() { // from class: e04
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return ClassScanner.lambda$scanPackageByAnnotation$1(cls, (Class) obj);
            }
        });
    }

    public static Set<Class<?>> scanPackageBySuper(String str, final Class<?> cls) {
        return scanPackage(str, new sm9() { // from class: d04
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return ClassScanner.lambda$scanPackageBySuper$3(cls, (Class) obj);
            }
        });
    }

    private String subPathBeforePackage(File file) {
        String absolutePath = file.getAbsolutePath();
        if (tt3.I(this.packageDirName)) {
            absolutePath = tt3.l0(absolutePath, this.packageDirName, true);
        }
        return tt3.b(absolutePath, File.separator);
    }

    public Set<Class<?>> scan() {
        return scan(false);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void setInitialize(boolean z) {
        this.initialize = z;
    }

    public ClassScanner(String str) {
        this(str, null);
    }

    public static Set<Class<?>> scanAllPackage(String str, sm9<Class<?>> sm9Var) {
        return new ClassScanner(str, sm9Var).scan(true);
    }

    public static Set<Class<?>> scanPackage(String str) {
        return scanPackage(str, null);
    }

    public Set<Class<?>> scan(boolean z) {
        for (URL url : irk.c(this.packagePath)) {
            String protocol = url.getProtocol();
            protocol.hashCode();
            if (protocol.equals("jar")) {
                scanJar(d8q.h(url));
            } else if (protocol.equals("file")) {
                scanFile(new File(d8q.a(url.getFile(), this.charset.name())), null);
            }
        }
        if (z || CollUtil.h(this.classes)) {
            scanJavaClassPaths();
        }
        return Collections.unmodifiableSet(this.classes);
    }

    public ClassScanner(String str, sm9<Class<?>> sm9Var) {
        this(str, sm9Var, au3.f3449b);
    }

    public static Set<Class<?>> scanPackage(String str, sm9<Class<?>> sm9Var) {
        return new ClassScanner(str, sm9Var).scan();
    }

    public ClassScanner(String str, sm9<Class<?>> sm9Var, Charset charset) {
        this.classes = new HashSet();
        String strM = tt3.M(str);
        this.packageName = strM;
        this.packageNameWithDot = tt3.b(strM, ".");
        this.packageDirName = strM.replace('.', File.separatorChar);
        this.packagePath = strM.replace('.', '/');
        this.classFilter = sm9Var;
        this.charset = charset;
    }

    private void addIfAccept(Class<?> cls) {
        if (cls != null) {
            sm9<Class<?>> sm9Var = this.classFilter;
            if (sm9Var == null || sm9Var.accept(cls)) {
                this.classes.add(cls);
            }
        }
    }
}
