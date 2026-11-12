package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24054#2:18\n*E\n"})
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5 implements Iterable<Long>, KMappedMarker {
    final /* synthetic */ long[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(long[] jArr) {
        this.$this_asIterable$inlined = jArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
    }
}
