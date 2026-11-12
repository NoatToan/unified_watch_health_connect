package com.mapbox.maps.extension.compose.internal;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.MapLoadingErrorCallback;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.ResourceRequestCallback;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoadedCallback;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010'J\u0010\u0010(\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010+J\u0010\u0010,\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010-J\u0010\u0010.\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010/J\u0010\u00100\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u000101J\u0010\u00102\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u000103J\u0010\u00104\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u000105R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/MapEventCancelableHolder;", "", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "(Lcom/mapbox/maps/MapboxMap;)V", "cameraChangedCancelable", "Lcom/mapbox/common/Cancelable;", "cameraChangedCoalescedCancelable", "mapIdleCancelable", "mapLoadedCancelable", "mapLoadingErrorCancelable", "renderFrameFinishedCancelable", "renderFrameStartedCancelable", "resourceRequestCancelable", "sourceAddedCancelable", "sourceDataLoadedCancelable", "sourceRemovedCancelable", "styleDataLoadedCancelable", "styleImageMissingCancelable", "styleImageRemoveUnusedCancelable", "styleLoadedCancelable", "cancelAll", "", "cancelAndSubscribeToCameraChanged", "callback", "Lcom/mapbox/maps/CameraChangedCallback;", "cancelAndSubscribeToCameraChangedCoalesced", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cancelAndSubscribeToMapIdle", "Lcom/mapbox/maps/MapIdleCallback;", "cancelAndSubscribeToMapLoaded", "Lcom/mapbox/maps/MapLoadedCallback;", "cancelAndSubscribeToMapLoadingError", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "cancelAndSubscribeToRenderFrameFinished", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "cancelAndSubscribeToRenderFrameStarted", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "cancelAndSubscribeToResourceRequest", "Lcom/mapbox/maps/ResourceRequestCallback;", "cancelAndSubscribeToSourceAdded", "Lcom/mapbox/maps/SourceAddedCallback;", "cancelAndSubscribeToSourceDataLoaded", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "cancelAndSubscribeToSourceRemoved", "Lcom/mapbox/maps/SourceRemovedCallback;", "cancelAndSubscribeToStyleDataLoaded", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "cancelAndSubscribeToStyleImageMissing", "Lcom/mapbox/maps/StyleImageMissingCallback;", "cancelAndSubscribeToStyleImageRemoveUnused", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "cancelAndSubscribeToStyleLoaded", "Lcom/mapbox/maps/StyleLoadedCallback;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapEventCancelableHolder {
    private Cancelable cameraChangedCancelable;
    private Cancelable cameraChangedCoalescedCancelable;
    private Cancelable mapIdleCancelable;
    private Cancelable mapLoadedCancelable;
    private Cancelable mapLoadingErrorCancelable;
    private final MapboxMap mapboxMap;
    private Cancelable renderFrameFinishedCancelable;
    private Cancelable renderFrameStartedCancelable;
    private Cancelable resourceRequestCancelable;
    private Cancelable sourceAddedCancelable;
    private Cancelable sourceDataLoadedCancelable;
    private Cancelable sourceRemovedCancelable;
    private Cancelable styleDataLoadedCancelable;
    private Cancelable styleImageMissingCancelable;
    private Cancelable styleImageRemoveUnusedCancelable;
    private Cancelable styleLoadedCancelable;

    public MapEventCancelableHolder(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        this.mapboxMap = mapboxMap;
    }

    public final void cancelAll() {
        Cancelable cancelable = this.mapLoadedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        Cancelable cancelable2 = this.mapIdleCancelable;
        if (cancelable2 != null) {
            cancelable2.cancel();
        }
        Cancelable cancelable3 = this.mapLoadingErrorCancelable;
        if (cancelable3 != null) {
            cancelable3.cancel();
        }
        Cancelable cancelable4 = this.styleLoadedCancelable;
        if (cancelable4 != null) {
            cancelable4.cancel();
        }
        Cancelable cancelable5 = this.styleDataLoadedCancelable;
        if (cancelable5 != null) {
            cancelable5.cancel();
        }
        Cancelable cancelable6 = this.sourceDataLoadedCancelable;
        if (cancelable6 != null) {
            cancelable6.cancel();
        }
        Cancelable cancelable7 = this.sourceAddedCancelable;
        if (cancelable7 != null) {
            cancelable7.cancel();
        }
        Cancelable cancelable8 = this.sourceRemovedCancelable;
        if (cancelable8 != null) {
            cancelable8.cancel();
        }
        Cancelable cancelable9 = this.styleImageMissingCancelable;
        if (cancelable9 != null) {
            cancelable9.cancel();
        }
        Cancelable cancelable10 = this.styleImageRemoveUnusedCancelable;
        if (cancelable10 != null) {
            cancelable10.cancel();
        }
        Cancelable cancelable11 = this.cameraChangedCancelable;
        if (cancelable11 != null) {
            cancelable11.cancel();
        }
        Cancelable cancelable12 = this.renderFrameStartedCancelable;
        if (cancelable12 != null) {
            cancelable12.cancel();
        }
        Cancelable cancelable13 = this.renderFrameFinishedCancelable;
        if (cancelable13 != null) {
            cancelable13.cancel();
        }
        Cancelable cancelable14 = this.resourceRequestCancelable;
        if (cancelable14 != null) {
            cancelable14.cancel();
        }
    }

    public final void cancelAndSubscribeToCameraChanged(CameraChangedCallback callback) {
        Cancelable cancelable = this.cameraChangedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.cameraChangedCancelable = callback != null ? this.mapboxMap.subscribeCameraChanged(callback) : null;
    }

    @MapboxExperimental
    public final void cancelAndSubscribeToCameraChangedCoalesced(CameraChangedCoalescedCallback callback) {
        Cancelable cancelable = this.cameraChangedCoalescedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.cameraChangedCoalescedCancelable = callback != null ? this.mapboxMap.subscribeCameraChangedCoalesced(callback) : null;
    }

    public final void cancelAndSubscribeToMapIdle(MapIdleCallback callback) {
        Cancelable cancelable = this.mapIdleCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.mapIdleCancelable = callback != null ? this.mapboxMap.subscribeMapIdle(callback) : null;
    }

    public final void cancelAndSubscribeToMapLoaded(MapLoadedCallback callback) {
        Cancelable cancelable = this.mapLoadedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.mapLoadedCancelable = callback != null ? this.mapboxMap.subscribeMapLoaded(callback) : null;
    }

    public final void cancelAndSubscribeToMapLoadingError(MapLoadingErrorCallback callback) {
        Cancelable cancelable = this.mapLoadingErrorCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.mapLoadingErrorCancelable = callback != null ? this.mapboxMap.subscribeMapLoadingError(callback) : null;
    }

    public final void cancelAndSubscribeToRenderFrameFinished(RenderFrameFinishedCallback callback) {
        Cancelable cancelable = this.renderFrameFinishedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.renderFrameFinishedCancelable = callback != null ? this.mapboxMap.subscribeRenderFrameFinished(callback) : null;
    }

    public final void cancelAndSubscribeToRenderFrameStarted(RenderFrameStartedCallback callback) {
        Cancelable cancelable = this.renderFrameStartedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.renderFrameStartedCancelable = callback != null ? this.mapboxMap.subscribeRenderFrameStarted(callback) : null;
    }

    public final void cancelAndSubscribeToResourceRequest(ResourceRequestCallback callback) {
        Cancelable cancelable = this.resourceRequestCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.resourceRequestCancelable = callback != null ? this.mapboxMap.subscribeResourceRequest(callback) : null;
    }

    public final void cancelAndSubscribeToSourceAdded(SourceAddedCallback callback) {
        Cancelable cancelable = this.sourceAddedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.sourceAddedCancelable = callback != null ? this.mapboxMap.subscribeSourceAdded(callback) : null;
    }

    public final void cancelAndSubscribeToSourceDataLoaded(SourceDataLoadedCallback callback) {
        Cancelable cancelable = this.sourceDataLoadedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.sourceDataLoadedCancelable = callback != null ? this.mapboxMap.subscribeSourceDataLoaded(callback) : null;
    }

    public final void cancelAndSubscribeToSourceRemoved(SourceRemovedCallback callback) {
        Cancelable cancelable = this.sourceRemovedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.sourceRemovedCancelable = callback != null ? this.mapboxMap.subscribeSourceRemoved(callback) : null;
    }

    public final void cancelAndSubscribeToStyleDataLoaded(StyleDataLoadedCallback callback) {
        Cancelable cancelable = this.styleDataLoadedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.styleDataLoadedCancelable = callback != null ? this.mapboxMap.subscribeStyleDataLoaded(callback) : null;
    }

    public final void cancelAndSubscribeToStyleImageMissing(StyleImageMissingCallback callback) {
        Cancelable cancelable = this.styleImageMissingCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.styleImageMissingCancelable = callback != null ? this.mapboxMap.subscribeStyleImageMissing(callback) : null;
    }

    public final void cancelAndSubscribeToStyleImageRemoveUnused(StyleImageRemoveUnusedCallback callback) {
        Cancelable cancelable = this.styleImageRemoveUnusedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.styleImageRemoveUnusedCancelable = callback != null ? this.mapboxMap.subscribeStyleImageRemoveUnused(callback) : null;
    }

    public final void cancelAndSubscribeToStyleLoaded(StyleLoadedCallback callback) {
        Cancelable cancelable = this.styleLoadedCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.styleLoadedCancelable = callback != null ? this.mapboxMap.subscribeStyleLoaded(callback) : null;
    }
}
