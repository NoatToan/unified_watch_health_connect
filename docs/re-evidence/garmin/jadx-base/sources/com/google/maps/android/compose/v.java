package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements GoogleMap.OnCameraIdleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54249b;

    public /* synthetic */ v(Object obj, int i14) {
        this.f54248a = i14;
        this.f54249b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        int i14 = this.f54248a;
        Object obj = this.f54249b;
        switch (i14) {
            case 0:
                MapPropertiesNode.onAttached$lambda$0((MapPropertiesNode) obj);
                break;
            default:
                me2.l lVar = (me2.l) obj;
                int i15 = me2.l.Z;
                lVar.f0();
                com.garmin.android.library.mapsdkadapter.f fVar = lVar.E;
                com.garmin.android.library.mapsdkadapter.e eVar = lVar.I;
                Objects.toString(fVar);
                Objects.toString(eVar);
                com.garmin.android.library.mapsdkadapter.i.f fVar2 = lVar.f50253n;
                if (fVar2 != null) {
                    fVar2.i(lVar.I);
                }
                com.garmin.android.library.mapsdkadapter.i.g gVar = lVar.f50255p;
                if (gVar != null) {
                    gVar.onCameraIdle();
                }
                Iterator<Map.Entry<Integer, ClusterManager<me2.f>>> it = lVar.f118188w.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().onCameraIdle();
                }
                break;
        }
    }
}
