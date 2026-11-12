package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class u implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f53522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f53523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function f53524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f53525e;

    public /* synthetic */ u(Function function, Function function2, Function function3, BinaryOperator binaryOperator, int i14) {
        this.f53521a = i14;
        this.f53522b = function;
        this.f53523c = function2;
        this.f53524d = function3;
        this.f53525e = binaryOperator;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f53521a) {
            case 0:
                TableCollectors.lambda$toTable$6(this.f53522b, this.f53523c, this.f53524d, this.f53525e, (Table) obj, obj2);
                break;
            default:
                TableCollectors.lambda$toImmutableTable$2(this.f53522b, this.f53523c, this.f53524d, this.f53525e, (TableCollectors.ImmutableTableCollectorState) obj, obj2);
                break;
        }
    }
}
