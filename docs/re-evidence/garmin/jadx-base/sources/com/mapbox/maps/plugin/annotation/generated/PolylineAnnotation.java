package com.mapbox.maps.plugin.annotation.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.annotation.ConvertUtils;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WBE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010N\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020VH\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R*\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR(\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR(\u0010,\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00105\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R(\u00108\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R(\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR(\u0010>\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R(\u0010A\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R(\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R0\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020H0G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006X"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/LineString;", TtmlNode.ATTR_ID, "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/LineString;)V", "value", "", "lineBlur", "getLineBlur", "()Ljava/lang/Double;", "setLineBlur", "(Ljava/lang/Double;)V", "", "lineBorderColorInt", "getLineBorderColorInt", "()Ljava/lang/Integer;", "setLineBorderColorInt", "(Ljava/lang/Integer;)V", "lineBorderColorString", "getLineBorderColorString", "()Ljava/lang/String;", "setLineBorderColorString", "(Ljava/lang/String;)V", "lineBorderColorUseTheme", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "lineBorderWidth", "getLineBorderWidth", "setLineBorderWidth", "lineColorInt", "getLineColorInt", "setLineColorInt", "lineColorString", "getLineColorString", "setLineColorString", "lineColorUseTheme", "getLineColorUseTheme", "setLineColorUseTheme", "lineGapWidth", "getLineGapWidth", "setLineGapWidth", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoin", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineOffset", "getLineOffset", "setLineOffset", "lineOpacity", "getLineOpacity", "setLineOpacity", "linePattern", "getLinePattern", "setLinePattern", "lineSortKey", "getLineSortKey", "setLineSortKey", "lineWidth", "getLineWidth", "setLineWidth", "lineZOffset", "getLineZOffset", "setLineZOffset", "", "Lcom/mapbox/geojson/Point;", "points", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotation extends Annotation<LineString> {
    public static final String ID_KEY = "PolylineAnnotation";
    private final AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?> annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotation(String str, AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?> annotationManager, JsonObject jsonObject, LineString lineString) {
        super(str, jsonObject, lineString);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        lineString.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty(ID_KEY, str);
    }

    public final Double getLineBlur() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Integer getLineBorderColorInt() {
        Integer numE;
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement == null || (numE = p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getLineBorderColorString() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getLineBorderColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLineBorderWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Integer getLineColorInt() {
        Integer numE;
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement == null || (numE = p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getLineColorString() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getLineColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLineGapWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final LineJoin getLineJoin() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        if (jsonElement == null) {
            return null;
        }
        LineJoin.Companion companion = LineJoin.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, asString, locale, '-', '_'));
    }

    public final Double getLineOffset() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getLineOpacity() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final String getLinePattern() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLineSortKey() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getLineWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getLineZOffset() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public LineString getOffsetGeometry(MapCameraManagerDelegate mapCameraManagerDelegate, MoveDistancesObject moveDistancesObject) {
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        List<Point> listCoordinates = getGeometry().coordinates();
        listCoordinates.getClass();
        if (listCoordinates.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(listCoordinates, 10));
        Iterator<T> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Point) it.next()).longitude()));
        }
        double dN = h0.N(arrayList);
        ArrayList arrayList2 = new ArrayList(y.r(listCoordinates, 10));
        Iterator<T> it3 = listCoordinates.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Double.valueOf(((Point) it3.next()).latitude()));
        }
        Point pointFromLngLat = Point.fromLngLat(dN, h0.N(arrayList2));
        pointFromLngLat.getClass();
        ScreenCoordinate screenCoordinatePixelForCoordinate = mapCameraManagerDelegate.pixelForCoordinate(pointFromLngLat);
        MercatorCoordinate mercatorCoordinateCalculateMercatorCoordinateShift = ConvertUtils.INSTANCE.calculateMercatorCoordinateShift(pointFromLngLat, mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(screenCoordinatePixelForCoordinate.getX() - ((double) moveDistancesObject.getDistanceXSinceLast()), screenCoordinatePixelForCoordinate.getY() - ((double) moveDistancesObject.getDistanceYSinceLast()))), mapCameraManagerDelegate.getCameraState().getZoom());
        ArrayList<Point> arrayList3 = new ArrayList(y.r(listCoordinates, 10));
        for (Point point : listCoordinates) {
            ConvertUtils convertUtils = ConvertUtils.INSTANCE;
            point.getClass();
            arrayList3.add(convertUtils.shiftPointWithMercatorCoordinate(point, mercatorCoordinateCalculateMercatorCoordinateShift, mapCameraManagerDelegate.getCameraState().getZoom()));
        }
        if (!arrayList3.isEmpty()) {
            for (Point point2 : arrayList3) {
                if (point2.latitude() > 85.05112877980659d || point2.latitude() < -85.05112877980659d) {
                    return null;
                }
            }
        }
        return LineString.fromLngLats(arrayList3);
    }

    public final List<Point> getPoints() {
        List<Point> listCoordinates = getGeometry().coordinates();
        listCoordinates.getClass();
        return listCoordinates;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public AnnotationType getType() {
        return AnnotationType.PolylineAnnotation;
    }

    public final void setLineBlur(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        }
    }

    public final void setLineBorderColorInt(Integer num) {
        if (num == null) {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        } else {
            p.l(num, ColorUtils.INSTANCE, getJsonObject(), PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
    }

    public final void setLineBorderColorString(String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
    }

    public final void setLineBorderColorUseTheme(String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        }
    }

    public final void setLineBorderWidth(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        }
    }

    public final void setLineColorInt(Integer num) {
        if (num == null) {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        } else {
            p.l(num, ColorUtils.INSTANCE, getJsonObject(), PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
    }

    public final void setLineColorString(String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
    }

    public final void setLineColorUseTheme(String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        }
    }

    public final void setLineGapWidth(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        }
    }

    public final void setLineJoin(LineJoin lineJoin) {
        if (lineJoin != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin.getValue());
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        }
    }

    public final void setLineOffset(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        }
    }

    public final void setLineOpacity(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        }
    }

    public final void setLinePattern(String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        }
    }

    public final void setLineSortKey(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        }
    }

    public final void setLineWidth(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        }
    }

    public final void setLineZOffset(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, d14);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        }
    }

    public final void setPoints(List<Point> list) {
        list.getClass();
        LineString lineStringFromLngLats = LineString.fromLngLats(list);
        lineStringFromLngLats.getClass();
        setGeometry(lineStringFromLngLats);
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        }
    }
}
