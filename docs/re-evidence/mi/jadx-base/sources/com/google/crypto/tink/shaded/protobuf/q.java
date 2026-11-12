package com.google.crypto.tink.shaded.protobuf;

import defpackage.s8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends c<Float> implements s.f, RandomAccess, s8i {
    public static final q d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f9431b;
    public int c;

    static {
        q qVar = new q(new float[0], 0);
        d = qVar;
        qVar.b();
    }

    public q() {
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
        float[] fArr = this.f9431b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9431b = fArr2;
        }
        float[] fArr3 = this.f9431b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    public float M(int i, float f) {
        e();
        i(i);
        float[] fArr = this.f9431b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        s.a(collection);
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i = qVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f9431b;
        if (i3 > fArr.length) {
            this.f9431b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(qVar.f9431b, 0, this.f9431b, this.c, qVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        if (this.c != qVar.c) {
            return false;
        }
        float[] fArr = qVar.f9431b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.f9431b[i]) != Float.floatToIntBits(fArr[i])) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        J(f.floatValue());
        return true;
    }

    public float getFloat(int i) {
        i(i);
        return this.f9431b[i];
    }

    public final void h(int i, float f) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        float[] fArr = this.f9431b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9431b, i, fArr2, i + 1, this.c - i);
            this.f9431b = fArr2;
        }
        this.f9431b[i] = f;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f9431b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s.f a(int i) {
        if (i >= this.c) {
            return new q(Arrays.copyOf(this.f9431b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        e();
        i(i);
        float[] fArr = this.f9431b;
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
        float[] fArr = this.f9431b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public q(float[] fArr, int i) {
        this.f9431b = fArr;
        this.c = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.f9431b[i]))) {
                float[] fArr = this.f9431b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
