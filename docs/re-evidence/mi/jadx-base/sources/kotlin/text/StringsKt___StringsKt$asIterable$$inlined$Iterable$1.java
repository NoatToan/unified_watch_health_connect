package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,17:1\n2476#2:18\n*E\n"})
public final class StringsKt___StringsKt$asIterable$$inlined$Iterable$1 implements Iterable<Character>, KMappedMarker {
    final /* synthetic */ CharSequence $this_asIterable$inlined;

    public StringsKt___StringsKt$asIterable$$inlined$Iterable$1(CharSequence charSequence) {
        this.$this_asIterable$inlined = charSequence;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return StringsKt__StringsKt.iterator(this.$this_asIterable$inlined);
    }
}
