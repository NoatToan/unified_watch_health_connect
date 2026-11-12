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
@e(c = "com.google.accompanist.swiperefresh.SwipeRefreshNestedScrollConnection$onScroll$1", f = "SwipeRefresh.kt", l = {185}, m = "invokeSuspend")
public final class SwipeRefreshNestedScrollConnection$onScroll$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ float $dragConsumed;
    int label;
    final /* synthetic */ SwipeRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshNestedScrollConnection$onScroll$1(SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection, float f14, d<? super SwipeRefreshNestedScrollConnection$onScroll$1> dVar) {
        super(2, dVar);
        this.this$0 = swipeRefreshNestedScrollConnection;
        this.$dragConsumed = f14;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwipeRefreshNestedScrollConnection$onScroll$1(this.this$0, this.$dragConsumed, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((SwipeRefreshNestedScrollConnection$onScroll$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            SwipeRefreshState swipeRefreshState = this.this$0.state;
            float f14 = this.$dragConsumed;
            this.label = 1;
            if (swipeRefreshState.dispatchScrollDelta$swiperefresh_release(f14, this) == aVar) {
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
}
