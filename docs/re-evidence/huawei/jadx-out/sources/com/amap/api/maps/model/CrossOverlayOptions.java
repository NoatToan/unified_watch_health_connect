package com.amap.api.maps.model;

import android.graphics.Bitmap;
import com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr;

/* JADX INFO: loaded from: classes21.dex */
public class CrossOverlayOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AVectorCrossAttr f3409a = null;
    private Bitmap bitmapDescriptor = null;

    public AVectorCrossAttr getAttribute() {
        return this.f3409a;
    }

    public CrossOverlayOptions setAttribute(AVectorCrossAttr aVectorCrossAttr) {
        this.f3409a = aVectorCrossAttr;
        return this;
    }

    public CrossOverlayOptions setRes(Bitmap bitmap) {
        this.bitmapDescriptor = bitmap;
        return this;
    }

    public Bitmap getRes() {
        return this.bitmapDescriptor;
    }
}
