package com.autonavi.base.ae.gmap.bean;

import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class TileSourceReq {
    public int sourceType;
    public int x;
    public int y;
    public int zoom;

    @JBindingExclude
    public String toString() {
        return "TileSourceReq{x=" + this.x + ", y=" + this.y + ", zoom=" + this.zoom + ", sourceId=" + this.sourceType + AbstractJsonLexerKt.END_OBJ;
    }
}
