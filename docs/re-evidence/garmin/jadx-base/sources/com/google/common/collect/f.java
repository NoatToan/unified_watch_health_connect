package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53500b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f53499a = i14;
        this.f53500b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53499a) {
            case 0:
                return CollectCollectors.lambda$flatteningToImmutableListMultimap$19((Function) this.f53500b, obj);
            case 1:
                return CollectCollectors.lambda$flatteningToImmutableListMultimap$20((Function) this.f53500b, obj);
            case 2:
                return CollectCollectors.lambda$flatteningToImmutableSetMultimap$22((Function) this.f53500b, obj);
            case 3:
                return CollectCollectors.lambda$flatteningToImmutableSetMultimap$23((Function) this.f53500b, obj);
            default:
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$4((Comparator) this.f53500b, (Multiset) obj);
        }
    }
}
