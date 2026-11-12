package com.google.protobuf;

import defpackage.t8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends d<Float> implements d0.f, RandomAccess, t8i {
    public static final b0 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f9605b;
    public int c;

    static {
        b0 b0Var = new b0(new float[0], 0);
        d = b0Var;
        b0Var.b();
    }

    public b0() {
        this(new float[10], 0);
    }

    public static b0 i() {
        return d;
    }

    private void j(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private String l(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.protobuf.d0.f
    public void J(float f) {
        e();
        int i = this.c;
        float[] fArr = this.f9605b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9605b = fArr2;
        }
        float[] fArr3 = this.f9605b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.d0.f
    public float M(int i, float f) {
        e();
        j(i);
        float[] fArr = this.f9605b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        d0.a(collection);
        if (!(collection instanceof b0)) {
            return super.addAll(collection);
        }
        b0 b0Var = (b0) collection;
        int i = b0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f9605b;
        if (i3 > fArr.length) {
            this.f9605b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(b0Var.f9605b, 0, this.f9605b, this.c, b0Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        if (this.c != b0Var.c) {
            return false;
        }
        float[] fArr = b0Var.f9605b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.f9605b[i]) != Float.floatToIntBits(fArr[i])) {
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

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        J(f.floatValue());
        return true;
    }

    @Override // com.google.protobuf.d0.f
    public float getFloat(int i) {
        j(i);
        return this.f9605b[i];
    }

    public final void h(int i, float f) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        float[] fArr = this.f9605b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9605b, i, fArr2, i + 1, this.c - i);
            this.f9605b = fArr2;
        }
        this.f9605b[i] = f;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f9605b[i]);
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
            if (this.f9605b[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        e();
        j(i);
        float[] fArr = this.f9605b;
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
        float[] fArr = this.f9605b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public b0(float[] fArr, int i) {
        this.f9605b = fArr;
        this.c = i;
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: a */
    public d0.i<Float> a2(int i) {
        if (i >= this.c) {
            return new b0(Arrays.copyOf(this.f9605b, i), this.c);
        }
        throw new IllegalArgumentException();
    }
}
