package io.netty.util.internal;

import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.homeroom.model.Home;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@SuppressJava6Requirement(reason = "Unsafe access is guarded")
final class PlatformDependent0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long ADDRESS_FIELD_OFFSET;
    private static final Method ALLOCATE_ARRAY_METHOD;
    private static final long BYTE_ARRAY_BASE_OFFSET;
    private static final Constructor<?> DIRECT_BUFFER_CONSTRUCTOR;
    private static final Throwable EXPLICIT_NO_UNSAFE_CAUSE;
    static final int HASH_CODE_ASCII_SEED = -1028477387;
    static final int HASH_CODE_C1 = -862048943;
    static final int HASH_CODE_C2 = 461845907;
    private static final Object INTERNAL_UNSAFE;
    private static final boolean IS_ANDROID;
    private static final boolean IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE;
    private static final int JAVA_VERSION;
    private static final boolean UNALIGNED;
    static final Unsafe UNSAFE;
    private static final long UNSAFE_COPY_THRESHOLD = 1048576;
    private static final Throwable UNSAFE_UNAVAILABILITY_CAUSE;
    private static final InternalLogger logger;

    static {
        final ByteBuffer byteBufferAllocateDirect;
        final Unsafe unsafe;
        Field field;
        long jAllocateMemory;
        Constructor<?> constructor;
        boolean zMatches;
        Object obj;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) PlatformDependent0.class);
        logger = internalLoggerFactory;
        Throwable thExplicitNoUnsafeCause0 = explicitNoUnsafeCause0();
        EXPLICIT_NO_UNSAFE_CAUSE = thExplicitNoUnsafeCause0;
        JAVA_VERSION = javaVersion0();
        IS_ANDROID = isAndroid0();
        IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = explicitTryReflectionSetAccessible0();
        Method method = null;
        Object obj2 = null;
        method = null;
        method = null;
        method = null;
        if (thExplicitNoUnsafeCause0 != null) {
            byteBufferAllocateDirect = null;
            unsafe = null;
            field = null;
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
            Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                        Throwable thTrySetAccessible = ReflectionUtil.trySetAccessible(declaredField, false);
                        return thTrySetAccessible != null ? thTrySetAccessible : declaredField.get(null);
                    } catch (IllegalAccessException | NoClassDefFoundError | NoSuchFieldException | SecurityException e) {
                        return e;
                    }
                }
            });
            if (objDoPrivileged instanceof Throwable) {
                thExplicitNoUnsafeCause0 = (Throwable) objDoPrivileged;
                internalLoggerFactory.debug("sun.misc.Unsafe.theUnsafe: unavailable", thExplicitNoUnsafeCause0);
                unsafe = null;
            } else {
                unsafe = (Unsafe) objDoPrivileged;
                internalLoggerFactory.debug("sun.misc.Unsafe.theUnsafe: available");
            }
            if (unsafe != null) {
                Object objDoPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Class<?> cls = unsafe.getClass();
                            Class<?> cls2 = Long.TYPE;
                            cls.getDeclaredMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return null;
                        } catch (NoSuchMethodException | SecurityException e) {
                            return e;
                        }
                    }
                });
                if (objDoPrivileged2 == null) {
                    internalLoggerFactory.debug("sun.misc.Unsafe.copyMemory: available");
                } else {
                    thExplicitNoUnsafeCause0 = (Throwable) objDoPrivileged2;
                    internalLoggerFactory.debug("sun.misc.Unsafe.copyMemory: unavailable", thExplicitNoUnsafeCause0);
                    unsafe = null;
                }
            }
            if (unsafe != null) {
                Object objDoPrivileged3 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.3
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Field declaredField = Buffer.class.getDeclaredField(Home.JSON_KEY_ADDRESS);
                            if (unsafe.getLong(byteBufferAllocateDirect, unsafe.objectFieldOffset(declaredField)) == 0) {
                                return null;
                            }
                            return declaredField;
                        } catch (NoSuchFieldException | SecurityException e) {
                            return e;
                        }
                    }
                });
                if (objDoPrivileged3 instanceof Field) {
                    field = (Field) objDoPrivileged3;
                    internalLoggerFactory.debug("java.nio.Buffer.address: available");
                } else {
                    Throwable th = (Throwable) objDoPrivileged3;
                    internalLoggerFactory.debug("java.nio.Buffer.address: unavailable", th);
                    unsafe = null;
                    thExplicitNoUnsafeCause0 = th;
                    field = null;
                }
            } else {
                field = null;
            }
            if (unsafe != null) {
                long jArrayIndexScale = unsafe.arrayIndexScale(byte[].class);
                if (jArrayIndexScale != 1) {
                    internalLoggerFactory.debug("unsafe.arrayIndexScale is {} (expected: 1). Not using unsafe.", Long.valueOf(jArrayIndexScale));
                    thExplicitNoUnsafeCause0 = new UnsupportedOperationException("Unexpected unsafe.arrayIndexScale");
                    unsafe = null;
                }
            }
        }
        UNSAFE_UNAVAILABILITY_CAUSE = thExplicitNoUnsafeCause0;
        UNSAFE = unsafe;
        if (unsafe == null) {
            ADDRESS_FIELD_OFFSET = -1L;
            BYTE_ARRAY_BASE_OFFSET = -1L;
            UNALIGNED = false;
            DIRECT_BUFFER_CONSTRUCTOR = null;
            ALLOCATE_ARRAY_METHOD = null;
        } else {
            try {
                Object objDoPrivileged4 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.4
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Constructor<?> declaredConstructor = byteBufferAllocateDirect.getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                            Throwable thTrySetAccessible = ReflectionUtil.trySetAccessible(declaredConstructor, true);
                            return thTrySetAccessible != null ? thTrySetAccessible : declaredConstructor;
                        } catch (NoSuchMethodException | SecurityException e) {
                            return e;
                        }
                    }
                });
                if (objDoPrivileged4 instanceof Constructor) {
                    jAllocateMemory = unsafe.allocateMemory(1L);
                    try {
                        ((Constructor) objDoPrivileged4).newInstance(Long.valueOf(jAllocateMemory), 1);
                        constructor = (Constructor) objDoPrivileged4;
                        internalLoggerFactory.debug("direct buffer constructor: available");
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        constructor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (jAllocateMemory != -1) {
                            UNSAFE.freeMemory(jAllocateMemory);
                        }
                        throw th;
                    }
                } else {
                    internalLoggerFactory.debug("direct buffer constructor: unavailable", (Throwable) objDoPrivileged4);
                    constructor = null;
                    jAllocateMemory = -1;
                }
                if (jAllocateMemory != -1) {
                    UNSAFE.freeMemory(jAllocateMemory);
                }
                DIRECT_BUFFER_CONSTRUCTOR = constructor;
                ADDRESS_FIELD_OFFSET = objectFieldOffset(field);
                BYTE_ARRAY_BASE_OFFSET = UNSAFE.arrayBaseOffset(byte[].class);
                Object objDoPrivileged5 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.5
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            Class<?> cls = Class.forName("java.nio.Bits", false, PlatformDependent0.getSystemClassLoader());
                            int iJavaVersion = PlatformDependent0.javaVersion();
                            if (iJavaVersion >= 9) {
                                try {
                                    Field declaredField = cls.getDeclaredField(iJavaVersion >= 11 ? "UNALIGNED" : "unaligned");
                                    if (declaredField.getType() == Boolean.TYPE) {
                                        Unsafe unsafe2 = PlatformDependent0.UNSAFE;
                                        return Boolean.valueOf(unsafe2.getBoolean(unsafe2.staticFieldBase(declaredField), unsafe2.staticFieldOffset(declaredField)));
                                    }
                                } catch (NoSuchFieldException unused2) {
                                }
                            }
                            Method declaredMethod = cls.getDeclaredMethod("unaligned", new Class[0]);
                            Throwable thTrySetAccessible = ReflectionUtil.trySetAccessible(declaredMethod, true);
                            return thTrySetAccessible != null ? thTrySetAccessible : declaredMethod.invoke(null, new Object[0]);
                        } catch (ClassNotFoundException e) {
                            return e;
                        } catch (IllegalAccessException e2) {
                            return e2;
                        } catch (NoSuchMethodException e3) {
                            return e3;
                        } catch (SecurityException e4) {
                            return e4;
                        } catch (InvocationTargetException e5) {
                            return e5;
                        }
                    }
                });
                if (objDoPrivileged5 instanceof Boolean) {
                    Boolean bool = (Boolean) objDoPrivileged5;
                    zMatches = bool.booleanValue();
                    logger.debug("java.nio.Bits.unaligned: available, {}", bool);
                } else {
                    zMatches = SystemPropertyUtil.get("os.arch", "").matches("^(i[3-6]86|x86(_64)?|x64|amd64)$");
                    logger.debug("java.nio.Bits.unaligned: unavailable {}", Boolean.valueOf(zMatches), (Throwable) objDoPrivileged5);
                }
                UNALIGNED = zMatches;
                if (javaVersion() >= 9) {
                    final Object objDoPrivileged6 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.6
                        @Override // java.security.PrivilegedAction
                        public Object run() {
                            try {
                                return PlatformDependent0.getClassLoader(PlatformDependent0.class).loadClass("jdk.internal.misc.Unsafe").getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
                            } catch (Throwable th3) {
                                return th3;
                            }
                        }
                    });
                    if (objDoPrivileged6 instanceof Throwable) {
                        obj = null;
                    } else {
                        Object objDoPrivileged7 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent0.7
                            @Override // java.security.PrivilegedAction
                            public Object run() {
                                try {
                                    return objDoPrivileged6.getClass().getDeclaredMethod("allocateUninitializedArray", Class.class, Integer.TYPE);
                                } catch (NoSuchMethodException | SecurityException e) {
                                    return e;
                                }
                            }
                        });
                        if (objDoPrivileged7 instanceof Method) {
                            try {
                                Method method2 = (Method) objDoPrivileged7;
                                obj = objDoPrivileged6;
                                objDoPrivileged6 = objDoPrivileged7;
                                method = method2;
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                obj = objDoPrivileged6;
                                objDoPrivileged6 = e;
                            }
                        } else {
                            obj = objDoPrivileged6;
                            objDoPrivileged6 = objDoPrivileged7;
                        }
                    }
                    if (objDoPrivileged6 instanceof Throwable) {
                        logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable", (Throwable) objDoPrivileged6);
                    } else {
                        logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): available");
                    }
                } else {
                    logger.debug("jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable prior to Java9");
                    obj = null;
                }
                ALLOCATE_ARRAY_METHOD = method;
                obj2 = obj;
            } catch (Throwable th3) {
                th = th3;
                jAllocateMemory = -1;
            }
        }
        INTERNAL_UNSAFE = obj2;
        logger.debug("java.nio.DirectByteBuffer.<init>(long, int): {}", DIRECT_BUFFER_CONSTRUCTOR != null ? "available" : "unavailable");
    }

    private PlatformDependent0() {
    }

    public static int addressSize() {
        return UNSAFE.addressSize();
    }

    public static ByteBuffer allocateDirectNoCleaner(int i) {
        return newDirectBuffer(UNSAFE.allocateMemory(Math.max(1, i)), i);
    }

    public static long allocateMemory(long j) {
        return UNSAFE.allocateMemory(j);
    }

    public static byte[] allocateUninitializedArray(int i) {
        try {
            return (byte[]) ALLOCATE_ARRAY_METHOD.invoke(INTERNAL_UNSAFE, Byte.TYPE, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (InvocationTargetException e2) {
            throw new Error(e2);
        }
    }

    public static long byteArrayBaseOffset() {
        return BYTE_ARRAY_BASE_OFFSET;
    }

    public static void copyMemory(long j, long j2, long j3) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(j, j2, j3);
        } else {
            UNSAFE.copyMemory(j, j2, j3);
        }
    }

    private static void copyMemoryWithSafePointPolling(long j, long j2, long j3) {
        while (j3 > 0) {
            long jMin = Math.min(j3, 1048576L);
            UNSAFE.copyMemory(j, j2, jMin);
            j3 -= jMin;
            j += jMin;
            j2 += jMin;
        }
    }

    public static long directBufferAddress(ByteBuffer byteBuffer) {
        return getLong(byteBuffer, ADDRESS_FIELD_OFFSET);
    }

    public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & 7;
        long j = BYTE_ARRAY_BASE_OFFSET + ((long) i);
        long j2 = i2 - i;
        if (i3 >= 8) {
            long j3 = ((long) i4) + j;
            long j4 = (j - 8) + ((long) i3);
            while (j4 >= j3) {
                Unsafe unsafe = UNSAFE;
                long j5 = j3;
                if (unsafe.getLong(bArr, j4) != unsafe.getLong(bArr2, j4 + j2)) {
                    return false;
                }
                j4 -= 8;
                j3 = j5;
            }
        }
        if (i4 >= 4) {
            i4 -= 4;
            long j6 = ((long) i4) + j;
            Unsafe unsafe2 = UNSAFE;
            if (unsafe2.getInt(bArr, j6) != unsafe2.getInt(bArr2, j6 + j2)) {
                return false;
            }
        }
        long j7 = j2 + j;
        if (i4 >= 2) {
            Unsafe unsafe3 = UNSAFE;
            return unsafe3.getChar(bArr, j) == unsafe3.getChar(bArr2, j7) && (i4 == 2 || unsafe3.getByte(bArr, j + 2) == unsafe3.getByte(bArr2, j7 + 2));
        }
        if (i4 != 0) {
            Unsafe unsafe4 = UNSAFE;
            if (unsafe4.getByte(bArr, j) != unsafe4.getByte(bArr2, j7)) {
                return false;
            }
        }
        return true;
    }

    public static int equalsConstantTime(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        long j = i3 & 7;
        long j2 = BYTE_ARRAY_BASE_OFFSET + ((long) i);
        long j3 = j2 + j;
        long j4 = i2 - i;
        long j5 = 0;
        for (long j6 = (j2 - 8) + ((long) i3); j6 >= j3; j6 -= 8) {
            Unsafe unsafe = UNSAFE;
            j5 |= unsafe.getLong(bArr, j6) ^ unsafe.getLong(bArr2, j6 + j4);
        }
        if (j >= 4) {
            Unsafe unsafe2 = UNSAFE;
            j5 |= (long) (unsafe2.getInt(bArr2, j2 + j4) ^ unsafe2.getInt(bArr, j2));
            j -= 4;
        }
        if (j >= 2) {
            long j7 = j3 - j;
            Unsafe unsafe3 = UNSAFE;
            j5 |= (long) (unsafe3.getChar(bArr2, j7 + j4) ^ unsafe3.getChar(bArr, j7));
            j -= 2;
        }
        if (j == 1) {
            long j8 = j3 - 1;
            Unsafe unsafe4 = UNSAFE;
            j5 |= (long) (unsafe4.getByte(bArr, j8) ^ unsafe4.getByte(bArr2, j8 + j4));
        }
        return ConstantTimeUtils.equalsConstantTime(j5, 0L);
    }

    private static Throwable explicitNoUnsafeCause0() {
        boolean z = SystemPropertyUtil.getBoolean("io.netty.noUnsafe", false);
        InternalLogger internalLogger = logger;
        internalLogger.debug("-Dio.netty.noUnsafe: {}", Boolean.valueOf(z));
        if (z) {
            internalLogger.debug("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
        }
        String str = SystemPropertyUtil.contains("io.netty.tryUnsafe") ? "io.netty.tryUnsafe" : "org.jboss.netty.tryUnsafe";
        if (SystemPropertyUtil.getBoolean(str, true)) {
            return null;
        }
        String str2 = "sun.misc.Unsafe: unavailable (" + str + ")";
        internalLogger.debug(str2);
        return new UnsupportedOperationException(str2);
    }

    private static boolean explicitTryReflectionSetAccessible0() {
        return SystemPropertyUtil.getBoolean("io.netty.tryReflectionSetAccessible", javaVersion() < 9);
    }

    public static void freeMemory(long j) {
        UNSAFE.freeMemory(j);
    }

    public static byte getByte(long j) {
        return UNSAFE.getByte(j);
    }

    public static ClassLoader getClassLoader(final Class<?> cls) {
        return System.getSecurityManager() == null ? cls.getClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.netty.util.internal.PlatformDependent0.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return cls.getClassLoader();
            }
        });
    }

    public static ClassLoader getContextClassLoader() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.netty.util.internal.PlatformDependent0.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }

    public static int getInt(Object obj, long j) {
        return UNSAFE.getInt(obj, j);
    }

    private static long getLong(Object obj, long j) {
        return UNSAFE.getLong(obj, j);
    }

    public static Object getObject(Object obj, long j) {
        return UNSAFE.getObject(obj, j);
    }

    public static short getShort(long j) {
        return UNSAFE.getShort(j);
    }

    public static ClassLoader getSystemClassLoader() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: io.netty.util.internal.PlatformDependent0.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }

    public static Throwable getUnsafeUnavailabilityCause() {
        return UNSAFE_UNAVAILABILITY_CAUSE;
    }

    public static boolean hasAllocateArrayMethod() {
        return ALLOCATE_ARRAY_METHOD != null;
    }

    public static boolean hasDirectBufferNoCleanerConstructor() {
        return DIRECT_BUFFER_CONSTRUCTOR != null;
    }

    public static boolean hasUnsafe() {
        return UNSAFE != null;
    }

    public static int hashCodeAscii(byte[] bArr, int i, int i2) {
        int i3;
        long j = BYTE_ARRAY_BASE_OFFSET + ((long) i);
        int i4 = i2 & 7;
        long j2 = ((long) i4) + j;
        int iHashCodeAsciiSanitize = HASH_CODE_ASCII_SEED;
        for (long j3 = (j - 8) + ((long) i2); j3 >= j2; j3 -= 8) {
            iHashCodeAsciiSanitize = hashCodeAsciiCompute(UNSAFE.getLong(bArr, j3), iHashCodeAsciiSanitize);
        }
        if (i4 == 0) {
            return iHashCodeAsciiSanitize;
        }
        boolean z = (i4 != 2) & (i4 != 4) & (i4 != 6);
        int i5 = HASH_CODE_C2;
        if (z) {
            iHashCodeAsciiSanitize = (iHashCodeAsciiSanitize * (-862048943)) + hashCodeAsciiSanitize(UNSAFE.getByte(bArr, j));
            j++;
            i3 = HASH_CODE_C2;
        } else {
            i3 = -862048943;
        }
        if ((i4 != 5) & (i4 != 1) & (i4 != 4)) {
            iHashCodeAsciiSanitize = (iHashCodeAsciiSanitize * i3) + hashCodeAsciiSanitize(UNSAFE.getShort(bArr, j));
            if (i3 != -862048943) {
                i5 = -862048943;
            }
            j += 2;
            i3 = i5;
        }
        return i4 >= 4 ? (iHashCodeAsciiSanitize * i3) + hashCodeAsciiSanitize(UNSAFE.getInt(bArr, j)) : iHashCodeAsciiSanitize;
    }

    public static int hashCodeAsciiCompute(long j, int i) {
        return (i * (-862048943)) + (hashCodeAsciiSanitize((int) j) * HASH_CODE_C2) + ((int) ((j & 2242545357458243584L) >>> 32));
    }

    public static int hashCodeAsciiSanitize(byte b2) {
        return b2 & 31;
    }

    public static boolean isAndroid() {
        return IS_ANDROID;
    }

    private static boolean isAndroid0() {
        boolean zEquals = "Dalvik".equals(SystemPropertyUtil.get("java.vm.name"));
        if (zEquals) {
            logger.debug("Platform: Android");
        }
        return zEquals;
    }

    public static boolean isExplicitNoUnsafe() {
        return EXPLICIT_NO_UNSAFE_CAUSE != null;
    }

    public static boolean isExplicitTryReflectionSetAccessible() {
        return IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE;
    }

    public static boolean isUnaligned() {
        return UNALIGNED;
    }

    public static boolean isZero(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return true;
        }
        long j = BYTE_ARRAY_BASE_OFFSET + ((long) i);
        int i3 = i2 & 7;
        long j2 = ((long) i3) + j;
        for (long j3 = (j - 8) + ((long) i2); j3 >= j2; j3 -= 8) {
            if (UNSAFE.getLong(bArr, j3) != 0) {
                return false;
            }
        }
        if (i3 >= 4) {
            i3 -= 4;
            if (UNSAFE.getInt(bArr, ((long) i3) + j) != 0) {
                return false;
            }
        }
        if (i3 >= 2) {
            return UNSAFE.getChar(bArr, j) == 0 && (i3 == 2 || bArr[i + 2] == 0);
        }
        return bArr[i] == 0;
    }

    public static int javaVersion() {
        return JAVA_VERSION;
    }

    private static int javaVersion0() {
        int iMajorVersionFromJavaSpecificationVersion = isAndroid0() ? 6 : majorVersionFromJavaSpecificationVersion();
        logger.debug("Java version: {}", Integer.valueOf(iMajorVersionFromJavaSpecificationVersion));
        return iMajorVersionFromJavaSpecificationVersion;
    }

    public static int majorVersion(String str) {
        String[] strArrSplit = str.split(z.f14007a);
        int[] iArr = new int[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            iArr[i] = Integer.parseInt(strArrSplit[i]);
        }
        int i2 = iArr[0];
        return i2 == 1 ? iArr[1] : i2;
    }

    public static int majorVersionFromJavaSpecificationVersion() {
        return majorVersion(SystemPropertyUtil.get("java.specification.version", "1.6"));
    }

    public static ByteBuffer newDirectBuffer(long j, int i) {
        ObjectUtil.checkPositiveOrZero(i, "capacity");
        try {
            return (ByteBuffer) DIRECT_BUFFER_CONSTRUCTOR.newInstance(Long.valueOf(j), Integer.valueOf(i));
        } catch (Throwable th) {
            if (th instanceof Error) {
                throw th;
            }
            throw new Error(th);
        }
    }

    public static long objectFieldOffset(Field field) {
        return UNSAFE.objectFieldOffset(field);
    }

    public static void putByte(long j, byte b2) {
        UNSAFE.putByte(j, b2);
    }

    public static void putInt(long j, int i) {
        UNSAFE.putInt(j, i);
    }

    public static void putLong(long j, long j2) {
        UNSAFE.putLong(j, j2);
    }

    public static void putObject(Object obj, long j, Object obj2) {
        UNSAFE.putObject(obj, j, obj2);
    }

    public static void putShort(long j, short s) {
        UNSAFE.putShort(j, s);
    }

    public static ByteBuffer reallocateDirectNoCleaner(ByteBuffer byteBuffer, int i) {
        return newDirectBuffer(UNSAFE.reallocateMemory(directBufferAddress(byteBuffer), i), i);
    }

    public static long reallocateMemory(long j, long j2) {
        return UNSAFE.reallocateMemory(j, j2);
    }

    public static void setMemory(long j, long j2, byte b2) {
        UNSAFE.setMemory(j, j2, b2);
    }

    public static void throwException(Throwable th) {
        UNSAFE.throwException((Throwable) ObjectUtil.checkNotNull(th, "cause"));
    }

    public static boolean unalignedAccess() {
        return UNALIGNED;
    }

    public static byte getByte(byte[] bArr, int i) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int getInt(long j) {
        return UNSAFE.getInt(j);
    }

    public static long getLong(long j) {
        return UNSAFE.getLong(j);
    }

    public static short getShort(byte[] bArr, int i) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int hashCodeAsciiSanitize(int i) {
        return i & 522133279;
    }

    public static void putByte(byte[] bArr, int i, byte b2) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), b2);
    }

    public static void putInt(byte[] bArr, int i, int i2) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), i2);
    }

    public static void putLong(byte[] bArr, int i, long j) {
        UNSAFE.putLong(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j);
    }

    public static void putShort(byte[] bArr, int i, short s) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), s);
    }

    public static void setMemory(Object obj, long j, long j2, byte b2) {
        UNSAFE.setMemory(obj, j, j2, b2);
    }

    private static void copyMemoryWithSafePointPolling(Object obj, long j, Object obj2, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        while (j6 > 0) {
            long jMin = Math.min(j6, 1048576L);
            UNSAFE.copyMemory(obj, j4, obj2, j5, jMin);
            j6 -= jMin;
            j4 += jMin;
            j5 += jMin;
        }
    }

    public static int getInt(byte[] bArr, int i) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static long getLong(byte[] bArr, int i) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int hashCodeAsciiSanitize(short s) {
        return s & 7967;
    }

    public static void copyMemory(Object obj, long j, Object obj2, long j2, long j3) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(obj, j, obj2, j2, j3);
        } else {
            UNSAFE.copyMemory(obj, j, obj2, j2, j3);
        }
    }
}
