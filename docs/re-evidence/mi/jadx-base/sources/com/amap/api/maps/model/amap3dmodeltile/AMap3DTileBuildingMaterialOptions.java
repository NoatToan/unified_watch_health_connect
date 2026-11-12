package com.amap.api.maps.model.amap3dmodeltile;

import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class AMap3DTileBuildingMaterialOptions {
    public float metallicFactor;
    public float roughnessFactor;
    public String type;

    public AMap3DTileBuildingMaterialOptions(String str, float f, float f2) {
        this.type = str;
        this.metallicFactor = f;
        this.roughnessFactor = f2;
    }
}
