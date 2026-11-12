package com.google.android.gms.maps;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraUpdate {
    private final IObjectWrapper a;

    public CameraUpdate(IObjectWrapper iObjectWrapper) {
        this.a = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    public final IObjectWrapper zza() {
        return this.a;
    }
}
