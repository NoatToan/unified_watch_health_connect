package com.google.android.gms.maps.model;

import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public final class Gap extends PatternItem {
    public final float length;

    public Gap(float f14) {
        super(2, Float.valueOf(Math.max(f14, 0.0f)));
        this.length = Math.max(f14, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public String toString() {
        return e0.e(this.length, "]", new StringBuilder("[Gap: length="));
    }
}
