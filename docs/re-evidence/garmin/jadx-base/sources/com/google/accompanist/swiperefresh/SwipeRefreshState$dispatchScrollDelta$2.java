package com.google.accompanist.swiperefresh;

import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.b;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$dispatchScrollDelta$2", f = "SwipeRefresh.kt", l = {133}, m = "invokeSuspend")
public final class SwipeRefreshState$dispatchScrollDelta$2 extends i implements l<d<? super Unit>, Object> {
    final /* synthetic */ float $delta;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshState$dispatchScrollDelta$2(SwipeRefreshState swipeRefreshState, float f14, d<? super SwipeRefreshState$dispatchScrollDelta$2> dVar) {
        super(1, dVar);
        this.this$0 = swipeRefreshState;
        this.$delta = f14;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new SwipeRefreshState$dispatchScrollDelta$2(this.this$0, this.$delta, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super Unit> dVar) {
        return ((SwipeRefreshState$dispatchScrollDelta$2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            b bVar = this.this$0._indicatorOffset;
            Float f14 = new Float(((Number) this.this$0._indicatorOffset.e()).floatValue() + this.$delta);
            this.label = 1;
            if (bVar.g(f14, this) == aVar) {
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
