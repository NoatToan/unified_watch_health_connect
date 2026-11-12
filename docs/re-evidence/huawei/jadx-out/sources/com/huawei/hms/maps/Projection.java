package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.huawei.hms.maps.internal.IProjectionDelegate;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.VisibleRegion;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public final class Projection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IProjectionDelegate f14145a;

    public Point toScreenLocation(LatLng latLng) {
        try {
            return this.f14145a.toScreenLocation(latLng);
        } catch (RemoteException e) {
            LogM.e("Projection", "toScreenLocation: " + e.getMessage());
            return null;
        }
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.f14145a.getVisibleRegion();
        } catch (RemoteException e) {
            LogM.e("Projection", "getVisibleRegion: " + e.getMessage());
            return null;
        }
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            return this.f14145a.fromScreenLocation(point);
        } catch (RemoteException e) {
            LogM.e("Projection", "fromScreenLocation: " + e.getMessage());
            return null;
        }
    }

    public Projection(IProjectionDelegate iProjectionDelegate) {
        this.f14145a = iProjectionDelegate;
    }
}
