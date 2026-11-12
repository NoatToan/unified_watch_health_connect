package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {
    final /* synthetic */ byte[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$3(byte[] bArr) {
        this.$this_asList = bArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m1412contains7apg3OU(((UByte) obj).m954unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m1412contains7apg3OU(byte b2) {
        return UByteArray.m958contains7apg3OU(this.$this_asList, b2);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UByte.m898boximpl(m1413getw2LRezQ(i));
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m1413getw2LRezQ(int i) {
        return UByteArray.m962getw2LRezQ(this.$this_asList, i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UByteArray.m963getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UByte) {
            return m1414indexOf7apg3OU(((UByte) obj).m954unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m1414indexOf7apg3OU(byte b2) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, b2);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UByteArray.m965isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UByte) {
            return m1415lastIndexOf7apg3OU(((UByte) obj).m954unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m1415lastIndexOf7apg3OU(byte b2) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b2);
    }
}
