package io.netty.util.internal;

import androidx.collection.ScatterMapKt;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.MpscUnboundedArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscGrowableAtomicArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscUnboundedAtomicArrayQueue;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformDependent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADDRESS_SIZE;
    private static final String[] ALLOWED_LINUX_OS_CLASSIFIERS;
    public static final boolean BIG_ENDIAN_NATIVE_ORDER;
    private static final int BIT_MODE;
    private static final long BYTE_ARRAY_BASE_OFFSET;
    private static final boolean CAN_ENABLE_TCP_NODELAY_BY_DEFAULT;
    private static final Cleaner CLEANER;
    private static final boolean DIRECT_BUFFER_PREFERRED;
    private static final AtomicLong DIRECT_MEMORY_COUNTER;
    private static final long DIRECT_MEMORY_LIMIT;
    private static final boolean IS_IVKVM_DOT_NET;
    private static final boolean IS_J9_JVM;
    private static final boolean IS_OSX;
    private static final boolean IS_WINDOWS;
    private static final Set<String> LINUX_OS_CLASSIFIERS;
    private static final int MAX_ALLOWED_MPSC_CAPACITY = 1073741824;
    private static final long MAX_DIRECT_MEMORY;
    private static final Pattern MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN;
    private static final boolean MAYBE_SUPER_USER;
    private static final int MIN_MAX_MPSC_CAPACITY = 2048;
    private static final int MPSC_CHUNK_SIZE = 1024;
    private static final Cleaner NOOP;
    private static final String NORMALIZED_ARCH;
    private static final String NORMALIZED_OS;
    private static final ThreadLocalRandomProvider RANDOM_PROVIDER;
    private static final File TMPDIR;
    private static final int UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD;
    private static final Throwable UNSAFE_UNAVAILABILITY_CAUSE;
    private static final boolean USE_DIRECT_BUFFER_NO_CLEANER;
    private static final InternalLogger logger;

    public static final class AtomicLongCounter extends AtomicLong implements LongCounter {
        private static final long serialVersionUID = 4074772784610639305L;

        private AtomicLongCounter() {
        }

        @Override // io.netty.util.internal.LongCounter
        public void add(long j) {
            addAndGet(j);
        }

        @Override // io.netty.util.internal.LongCounter
        public void decrement() {
            decrementAndGet();
        }

        @Override // io.netty.util.internal.LongCounter
        public void increment() {
            incrementAndGet();
        }

        @Override // io.netty.util.internal.LongCounter
        public long value() {
            return get();
        }
    }

    public interface ThreadLocalRandomProvider {
        Random current();
    }

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) PlatformDependent.class);
        logger = internalLoggerFactory;
        MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$");
        IS_WINDOWS = isWindows0();
        IS_OSX = isOsx0();
        IS_J9_JVM = isJ9Jvm0();
        IS_IVKVM_DOT_NET = isIkvmDotNet0();
        CAN_ENABLE_TCP_NODELAY_BY_DEFAULT = !isAndroid();
        UNSAFE_UNAVAILABILITY_CAUSE = unsafeUnavailabilityCause0();
        long jMaxDirectMemory0 = maxDirectMemory0();
        MAX_DIRECT_MEMORY = jMaxDirectMemory0;
        BYTE_ARRAY_BASE_OFFSET = byteArrayBaseOffset0();
        TMPDIR = tmpdir0();
        BIT_MODE = bitMode0();
        NORMALIZED_ARCH = normalizeArch(SystemPropertyUtil.get("os.arch", ""));
        NORMALIZED_OS = normalizeOs(SystemPropertyUtil.get("os.name", ""));
        String[] strArr = {"fedora", "suse", "arch"};
        ALLOWED_LINUX_OS_CLASSIFIERS = strArr;
        ADDRESS_SIZE = addressSize0();
        BIG_ENDIAN_NATIVE_ORDER = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        Cleaner cleaner = new Cleaner() { // from class: io.netty.util.internal.PlatformDependent.1
            @Override // io.netty.util.internal.Cleaner
            public void freeDirectBuffer(ByteBuffer byteBuffer) {
            }
        };
        NOOP = cleaner;
        if (javaVersion() >= 7) {
            RANDOM_PROVIDER = new ThreadLocalRandomProvider() { // from class: io.netty.util.internal.PlatformDependent.2
                @Override // io.netty.util.internal.PlatformDependent.ThreadLocalRandomProvider
                @SuppressJava6Requirement(reason = "Usage guarded by java version check")
                public Random current() {
                    return java.util.concurrent.ThreadLocalRandom.current();
                }
            };
        } else {
            RANDOM_PROVIDER = new ThreadLocalRandomProvider() { // from class: io.netty.util.internal.PlatformDependent.3
                @Override // io.netty.util.internal.PlatformDependent.ThreadLocalRandomProvider
                public Random current() {
                    return ThreadLocalRandom.current();
                }
            };
        }
        long j = SystemPropertyUtil.getLong("io.netty.maxDirectMemory", -1L);
        BufferedReader bufferedReader = null;
        if (j != 0 && hasUnsafe() && PlatformDependent0.hasDirectBufferNoCleanerConstructor()) {
            USE_DIRECT_BUFFER_NO_CLEANER = true;
            if (j < 0) {
                if (jMaxDirectMemory0 <= 0) {
                    DIRECT_MEMORY_COUNTER = null;
                } else {
                    DIRECT_MEMORY_COUNTER = new AtomicLong();
                }
                j = jMaxDirectMemory0;
            } else {
                DIRECT_MEMORY_COUNTER = new AtomicLong();
            }
        } else {
            USE_DIRECT_BUFFER_NO_CLEANER = false;
            DIRECT_MEMORY_COUNTER = null;
        }
        internalLoggerFactory.debug("-Dio.netty.maxDirectMemory: {} bytes", Long.valueOf(j));
        if (j >= 1) {
            jMaxDirectMemory0 = j;
        }
        DIRECT_MEMORY_LIMIT = jMaxDirectMemory0;
        int i = SystemPropertyUtil.getInt("io.netty.uninitializedArrayAllocationThreshold", 1024);
        if (javaVersion() < 9 || !PlatformDependent0.hasAllocateArrayMethod()) {
            i = -1;
        }
        UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD = i;
        internalLoggerFactory.debug("-Dio.netty.uninitializedArrayAllocationThreshold: {}", Integer.valueOf(i));
        MAYBE_SUPER_USER = maybeSuperUser0();
        if (isAndroid()) {
            CLEANER = cleaner;
        } else if (javaVersion() >= 9) {
            CLEANER = CleanerJava9.isSupported() ? new CleanerJava9() : cleaner;
        } else {
            CLEANER = CleanerJava6.isSupported() ? new CleanerJava6() : cleaner;
        }
        Cleaner cleaner2 = CLEANER;
        boolean z = (cleaner2 == cleaner || SystemPropertyUtil.getBoolean("io.netty.noPreferDirect", false)) ? false : true;
        DIRECT_BUFFER_PREFERRED = z;
        if (internalLoggerFactory.isDebugEnabled()) {
            internalLoggerFactory.debug("-Dio.netty.noPreferDirect: {}", Boolean.valueOf(true ^ z));
        }
        if (cleaner2 == cleaner && !PlatformDependent0.isExplicitNoUnsafe()) {
            internalLoggerFactory.info("Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system instability.");
        }
        String[] strArr2 = {"/etc/os-release", "/usr/lib/os-release"};
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < 2; i2++) {
            File file = new File(strArr2[i2]);
            try {
                if (file.exists()) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), CharsetUtil.UTF_8));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                if (line.startsWith("ID=")) {
                                    addClassifier(setUnmodifiableSet, linkedHashSet, normalizeOsReleaseVariableValue(line.substring(3)));
                                } else if (line.startsWith("ID_LIKE=")) {
                                    addClassifier(setUnmodifiableSet, linkedHashSet, normalizeOsReleaseVariableValue(line.substring(8)).split("[ ]+"));
                                }
                            } catch (IOException unused) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                LINUX_OS_CLASSIFIERS = Collections.unmodifiableSet(linkedHashSet);
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        }
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    break;
                }
            } catch (IOException unused4) {
            }
        }
        LINUX_OS_CLASSIFIERS = Collections.unmodifiableSet(linkedHashSet);
    }

    private PlatformDependent() {
    }

    private static void addClassifier(Set<String> set, Set<String> set2, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                set2.add(str);
            }
        }
    }

    public static int addressSize() {
        return ADDRESS_SIZE;
    }

    private static int addressSize0() {
        if (hasUnsafe()) {
            return PlatformDependent0.addressSize();
        }
        return -1;
    }

    public static ByteBuffer allocateDirectNoCleaner(int i) throws Throwable {
        incrementMemoryCounter(i);
        try {
            return PlatformDependent0.allocateDirectNoCleaner(i);
        } catch (Throwable th) {
            decrementMemoryCounter(i);
            throwException(th);
            return null;
        }
    }

    public static long allocateMemory(long j) {
        return PlatformDependent0.allocateMemory(j);
    }

    public static byte[] allocateUninitializedArray(int i) {
        int i2 = UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD;
        return (i2 < 0 || i2 > i) ? new byte[i] : PlatformDependent0.allocateUninitializedArray(i);
    }

    public static int bitMode() {
        return BIT_MODE;
    }

    private static int bitMode0() {
        int i = SystemPropertyUtil.getInt("io.netty.bitMode", 0);
        if (i > 0) {
            logger.debug("-Dio.netty.bitMode: {}", Integer.valueOf(i));
            return i;
        }
        int i2 = SystemPropertyUtil.getInt("sun.arch.data.model", 0);
        if (i2 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (sun.arch.data.model)", Integer.valueOf(i2));
            return i2;
        }
        int i3 = SystemPropertyUtil.getInt("com.ibm.vm.bitmode", 0);
        if (i3 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (com.ibm.vm.bitmode)", Integer.valueOf(i3));
            return i3;
        }
        String str = SystemPropertyUtil.get("os.arch", "");
        Locale locale = Locale.US;
        String strTrim = str.toLowerCase(locale).trim();
        if ("amd64".equals(strTrim) || "x86_64".equals(strTrim)) {
            i3 = 64;
        } else if ("i386".equals(strTrim) || "i486".equals(strTrim) || "i586".equals(strTrim) || "i686".equals(strTrim)) {
            i3 = 32;
        }
        if (i3 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (os.arch: {})", Integer.valueOf(i3), strTrim);
        }
        Matcher matcher = Pattern.compile("([1-9][0-9]+)-?bit").matcher(SystemPropertyUtil.get("java.vm.name", "").toLowerCase(locale));
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 64;
    }

    private static long byteArrayBaseOffset0() {
        if (hasUnsafe()) {
            return PlatformDependent0.byteArrayBaseOffset();
        }
        return -1L;
    }

    public static boolean canEnableTcpNoDelayByDefault() {
        return CAN_ENABLE_TCP_NODELAY_BY_DEFAULT;
    }

    public static void copyMemory(long j, long j2, long j3) {
        PlatformDependent0.copyMemory(j, j2, j3);
    }

    private static void decrementMemoryCounter(int i) {
        AtomicLong atomicLong = DIRECT_MEMORY_COUNTER;
        if (atomicLong != null) {
            atomicLong.addAndGet(-i);
        }
    }

    public static ByteBuffer directBuffer(long j, int i) {
        if (PlatformDependent0.hasDirectBufferNoCleanerConstructor()) {
            return PlatformDependent0.newDirectBuffer(j, i);
        }
        throw new UnsupportedOperationException("sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
    }

    public static long directBufferAddress(ByteBuffer byteBuffer) {
        return PlatformDependent0.directBufferAddress(byteBuffer);
    }

    public static boolean directBufferPreferred() {
        return DIRECT_BUFFER_PREFERRED;
    }

    public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        return (hasUnsafe() && PlatformDependent0.unalignedAccess()) ? PlatformDependent0.equals(bArr, i, bArr2, i2, i3) : equalsSafe(bArr, i, bArr2, i2, i3);
    }

    public static int equalsConstantTime(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        return (hasUnsafe() && PlatformDependent0.unalignedAccess()) ? PlatformDependent0.equalsConstantTime(bArr, i, bArr2, i2, i3) : ConstantTimeUtils.equalsConstantTime(bArr, i, bArr2, i2, i3);
    }

    private static boolean equalsSafe(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static void freeDirectBuffer(ByteBuffer byteBuffer) {
        CLEANER.freeDirectBuffer(byteBuffer);
    }

    public static void freeDirectNoCleaner(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        PlatformDependent0.freeMemory(PlatformDependent0.directBufferAddress(byteBuffer));
        decrementMemoryCounter(iCapacity);
    }

    public static void freeMemory(long j) {
        PlatformDependent0.freeMemory(j);
    }

    public static byte getByte(long j) {
        return PlatformDependent0.getByte(j);
    }

    public static ClassLoader getClassLoader(Class<?> cls) {
        return PlatformDependent0.getClassLoader(cls);
    }

    public static ClassLoader getContextClassLoader() {
        return PlatformDependent0.getContextClassLoader();
    }

    public static int getInt(Object obj, long j) {
        return PlatformDependent0.getInt(obj, j);
    }

    private static int getIntSafe(byte[] bArr, int i) {
        int i2;
        int i3;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            i2 = (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            i3 = bArr[i + 3] & 255;
        } else {
            i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            i3 = bArr[i + 3] << 24;
        }
        return i3 | i2;
    }

    public static long getLong(long j) {
        return PlatformDependent0.getLong(j);
    }

    private static long getLongSafe(byte[] bArr, int i) {
        long j;
        long j2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            j = ((((long) bArr[i + 6]) & 255) << 8) | ((((long) bArr[i + 1]) & 255) << 48) | (((long) bArr[i]) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16);
            j2 = ((long) bArr[i + 7]) & 255;
        } else {
            j = ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            j2 = ((long) bArr[i + 7]) << 56;
        }
        return j2 | j;
    }

    public static Object getObject(Object obj, long j) {
        return PlatformDependent0.getObject(obj, j);
    }

    public static short getShort(long j) {
        return PlatformDependent0.getShort(j);
    }

    private static short getShortSafe(byte[] bArr, int i) {
        int i2;
        int i3;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            i2 = bArr[i] << 8;
            i3 = bArr[i + 1] & 255;
        } else {
            i2 = bArr[i] & 255;
            i3 = bArr[i + 1] << 8;
        }
        return (short) (i3 | i2);
    }

    public static ClassLoader getSystemClassLoader() {
        return PlatformDependent0.getSystemClassLoader();
    }

    public static Throwable getUnsafeUnavailabilityCause() {
        return UNSAFE_UNAVAILABILITY_CAUSE;
    }

    public static boolean hasDirectBufferNoCleanerConstructor() {
        return PlatformDependent0.hasDirectBufferNoCleanerConstructor();
    }

    public static boolean hasUnsafe() {
        return UNSAFE_UNAVAILABILITY_CAUSE == null;
    }

    public static int hashCodeAscii(byte[] bArr, int i, int i2) {
        return (hasUnsafe() && PlatformDependent0.unalignedAccess()) ? PlatformDependent0.hashCodeAscii(bArr, i, i2) : hashCodeAsciiSafe(bArr, i, i2);
    }

    private static int hashCodeAsciiCompute(CharSequence charSequence, int i, int i2) {
        int iHashCodeAsciiSanitizeInt;
        int iHashCodeAsciiSanitizeInt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            iHashCodeAsciiSanitizeInt = (i2 * ScatterMapKt.MurmurHashC1) + (hashCodeAsciiSanitizeInt(charSequence, i + 4) * 461845907);
            iHashCodeAsciiSanitizeInt2 = hashCodeAsciiSanitizeInt(charSequence, i);
        } else {
            iHashCodeAsciiSanitizeInt = (i2 * ScatterMapKt.MurmurHashC1) + (hashCodeAsciiSanitizeInt(charSequence, i) * 461845907);
            iHashCodeAsciiSanitizeInt2 = hashCodeAsciiSanitizeInt(charSequence, i + 4);
        }
        return iHashCodeAsciiSanitizeInt + iHashCodeAsciiSanitizeInt2;
    }

    public static int hashCodeAsciiSafe(byte[] bArr, int i, int i2) {
        int iHashCodeAsciiSanitize;
        int iHashCodeAsciiSanitize2;
        int i3 = i2 & 7;
        int i4 = i + i3;
        int iHashCodeAsciiCompute = -1028477387;
        for (int i5 = (i - 8) + i2; i5 >= i4; i5 -= 8) {
            iHashCodeAsciiCompute = PlatformDependent0.hashCodeAsciiCompute(getLongSafe(bArr, i5), iHashCodeAsciiCompute);
        }
        switch (i3) {
            case 1:
                iHashCodeAsciiSanitize = iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(bArr[i]);
                break;
            case 2:
                iHashCodeAsciiSanitize = iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getShortSafe(bArr, i));
                break;
            case 3:
                iHashCodeAsciiSanitize = ((iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1) + PlatformDependent0.hashCodeAsciiSanitize(bArr[i])) * 461845907;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getShortSafe(bArr, i + 1));
                break;
            case 4:
                iHashCodeAsciiSanitize = iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getIntSafe(bArr, i));
                break;
            case 5:
                iHashCodeAsciiSanitize = ((iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1) + PlatformDependent0.hashCodeAsciiSanitize(bArr[i])) * 461845907;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getIntSafe(bArr, i + 1));
                break;
            case 6:
                iHashCodeAsciiSanitize = ((iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1) + PlatformDependent0.hashCodeAsciiSanitize(getShortSafe(bArr, i))) * 461845907;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getIntSafe(bArr, i + 2));
                break;
            case 7:
                iHashCodeAsciiSanitize = ((((iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1) + PlatformDependent0.hashCodeAsciiSanitize(bArr[i])) * 461845907) + PlatformDependent0.hashCodeAsciiSanitize(getShortSafe(bArr, i + 1))) * ScatterMapKt.MurmurHashC1;
                iHashCodeAsciiSanitize2 = PlatformDependent0.hashCodeAsciiSanitize(getIntSafe(bArr, i + 3));
                break;
            default:
                return iHashCodeAsciiCompute;
        }
        return iHashCodeAsciiSanitize + iHashCodeAsciiSanitize2;
    }

    private static int hashCodeAsciiSanitizeByte(char c) {
        return c & 31;
    }

    private static int hashCodeAsciiSanitizeInt(CharSequence charSequence, int i) {
        int iCharAt;
        int iCharAt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            iCharAt = (charSequence.charAt(i + 3) & 31) | ((charSequence.charAt(i + 2) & 31) << 8) | ((charSequence.charAt(i + 1) & 31) << 16);
            iCharAt2 = (charSequence.charAt(i) & 31) << 24;
        } else {
            iCharAt = ((charSequence.charAt(i + 3) & 31) << 24) | ((charSequence.charAt(i + 2) & 31) << 16) | ((charSequence.charAt(i + 1) & 31) << 8);
            iCharAt2 = charSequence.charAt(i) & 31;
        }
        return iCharAt2 | iCharAt;
    }

    private static int hashCodeAsciiSanitizeShort(CharSequence charSequence, int i) {
        int iCharAt;
        int iCharAt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            iCharAt = charSequence.charAt(i + 1) & 31;
            iCharAt2 = (charSequence.charAt(i) & 31) << 8;
        } else {
            iCharAt = (charSequence.charAt(i + 1) & 31) << 8;
            iCharAt2 = charSequence.charAt(i) & 31;
        }
        return iCharAt2 | iCharAt;
    }

    private static void incrementMemoryCounter(int i) {
        AtomicLong atomicLong = DIRECT_MEMORY_COUNTER;
        if (atomicLong != null) {
            long j = i;
            long jAddAndGet = atomicLong.addAndGet(j);
            long j2 = DIRECT_MEMORY_LIMIT;
            if (jAddAndGet <= j2) {
                return;
            }
            atomicLong.addAndGet(-i);
            throw new OutOfDirectMemoryError("failed to allocate " + i + " byte(s) of direct memory (used: " + (jAddAndGet - j) + ", max: " + j2 + ')');
        }
    }

    public static boolean isAndroid() {
        return PlatformDependent0.isAndroid();
    }

    public static boolean isIkvmDotNet() {
        return IS_IVKVM_DOT_NET;
    }

    private static boolean isIkvmDotNet0() {
        return SystemPropertyUtil.get("java.vm.name", "").toUpperCase(Locale.US).equals("IKVM.NET");
    }

    public static boolean isJ9Jvm() {
        return IS_J9_JVM;
    }

    private static boolean isJ9Jvm0() {
        String lowerCase = SystemPropertyUtil.get("java.vm.name", "").toLowerCase();
        return lowerCase.startsWith("ibm j9") || lowerCase.startsWith("eclipse openj9");
    }

    public static boolean isOsx() {
        return IS_OSX;
    }

    private static boolean isOsx0() {
        String strReplaceAll = SystemPropertyUtil.get("os.name", "").toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
        boolean z = strReplaceAll.startsWith("macosx") || strReplaceAll.startsWith("osx");
        if (z) {
            logger.debug("Platform: MacOS");
        }
        return z;
    }

    public static boolean isUnaligned() {
        return PlatformDependent0.isUnaligned();
    }

    public static boolean isWindows() {
        return IS_WINDOWS;
    }

    private static boolean isWindows0() {
        boolean zContains = SystemPropertyUtil.get("os.name", "").toLowerCase(Locale.US).contains("win");
        if (zContains) {
            logger.debug("Platform: Windows");
        }
        return zContains;
    }

    public static boolean isZero(byte[] bArr, int i, int i2) {
        return (hasUnsafe() && PlatformDependent0.unalignedAccess()) ? PlatformDependent0.isZero(bArr, i, i2) : isZeroSafe(bArr, i, i2);
    }

    private static boolean isZeroSafe(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            if (bArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int javaVersion() {
        return PlatformDependent0.javaVersion();
    }

    public static long maxDirectMemory() {
        return DIRECT_MEMORY_LIMIT;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r0 != 'm') goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long maxDirectMemory0() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.PlatformDependent.maxDirectMemory0():long");
    }

    public static boolean maybeSuperUser() {
        return MAYBE_SUPER_USER;
    }

    private static boolean maybeSuperUser0() {
        String str = SystemPropertyUtil.get("user.name");
        if (isWindows()) {
            return "Administrator".equals(str);
        }
        return "root".equals(str) || "toor".equals(str);
    }

    @SuppressJava6Requirement(reason = "Usage guarded by java version check")
    public static <C> Deque<C> newConcurrentDeque() {
        return javaVersion() < 7 ? new LinkedBlockingDeque() : new ConcurrentLinkedDeque();
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap();
    }

    public static <T> Queue<T> newFixedMpscQueue(int i) {
        return hasUnsafe() ? new MpscArrayQueue(i) : new MpscAtomicArrayQueue(i);
    }

    public static LongCounter newLongCounter() {
        return javaVersion() >= 8 ? new LongAdderCounter() : new AtomicLongCounter();
    }

    public static <T> Queue<T> newMpscQueue() {
        return Mpsc.newMpscQueue();
    }

    public static <T> Queue<T> newSpscQueue() {
        return hasUnsafe() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue();
    }

    private static String normalize(String str) {
        return str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    private static String normalizeArch(String str) {
        String strNormalize = normalize(str);
        if (strNormalize.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return "x86_64";
        }
        if (strNormalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            return "x86_32";
        }
        if (strNormalize.matches("^(ia64|itanium64)$")) {
            return "itanium_64";
        }
        if (strNormalize.matches("^(sparc|sparc32)$")) {
            return "sparc_32";
        }
        if (strNormalize.matches("^(sparcv9|sparc64)$")) {
            return "sparc_64";
        }
        if (strNormalize.matches("^(arm|arm32)$")) {
            return "arm_32";
        }
        if ("aarch64".equals(strNormalize)) {
            return "aarch_64";
        }
        if (strNormalize.matches("^(ppc|ppc32)$")) {
            return "ppc_32";
        }
        if ("ppc64".equals(strNormalize)) {
            return "ppc_64";
        }
        if ("ppc64le".equals(strNormalize)) {
            return "ppcle_64";
        }
        if ("s390".equals(strNormalize)) {
            return "s390_32";
        }
        return "s390x".equals(strNormalize) ? "s390_64" : "unknown";
    }

    private static String normalizeOs(String str) {
        String strNormalize = normalize(str);
        if (strNormalize.startsWith("aix")) {
            return "aix";
        }
        if (strNormalize.startsWith("hpux")) {
            return "hpux";
        }
        if (strNormalize.startsWith("os400") && (strNormalize.length() <= 5 || !Character.isDigit(strNormalize.charAt(5)))) {
            return "os400";
        }
        if (strNormalize.startsWith("linux")) {
            return "linux";
        }
        String str2 = "osx";
        if (!strNormalize.startsWith("macosx") && !strNormalize.startsWith("osx")) {
            if (strNormalize.startsWith("freebsd")) {
                return "freebsd";
            }
            if (strNormalize.startsWith("openbsd")) {
                return "openbsd";
            }
            if (strNormalize.startsWith("netbsd")) {
                return "netbsd";
            }
            str2 = "sunos";
            if (!strNormalize.startsWith("solaris") && !strNormalize.startsWith("sunos")) {
                return strNormalize.startsWith("windows") ? "windows" : "unknown";
            }
        }
        return str2;
    }

    private static String normalizeOsReleaseVariableValue(String str) {
        return str.trim().replaceAll("[\"']", "");
    }

    public static String normalizedArch() {
        return NORMALIZED_ARCH;
    }

    public static Set<String> normalizedLinuxClassifiers() {
        return LINUX_OS_CLASSIFIERS;
    }

    public static String normalizedOs() {
        return NORMALIZED_OS;
    }

    public static long objectFieldOffset(Field field) {
        return PlatformDependent0.objectFieldOffset(field);
    }

    public static void putByte(long j, byte b2) {
        PlatformDependent0.putByte(j, b2);
    }

    public static void putInt(long j, int i) {
        PlatformDependent0.putInt(j, i);
    }

    public static void putLong(long j, long j2) {
        PlatformDependent0.putLong(j, j2);
    }

    public static void putObject(Object obj, long j, Object obj2) {
        PlatformDependent0.putObject(obj, j, obj2);
    }

    public static void putShort(long j, short s) {
        PlatformDependent0.putShort(j, s);
    }

    public static ByteBuffer reallocateDirectNoCleaner(ByteBuffer byteBuffer, int i) throws Throwable {
        int iCapacity = i - byteBuffer.capacity();
        incrementMemoryCounter(iCapacity);
        try {
            return PlatformDependent0.reallocateDirectNoCleaner(byteBuffer, i);
        } catch (Throwable th) {
            decrementMemoryCounter(iCapacity);
            throwException(th);
            return null;
        }
    }

    public static long reallocateMemory(long j, long j2) {
        return PlatformDependent0.reallocateMemory(j, j2);
    }

    public static void setMemory(byte[] bArr, int i, long j, byte b2) {
        PlatformDependent0.setMemory(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j, b2);
    }

    public static Random threadLocalRandom() {
        return RANDOM_PROVIDER.current();
    }

    public static void throwException(Throwable th) throws Throwable {
        if (hasUnsafe()) {
            PlatformDependent0.throwException(th);
        } else {
            throwException0(th);
        }
    }

    private static <E extends Throwable> void throwException0(Throwable th) throws Throwable {
        throw th;
    }

    public static File tmpdir() {
        return TMPDIR;
    }

    private static File tmpdir0() {
        try {
            File directory = toDirectory(SystemPropertyUtil.get("io.netty.tmpdir"));
            if (directory != null) {
                logger.debug("-Dio.netty.tmpdir: {}", directory);
                return directory;
            }
            File directory2 = toDirectory(SystemPropertyUtil.get("java.io.tmpdir"));
            if (directory2 != null) {
                logger.debug("-Dio.netty.tmpdir: {} (java.io.tmpdir)", directory2);
                return directory2;
            }
            if (isWindows()) {
                File directory3 = toDirectory(System.getenv("TEMP"));
                if (directory3 != null) {
                    logger.debug("-Dio.netty.tmpdir: {} (%TEMP%)", directory3);
                    return directory3;
                }
                String str = System.getenv("USERPROFILE");
                if (str != null) {
                    File directory4 = toDirectory(str + "\\AppData\\Local\\Temp");
                    if (directory4 != null) {
                        logger.debug("-Dio.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)", directory4);
                        return directory4;
                    }
                    File directory5 = toDirectory(str + "\\Local Settings\\Temp");
                    if (directory5 != null) {
                        logger.debug("-Dio.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)", directory5);
                        return directory5;
                    }
                }
            } else {
                File directory6 = toDirectory(System.getenv("TMPDIR"));
                if (directory6 != null) {
                    logger.debug("-Dio.netty.tmpdir: {} ($TMPDIR)", directory6);
                    return directory6;
                }
            }
            File file = isWindows() ? new File("C:\\Windows\\Temp") : new File("/tmp");
            logger.warn("Failed to get the temporary directory; falling back to: {}", file);
            return file;
        } catch (Throwable unused) {
        }
    }

    private static File toDirectory(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    private static Throwable unsafeUnavailabilityCause0() {
        if (isAndroid()) {
            logger.debug("sun.misc.Unsafe: unavailable (Android)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (Android)");
        }
        if (isIkvmDotNet()) {
            logger.debug("sun.misc.Unsafe: unavailable (IKVM.NET)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (IKVM.NET)");
        }
        Throwable unsafeUnavailabilityCause = PlatformDependent0.getUnsafeUnavailabilityCause();
        if (unsafeUnavailabilityCause != null) {
            return unsafeUnavailabilityCause;
        }
        try {
            boolean zHasUnsafe = PlatformDependent0.hasUnsafe();
            logger.debug("sun.misc.Unsafe: {}", zHasUnsafe ? "available" : "unavailable");
            if (zHasUnsafe) {
                return null;
            }
            return PlatformDependent0.getUnsafeUnavailabilityCause();
        } catch (Throwable th) {
            logger.trace("Could not determine if Unsafe is available", th);
            return new UnsupportedOperationException("Could not determine if Unsafe is available", th);
        }
    }

    public static boolean useDirectBufferNoCleaner() {
        return USE_DIRECT_BUFFER_NO_CLEANER;
    }

    public static long usedDirectMemory() {
        AtomicLong atomicLong = DIRECT_MEMORY_COUNTER;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return -1L;
    }

    public static final class Mpsc {
        private static final boolean USE_MPSC_CHUNKED_ARRAY_QUEUE;

        static {
            if ((PlatformDependent.hasUnsafe() ? AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.util.internal.PlatformDependent.Mpsc.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return UnsafeAccess.UNSAFE;
                }
            }) : null) == null) {
                PlatformDependent.logger.debug("org.jctools-core.MpscChunkedArrayQueue: unavailable");
                USE_MPSC_CHUNKED_ARRAY_QUEUE = false;
            } else {
                PlatformDependent.logger.debug("org.jctools-core.MpscChunkedArrayQueue: available");
                USE_MPSC_CHUNKED_ARRAY_QUEUE = true;
            }
        }

        private Mpsc() {
        }

        public static <T> Queue<T> newMpscQueue(int i) {
            int iMax = Math.max(Math.min(i, 1073741824), 2048);
            return USE_MPSC_CHUNKED_ARRAY_QUEUE ? new MpscChunkedArrayQueue(1024, iMax) : new MpscGrowableAtomicArrayQueue(1024, iMax);
        }

        public static <T> Queue<T> newMpscQueue() {
            return USE_MPSC_CHUNKED_ARRAY_QUEUE ? new MpscUnboundedArrayQueue(1024) : new MpscUnboundedAtomicArrayQueue(1024);
        }
    }

    public static void copyMemory(byte[] bArr, int i, long j, long j2) {
        PlatformDependent0.copyMemory(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), null, j, j2);
    }

    public static byte getByte(byte[] bArr, int i) {
        return PlatformDependent0.getByte(bArr, i);
    }

    public static int getInt(long j) {
        return PlatformDependent0.getInt(j);
    }

    public static long getLong(byte[] bArr, int i) {
        return PlatformDependent0.getLong(bArr, i);
    }

    public static short getShort(byte[] bArr, int i) {
        return PlatformDependent0.getShort(bArr, i);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(int i) {
        return new ConcurrentHashMap(i);
    }

    public static <T> Queue<T> newMpscQueue(int i) {
        return Mpsc.newMpscQueue(i);
    }

    public static void putByte(byte[] bArr, int i, byte b2) {
        PlatformDependent0.putByte(bArr, i, b2);
    }

    public static void putInt(byte[] bArr, int i, int i2) {
        PlatformDependent0.putInt(bArr, i, i2);
    }

    public static void putLong(byte[] bArr, int i, long j) {
        PlatformDependent0.putLong(bArr, i, j);
    }

    public static void putShort(byte[] bArr, int i, short s) {
        PlatformDependent0.putShort(bArr, i, s);
    }

    public static void setMemory(long j, long j2, byte b2) {
        PlatformDependent0.setMemory(j, j2, b2);
    }

    public static void copyMemory(long j, byte[] bArr, int i, long j2) {
        PlatformDependent0.copyMemory(null, j, bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j2);
    }

    public static int getInt(byte[] bArr, int i) {
        return PlatformDependent0.getInt(bArr, i);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(int i, float f) {
        return new ConcurrentHashMap(i, f);
    }

    public static int hashCodeAscii(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i2 = length & 7;
        int iHashCodeAsciiCompute = -1028477387;
        if (length >= 32) {
            for (int i3 = length - 8; i3 >= i2; i3 -= 8) {
                iHashCodeAsciiCompute = hashCodeAsciiCompute(charSequence, i3, iHashCodeAsciiCompute);
            }
        } else if (length >= 8) {
            iHashCodeAsciiCompute = hashCodeAsciiCompute(charSequence, length - 8, -1028477387);
            if (length >= 16) {
                iHashCodeAsciiCompute = hashCodeAsciiCompute(charSequence, length - 16, iHashCodeAsciiCompute);
                if (length >= 24) {
                    iHashCodeAsciiCompute = hashCodeAsciiCompute(charSequence, length - 24, iHashCodeAsciiCompute);
                }
            }
        }
        if (i2 == 0) {
            return iHashCodeAsciiCompute;
        }
        boolean z = (i2 != 2) & (i2 != 4) & (i2 != 6);
        int i4 = ScatterMapKt.MurmurHashC1;
        if (z) {
            iHashCodeAsciiCompute = (iHashCodeAsciiCompute * ScatterMapKt.MurmurHashC1) + hashCodeAsciiSanitizeByte(charSequence.charAt(0));
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 != 1) & (i2 != 4) & (i2 != 5)) {
            iHashCodeAsciiCompute = (iHashCodeAsciiCompute * (i == 0 ? -862048943 : 461845907)) + PlatformDependent0.hashCodeAsciiSanitize(hashCodeAsciiSanitizeShort(charSequence, i));
            i += 2;
        }
        if (i2 < 4) {
            return iHashCodeAsciiCompute;
        }
        if (!((i == 0) | (i == 3))) {
            i4 = 461845907;
        }
        return (iHashCodeAsciiCompute * i4) + hashCodeAsciiSanitizeInt(charSequence, i);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(int i, float f, int i2) {
        return new ConcurrentHashMap(i, f, i2);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(Map<? extends K, ? extends V> map) {
        return new ConcurrentHashMap(map);
    }
}
