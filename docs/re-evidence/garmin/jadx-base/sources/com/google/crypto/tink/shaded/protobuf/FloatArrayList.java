package com.google.crypto.tink.shaded.protobuf;

import androidx.core.view.j;
import b71.i;
import com.google.protobuf.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        FloatArrayList floatArrayList = new FloatArrayList(new float[0], 0);
        EMPTY_LIST = floatArrayList;
        floatArrayList.makeImmutable();
    }

    public FloatArrayList() {
        this(new float[10], 0);
    }

    private void addFloat(int i14, float f14) {
        int i15;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i15 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        float[] fArr = this.array;
        if (i15 < fArr.length) {
            System.arraycopy(fArr, i14, fArr, i14 + 1, i15 - i14);
        } else {
            float[] fArr2 = new float[j.a(i15, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            System.arraycopy(this.array, i14, fArr2, i14 + 1, this.size - i14);
            this.array = fArr2;
        }
        this.array[i14] = f14;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i14) {
        if (i14 < 0 || i14 >= this.size) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i14) {
        StringBuilder sbI = i.i(i14, "Index:", ", Size:");
        sbI.append(this.size);
        return sbI.toString();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f14) {
        addFloat(f14.floatValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i14 = floatArrayList.size;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.size;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        float[] fArr = this.array;
        if (i16 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i16);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (Float.floatToIntBits(this.array[i14]) != Float.floatToIntBits(fArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i14) {
        return Float.valueOf(getFloat(i14));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float getFloat(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i14 = 0; i14 < this.size; i14++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i14]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i14) {
        if (i14 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i14), this.size);
        }
        h.w();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i14 = 0; i14 < this.size; i14++) {
            if (obj.equals(Float.valueOf(this.array[i14]))) {
                float[] fArr = this.array;
                System.arraycopy(fArr, i14 + 1, fArr, i14, (this.size - i14) - 1);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i14, int i15) {
        ensureIsMutable();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.array;
        System.arraycopy(fArr, i15, fArr, i14, this.size - i15);
        this.size -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i14, Float f14) {
        return Float.valueOf(setFloat(i14, f14.floatValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float setFloat(int i14, float f14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        float[] fArr = this.array;
        float f15 = fArr[i14];
        fArr[i14] = f14;
        return f15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i14) {
        this.array = fArr;
        this.size = i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, Float f14) {
        addFloat(i14, f14.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        float[] fArr = this.array;
        float f14 = fArr[i14];
        int i15 = this.size;
        if (i14 < i15 - 1) {
            System.arraycopy(fArr, i14 + 1, fArr, i14, (i15 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public void addFloat(float f14) {
        ensureIsMutable();
        int i14 = this.size;
        float[] fArr = this.array;
        if (i14 == fArr.length) {
            float[] fArr2 = new float[j.a(i14, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        fArr3[i15] = f14;
    }
}
