package com.amap.api.maps.model.amap3dmodeltile;

import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class AMap3DTileBuildingColor {
    public int color;
    public String type;

    public AMap3DTileBuildingColor(String str, int i) {
        this.type = str;
        this.color = i;
    }
}
