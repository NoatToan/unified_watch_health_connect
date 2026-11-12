package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public class VariantOptionalTypeWrapper {
    private final Object value;

    public VariantOptionalTypeWrapper(Object obj) {
        this.value = obj;
    }

    public static VariantOptionalTypeWrapper valueOf(Object obj) {
        return new VariantOptionalTypeWrapper(obj);
    }

    public Object getValue() {
        return this.value;
    }
}
