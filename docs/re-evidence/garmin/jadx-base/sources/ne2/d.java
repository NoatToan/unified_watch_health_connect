package ne2;

import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.annotation.ClusterFeature;
import com.mapbox.maps.plugin.annotation.OnClusterClickListener;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements OnClusterClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f125575a;

    public /* synthetic */ d(s sVar) {
        this.f125575a = sVar;
    }

    @Override // com.mapbox.maps.plugin.annotation.OnClusterClickListener
    public final boolean onClusterClick(ClusterFeature clusterFeature) {
        clusterFeature.getClass();
        Geometry geometry = clusterFeature.getOriginalFeature().geometry();
        Point point = geometry instanceof Point ? (Point) geometry : null;
        if (point == null) {
            return true;
        }
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(point.latitude(), point.longitude(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        s sVar = this.f125575a.L0.f125713a;
        int i14 = s.M0;
        com.garmin.android.library.mapsdkadapter.i.h hVar = sVar.f50246g;
        if (hVar == null) {
            return true;
        }
        hVar.I1(fVar);
        return true;
    }
}
