package com.mapbox.maps.coroutine;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueriedSourceFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import java.util.List;
import o13.q;
import o53.k;
import p005kotlin.Metadata;
import t13.d;
import u13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "geometry", "Lcom/mapbox/maps/RenderedQueryOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "", "", "Lcom/mapbox/maps/QueriedRenderedFeature;", "queryRenderedFeatures", "(Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lt13/d;)Ljava/lang/Object;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QueriedSourceFeature;", "querySourceFeatures", "(Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lt13/d;)Ljava/lang/Object;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapFeatureQueryDelegateExtKt {
    public static final Object queryRenderedFeatures(MapFeatureQueryDelegate mapFeatureQueryDelegate, RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, d dVar) {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapFeatureQueryDelegate.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, new QueryRenderedFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1
            @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
            public final void run(Expected<String, List<QueriedRenderedFeature>> expected) {
                expected.getClass();
                d<Expected<String, List<QueriedRenderedFeature>>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final Object querySourceFeatures(MapFeatureQueryDelegate mapFeatureQueryDelegate, String str, SourceQueryOptions sourceQueryOptions, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapFeatureQueryDelegate.querySourceFeatures(str, sourceQueryOptions, new QuerySourceFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1
            @Override // com.mapbox.maps.QuerySourceFeaturesCallback
            public final void run(Expected<String, List<QueriedSourceFeature>> expected) {
                expected.getClass();
                d<Expected<String, List<QueriedSourceFeature>>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }
}
