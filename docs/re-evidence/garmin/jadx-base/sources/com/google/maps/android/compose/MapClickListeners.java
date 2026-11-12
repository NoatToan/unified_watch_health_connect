package com.google.maps.android.compose;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bRG\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RG\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R;\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR;\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fRG\u0010*\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014RG\u0010/\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/google/maps/android/compose/MapClickListeners;", "", "<init>", "()V", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "<set-?>", "indoorStateChangeListener$delegate", "Lp3/p1;", "getIndoorStateChangeListener", "()Lcom/google/maps/android/compose/IndoorStateChangeListener;", "setIndoorStateChangeListener", "(Lcom/google/maps/android/compose/IndoorStateChangeListener;)V", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick$delegate", "getOnMapClick", "()Le23/l;", "setOnMapClick", "(Le23/l;)V", "onMapClick", "onMapLongClick$delegate", "getOnMapLongClick", "setOnMapLongClick", "onMapLongClick", "Lkotlin/Function0;", "onMapLoaded$delegate", "getOnMapLoaded", "()Le23/a;", "setOnMapLoaded", "(Le23/a;)V", "onMapLoaded", "", "onMyLocationButtonClick$delegate", "getOnMyLocationButtonClick", "setOnMyLocationButtonClick", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick$delegate", "getOnMyLocationClick", "setOnMyLocationClick", "onMyLocationClick", "Lcom/google/android/gms/maps/model/PointOfInterest;", "onPOIClick$delegate", "getOnPOIClick", "setOnPOIClick", "onPOIClick", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapClickListeners {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: indoorStateChangeListener$delegate, reason: from kotlin metadata */
    private final p1 indoorStateChangeListener = p3.p0.n(DefaultIndoorStateChangeListener.INSTANCE);

    /* JADX INFO: renamed from: onMapClick$delegate, reason: from kotlin metadata */
    private final p1 onMapClick = p3.p0.n(null);

    /* JADX INFO: renamed from: onMapLongClick$delegate, reason: from kotlin metadata */
    private final p1 onMapLongClick = p3.p0.n(null);

    /* JADX INFO: renamed from: onMapLoaded$delegate, reason: from kotlin metadata */
    private final p1 onMapLoaded = p3.p0.n(null);

    /* JADX INFO: renamed from: onMyLocationButtonClick$delegate, reason: from kotlin metadata */
    private final p1 onMyLocationButtonClick = p3.p0.n(null);

    /* JADX INFO: renamed from: onMyLocationClick$delegate, reason: from kotlin metadata */
    private final p1 onMyLocationClick = p3.p0.n(null);

    /* JADX INFO: renamed from: onPOIClick$delegate, reason: from kotlin metadata */
    private final p1 onPOIClick = p3.p0.n(null);

    public final IndoorStateChangeListener getIndoorStateChangeListener() {
        return (IndoorStateChangeListener) this.indoorStateChangeListener.getF182175a();
    }

    public final e23.l<LatLng, Unit> getOnMapClick() {
        return (e23.l) this.onMapClick.getF182175a();
    }

    public final e23.a<Unit> getOnMapLoaded() {
        return (e23.a) this.onMapLoaded.getF182175a();
    }

    public final e23.l<LatLng, Unit> getOnMapLongClick() {
        return (e23.l) this.onMapLongClick.getF182175a();
    }

    public final e23.a<Boolean> getOnMyLocationButtonClick() {
        return (e23.a) this.onMyLocationButtonClick.getF182175a();
    }

    public final e23.l<Location, Unit> getOnMyLocationClick() {
        return (e23.l) this.onMyLocationClick.getF182175a();
    }

    public final e23.l<PointOfInterest, Unit> getOnPOIClick() {
        return (e23.l) this.onPOIClick.getF182175a();
    }

    public final void setIndoorStateChangeListener(IndoorStateChangeListener indoorStateChangeListener) {
        indoorStateChangeListener.getClass();
        this.indoorStateChangeListener.setValue(indoorStateChangeListener);
    }

    public final void setOnMapClick(e23.l<? super LatLng, Unit> lVar) {
        this.onMapClick.setValue(lVar);
    }

    public final void setOnMapLoaded(e23.a<Unit> aVar) {
        this.onMapLoaded.setValue(aVar);
    }

    public final void setOnMapLongClick(e23.l<? super LatLng, Unit> lVar) {
        this.onMapLongClick.setValue(lVar);
    }

    public final void setOnMyLocationButtonClick(e23.a<Boolean> aVar) {
        this.onMyLocationButtonClick.setValue(aVar);
    }

    public final void setOnMyLocationClick(e23.l<? super Location, Unit> lVar) {
        this.onMyLocationClick.setValue(lVar);
    }

    public final void setOnPOIClick(e23.l<? super PointOfInterest, Unit> lVar) {
        this.onPOIClick.setValue(lVar);
    }
}
