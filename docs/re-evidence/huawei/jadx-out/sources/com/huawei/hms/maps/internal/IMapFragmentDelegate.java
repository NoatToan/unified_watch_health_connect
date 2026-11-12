package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.HuaweiMapOptions;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes34.dex */
public interface IMapFragmentDelegate extends IInterface {
    IHuaweiMapDelegate getMap();

    void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback);

    boolean isReady();

    void onAttach(IObjectWrapper iObjectWrapper);

    void onCreate(Bundle bundle);

    IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onInflate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void zOrderOnTop(boolean z);

    public static abstract class Stub extends Binder implements IMapFragmentDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IMapFragmentDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14170a;

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void zOrderOnTop(boolean z) {
                mai.a(z, this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 18);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onStop() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 17);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onStart() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 16);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onSaveInstanceState(Bundle bundle) {
                mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 12, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onResume() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 5);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onPause() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 6);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onLowMemory() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 10);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onInflate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IMapFragmentDelegate");
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (huaweiMapOptions != null) {
                        parcelObtain.writeInt(1);
                        huaweiMapOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f14170a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onExitAmbient() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 15);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onEnterAmbient(Bundle bundle) {
                mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 14, bundle);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onDestroyView() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 8);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onDestroy() {
                mai.j(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 9);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IMapFragmentDelegate");
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeStrongBinder(iObjectWrapper2 != null ? iObjectWrapper2.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f14170a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onCreate(Bundle bundle) {
                mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 3, new Parcelable[0]);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void onAttach(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 7, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public boolean isReady() {
                return mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 13);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                mai.a(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 11, iOnMapReadyCallback != null ? iOnMapReadyCallback.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IMapFragmentDelegate
            public IHuaweiMapDelegate getMap() {
                return IHuaweiMapDelegate.Stub.asInterface(mai.i(this.f14170a, "com.huawei.hms.maps.internal.IMapFragmentDelegate", 1));
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IMapFragmentDelegate";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14170a;
            }

            Proxy(IBinder iBinder) {
                this.f14170a = iBinder;
            }
        }

        public static IMapFragmentDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapFragmentDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMapFragmentDelegate)) ? new Proxy(iBinder) : (IMapFragmentDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.internal.IMapFragmentDelegate");
        }
    }
}
