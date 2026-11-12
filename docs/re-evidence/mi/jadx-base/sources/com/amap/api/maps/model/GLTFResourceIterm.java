package com.amap.api.maps.model;

import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class GLTFResourceIterm {
    private byte[] data;
    private String name;

    public GLTFResourceIterm(String str, byte[] bArr) {
        this.name = str;
        this.data = bArr;
    }
}
