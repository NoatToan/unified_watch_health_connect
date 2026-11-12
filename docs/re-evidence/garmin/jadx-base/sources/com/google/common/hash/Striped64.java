package com.google.common.hash;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import r1.q2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    public static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        volatile long f53570p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        volatile long f53571p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        volatile long f53572p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        volatile long f53573p3;

        /* JADX INFO: renamed from: p4, reason: collision with root package name */
        volatile long f53574p4;

        /* JADX INFO: renamed from: p5, reason: collision with root package name */
        volatile long f53575p5;

        /* JADX INFO: renamed from: p6, reason: collision with root package name */
        volatile long f53576p6;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        volatile long f53577q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        volatile long f53578q1;

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        volatile long f53579q2;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        volatile long f53580q3;

        /* JADX INFO: renamed from: q4, reason: collision with root package name */
        volatile long f53581q4;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        volatile long f53582q5;

        /* JADX INFO: renamed from: q6, reason: collision with root package name */
        volatile long f53583q6;
        volatile long value;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e4) {
                throw new Error(e4);
            }
        }

        public Cell(long j8) {
            this.value = j8;
        }

        public final boolean cas(long j8, long j14) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j8, j14);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(TtmlNode.RUBY_BASE));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e4) {
            throw new Error(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e4) {
                q2.v("Could not initialize intrinsics", e4.getCause());
                return null;
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws IllegalAccessException {
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

    public final boolean casBase(long j8, long j14) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j8, j14);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public abstract long fn(long j8, long j14);

    public final void internalReset(long j8) {
        Cell[] cellArr = this.cells;
        this.base = j8;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j8;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    public final void retryUpdate(long j8, int[] iArr, boolean z14) {
        int iNextInt;
        int[] iArr2;
        boolean z15;
        int length;
        boolean z16;
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
        boolean z17 = false;
        int i14 = iNextInt;
        boolean z18 = z14;
        while (true) {
            Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                Cell cell = cellArr[(length - 1) & i14];
                if (cell == null) {
                    if (this.busy == 0) {
                        Cell cell2 = new Cell(j8);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                Cell[] cellArr2 = this.cells;
                                if (cellArr2 == null || (length2 = cellArr2.length) <= 0) {
                                    z16 = false;
                                } else {
                                    int i15 = (length2 - 1) & i14;
                                    if (cellArr2[i15] == null) {
                                        cellArr2[i15] = cell2;
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z16) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                this.busy = 0;
                                throw th3;
                            }
                        }
                    }
                    z17 = false;
                    int i16 = i14 ^ (i14 << 13);
                    int i17 = i16 ^ (i16 >>> 17);
                    i14 = i17 ^ (i17 << 5);
                    iArr2[0] = i14;
                } else {
                    if (z18) {
                        long j14 = cell.value;
                        if (cell.cas(j14, fn(j14, j8))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != cellArr) {
                            z17 = false;
                        } else if (!z17) {
                            z17 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    Cell[] cellArr3 = new Cell[length << 1];
                                    for (int i18 = 0; i18 < length; i18++) {
                                        cellArr3[i18] = cellArr[i18];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z17 = false;
                            } catch (Throwable th4) {
                                this.busy = 0;
                                throw th4;
                            }
                        }
                    } else {
                        z18 = true;
                    }
                    int i19 = i14 ^ (i14 << 13);
                    int i110 = i19 ^ (i19 >>> 17);
                    i14 = i110 ^ (i110 << 5);
                    iArr2[0] = i14;
                }
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        Cell[] cellArr4 = new Cell[2];
                        cellArr4[i14 & 1] = new Cell(j8);
                        this.cells = cellArr4;
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.busy = 0;
                    if (z15) {
                        return;
                    }
                } catch (Throwable th5) {
                    this.busy = 0;
                    throw th5;
                }
            } else {
                long j15 = this.base;
                if (casBase(j15, fn(j15, j8))) {
                    return;
                }
            }
        }
    }
}
