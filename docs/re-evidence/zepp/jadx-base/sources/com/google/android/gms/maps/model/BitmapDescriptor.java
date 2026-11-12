package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class BitmapDescriptor {
    private final IObjectWrapper a;

    public BitmapDescriptor(IObjectWrapper iObjectWrapper) {
        this.a = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    public final IObjectWrapper zza() {
        return this.a;
    }
}
