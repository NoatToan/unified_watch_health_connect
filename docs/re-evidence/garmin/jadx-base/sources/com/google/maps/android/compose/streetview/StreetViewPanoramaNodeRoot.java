package com.google.maps.android.compose.streetview;

import com.google.maps.android.compose.MapNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaNodeRoot;", "Lcom/google/maps/android/compose/MapNode;", "<init>", "()V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StreetViewPanoramaNodeRoot implements MapNode {
    public static final StreetViewPanoramaNodeRoot INSTANCE = new StreetViewPanoramaNodeRoot();

    private StreetViewPanoramaNodeRoot() {
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        MapNode.DefaultImpls.onAttached(this);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        MapNode.DefaultImpls.onCleared(this);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        MapNode.DefaultImpls.onRemoved(this);
    }
}
