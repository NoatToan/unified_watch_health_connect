package com.mapbox.maps.plugin.viewport;

import com.google.firebase.messaging.Constants;
import com.mapbox.maps.plugin.viewport.data.ViewportStatusChangeReason;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatusObserver;", "", "onViewportStatusChanged", "", Constants.MessagePayloadKeys.FROM, "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "to", "reason", "Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ViewportStatusObserver {
    void onViewportStatusChanged(ViewportStatus from, ViewportStatus to3, ViewportStatusChangeReason reason);
}
