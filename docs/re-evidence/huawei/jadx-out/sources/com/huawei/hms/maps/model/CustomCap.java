package com.huawei.hms.maps.model;

import com.huawei.hms.common.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    public CustomCap(BitmapDescriptor bitmapDescriptor, float f) {
        super((BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor, "BitmapDescriptor can not be null"), f);
        if (Math.abs(f) < 1.0E-6f) {
            throw new IllegalArgumentException("BitmapRefWidth must be positive");
        }
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f;
    }

    @Override // com.huawei.hms.maps.model.Cap
    public String toString() {
        return "CustomCap:bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + "and refWidth=" + this.refWidth;
    }

    @Override // com.huawei.hms.maps.model.Cap
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.huawei.hms.maps.model.Cap
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
