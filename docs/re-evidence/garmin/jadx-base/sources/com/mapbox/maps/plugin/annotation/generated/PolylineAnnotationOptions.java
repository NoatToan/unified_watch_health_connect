package com.mapbox.maps.plugin.annotation.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxAnnotationException;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001^B\u0005¢\u0006\u0002\u0010\u0004J8\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00122&\u0010@\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030AH\u0016J\b\u0010B\u001a\u0004\u0018\u00010\u0006J\u0006\u0010C\u001a\u00020\tJ\b\u0010D\u001a\u0004\u0018\u00010\u0002J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0006J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\tJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010N\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020OJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u0010\u0010R\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020OJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0012J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bJ\u000e\u0010U\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000bJ\u000e\u0010X\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0012J\u000e\u0010Y\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000bJ\u000e\u0010Z\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u000bJ\u000e\u0010[\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000bJ\u0014\u0010\\\u001a\u00020\u00002\f\u0010]\u001a\b\u0012\u0004\u0012\u00020G0FR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010#\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR\u001e\u0010/\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR\u001c\u00102\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u001e\u00105\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\u001e\u00108\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u000fR\u001e\u0010;\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u000f¨\u0006_"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "Lcom/mapbox/geojson/LineString;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "()V", "data", "Lcom/google/gson/JsonElement;", "geometry", "isDraggable", "", "lineBlur", "", "getLineBlur", "()Ljava/lang/Double;", "setLineBlur", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "lineBorderColor", "", "getLineBorderColor", "()Ljava/lang/String;", "setLineBorderColor", "(Ljava/lang/String;)V", "lineBorderColorUseTheme", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "lineBorderWidth", "getLineBorderWidth", "setLineBorderWidth", "lineColor", "getLineColor", "setLineColor", "lineColorUseTheme", "getLineColorUseTheme", "setLineColorUseTheme", "lineGapWidth", "getLineGapWidth", "setLineGapWidth", "lineJoin", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineOffset", "getLineOffset", "setLineOffset", "lineOpacity", "getLineOpacity", "setLineOpacity", "linePattern", "getLinePattern", "setLinePattern", "lineSortKey", "getLineSortKey", "setLineSortKey", "lineWidth", "getLineWidth", "setLineWidth", "lineZOffset", "getLineZOffset", "setLineZOffset", "build", TtmlNode.ATTR_ID, "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "getData", "getDraggable", "getGeometry", "getPoints", "", "Lcom/mapbox/geojson/Point;", "withData", "jsonElement", "withDraggable", "draggable", "withGeometry", "withLineBlur", "withLineBorderColor", "", "withLineBorderColorUseTheme", "withLineBorderWidth", "withLineColor", "withLineColorUseTheme", "withLineGapWidth", "withLineJoin", "withLineOffset", "withLineOpacity", "withLinePattern", "withLineSortKey", "withLineWidth", "withLineZOffset", "withPoints", "points", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationOptions implements AnnotationOptions<LineString, PolylineAnnotation> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PROPERTY_IS_DRAGGABLE = "is-draggable";
    public static final String PROPERTY_LINE_BLUR = "line-blur";
    public static final String PROPERTY_LINE_BORDER_COLOR = "line-border-color";
    public static final String PROPERTY_LINE_BORDER_COLOR_USE_THEME = "line-border-color-use-theme";
    public static final String PROPERTY_LINE_BORDER_WIDTH = "line-border-width";
    public static final String PROPERTY_LINE_COLOR = "line-color";
    public static final String PROPERTY_LINE_COLOR_USE_THEME = "line-color-use-theme";
    public static final String PROPERTY_LINE_GAP_WIDTH = "line-gap-width";
    public static final String PROPERTY_LINE_JOIN = "line-join";
    public static final String PROPERTY_LINE_OFFSET = "line-offset";
    public static final String PROPERTY_LINE_OPACITY = "line-opacity";
    public static final String PROPERTY_LINE_PATTERN = "line-pattern";
    public static final String PROPERTY_LINE_SORT_KEY = "line-sort-key";
    public static final String PROPERTY_LINE_WIDTH = "line-width";
    public static final String PROPERTY_LINE_Z_OFFSET = "line-z-offset";
    private JsonElement data;
    private LineString geometry;
    private boolean isDraggable;
    private Double lineBlur;
    private String lineBorderColor;
    private String lineBorderColorUseTheme;
    private Double lineBorderWidth;
    private String lineColor;
    private String lineColorUseTheme;
    private Double lineGapWidth;
    private LineJoin lineJoin;
    private Double lineOffset;
    private Double lineOpacity;
    private String linePattern;
    private Double lineSortKey;
    private Double lineWidth;
    private Double lineZOffset;

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public PolylineAnnotation build(String id3, AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?> annotationManager) {
        id3.getClass();
        annotationManager.getClass();
        if (this.geometry == null) {
            throw new MapboxAnnotationException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        LineJoin lineJoin = this.lineJoin;
        if (lineJoin != null) {
            jsonObject.addProperty(PROPERTY_LINE_JOIN, lineJoin.getValue());
        }
        Double d14 = this.lineSortKey;
        if (d14 != null) {
            p.k(d14, jsonObject, PROPERTY_LINE_SORT_KEY);
        }
        Double d15 = this.lineZOffset;
        if (d15 != null) {
            p.k(d15, jsonObject, PROPERTY_LINE_Z_OFFSET);
        }
        Double d16 = this.lineBlur;
        if (d16 != null) {
            p.k(d16, jsonObject, PROPERTY_LINE_BLUR);
        }
        String str = this.lineBorderColor;
        if (str != null) {
            jsonObject.addProperty(PROPERTY_LINE_BORDER_COLOR, str);
        }
        Double d17 = this.lineBorderWidth;
        if (d17 != null) {
            p.k(d17, jsonObject, PROPERTY_LINE_BORDER_WIDTH);
        }
        String str2 = this.lineColor;
        if (str2 != null) {
            jsonObject.addProperty(PROPERTY_LINE_COLOR, str2);
        }
        Double d18 = this.lineGapWidth;
        if (d18 != null) {
            p.k(d18, jsonObject, PROPERTY_LINE_GAP_WIDTH);
        }
        Double d19 = this.lineOffset;
        if (d19 != null) {
            p.k(d19, jsonObject, PROPERTY_LINE_OFFSET);
        }
        Double d24 = this.lineOpacity;
        if (d24 != null) {
            p.k(d24, jsonObject, PROPERTY_LINE_OPACITY);
        }
        String str3 = this.linePattern;
        if (str3 != null) {
            jsonObject.addProperty(PROPERTY_LINE_PATTERN, str3);
        }
        Double d25 = this.lineWidth;
        if (d25 != null) {
            p.k(d25, jsonObject, PROPERTY_LINE_WIDTH);
        }
        String str4 = this.lineBorderColorUseTheme;
        if (str4 != null) {
            jsonObject.addProperty(PROPERTY_LINE_BORDER_COLOR_USE_THEME, str4);
        }
        String str5 = this.lineColorUseTheme;
        if (str5 != null) {
            jsonObject.addProperty(PROPERTY_LINE_COLOR_USE_THEME, str5);
        }
        LineString lineString = this.geometry;
        lineString.getClass();
        PolylineAnnotation polylineAnnotation = new PolylineAnnotation(id3, annotationManager, jsonObject, lineString);
        polylineAnnotation.setDraggable(this.isDraggable);
        polylineAnnotation.setData(this.data);
        return polylineAnnotation;
    }

    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getDraggable, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    public final LineString getGeometry() {
        return this.geometry;
    }

    public final Double getLineBlur() {
        return this.lineBlur;
    }

    public final String getLineBorderColor() {
        return this.lineBorderColor;
    }

    public final String getLineBorderColorUseTheme() {
        return this.lineBorderColorUseTheme;
    }

    public final Double getLineBorderWidth() {
        return this.lineBorderWidth;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final String getLineColorUseTheme() {
        return this.lineColorUseTheme;
    }

    public final Double getLineGapWidth() {
        return this.lineGapWidth;
    }

    public final LineJoin getLineJoin() {
        return this.lineJoin;
    }

    public final Double getLineOffset() {
        return this.lineOffset;
    }

    public final Double getLineOpacity() {
        return this.lineOpacity;
    }

    public final String getLinePattern() {
        return this.linePattern;
    }

    public final Double getLineSortKey() {
        return this.lineSortKey;
    }

    public final Double getLineWidth() {
        return this.lineWidth;
    }

    public final Double getLineZOffset() {
        return this.lineZOffset;
    }

    public final List<Point> getPoints() {
        LineString lineString = this.geometry;
        List<Point> listCoordinates = lineString != null ? lineString.coordinates() : null;
        listCoordinates.getClass();
        return listCoordinates;
    }

    public final void setLineBlur(Double d14) {
        this.lineBlur = d14;
    }

    public final void setLineBorderColor(String str) {
        this.lineBorderColor = str;
    }

    public final void setLineBorderColorUseTheme(String str) {
        this.lineBorderColorUseTheme = str;
    }

    public final void setLineBorderWidth(Double d14) {
        this.lineBorderWidth = d14;
    }

    public final void setLineColor(String str) {
        this.lineColor = str;
    }

    public final void setLineColorUseTheme(String str) {
        this.lineColorUseTheme = str;
    }

    public final void setLineGapWidth(Double d14) {
        this.lineGapWidth = d14;
    }

    public final void setLineJoin(LineJoin lineJoin) {
        this.lineJoin = lineJoin;
    }

    public final void setLineOffset(Double d14) {
        this.lineOffset = d14;
    }

    public final void setLineOpacity(Double d14) {
        this.lineOpacity = d14;
    }

    public final void setLinePattern(String str) {
        this.linePattern = str;
    }

    public final void setLineSortKey(Double d14) {
        this.lineSortKey = d14;
    }

    public final void setLineWidth(Double d14) {
        this.lineWidth = d14;
    }

    public final void setLineZOffset(Double d14) {
        this.lineZOffset = d14;
    }

    public final PolylineAnnotationOptions withData(JsonElement jsonElement) {
        jsonElement.getClass();
        this.data = jsonElement;
        return this;
    }

    public final PolylineAnnotationOptions withDraggable(boolean draggable) {
        this.isDraggable = draggable;
        return this;
    }

    public final PolylineAnnotationOptions withGeometry(LineString geometry) {
        geometry.getClass();
        this.geometry = geometry;
        return this;
    }

    public final PolylineAnnotationOptions withLineBlur(double lineBlur) {
        this.lineBlur = Double.valueOf(lineBlur);
        return this;
    }

    public final PolylineAnnotationOptions withLineBorderColor(int lineBorderColor) {
        this.lineBorderColor = ColorUtils.INSTANCE.colorToRgbaString(lineBorderColor);
        return this;
    }

    public final PolylineAnnotationOptions withLineBorderColorUseTheme(String lineBorderColorUseTheme) {
        lineBorderColorUseTheme.getClass();
        this.lineBorderColorUseTheme = lineBorderColorUseTheme;
        return this;
    }

    public final PolylineAnnotationOptions withLineBorderWidth(double lineBorderWidth) {
        this.lineBorderWidth = Double.valueOf(lineBorderWidth);
        return this;
    }

    public final PolylineAnnotationOptions withLineColor(int lineColor) {
        this.lineColor = ColorUtils.INSTANCE.colorToRgbaString(lineColor);
        return this;
    }

    public final PolylineAnnotationOptions withLineColorUseTheme(String lineColorUseTheme) {
        lineColorUseTheme.getClass();
        this.lineColorUseTheme = lineColorUseTheme;
        return this;
    }

    public final PolylineAnnotationOptions withLineGapWidth(double lineGapWidth) {
        this.lineGapWidth = Double.valueOf(lineGapWidth);
        return this;
    }

    public final PolylineAnnotationOptions withLineJoin(LineJoin lineJoin) {
        lineJoin.getClass();
        this.lineJoin = lineJoin;
        return this;
    }

    public final PolylineAnnotationOptions withLineOffset(double lineOffset) {
        this.lineOffset = Double.valueOf(lineOffset);
        return this;
    }

    public final PolylineAnnotationOptions withLineOpacity(double lineOpacity) {
        this.lineOpacity = Double.valueOf(lineOpacity);
        return this;
    }

    public final PolylineAnnotationOptions withLinePattern(String linePattern) {
        linePattern.getClass();
        this.linePattern = linePattern;
        return this;
    }

    public final PolylineAnnotationOptions withLineSortKey(double lineSortKey) {
        this.lineSortKey = Double.valueOf(lineSortKey);
        return this;
    }

    public final PolylineAnnotationOptions withLineWidth(double lineWidth) {
        this.lineWidth = Double.valueOf(lineWidth);
        return this;
    }

    public final PolylineAnnotationOptions withLineZOffset(double lineZOffset) {
        this.lineZOffset = Double.valueOf(lineZOffset);
        return this;
    }

    public final PolylineAnnotationOptions withPoints(List<Point> points) {
        points.getClass();
        this.geometry = LineString.fromLngLats(points);
        return this;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationOptions$Companion;", "", "()V", "PROPERTY_IS_DRAGGABLE", "", "PROPERTY_LINE_BLUR", "PROPERTY_LINE_BORDER_COLOR", "PROPERTY_LINE_BORDER_COLOR_USE_THEME", "PROPERTY_LINE_BORDER_WIDTH", "PROPERTY_LINE_COLOR", "PROPERTY_LINE_COLOR_USE_THEME", "PROPERTY_LINE_GAP_WIDTH", "PROPERTY_LINE_JOIN", "PROPERTY_LINE_OFFSET", "PROPERTY_LINE_OPACITY", "PROPERTY_LINE_PATTERN", "PROPERTY_LINE_SORT_KEY", "PROPERTY_LINE_WIDTH", "PROPERTY_LINE_Z_OFFSET", "fromFeature", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationOptions;", "feature", "Lcom/mapbox/geojson/Feature;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PolylineAnnotationOptions fromFeature(Feature feature) {
            feature.getClass();
            if (feature.geometry() == null) {
                throw new MapboxAnnotationException("geometry field is required");
            }
            if (!(feature.geometry() instanceof LineString)) {
                return null;
            }
            PolylineAnnotationOptions polylineAnnotationOptions = new PolylineAnnotationOptions();
            Geometry geometry = feature.geometry();
            geometry.getClass();
            polylineAnnotationOptions.geometry = (LineString) geometry;
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) {
                LineJoin.Companion companion = LineJoin.INSTANCE;
                String asString = feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN).getAsString();
                asString.getClass();
                polylineAnnotationOptions.setLineJoin(companion.valueOf(asString));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) {
                polylineAnnotationOptions.setLineSortKey(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) {
                polylineAnnotationOptions.setLineZOffset(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) {
                polylineAnnotationOptions.setLineBlur(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) {
                polylineAnnotationOptions.setLineBorderColor(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR).getAsString());
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) {
                polylineAnnotationOptions.setLineBorderWidth(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) {
                polylineAnnotationOptions.setLineColor(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR).getAsString());
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) {
                polylineAnnotationOptions.setLineGapWidth(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) {
                polylineAnnotationOptions.setLineOffset(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) {
                polylineAnnotationOptions.setLineOpacity(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) {
                polylineAnnotationOptions.setLinePattern(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN).getAsString());
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) {
                polylineAnnotationOptions.setLineWidth(Double.valueOf(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH).getAsDouble()));
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) {
                polylineAnnotationOptions.setLineBorderColorUseTheme(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) {
                polylineAnnotationOptions.setLineColorUseTheme(feature.getProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolylineAnnotationOptions.PROPERTY_IS_DRAGGABLE)) {
                polylineAnnotationOptions.isDraggable = feature.getProperty(PolylineAnnotationOptions.PROPERTY_IS_DRAGGABLE).getAsBoolean();
            }
            return polylineAnnotationOptions;
        }

        private Companion() {
        }
    }

    public final PolylineAnnotationOptions withLineBorderColor(String lineBorderColor) {
        lineBorderColor.getClass();
        this.lineBorderColor = lineBorderColor;
        return this;
    }

    public final PolylineAnnotationOptions withLineColor(String lineColor) {
        lineColor.getClass();
        this.lineColor = lineColor;
        return this;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public /* bridge */ /* synthetic */ Annotation build(String str, AnnotationManager annotationManager) {
        return build(str, (AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?>) annotationManager);
    }
}
