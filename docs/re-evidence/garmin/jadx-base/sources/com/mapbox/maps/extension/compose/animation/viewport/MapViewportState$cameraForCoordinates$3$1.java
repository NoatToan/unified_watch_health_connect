package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapView;
import com.mapbox.maps.ScreenCoordinate;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.w;
import t13.d;
import t13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState$cameraForCoordinates$3$1 extends w implements l<MapView, Unit> {
    final /* synthetic */ CameraOptions $camera;
    final /* synthetic */ d<CameraOptions> $continuation;
    final /* synthetic */ List<Point> $coordinates;
    final /* synthetic */ EdgeInsets $coordinatesPadding;
    final /* synthetic */ Double $maxZoom;
    final /* synthetic */ ScreenCoordinate $offset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapViewportState$cameraForCoordinates$3$1(List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d<? super CameraOptions> dVar) {
        super(1);
        this.$coordinates = list;
        this.$camera = cameraOptions;
        this.$coordinatesPadding = edgeInsets;
        this.$maxZoom = d14;
        this.$offset = screenCoordinate;
        this.$continuation = dVar;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapView mapView) {
        mapView.getClass();
        mapView.getMapboxMapDeprecated().cameraForCoordinates(this.$coordinates, this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset, new AnonymousClass1(this.$continuation));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$cameraForCoordinates$3$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements l<CameraOptions, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraOptions cameraOptions) {
            cameraOptions.getClass();
            d dVar = (d) this.receiver;
            int i14 = o13.q.f128596b;
            dVar.resumeWith(cameraOptions);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
            invoke2(cameraOptions);
            return Unit.INSTANCE;
        }
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
        invoke2(mapView);
        return Unit.INSTANCE;
    }
}
