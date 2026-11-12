package com.mapbox.maps.plugin.delegates;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "", "executeOnRenderThread", "", "runnable", "Ljava/lang/Runnable;", "queryRenderedFeatures", "Lcom/mapbox/common/Cancelable;", "geometry", "Lcom/mapbox/maps/RenderedQueryGeometry;", "options", "Lcom/mapbox/maps/RenderedQueryOptions;", "callback", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "querySourceFeatures", "sourceId", "", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapFeatureQueryDelegate {
    void executeOnRenderThread(Runnable runnable);

    Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback);

    Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback);
}
