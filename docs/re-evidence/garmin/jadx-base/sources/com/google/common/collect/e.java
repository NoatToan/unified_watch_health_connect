package com.google.common.collect;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53498a;

    public /* synthetic */ e(int i14) {
        this.f53498a = i14;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53498a) {
            case 0:
                return ((CollectCollectors.EnumSetAccumulator) obj).toImmutableSet();
            case 1:
                return CollectCollectors.lambda$toImmutableMultiset$4((Multiset) obj);
            case 2:
                return ((CollectCollectors.EnumMapAccumulator) obj).toImmutableMap();
            case 3:
                return ((TopKSelector) obj).topK();
            case 4:
                return ((MoreCollectors.ToOptionalState) obj).getOptional();
            case 5:
                return MoreCollectors.lambda$static$1((MoreCollectors.ToOptionalState) obj);
            case 6:
                return ((TableCollectors.ImmutableTableCollectorState) obj).toTable();
            case 7:
                return ((ImmutableBiMap.Builder) obj).buildOrThrow();
            case 8:
                return ((ImmutableRangeSet.Builder) obj).build();
            case 9:
                return ((ImmutableList.Builder) obj).build();
            case 10:
                return ((ImmutableSet.Builder) obj).build();
            case 11:
                return ImmutableListMultimap.copyOf((Multimap) obj);
            case 12:
                return ImmutableSetMultimap.copyOf((Multimap) obj);
            case 13:
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            case 14:
                return ((ImmutableRangeMap.Builder) obj).build();
            case 15:
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            case 16:
                return ((ImmutableSortedSet.Builder) obj).build();
            case 17:
                return ((ImmutableListMultimap.Builder) obj).build();
            case 18:
                return ((ImmutableSetMultimap.Builder) obj).build();
            case 19:
                return ImmutableMap.copyOf((Map) obj);
            case 20:
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            default:
                return ((ImmutableTable.Builder) obj).build();
        }
    }
}
