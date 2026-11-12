package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.maps.internal.zzw;
import com.google.android.gms.maps.model.Circle;

/* JADX INFO: loaded from: classes3.dex */
final class z extends zzw {
    private final /* synthetic */ GoogleMap.OnCircleClickListener b;

    public z(GoogleMap googleMap, GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.b = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zza(zzh zzhVar) {
        this.b.onCircleClick(new Circle(zzhVar));
    }
}
