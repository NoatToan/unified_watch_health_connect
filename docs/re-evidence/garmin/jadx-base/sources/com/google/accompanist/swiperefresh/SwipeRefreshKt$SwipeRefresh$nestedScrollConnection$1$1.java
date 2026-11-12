package com.google.accompanist.swiperefresh;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.x3;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1 extends w implements a<Unit> {
    final /* synthetic */ x3<a<Unit>> $updatedOnRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1(x3<? extends a<Unit>> x3Var) {
        super(0);
        this.$updatedOnRefresh = x3Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$updatedOnRefresh.getF182175a().invoke();
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
