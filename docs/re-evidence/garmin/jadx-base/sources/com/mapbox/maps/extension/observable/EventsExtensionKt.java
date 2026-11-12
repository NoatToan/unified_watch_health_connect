package com.mapbox.maps.extension.observable;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CanonicalTileID;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.extension.observable.eventdata.CameraChangedEventData;
import com.mapbox.maps.extension.observable.eventdata.MapIdleEventData;
import com.mapbox.maps.extension.observable.eventdata.MapLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.MapLoadingErrorEventData;
import com.mapbox.maps.extension.observable.eventdata.RenderFrameFinishedEventData;
import com.mapbox.maps.extension.observable.eventdata.RenderFrameStartedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceAddedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceDataLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceRemovedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleDataLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleImageMissingEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleImageUnusedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleLoadedEventData;
import com.mapbox.maps.extension.observable.model.MapLoadErrorType;
import com.mapbox.maps.extension.observable.model.RenderMode;
import com.mapbox.maps.extension.observable.model.SourceDataType;
import com.mapbox.maps.extension.observable.model.StyleDataType;
import com.mapbox.maps.extension.observable.model.TileID;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0007\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0007\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0007\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0007\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0007\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0007\u001a\f\u0010!\u001a\u00020\"*\u00020#H\u0007\u001a\f\u0010$\u001a\u00020%*\u00020&H\u0007\u001a\f\u0010'\u001a\u00020(*\u00020)H\u0007¨\u0006*"}, d2 = {"toCameraChangedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/CameraChangedEventData;", "Lcom/mapbox/maps/CameraChanged;", "toMapIdleEventData", "Lcom/mapbox/maps/extension/observable/eventdata/MapIdleEventData;", "Lcom/mapbox/maps/MapIdle;", "toMapLoadedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/MapLoadedEventData;", "Lcom/mapbox/maps/MapLoaded;", "toMapLoadingErrorEventData", "Lcom/mapbox/maps/extension/observable/eventdata/MapLoadingErrorEventData;", "Lcom/mapbox/maps/MapLoadingError;", "toRenderFrameFinishedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameFinishedEventData;", "Lcom/mapbox/maps/RenderFrameFinished;", "toRenderFrameStartedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameStartedEventData;", "Lcom/mapbox/maps/RenderFrameStarted;", "toSourceAddedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/SourceAddedEventData;", "Lcom/mapbox/maps/SourceAdded;", "toSourceDataLoadedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/SourceDataLoadedEventData;", "Lcom/mapbox/maps/SourceDataLoaded;", "toSourceRemovedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/SourceRemovedEventData;", "Lcom/mapbox/maps/SourceRemoved;", "toStyleDataLoadedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/StyleDataLoadedEventData;", "Lcom/mapbox/maps/StyleDataLoaded;", "toStyleImageMissingEventData", "Lcom/mapbox/maps/extension/observable/eventdata/StyleImageMissingEventData;", "Lcom/mapbox/maps/StyleImageMissing;", "toStyleImageUnusedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/StyleImageUnusedEventData;", "Lcom/mapbox/maps/StyleImageRemoveUnused;", "toStyleLoadedEventData", "Lcom/mapbox/maps/extension/observable/eventdata/StyleLoadedEventData;", "Lcom/mapbox/maps/StyleLoaded;", "toTileId", "Lcom/mapbox/maps/extension/observable/model/TileID;", "Lcom/mapbox/maps/CanonicalTileID;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class EventsExtensionKt {
    @e
    public static final CameraChangedEventData toCameraChangedEventData(CameraChanged cameraChanged) {
        cameraChanged.getClass();
        return new CameraChangedEventData(cameraChanged.getTimestamp().getTime(), Long.valueOf(cameraChanged.getTimestamp().getTime()));
    }

    @e
    public static final MapIdleEventData toMapIdleEventData(MapIdle mapIdle) {
        mapIdle.getClass();
        return new MapIdleEventData(mapIdle.getTimestamp().getTime(), Long.valueOf(mapIdle.getTimestamp().getTime()));
    }

    @e
    public static final MapLoadedEventData toMapLoadedEventData(MapLoaded mapLoaded) {
        mapLoaded.getClass();
        return new MapLoadedEventData(mapLoaded.getTimeInterval().getBegin().getTime(), Long.valueOf(mapLoaded.getTimeInterval().getEnd().getTime()));
    }

    @e
    public static final MapLoadingErrorEventData toMapLoadingErrorEventData(MapLoadingError mapLoadingError) {
        mapLoadingError.getClass();
        long time = mapLoadingError.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(mapLoadingError.getTimestamp().getTime());
        MapLoadErrorType mapLoadErrorTypeValueOf = MapLoadErrorType.valueOf(mapLoadingError.getType().name());
        String message = mapLoadingError.getMessage();
        message.getClass();
        String sourceId = mapLoadingError.getSourceId();
        CanonicalTileID tileId = mapLoadingError.getTileId();
        return new MapLoadingErrorEventData(time, lValueOf, mapLoadErrorTypeValueOf, message, sourceId, tileId != null ? toTileId(tileId) : null);
    }

    @e
    public static final RenderFrameFinishedEventData toRenderFrameFinishedEventData(RenderFrameFinished renderFrameFinished) {
        renderFrameFinished.getClass();
        return new RenderFrameFinishedEventData(renderFrameFinished.getTimeInterval().getBegin().getTime(), Long.valueOf(renderFrameFinished.getTimeInterval().getEnd().getTime()), RenderMode.valueOf(renderFrameFinished.getRenderMode().name()), renderFrameFinished.getNeedsRepaint(), renderFrameFinished.getPlacementChanged());
    }

    @e
    public static final RenderFrameStartedEventData toRenderFrameStartedEventData(RenderFrameStarted renderFrameStarted) {
        renderFrameStarted.getClass();
        return new RenderFrameStartedEventData(renderFrameStarted.getTimestamp().getTime(), Long.valueOf(renderFrameStarted.getTimestamp().getTime()));
    }

    @e
    public static final SourceAddedEventData toSourceAddedEventData(SourceAdded sourceAdded) {
        sourceAdded.getClass();
        long time = sourceAdded.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(sourceAdded.getTimestamp().getTime());
        String sourceId = sourceAdded.getSourceId();
        sourceId.getClass();
        return new SourceAddedEventData(time, lValueOf, sourceId);
    }

    @e
    public static final SourceDataLoadedEventData toSourceDataLoadedEventData(SourceDataLoaded sourceDataLoaded) {
        sourceDataLoaded.getClass();
        long time = sourceDataLoaded.getTimeInterval().getBegin().getTime();
        Long lValueOf = Long.valueOf(sourceDataLoaded.getTimeInterval().getEnd().getTime());
        String sourceId = sourceDataLoaded.getSourceId();
        sourceId.getClass();
        SourceDataType sourceDataTypeValueOf = SourceDataType.valueOf(sourceDataLoaded.getType().name());
        Boolean loaded = sourceDataLoaded.getLoaded();
        CanonicalTileID tileId = sourceDataLoaded.getTileId();
        return new SourceDataLoadedEventData(time, lValueOf, sourceId, sourceDataTypeValueOf, loaded, tileId != null ? toTileId(tileId) : null);
    }

    @e
    public static final SourceRemovedEventData toSourceRemovedEventData(SourceRemoved sourceRemoved) {
        sourceRemoved.getClass();
        long time = sourceRemoved.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(sourceRemoved.getTimestamp().getTime());
        String sourceId = sourceRemoved.getSourceId();
        sourceId.getClass();
        return new SourceRemovedEventData(time, lValueOf, sourceId);
    }

    @e
    public static final StyleDataLoadedEventData toStyleDataLoadedEventData(StyleDataLoaded styleDataLoaded) {
        styleDataLoaded.getClass();
        return new StyleDataLoadedEventData(styleDataLoaded.getTimeInterval().getBegin().getTime(), Long.valueOf(styleDataLoaded.getTimeInterval().getEnd().getTime()), StyleDataType.valueOf(styleDataLoaded.getType().name()));
    }

    @e
    public static final StyleImageMissingEventData toStyleImageMissingEventData(StyleImageMissing styleImageMissing) {
        styleImageMissing.getClass();
        long time = styleImageMissing.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(styleImageMissing.getTimestamp().getTime());
        String imageId = styleImageMissing.getImageId();
        imageId.getClass();
        return new StyleImageMissingEventData(time, lValueOf, imageId);
    }

    @e
    public static final StyleImageUnusedEventData toStyleImageUnusedEventData(StyleImageRemoveUnused styleImageRemoveUnused) {
        styleImageRemoveUnused.getClass();
        long time = styleImageRemoveUnused.getTimestamp().getTime();
        Long lValueOf = Long.valueOf(styleImageRemoveUnused.getTimestamp().getTime());
        String imageId = styleImageRemoveUnused.getImageId();
        imageId.getClass();
        return new StyleImageUnusedEventData(time, lValueOf, imageId);
    }

    @e
    public static final StyleLoadedEventData toStyleLoadedEventData(StyleLoaded styleLoaded) {
        styleLoaded.getClass();
        return new StyleLoadedEventData(styleLoaded.getTimeInterval().getBegin().getTime(), Long.valueOf(styleLoaded.getTimeInterval().getEnd().getTime()));
    }

    @e
    public static final TileID toTileId(CanonicalTileID canonicalTileID) {
        canonicalTileID.getClass();
        return new TileID(canonicalTileID.getZ(), canonicalTileID.getX(), canonicalTileID.getY());
    }
}
