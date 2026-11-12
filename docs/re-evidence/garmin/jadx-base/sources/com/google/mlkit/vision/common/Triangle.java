package com.google.mlkit.vision.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Triangle<T> {
    private final zzp zza;

    @KeepForSdk
    public Triangle(T t7, T t14, T t15) {
        this.zza = zzp.zzj(t7, t14, t15);
    }

    public List<T> getAllPoints() {
        return this.zza;
    }
}
