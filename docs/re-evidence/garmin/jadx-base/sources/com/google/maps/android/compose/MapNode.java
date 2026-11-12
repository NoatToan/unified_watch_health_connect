package com.google.maps.android.compose;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/MapNode;", "", "onAttached", "", "onRemoved", "onCleared", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MapNode {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAttached(MapNode mapNode) {
        }

        public static void onCleared(MapNode mapNode) {
        }

        public static void onRemoved(MapNode mapNode) {
        }
    }

    void onAttached();

    void onCleared();

    void onRemoved();
}
