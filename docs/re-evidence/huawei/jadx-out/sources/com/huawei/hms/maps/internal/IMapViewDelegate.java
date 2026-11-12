package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes10.dex */
public interface IMapViewDelegate extends IInterface {
    IHuaweiMapDelegate getMap();

    void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback);

    IObjectWrapper getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void setActivity(IObjectWrapper iObjectWrapper);

    void zOrderOnTop(boolean z);

    public static abstract class Stub extends Binder implements IMapViewDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IMapViewDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14171a;

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void zOrderOnTop(boolean z) {
                mai.a(z, this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 14);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void setActivity(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 15, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onStop() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 12);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onStart() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 11);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onSaveInstanceState(Bundle bundle) {
                mai.a(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 10, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onResume() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 9);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onPause() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 8);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onLowMemory() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 7);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onExitAmbient() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 6);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onEnterAmbient(Bundle bundle) {
                mai.a(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 5, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onDestroy() {
                mai.j(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 4);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void onCreate(Bundle bundle) {
                mai.a(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 3, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public IObjectWrapper getView() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 2));
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                mai.a(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 13, iOnMapReadyCallback != null ? iOnMapReadyCallback.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IMapViewDelegate
            public IHuaweiMapDelegate getMap() {
                return IHuaweiMapDelegate.Stub.asInterface(mai.i(this.f14171a, "com.huawei.hms.maps.internal.IMapViewDelegate", 1));
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IMapViewDelegate";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14171a;
            }

            Proxy(IBinder iBinder) {
                this.f14171a = iBinder;
            }
        }

        public static IMapViewDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapViewDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMapViewDelegate)) ? new Proxy(iBinder) : (IMapViewDelegate) iInterfaceQueryLocalInterface;
        }
    }
}
