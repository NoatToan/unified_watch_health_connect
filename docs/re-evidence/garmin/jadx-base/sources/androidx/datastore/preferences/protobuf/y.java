package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class y extends c<Integer> implements RandomAccess, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6933c;

    static {
        new y(new int[0], 0, false);
    }

    public y() {
        this(new int[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f6933c)) {
            l2.j(this.f6933c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.f6932b;
        if (i15 < iArr.length) {
            System.arraycopy(iArr, i14, iArr, i14 + 1, i15 - i14);
        } else {
            int[] iArr2 = new int[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            System.arraycopy(this.f6932b, i14, iArr2, i14 + 1, this.f6933c - i14);
            this.f6932b = iArr2;
        }
        this.f6932b[i14] = iIntValue;
        this.f6933c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = z.f6936a;
        collection.getClass();
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i14 = yVar.f6933c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f6933c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        int[] iArr = this.f6932b;
        if (i16 > iArr.length) {
            this.f6932b = Arrays.copyOf(iArr, i16);
        }
        System.arraycopy(yVar.f6932b, 0, this.f6932b, this.f6933c, yVar.f6933c);
        this.f6933c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i14) {
        a();
        int i15 = this.f6933c;
        int[] iArr = this.f6932b;
        if (i15 == iArr.length) {
            int[] iArr2 = new int[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            this.f6932b = iArr2;
        }
        int[] iArr3 = this.f6932b;
        int i16 = this.f6933c;
        this.f6933c = i16 + 1;
        iArr3[i16] = i14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f6933c) {
            l2.j(this.f6933c, b71.i.i(i14, "Index:", ", Size:"));
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
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f6933c != yVar.f6933c) {
            return false;
        }
        int[] iArr = yVar.f6932b;
        for (int i14 = 0; i14 < this.f6933c; i14++) {
            if (this.f6932b[i14] != iArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        return Integer.valueOf(getInt(i14));
    }

    public final int getInt(int i14) {
        b(i14);
        return this.f6932b[i14];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.f6933c; i15++) {
            i14 = (i14 * 31) + this.f6932b[i15];
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i14 = this.f6933c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f6932b[i15] == iIntValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.z.d
    public final z.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f6933c) {
            return new y(Arrays.copyOf(this.f6932b, i14), this.f6933c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        int[] iArr = this.f6932b;
        int i15 = iArr[i14];
        int i16 = this.f6933c;
        if (i14 < i16 - 1) {
            System.arraycopy(iArr, i14 + 1, iArr, i14, (i16 - i14) - 1);
        }
        this.f6933c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        a();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f6932b;
        System.arraycopy(iArr, i15, iArr, i14, this.f6933c - i15);
        this.f6933c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        b(i14);
        int[] iArr = this.f6932b;
        int i15 = iArr[i14];
        iArr[i14] = iIntValue;
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6933c;
    }

    private y(int[] iArr, int i14, boolean z14) {
        super(z14);
        this.f6932b = iArr;
        this.f6933c = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
