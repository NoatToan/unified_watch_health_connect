package com.google.maps.android.compose.clustering;

import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.collections.MarkerManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class ClusteringKt$Clustering$21$1 extends q implements l<Marker, Unit> {
    public ClusteringKt$Clustering$21$1(Object obj) {
        super(1, obj, MarkerManager.class, "onMarkerDrag", "onMarkerDrag(Lcom/google/android/gms/maps/model/Marker;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Marker marker) {
        marker.getClass();
        ((MarkerManager) this.receiver).onMarkerDrag(marker);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
        invoke2(marker);
        return Unit.INSTANCE;
    }
}
