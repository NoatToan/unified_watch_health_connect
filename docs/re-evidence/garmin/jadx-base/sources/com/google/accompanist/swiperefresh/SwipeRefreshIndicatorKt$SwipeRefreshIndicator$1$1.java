package com.google.accompanist.swiperefresh;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.p1;
import s1.q1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1", f = "SwipeRefreshIndicator.kt", l = {148}, m = "invokeSuspend")
public final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ p1<Float> $offset$delegate;
    final /* synthetic */ float $refreshingOffsetPx;
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(SwipeRefreshState swipeRefreshState, int i14, float f14, p1<Float> p1Var, d<? super SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1> dVar) {
        super(2, dVar);
        this.$state = swipeRefreshState;
        this.$indicatorHeight = i14;
        this.$refreshingOffsetPx = f14;
        this.$offset$delegate = p1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(this.$state, this.$indicatorHeight, this.$refreshingOffsetPx, this.$offset$delegate, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            float fSwipeRefreshIndicator__UAkqwU$lambda$4 = SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$4(this.$offset$delegate);
            float f14 = this.$state.isRefreshing() ? this.$indicatorHeight + this.$refreshingOffsetPx : 0.0f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$offset$delegate);
            this.label = 1;
            if (q1.c(fSwipeRefreshIndicator__UAkqwU$lambda$4, f14, null, anonymousClass1, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "value", "", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<Float, Float, Unit> {
        final /* synthetic */ p1<Float> $offset$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p1<Float> p1Var) {
            super(2);
            this.$offset$delegate = p1Var;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(Float f14, Float f15) {
            invoke(f14.floatValue(), f15.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f14, float f15) {
            SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$5(this.$offset$delegate, f14);
        }
    }
}
