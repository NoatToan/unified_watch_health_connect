package com.google.maps.android.compose;

import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b/\b\u0001\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/google/maps/android/compose/InputHandlerNode;", "Lcom/google/maps/android/compose/MapNode;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "", "onCircleClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polyline;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;)V", "<set-?>", "onCircleClick$delegate", "Lp3/p1;", "getOnCircleClick", "()Le23/l;", "setOnCircleClick", "(Le23/l;)V", "onGroundOverlayClick$delegate", "getOnGroundOverlayClick", "setOnGroundOverlayClick", "onPolygonClick$delegate", "getOnPolygonClick", "setOnPolygonClick", "onPolylineClick$delegate", "getOnPolylineClick", "setOnPolylineClick", "onMarkerClick$delegate", "getOnMarkerClick", "setOnMarkerClick", "onInfoWindowClick$delegate", "getOnInfoWindowClick", "setOnInfoWindowClick", "onInfoWindowClose$delegate", "getOnInfoWindowClose", "setOnInfoWindowClose", "onInfoWindowLongClick$delegate", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "onMarkerDrag$delegate", "getOnMarkerDrag", "setOnMarkerDrag", "onMarkerDragEnd$delegate", "getOnMarkerDragEnd", "setOnMarkerDragEnd", "onMarkerDragStart$delegate", "getOnMarkerDragStart", "setOnMarkerDragStart", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InputHandlerNode implements MapNode {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: onCircleClick$delegate, reason: from kotlin metadata */
    private final p1 onCircleClick;

    /* JADX INFO: renamed from: onGroundOverlayClick$delegate, reason: from kotlin metadata */
    private final p1 onGroundOverlayClick;

    /* JADX INFO: renamed from: onInfoWindowClick$delegate, reason: from kotlin metadata */
    private final p1 onInfoWindowClick;

    /* JADX INFO: renamed from: onInfoWindowClose$delegate, reason: from kotlin metadata */
    private final p1 onInfoWindowClose;

    /* JADX INFO: renamed from: onInfoWindowLongClick$delegate, reason: from kotlin metadata */
    private final p1 onInfoWindowLongClick;

    /* JADX INFO: renamed from: onMarkerClick$delegate, reason: from kotlin metadata */
    private final p1 onMarkerClick;

    /* JADX INFO: renamed from: onMarkerDrag$delegate, reason: from kotlin metadata */
    private final p1 onMarkerDrag;

    /* JADX INFO: renamed from: onMarkerDragEnd$delegate, reason: from kotlin metadata */
    private final p1 onMarkerDragEnd;

    /* JADX INFO: renamed from: onMarkerDragStart$delegate, reason: from kotlin metadata */
    private final p1 onMarkerDragStart;

    /* JADX INFO: renamed from: onPolygonClick$delegate, reason: from kotlin metadata */
    private final p1 onPolygonClick;

    /* JADX INFO: renamed from: onPolylineClick$delegate, reason: from kotlin metadata */
    private final p1 onPolylineClick;

    public /* synthetic */ InputHandlerNode(e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.l lVar6, e23.l lVar7, e23.l lVar8, e23.l lVar9, e23.l lVar10, e23.l lVar11, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : lVar2, (i14 & 4) != 0 ? null : lVar3, (i14 & 8) != 0 ? null : lVar4, (i14 & 16) != 0 ? null : lVar5, (i14 & 32) != 0 ? null : lVar6, (i14 & 64) != 0 ? null : lVar7, (i14 & 128) != 0 ? null : lVar8, (i14 & 256) != 0 ? null : lVar9, (i14 & 512) != 0 ? null : lVar10, (i14 & 1024) != 0 ? null : lVar11);
    }

    public final e23.l<Circle, Unit> getOnCircleClick() {
        return (e23.l) this.onCircleClick.getF182175a();
    }

    public final e23.l<GroundOverlay, Unit> getOnGroundOverlayClick() {
        return (e23.l) this.onGroundOverlayClick.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnInfoWindowClick() {
        return (e23.l) this.onInfoWindowClick.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnInfoWindowClose() {
        return (e23.l) this.onInfoWindowClose.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnInfoWindowLongClick() {
        return (e23.l) this.onInfoWindowLongClick.getF182175a();
    }

    public final e23.l<Marker, Boolean> getOnMarkerClick() {
        return (e23.l) this.onMarkerClick.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnMarkerDrag() {
        return (e23.l) this.onMarkerDrag.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnMarkerDragEnd() {
        return (e23.l) this.onMarkerDragEnd.getF182175a();
    }

    public final e23.l<Marker, Unit> getOnMarkerDragStart() {
        return (e23.l) this.onMarkerDragStart.getF182175a();
    }

    public final e23.l<Polygon, Unit> getOnPolygonClick() {
        return (e23.l) this.onPolygonClick.getF182175a();
    }

    public final e23.l<Polyline, Unit> getOnPolylineClick() {
        return (e23.l) this.onPolylineClick.getF182175a();
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
        MapNode.DefaultImpls.onRemoved(this);
    }

    public final void setOnCircleClick(e23.l<? super Circle, Unit> lVar) {
        this.onCircleClick.setValue(lVar);
    }

    public final void setOnGroundOverlayClick(e23.l<? super GroundOverlay, Unit> lVar) {
        this.onGroundOverlayClick.setValue(lVar);
    }

    public final void setOnInfoWindowClick(e23.l<? super Marker, Unit> lVar) {
        this.onInfoWindowClick.setValue(lVar);
    }

    public final void setOnInfoWindowClose(e23.l<? super Marker, Unit> lVar) {
        this.onInfoWindowClose.setValue(lVar);
    }

    public final void setOnInfoWindowLongClick(e23.l<? super Marker, Unit> lVar) {
        this.onInfoWindowLongClick.setValue(lVar);
    }

    public final void setOnMarkerClick(e23.l<? super Marker, Boolean> lVar) {
        this.onMarkerClick.setValue(lVar);
    }

    public final void setOnMarkerDrag(e23.l<? super Marker, Unit> lVar) {
        this.onMarkerDrag.setValue(lVar);
    }

    public final void setOnMarkerDragEnd(e23.l<? super Marker, Unit> lVar) {
        this.onMarkerDragEnd.setValue(lVar);
    }

    public final void setOnMarkerDragStart(e23.l<? super Marker, Unit> lVar) {
        this.onMarkerDragStart.setValue(lVar);
    }

    public final void setOnPolygonClick(e23.l<? super Polygon, Unit> lVar) {
        this.onPolygonClick.setValue(lVar);
    }

    public final void setOnPolylineClick(e23.l<? super Polyline, Unit> lVar) {
        this.onPolylineClick.setValue(lVar);
    }

    public InputHandlerNode(e23.l<? super Circle, Unit> lVar, e23.l<? super GroundOverlay, Unit> lVar2, e23.l<? super Polygon, Unit> lVar3, e23.l<? super Polyline, Unit> lVar4, e23.l<? super Marker, Boolean> lVar5, e23.l<? super Marker, Unit> lVar6, e23.l<? super Marker, Unit> lVar7, e23.l<? super Marker, Unit> lVar8, e23.l<? super Marker, Unit> lVar9, e23.l<? super Marker, Unit> lVar10, e23.l<? super Marker, Unit> lVar11) {
        this.onCircleClick = p3.p0.n(lVar);
        this.onGroundOverlayClick = p3.p0.n(lVar2);
        this.onPolygonClick = p3.p0.n(lVar3);
        this.onPolylineClick = p3.p0.n(lVar4);
        this.onMarkerClick = p3.p0.n(lVar5);
        this.onInfoWindowClick = p3.p0.n(lVar6);
        this.onInfoWindowClose = p3.p0.n(lVar7);
        this.onInfoWindowLongClick = p3.p0.n(lVar8);
        this.onMarkerDrag = p3.p0.n(lVar9);
        this.onMarkerDragEnd = p3.p0.n(lVar10);
        this.onMarkerDragStart = p3.p0.n(lVar11);
    }

    public InputHandlerNode() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
