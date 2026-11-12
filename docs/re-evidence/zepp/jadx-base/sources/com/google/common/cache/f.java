package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
abstract class f extends Number {
    public static final ThreadLocal<int[]> d = new ThreadLocal<>();
    public static final Random e = new Random();
    public static final int f = Runtime.getRuntime().availableProcessors();
    private static final Unsafe g;
    private static final long h;
    private static final long i;

    @NullableDecl
    public volatile transient b[] a;
    public volatile transient long b;
    public volatile transient int c;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
    }

    public static final class b {
        private static final Unsafe p;
        private static final long q;
        public volatile long a;
        public volatile long b;
        public volatile long c;
        public volatile long d;
        public volatile long e;
        public volatile long f;
        public volatile long g;
        public volatile long h;
        public volatile long i;
        public volatile long j;
        public volatile long k;
        public volatile long l;
        public volatile long m;
        public volatile long n;
        public volatile long o;

        static {
            try {
                Unsafe unsafeG = f.g();
                p = unsafeG;
                q = unsafeG.objectFieldOffset(b.class.getDeclaredField("h"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public b(long j) {
            this.h = j;
        }

        public final boolean a(long j, long j2) {
            return p.compareAndSwapLong(this, q, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeG = g();
            g = unsafeG;
            h = unsafeG.objectFieldOffset(f.class.getDeclaredField("b"));
            i = unsafeG.objectFieldOffset(f.class.getDeclaredField("c"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe g() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    final boolean c(long j, long j2) {
        return g.compareAndSwapLong(this, h, j, j2);
    }

    final boolean e() {
        return g.compareAndSwapInt(this, i, 0, 1);
    }

    abstract long f(long j, long j2);

    final void h(long j) {
        b[] bVarArr = this.a;
        this.b = j;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.h = j;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    final void i(long j, int[] iArr, boolean z) {
        int iNextInt;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            d.set(iArr2);
            iNextInt = e.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        int i2 = iNextInt;
        boolean z4 = false;
        boolean z5 = z;
        while (true) {
            b[] bVarArr = this.a;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i2];
                if (bVar == null) {
                    if (this.c == 0) {
                        b bVar2 = new b(j);
                        if (this.c == 0 && e()) {
                            try {
                                b[] bVarArr2 = this.a;
                                if (bVarArr2 == null || (length2 = bVarArr2.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i3 = (length2 - 1) & i2;
                                    if (bVarArr2[i3] == null) {
                                        bVarArr2[i3] = bVar2;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                this.c = 0;
                                if (z3) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.c = 0;
                                throw th;
                            }
                        }
                    }
                    z4 = false;
                    int i4 = i2 ^ (i2 << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    i2 = i5 ^ (i5 << 5);
                    iArr2[0] = i2;
                } else {
                    if (z5) {
                        long j2 = bVar.h;
                        if (bVar.a(j2, f(j2, j))) {
                            return;
                        }
                        if (length >= f || this.a != bVarArr) {
                            z4 = false;
                        } else if (!z4) {
                            z4 = true;
                        } else if (this.c == 0 && e()) {
                            try {
                                if (this.a == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i6 = 0; i6 < length; i6++) {
                                        bVarArr3[i6] = bVarArr[i6];
                                    }
                                    this.a = bVarArr3;
                                }
                                this.c = 0;
                                z4 = false;
                            } catch (Throwable th2) {
                                this.c = 0;
                                throw th2;
                            }
                        }
                    } else {
                        z5 = true;
                    }
                    int i7 = i2 ^ (i2 << 13);
                    int i8 = i7 ^ (i7 >>> 17);
                    i2 = i8 ^ (i8 << 5);
                    iArr2[0] = i2;
                }
            } else if (this.c == 0 && this.a == bVarArr && e()) {
                try {
                    if (this.a == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i2 & 1] = new b(j);
                        this.a = bVarArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.c = 0;
                    if (z2) {
                        return;
                    }
                } catch (Throwable th3) {
                    this.c = 0;
                    throw th3;
                }
            } else {
                long j3 = this.b;
                if (c(j3, f(j3, j))) {
                    return;
                }
            }
        }
    }
}
