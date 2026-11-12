package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewPanoramaLocation;
import com.huawei.hms.maps.model.StreetViewPanoramaOrientation;
import com.huawei.hms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes34.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    void enablePanning(boolean z);

    void enableStreetNames(boolean z);

    void enableUserNavigation(boolean z);

    void enableZoom(boolean z);

    StreetViewPanoramaLocation getLocation();

    StreetViewPanoramaCamera getPanoramaCamera();

    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener);

    void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener);

    void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener);

    void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener);

    void setPanningGesturesEnabled(boolean z);

    void setPosition(LatLng latLng);

    void setPositionWithID(String str);

    void setPositionWithRadius(LatLng latLng, int i);

    void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource);

    void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource);

    void setStreetNamesEnabled(boolean z);

    public static abstract class Stub extends Binder implements IStreetViewPanoramaDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IStreetViewPanoramaDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14174a;

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaLocation getLocation() {
                return null;
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaCamera getPanoramaCamera() {
                return null;
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaLocation getStreetViewPanoramaLocation() {
                return null;
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) {
                return null;
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setStreetNamesEnabled(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 25);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 21, latLng, streetViewSource);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 21, Integer.valueOf(i), latLng, streetViewSource);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadius(LatLng latLng, int i) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 20, Integer.valueOf(i), latLng);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithID(String str) {
                mai.a(str, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 19);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPosition(LatLng latLng) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 18, latLng);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setPanningGesturesEnabled(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 24);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 17, iOnStreetViewPanoramaLongClickListener != null ? iOnStreetViewPanoramaLongClickListener.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 16, iOnStreetViewPanoramaClickListener != null ? iOnStreetViewPanoramaClickListener.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 15, iOnStreetViewPanoramaChangeListener != null ? iOnStreetViewPanoramaChangeListener.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 14, iOnStreetViewPanoramaCameraChangeListener != null ? iOnStreetViewPanoramaCameraChangeListener.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                return IObjectWrapper.Stub.asInterface(mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 12, streetViewPanoramaOrientation));
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isZoomGesturesEnabled() {
                return mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 11);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isUserNavigationEnabled() {
                return mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 10);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isStreetNamesEnabled() {
                return mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 9);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isPanningGesturesEnabled() {
                return mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 8);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate";
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void enableZoom(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 5);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void enableUserNavigation(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 4);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void enableStreetNames(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 3);
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void enablePanning(boolean z) {
                mai.a(z, this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 2);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14174a;
            }

            @Override // com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate
            public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
                mai.a(this.f14174a, "com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate", 1, Long.valueOf(j), streetViewPanoramaCamera);
            }

            Proxy(IBinder iBinder) {
                this.f14174a = iBinder;
            }
        }

        public static IStreetViewPanoramaDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IStreetViewPanoramaDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaDelegate)) ? new Proxy(iBinder) : (IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
        }
    }
}
