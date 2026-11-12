package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes14.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    IObjectWrapper newCameraPosition(CameraPosition cameraPosition);

    IObjectWrapper newLatLng(LatLng latLng);

    IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i14);

    IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i14, int i15, int i16);

    IObjectWrapper newLatLngZoom(LatLng latLng, float f14);

    IObjectWrapper scrollBy(float f14, float f15);

    IObjectWrapper zoomBy(float f14);

    IObjectWrapper zoomByWithFocus(float f14, int i14, int i15);

    IObjectWrapper zoomIn();

    IObjectWrapper zoomOut();

    IObjectWrapper zoomTo(float f14);
}
