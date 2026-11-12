package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    protected volatile transient long base;
    protected volatile transient int busy;

    @CheckForNull
    protected volatile transient c[] cells;
    protected static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    protected abstract long fn(long j, long j2);

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f4266c;
        private static final Unsafe d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f4267a;

        c(long j) {
            this.f4267a = j;
        }

        public final boolean a(long j, long j2) {
            return d.compareAndSwapLong(this, f4266c, j, j2);
        }

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                d = unsafe;
                f4266c = unsafe.objectFieldOffset(c.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("base"));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    protected final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    protected final void retryUpdate(long j, @CheckForNull int[] iArr, boolean z) {
        int iNextInt;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = false;
        int i = iNextInt;
        boolean z5 = z;
        while (true) {
            c[] cVarArr = this.cells;
            if (cVarArr != null && (length = cVarArr.length) > 0) {
                c cVar = cVarArr[(length - 1) & i];
                if (cVar == null) {
                    if (this.busy == 0) {
                        c cVar2 = new c(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                c[] cVarArr2 = this.cells;
                                if (cVarArr2 == null || (length2 = cVarArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (cVarArr2[i2] == null) {
                                        cVarArr2[i2] = cVar2;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z3) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.busy = 0;
                                throw th;
                            }
                        }
                    }
                    z4 = false;
                    int i3 = i ^ (i << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    i = i4 ^ (i4 << 5);
                    iArr2[0] = i;
                } else {
                    if (z5) {
                        long j2 = cVar.f4267a;
                        if (cVar.a(j2, fn(j2, j))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != cVarArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cVarArr) {
                                    c[] cVarArr3 = new c[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        cVarArr3[i5] = cVarArr[i5];
                                    }
                                    this.cells = cVarArr3;
                                }
                                this.busy = 0;
                                z4 = false;
                            } catch (Throwable th2) {
                                this.busy = 0;
                                throw th2;
                            }
                        }
                    } else {
                        z5 = true;
                    }
                    int i6 = i ^ (i << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    i = i7 ^ (i7 << 5);
                    iArr2[0] = i;
                }
            } else if (this.busy == 0 && this.cells == cVarArr && casBusy()) {
                try {
                    if (this.cells == cVarArr) {
                        c[] cVarArr4 = new c[2];
                        cVarArr4[i & 1] = new c(j);
                        this.cells = cVarArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.busy = 0;
                    if (z2) {
                        return;
                    }
                } catch (Throwable th3) {
                    this.busy = 0;
                    throw th3;
                }
            } else {
                long j3 = this.base;
                if (casBase(j3, fn(j3, j))) {
                    return;
                }
            }
        }
    }

    final void internalReset(long j) {
        c[] cVarArr = this.cells;
        this.base = j;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    cVar.f4267a = j;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.5
                @Override // java.security.PrivilegedExceptionAction
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }
}
