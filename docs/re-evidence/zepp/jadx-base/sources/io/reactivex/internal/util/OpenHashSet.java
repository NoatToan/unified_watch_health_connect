package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes22.dex */
public final class OpenHashSet<T> {
    private static final int f = -1640531527;
    public final float a;
    public int b;
    public int c;
    public int d;
    public T[] e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public static int a(int i) {
        int i2 = i * f;
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.b;
        int iA = a(t.hashCode()) & i;
        T t3 = tArr[iA];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iA = (iA + 1) & i;
                t2 = tArr[iA];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iA] = t;
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 >= this.d) {
            b();
        }
        return true;
    }

    public void b() {
        T[] tArr = this.e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.b = i2;
                this.d = (int) (i * this.a);
                this.e = tArr2;
                return;
            }
            do {
                length--;
            } while (tArr[length] == null);
            int iA = a(tArr[length].hashCode()) & i2;
            if (tArr2[iA] != null) {
                do {
                    iA = (iA + 1) & i2;
                } while (tArr2[iA] != null);
            }
            tArr2[iA] = tArr[length];
            i3 = i4;
        }
    }

    public boolean c(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iA = a(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iA && iA > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iA || iA > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    }
                } else {
                    tArr[i] = null;
                    return true;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public Object[] keys() {
        return this.e;
    }

    public boolean remove(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.b;
        int iA = a(t.hashCode()) & i;
        T t3 = tArr[iA];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return c(iA, tArr, i);
        }
        do {
            iA = (iA + 1) & i;
            t2 = tArr[iA];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return c(iA, tArr, i);
    }

    public int size() {
        return this.c;
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f2) {
        this.a = f2;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.b = iRoundToPowerOfTwo - 1;
        this.d = (int) (f2 * iRoundToPowerOfTwo);
        this.e = (T[]) new Object[iRoundToPowerOfTwo];
    }
}
