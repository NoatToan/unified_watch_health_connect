package com.google.maps.android.compose;

import com.google.android.gms.maps.model.GroundOverlay;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "groundOverlay", "Lkotlin/Function1;", "", "onGroundOverlayClick", "<init>", "(Lcom/google/android/gms/maps/model/GroundOverlay;Le23/l;)V", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/GroundOverlay;", "getGroundOverlay", "()Lcom/google/android/gms/maps/model/GroundOverlay;", "Le23/l;", "getOnGroundOverlayClick", "()Le23/l;", "setOnGroundOverlayClick", "(Le23/l;)V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroundOverlayNode implements MapNode {
    public static final int $stable = 8;
    private final GroundOverlay groundOverlay;
    private e23.l<? super GroundOverlay, Unit> onGroundOverlayClick;

    public GroundOverlayNode(GroundOverlay groundOverlay, e23.l<? super GroundOverlay, Unit> lVar) {
        groundOverlay.getClass();
        lVar.getClass();
        this.groundOverlay = groundOverlay;
        this.onGroundOverlayClick = lVar;
    }

    public final GroundOverlay getGroundOverlay() {
        return this.groundOverlay;
    }

    public final e23.l<GroundOverlay, Unit> getOnGroundOverlayClick() {
        return this.onGroundOverlayClick;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        MapNode.DefaultImpls.onAttached(this);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        MapNode.DefaultImpls.onCleared(this);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.groundOverlay.remove();
    }

    public final void setOnGroundOverlayClick(e23.l<? super GroundOverlay, Unit> lVar) {
        lVar.getClass();
        this.onGroundOverlayClick = lVar;
    }
}
