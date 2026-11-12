package com.google.maps.android.compose;

import com.google.android.gms.maps.model.TileOverlay;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileOverlay", "Lcom/google/maps/android/compose/TileOverlayState;", "tileOverlayState", "Lkotlin/Function1;", "", "onTileOverlayClick", "<init>", "(Lcom/google/android/gms/maps/model/TileOverlay;Lcom/google/maps/android/compose/TileOverlayState;Le23/l;)V", "onAttached", "()V", "onRemoved", "Lcom/google/android/gms/maps/model/TileOverlay;", "getTileOverlay", "()Lcom/google/android/gms/maps/model/TileOverlay;", "setTileOverlay", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "Lcom/google/maps/android/compose/TileOverlayState;", "getTileOverlayState", "()Lcom/google/maps/android/compose/TileOverlayState;", "setTileOverlayState", "(Lcom/google/maps/android/compose/TileOverlayState;)V", "Le23/l;", "getOnTileOverlayClick", "()Le23/l;", "setOnTileOverlayClick", "(Le23/l;)V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class TileOverlayNode implements MapNode {
    private e23.l<? super TileOverlay, Unit> onTileOverlayClick;
    private TileOverlay tileOverlay;
    private TileOverlayState tileOverlayState;

    public TileOverlayNode(TileOverlay tileOverlay, TileOverlayState tileOverlayState, e23.l<? super TileOverlay, Unit> lVar) {
        tileOverlay.getClass();
        tileOverlayState.getClass();
        lVar.getClass();
        this.tileOverlay = tileOverlay;
        this.tileOverlayState = tileOverlayState;
        this.onTileOverlayClick = lVar;
    }

    public final e23.l<TileOverlay, Unit> getOnTileOverlayClick() {
        return this.onTileOverlayClick;
    }

    public final TileOverlay getTileOverlay() {
        return this.tileOverlay;
    }

    public final TileOverlayState getTileOverlayState() {
        return this.tileOverlayState;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.tileOverlayState.setTileOverlay$maps_compose_release(this.tileOverlay);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        MapNode.DefaultImpls.onCleared(this);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.tileOverlay.remove();
    }

    public final void setOnTileOverlayClick(e23.l<? super TileOverlay, Unit> lVar) {
        lVar.getClass();
        this.onTileOverlayClick = lVar;
    }

    public final void setTileOverlay(TileOverlay tileOverlay) {
        tileOverlay.getClass();
        this.tileOverlay = tileOverlay;
    }

    public final void setTileOverlayState(TileOverlayState tileOverlayState) {
        tileOverlayState.getClass();
        this.tileOverlayState = tileOverlayState;
    }
}
