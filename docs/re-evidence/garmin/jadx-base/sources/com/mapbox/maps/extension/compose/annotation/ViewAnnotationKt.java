package com.mapbox.maps.extension.compose.annotation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapView;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.R;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import e23.a;
import e23.p;
import h4.r;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import vb.h;
import z3.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "Lh4/r;", "modifier", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "onUpdatedListener", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "ViewAnnotation", "(Lcom/mapbox/maps/ViewAnnotationOptions;Lh4/r;Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;Le23/p;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.ViewAnnotationKt$ViewAnnotation$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements a<ViewAnnotationNode> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ p<m, Integer, Unit> $content;
        final /* synthetic */ p3.p $currentComposeContext;
        final /* synthetic */ x3<ViewAnnotationOptions> $currentOptions;
        final /* synthetic */ MapApplier $mapApplier;
        final /* synthetic */ r $modifier;
        final /* synthetic */ OnViewAnnotationUpdatedListener $onUpdatedListener;
        final /* synthetic */ ViewAnnotationOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MapApplier mapApplier, ViewAnnotationOptions viewAnnotationOptions, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, p3.p pVar, r rVar, x3<ViewAnnotationOptions> x3Var, p<? super m, ? super Integer, Unit> pVar2, int i14) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$options = viewAnnotationOptions;
            this.$onUpdatedListener = onViewAnnotationUpdatedListener;
            this.$currentComposeContext = pVar;
            this.$modifier = rVar;
            this.$currentOptions = x3Var;
            this.$content = pVar2;
            this.$$dirty = i14;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final ViewAnnotationNode invoke() {
            MapView mapView;
            ViewAnnotationManager viewAnnotationManager;
            MapApplier mapApplier = this.$mapApplier;
            if (mapApplier == null || (mapView = mapApplier.getMapView()) == null || (viewAnnotationManager = mapView.getViewAnnotationManager()) == null) {
                h.z("Error adding view annotation");
                return null;
            }
            Context context = this.$mapApplier.getMapView().getContext();
            context.getClass();
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            p3.p pVar = this.$currentComposeContext;
            r rVar = this.$modifier;
            x3<ViewAnnotationOptions> x3Var = this.$currentOptions;
            p<m, Integer, Unit> pVar2 = this.$content;
            int i14 = this.$$dirty;
            composeView.setViewCompositionStrategy(w3.d.f91628b);
            composeView.setParentCompositionContext(pVar);
            composeView.setContent(new e(1492306979, true, new ViewAnnotationKt$ViewAnnotation$1$1$1(rVar, viewAnnotationManager, composeView, x3Var, pVar2, i14)));
            composeView.setTag(R.id.composeView, "");
            viewAnnotationManager.addViewAnnotation(composeView, this.$options);
            return new ViewAnnotationNode(viewAnnotationManager, composeView, this.$onUpdatedListener);
        }
    }

    @MapboxMapComposable
    public static final void ViewAnnotation(ViewAnnotationOptions viewAnnotationOptions, r rVar, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        viewAnnotationOptions.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-431625500);
        c<?> cVar = o0VarE.f135177b;
        if ((i15 & 2) != 0) {
            rVar = r.S;
        }
        r rVar2 = rVar;
        OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener2 = (i15 & 4) != 0 ? null : onViewAnnotationUpdatedListener;
        x1 x1Var = n.f135158a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar instanceof MapApplier ? (MapApplier) cVar : null, viewAnnotationOptions, onViewAnnotationUpdatedListener2, o0VarE.g(), rVar2, p0.q(viewAnnotationOptions, o0VarE), pVar, i14);
        o0VarE.L(1886828752);
        if (!(cVar instanceof MapApplier)) {
            p0.l();
            throw null;
        }
        o0VarE.H();
        if (o0VarE.T) {
            o0VarE.M(new ViewAnnotationKt$ViewAnnotation$$inlined$ComposeNode$1(anonymousClass1));
        } else {
            o0VarE.c();
        }
        b4.d(new ViewAnnotationKt$ViewAnnotation$2$1(viewAnnotationOptions), viewAnnotationOptions, o0VarE);
        b4.d(ViewAnnotationKt$ViewAnnotation$2$2.INSTANCE, pVar, o0VarE);
        b4.d(ViewAnnotationKt$ViewAnnotation$2$3.INSTANCE, onViewAnnotationUpdatedListener2, o0VarE);
        o0VarE.g0(true);
        o0VarE.g0(false);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass3(viewAnnotationOptions, rVar2, onViewAnnotationUpdatedListener2, pVar, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.ViewAnnotationKt$ViewAnnotation$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<m, Integer, Unit> $content;
        final /* synthetic */ r $modifier;
        final /* synthetic */ OnViewAnnotationUpdatedListener $onUpdatedListener;
        final /* synthetic */ ViewAnnotationOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ViewAnnotationOptions viewAnnotationOptions, r rVar, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.$options = viewAnnotationOptions;
            this.$modifier = rVar;
            this.$onUpdatedListener = onViewAnnotationUpdatedListener;
            this.$content = pVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            ViewAnnotationKt.ViewAnnotation(this.$options, this.$modifier, this.$onUpdatedListener, this.$content, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
