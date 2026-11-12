package com.google.maps.android.compose.clustering;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.compose.ComposeUiViewRenderer;
import e23.q;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.p1;
import p3.x3;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "", "<anonymous>", "(Lo53/b0;Lcom/google/android/gms/maps/GoogleMap;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterRenderer$2$1", f = "Clustering.kt", l = {296}, m = "invokeSuspend")
public final class ClusteringKt$rememberClusterRenderer$2$1 extends i implements q<b0, GoogleMap, t13.d<? super Unit>, Object> {
    final /* synthetic */ x3<q<Cluster<T>, m, Integer, Unit>> $clusterContentState;
    final /* synthetic */ x3<q<T, m, Integer, Unit>> $clusterItemContentState;
    final /* synthetic */ ClusterManager<T> $clusterManager;
    final /* synthetic */ p1<ClusterRenderer<T>> $clusterRendererState;
    final /* synthetic */ Context $context;
    final /* synthetic */ x3<ComposeUiViewRenderer> $viewRendererState;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClusteringKt$rememberClusterRenderer$2$1(Context context, ClusterManager<T> clusterManager, x3<? extends ComposeUiViewRenderer> x3Var, x3<? extends q<? super Cluster<T>, ? super m, ? super Integer, Unit>> x3Var2, x3<? extends q<? super T, ? super m, ? super Integer, Unit>> x3Var3, p1<ClusterRenderer<T>> p1Var, t13.d<? super ClusteringKt$rememberClusterRenderer$2$1> dVar) {
        super(3, dVar);
        this.$context = context;
        this.$clusterManager = clusterManager;
        this.$viewRendererState = x3Var;
        this.$clusterContentState = x3Var2;
        this.$clusterItemContentState = x3Var3;
        this.$clusterRendererState = p1Var;
    }

    @Override // e23.q
    public final Object invoke(b0 b0Var, GoogleMap googleMap, t13.d<? super Unit> dVar) {
        ClusteringKt$rememberClusterRenderer$2$1 clusteringKt$rememberClusterRenderer$2$1 = new ClusteringKt$rememberClusterRenderer$2$1(this.$context, this.$clusterManager, this.$viewRendererState, this.$clusterContentState, this.$clusterItemContentState, this.$clusterRendererState, dVar);
        clusteringKt$rememberClusterRenderer$2$1.L$0 = b0Var;
        clusteringKt$rememberClusterRenderer$2$1.L$1 = googleMap;
        return clusteringKt$rememberClusterRenderer$2$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            this.$clusterRendererState.setValue(new ComposeUiClusterRenderer(this.$context, (b0) this.L$0, (GoogleMap) this.L$1, this.$clusterManager, this.$viewRendererState, this.$clusterContentState, this.$clusterItemContentState));
            this.L$0 = null;
            this.label = 1;
            if (m0.a(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
