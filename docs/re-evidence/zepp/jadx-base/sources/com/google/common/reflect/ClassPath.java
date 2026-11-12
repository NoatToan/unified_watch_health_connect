package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class ClassPath {
    private static final Logger b = Logger.getLogger(ClassPath.class.getName());
    private static final Predicate<ClassInfo> c = new a();
    private static final Splitter d = Splitter.on(" ").omitEmptyStrings();
    private static final String e = ".class";
    private final ImmutableSet<ResourceInfo> a;

    @Beta
    public static final class ClassInfo extends ResourceInfo {
        private final String c;

        public ClassInfo(String str, ClassLoader classLoader) {
            super(str, classLoader);
            this.c = ClassPath.c(str);
        }

        public String getName() {
            return this.c;
        }

        public String getPackageName() {
            return Reflection.getPackageName(this.c);
        }

        public String getSimpleName() {
            int iLastIndexOf = this.c.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return CharMatcher.digit().trimLeadingFrom(this.c.substring(iLastIndexOf + 1));
            }
            String packageName = getPackageName();
            return packageName.isEmpty() ? this.c : this.c.substring(packageName.length() + 1);
        }

        public Class<?> load() {
            try {
                return this.b.loadClass(this.c);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
            return this.c;
        }
    }

    @Beta
    public static class ResourceInfo {
        private final String a;
        public final ClassLoader b;

        public ResourceInfo(String str, ClassLoader classLoader) {
            this.a = (String) Preconditions.checkNotNull(str);
            this.b = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        public static ResourceInfo a(String str, ClassLoader classLoader) {
            return str.endsWith(ClassPath.e) ? new ClassInfo(str, classLoader) : new ResourceInfo(str, classLoader);
        }

        public final ByteSource asByteSource() {
            return Resources.asByteSource(url());
        }

        public final CharSource asCharSource(Charset charset) {
            return Resources.asCharSource(url(), charset);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ResourceInfo)) {
                return false;
            }
            ResourceInfo resourceInfo = (ResourceInfo) obj;
            return this.a.equals(resourceInfo.a) && this.b == resourceInfo.b;
        }

        public final String getResourceName() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }

        public final URL url() {
            URL resource = this.b.getResource(this.a);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.a);
        }
    }

    public static class a implements Predicate<ClassInfo> {
        @Override // com.google.common.base.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(ClassInfo classInfo) {
            return classInfo.c.indexOf(36) == -1;
        }
    }

    @VisibleForTesting
    public static final class b extends c {
        private final SetMultimap<ClassLoader, String> b = MultimapBuilder.hashKeys().linkedHashSetValues().build();

        private void m(File file, ClassLoader classLoader, String str, Set<File> set) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                ClassPath.b.warning("Cannot read directory " + file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        m(canonicalFile, classLoader, str + name + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, set);
                        set.remove(canonicalFile);
                    }
                } else {
                    String str2 = str + name;
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        this.b.get(classLoader).add(str2);
                    }
                }
            }
        }

        @Override // com.google.common.reflect.ClassPath.c
        public void h(ClassLoader classLoader, File file) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            m(file, classLoader, "", hashSet);
        }

        @Override // com.google.common.reflect.ClassPath.c
        public void k(ClassLoader classLoader, JarFile jarFile) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    this.b.get(classLoader).add(jarEntryNextElement.getName());
                }
            }
        }

        public ImmutableSet<ResourceInfo> l() {
            ImmutableSet.Builder builder = ImmutableSet.builder();
            for (Map.Entry<ClassLoader, String> entry : this.b.entries()) {
                builder.add(ResourceInfo.a(entry.getValue(), entry.getKey()));
            }
            return builder.build();
        }
    }

    public static abstract class c {
        private final Set<File> a = Sets.newHashSet();

        private static ImmutableList<URL> a(ClassLoader classLoader) {
            if (classLoader instanceof URLClassLoader) {
                return ImmutableList.copyOf(((URLClassLoader) classLoader).getURLs());
            }
            return classLoader.equals(ClassLoader.getSystemClassLoader()) ? e() : ImmutableList.of();
        }

        @VisibleForTesting
        public static ImmutableMap<File, ClassLoader> b(ClassLoader classLoader) {
            LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
            ClassLoader parent = classLoader.getParent();
            if (parent != null) {
                linkedHashMapNewLinkedHashMap.putAll(b(parent));
            }
            UnmodifiableIterator<URL> it2 = a(classLoader).iterator();
            while (it2.hasNext()) {
                URL next = it2.next();
                if (next.getProtocol().equals("file")) {
                    File fileD = ClassPath.d(next);
                    if (!linkedHashMapNewLinkedHashMap.containsKey(fileD)) {
                        linkedHashMapNewLinkedHashMap.put(fileD, classLoader);
                    }
                }
            }
            return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
        }

        @VisibleForTesting
        public static URL c(File file, String str) throws MalformedURLException {
            return new URL(file.toURI().toURL(), str);
        }

        @VisibleForTesting
        public static ImmutableSet<File> d(File file, @NullableDecl Manifest manifest) {
            if (manifest == null) {
                return ImmutableSet.of();
            }
            ImmutableSet.Builder builder = ImmutableSet.builder();
            String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
            if (value != null) {
                for (String str : ClassPath.d.split(value)) {
                    try {
                        URL urlC = c(file, str);
                        if (urlC.getProtocol().equals("file")) {
                            builder.add(ClassPath.d(urlC));
                        }
                    } catch (MalformedURLException unused) {
                        ClassPath.b.warning("Invalid Class-Path entry: " + str);
                    }
                }
            }
            return builder.build();
        }

        @VisibleForTesting
        public static ImmutableList<URL> e() {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : Splitter.on(StandardSystemProperty.PATH_SEPARATOR.value()).split(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
                try {
                    try {
                        builder.add(new File(str).toURI().toURL());
                    } catch (SecurityException unused) {
                        builder.add(new URL("file", (String) null, new File(str).getAbsolutePath()));
                    }
                } catch (MalformedURLException e) {
                    ClassPath.b.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e);
                }
            }
            return builder.build();
        }

        private void i(File file, ClassLoader classLoader) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        h(classLoader, file);
                    } else {
                        j(file, classLoader);
                    }
                }
            } catch (SecurityException e) {
                ClassPath.b.warning("Cannot access " + file + ": " + e);
            }
        }

        private void j(File file, ClassLoader classLoader) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    UnmodifiableIterator<File> it2 = d(file, jarFile.getManifest()).iterator();
                    while (it2.hasNext()) {
                        f(it2.next(), classLoader);
                    }
                    k(classLoader, jarFile);
                } finally {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        }

        @VisibleForTesting
        public final void f(File file, ClassLoader classLoader) throws IOException {
            if (this.a.add(file.getCanonicalFile())) {
                i(file, classLoader);
            }
        }

        public final void g(ClassLoader classLoader) throws IOException {
            UnmodifiableIterator<Map.Entry<File, ClassLoader>> it2 = b(classLoader).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<File, ClassLoader> next = it2.next();
                f(next.getKey(), next.getValue());
            }
        }

        public abstract void h(ClassLoader classLoader, File file) throws IOException;

        public abstract void k(ClassLoader classLoader, JarFile jarFile) throws IOException;
    }

    private ClassPath(ImmutableSet<ResourceInfo> immutableSet) {
        this.a = immutableSet;
    }

    @VisibleForTesting
    public static String c(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    @VisibleForTesting
    public static File d(URL url) {
        Preconditions.checkArgument(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public static ClassPath from(ClassLoader classLoader) throws IOException {
        b bVar = new b();
        bVar.g(classLoader);
        return new ClassPath(bVar.l());
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
        return FluentIterable.from(this.a).filter(ClassInfo.class).toSet();
    }

    public ImmutableSet<ResourceInfo> getResources() {
        return this.a;
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
        return FluentIterable.from(this.a).filter(ClassInfo.class).filter(c).toSet();
    }

    public ImmutableSet<ClassInfo> getTopLevelClassesRecursive(String str) {
        Preconditions.checkNotNull(str);
        String str2 = str + '.';
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it2 = getTopLevelClasses().iterator();
        while (it2.hasNext()) {
            ClassInfo next = it2.next();
            if (next.getName().startsWith(str2)) {
                builder.add(next);
            }
        }
        return builder.build();
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses(String str) {
        Preconditions.checkNotNull(str);
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it2 = getTopLevelClasses().iterator();
        while (it2.hasNext()) {
            ClassInfo next = it2.next();
            if (next.getPackageName().equals(str)) {
                builder.add(next);
            }
        }
        return builder.build();
    }
}
