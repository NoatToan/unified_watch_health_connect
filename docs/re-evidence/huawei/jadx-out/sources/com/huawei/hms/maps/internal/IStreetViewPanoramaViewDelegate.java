package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes34.dex */
public interface IStreetViewPanoramaViewDelegate extends IInterface {
    IStreetViewPanoramaDelegate getStreetViewPanorama();

    void getStreetViewPanoramaAsync(IOnStreetViewPanoramaReadyCallback iOnStreetViewPanoramaReadyCallback);

    IObjectWrapper getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    public static abstract class Stub extends Binder implements IStreetViewPanoramaViewDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IStreetViewPanoramaViewDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14176a;

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onStop() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 11);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onStart() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 10);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onSaveInstanceState(Bundle bundle) {
                mai.a(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 9, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onResume() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 8);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onPause() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 7);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onLowMemory() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 6);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onDestroy() {
                mai.j(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 5);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void onCreate(Bundle bundle) {
                mai.a(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 4, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public IObjectWrapper getView() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 3));
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public void getStreetViewPanoramaAsync(IOnStreetViewPanoramaReadyCallback iOnStreetViewPanoramaReadyCallback) {
                mai.a(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 2, iOnStreetViewPanoramaReadyCallback != null ? iOnStreetViewPanoramaReadyCallback.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate
            public IStreetViewPanoramaDelegate getStreetViewPanorama() {
                return IStreetViewPanoramaDelegate.Stub.asInterface(mai.i(this.f14176a, "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate", 1));
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14176a;
            }

            Proxy(IBinder iBinder) {
                this.f14176a = iBinder;
            }
        }

        public static IStreetViewPanoramaViewDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaViewDelegate)) ? new Proxy(iBinder) : (IStreetViewPanoramaViewDelegate) iInterfaceQueryLocalInterface;
        }
    }
}
