package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f53502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ToIntFunction f53503c;

    public /* synthetic */ g(Function function, ToIntFunction toIntFunction, int i14) {
        this.f53501a = i14;
        this.f53502b = function;
        this.f53503c = toIntFunction;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f53501a) {
            case 0:
                CollectCollectors.lambda$toImmutableMultiset$2(this.f53502b, this.f53503c, (Multiset) obj, obj2);
                break;
            case 1:
                CollectCollectors.lambda$toMultiset$5(this.f53502b, this.f53503c, (Multiset) obj, obj2);
                break;
            default:
                ImmutableSortedMultiset.mapAndAdd(obj2, (Multiset) obj, this.f53502b, this.f53503c);
                break;
        }
    }
}
