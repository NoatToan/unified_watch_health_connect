package com.google.maps.android.compose.clustering;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import q53.t;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1", f = "ClusterRenderer.kt", l = {126}, m = "invokeSuspend")
public final class ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ t<Unit> $$this$callbackFlow;
    final /* synthetic */ m0 $invalidated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1(t<? super Unit> tVar, m0 m0Var, t13.d<? super ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1> dVar) {
        super(2, dVar);
        this.$$this$callbackFlow = tVar;
        this.$invalidated = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1(this.$$this$callbackFlow, this.$invalidated, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            this.label = 1;
            if (p53.e.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        t<Unit> tVar = this.$$this$callbackFlow;
        Unit unit = Unit.INSTANCE;
        tVar.i(unit);
        this.$invalidated.f105804a = false;
        return unit;
    }
}
