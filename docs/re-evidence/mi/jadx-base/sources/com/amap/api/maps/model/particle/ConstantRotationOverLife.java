package com.amap.api.maps.model.particle;

import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class ConstantRotationOverLife extends RotationOverLife {
    private float rotate;

    public ConstantRotationOverLife(float f) {
        this.rotate = f;
        this.type = 0;
    }

    @Override // com.amap.api.maps.model.particle.RotationOverLife
    public float getRotate() {
        return this.rotate;
    }
}
