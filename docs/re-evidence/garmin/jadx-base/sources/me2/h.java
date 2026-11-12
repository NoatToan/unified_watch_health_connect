package me2;

import android.graphics.Bitmap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import java.util.Iterator;
import java.util.Objects;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements GoogleMap.OnPolylineClickListener, GoogleMap.OnInfoWindowCloseListener, GoogleMap.OnInfoWindowClickListener, ClusterManager.OnClusterClickListener, ClusterManager.OnClusterItemClickListener, GoogleMap.OnCameraMoveStartedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f118175a;

    public /* synthetic */ h(l lVar) {
        this.f118175a = lVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i14) {
        int i15 = l.Z;
        l lVar = this.f118175a;
        lVar.f0();
        com.garmin.android.library.mapsdkadapter.f fVar = lVar.E;
        com.garmin.android.library.mapsdkadapter.e eVar = lVar.I;
        Objects.toString(fVar);
        Objects.toString(eVar);
        j40.a aVar = lVar.f50254o;
        if (aVar != null) {
            j40.c cVar = aVar.f97001a;
            int i16 = j40.c.V0;
            cVar.X6().setRecenterMapButtonEnabled(i14 == 1);
        }
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterClickListener
    public boolean onClusterClick(Cluster cluster) {
        int i14 = l.Z;
        com.garmin.android.library.mapsdkadapter.i.h hVar = this.f118175a.f50246g;
        if (hVar != null) {
            LatLng position = cluster.getPosition();
            position.getClass();
            hVar.I1(z.b(position));
        }
        return true;
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener
    public boolean onClusterItemClick(ClusterItem clusterItem) {
        f fVar = (f) clusterItem;
        int i14 = l.Z;
        com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i interfaceC1001i = this.f118175a.f50247h;
        if (interfaceC1001i == null) {
            return false;
        }
        fVar.getClass();
        return interfaceC1001i.v2(fVar);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        w50.e eVar;
        int i14 = l.Z;
        marker.getClass();
        l lVar = this.f118175a;
        if (lVar.c0(marker) == null) {
            new a0(marker, lVar);
        }
        t0 t0Var = lVar.f50251l;
        if (t0Var != null) {
            w50.d dVar = (w50.d) t0Var.f178952b;
            int i15 = w50.d.f182192w;
            com.garmin.android.apps.connectmobile.courses.model.d dVar2 = dVar.f182203r;
            if (dVar2 == null || (eVar = dVar.f182202q) == null) {
                return;
            }
            eVar.r0(dVar2);
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        Bitmap bitmap;
        int i14;
        int i15 = l.Z;
        marker.getClass();
        l lVar = this.f118175a;
        ie2.j jVarC0 = lVar.c0(marker);
        if (jVarC0 == null) {
            jVarC0 = new a0(marker, lVar);
        }
        if (lVar.f50252m != null) {
            int i16 = w50.d.f182192w;
            w50.b bVar = (w50.b) jVarC0.getTag();
            if (bVar != null && (i14 = bVar.f182188b) != 0) {
                jVarC0.setIcon(i14);
            } else {
                if (bVar == null || (bitmap = bVar.f182189c) == null) {
                    return;
                }
                jVarC0.f(bitmap);
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        b0 next;
        com.garmin.android.library.mapsdkadapter.i.n nVar;
        int i14 = l.Z;
        polyline.getClass();
        polyline.getId();
        l lVar = this.f118175a;
        Iterator<b0> it = lVar.A.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.k().equals(polyline));
        b0 b0Var = next;
        if (b0Var == null || (nVar = lVar.f50250k) == null) {
            return;
        }
        nVar.T0(b0Var);
    }
}
