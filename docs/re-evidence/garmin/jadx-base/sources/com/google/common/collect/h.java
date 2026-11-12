package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class h implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f53505b;

    public /* synthetic */ h(Comparator comparator, int i14) {
        this.f53504a = i14;
        this.f53505b = comparator;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f53504a) {
            case 0:
                return CollectCollectors.lambda$toImmutableSortedMap$10(this.f53505b);
            case 1:
                return CollectCollectors.lambda$toImmutableSortedSet$0(this.f53505b);
            case 2:
                return CollectCollectors.lambda$toImmutableSortedMap$8(this.f53505b);
            default:
                return TreeMultiset.create(this.f53505b);
        }
    }
}
