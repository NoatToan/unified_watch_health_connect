package kotlin.sequences;

import java.util.Enumeration;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt {
    @InlineOnly
    private static final <T> Sequence<T> asSequence(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(enumeration));
    }
}
