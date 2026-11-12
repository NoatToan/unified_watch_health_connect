package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c<Float> implements RandomAccess, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f7655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7656c;

    static {
        new h0(new float[0], 0, false);
    }

    public h0() {
        this(new float[10], 0, true);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f7656c)) {
            yc.l2.j(this.f7656c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.f7655b;
        if (i15 < fArr.length) {
            System.arraycopy(fArr, i14, fArr, i14 + 1, i15 - i14);
        } else {
            float[] fArr2 = new float[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            System.arraycopy(this.f7655b, i14, fArr2, i14 + 1, this.f7656c - i14);
            this.f7655b = fArr2;
        }
        this.f7655b[i14] = fFloatValue;
        this.f7656c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = l0.f7708a;
        collection.getClass();
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i14 = h0Var.f7656c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f7656c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        float[] fArr = this.f7655b;
        if (i16 > fArr.length) {
            this.f7655b = Arrays.copyOf(fArr, i16);
        }
        System.arraycopy(h0Var.f7655b, 0, this.f7655b, this.f7656c, h0Var.f7656c);
        this.f7656c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f14) {
        a();
        int i14 = this.f7656c;
        float[] fArr = this.f7655b;
        if (i14 == fArr.length) {
            float[] fArr2 = new float[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            this.f7655b = fArr2;
        }
        float[] fArr3 = this.f7655b;
        int i15 = this.f7656c;
        this.f7656c = i15 + 1;
        fArr3[i15] = f14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f7656c) {
            yc.l2.j(this.f7656c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f7656c != h0Var.f7656c) {
            return false;
        }
        float[] fArr = h0Var.f7655b;
        for (int i14 = 0; i14 < this.f7656c; i14++) {
            if (Float.floatToIntBits(this.f7655b[i14]) != Float.floatToIntBits(fArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        b(i14);
        return Float.valueOf(this.f7655b[i14]);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i14 = 0; i14 < this.f7656c; i14++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f7655b[i14]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i14 = this.f7656c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f7655b[i15] == fFloatValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final l0.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f7656c) {
            return new h0(Arrays.copyOf(this.f7655b, i14), this.f7656c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        float[] fArr = this.f7655b;
        float f14 = fArr[i14];
        int i15 = this.f7656c;
        if (i14 < i15 - 1) {
            System.arraycopy(fArr, i14 + 1, fArr, i14, (i15 - i14) - 1);
        }
        this.f7656c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        a();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f7655b;
        System.arraycopy(fArr, i15, fArr, i14, this.f7656c - i15);
        this.f7656c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        b(i14);
        float[] fArr = this.f7655b;
        float f14 = fArr[i14];
        fArr[i14] = fFloatValue;
        return Float.valueOf(f14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7656c;
    }

    private h0(float[] fArr, int i14, boolean z14) {
        super(z14);
        this.f7655b = fArr;
        this.f7656c = i14;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
