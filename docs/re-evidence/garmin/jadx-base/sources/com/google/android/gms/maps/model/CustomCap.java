package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import hb.a;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCap(BitmapDescriptor bitmapDescriptor, float f14) {
        BitmapDescriptor bitmapDescriptor2 = (BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f14 <= 0.0f) {
            h.s("refWidth must be positive");
            throw null;
        }
        super(bitmapDescriptor2, f14);
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f14;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public String toString() {
        return e0.e(this.refWidth, "]", a.l("[CustomCap: bitmapDescriptor=", String.valueOf(this.bitmapDescriptor), " refWidth="));
    }

    public CustomCap(BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }
}
