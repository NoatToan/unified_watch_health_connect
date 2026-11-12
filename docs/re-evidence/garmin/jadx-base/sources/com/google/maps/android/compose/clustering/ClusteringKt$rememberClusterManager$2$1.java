package com.google.maps.android.compose.clustering;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.compose.ComposeUiViewRenderer;
import e23.p;
import e23.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.p1;
import p3.x3;
import r53.c2;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "", "<anonymous>", "(Lo53/b0;Lcom/google/android/gms/maps/GoogleMap;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterManager$2$1", f = "Clustering.kt", l = {}, m = "invokeSuspend")
public final class ClusteringKt$rememberClusterManager$2$1 extends i implements q<b0, GoogleMap, t13.d<? super Unit>, Object> {
    final /* synthetic */ x3<q<Cluster<T>, m, Integer, Unit>> $clusterContentState;
    final /* synthetic */ x3<q<T, m, Integer, Unit>> $clusterItemContentState;
    final /* synthetic */ p1<ClusterManager<T>> $clusterManagerState;
    final /* synthetic */ ClusterRenderer<T> $clusterRenderer;
    final /* synthetic */ Context $context;
    final /* synthetic */ x3<ComposeUiViewRenderer> $viewRendererState;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: renamed from: com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterManager$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.compose.clustering.ClusteringKt$rememberClusterManager$2$1$1", f = "Clustering.kt", l = {332}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ x3<q<Cluster<T>, m, Integer, Unit>> $clusterContentState;
        final /* synthetic */ x3<q<T, m, Integer, Unit>> $clusterItemContentState;
        final /* synthetic */ ClusterManager<T> $clusterManager;
        final /* synthetic */ ClusterRenderer<T> $clusterRenderer;
        final /* synthetic */ Context $context;
        final /* synthetic */ GoogleMap $map;
        final /* synthetic */ x3<ComposeUiViewRenderer> $viewRendererState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(x3<? extends q<? super Cluster<T>, ? super m, ? super Integer, Unit>> x3Var, x3<? extends q<? super T, ? super m, ? super Integer, Unit>> x3Var2, ClusterRenderer<T> clusterRenderer, Context context, GoogleMap googleMap, ClusterManager<T> clusterManager, x3<? extends ComposeUiViewRenderer> x3Var3, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$clusterContentState = x3Var;
            this.$clusterItemContentState = x3Var2;
            this.$clusterRenderer = clusterRenderer;
            this.$context = context;
            this.$map = googleMap;
            this.$clusterManager = clusterManager;
            this.$viewRendererState = x3Var3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(x3 x3Var, x3 x3Var2) {
            return (x3Var.getF182175a() == null && x3Var2.getF182175a() == null) ? false : true;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clusterContentState, this.$clusterItemContentState, this.$clusterRenderer, this.$context, this.$map, this.$clusterManager, this.$viewRendererState, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final b0 b0Var = (b0) this.L$0;
                c2 c2VarS = p0.s(new g(0, this.$clusterContentState, this.$clusterItemContentState));
                final ClusterRenderer<T> clusterRenderer = this.$clusterRenderer;
                final Context context = this.$context;
                final GoogleMap googleMap = this.$map;
                final ClusterManager<T> clusterManager = this.$clusterManager;
                final x3<ComposeUiViewRenderer> x3Var = this.$viewRendererState;
                final x3<q<Cluster<T>, m, Integer, Unit>> x3Var2 = this.$clusterContentState;
                final x3<q<T, m, Integer, Unit>> x3Var3 = this.$clusterItemContentState;
                j jVar = new j() { // from class: com.google.maps.android.compose.clustering.ClusteringKt.rememberClusterManager.2.1.1.2
                    public final Object emit(boolean z14, t13.d<? super Unit> dVar) {
                        ClusterRenderer<T> composeUiClusterRenderer = clusterRenderer;
                        if (composeUiClusterRenderer == null) {
                            composeUiClusterRenderer = z14 ? new ComposeUiClusterRenderer(context, b0Var, googleMap, clusterManager, x3Var, x3Var2, x3Var3) : new DefaultClusterRenderer(context, googleMap, clusterManager);
                        }
                        clusterManager.setRenderer(composeUiClusterRenderer);
                        return Unit.INSTANCE;
                    }

                    @Override // r53.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (t13.d<? super Unit>) dVar);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClusteringKt$rememberClusterManager$2$1(Context context, p1<ClusterManager<T>> p1Var, x3<? extends q<? super Cluster<T>, ? super m, ? super Integer, Unit>> x3Var, x3<? extends q<? super T, ? super m, ? super Integer, Unit>> x3Var2, ClusterRenderer<T> clusterRenderer, x3<? extends ComposeUiViewRenderer> x3Var3, t13.d<? super ClusteringKt$rememberClusterManager$2$1> dVar) {
        super(3, dVar);
        this.$context = context;
        this.$clusterManagerState = p1Var;
        this.$clusterContentState = x3Var;
        this.$clusterItemContentState = x3Var2;
        this.$clusterRenderer = clusterRenderer;
        this.$viewRendererState = x3Var3;
    }

    @Override // e23.q
    public final Object invoke(b0 b0Var, GoogleMap googleMap, t13.d<? super Unit> dVar) {
        ClusteringKt$rememberClusterManager$2$1 clusteringKt$rememberClusterManager$2$1 = new ClusteringKt$rememberClusterManager$2$1(this.$context, this.$clusterManagerState, this.$clusterContentState, this.$clusterItemContentState, this.$clusterRenderer, this.$viewRendererState, dVar);
        clusteringKt$rememberClusterManager$2$1.L$0 = b0Var;
        clusteringKt$rememberClusterManager$2$1.L$1 = googleMap;
        return clusteringKt$rememberClusterManager$2$1.invokeSuspend(Unit.INSTANCE);
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
        b0 b0Var = (b0) this.L$0;
        GoogleMap googleMap = (GoogleMap) this.L$1;
        ClusterManager clusterManager = new ClusterManager(this.$context, googleMap);
        ge1.b.T(b0Var, null, null, new AnonymousClass1(this.$clusterContentState, this.$clusterItemContentState, this.$clusterRenderer, this.$context, googleMap, clusterManager, this.$viewRendererState, null), 3);
        this.$clusterManagerState.setValue((ClusterManager<T>) clusterManager);
        return Unit.INSTANCE;
    }
}
