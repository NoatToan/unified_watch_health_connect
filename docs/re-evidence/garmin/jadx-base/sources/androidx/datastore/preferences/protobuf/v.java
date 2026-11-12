package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends c<Float> implements RandomAccess, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f6908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6909c;

    static {
        new v(new float[0], 0, false);
    }

    public v() {
        this(new float[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f6909c)) {
            l2.j(this.f6909c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.f6908b;
        if (i15 < fArr.length) {
            System.arraycopy(fArr, i14, fArr, i14 + 1, i15 - i14);
        } else {
            float[] fArr2 = new float[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            System.arraycopy(this.f6908b, i14, fArr2, i14 + 1, this.f6909c - i14);
            this.f6908b = fArr2;
        }
        this.f6908b[i14] = fFloatValue;
        this.f6909c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = z.f6936a;
        collection.getClass();
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i14 = vVar.f6909c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f6909c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        float[] fArr = this.f6908b;
        if (i16 > fArr.length) {
            this.f6908b = Arrays.copyOf(fArr, i16);
        }
        System.arraycopy(vVar.f6908b, 0, this.f6908b, this.f6909c, vVar.f6909c);
        this.f6909c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f14) {
        a();
        int i14 = this.f6909c;
        float[] fArr = this.f6908b;
        if (i14 == fArr.length) {
            float[] fArr2 = new float[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            this.f6908b = fArr2;
        }
        float[] fArr3 = this.f6908b;
        int i15 = this.f6909c;
        this.f6909c = i15 + 1;
        fArr3[i15] = f14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f6909c) {
            l2.j(this.f6909c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f6909c != vVar.f6909c) {
            return false;
        }
        float[] fArr = vVar.f6908b;
        for (int i14 = 0; i14 < this.f6909c; i14++) {
            if (Float.floatToIntBits(this.f6908b[i14]) != Float.floatToIntBits(fArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        b(i14);
        return Float.valueOf(this.f6908b[i14]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i14 = 0; i14 < this.f6909c; i14++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f6908b[i14]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i14 = this.f6909c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f6908b[i15] == fFloatValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.z.d
    public final z.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f6909c) {
            return new v(Arrays.copyOf(this.f6908b, i14), this.f6909c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        float[] fArr = this.f6908b;
        float f14 = fArr[i14];
        int i15 = this.f6909c;
        if (i14 < i15 - 1) {
            System.arraycopy(fArr, i14 + 1, fArr, i14, (i15 - i14) - 1);
        }
        this.f6909c--;
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
        float[] fArr = this.f6908b;
        System.arraycopy(fArr, i15, fArr, i14, this.f6909c - i15);
        this.f6909c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        b(i14);
        float[] fArr = this.f6908b;
        float f14 = fArr[i14];
        fArr[i14] = fFloatValue;
        return Float.valueOf(f14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6909c;
    }

    private v(float[] fArr, int i14, boolean z14) {
        super(z14);
        this.f6908b = fArr;
        this.f6909c = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
