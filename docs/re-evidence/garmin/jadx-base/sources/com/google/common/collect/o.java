package com.google.common.collect;

import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class o implements ToIntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53513a;

    public /* synthetic */ o(int i14) {
        this.f53513a = i14;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f53513a) {
            case 0:
                return ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
            default:
                return ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj);
        }
    }
}
