package com.google.maps.android.compose;

import com.google.android.gms.maps.model.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/¨\u00062"}, d2 = {"Lcom/google/maps/android/compose/MarkerNode;", "Lcom/google/maps/android/compose/MapNode;", "Lp3/p;", "compositionContext", "Lcom/google/android/gms/maps/model/Marker;", "marker", "Lcom/google/maps/android/compose/MarkerState;", "markerState", "Lkotlin/Function1;", "", "onMarkerClick", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "infoWindow", "infoContent", "<init>", "(Lp3/p;Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/compose/MarkerState;Le23/l;Le23/l;Le23/l;Le23/l;Le23/q;Le23/q;)V", "onAttached", "()V", "onRemoved", "onCleared", "Lp3/p;", "getCompositionContext", "()Lp3/p;", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/MarkerState;", "getMarkerState", "()Lcom/google/maps/android/compose/MarkerState;", "Le23/l;", "getOnMarkerClick", "()Le23/l;", "setOnMarkerClick", "(Le23/l;)V", "getOnInfoWindowClick", "setOnInfoWindowClick", "getOnInfoWindowClose", "setOnInfoWindowClose", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "Le23/q;", "getInfoWindow", "()Le23/q;", "setInfoWindow", "(Le23/q;)V", "getInfoContent", "setInfoContent", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarkerNode implements MapNode {
    public static final int $stable = 8;
    private final p3.p compositionContext;
    private e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> infoContent;
    private e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> infoWindow;
    private final Marker marker;
    private final MarkerState markerState;
    private e23.l<? super Marker, Unit> onInfoWindowClick;
    private e23.l<? super Marker, Unit> onInfoWindowClose;
    private e23.l<? super Marker, Unit> onInfoWindowLongClick;
    private e23.l<? super Marker, Boolean> onMarkerClick;

    public MarkerNode(p3.p pVar, Marker marker, MarkerState markerState, e23.l<? super Marker, Boolean> lVar, e23.l<? super Marker, Unit> lVar2, e23.l<? super Marker, Unit> lVar3, e23.l<? super Marker, Unit> lVar4, e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> qVar, e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> qVar2) {
        pVar.getClass();
        marker.getClass();
        markerState.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        this.compositionContext = pVar;
        this.marker = marker;
        this.markerState = markerState;
        this.onMarkerClick = lVar;
        this.onInfoWindowClick = lVar2;
        this.onInfoWindowClose = lVar3;
        this.onInfoWindowLongClick = lVar4;
        this.infoWindow = qVar;
        this.infoContent = qVar2;
    }

    public final p3.p getCompositionContext() {
        return this.compositionContext;
    }

    public final e23.q<Marker, p3.m, Integer, Unit> getInfoContent() {
        return this.infoContent;
    }

    public final e23.q<Marker, p3.m, Integer, Unit> getInfoWindow() {
        return this.infoWindow;
    }

    public final Marker getMarker() {
        return this.marker;
    }

    public final MarkerState getMarkerState() {
        return this.markerState;
    }

    public final e23.l<Marker, Unit> getOnInfoWindowClick() {
        return this.onInfoWindowClick;
    }

    public final e23.l<Marker, Unit> getOnInfoWindowClose() {
        return this.onInfoWindowClose;
    }

    public final e23.l<Marker, Unit> getOnInfoWindowLongClick() {
        return this.onInfoWindowLongClick;
    }

    public final e23.l<Marker, Boolean> getOnMarkerClick() {
        return this.onMarkerClick;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.markerState.setMarker$maps_compose_release(this.marker);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }

    public final void setInfoContent(e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> qVar) {
        this.infoContent = qVar;
    }

    public final void setInfoWindow(e23.q<? super Marker, ? super p3.m, ? super Integer, Unit> qVar) {
        this.infoWindow = qVar;
    }

    public final void setOnInfoWindowClick(e23.l<? super Marker, Unit> lVar) {
        lVar.getClass();
        this.onInfoWindowClick = lVar;
    }

    public final void setOnInfoWindowClose(e23.l<? super Marker, Unit> lVar) {
        lVar.getClass();
        this.onInfoWindowClose = lVar;
    }

    public final void setOnInfoWindowLongClick(e23.l<? super Marker, Unit> lVar) {
        lVar.getClass();
        this.onInfoWindowLongClick = lVar;
    }

    public final void setOnMarkerClick(e23.l<? super Marker, Boolean> lVar) {
        lVar.getClass();
        this.onMarkerClick = lVar;
    }
}
