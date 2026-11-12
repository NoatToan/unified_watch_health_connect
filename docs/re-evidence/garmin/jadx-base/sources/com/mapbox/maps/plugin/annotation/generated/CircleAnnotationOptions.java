package com.mapbox.maps.plugin.annotation.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxAnnotationException;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0004J8\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\r2&\u00101\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u000302H\u0016J\b\u00103\u001a\u0004\u0018\u00010+J\u0006\u00104\u001a\u00020.J\b\u00105\u001a\u0004\u0018\u00010\u0002J\b\u00106\u001a\u0004\u0018\u00010\u0002J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u00108\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u000209J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010>\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u000209J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\rJ\u000e\u0010?\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0006J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020+J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020.J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0002J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0002R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010!\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001e\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001e\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "()V", "circleBlur", "", "getCircleBlur", "()Ljava/lang/Double;", "setCircleBlur", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "circleColor", "", "getCircleColor", "()Ljava/lang/String;", "setCircleColor", "(Ljava/lang/String;)V", "circleColorUseTheme", "getCircleColorUseTheme", "setCircleColorUseTheme", "circleOpacity", "getCircleOpacity", "setCircleOpacity", "circleRadius", "getCircleRadius", "setCircleRadius", "circleSortKey", "getCircleSortKey", "setCircleSortKey", "circleStrokeColor", "getCircleStrokeColor", "setCircleStrokeColor", "circleStrokeColorUseTheme", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "circleStrokeOpacity", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "circleStrokeWidth", "getCircleStrokeWidth", "setCircleStrokeWidth", "data", "Lcom/google/gson/JsonElement;", "geometry", "isDraggable", "", "build", TtmlNode.ATTR_ID, "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "getData", "getDraggable", "getGeometry", "getPoint", "withCircleBlur", "withCircleColor", "", "withCircleColorUseTheme", "withCircleOpacity", "withCircleRadius", "withCircleSortKey", "withCircleStrokeColor", "withCircleStrokeColorUseTheme", "withCircleStrokeOpacity", "withCircleStrokeWidth", "withData", "jsonElement", "withDraggable", "draggable", "withGeometry", "withPoint", "point", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationOptions implements AnnotationOptions<Point, CircleAnnotation> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PROPERTY_CIRCLE_BLUR = "circle-blur";
    public static final String PROPERTY_CIRCLE_COLOR = "circle-color";
    public static final String PROPERTY_CIRCLE_COLOR_USE_THEME = "circle-color-use-theme";
    public static final String PROPERTY_CIRCLE_OPACITY = "circle-opacity";
    public static final String PROPERTY_CIRCLE_RADIUS = "circle-radius";
    public static final String PROPERTY_CIRCLE_SORT_KEY = "circle-sort-key";
    public static final String PROPERTY_CIRCLE_STROKE_COLOR = "circle-stroke-color";
    public static final String PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME = "circle-stroke-color-use-theme";
    public static final String PROPERTY_CIRCLE_STROKE_OPACITY = "circle-stroke-opacity";
    public static final String PROPERTY_CIRCLE_STROKE_WIDTH = "circle-stroke-width";
    private static final String PROPERTY_IS_DRAGGABLE = "is-draggable";
    private Double circleBlur;
    private String circleColor;
    private String circleColorUseTheme;
    private Double circleOpacity;
    private Double circleRadius;
    private Double circleSortKey;
    private String circleStrokeColor;
    private String circleStrokeColorUseTheme;
    private Double circleStrokeOpacity;
    private Double circleStrokeWidth;
    private JsonElement data;
    private Point geometry;
    private boolean isDraggable;

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public CircleAnnotation build(String id3, AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?> annotationManager) {
        id3.getClass();
        annotationManager.getClass();
        if (this.geometry == null) {
            throw new MapboxAnnotationException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        Double d14 = this.circleSortKey;
        if (d14 != null) {
            p.k(d14, jsonObject, PROPERTY_CIRCLE_SORT_KEY);
        }
        Double d15 = this.circleBlur;
        if (d15 != null) {
            p.k(d15, jsonObject, PROPERTY_CIRCLE_BLUR);
        }
        String str = this.circleColor;
        if (str != null) {
            jsonObject.addProperty(PROPERTY_CIRCLE_COLOR, str);
        }
        Double d16 = this.circleOpacity;
        if (d16 != null) {
            p.k(d16, jsonObject, PROPERTY_CIRCLE_OPACITY);
        }
        Double d17 = this.circleRadius;
        if (d17 != null) {
            p.k(d17, jsonObject, PROPERTY_CIRCLE_RADIUS);
        }
        String str2 = this.circleStrokeColor;
        if (str2 != null) {
            jsonObject.addProperty(PROPERTY_CIRCLE_STROKE_COLOR, str2);
        }
        Double d18 = this.circleStrokeOpacity;
        if (d18 != null) {
            p.k(d18, jsonObject, PROPERTY_CIRCLE_STROKE_OPACITY);
        }
        Double d19 = this.circleStrokeWidth;
        if (d19 != null) {
            p.k(d19, jsonObject, PROPERTY_CIRCLE_STROKE_WIDTH);
        }
        String str3 = this.circleColorUseTheme;
        if (str3 != null) {
            jsonObject.addProperty(PROPERTY_CIRCLE_COLOR_USE_THEME, str3);
        }
        String str4 = this.circleStrokeColorUseTheme;
        if (str4 != null) {
            jsonObject.addProperty(PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, str4);
        }
        Point point = this.geometry;
        point.getClass();
        CircleAnnotation circleAnnotation = new CircleAnnotation(id3, annotationManager, jsonObject, point);
        circleAnnotation.setDraggable(this.isDraggable);
        circleAnnotation.setData(this.data);
        return circleAnnotation;
    }

    public final Double getCircleBlur() {
        return this.circleBlur;
    }

    public final String getCircleColor() {
        return this.circleColor;
    }

    public final String getCircleColorUseTheme() {
        return this.circleColorUseTheme;
    }

    public final Double getCircleOpacity() {
        return this.circleOpacity;
    }

    public final Double getCircleRadius() {
        return this.circleRadius;
    }

    public final Double getCircleSortKey() {
        return this.circleSortKey;
    }

    public final String getCircleStrokeColor() {
        return this.circleStrokeColor;
    }

    public final String getCircleStrokeColorUseTheme() {
        return this.circleStrokeColorUseTheme;
    }

    public final Double getCircleStrokeOpacity() {
        return this.circleStrokeOpacity;
    }

    public final Double getCircleStrokeWidth() {
        return this.circleStrokeWidth;
    }

    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getDraggable, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    public final Point getGeometry() {
        return this.geometry;
    }

    public final Point getPoint() {
        return this.geometry;
    }

    public final void setCircleBlur(Double d14) {
        this.circleBlur = d14;
    }

    public final void setCircleColor(String str) {
        this.circleColor = str;
    }

    public final void setCircleColorUseTheme(String str) {
        this.circleColorUseTheme = str;
    }

    public final void setCircleOpacity(Double d14) {
        this.circleOpacity = d14;
    }

    public final void setCircleRadius(Double d14) {
        this.circleRadius = d14;
    }

    public final void setCircleSortKey(Double d14) {
        this.circleSortKey = d14;
    }

    public final void setCircleStrokeColor(String str) {
        this.circleStrokeColor = str;
    }

    public final void setCircleStrokeColorUseTheme(String str) {
        this.circleStrokeColorUseTheme = str;
    }

    public final void setCircleStrokeOpacity(Double d14) {
        this.circleStrokeOpacity = d14;
    }

    public final void setCircleStrokeWidth(Double d14) {
        this.circleStrokeWidth = d14;
    }

    public final CircleAnnotationOptions withCircleBlur(double circleBlur) {
        this.circleBlur = Double.valueOf(circleBlur);
        return this;
    }

    public final CircleAnnotationOptions withCircleColor(int circleColor) {
        this.circleColor = ColorUtils.INSTANCE.colorToRgbaString(circleColor);
        return this;
    }

    public final CircleAnnotationOptions withCircleColorUseTheme(String circleColorUseTheme) {
        circleColorUseTheme.getClass();
        this.circleColorUseTheme = circleColorUseTheme;
        return this;
    }

    public final CircleAnnotationOptions withCircleOpacity(double circleOpacity) {
        this.circleOpacity = Double.valueOf(circleOpacity);
        return this;
    }

    public final CircleAnnotationOptions withCircleRadius(double circleRadius) {
        this.circleRadius = Double.valueOf(circleRadius);
        return this;
    }

    public final CircleAnnotationOptions withCircleSortKey(double circleSortKey) {
        this.circleSortKey = Double.valueOf(circleSortKey);
        return this;
    }

    public final CircleAnnotationOptions withCircleStrokeColor(int circleStrokeColor) {
        this.circleStrokeColor = ColorUtils.INSTANCE.colorToRgbaString(circleStrokeColor);
        return this;
    }

    public final CircleAnnotationOptions withCircleStrokeColorUseTheme(String circleStrokeColorUseTheme) {
        circleStrokeColorUseTheme.getClass();
        this.circleStrokeColorUseTheme = circleStrokeColorUseTheme;
        return this;
    }

    public final CircleAnnotationOptions withCircleStrokeOpacity(double circleStrokeOpacity) {
        this.circleStrokeOpacity = Double.valueOf(circleStrokeOpacity);
        return this;
    }

    public final CircleAnnotationOptions withCircleStrokeWidth(double circleStrokeWidth) {
        this.circleStrokeWidth = Double.valueOf(circleStrokeWidth);
        return this;
    }

    public final CircleAnnotationOptions withData(JsonElement jsonElement) {
        jsonElement.getClass();
        this.data = jsonElement;
        return this;
    }

    public final CircleAnnotationOptions withDraggable(boolean draggable) {
        this.isDraggable = draggable;
        return this;
    }

    public final CircleAnnotationOptions withGeometry(Point geometry) {
        geometry.getClass();
        this.geometry = geometry;
        return this;
    }

    public final CircleAnnotationOptions withPoint(Point point) {
        point.getClass();
        this.geometry = point;
        return this;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationOptions$Companion;", "", "()V", "PROPERTY_CIRCLE_BLUR", "", "PROPERTY_CIRCLE_COLOR", "PROPERTY_CIRCLE_COLOR_USE_THEME", "PROPERTY_CIRCLE_OPACITY", "PROPERTY_CIRCLE_RADIUS", "PROPERTY_CIRCLE_SORT_KEY", "PROPERTY_CIRCLE_STROKE_COLOR", "PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME", "PROPERTY_CIRCLE_STROKE_OPACITY", "PROPERTY_CIRCLE_STROKE_WIDTH", "PROPERTY_IS_DRAGGABLE", "fromFeature", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationOptions;", "feature", "Lcom/mapbox/geojson/Feature;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final CircleAnnotationOptions fromFeature(Feature feature) {
            feature.getClass();
            if (feature.geometry() == null) {
                throw new MapboxAnnotationException("geometry field is required");
            }
            if (!(feature.geometry() instanceof Point)) {
                return null;
            }
            CircleAnnotationOptions circleAnnotationOptions = new CircleAnnotationOptions();
            Geometry geometry = feature.geometry();
            geometry.getClass();
            circleAnnotationOptions.geometry = (Point) geometry;
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY)) {
                circleAnnotationOptions.setCircleSortKey(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR)) {
                circleAnnotationOptions.setCircleBlur(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR)) {
                circleAnnotationOptions.setCircleColor(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR).getAsString());
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY)) {
                circleAnnotationOptions.setCircleOpacity(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS)) {
                circleAnnotationOptions.setCircleRadius(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR)) {
                circleAnnotationOptions.setCircleStrokeColor(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR).getAsString());
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY)) {
                circleAnnotationOptions.setCircleStrokeOpacity(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH)) {
                circleAnnotationOptions.setCircleStrokeWidth(Double.valueOf(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME)) {
                circleAnnotationOptions.setCircleColorUseTheme(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME)) {
                circleAnnotationOptions.setCircleStrokeColorUseTheme(feature.getProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(CircleAnnotationOptions.PROPERTY_IS_DRAGGABLE)) {
                circleAnnotationOptions.isDraggable = feature.getProperty(CircleAnnotationOptions.PROPERTY_IS_DRAGGABLE).getAsBoolean();
            }
            return circleAnnotationOptions;
        }

        private Companion() {
        }
    }

    public final CircleAnnotationOptions withCircleColor(String circleColor) {
        circleColor.getClass();
        this.circleColor = circleColor;
        return this;
    }

    public final CircleAnnotationOptions withCircleStrokeColor(String circleStrokeColor) {
        circleStrokeColor.getClass();
        this.circleStrokeColor = circleStrokeColor;
        return this;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public /* bridge */ /* synthetic */ Annotation build(String str, AnnotationManager annotationManager) {
        return build(str, (AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?>) annotationManager);
    }
}
