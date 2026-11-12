package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes10.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {
    final /* synthetic */ MatcherMatchResult this$0;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.this$0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof MatchGroup)) {
            return contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.text.MatchGroupCollection
    public MatchGroup get(int i) {
        IntRange intRangeRange = RegexKt.range(this.this$0.getMatchResult(), i);
        if (intRangeRange.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = this.this$0.getMatchResult().group(i);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeRange);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.this$0.getMatchResult().groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<MatchGroup> iterator() {
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(CollectionsKt__CollectionsKt.getIndices(this)), new Function1() { // from class: d8f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15213a.get(((Integer) obj).intValue());
            }
        }).iterator();
    }

    public /* bridge */ boolean contains(MatchGroup matchGroup) {
        return super.contains(matchGroup);
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    public MatchGroup get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(this.this$0.getMatchResult(), name);
    }
}
