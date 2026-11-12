package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
interface InteractionHandler {
    boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    void handleChange(InteractionContext interactionContext);

    void handleEnd(InteractionContext interactionContext);
}
