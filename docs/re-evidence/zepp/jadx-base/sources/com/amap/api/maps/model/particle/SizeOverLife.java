package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AbstractNativeInstance;
import com.autonavi.base.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes2.dex */
@JBindingInclude
public abstract class SizeOverLife extends AbstractNativeInstance {

    @JBindingExclude
    public final int TYPE_DEFAULT = -1;

    @JBindingExclude
    public final int TYPE_CURVESIZEOVERLIFE = 0;
    public int type = -1;

    @JBindingExclude
    public final int DEFAULT_SIZE = 0;

    @Override // com.autonavi.amap.mapcore.AbstractNativeInstance
    public void finalize() throws Throwable {
        super.finalize();
        long j = this.nativeInstance;
        if (j != 0) {
            AMapNativeParticleSystem.nativeReleaseSizeOverLife(j);
            this.nativeInstance = 0L;
        }
    }

    public abstract float getSizeX(float f);

    public abstract float getSizeY(float f);

    public abstract float getSizeZ(float f);
}
