package com.google.common.collect;

import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53496a;

    public /* synthetic */ c(int i14) {
        this.f53496a = i14;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f53496a) {
            case 0:
                return CollectCollectors.lambda$toImmutableEnumSetGeneric$1();
            case 1:
                return CollectCollectors.lambda$toImmutableEnumMap$13();
            case 2:
                return new MoreCollectors.ToOptionalState();
            case 3:
                return TableCollectors.lambda$toImmutableTable$1();
            case 4:
                return ImmutableList.builder();
            case 5:
                return ImmutableRangeMap.builder();
            case 6:
                return ImmutableSet.builder();
            case 7:
                return ImmutableRangeSet.builder();
            case 8:
                return LinkedHashMultiset.create();
            case 9:
                return new ImmutableMap.Builder();
            case 10:
                return ImmutableListMultimap.builder();
            case 11:
                return ImmutableSetMultimap.builder();
            case 12:
                return new LinkedHashMap();
            case 13:
                return new ImmutableBiMap.Builder();
            default:
                return new ImmutableTable.Builder();
        }
    }
}
