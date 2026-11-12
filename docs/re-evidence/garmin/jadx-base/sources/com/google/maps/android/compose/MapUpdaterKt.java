package com.google.maps.android.compose;

import android.annotation.SuppressLint;
import c2.h2;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import kotlin.t1;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/MapUpdaterState;", "mapUpdaterState", "", "MapUpdater", "(Lcom/google/maps/android/compose/MapUpdaterState;Lp3/m;I)V", "Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lc2/h2;", "contentPadding", "applyContentPadding", "(Lcom/google/maps/android/compose/MapPropertiesNode;Lcom/google/android/gms/maps/GoogleMap;Lc2/h2;)V", "DefaultMapContentPadding", "Lc2/h2;", "getDefaultMapContentPadding", "()Lc2/h2;", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapUpdaterKt {
    private static final h2 DefaultMapContentPadding = c2.l.c(0.0f, 0.0f, 3);

    /* JADX WARN: Code duplicated, block: B:9:0x0065  */
    @SuppressLint({"MissingPermission"})
    public static final void MapUpdater(MapUpdaterState mapUpdaterState, p3.m mVar, int i14) {
        mapUpdaterState.getClass();
        mVar.C(-2039993954);
        p3.c<?> cVarF = mVar.F();
        cVarF.getClass();
        GoogleMap map = ((MapApplier) cVarF).getMap();
        p3.c<?> cVarF2 = mVar.F();
        cVarF2.getClass();
        MapView mapView$maps_compose_release = ((MapApplier) cVarF2).getMapView();
        if (mapUpdaterState.getMergeDescendants()) {
            mapView$maps_compose_release.setImportantForAccessibility(4);
        }
        g6.c cVar = (g6.c) mVar.A(t1.f91490h);
        g6.o oVar = (g6.o) mVar.A(t1.f91496n);
        mVar.C(-513396093);
        boolean zB = mVar.B(mapUpdaterState) | mVar.r(map) | mVar.B(cVar) | mVar.B(oVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, cVar, oVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, cVar, oVar);
                mVar.K(objQ);
            }
        }
        e23.a aVar = (e23.a) objQ;
        mVar.f();
        if (!(mVar.F() instanceof MapApplier)) {
            p3.p0.l();
            throw null;
        }
        mVar.H();
        if (mVar.getT()) {
            mVar.M(aVar);
        } else {
            mVar.c();
        }
        b4.d(MapUpdaterKt$MapUpdater$1$2$1.INSTANCE, cVar, mVar);
        b4.d(MapUpdaterKt$MapUpdater$1$2$2.INSTANCE, oVar, mVar);
        b4.d(MapUpdaterKt$MapUpdater$1$2$3.INSTANCE, mapUpdaterState.getContentDescription(), mVar);
        b4.d(new MapUpdaterKt$MapUpdater$1$2$4(map), mapUpdaterState.getContentPadding(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$5(map), mapUpdaterState.getLocationSource(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$6(map), Boolean.valueOf(mapUpdaterState.getMapProperties().getIsBuildingEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$7(map), Boolean.valueOf(mapUpdaterState.getMapProperties().getIsIndoorEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$8(map), Boolean.valueOf(mapUpdaterState.getMapProperties().getIsMyLocationEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$9(map), Boolean.valueOf(mapUpdaterState.getMapProperties().getIsTrafficEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$10(map), mapUpdaterState.getMapProperties().getLatLngBoundsForCameraTarget(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$11(map), mapUpdaterState.getMapProperties().getMapStyleOptions(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$12(map), mapUpdaterState.getMapProperties().getMapType(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$13(map), Float.valueOf(mapUpdaterState.getMapProperties().getMaxZoomPreference()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$14(map), Float.valueOf(mapUpdaterState.getMapProperties().getMinZoomPreference()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$15(map), mapUpdaterState.getMapColorScheme(), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$16(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getCompassEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$17(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getIndoorLevelPickerEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$18(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMapToolbarEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$19(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMyLocationButtonEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$20(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getRotationGesturesEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$21(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$22(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabledDuringRotateOrZoom()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$23(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getTiltGesturesEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$24(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomControlsEnabled()), mVar);
        b4.c(new MapUpdaterKt$MapUpdater$1$2$25(map), Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomGesturesEnabled()), mVar);
        b4.d(MapUpdaterKt$MapUpdater$1$2$26.INSTANCE, mapUpdaterState.getCameraPositionState(), mVar);
        mVar.y();
        mVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyContentPadding(MapPropertiesNode mapPropertiesNode, GoogleMap googleMap, h2 h2Var) {
        g6.c density = mapPropertiesNode.getDensity();
        googleMap.setPadding(density.f0(h2Var.b(mapPropertiesNode.getLayoutDirection())), density.f0(h2Var.getF22737b()), density.f0(h2Var.c(mapPropertiesNode.getLayoutDirection())), density.f0(h2Var.getF22739d()));
    }

    public static final h2 getDefaultMapContentPadding() {
        return DefaultMapContentPadding;
    }
}
