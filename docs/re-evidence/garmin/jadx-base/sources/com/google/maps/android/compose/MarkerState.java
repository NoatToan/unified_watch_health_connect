package com.google.maps.android.compose;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R+\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R1\u0010\u001d\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR(\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/google/maps/android/compose/MarkerState;", "", "Lcom/google/android/gms/maps/model/LatLng;", ModelSourceWrapper.POSITION, "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "", "showInfoWindow", "()V", "hideInfoWindow", "<set-?>", "position$delegate", "Lp3/p1;", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "setPosition", "", "isDragging$delegate", "isDragging", "()Z", "setDragging$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/DragState;", "dragState$delegate", "getDragState", "()Lcom/google/maps/android/compose/DragState;", "setDragState$maps_compose_release", "(Lcom/google/maps/android/compose/DragState;)V", "getDragState$annotations", "dragState", "Lp3/p1;", "Lcom/google/android/gms/maps/model/Marker;", "markerState", "value", "getMarker$maps_compose_release", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker$maps_compose_release", "(Lcom/google/android/gms/maps/model/Marker;)V", "marker", "Companion", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarkerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d4.k<MarkerState, LatLng> Saver;

    /* JADX INFO: renamed from: dragState$delegate, reason: from kotlin metadata */
    private final p1 dragState;

    /* JADX INFO: renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final p1 isDragging;
    private final p1<Marker> markerState;

    /* JADX INFO: renamed from: position$delegate, reason: from kotlin metadata */
    private final p1 position;

    static {
        c0 c0Var = new c0(12);
        f0 f0Var = new f0(7);
        d4.l lVar = d4.m.f57455a;
        Saver = new d4.l(c0Var, f0Var);
    }

    private MarkerState(LatLng latLng) {
        this.position = p3.p0.n(latLng);
        this.isDragging = p3.p0.n(Boolean.FALSE);
        this.dragState = p3.p0.n(DragState.END);
        this.markerState = p3.p0.n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLng Saver$lambda$0(d4.n nVar, MarkerState markerState) {
        nVar.getClass();
        markerState.getClass();
        return markerState.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerState Saver$lambda$1(LatLng latLng) {
        latLng.getClass();
        return new MarkerState(latLng);
    }

    @o13.e
    public static /* synthetic */ void getDragState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DragState getDragState() {
        return (DragState) this.dragState.getF182175a();
    }

    public final Marker getMarker$maps_compose_release() {
        return this.markerState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LatLng getPosition() {
        return (LatLng) this.position.getF182175a();
    }

    public final void hideInfoWindow() {
        Marker marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.hideInfoWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging.getF182175a()).booleanValue();
    }

    public final void setDragState$maps_compose_release(DragState dragState) {
        dragState.getClass();
        this.dragState.setValue(dragState);
    }

    public final void setDragging$maps_compose_release(boolean z14) {
        this.isDragging.setValue(Boolean.valueOf(z14));
    }

    public final void setMarker$maps_compose_release(Marker marker) {
        if (this.markerState.getF182175a() == null && marker == null) {
            return;
        }
        if (this.markerState.getF182175a() == null || marker == null) {
            this.markerState.setValue(marker);
        } else {
            vb.h.z("MarkerState may only be associated with one Marker at a time.");
        }
    }

    public final void setPosition(LatLng latLng) {
        latLng.getClass();
        this.position.setValue(latLng);
    }

    public final void showInfoWindow() {
        Marker marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.showInfoWindow();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/MarkerState$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", ModelSourceWrapper.POSITION, "Lcom/google/maps/android/compose/MarkerState;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/compose/MarkerState;", "Ld4/k;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ MarkerState invoke$default(Companion companion, LatLng latLng, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                latLng = new LatLng(0.0d, 0.0d);
            }
            return companion.invoke(latLng);
        }

        public final d4.k<MarkerState, LatLng> getSaver() {
            return MarkerState.Saver;
        }

        public final MarkerState invoke(LatLng position) {
            position.getClass();
            return new MarkerState(position, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MarkerState(LatLng latLng, p005kotlin.jvm.internal.j jVar) {
        this(latLng);
    }
}
