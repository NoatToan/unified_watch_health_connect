package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements GoogleMap.OnMapLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54187b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f54186a = i14;
        this.f54187b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
    public final void onMapLongClick(LatLng latLng) {
        int i14 = this.f54186a;
        Object obj = this.f54187b;
        switch (i14) {
            case 0:
                MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$9$lambda$8$lambda$7((k23.i) obj, latLng);
                break;
            default:
                int i15 = me2.l.Z;
                latLng.getClass();
                y40.i iVar = ((me2.l) obj).f50244e;
                if (iVar != null) {
                    iVar.h8(me2.z.b(latLng));
                }
                break;
        }
    }
}
