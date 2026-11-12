package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes34.dex */
public interface IOnStreetViewPanoramaReadyCallback extends IInterface {
    void onStreetViewPanoramaReadyCallback(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate);

    public static abstract class Stub extends Binder implements IOnStreetViewPanoramaReadyCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }
    }
}
