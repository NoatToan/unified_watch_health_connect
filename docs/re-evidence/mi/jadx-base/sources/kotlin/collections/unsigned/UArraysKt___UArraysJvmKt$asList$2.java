package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {
    final /* synthetic */ long[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m1408containsVKZWuLQ(((ULong) obj).m1112unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m1408containsVKZWuLQ(long j) {
        return ULongArray.m1116containsVKZWuLQ(this.$this_asList, j);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return ULong.m1054boximpl(m1409getsVKNKU(i));
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m1409getsVKNKU(int i) {
        return ULongArray.m1120getsVKNKU(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m1121getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m1410indexOfVKZWuLQ(((ULong) obj).m1112unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m1410indexOfVKZWuLQ(long j) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, j);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m1123isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m1411lastIndexOfVKZWuLQ(((ULong) obj).m1112unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m1411lastIndexOfVKZWuLQ(long j) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j);
    }
}
