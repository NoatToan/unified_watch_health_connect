package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bbh<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4019b;
    public int c;
    public int d;
    public T[] e;

    public bbh() {
        this(16, 0.75f);
    }

    public static int c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.f4019b;
        int iC = c(t.hashCode()) & i;
        T t3 = tArr[iC];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iC = (iC + 1) & i;
                t2 = tArr[iC];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iC] = t;
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 >= this.d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.e;
    }

    public void d() {
        T t;
        T[] tArr = this.e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f4019b = i2;
                this.d = (int) (i * this.f4018a);
                this.e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iC = c(t.hashCode()) & i2;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i2;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i3 = i4;
        }
    }

    public boolean e(T t) {
        T t2;
        T[] tArr = this.e;
        int i = this.f4019b;
        int iC = c(t.hashCode()) & i;
        T t3 = tArr[iC];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return f(iC, tArr, i);
        }
        do {
            iC = (iC + 1) & i;
            t2 = tArr[iC];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return f(iC, tArr, i);
    }

    public boolean f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iC = c(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iC && iC > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iC || iC > i3) {
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

    public bbh(int i, float f) {
        this.f4018a = f;
        int iA = d5i.a(i);
        this.f4019b = iA - 1;
        this.d = (int) (f * iA);
        this.e = (T[]) new Object[iA];
    }
}
