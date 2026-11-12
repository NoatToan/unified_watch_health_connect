package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<UShort> implements RandomAccess {
    final /* synthetic */ short[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.$this_asList = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m1416containsxj2QHRw(((UShort) obj).m1217unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m1416containsxj2QHRw(short s) {
        return UShortArray.m1221containsxj2QHRw(this.$this_asList, s);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UShort.m1161boximpl(m1417getMh2AYeg(i));
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m1417getMh2AYeg(int i) {
        return UShortArray.m1225getMh2AYeg(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UShortArray.m1226getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UShort) {
            return m1418indexOfxj2QHRw(((UShort) obj).m1217unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m1418indexOfxj2QHRw(short s) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, s);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UShortArray.m1228isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UShort) {
            return m1419lastIndexOfxj2QHRw(((UShort) obj).m1217unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m1419lastIndexOfxj2QHRw(short s) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, s);
    }
}
