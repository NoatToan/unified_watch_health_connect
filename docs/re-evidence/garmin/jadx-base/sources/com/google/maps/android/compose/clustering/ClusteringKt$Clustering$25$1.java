package com.google.maps.android.compose.clustering;

import com.google.maps.android.clustering.ClusterManager;
import e23.p;
import java.util.Collection;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.p0;
import p3.x3;
import r53.c2;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$Clustering$25$1", f = "Clustering.kt", l = {231}, m = "invokeSuspend")
public final class ClusteringKt$Clustering$25$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ ClusterManager<T> $clusterManager;
    final /* synthetic */ x3<Collection<T>> $itemsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClusteringKt$Clustering$25$1(x3<? extends Collection<? extends T>> x3Var, ClusterManager<T> clusterManager, t13.d<? super ClusteringKt$Clustering$25$1> dVar) {
        super(2, dVar);
        this.$itemsState = x3Var;
        this.$clusterManager = clusterManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(x3 x3Var) {
        return h0.b1((Iterable) x3Var.getF182175a());
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ClusteringKt$Clustering$25$1(this.$itemsState, this.$clusterManager, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ClusteringKt$Clustering$25$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            c2 c2VarS = p0.s(new e(this.$itemsState, 1));
            final ClusterManager<T> clusterManager = this.$clusterManager;
            j jVar = new j() { // from class: com.google.maps.android.compose.clustering.ClusteringKt$Clustering$25$1.2
                public final Object emit(List<? extends T> list, t13.d<? super Unit> dVar) {
                    clusterManager.clearItems();
                    clusterManager.addItems(list);
                    clusterManager.cluster();
                    return Unit.INSTANCE;
                }

                @Override // r53.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                    return emit((List) obj2, (t13.d<? super Unit>) dVar);
                }
            };
            this.label = 1;
            if (c2VarS.collect(jVar, this) == aVar) {
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
