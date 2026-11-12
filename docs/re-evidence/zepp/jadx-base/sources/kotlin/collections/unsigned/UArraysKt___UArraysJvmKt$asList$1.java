package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes23.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {
    public final /* synthetic */ int[] a;

    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.a = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m3996containsWZ4Q5Ns(((UInt) obj).m3885unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m3996containsWZ4Q5Ns(int i) {
        return UIntArray.m3889containsWZ4Q5Ns(this.a, i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UInt.m3879boximpl(m3997getpVg5ArA(i));
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public int m3997getpVg5ArA(int i) {
        return UIntArray.m3893getpVg5ArA(this.a, i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return UIntArray.m3894getSizeimpl(this.a);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UInt) {
            return m3998indexOfWZ4Q5Ns(((UInt) obj).m3885unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m3998indexOfWZ4Q5Ns(int i) {
        return ArraysKt___ArraysKt.indexOf(this.a, i);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UIntArray.m3896isEmptyimpl(this.a);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UInt) {
            return m3999lastIndexOfWZ4Q5Ns(((UInt) obj).m3885unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m3999lastIndexOfWZ4Q5Ns(int i) {
        return ArraysKt___ArraysKt.lastIndexOf(this.a, i);
    }
}
