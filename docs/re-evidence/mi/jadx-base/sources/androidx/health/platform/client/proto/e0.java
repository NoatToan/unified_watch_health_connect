package androidx.health.platform.client.proto;

import defpackage.r8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c<Integer> implements f0.g, RandomAccess, r8i {
    public static final e0 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2486b;
    public int c;

    static {
        e0 e0Var = new e0(new int[0], 0);
        d = e0Var;
        e0Var.b();
    }

    public e0() {
        this(new int[10], 0);
    }

    private void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private String k(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    public int K(int i, int i2) {
        e();
        i(i);
        int[] iArr = this.f2486b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public void Q(int i) {
        e();
        int i2 = this.c;
        int[] iArr = this.f2486b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2486b = iArr2;
        }
        int[] iArr3 = this.f2486b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        e();
        f0.a(collection);
        if (!(collection instanceof e0)) {
            return super.addAll(collection);
        }
        e0 e0Var = (e0) collection;
        int i = e0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f2486b;
        if (i3 > iArr.length) {
            this.f2486b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(e0Var.f2486b, 0, this.f2486b, this.c, e0Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        if (this.c != e0Var.c) {
            return false;
        }
        int[] iArr = e0Var.f2486b;
        for (int i = 0; i < this.c; i++) {
            if (this.f2486b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        h(i, num.intValue());
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        Q(num.intValue());
        return true;
    }

    public int getInt(int i) {
        i(i);
        return this.f2486b[i];
    }

    public final void h(int i, int i2) {
        int i3;
        e();
        if (i < 0 || i > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        int[] iArr = this.f2486b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f2486b, i, iArr2, i + 1, this.c - i);
            this.f2486b = iArr2;
        }
        this.f2486b[i] = i2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.f2486b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2486b[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // androidx.health.platform.client.proto.f0.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f0.g a(int i) {
        if (i >= this.c) {
            return new e0(Arrays.copyOf(this.f2486b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        e();
        i(i);
        int[] iArr = this.f2486b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(K(i, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2486b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public e0(int[] iArr, int i) {
        this.f2486b = iArr;
        this.c = i;
    }
}
