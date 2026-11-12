package com.amap.api.col.p0003sl;

import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public final class eu extends BaseOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private et f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<IGlOverlayLayer> f2480b;

    public eu(IGlOverlayLayer iGlOverlayLayer, et etVar, String str) {
        super(str);
        this.f2480b = new WeakReference<>(iGlOverlayLayer);
        this.f2479a = etVar;
    }
}
