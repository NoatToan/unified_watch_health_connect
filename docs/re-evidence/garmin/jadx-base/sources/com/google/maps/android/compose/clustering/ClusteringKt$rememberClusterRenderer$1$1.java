package com.google.maps.android.compose.clustering;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
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
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterRenderer$1$1", f = "Clustering.kt", l = {}, m = "invokeSuspend")
public final class ClusteringKt$rememberClusterRenderer$1$1 extends i implements q<b0, GoogleMap, t13.d<? super Unit>, Object> {
    final /* synthetic */ ClusterManager<T> $clusterManager;
    final /* synthetic */ p1<ClusterRenderer<T>> $clusterRendererState;
    final /* synthetic */ Context $context;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusteringKt$rememberClusterRenderer$1$1(Context context, ClusterManager<T> clusterManager, p1<ClusterRenderer<T>> p1Var, t13.d<? super ClusteringKt$rememberClusterRenderer$1$1> dVar) {
        super(3, dVar);
        this.$context = context;
        this.$clusterManager = clusterManager;
        this.$clusterRendererState = p1Var;
    }

    @Override // e23.q
    public final Object invoke(b0 b0Var, GoogleMap googleMap, t13.d<? super Unit> dVar) {
        ClusteringKt$rememberClusterRenderer$1$1 clusteringKt$rememberClusterRenderer$1$1 = new ClusteringKt$rememberClusterRenderer$1$1(this.$context, this.$clusterManager, this.$clusterRendererState, dVar);
        clusteringKt$rememberClusterRenderer$1$1.L$0 = googleMap;
        return clusteringKt$rememberClusterRenderer$1$1.invokeSuspend(Unit.INSTANCE);
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
        this.$clusterRendererState.setValue(new DefaultClusterRenderer(this.$context, (GoogleMap) this.L$0, this.$clusterManager));
        return Unit.INSTANCE;
    }
}
