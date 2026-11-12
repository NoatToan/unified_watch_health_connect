package com.amap.api.maps.model;

import android.graphics.Bitmap;
import com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr;

/* JADX INFO: loaded from: classes4.dex */
public class CrossOverlayOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AVectorCrossAttr f6434a = null;
    private Bitmap bitmapDescriptor = null;

    public AVectorCrossAttr getAttribute() {
        return this.f6434a;
    }

    public Bitmap getRes() {
        return this.bitmapDescriptor;
    }

    public CrossOverlayOptions setAttribute(AVectorCrossAttr aVectorCrossAttr) {
        this.f6434a = aVectorCrossAttr;
        return this;
    }

    public CrossOverlayOptions setRes(Bitmap bitmap) {
        this.bitmapDescriptor = bitmap;
        return this;
    }
}
