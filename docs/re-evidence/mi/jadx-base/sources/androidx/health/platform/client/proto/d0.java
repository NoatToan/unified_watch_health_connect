package androidx.health.platform.client.proto;

import defpackage.r8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c<Float> implements f0.f, RandomAccess, r8i {
    public static final d0 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f2484b;
    public int c;

    static {
        d0 d0Var = new d0(new float[0], 0);
        d = d0Var;
        d0Var.b();
    }

    public d0() {
        this(new float[10], 0);
    }

    private void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private String k(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    public void J(float f) {
        e();
        int i = this.c;
        float[] fArr = this.f2484b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f2484b = fArr2;
        }
        float[] fArr3 = this.f2484b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    public float M(int i, float f) {
        e();
        i(i);
        float[] fArr = this.f2484b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        f0.a(collection);
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i = d0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f2484b;
        if (i3 > fArr.length) {
            this.f2484b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(d0Var.f2484b, 0, this.f2484b, this.c, d0Var.c);
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
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.c != d0Var.c) {
            return false;
        }
        float[] fArr = d0Var.f2484b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.f2484b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        h(i, f.floatValue());
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        J(f.floatValue());
        return true;
    }

    public float getFloat(int i) {
        i(i);
        return this.f2484b[i];
    }

    public final void h(int i, float f) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        float[] fArr = this.f2484b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f2484b, i, fArr2, i + 1, this.c - i);
            this.f2484b = fArr2;
        }
        this.f2484b[i] = f;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2484b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2484b[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // androidx.health.platform.client.proto.f0.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f0.f a(int i) {
        if (i >= this.c) {
            return new d0(Arrays.copyOf(this.f2484b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        e();
        i(i);
        float[] fArr = this.f2484b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(M(i, f.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f2484b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public d0(float[] fArr, int i) {
        this.f2484b = fArr;
        this.c = i;
    }
}
