package com.google.maps.android.compose.clustering;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import e23.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "", "<anonymous>", "(Lo53/b0;Lcom/google/android/gms/maps/GoogleMap;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterManager$1$1", f = "Clustering.kt", l = {}, m = "invokeSuspend")
public final class ClusteringKt$rememberClusterManager$1$1 extends i implements q<b0, GoogleMap, t13.d<? super Unit>, Object> {
    final /* synthetic */ p1<ClusterManager<T>> $clusterManagerState;
    final /* synthetic */ Context $context;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusteringKt$rememberClusterManager$1$1(p1<ClusterManager<T>> p1Var, Context context, t13.d<? super ClusteringKt$rememberClusterManager$1$1> dVar) {
        super(3, dVar);
        this.$clusterManagerState = p1Var;
        this.$context = context;
    }

    @Override // e23.q
    public final Object invoke(b0 b0Var, GoogleMap googleMap, t13.d<? super Unit> dVar) {
        ClusteringKt$rememberClusterManager$1$1 clusteringKt$rememberClusterManager$1$1 = new ClusteringKt$rememberClusterManager$1$1(this.$clusterManagerState, this.$context, dVar);
        clusteringKt$rememberClusterManager$1$1.L$0 = googleMap;
        return clusteringKt$rememberClusterManager$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        this.$clusterManagerState.setValue((ClusterManager<T>) new ClusterManager(this.$context, (GoogleMap) this.L$0));
        return Unit.INSTANCE;
    }
}
