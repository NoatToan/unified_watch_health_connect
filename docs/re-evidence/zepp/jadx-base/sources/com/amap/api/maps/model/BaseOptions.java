package com.amap.api.maps.model;

import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes2.dex */
@JBindingInclude
public class BaseOptions {
    public Object Field1;
    public Object Field2;
    public String type;

    @JBindingInclude
    public static class BaseUpdateFlags {
        public boolean zIndexUpdate = false;

        public void reset() {
            this.zIndexUpdate = false;
        }
    }

    public BaseUpdateFlags getUpdateFlags() {
        return null;
    }

    public Object method1(Object... objArr) {
        return null;
    }

    public Object method2(Object... objArr) {
        return null;
    }

    @JBindingExclude
    public void resetUpdateFlags() {
    }
}
