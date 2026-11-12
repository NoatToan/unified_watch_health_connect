package com.google.accompanist.swiperefresh;

import e23.l;
import j23.t;
import o4.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.p1;
import s1.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1 extends w implements l<t0, Unit> {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ float $indicatorRefreshTrigger;
    final /* synthetic */ p1<Float> $offset$delegate;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ SwipeRefreshState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1(int i14, boolean z14, SwipeRefreshState swipeRefreshState, float f14, p1<Float> p1Var) {
        super(1);
        this.$indicatorHeight = i14;
        this.$scale = z14;
        this.$state = swipeRefreshState;
        this.$indicatorRefreshTrigger = f14;
        this.$offset$delegate = p1Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t0 t0Var) {
        t0Var.getClass();
        t0Var.q(SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$4(this.$offset$delegate) - this.$indicatorHeight);
        float fD = 1.0f;
        if (this.$scale && !this.$state.isRefreshing()) {
            float fSwipeRefreshIndicator__UAkqwU$lambda$4 = SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$4(this.$offset$delegate);
            float f14 = this.$indicatorRefreshTrigger;
            if (f14 < 1.0f) {
                f14 = 1.0f;
            }
            fD = t.d(e0.f155561b.a(fSwipeRefreshIndicator__UAkqwU$lambda$4 / f14), 0.0f, 1.0f);
        }
        t0Var.v(fD);
        t0Var.w(fD);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(t0 t0Var) {
        invoke2(t0Var);
        return Unit.INSTANCE;
    }
}
