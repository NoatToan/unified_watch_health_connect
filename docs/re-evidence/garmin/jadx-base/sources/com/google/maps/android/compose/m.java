package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements GoogleMap.OnMapClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54170b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f54169a = i14;
        this.f54170b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
    public final void onMapClick(LatLng latLng) {
        int i14 = this.f54169a;
        Object obj = this.f54170b;
        switch (i14) {
            case 0:
                MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$5$lambda$4$lambda$3((k23.i) obj, latLng);
                break;
            default:
                int i15 = me2.l.Z;
                latLng.getClass();
                com.garmin.android.library.mapsdkadapter.i.j jVar = ((me2.l) obj).f50243d;
                if (jVar != null) {
                    jVar.X(me2.z.b(latLng));
                }
                break;
        }
    }
}
