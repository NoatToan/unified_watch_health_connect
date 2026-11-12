package io.netty.util.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.PosixFilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class NativeLibraryLoader {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DELETE_NATIVE_LIB_AFTER_LOADING;
    private static final String NATIVE_RESOURCE_HOME = "META-INF/native/";
    private static final boolean TRY_TO_PATCH_SHADED_ID;
    private static final byte[] UNIQUE_ID_BYTES;
    private static final File WORKDIR;
    private static final InternalLogger logger;

    public static final class NoexecVolumeDetector {
        private NoexecVolumeDetector() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressJava6Requirement(reason = "Usage guarded by java version check")
        public static boolean canExecuteExecutable(File file) throws IOException {
            if (PlatformDependent.javaVersion() < 7 || file.canExecute()) {
                return true;
            }
            Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(file.toPath(), new LinkOption[0]);
            EnumSet enumSetOf = EnumSet.of(PosixFilePermission.OWNER_EXECUTE, PosixFilePermission.GROUP_EXECUTE, PosixFilePermission.OTHERS_EXECUTE);
            if (posixFilePermissions.containsAll(enumSetOf)) {
                return false;
            }
            EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) posixFilePermissions);
            enumSetCopyOf.addAll(enumSetOf);
            Files.setPosixFilePermissions(file.toPath(), enumSetCopyOf);
            return file.canExecute();
        }
    }

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) NativeLibraryLoader.class);
        logger = internalLoggerFactory;
        UNIQUE_ID_BYTES = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(CharsetUtil.US_ASCII);
        String str = SystemPropertyUtil.get("io.netty.native.workdir");
        if (str != null) {
            File file = new File(str);
            file.mkdirs();
            try {
                file = file.getAbsoluteFile();
            } catch (Exception unused) {
            }
            WORKDIR = file;
            logger.debug("-Dio.netty.native.workdir: " + file);
        } else {
            File fileTmpdir = PlatformDependent.tmpdir();
            WORKDIR = fileTmpdir;
            internalLoggerFactory.debug("-Dio.netty.native.workdir: " + fileTmpdir + " (io.netty.tmpdir)");
        }
        boolean z = SystemPropertyUtil.getBoolean("io.netty.native.deleteLibAfterLoading", true);
        DELETE_NATIVE_LIB_AFTER_LOADING = z;
        InternalLogger internalLogger = logger;
        internalLogger.debug("-Dio.netty.native.deleteLibAfterLoading: {}", Boolean.valueOf(z));
        boolean z2 = SystemPropertyUtil.getBoolean("io.netty.native.tryPatchShadedId", true);
        TRY_TO_PATCH_SHADED_ID = z2;
        internalLogger.debug("-Dio.netty.native.tryPatchShadedId: {}", Boolean.valueOf(z2));
    }

    private NativeLibraryLoader() {
    }

    private static String calculatePackagePrefix() {
        String name = NativeLibraryLoader.class.getName();
        String strReplace = "io!netty!util!internal!NativeLibraryLoader".replace('!', '.');
        if (name.endsWith(strReplace)) {
            return name.substring(0, name.length() - strReplace.length());
        }
        throw new UnsatisfiedLinkError(String.format("Could not find prefix added to %s to get %s. When shading, only adding a package prefix is supported", strReplace, name));
    }

    private static byte[] classToByteArray(Class<?> cls) throws ClassNotFoundException {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        URL resource = cls.getResource(name + ".class");
        if (resource == null) {
            throw new ClassNotFoundException(cls.getName());
        }
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        InputStream inputStreamOpenStream = null;
        try {
            try {
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(resource);
                while (true) {
                    int i = inputStreamOpenStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        closeQuietly(inputStreamOpenStream);
                        closeQuietly(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                throw new ClassNotFoundException(cls.getName(), e);
            }
        } catch (Throwable th) {
            closeQuietly(inputStreamOpenStream);
            closeQuietly(byteArrayOutputStream);
            throw th;
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static byte[] generateUniqueId(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = UNIQUE_ID_BYTES;
            bArr[i2] = bArr2[PlatformDependent.threadLocalRandom().nextInt(bArr2.length)];
        }
        return bArr;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0170 */
    /* JADX WARN: Code duplicated, block: B:102:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00cd A[EDGE_INSN: B:116:0x00cd->B:37:0x00cd BREAK  A[LOOP:0: B:34:0x00c3->B:36:0x00c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9 A[Catch: all -> 0x00f8, Exception -> 0x00fb, UnsatisfiedLinkError -> 0x00fd, LOOP:0: B:34:0x00c3->B:36:0x00c9, LOOP_END, TryCatch #11 {Exception -> 0x00fb, UnsatisfiedLinkError -> 0x00fd, all -> 0x00f8, blocks: (B:33:0x00c1, B:34:0x00c3, B:36:0x00c9, B:37:0x00cd, B:39:0x00d6, B:40:0x00d9), top: B:111:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[Catch: all -> 0x00f8, Exception -> 0x00fb, UnsatisfiedLinkError -> 0x00fd, TryCatch #11 {Exception -> 0x00fb, UnsatisfiedLinkError -> 0x00fd, all -> 0x00f8, blocks: (B:33:0x00c1, B:34:0x00c3, B:36:0x00c9, B:37:0x00cd, B:39:0x00d6, B:40:0x00d9), top: B:111:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016c A[Catch: all -> 0x0170, TryCatch #6 {, blocks: (B:89:0x016c, B:90:0x016f, B:88:0x0162, B:79:0x0141, B:81:0x0147, B:83:0x014d, B:85:0x0153), top: B:102:0x0141, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void load(String str, ClassLoader classLoader) throws Throwable {
        File fileCreateTempFile;
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpenStream;
        String str2;
        byte[] bArr;
        int i;
        String strReplace = calculatePackagePrefix().replace('.', '_');
        String str3 = strReplace + str;
        ArrayList arrayList = new ArrayList();
        try {
            loadLibrary(classLoader, str3, false);
        } catch (Throwable th) {
            arrayList.add(th);
            String strMapLibraryName = System.mapLibraryName(str3);
            String str4 = NATIVE_RESOURCE_HOME + strMapLibraryName;
            URL systemResource = classLoader == null ? ClassLoader.getSystemResource(str4) : classLoader.getResource(str4);
            InputStream inputStream = null;
            inputStream = null;
            inputStream = null;
            inputStream = null;
            File file = null;
            if (systemResource != null) {
                int iLastIndexOf = strMapLibraryName.lastIndexOf(46);
                fileCreateTempFile = PlatformDependent.createTempFile(strMapLibraryName.substring(0, iLastIndexOf), strMapLibraryName.substring(iLastIndexOf), WORKDIR);
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(systemResource);
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                bArr = new byte[8192];
                while (true) {
                    i = inputStreamOpenStream.read(bArr);
                    if (i > 0) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.flush();
                if (shouldShadedLibraryIdBePatched(strReplace)) {
                    tryPatchShadedLibraryIdAndSign(fileCreateTempFile, str);
                }
                closeQuietly(fileOutputStream);
                loadLibrary(classLoader, fileCreateTempFile.getPath(), true);
                closeQuietly(inputStreamOpenStream);
                closeQuietly(null);
                if (DELETE_NATIVE_LIB_AFTER_LOADING) {
                }
                fileCreateTempFile.deleteOnExit();
                return;
            }
            try {
                if (!PlatformDependent.isOsx()) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException(str4);
                    ThrowableUtil.addSuppressedAndClear(fileNotFoundException, arrayList);
                    throw fileNotFoundException;
                }
                if (str4.endsWith(".jnilib")) {
                    str2 = "META-INF/native/lib" + str3 + ".dynlib";
                } else {
                    str2 = "META-INF/native/lib" + str3 + ".jnilib";
                }
                systemResource = classLoader == null ? ClassLoader.getSystemResource(str2) : classLoader.getResource(str2);
                if (systemResource == null) {
                    FileNotFoundException fileNotFoundException2 = new FileNotFoundException(str2);
                    ThrowableUtil.addSuppressedAndClear(fileNotFoundException2, arrayList);
                    throw fileNotFoundException2;
                }
                int iLastIndexOf2 = strMapLibraryName.lastIndexOf(46);
                fileCreateTempFile = PlatformDependent.createTempFile(strMapLibraryName.substring(0, iLastIndexOf2), strMapLibraryName.substring(iLastIndexOf2), WORKDIR);
                try {
                    inputStreamOpenStream = FirebasePerfUrlConnection.openStream(systemResource);
                    try {
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            bArr = new byte[8192];
                            while (true) {
                                i = inputStreamOpenStream.read(bArr);
                                if (i > 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                            fileOutputStream.flush();
                            if (shouldShadedLibraryIdBePatched(strReplace)) {
                                tryPatchShadedLibraryIdAndSign(fileCreateTempFile, str);
                            }
                            closeQuietly(fileOutputStream);
                            loadLibrary(classLoader, fileCreateTempFile.getPath(), true);
                            closeQuietly(inputStreamOpenStream);
                            closeQuietly(null);
                            if (DELETE_NATIVE_LIB_AFTER_LOADING || !fileCreateTempFile.delete()) {
                                fileCreateTempFile.deleteOnExit();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            e = e;
                            inputStream = inputStreamOpenStream;
                            try {
                                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("could not load a native library: " + str3);
                                unsatisfiedLinkError.initCause(e);
                                ThrowableUtil.addSuppressedAndClear(unsatisfiedLinkError, arrayList);
                                throw unsatisfiedLinkError;
                            } catch (Throwable th2) {
                                th = th2;
                                closeQuietly(inputStream);
                                closeQuietly(fileOutputStream);
                                if (fileCreateTempFile != null) {
                                    fileCreateTempFile.deleteOnExit();
                                }
                                throw th;
                            }
                        } catch (UnsatisfiedLinkError e2) {
                            e = e2;
                            file = fileCreateTempFile;
                            if (file != null) {
                                ThrowableUtil.addSuppressedAndClear(e, arrayList);
                                throw e;
                            }
                            try {
                                if (!file.isFile() && file.canRead() && !NoexecVolumeDetector.canExecuteExecutable(file)) {
                                    logger.info("{} exists but cannot be executed even when execute permissions set; check volume for \"noexec\" flag; use -D{}=[path] to set native working directory separately.", file.getPath(), "io.netty.native.workdir");
                                }
                            } catch (Throwable th3) {
                                arrayList.add(th3);
                                logger.debug("Error checking if {} is on a file store mounted with noexec", file, th3);
                            }
                            ThrowableUtil.addSuppressedAndClear(e, arrayList);
                            throw e;
                            closeQuietly(inputStream);
                            closeQuietly(fileOutputStream);
                            if (fileCreateTempFile != null) {
                                fileCreateTempFile.deleteOnExit();
                            }
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = inputStreamOpenStream;
                            closeQuietly(inputStream);
                            closeQuietly(fileOutputStream);
                            if (fileCreateTempFile != null) {
                                fileCreateTempFile.deleteOnExit();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                    } catch (UnsatisfiedLinkError e4) {
                        e = e4;
                        fileOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = null;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream = null;
                } catch (UnsatisfiedLinkError e6) {
                    e = e6;
                    inputStreamOpenStream = null;
                    fileOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = null;
                    closeQuietly(inputStream);
                    closeQuietly(fileOutputStream);
                    if (fileCreateTempFile != null) {
                        fileCreateTempFile.deleteOnExit();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileCreateTempFile = null;
                fileOutputStream = null;
                UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("could not load a native library: " + str3);
                unsatisfiedLinkError2.initCause(e);
                ThrowableUtil.addSuppressedAndClear(unsatisfiedLinkError2, arrayList);
                throw unsatisfiedLinkError2;
            } catch (UnsatisfiedLinkError e8) {
                e = e8;
                inputStreamOpenStream = null;
                fileOutputStream = null;
                if (file != null) {
                    ThrowableUtil.addSuppressedAndClear(e, arrayList);
                    throw e;
                }
                if (!file.isFile()) {
                    ThrowableUtil.addSuppressedAndClear(e, arrayList);
                    throw e;
                }
                logger.info("{} exists but cannot be executed even when execute permissions set; check volume for \"noexec\" flag; use -D{}=[path] to set native working directory separately.", file.getPath(), "io.netty.native.workdir");
                ThrowableUtil.addSuppressedAndClear(e, arrayList);
                throw e;
                closeQuietly(inputStream);
                closeQuietly(fileOutputStream);
                if (fileCreateTempFile != null) {
                    fileCreateTempFile.deleteOnExit();
                }
                throw th;
            } catch (Throwable th7) {
                th = th7;
                fileCreateTempFile = null;
                fileOutputStream = null;
                closeQuietly(inputStream);
                closeQuietly(fileOutputStream);
                if (fileCreateTempFile != null) {
                    fileCreateTempFile.deleteOnExit();
                }
                throw th;
            }
            closeQuietly(inputStream);
            closeQuietly(fileOutputStream);
            if (fileCreateTempFile != null && (!DELETE_NATIVE_LIB_AFTER_LOADING || !fileCreateTempFile.delete())) {
                fileCreateTempFile.deleteOnExit();
            }
            throw th;
        }
    }

    public static void loadFirstAvailable(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            try {
                load(str, classLoader);
                return;
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to load any of the given libraries: " + Arrays.toString(strArr));
        ThrowableUtil.addSuppressedAndClear(illegalArgumentException, arrayList);
        throw illegalArgumentException;
    }

    private static void loadLibrary(ClassLoader classLoader, String str, boolean z) {
        try {
            try {
                loadLibraryByHelper(tryToLoadClass(classLoader, NativeLibraryUtil.class), str, z);
                logger.debug("Successfully loaded the library {}", str);
            } catch (NoSuchMethodError e) {
                if (0 != 0) {
                    ThrowableUtil.addSuppressed(e, (Throwable) null);
                }
                rethrowWithMoreDetailsIfPossible(str, e);
            }
        } catch (Exception | UnsatisfiedLinkError e2) {
            try {
                NativeLibraryUtil.loadLibrary(str, z);
                logger.debug("Successfully loaded the library {}", str);
            } catch (UnsatisfiedLinkError e3) {
                ThrowableUtil.addSuppressed(e3, e2);
                throw e3;
            }
        }
    }

    private static void loadLibraryByHelper(final Class<?> cls, final String str, final boolean z) throws UnsatisfiedLinkError {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.NativeLibraryLoader.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    Method method = cls.getMethod("loadLibrary", String.class, Boolean.TYPE);
                    method.setAccessible(true);
                    return method.invoke(null, str, Boolean.valueOf(z));
                } catch (Exception e) {
                    return e;
                }
            }
        });
        if (objDoPrivileged instanceof Throwable) {
            Throwable th = (Throwable) objDoPrivileged;
            Throwable cause = th.getCause();
            if (cause instanceof UnsatisfiedLinkError) {
                throw ((UnsatisfiedLinkError) cause);
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(th.getMessage());
            unsatisfiedLinkError.initCause(th);
            throw unsatisfiedLinkError;
        }
    }

    @SuppressJava6Requirement(reason = "Guarded by version check")
    private static void rethrowWithMoreDetailsIfPossible(String str, NoSuchMethodError noSuchMethodError) {
        if (PlatformDependent.javaVersion() < 7) {
            throw noSuchMethodError;
        }
        throw new LinkageError("Possible multiple incompatible native libraries on the classpath for '" + str + "'?", noSuchMethodError);
    }

    private static boolean shouldShadedLibraryIdBePatched(String str) {
        return TRY_TO_PATCH_SHADED_ID && PlatformDependent.isOsx() && !str.isEmpty();
    }

    private static boolean tryExec(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor != 0) {
                logger.debug("Execution of '{}' failed: {}", str, Integer.valueOf(iWaitFor));
                return false;
            }
            logger.debug("Execution of '{}' succeed: {}", str, Integer.valueOf(iWaitFor));
            return true;
        } catch (IOException e) {
            logger.info("Execution of '{}' failed.", str, e);
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (SecurityException e2) {
            logger.error("Execution of '{}' failed.", str, e2);
            return false;
        }
    }

    public static void tryPatchShadedLibraryIdAndSign(File file, String str) {
        if (tryExec("install_name_tool -id " + new String(generateUniqueId(str.length()), CharsetUtil.UTF_8) + " " + file.getAbsolutePath())) {
            tryExec("codesign -s - " + file.getAbsolutePath());
        }
    }

    private static Class<?> tryToLoadClass(final ClassLoader classLoader, final Class<?> cls) throws ClassNotFoundException {
        try {
            return Class.forName(cls.getName(), false, classLoader);
        } catch (ClassNotFoundException e) {
            if (classLoader == null) {
                throw e;
            }
            try {
                final byte[] bArrClassToByteArray = classToByteArray(cls);
                return (Class) AccessController.doPrivileged(new PrivilegedAction<Class<?>>() { // from class: io.netty.util.internal.NativeLibraryLoader.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.security.PrivilegedAction
                    public Class<?> run() {
                        try {
                            Class cls2 = Integer.TYPE;
                            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls2, cls2);
                            declaredMethod.setAccessible(true);
                            return (Class) declaredMethod.invoke(classLoader, cls.getName(), bArrClassToByteArray, 0, Integer.valueOf(bArrClassToByteArray.length));
                        } catch (Exception e2) {
                            throw new IllegalStateException("Define class failed!", e2);
                        }
                    }
                });
            } catch (ClassNotFoundException e2) {
                ThrowableUtil.addSuppressed(e2, e);
                throw e2;
            } catch (Error e3) {
                ThrowableUtil.addSuppressed(e3, e);
                throw e3;
            } catch (RuntimeException e4) {
                ThrowableUtil.addSuppressed(e4, e);
                throw e4;
            }
        }
    }
}
