package me2;

import android.graphics.Bitmap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class z {
    public static final boolean a(float f14, LatLng latLng, LatLng latLng2) {
        latLng.getClass();
        latLng2.getClass();
        if (f14 < 0.0f) {
            f14 = 1.0E-6f;
        }
        double d14 = f14;
        return Math.abs(latLng.latitude - latLng2.latitude) <= d14 && Math.abs(latLng.longitude - latLng2.longitude) <= d14;
    }

    public static com.garmin.android.library.mapsdkadapter.f b(LatLng latLng) {
        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        latLng.getClass();
        dVar.getClass();
        return new com.garmin.android.library.mapsdkadapter.f(latLng, dVar);
    }

    public static final Cap c(ie2.d dVar) {
        dVar.getClass();
        if (dVar instanceof ie2.d.a) {
            return new ButtCap();
        }
        if (dVar instanceof ie2.d.c) {
            return new RoundCap();
        }
        if (dVar instanceof ie2.d.C1784d) {
            return new SquareCap();
        }
        if (!(dVar instanceof ie2.d.b)) {
            u0.r();
            return null;
        }
        ie2.d.b bVar = (ie2.d.b) dVar;
        Bitmap bitmap = bVar.f93116a;
        return bitmap != null ? new CustomCap(BitmapDescriptorFactory.fromBitmap(bitmap), bVar.f93117b) : new RoundCap();
    }

    public static final LatLng d(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        LatLng latLng = fVar.f50283a;
        if (fVar.f50284b != com.garmin.android.library.mapsdkadapter.i.b.WGS84 || !com.garmin.android.library.mapsdkadapter.m.f(latLng)) {
            return latLng;
        }
        ie2.f.f93122a.getClass();
        return ie2.f.b(latLng);
    }

    public static final LatLng e(com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        fVar.getClass();
        LatLng latLng = fVar.f50283a;
        bVar.getClass();
        if (fVar.f50284b != com.garmin.android.library.mapsdkadapter.i.b.WGS84 || bVar != com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
            return latLng;
        }
        ie2.f.f93122a.getClass();
        return ie2.f.b(latLng);
    }

    public static final GoogleMapOptions f(ie2.l lVar) {
        CameraPosition cameraPositionBuild;
        lVar.getClass();
        com.garmin.android.library.mapsdkadapter.f fVar = lVar.f93138c;
        if (fVar != null) {
            CameraPosition.Builder builderTarget = new CameraPosition.Builder().target(d(fVar));
            float f14 = lVar.f93139d;
            if (f14 > 0.0f) {
                builderTarget.zoom(f14);
            }
            cameraPositionBuild = builderTarget.build();
        } else {
            cameraPositionBuild = null;
        }
        GoogleMapOptions googleMapOptionsCamera = new GoogleMapOptions().mapType(lVar.f93136a).liteMode(lVar.f93137b).camera(cameraPositionBuild);
        Boolean compassEnabled = googleMapOptionsCamera.getCompassEnabled();
        if (compassEnabled != null) {
            googleMapOptionsCamera.compassEnabled(compassEnabled.booleanValue());
        }
        Boolean scrollGesturesEnabled = googleMapOptionsCamera.getScrollGesturesEnabled();
        if (scrollGesturesEnabled != null) {
            googleMapOptionsCamera.scrollGesturesEnabled(scrollGesturesEnabled.booleanValue());
        }
        Boolean rotateGesturesEnabled = googleMapOptionsCamera.getRotateGesturesEnabled();
        if (rotateGesturesEnabled != null) {
            googleMapOptionsCamera.rotateGesturesEnabled(rotateGesturesEnabled.booleanValue());
        }
        Boolean zoomControlsEnabled = googleMapOptionsCamera.getZoomControlsEnabled();
        if (zoomControlsEnabled != null) {
            googleMapOptionsCamera.zoomControlsEnabled(zoomControlsEnabled.booleanValue());
        }
        Boolean zoomGesturesEnabled = googleMapOptionsCamera.getZoomGesturesEnabled();
        if (zoomGesturesEnabled != null) {
            googleMapOptionsCamera.zoomGesturesEnabled(zoomGesturesEnabled.booleanValue());
        }
        Boolean tiltGesturesEnabled = googleMapOptionsCamera.getTiltGesturesEnabled();
        if (tiltGesturesEnabled != null) {
            googleMapOptionsCamera.tiltGesturesEnabled(tiltGesturesEnabled.booleanValue());
        }
        Boolean mapToolbarEnabled = googleMapOptionsCamera.getMapToolbarEnabled();
        if (mapToolbarEnabled != null) {
            googleMapOptionsCamera.mapToolbarEnabled(mapToolbarEnabled.booleanValue());
        }
        return googleMapOptionsCamera;
    }

    public static final MarkerOptions g(com.garmin.android.library.mapsdkadapter.p pVar, boolean z14, e23.l<? super Float, Float> lVar) {
        pVar.getClass();
        lVar.getClass();
        MarkerOptions markerOptions = new MarkerOptions();
        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
        MarkerOptions markerOptionsInfoWindowAnchor = markerOptions.alpha(oVar.f50317i).anchor(oVar.f50323o, oVar.f50324p).draggable(oVar.f50315g).flat(oVar.f50316h).infoWindowAnchor(oVar.f50325q, oVar.f50326r);
        com.garmin.android.library.mapsdkadapter.f fVar = oVar.f50309a;
        fVar.getClass();
        markerOptionsInfoWindowAnchor.position(z14 ? d(fVar) : fVar.f50283a).rotation(oVar.f50310b).snippet(oVar.f50313e).title(oVar.f50312d).visible(oVar.f50314f).zIndex(lVar.invoke(Float.valueOf(oVar.f50311c)).floatValue());
        Bitmap bitmap = oVar.f50318j;
        if (bitmap != null) {
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmap));
            return markerOptions;
        }
        Integer num = oVar.f50319k;
        if (num != null) {
            markerOptions.icon(BitmapDescriptorFactory.fromResource(num.intValue()));
        }
        return markerOptions;
    }

    public static final LatLngBounds h(com.garmin.android.library.mapsdkadapter.e eVar) {
        eVar.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarD = eVar.d();
        com.garmin.android.library.mapsdkadapter.i.b bVar = fVarD.f50284b;
        com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.GCJ02;
        if (bVar != bVar2 && !com.garmin.android.library.mapsdkadapter.m.f(fVarD.f50283a)) {
            bVar2 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
        LatLngBounds latLngBoundsBuild = new LatLngBounds.Builder().include(e(eVar.f50273a, bVar2)).include(e(eVar.f50274b, bVar2)).build();
        latLngBoundsBuild.getClass();
        return latLngBoundsBuild;
    }

    public static final LatLngBounds i(List<ke2.b> list) {
        list.getClass();
        LatLngBounds.Builder builder = LatLngBounds.builder();
        Iterator<ke2.b> it = list.iterator();
        while (it.hasNext()) {
            builder.include(ke2.c.c(it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        latLngBoundsBuild.getClass();
        return latLngBoundsBuild;
    }

    public static final List<LatLng> j(List<com.garmin.android.library.mapsdkadapter.f> list) {
        list.getClass();
        if (list.isEmpty()) {
            return j0.f134944a;
        }
        if (com.garmin.android.library.mapsdkadapter.m.e((com.garmin.android.library.mapsdkadapter.f) h0.b0(list))) {
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e((com.garmin.android.library.mapsdkadapter.f) it.next(), com.garmin.android.library.mapsdkadapter.i.b.GCJ02));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((com.garmin.android.library.mapsdkadapter.f) it3.next()).f50283a);
        }
        return arrayList2;
    }
}
