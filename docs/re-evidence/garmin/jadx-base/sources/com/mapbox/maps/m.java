package com.mapbox.maps;

import com.garmin.android.apps.connectmobile.q1;
import org.slf4j.Logger;
import vn2.b0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements PlaybackFinished, q1.a, com.garmin.android.library.mapsdkadapter.i.j, com.garmin.android.library.mapsdkadapter.i.n, com.garmin.android.library.mapsdkadapter.i.m, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f54519b;

    public /* synthetic */ m(e23.a aVar, int i14) {
        this.f54518a = i14;
        this.f54519b = aVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        return ((Boolean) this.f54519b.invoke()).booleanValue();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.n
    public boolean T0(com.garmin.android.library.mapsdkadapter.l lVar) {
        return ((Boolean) this.f54519b.invoke()).booleanValue();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        this.f54519b.invoke();
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        if (z14) {
            this.f54519b.invoke();
        }
    }

    @Override // com.mapbox.maps.PlaybackFinished
    public void run() {
        int i14 = this.f54518a;
        e23.a aVar = this.f54519b;
        switch (i14) {
            case 0:
                MapboxMapRecorder.replay$lambda$4(aVar);
                break;
            default:
                Logger logger = b0.f178864c;
                aVar.invoke();
                break;
        }
    }
}
