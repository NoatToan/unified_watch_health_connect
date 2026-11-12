package com.google.maps.android.compose.clustering;

import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.collections.MarkerManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class ClusteringKt$Clustering$18$1 extends q implements l<Marker, Boolean> {
    public ClusteringKt$Clustering$18$1(Object obj) {
        super(1, obj, MarkerManager.class, "onMarkerClick", "onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z", 0);
    }

    @Override // e23.l
    public final Boolean invoke(Marker marker) {
        marker.getClass();
        return Boolean.valueOf(((MarkerManager) this.receiver).onMarkerClick(marker));
    }
}
