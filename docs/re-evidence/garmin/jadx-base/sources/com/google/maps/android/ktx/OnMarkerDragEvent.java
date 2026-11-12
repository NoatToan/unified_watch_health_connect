package com.google.maps.android.ktx;

import com.google.android.gms.maps.model.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "", "<init>", "()V", "marker", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/ktx/MarkerDragEndEvent;", "Lcom/google/maps/android/ktx/MarkerDragEvent;", "Lcom/google/maps/android/ktx/MarkerDragStartEvent;", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OnMarkerDragEvent {
    public /* synthetic */ OnMarkerDragEvent(j jVar) {
        this();
    }

    public abstract Marker getMarker();

    private OnMarkerDragEvent() {
    }
}
