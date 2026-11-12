package com.amap.api.maps.model.particle;

import com.autonavi.amap.mapcore.AbstractNativeInstance;
import com.autonavi.base.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes2.dex */
@JBindingInclude
public abstract class ParticleShapeModule extends AbstractNativeInstance {

    @JBindingExclude
    public final int TYPE_DEFAULT = -1;

    @JBindingExclude
    public final int TYPE_SINGLEPOINT = 0;

    @JBindingExclude
    public final int TYPE_RECT = 1;
    public int type = -1;
    public boolean isUseRatio = false;

    @Override // com.autonavi.amap.mapcore.AbstractNativeInstance
    public void finalize() throws Throwable {
        super.finalize();
        long j = this.nativeInstance;
        if (j != 0) {
            AMapNativeParticleSystem.nativeReleaseParticleShapeModule(j);
            this.nativeInstance = 0L;
        }
    }

    public abstract float[] getPoint();

    public boolean isUseRatio() {
        return this.isUseRatio;
    }
}
