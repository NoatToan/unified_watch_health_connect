package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/compose/ComposeInfoWindowAdapter;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/MarkerNode;", "markerNodeFinder", "<init>", "(Lcom/google/android/gms/maps/MapView;Le23/l;)V", "marker", "Landroid/view/View;", "getInfoContents", "(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;", "getInfoWindow", "Lcom/google/android/gms/maps/MapView;", "Le23/l;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    public static final int $stable = 8;
    private final MapView mapView;
    private final e23.l<Marker, MarkerNode> markerNodeFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeInfoWindowAdapter(MapView mapView, e23.l<? super Marker, MarkerNode> lVar) {
        mapView.getClass();
        lVar.getClass();
        this.mapView = mapView;
        this.markerNodeFinder = lVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(final Marker marker) {
        final e23.q<Marker, p3.m, Integer, Unit> infoContent;
        marker.getClass();
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoContent = markerNodeInvoke.getInfoContent()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new z3.e(1508359207, true, new e23.p<p3.m, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$getInfoContents$view$1$1
            public final void invoke(p3.m mVar, int i14) {
                if ((i14 & 3) == 2 && mVar.b()) {
                    mVar.e();
                } else {
                    x1 x1Var = p3.n.f135158a;
                    infoContent.invoke(marker, mVar, 0);
                }
            }

            @Override // e23.p
            public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
                invoke(mVar, num.intValue());
                return Unit.INSTANCE;
            }
        }));
        MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(final Marker marker) {
        final e23.q<Marker, p3.m, Integer, Unit> infoWindow;
        marker.getClass();
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoWindow = markerNodeInvoke.getInfoWindow()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new z3.e(-742372995, true, new e23.p<p3.m, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$getInfoWindow$view$1$1
            public final void invoke(p3.m mVar, int i14) {
                if ((i14 & 3) == 2 && mVar.b()) {
                    mVar.e();
                } else {
                    x1 x1Var = p3.n.f135158a;
                    infoWindow.invoke(marker, mVar, 0);
                }
            }

            @Override // e23.p
            public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
                invoke(mVar, num.intValue());
                return Unit.INSTANCE;
            }
        }));
        MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }
}
