package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements GoogleMap.OnMapLoadedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54198b;

    public /* synthetic */ o(Object obj, int i14) {
        this.f54197a = i14;
        this.f54198b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public final void onMapLoaded() {
        int i14 = this.f54197a;
        Object obj = this.f54198b;
        switch (i14) {
            case 0:
                MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$13$lambda$12$lambda$11((k23.i) obj);
                break;
            default:
                me2.l lVar = (me2.l) obj;
                int i15 = me2.l.Z;
                lVar.f0();
                com.garmin.android.library.mapsdkadapter.i.k kVar = lVar.f50256q;
                if (kVar != null) {
                    kVar.onMapLoaded();
                }
                break;
        }
    }
}
