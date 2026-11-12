package com.mapbox.maps.plugin.annotation.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FBE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010=\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020EH\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R(\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R(\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R*\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR(\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR(\u00102\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R(\u00105\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R$\u00108\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006G"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/Point;", TtmlNode.ATTR_ID, "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/Point;)V", "value", "", "circleBlur", "getCircleBlur", "()Ljava/lang/Double;", "setCircleBlur", "(Ljava/lang/Double;)V", "", "circleColorInt", "getCircleColorInt", "()Ljava/lang/Integer;", "setCircleColorInt", "(Ljava/lang/Integer;)V", "circleColorString", "getCircleColorString", "()Ljava/lang/String;", "setCircleColorString", "(Ljava/lang/String;)V", "circleColorUseTheme", "getCircleColorUseTheme", "setCircleColorUseTheme", "circleOpacity", "getCircleOpacity", "setCircleOpacity", "circleRadius", "getCircleRadius", "setCircleRadius", "circleSortKey", "getCircleSortKey", "setCircleSortKey", "circleStrokeColorInt", "getCircleStrokeColorInt", "setCircleStrokeColorInt", "circleStrokeColorString", "getCircleStrokeColorString", "setCircleStrokeColorString", "circleStrokeColorUseTheme", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "circleStrokeOpacity", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "circleStrokeWidth", "getCircleStrokeWidth", "setCircleStrokeWidth", "point", "getPoint", "()Lcom/mapbox/geojson/Point;", "setPoint", "(Lcom/mapbox/geojson/Point;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotation extends Annotation<Point> {
    public static final String ID_KEY = "CircleAnnotation";
    private final AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?> annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleAnnotation(String str, AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?> annotationManager, JsonObject jsonObject, Point point) {
        super(str, jsonObject, point);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        point.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty(ID_KEY, str);
    }

    public final Double getCircleBlur() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Integer getCircleColorInt() {
        Integer numE;
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        if (jsonElement == null || (numE = p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getCircleColorString() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getCircleColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getCircleOpacity() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getCircleRadius() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getCircleSortKey() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Integer getCircleStrokeColorInt() {
        Integer numE;
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        if (jsonElement == null || (numE = p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getCircleStrokeColorString() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getCircleStrokeColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getCircleStrokeOpacity() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    public final Double getCircleStrokeWidth() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        if (jsonElement != null) {
            return p.d(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public Point getOffsetGeometry(MapCameraManagerDelegate mapCameraManagerDelegate, MoveDistancesObject moveDistancesObject) {
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        Point pointCoordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(moveDistancesObject.getCurrentX(), moveDistancesObject.getCurrentY()));
        if (pointCoordinateForPixel.latitude() > 85.05112877980659d || pointCoordinateForPixel.latitude() < -85.05112877980659d) {
            return null;
        }
        return pointCoordinateForPixel;
    }

    public final Point getPoint() {
        return getGeometry();
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public AnnotationType getType() {
        return AnnotationType.CircleAnnotation;
    }

    public final void setCircleBlur(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        }
    }

    public final void setCircleColorInt(Integer num) {
        if (num == null) {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        } else {
            p.l(num, ColorUtils.INSTANCE, getJsonObject(), CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
    }

    public final void setCircleColorString(String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
    }

    public final void setCircleColorUseTheme(String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        }
    }

    public final void setCircleOpacity(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        }
    }

    public final void setCircleRadius(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        }
    }

    public final void setCircleSortKey(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        }
    }

    public final void setCircleStrokeColorInt(Integer num) {
        if (num == null) {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        } else {
            p.l(num, ColorUtils.INSTANCE, getJsonObject(), CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
    }

    public final void setCircleStrokeColorString(String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
    }

    public final void setCircleStrokeColorUseTheme(String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        }
    }

    public final void setCircleStrokeOpacity(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        }
    }

    public final void setCircleStrokeWidth(Double d14) {
        if (d14 != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, d14);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        }
    }

    public final void setPoint(Point point) {
        point.getClass();
        setGeometry(point);
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        }
    }
}
