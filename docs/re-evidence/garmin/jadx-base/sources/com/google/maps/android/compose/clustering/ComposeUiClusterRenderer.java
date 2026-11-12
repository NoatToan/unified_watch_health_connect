package com.google.maps.android.compose.clustering;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.compose.ComposeUiViewRenderer;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p13.a1;
import p13.d0;
import p13.h0;
import p3.m;
import p3.n;
import p3.x1;
import p3.x3;
import q53.t;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0003:;<By\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012 \u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\f\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\f¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u00020\u00112\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00112\u0006\u0010,\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u001b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer;", "Lcom/google/maps/android/clustering/ClusterItem;", "T", "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/clustering/ClusterManager;", "clusterManager", "Lp3/x3;", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "viewRendererState", "Lkotlin/Function1;", "Lcom/google/maps/android/clustering/Cluster;", "", "clusterContentState", "clusterItemContentState", "<init>", "(Landroid/content/Context;Lo53/b0;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;Lp3/x3;Lp3/x3;Lp3/x3;)V", "", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;", "computeViewKeys", "(Lcom/google/maps/android/clustering/Cluster;)Ljava/util/Set;", Action.KEY_ATTRIBUTE, "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewInfo;", "createAndAddView", "(Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;)Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewInfo;", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$InvalidatingComposeView;", "view", "collectInvalidationsAndRerender", "(Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$InvalidatingComposeView;Lt13/d;)Ljava/lang/Object;", "Li5/a;", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "renderViewToBitmapDescriptor", "(Li5/a;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "clusters", "onClustersChanged", "(Ljava/util/Set;)V", "cluster", "getDescriptorForCluster", "(Lcom/google/maps/android/clustering/Cluster;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "onBeforeClusterItemRendered", "(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V", "Landroid/content/Context;", "Lo53/b0;", "Lp3/x3;", "Landroid/graphics/Canvas;", "fakeCanvas", "Landroid/graphics/Canvas;", "", "keysToViews", "Ljava/util/Map;", "ViewKey", "ViewInfo", "InvalidatingComposeView", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeUiClusterRenderer<T extends ClusterItem> extends DefaultClusterRenderer<T> {
    public static final int $stable = 8;
    private final x3<q<Cluster<T>, m, Integer, Unit>> clusterContentState;
    private final x3<q<T, m, Integer, Unit>> clusterItemContentState;
    private final Context context;
    private final Canvas fakeCanvas;
    private final Map<ViewKey<T>, ViewInfo> keysToViews;
    private final b0 scope;
    private final x3<ComposeUiViewRenderer> viewRendererState;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$InvalidatingComposeView;", "Li5/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Landroid/content/Context;Le23/p;)V", "Content", "(Lp3/m;I)V", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "Le23/p;", "onInvalidate", "Le23/a;", "getOnInvalidate", "()Le23/a;", "setOnInvalidate", "(Le23/a;)V", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidatingComposeView extends kotlin.a {
        private final p<m, Integer, Unit> content;
        private e23.a<Unit> onInvalidate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidatingComposeView(Context context, p<? super m, ? super Integer, Unit> pVar) {
            super(context, null, 0, 6, null);
            context.getClass();
            pVar.getClass();
            this.content = pVar;
        }

        @Override // kotlin.a
        public void Content(m mVar, int i14) {
            mVar.C(77023790);
            x1 x1Var = n.f135158a;
            this.content.invoke(mVar, 0);
            mVar.f();
        }

        public final e23.a<Unit> getOnInvalidate() {
            return this.onInvalidate;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void onDescendantInvalidated(View child, View target) {
            child.getClass();
            target.getClass();
            super.onDescendantInvalidated(child, target);
            e23.a<Unit> aVar = this.onInvalidate;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void setOnInvalidate(e23.a<Unit> aVar) {
            this.onInvalidate = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewInfo;", "", "Li5/a;", "view", "Lkotlin/Function0;", "", "onRemove", "<init>", "(Li5/a;Le23/a;)V", "Li5/a;", "getView", "()Li5/a;", "Le23/a;", "getOnRemove", "()Le23/a;", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewInfo {
        private final e23.a<Unit> onRemove;
        private final kotlin.a view;

        public ViewInfo(kotlin.a aVar, e23.a<Unit> aVar2) {
            aVar.getClass();
            aVar2.getClass();
            this.view = aVar;
            this.onRemove = aVar2;
        }

        public final e23.a<Unit> getOnRemove() {
            return this.onRemove;
        }

        public final kotlin.a getView() {
            return this.view;
        }
    }

    /* JADX INFO: renamed from: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$2", f = "ClusterRenderer.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {
        final /* synthetic */ InvalidatingComposeView $view;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InvalidatingComposeView invalidatingComposeView, t13.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$view = invalidatingComposeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(m0 m0Var, t tVar) {
            if (!m0Var.f105804a) {
                ge1.b.T(tVar, null, null, new ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$1$1(tVar, m0Var, null), 3);
                m0Var.f105804a = true;
            }
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$view, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e23.p
        public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$view.setOnInvalidate(new g(1, new m0(), tVar));
                final InvalidatingComposeView invalidatingComposeView = this.$view;
                if (!invalidatingComposeView.isAttachedToWindow()) {
                    invalidatingComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view2) {
                            invalidatingComposeView.removeOnAttachStateChangeListener(this);
                            ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView2 = invalidatingComposeView;
                            boolean zIsAttachedToWindow = invalidatingComposeView2.isAttachedToWindow();
                            t tVar2 = tVar;
                            if (zIsAttachedToWindow) {
                                invalidatingComposeView2.addOnAttachStateChangeListener(new ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$2$$inlined$doOnDetach$1(invalidatingComposeView2, tVar2));
                            } else {
                                tVar2.q(null);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view2) {
                        }
                    });
                } else if (invalidatingComposeView.isAttachedToWindow()) {
                    invalidatingComposeView.addOnAttachStateChangeListener(new ComposeUiClusterRenderer$collectInvalidationsAndRerender$2$invokeSuspend$lambda$2$$inlined$doOnDetach$1(invalidatingComposeView, tVar));
                } else {
                    tVar.q(null);
                }
                this.label = 1;
                if (q53.r.a(tVar, new q53.q(0), this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$collectInvalidationsAndRerender$3", f = "ClusterRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p<Unit, t13.d<? super Unit>, Object> {
        final /* synthetic */ ViewKey<T> $key;
        final /* synthetic */ InvalidatingComposeView $view;
        int label;
        final /* synthetic */ ComposeUiClusterRenderer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ViewKey<T> viewKey, ComposeUiClusterRenderer<T> composeUiClusterRenderer, InvalidatingComposeView invalidatingComposeView, t13.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$key = viewKey;
            this.this$0 = composeUiClusterRenderer;
            this.$view = invalidatingComposeView;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass3(this.$key, this.this$0, this.$view, dVar);
        }

        @Override // e23.p
        public final Object invoke(Unit unit, t13.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(unit, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Marker marker;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ViewKey<T> viewKey = this.$key;
            if (viewKey instanceof ViewKey.Cluster) {
                marker = this.this$0.getMarker(((ViewKey.Cluster) viewKey).getCluster());
            } else {
                if (!(viewKey instanceof ViewKey.Item)) {
                    u0.r();
                    return null;
                }
                marker = this.this$0.getMarker(((ViewKey.Item) viewKey).getItem());
            }
            if (marker != null) {
                marker.setIcon(this.this$0.renderViewToBitmapDescriptor(this.$view));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeUiClusterRenderer(Context context, b0 b0Var, GoogleMap googleMap, ClusterManager<T> clusterManager, x3<? extends ComposeUiViewRenderer> x3Var, x3<? extends q<? super Cluster<T>, ? super m, ? super Integer, Unit>> x3Var2, x3<? extends q<? super T, ? super m, ? super Integer, Unit>> x3Var3) {
        super(context, googleMap, clusterManager);
        context.getClass();
        b0Var.getClass();
        googleMap.getClass();
        clusterManager.getClass();
        x3Var.getClass();
        x3Var2.getClass();
        x3Var3.getClass();
        this.context = context;
        this.scope = b0Var;
        this.viewRendererState = x3Var;
        this.clusterContentState = x3Var2;
        this.clusterItemContentState = x3Var3;
        this.fakeCanvas = new Canvas();
        this.keysToViews = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectInvalidationsAndRerender(ViewKey<T> viewKey, InvalidatingComposeView invalidatingComposeView, t13.d<? super Unit> dVar) {
        Object objK = s.k(s.f(new AnonymousClass2(invalidatingComposeView, null)), new AnonymousClass3(viewKey, this, invalidatingComposeView, null), dVar);
        return objK == u13.a.COROUTINE_SUSPENDED ? objK : Unit.INSTANCE;
    }

    private final Set<ViewKey<T>> computeViewKeys(Cluster<T> cluster) {
        if (shouldRenderAsCluster(cluster)) {
            return a1.b(new ViewKey.Cluster(cluster));
        }
        Collection<T> items = cluster.getItems();
        items.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t7 : items) {
            t7.getClass();
            linkedHashSet.add(new ViewKey.Item(t7));
        }
        return linkedHashSet;
    }

    private final ViewInfo createAndAddView(final ViewKey<T> key) {
        z3.e eVar;
        Context context = this.context;
        if (key instanceof ViewKey.Cluster) {
            eVar = new z3.e(-231222560, true, new p<m, Integer, Unit>(this) { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$createAndAddView$view$1
                final /* synthetic */ ComposeUiClusterRenderer<T> this$0;

                {
                    this.this$0 = this;
                }

                public final void invoke(m mVar, int i14) {
                    if ((i14 & 3) == 2 && mVar.b()) {
                        mVar.e();
                        return;
                    }
                    x1 x1Var = n.f135158a;
                    q qVar = (q) ((ComposeUiClusterRenderer) this.this$0).clusterContentState.getF182175a();
                    if (qVar == null) {
                        return;
                    }
                    qVar.invoke(((ComposeUiClusterRenderer.ViewKey.Cluster) key).getCluster(), mVar, 0);
                }

                @Override // e23.p
                public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
                    invoke(mVar, num.intValue());
                    return Unit.INSTANCE;
                }
            });
        } else {
            if (!(key instanceof ViewKey.Item)) {
                u0.r();
                return null;
            }
            eVar = new z3.e(-1883693097, true, new p<m, Integer, Unit>(this) { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$createAndAddView$view$2
                final /* synthetic */ ComposeUiClusterRenderer<T> this$0;

                {
                    this.this$0 = this;
                }

                public final void invoke(m mVar, int i14) {
                    if ((i14 & 3) == 2 && mVar.b()) {
                        mVar.e();
                        return;
                    }
                    x1 x1Var = n.f135158a;
                    q qVar = (q) ((ComposeUiClusterRenderer) this.this$0).clusterItemContentState.getF182175a();
                    if (qVar == null) {
                        return;
                    }
                    qVar.invoke(((ComposeUiClusterRenderer.ViewKey.Item) key).getItem(), mVar, 0);
                }

                @Override // e23.p
                public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
                    invoke(mVar, num.intValue());
                    return Unit.INSTANCE;
                }
            });
        }
        InvalidatingComposeView invalidatingComposeView = new InvalidatingComposeView(context, eVar);
        int i14 = 2;
        ViewInfo viewInfo = new ViewInfo(invalidatingComposeView, new g(i14, ge1.b.T(this.scope, null, null, new ComposeUiClusterRenderer$createAndAddView$rerenderJob$1(this, key, invalidatingComposeView, null), 3), this.viewRendererState.getF182175a().startRenderingView(invalidatingComposeView)));
        this.keysToViews.put(key, viewInfo);
        return viewInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createAndAddView$lambda$5(l1 l1Var, ComposeUiViewRenderer.RenderHandle renderHandle) {
        l1Var.c(null);
        renderHandle.dispose();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BitmapDescriptor renderViewToBitmapDescriptor(kotlin.a view2) {
        view2.draw(this.fakeCanvas);
        ViewParent parent = view2.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888));
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        Integer numValueOf = Integer.valueOf(view2.getMeasuredWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        Integer numValueOf2 = Integer.valueOf(view2.getMeasuredHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, num != null ? num.intValue() : 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        view2.draw(new Canvas(bitmapCreateBitmap));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
        bitmapDescriptorFromBitmap.getClass();
        return bitmapDescriptorFromBitmap;
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public BitmapDescriptor getDescriptorForCluster(Cluster<T> cluster) {
        Object obj;
        ViewInfo viewInfoCreateAndAddView;
        cluster.getClass();
        if (this.clusterContentState.getF182175a() == null) {
            BitmapDescriptor descriptorForCluster = super.getDescriptorForCluster(cluster);
            descriptorForCluster.getClass();
            return descriptorForCluster;
        }
        Iterator<T> it = this.keysToViews.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ViewKey viewKey = (ViewKey) ((Map.Entry) next).getKey();
            ViewKey.Cluster cluster2 = viewKey instanceof ViewKey.Cluster ? (ViewKey.Cluster) viewKey : null;
            if (p005kotlin.jvm.internal.s.g(cluster2 != null ? cluster2.getCluster() : null, cluster)) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (viewInfoCreateAndAddView = (ViewInfo) entry.getValue()) == null) {
            viewInfoCreateAndAddView = createAndAddView((ViewKey) h0.a0(computeViewKeys(cluster)));
        }
        return renderViewToBitmapDescriptor(viewInfoCreateAndAddView.getView());
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public void onBeforeClusterItemRendered(T item, MarkerOptions markerOptions) {
        Object obj;
        ViewInfo viewInfoCreateAndAddView;
        item.getClass();
        markerOptions.getClass();
        super.onBeforeClusterItemRendered(item, markerOptions);
        if (this.clusterItemContentState.getF182175a() != null) {
            Iterator<T> it = this.keysToViews.entrySet().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ViewKey viewKey = (ViewKey) ((Map.Entry) next).getKey();
                ViewKey.Item item2 = viewKey instanceof ViewKey.Item ? (ViewKey.Item) viewKey : null;
                if (p005kotlin.jvm.internal.s.g(item2 != null ? item2.getItem() : null, item)) {
                    obj = next;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (viewInfoCreateAndAddView = (ViewInfo) entry.getValue()) == null) {
                viewInfoCreateAndAddView = createAndAddView(new ViewKey.Item(item));
            }
            markerOptions.icon(renderViewToBitmapDescriptor(viewInfoCreateAndAddView.getView()));
        }
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer, com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> clusters) {
        clusters.getClass();
        super.onClustersChanged(clusters);
        ArrayList<ViewKey<T>> arrayList = new ArrayList();
        Iterator<T> it = clusters.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, computeViewKeys((Cluster) it.next()));
        }
        Iterator<Map.Entry<ViewKey<T>, ViewInfo>> it3 = this.keysToViews.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<ViewKey<T>, ViewInfo> next = it3.next();
            ViewKey<T> key = next.getKey();
            ViewInfo value = next.getValue();
            if (!arrayList.contains(key)) {
                it3.remove();
                value.getOnRemove().invoke();
            }
        }
        for (ViewKey<T> viewKey : arrayList) {
            if (!this.keysToViews.keySet().contains(viewKey)) {
                createAndAddView(viewKey);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;", "T", "Lcom/google/maps/android/clustering/ClusterItem;", "", "<init>", "()V", "Cluster", "Item", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey$Cluster;", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey$Item;", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewKey<T extends ClusterItem> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005HÆ\u0003J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey$Cluster;", "T", "Lcom/google/maps/android/clustering/ClusterItem;", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;", "cluster", "Lcom/google/maps/android/clustering/Cluster;", "<init>", "(Lcom/google/maps/android/clustering/Cluster;)V", "getCluster", "()Lcom/google/maps/android/clustering/Cluster;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Cluster<T extends ClusterItem> extends ViewKey<T> {
            public static final int $stable = 8;
            private final com.google.maps.android.clustering.Cluster<T> cluster;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cluster(com.google.maps.android.clustering.Cluster<T> cluster) {
                super(null);
                cluster.getClass();
                this.cluster = cluster;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Cluster copy$default(Cluster cluster, com.google.maps.android.clustering.Cluster cluster2, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    cluster2 = cluster.cluster;
                }
                return cluster.copy(cluster2);
            }

            public final com.google.maps.android.clustering.Cluster<T> component1() {
                return this.cluster;
            }

            public final Cluster<T> copy(com.google.maps.android.clustering.Cluster<T> cluster) {
                cluster.getClass();
                return new Cluster<>(cluster);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cluster) && p005kotlin.jvm.internal.s.g(this.cluster, ((Cluster) other).cluster);
            }

            public final com.google.maps.android.clustering.Cluster<T> getCluster() {
                return this.cluster;
            }

            public int hashCode() {
                return this.cluster.hashCode();
            }

            public String toString() {
                return "Cluster(cluster=" + this.cluster + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey$Item;", "T", "Lcom/google/maps/android/clustering/ClusterItem;", "Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey;", "item", "<init>", "(Lcom/google/maps/android/clustering/ClusterItem;)V", "getItem", "()Lcom/google/maps/android/clustering/ClusterItem;", "Lcom/google/maps/android/clustering/ClusterItem;", "component1", "copy", "(Lcom/google/maps/android/clustering/ClusterItem;)Lcom/google/maps/android/compose/clustering/ComposeUiClusterRenderer$ViewKey$Item;", "equals", "", "other", "", "hashCode", "", "toString", "", "maps-compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Item<T extends ClusterItem> extends ViewKey<T> {
            public static final int $stable = 0;
            private final T item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(T t7) {
                super(null);
                t7.getClass();
                this.item = t7;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Item copy$default(Item item, ClusterItem clusterItem, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    clusterItem = item.item;
                }
                return item.copy(clusterItem);
            }

            public final T component1() {
                return this.item;
            }

            public final Item<T> copy(T item) {
                item.getClass();
                return new Item<>(item);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Item) && p005kotlin.jvm.internal.s.g(this.item, ((Item) other).item);
            }

            public final T getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "Item(item=" + this.item + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ ViewKey(j jVar) {
            this();
        }

        private ViewKey() {
        }
    }
}
