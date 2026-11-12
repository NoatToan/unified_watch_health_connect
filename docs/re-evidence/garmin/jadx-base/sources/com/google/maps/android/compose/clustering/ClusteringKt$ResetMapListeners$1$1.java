package com.google.maps.android.compose.clustering;

import android.os.Handler;
import android.os.Looper;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$ResetMapListeners$1$1", f = "Clustering.kt", l = {}, m = "invokeSuspend")
public final class ClusteringKt$ResetMapListeners$1$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ e23.a<Unit> $reattach;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusteringKt$ResetMapListeners$1$1(e23.a<Unit> aVar, t13.d<? super ClusteringKt$ResetMapListeners$1$1> dVar) {
        super(2, dVar);
        this.$reattach = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ClusteringKt$ResetMapListeners$1$1(this.$reattach, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ClusteringKt$ResetMapListeners$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        Handler handler = new Handler(Looper.getMainLooper());
        final e23.a<Unit> aVar2 = this.$reattach;
        handler.post(new Runnable() { // from class: com.google.maps.android.compose.clustering.f
            @Override // java.lang.Runnable
            public final void run() {
                aVar2.invoke();
            }
        });
        return Unit.INSTANCE;
    }
}
