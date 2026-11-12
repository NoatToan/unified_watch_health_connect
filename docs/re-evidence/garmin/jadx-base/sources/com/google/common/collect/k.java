package com.google.common.collect;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class k implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53508b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f53507a = i14;
        this.f53508b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f53507a) {
            case 0:
                return CollectCollectors.lambda$toImmutableEnumMap$15((BinaryOperator) this.f53508b);
            case 1:
                return ((MultimapBuilder.ListMultimapBuilder) this.f53508b).build();
            default:
                return ((MultimapBuilder.SetMultimapBuilder) this.f53508b).build();
        }
    }
}
