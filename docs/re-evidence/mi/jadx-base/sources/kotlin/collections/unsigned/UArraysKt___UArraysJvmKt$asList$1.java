package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m1404containsWZ4Q5Ns(((UInt) obj).m1033unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m1404containsWZ4Q5Ns(int i) {
        return UIntArray.m1037containsWZ4Q5Ns(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UInt.m975boximpl(m1405getpVg5ArA(i));
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public int m1405getpVg5ArA(int i) {
        return UIntArray.m1041getpVg5ArA(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UIntArray.m1042getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UInt) {
            return m1406indexOfWZ4Q5Ns(((UInt) obj).m1033unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m1406indexOfWZ4Q5Ns(int i) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UIntArray.m1044isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UInt) {
            return m1407lastIndexOfWZ4Q5Ns(((UInt) obj).m1033unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m1407lastIndexOfWZ4Q5Ns(int i) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, i);
    }
}
