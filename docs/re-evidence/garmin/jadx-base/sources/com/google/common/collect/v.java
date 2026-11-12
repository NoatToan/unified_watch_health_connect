package com.google.common.collect;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class v implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f53527b;

    public /* synthetic */ v(BinaryOperator binaryOperator, int i14) {
        this.f53526a = i14;
        this.f53527b = binaryOperator;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f53526a) {
            case 0:
                return TableCollectors.lambda$toTable$7(this.f53527b, (Table) obj, (Table) obj2);
            default:
                return TableCollectors.lambda$toImmutableTable$3(this.f53527b, (TableCollectors.ImmutableTableCollectorState) obj, (TableCollectors.ImmutableTableCollectorState) obj2);
        }
    }
}
