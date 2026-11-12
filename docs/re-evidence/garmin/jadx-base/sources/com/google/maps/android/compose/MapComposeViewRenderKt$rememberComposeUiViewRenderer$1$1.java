package com.google.maps.android.compose;

import android.view.View;
import com.google.android.gms.maps.MapView;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/google/maps/android/compose/MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "Li5/a;", "view", "Lkotlin/Function0;", "", "onAddedToWindow", "renderViewOnce", "(Li5/a;Le23/a;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingView", "(Li5/a;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 implements ComposeUiViewRenderer {
    final /* synthetic */ p3.p $compositionContext;
    final /* synthetic */ MapView $mapView;

    public MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(MapView mapView, p3.p pVar) {
        this.$mapView = mapView;
        this.$compositionContext = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderViewOnce$lambda$1$lambda$0(e23.a aVar, View view2) {
        view2.getClass();
        aVar.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public void renderViewOnce(kotlin.a view2, e23.a<Unit> onAddedToWindow) {
        view2.getClass();
        MapComposeViewRenderKt.renderComposeViewOnce(this.$mapView, view2, onAddedToWindow != null ? new a03.h0(onAddedToWindow, 15) : null, this.$compositionContext);
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public ComposeUiViewRenderer.RenderHandle startRenderingView(kotlin.a view2) {
        view2.getClass();
        return MapComposeViewRenderKt.startRenderingComposeView(this.$mapView, view2, this.$compositionContext);
    }
}
