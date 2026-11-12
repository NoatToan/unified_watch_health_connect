package com.google.common.hash;

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
    protected volatile transient a[] cells;
    protected static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    protected abstract long fn(long j, long j2);

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Unsafe f4575c;
        private static final long e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f4576b;

        a(long j) {
            this.f4576b = j;
        }

        public final boolean e(long j, long j2) {
            return f4575c.compareAndSwapLong(this, e, j, j2);
        }

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                f4575c = unsafe;
                e = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
            } catch (Exception e2) {
                throw new Error(e2);
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
            a[] aVarArr = this.cells;
            if (aVarArr != null && (length = aVarArr.length) > 0) {
                a aVar = aVarArr[(length - 1) & i];
                if (aVar == null) {
                    if (this.busy == 0) {
                        a aVar2 = new a(j);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                a[] aVarArr2 = this.cells;
                                if (aVarArr2 == null || (length2 = aVarArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (aVarArr2[i2] == null) {
                                        aVarArr2[i2] = aVar2;
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
                        long j2 = aVar.f4576b;
                        if (aVar.e(j2, fn(j2, j))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != aVarArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == aVarArr) {
                                    a[] aVarArr3 = new a[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        aVarArr3[i5] = aVarArr[i5];
                                    }
                                    this.cells = aVarArr3;
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
            } else if (this.busy == 0 && this.cells == aVarArr && casBusy()) {
                try {
                    if (this.cells == aVarArr) {
                        a[] aVarArr4 = new a[2];
                        aVarArr4[i & 1] = new a(j);
                        this.cells = aVarArr4;
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
        a[] aVarArr = this.cells;
        this.base = j;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    aVar.f4576b = j;
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
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.4
                @Override // java.security.PrivilegedExceptionAction
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
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
