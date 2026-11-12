package io.netty.util.internal;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

/* JADX INFO: loaded from: classes2.dex */
public final class NativeLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
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
                inputStreamOpenStream = resource.openStream();
                while (true) {
                    int i = inputStreamOpenStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        closeQuietly(inputStreamOpenStream);
                        closeQuietly(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    closeQuietly(inputStreamOpenStream);
                    closeQuietly(byteArrayOutputStream);
                    throw th;
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x0181 */
    /* JADX WARN: Code duplicated, block: B:104:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00ff A[EDGE_INSN: B:113:0x00ff->B:51:0x00ff BREAK  A[LOOP:0: B:48:0x00f5->B:50:0x00fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2 A[Catch: all -> 0x00e6, Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, TryCatch #11 {Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, all -> 0x00e6, blocks: (B:38:0x00dc, B:40:0x00e2, B:51:0x00ff, B:47:0x00f1, B:48:0x00f5, B:50:0x00fb), top: B:108:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[Catch: all -> 0x00e6, Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, TryCatch #11 {Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, all -> 0x00e6, blocks: (B:38:0x00dc, B:40:0x00e2, B:51:0x00ff, B:47:0x00f1, B:48:0x00f5, B:50:0x00fb), top: B:108:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[Catch: all -> 0x00e6, Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, LOOP:0: B:48:0x00f5->B:50:0x00fb, LOOP_END, TryCatch #11 {Exception -> 0x00ea, UnsatisfiedLinkError -> 0x00ed, all -> 0x00e6, blocks: (B:38:0x00dc, B:40:0x00e2, B:51:0x00ff, B:47:0x00f1, B:48:0x00f5, B:50:0x00fb), top: B:108:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0185 A[Catch: all -> 0x0181, TryCatch #0 {, blocks: (B:88:0x0185, B:89:0x0188, B:85:0x0176, B:76:0x0155, B:78:0x015b, B:80:0x0161, B:82:0x0167), top: B:98:0x0153, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static void load(java.lang.String r10, java.lang.ClassLoader r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.NativeLibraryLoader.load(java.lang.String, java.lang.ClassLoader):void");
    }

    public static void loadFirstAvailable(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            try {
                load(str, classLoader);
                return;
            } catch (Throwable th) {
                arrayList.add(th);
                logger.debug("Unable to load the library '{}', trying next name...", str, th);
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to load any of the given libraries: " + Arrays.toString(strArr));
        ThrowableUtil.addSuppressedAndClear(illegalArgumentException, arrayList);
        throw illegalArgumentException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.netty.util.internal.logging.InternalLogger] */
    private static void loadLibrary(ClassLoader classLoader, String str, boolean z) {
        try {
            try {
                loadLibraryByHelper(tryToLoadClass(classLoader, NativeLibraryUtil.class), str, z);
                classLoader = logger;
                classLoader.debug("Successfully loaded the library {}", str);
            } catch (Exception e) {
                logger.debug("Unable to load the library '{}', trying other loading mechanism.", str, e);
                NativeLibraryUtil.loadLibrary(str, z);
                logger.debug("Successfully loaded the library {}", str);
            } catch (UnsatisfiedLinkError e2) {
                logger.debug("Unable to load the library '{}', trying other loading mechanism.", str, e2);
                NativeLibraryUtil.loadLibrary(str, z);
                logger.debug("Successfully loaded the library {}", str);
            }
        } catch (UnsatisfiedLinkError e3) {
            ThrowableUtil.addSuppressed(e3, (Throwable) classLoader);
            throw e3;
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

    public static boolean patchShadedLibraryId(InputStream inputStream, OutputStream outputStream, String str, String str2) throws IOException {
        boolean zPatchShadedLibraryId;
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        if (patchShadedLibraryId(byteArray, str, str2)) {
            zPatchShadedLibraryId = true;
        } else {
            String str3 = RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + PlatformDependent.normalizedOs() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + PlatformDependent.normalizedArch();
            zPatchShadedLibraryId = str.endsWith(str3) ? patchShadedLibraryId(byteArray, str.substring(0, str.length() - str3.length()), str2) : false;
        }
        outputStream.write(byteArray, 0, byteArray.length);
        return zPatchShadedLibraryId;
    }

    private static boolean shouldShadedLibraryIdBePatched(String str) {
        return TRY_TO_PATCH_SHADED_ID && PlatformDependent.isOsx() && !str.isEmpty();
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

    private static boolean patchShadedLibraryId(byte[] bArr, String str, String str2) {
        byte[] bytes = str.getBytes(CharsetUtil.UTF_8);
        int i = 0;
        loop0: while (true) {
            if (i >= bArr.length || bArr.length - i < bytes.length) {
                i = -1;
                break;
            }
            int i2 = 0;
            int i3 = i;
            while (i2 < bytes.length) {
                int i4 = i3 + 1;
                int i5 = i2 + 1;
                if (bArr[i3] != bytes[i2]) {
                    break;
                }
                if (i5 == bytes.length) {
                    break loop0;
                }
                i3 = i4;
                i2 = i5;
            }
            i++;
        }
        if (i == -1) {
            logger.debug("Was not able to find the ID of the shaded native library {}, can't adjust it.", str2);
            return false;
        }
        for (int i6 = 0; i6 < bytes.length; i6++) {
            byte[] bArr2 = UNIQUE_ID_BYTES;
            bArr[i + i6] = bArr2[PlatformDependent.threadLocalRandom().nextInt(bArr2.length)];
        }
        InternalLogger internalLogger = logger;
        if (!internalLogger.isDebugEnabled()) {
            return true;
        }
        internalLogger.debug("Found the ID of the shaded native library {}. Replacing ID part {} with {}", str2, str, new String(bArr, i, bytes.length, CharsetUtil.UTF_8));
        return true;
    }
}
