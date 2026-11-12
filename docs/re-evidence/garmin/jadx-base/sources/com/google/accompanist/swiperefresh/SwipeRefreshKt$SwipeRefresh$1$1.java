package com.google.accompanist.swiperefresh;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$1$1", f = "SwipeRefresh.kt", l = {281}, m = "invokeSuspend")
public final class SwipeRefreshKt$SwipeRefresh$1$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshKt$SwipeRefresh$1$1(SwipeRefreshState swipeRefreshState, d<? super SwipeRefreshKt$SwipeRefresh$1$1> dVar) {
        super(2, dVar);
        this.$state = swipeRefreshState;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwipeRefreshKt$SwipeRefresh$1$1(this.$state, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((SwipeRefreshKt$SwipeRefresh$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            if (!this.$state.isSwipeInProgress()) {
                SwipeRefreshState swipeRefreshState = this.$state;
                this.label = 1;
                if (swipeRefreshState.animateOffsetTo$swiperefresh_release(0.0f, this) == aVar) {
                    return aVar;
                }
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
}
