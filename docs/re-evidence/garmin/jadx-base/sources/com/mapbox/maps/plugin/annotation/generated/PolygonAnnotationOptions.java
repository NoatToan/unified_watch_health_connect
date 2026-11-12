package com.mapbox.maps.plugin.annotation.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import com.mapbox.maps.MapboxAnnotationException;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 Z2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001ZB\u0005¢\u0006\u0002\u0010\u0004J8\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\b2&\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030>H\u0016J\b\u0010?\u001a\u0004\u0018\u00010\u0006J\u0006\u0010@\u001a\u00020\u0017J\b\u0010A\u001a\u0004\u0018\u00010\u0002J\u0012\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0CJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0006J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0017J\u0010\u0010I\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020JJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010L\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020JJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010O\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010P\u001a\u00020\u00002\b\b\u0001\u0010$\u001a\u00020JJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\bJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\bJ\u000e\u0010S\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u001eJ\u0010\u0010T\u001a\u00020\u00002\b\b\u0001\u00100\u001a\u00020JJ\u000e\u0010T\u001a\u00020\u00002\u0006\u00100\u001a\u00020\bJ\u000e\u0010U\u001a\u00020\u00002\u0006\u00103\u001a\u00020\bJ\u000e\u0010V\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001eJ\u000e\u0010W\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0002J\u001a\u0010X\u001a\u00020\u00002\u0012\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0CR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR\u001c\u0010'\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\fR\u001c\u0010*\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\fR\u001e\u0010-\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001c\u00100\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR\u001c\u00103\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\n\"\u0004\b5\u0010\fR\u001e\u00106\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u0010\u00109\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "Lcom/mapbox/geojson/Polygon;", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotation;", "()V", "data", "Lcom/google/gson/JsonElement;", "fillBridgeGuardRailColor", "", "getFillBridgeGuardRailColor", "()Ljava/lang/String;", "setFillBridgeGuardRailColor", "(Ljava/lang/String;)V", "fillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme", "setFillBridgeGuardRailColorUseTheme", "fillColor", "getFillColor", "setFillColor", "fillColorUseTheme", "getFillColorUseTheme", "setFillColorUseTheme", "fillConstructBridgeGuardRail", "", "getFillConstructBridgeGuardRail", "()Ljava/lang/Boolean;", "setFillConstructBridgeGuardRail", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "fillOpacity", "", "getFillOpacity", "()Ljava/lang/Double;", "setFillOpacity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "fillOutlineColor", "getFillOutlineColor", "setFillOutlineColor", "fillOutlineColorUseTheme", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "fillPattern", "getFillPattern", "setFillPattern", "fillSortKey", "getFillSortKey", "setFillSortKey", "fillTunnelStructureColor", "getFillTunnelStructureColor", "setFillTunnelStructureColor", "fillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "fillZOffset", "getFillZOffset", "setFillZOffset", "geometry", "isDraggable", "build", TtmlNode.ATTR_ID, "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "getData", "getDraggable", "getGeometry", "getPoints", "", "Lcom/mapbox/geojson/Point;", "withData", "jsonElement", "withDraggable", "draggable", "withFillBridgeGuardRailColor", "", "withFillBridgeGuardRailColorUseTheme", "withFillColor", "withFillColorUseTheme", "withFillConstructBridgeGuardRail", "withFillOpacity", "withFillOutlineColor", "withFillOutlineColorUseTheme", "withFillPattern", "withFillSortKey", "withFillTunnelStructureColor", "withFillTunnelStructureColorUseTheme", "withFillZOffset", "withGeometry", "withPoints", "points", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationOptions implements AnnotationOptions<Polygon, PolygonAnnotation> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR = "fill-bridge-guard-rail-color";
    public static final String PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME = "fill-bridge-guard-rail-color-use-theme";
    public static final String PROPERTY_FILL_COLOR = "fill-color";
    public static final String PROPERTY_FILL_COLOR_USE_THEME = "fill-color-use-theme";
    public static final String PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL = "fill-construct-bridge-guard-rail";
    public static final String PROPERTY_FILL_OPACITY = "fill-opacity";
    public static final String PROPERTY_FILL_OUTLINE_COLOR = "fill-outline-color";
    public static final String PROPERTY_FILL_OUTLINE_COLOR_USE_THEME = "fill-outline-color-use-theme";
    public static final String PROPERTY_FILL_PATTERN = "fill-pattern";
    public static final String PROPERTY_FILL_SORT_KEY = "fill-sort-key";
    public static final String PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR = "fill-tunnel-structure-color";
    public static final String PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME = "fill-tunnel-structure-color-use-theme";
    public static final String PROPERTY_FILL_Z_OFFSET = "fill-z-offset";
    private static final String PROPERTY_IS_DRAGGABLE = "is-draggable";
    private JsonElement data;
    private String fillBridgeGuardRailColor;
    private String fillBridgeGuardRailColorUseTheme;
    private String fillColor;
    private String fillColorUseTheme;
    private Boolean fillConstructBridgeGuardRail;
    private Double fillOpacity;
    private String fillOutlineColor;
    private String fillOutlineColorUseTheme;
    private String fillPattern;
    private Double fillSortKey;
    private String fillTunnelStructureColor;
    private String fillTunnelStructureColorUseTheme;
    private Double fillZOffset;
    private Polygon geometry;
    private boolean isDraggable;

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public PolygonAnnotation build(String id3, AnnotationManager<Polygon, PolygonAnnotation, ?, ?, ?, ?, ?> annotationManager) {
        id3.getClass();
        annotationManager.getClass();
        if (this.geometry == null) {
            throw new MapboxAnnotationException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        Boolean bool = this.fillConstructBridgeGuardRail;
        if (bool != null) {
            jsonObject.addProperty(PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, bool);
        }
        Double d14 = this.fillSortKey;
        if (d14 != null) {
            p.k(d14, jsonObject, PROPERTY_FILL_SORT_KEY);
        }
        String str = this.fillBridgeGuardRailColor;
        if (str != null) {
            jsonObject.addProperty(PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, str);
        }
        String str2 = this.fillColor;
        if (str2 != null) {
            jsonObject.addProperty(PROPERTY_FILL_COLOR, str2);
        }
        Double d15 = this.fillOpacity;
        if (d15 != null) {
            p.k(d15, jsonObject, PROPERTY_FILL_OPACITY);
        }
        String str3 = this.fillOutlineColor;
        if (str3 != null) {
            jsonObject.addProperty(PROPERTY_FILL_OUTLINE_COLOR, str3);
        }
        String str4 = this.fillPattern;
        if (str4 != null) {
            jsonObject.addProperty(PROPERTY_FILL_PATTERN, str4);
        }
        String str5 = this.fillTunnelStructureColor;
        if (str5 != null) {
            jsonObject.addProperty(PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, str5);
        }
        Double d16 = this.fillZOffset;
        if (d16 != null) {
            p.k(d16, jsonObject, PROPERTY_FILL_Z_OFFSET);
        }
        String str6 = this.fillBridgeGuardRailColorUseTheme;
        if (str6 != null) {
            jsonObject.addProperty(PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, str6);
        }
        String str7 = this.fillColorUseTheme;
        if (str7 != null) {
            jsonObject.addProperty(PROPERTY_FILL_COLOR_USE_THEME, str7);
        }
        String str8 = this.fillOutlineColorUseTheme;
        if (str8 != null) {
            jsonObject.addProperty(PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, str8);
        }
        String str9 = this.fillTunnelStructureColorUseTheme;
        if (str9 != null) {
            jsonObject.addProperty(PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, str9);
        }
        Polygon polygon = this.geometry;
        polygon.getClass();
        PolygonAnnotation polygonAnnotation = new PolygonAnnotation(id3, annotationManager, jsonObject, polygon);
        polygonAnnotation.setDraggable(this.isDraggable);
        polygonAnnotation.setData(this.data);
        return polygonAnnotation;
    }

    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getDraggable, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    public final String getFillBridgeGuardRailColor() {
        return this.fillBridgeGuardRailColor;
    }

    public final String getFillBridgeGuardRailColorUseTheme() {
        return this.fillBridgeGuardRailColorUseTheme;
    }

    public final String getFillColor() {
        return this.fillColor;
    }

    public final String getFillColorUseTheme() {
        return this.fillColorUseTheme;
    }

    public final Boolean getFillConstructBridgeGuardRail() {
        return this.fillConstructBridgeGuardRail;
    }

    public final Double getFillOpacity() {
        return this.fillOpacity;
    }

    public final String getFillOutlineColor() {
        return this.fillOutlineColor;
    }

    public final String getFillOutlineColorUseTheme() {
        return this.fillOutlineColorUseTheme;
    }

    public final String getFillPattern() {
        return this.fillPattern;
    }

    public final Double getFillSortKey() {
        return this.fillSortKey;
    }

    public final String getFillTunnelStructureColor() {
        return this.fillTunnelStructureColor;
    }

    public final String getFillTunnelStructureColorUseTheme() {
        return this.fillTunnelStructureColorUseTheme;
    }

    public final Double getFillZOffset() {
        return this.fillZOffset;
    }

    public final Polygon getGeometry() {
        return this.geometry;
    }

    public final List<List<Point>> getPoints() {
        Polygon polygon = this.geometry;
        List<List<Point>> listCoordinates = polygon != null ? polygon.coordinates() : null;
        listCoordinates.getClass();
        return listCoordinates;
    }

    public final void setFillBridgeGuardRailColor(String str) {
        this.fillBridgeGuardRailColor = str;
    }

    public final void setFillBridgeGuardRailColorUseTheme(String str) {
        this.fillBridgeGuardRailColorUseTheme = str;
    }

    public final void setFillColor(String str) {
        this.fillColor = str;
    }

    public final void setFillColorUseTheme(String str) {
        this.fillColorUseTheme = str;
    }

    public final void setFillConstructBridgeGuardRail(Boolean bool) {
        this.fillConstructBridgeGuardRail = bool;
    }

    public final void setFillOpacity(Double d14) {
        this.fillOpacity = d14;
    }

    public final void setFillOutlineColor(String str) {
        this.fillOutlineColor = str;
    }

    public final void setFillOutlineColorUseTheme(String str) {
        this.fillOutlineColorUseTheme = str;
    }

    public final void setFillPattern(String str) {
        this.fillPattern = str;
    }

    public final void setFillSortKey(Double d14) {
        this.fillSortKey = d14;
    }

    public final void setFillTunnelStructureColor(String str) {
        this.fillTunnelStructureColor = str;
    }

    public final void setFillTunnelStructureColorUseTheme(String str) {
        this.fillTunnelStructureColorUseTheme = str;
    }

    public final void setFillZOffset(Double d14) {
        this.fillZOffset = d14;
    }

    public final PolygonAnnotationOptions withData(JsonElement jsonElement) {
        jsonElement.getClass();
        this.data = jsonElement;
        return this;
    }

    public final PolygonAnnotationOptions withDraggable(boolean draggable) {
        this.isDraggable = draggable;
        return this;
    }

    public final PolygonAnnotationOptions withFillBridgeGuardRailColor(int fillBridgeGuardRailColor) {
        this.fillBridgeGuardRailColor = ColorUtils.INSTANCE.colorToRgbaString(fillBridgeGuardRailColor);
        return this;
    }

    public final PolygonAnnotationOptions withFillBridgeGuardRailColorUseTheme(String fillBridgeGuardRailColorUseTheme) {
        fillBridgeGuardRailColorUseTheme.getClass();
        this.fillBridgeGuardRailColorUseTheme = fillBridgeGuardRailColorUseTheme;
        return this;
    }

    public final PolygonAnnotationOptions withFillColor(int fillColor) {
        this.fillColor = ColorUtils.INSTANCE.colorToRgbaString(fillColor);
        return this;
    }

    public final PolygonAnnotationOptions withFillColorUseTheme(String fillColorUseTheme) {
        fillColorUseTheme.getClass();
        this.fillColorUseTheme = fillColorUseTheme;
        return this;
    }

    public final PolygonAnnotationOptions withFillConstructBridgeGuardRail(boolean fillConstructBridgeGuardRail) {
        this.fillConstructBridgeGuardRail = Boolean.valueOf(fillConstructBridgeGuardRail);
        return this;
    }

    public final PolygonAnnotationOptions withFillOpacity(double fillOpacity) {
        this.fillOpacity = Double.valueOf(fillOpacity);
        return this;
    }

    public final PolygonAnnotationOptions withFillOutlineColor(int fillOutlineColor) {
        this.fillOutlineColor = ColorUtils.INSTANCE.colorToRgbaString(fillOutlineColor);
        return this;
    }

    public final PolygonAnnotationOptions withFillOutlineColorUseTheme(String fillOutlineColorUseTheme) {
        fillOutlineColorUseTheme.getClass();
        this.fillOutlineColorUseTheme = fillOutlineColorUseTheme;
        return this;
    }

    public final PolygonAnnotationOptions withFillPattern(String fillPattern) {
        fillPattern.getClass();
        this.fillPattern = fillPattern;
        return this;
    }

    public final PolygonAnnotationOptions withFillSortKey(double fillSortKey) {
        this.fillSortKey = Double.valueOf(fillSortKey);
        return this;
    }

    public final PolygonAnnotationOptions withFillTunnelStructureColor(int fillTunnelStructureColor) {
        this.fillTunnelStructureColor = ColorUtils.INSTANCE.colorToRgbaString(fillTunnelStructureColor);
        return this;
    }

    public final PolygonAnnotationOptions withFillTunnelStructureColorUseTheme(String fillTunnelStructureColorUseTheme) {
        fillTunnelStructureColorUseTheme.getClass();
        this.fillTunnelStructureColorUseTheme = fillTunnelStructureColorUseTheme;
        return this;
    }

    public final PolygonAnnotationOptions withFillZOffset(double fillZOffset) {
        this.fillZOffset = Double.valueOf(fillZOffset);
        return this;
    }

    public final PolygonAnnotationOptions withGeometry(Polygon geometry) {
        geometry.getClass();
        this.geometry = geometry;
        return this;
    }

    public final PolygonAnnotationOptions withPoints(List<? extends List<Point>> points) {
        points.getClass();
        this.geometry = Polygon.fromLngLats((List<List<Point>>) points);
        return this;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationOptions$Companion;", "", "()V", "PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR", "", "PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME", "PROPERTY_FILL_COLOR", "PROPERTY_FILL_COLOR_USE_THEME", "PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL", "PROPERTY_FILL_OPACITY", "PROPERTY_FILL_OUTLINE_COLOR", "PROPERTY_FILL_OUTLINE_COLOR_USE_THEME", "PROPERTY_FILL_PATTERN", "PROPERTY_FILL_SORT_KEY", "PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR", "PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME", "PROPERTY_FILL_Z_OFFSET", "PROPERTY_IS_DRAGGABLE", "fromFeature", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationOptions;", "feature", "Lcom/mapbox/geojson/Feature;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PolygonAnnotationOptions fromFeature(Feature feature) {
            feature.getClass();
            if (feature.geometry() == null) {
                throw new MapboxAnnotationException("geometry field is required");
            }
            if (!(feature.geometry() instanceof Polygon)) {
                return null;
            }
            PolygonAnnotationOptions polygonAnnotationOptions = new PolygonAnnotationOptions();
            Geometry geometry = feature.geometry();
            geometry.getClass();
            polygonAnnotationOptions.geometry = (Polygon) geometry;
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL)) {
                polygonAnnotationOptions.setFillConstructBridgeGuardRail(Boolean.valueOf(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL).getAsBoolean()));
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY)) {
                polygonAnnotationOptions.setFillSortKey(Double.valueOf(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY).getAsDouble()));
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR)) {
                polygonAnnotationOptions.setFillBridgeGuardRailColor(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR)) {
                polygonAnnotationOptions.setFillColor(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY)) {
                polygonAnnotationOptions.setFillOpacity(Double.valueOf(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY).getAsDouble()));
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR)) {
                polygonAnnotationOptions.setFillOutlineColor(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN)) {
                polygonAnnotationOptions.setFillPattern(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR)) {
                polygonAnnotationOptions.setFillTunnelStructureColor(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET)) {
                polygonAnnotationOptions.setFillZOffset(Double.valueOf(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET).getAsDouble()));
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME)) {
                polygonAnnotationOptions.setFillBridgeGuardRailColorUseTheme(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME)) {
                polygonAnnotationOptions.setFillColorUseTheme(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME)) {
                polygonAnnotationOptions.setFillOutlineColorUseTheme(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME)) {
                polygonAnnotationOptions.setFillTunnelStructureColorUseTheme(feature.getProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME).getAsString());
            }
            if (feature.hasProperty(PolygonAnnotationOptions.PROPERTY_IS_DRAGGABLE)) {
                polygonAnnotationOptions.isDraggable = feature.getProperty(PolygonAnnotationOptions.PROPERTY_IS_DRAGGABLE).getAsBoolean();
            }
            return polygonAnnotationOptions;
        }

        private Companion() {
        }
    }

    public final PolygonAnnotationOptions withFillBridgeGuardRailColor(String fillBridgeGuardRailColor) {
        fillBridgeGuardRailColor.getClass();
        this.fillBridgeGuardRailColor = fillBridgeGuardRailColor;
        return this;
    }

    public final PolygonAnnotationOptions withFillColor(String fillColor) {
        fillColor.getClass();
        this.fillColor = fillColor;
        return this;
    }

    public final PolygonAnnotationOptions withFillOutlineColor(String fillOutlineColor) {
        fillOutlineColor.getClass();
        this.fillOutlineColor = fillOutlineColor;
        return this;
    }

    public final PolygonAnnotationOptions withFillTunnelStructureColor(String fillTunnelStructureColor) {
        fillTunnelStructureColor.getClass();
        this.fillTunnelStructureColor = fillTunnelStructureColor;
        return this;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationOptions
    public /* bridge */ /* synthetic */ Annotation build(String str, AnnotationManager annotationManager) {
        return build(str, (AnnotationManager<Polygon, PolygonAnnotation, ?, ?, ?, ?, ?>) annotationManager);
    }
}
