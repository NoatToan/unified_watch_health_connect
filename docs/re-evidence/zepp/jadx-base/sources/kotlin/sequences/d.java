package kotlin.sequences;

import java.util.Enumeration;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
class d extends SequencesKt__SequenceBuilderKt {
    @InlineOnly
    private static final <T> Sequence<T> c(Enumeration<T> enumeration) {
        return SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(enumeration));
    }
}
