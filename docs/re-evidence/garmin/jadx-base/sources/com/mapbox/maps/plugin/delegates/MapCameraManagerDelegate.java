package com.mapbox.maps.plugin.delegates;

import android.graphics.RectF;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBounds;
import com.mapbox.maps.CameraBoundsOptions;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.CoordinateBoundsZoom;
import com.mapbox.maps.CoordinateInfo;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FreeCameraOptions;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenBox;
import com.mapbox.maps.ScreenCoordinate;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JS\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0013\u0010\u0018JC\u0010\u0013\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0013\u0010\u0019JW\u0010\u0013\u001a\u00020\u001b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001aH&¢\u0006\u0004\b\u0013\u0010\u001dJ;\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0010H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\nH&¢\u0006\u0004\b.\u0010/J#\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b0\u00101J#\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH&¢\u0006\u0004\b3\u00101J\u0017\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010-\u001a\u00020\nH&¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u000f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH&¢\u0006\u0004\b;\u00101J\u0017\u0010=\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\fH&¢\u0006\u0004\b=\u0010>J\u0017\u0010=\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020?H&¢\u0006\u0004\b=\u0010AJ\u000f\u0010B\u001a\u00020?H&¢\u0006\u0004\bB\u0010CJ#\u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0F2\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020NH&¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020NH&¢\u0006\u0004\bR\u0010SJ\u001f\u0010V\u001a\u00020\f2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\nH&¢\u0006\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "", "Lcom/mapbox/maps/CoordinateBounds;", "bounds", "Lcom/mapbox/maps/EdgeInsets;", "boundsPadding", "", "bearing", "pitch", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "Lcom/mapbox/maps/CameraOptions;", "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "coordinatesPadding", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lkotlin/Function1;", "", "result", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Le23/l;)V", "Lcom/mapbox/geojson/Geometry;", "geometry", "geometryPadding", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "coordinate", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "pixel", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "pixelsForCoordinates", "(Ljava/util/List;)Ljava/util/List;", "pixels", "coordinatesForPixels", "Landroid/graphics/RectF;", "rectF", "coordinateBoundsForRect", "(Landroid/graphics/RectF;)Lcom/mapbox/maps/CoordinateBounds;", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "coordinatesInfoForPixels", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "Lcom/mapbox/maps/CameraBoundsOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/None;", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "cameraState", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapCameraManagerDelegate {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CameraOptions cameraForCoordinateBounds$default(MapCameraManagerDelegate mapCameraManagerDelegate, CoordinateBounds coordinateBounds, EdgeInsets edgeInsets, Double d14, Double d15, Double d16, ScreenCoordinate screenCoordinate, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: cameraForCoordinateBounds");
                return null;
            }
            if ((i14 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            if ((i14 & 8) != 0) {
                d15 = null;
            }
            if ((i14 & 16) != 0) {
                d16 = null;
            }
            if ((i14 & 32) != 0) {
                screenCoordinate = null;
            }
            return mapCameraManagerDelegate.cameraForCoordinateBounds(coordinateBounds, edgeInsets, d14, d15, d16, screenCoordinate);
        }

        public static /* synthetic */ CameraOptions cameraForCoordinates$default(MapCameraManagerDelegate mapCameraManagerDelegate, List list, EdgeInsets edgeInsets, Double d14, Double d15, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: cameraForCoordinates");
                return null;
            }
            if ((i14 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            if ((i14 & 8) != 0) {
                d15 = null;
            }
            return mapCameraManagerDelegate.cameraForCoordinates(list, edgeInsets, d14, d15);
        }

        public static /* synthetic */ CameraOptions cameraForGeometry$default(MapCameraManagerDelegate mapCameraManagerDelegate, Geometry geometry, EdgeInsets edgeInsets, Double d14, Double d15, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: cameraForGeometry");
                return null;
            }
            if ((i14 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            if ((i14 & 8) != 0) {
                d15 = null;
            }
            return mapCameraManagerDelegate.cameraForGeometry(geometry, edgeInsets, d14, d15);
        }
    }

    @o13.e
    CameraOptions cameraForCoordinateBounds(CoordinateBounds bounds, EdgeInsets boundsPadding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset);

    @MapboxDelicateApi
    CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset);

    @o13.e
    CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, ScreenBox box);

    @o13.e
    CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets coordinatesPadding, Double bearing, Double pitch);

    void cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset, l<? super CameraOptions, Unit> result);

    CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint);

    @o13.e
    CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets geometryPadding, Double bearing, Double pitch);

    CoordinateBounds coordinateBoundsForCamera(CameraOptions camera);

    CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions camera);

    CoordinateBounds coordinateBoundsForRect(RectF rectF);

    CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera);

    CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions camera);

    Point coordinateForPixel(ScreenCoordinate pixel);

    CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel);

    List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels);

    List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels);

    CameraBounds getBounds();

    CameraState getCameraState();

    MapCenterAltitudeMode getCenterAltitudeMode();

    FreeCameraOptions getFreeCameraOptions();

    ScreenCoordinate pixelForCoordinate(Point coordinate);

    List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates);

    Expected<String, None> setBounds(CameraBoundsOptions options);

    void setCamera(CameraOptions cameraOptions);

    void setCamera(FreeCameraOptions freeCameraOptions);

    void setCenterAltitudeMode(MapCenterAltitudeMode mode);
}
