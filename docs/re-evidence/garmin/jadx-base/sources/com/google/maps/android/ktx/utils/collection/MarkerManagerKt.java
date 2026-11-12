package com.google.maps.android.ktx.utils.collection;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.collections.MarkerManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00060\u0000R\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Lcom/google/maps/android/collections/MarkerManager$Collection;", "Lcom/google/maps/android/collections/MarkerManager;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "", "optionsActions", "Lcom/google/android/gms/maps/model/Marker;", "addMarker", "(Lcom/google/maps/android/collections/MarkerManager$Collection;Le23/l;)Lcom/google/android/gms/maps/model/Marker;", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MarkerManagerKt {
    public static final Marker addMarker(MarkerManager.Collection collection, l<? super MarkerOptions, Unit> lVar) {
        collection.getClass();
        lVar.getClass();
        MarkerOptions markerOptions = new MarkerOptions();
        lVar.invoke(markerOptions);
        Marker markerAddMarker = collection.addMarker(markerOptions);
        markerAddMarker.getClass();
        return markerAddMarker;
    }
}
