package com.google.accompanist.swiperefresh;

import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.b;
import s1.n;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls1/i;", "", "Ls1/n;", "<anonymous>", "()Ls1/i;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$animateOffsetTo$2", f = "SwipeRefresh.kt", l = {124}, m = "invokeSuspend")
public final class SwipeRefreshState$animateOffsetTo$2 extends i implements l<d<? super s1.i<Float, n>>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshState$animateOffsetTo$2(SwipeRefreshState swipeRefreshState, float f14, d<? super SwipeRefreshState$animateOffsetTo$2> dVar) {
        super(1, dVar);
        this.this$0 = swipeRefreshState;
        this.$offset = f14;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new SwipeRefreshState$animateOffsetTo$2(this.this$0, this.$offset, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super s1.i<Float, n>> dVar) {
        return ((SwipeRefreshState$animateOffsetTo$2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.this$0._indicatorOffset;
        Float f14 = new Float(this.$offset);
        this.label = 1;
        Object objC = b.c(bVar, f14, null, null, this, 14);
        return objC == aVar ? aVar : objC;
    }
}
