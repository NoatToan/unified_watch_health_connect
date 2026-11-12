package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.MapView;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Li5/a;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "", "onAddedToWindow", "Lp3/p;", "parentContext", "renderComposeViewOnce", "(Lcom/google/android/gms/maps/MapView;Li5/a;Le23/l;Lp3/p;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingComposeView", "(Lcom/google/android/gms/maps/MapView;Li5/a;Lp3/p;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Lcom/google/maps/android/compose/NoDrawContainerView;", "ensureContainerView", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/NoDrawContainerView;", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "rememberComposeUiViewRenderer", "(Lp3/m;I)Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapComposeViewRenderKt {
    private static final NoDrawContainerView ensureContainerView(MapView mapView) {
        int i14 = R.id.maps_compose_nodraw_container_view;
        NoDrawContainerView noDrawContainerView = (NoDrawContainerView) mapView.findViewById(i14);
        if (noDrawContainerView != null) {
            return noDrawContainerView;
        }
        Context context = mapView.getContext();
        context.getClass();
        NoDrawContainerView noDrawContainerView2 = new NoDrawContainerView(context);
        noDrawContainerView2.setId(i14);
        mapView.addView(noDrawContainerView2);
        return noDrawContainerView2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    public static final ComposeUiViewRenderer rememberComposeUiViewRenderer(p3.m mVar, int i14) {
        mVar.C(124209494);
        x1 x1Var = p3.n.f135158a;
        p3.c<?> cVarF = mVar.F();
        cVarF.getClass();
        MapView mapView = ((MapApplier) cVarF).getMapView();
        p3.o0.b bVarG = mVar.g();
        mVar.C(1287412339);
        boolean zB = mVar.B(bVarG);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(mapView, bVarG);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(mapView, bVarG);
                mVar.K(objQ);
            }
        }
        MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 = (MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1) objQ;
        mVar.f();
        mVar.f();
        return mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;
    }

    public static final void renderComposeViewOnce(MapView mapView, kotlin.a aVar, e23.l<? super View, Unit> lVar, p3.p pVar) {
        mapView.getClass();
        aVar.getClass();
        pVar.getClass();
        ComposeUiViewRenderer.RenderHandle renderHandleStartRenderingComposeView = startRenderingComposeView(mapView, aVar, pVar);
        if (lVar != null) {
            try {
                lVar.invoke(aVar);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(renderHandleStartRenderingComposeView, th3);
                    throw th4;
                }
            }
        }
        jg.b.l(renderHandleStartRenderingComposeView, null);
    }

    public static /* synthetic */ void renderComposeViewOnce$default(MapView mapView, kotlin.a aVar, e23.l lVar, p3.p pVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        renderComposeViewOnce(mapView, aVar, lVar, pVar);
    }

    public static final ComposeUiViewRenderer.RenderHandle startRenderingComposeView(MapView mapView, final kotlin.a aVar, p3.p pVar) {
        mapView.getClass();
        aVar.getClass();
        pVar.getClass();
        final NoDrawContainerView noDrawContainerViewEnsureContainerView = ensureContainerView(mapView);
        noDrawContainerViewEnsureContainerView.addView(aVar);
        aVar.setParentCompositionContext(pVar);
        return new ComposeUiViewRenderer.RenderHandle() { // from class: com.google.maps.android.compose.MapComposeViewRenderKt.startRenderingComposeView.2
            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ComposeUiViewRenderer.RenderHandle.DefaultImpls.close(this);
            }

            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle
            public void dispose() {
                noDrawContainerViewEnsureContainerView.removeView(aVar);
            }
        };
    }
}
