package com.mapbox.common;

import e23.l;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LifecycleService$lifecycleState$1 extends w implements l<LifecycleState, Unit> {
    final /* synthetic */ CountDownLatch $latch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleService$lifecycleState$1(CountDownLatch countDownLatch) {
        super(1);
        this.$latch = countDownLatch;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LifecycleState lifecycleState) {
        lifecycleState.getClass();
        this.$latch.countDown();
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
        invoke2(lifecycleState);
        return Unit.INSTANCE;
    }
}
