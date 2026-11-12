package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f53494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f53495c;

    public /* synthetic */ b(Function function, Function function2, int i14) {
        this.f53493a = i14;
        this.f53494b = function;
        this.f53495c = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f53493a) {
            case 0:
                CollectCollectors.lambda$toImmutableBiMap$11(this.f53494b, this.f53495c, (ImmutableBiMap.Builder) obj, obj2);
                break;
            case 1:
                CollectCollectors.lambda$flatteningToMultimap$26(this.f53494b, this.f53495c, (Multimap) obj, obj2);
                break;
            case 2:
                CollectCollectors.lambda$toImmutableRangeMap$17(this.f53494b, this.f53495c, (ImmutableRangeMap.Builder) obj, obj2);
                break;
            case 3:
                CollectCollectors.lambda$toImmutableEnumMap$14(this.f53494b, this.f53495c, (CollectCollectors.EnumMapAccumulator) obj, obj2);
                break;
            case 4:
                CollectCollectors.lambda$toImmutableMap$7(this.f53494b, this.f53495c, (ImmutableMap.Builder) obj, obj2);
                break;
            case 5:
                CollectCollectors.lambda$toImmutableListMultimap$18(this.f53494b, this.f53495c, (ImmutableListMultimap.Builder) obj, obj2);
                break;
            case 6:
                CollectCollectors.lambda$toImmutableSetMultimap$21(this.f53494b, this.f53495c, (ImmutableSetMultimap.Builder) obj, obj2);
                break;
            case 7:
                CollectCollectors.lambda$toImmutableSortedMap$9(this.f53494b, this.f53495c, (ImmutableSortedMap.Builder) obj, obj2);
                break;
            case 8:
                CollectCollectors.lambda$toImmutableEnumMap$16(this.f53494b, this.f53495c, (CollectCollectors.EnumMapAccumulator) obj, obj2);
                break;
            default:
                CollectCollectors.lambda$toMultimap$24(this.f53494b, this.f53495c, (Multimap) obj, obj2);
                break;
        }
    }
}
