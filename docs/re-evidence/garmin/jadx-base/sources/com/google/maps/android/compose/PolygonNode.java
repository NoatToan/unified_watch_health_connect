package com.google.maps.android.compose;

import com.google.android.gms.maps.model.Polygon;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/PolygonNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/Polygon;", "polygon", "Lkotlin/Function1;", "", "onPolygonClick", "<init>", "(Lcom/google/android/gms/maps/model/Polygon;Le23/l;)V", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/Polygon;", "getPolygon", "()Lcom/google/android/gms/maps/model/Polygon;", "Le23/l;", "getOnPolygonClick", "()Le23/l;", "setOnPolygonClick", "(Le23/l;)V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PolygonNode implements MapNode {
    public static final int $stable = 8;
    private e23.l<? super Polygon, Unit> onPolygonClick;
    private final Polygon polygon;

    public PolygonNode(Polygon polygon, e23.l<? super Polygon, Unit> lVar) {
        polygon.getClass();
        lVar.getClass();
        this.polygon = polygon;
        this.onPolygonClick = lVar;
    }

    public final e23.l<Polygon, Unit> getOnPolygonClick() {
        return this.onPolygonClick;
    }

    public final Polygon getPolygon() {
        return this.polygon;
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
        this.polygon.remove();
    }

    public final void setOnPolygonClick(e23.l<? super Polygon, Unit> lVar) {
        lVar.getClass();
        this.onPolygonClick = lVar;
    }
}
