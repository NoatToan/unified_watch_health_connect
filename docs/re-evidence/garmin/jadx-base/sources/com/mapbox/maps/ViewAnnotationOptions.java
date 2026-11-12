package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationOptions implements Serializable {
    private final Boolean allowOverlap;
    private final Boolean allowOverlapWithPuck;
    private final Boolean allowZElevate;
    private final AnnotatedFeature annotatedFeature;
    private final Double height;
    private final Boolean ignoreCameraPadding;
    private final Float maxZoom;
    private final Float minZoom;
    private final Long priority;
    private final Boolean selected;
    private final List<ViewAnnotationAnchorConfig> variableAnchors;
    private final Boolean visible;
    private final Double width;

    public static final class Builder {
        private Boolean allowOverlap;
        private Boolean allowOverlapWithPuck;
        private Boolean allowZElevate;
        private AnnotatedFeature annotatedFeature;
        private Double height;
        private Boolean ignoreCameraPadding;
        private Float maxZoom;
        private Float minZoom;
        private Long priority;
        private Boolean selected;
        private List<ViewAnnotationAnchorConfig> variableAnchors;
        private Boolean visible;
        private Double width;

        public Builder allowOverlap(Boolean bool) {
            this.allowOverlap = bool;
            return this;
        }

        public Builder allowOverlapWithPuck(Boolean bool) {
            this.allowOverlapWithPuck = bool;
            return this;
        }

        public Builder allowZElevate(Boolean bool) {
            this.allowZElevate = bool;
            return this;
        }

        public Builder annotatedFeature(AnnotatedFeature annotatedFeature) {
            this.annotatedFeature = annotatedFeature;
            return this;
        }

        public ViewAnnotationOptions build() {
            return new ViewAnnotationOptions(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom);
        }

        public Builder height(Double d14) {
            this.height = d14;
            return this;
        }

        public Builder ignoreCameraPadding(Boolean bool) {
            this.ignoreCameraPadding = bool;
            return this;
        }

        public Builder maxZoom(Float f14) {
            this.maxZoom = f14;
            return this;
        }

        public Builder minZoom(Float f14) {
            this.minZoom = f14;
            return this;
        }

        public Builder priority(Long l14) {
            this.priority = l14;
            return this;
        }

        @Deprecated
        public Builder selected(Boolean bool) {
            this.selected = bool;
            return this;
        }

        public Builder variableAnchors(List<ViewAnnotationAnchorConfig> list) {
            this.variableAnchors = list;
            return this;
        }

        public Builder visible(Boolean bool) {
            this.visible = bool;
            return this;
        }

        public Builder width(Double d14) {
            this.width = d14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private ViewAnnotationOptions(AnnotatedFeature annotatedFeature, Double d14, Double d15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<ViewAnnotationAnchorConfig> list, Boolean bool5, Long l14, Boolean bool6, Float f14, Float f15) {
        this.annotatedFeature = annotatedFeature;
        this.width = d14;
        this.height = d15;
        this.allowOverlap = bool;
        this.allowOverlapWithPuck = bool2;
        this.allowZElevate = bool3;
        this.visible = bool4;
        this.variableAnchors = list;
        this.selected = bool5;
        this.priority = l14;
        this.ignoreCameraPadding = bool6;
        this.minZoom = f14;
        this.maxZoom = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationOptions.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) obj;
        return Objects.equals(this.annotatedFeature, viewAnnotationOptions.annotatedFeature) && Objects.equals(this.width, viewAnnotationOptions.width) && Objects.equals(this.height, viewAnnotationOptions.height) && Objects.equals(this.allowOverlap, viewAnnotationOptions.allowOverlap) && Objects.equals(this.allowOverlapWithPuck, viewAnnotationOptions.allowOverlapWithPuck) && Objects.equals(this.allowZElevate, viewAnnotationOptions.allowZElevate) && Objects.equals(this.visible, viewAnnotationOptions.visible) && Objects.equals(this.variableAnchors, viewAnnotationOptions.variableAnchors) && Objects.equals(this.selected, viewAnnotationOptions.selected) && Objects.equals(this.priority, viewAnnotationOptions.priority) && Objects.equals(this.ignoreCameraPadding, viewAnnotationOptions.ignoreCameraPadding) && Objects.equals(this.minZoom, viewAnnotationOptions.minZoom) && Objects.equals(this.maxZoom, viewAnnotationOptions.maxZoom);
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public Boolean getAllowOverlapWithPuck() {
        return this.allowOverlapWithPuck;
    }

    public Boolean getAllowZElevate() {
        return this.allowZElevate;
    }

    public AnnotatedFeature getAnnotatedFeature() {
        return this.annotatedFeature;
    }

    public Double getHeight() {
        return this.height;
    }

    public Boolean getIgnoreCameraPadding() {
        return this.ignoreCameraPadding;
    }

    public Float getMaxZoom() {
        return this.maxZoom;
    }

    public Float getMinZoom() {
        return this.minZoom;
    }

    public Long getPriority() {
        return this.priority;
    }

    @Deprecated
    public Boolean getSelected() {
        return this.selected;
    }

    public List<ViewAnnotationAnchorConfig> getVariableAnchors() {
        return this.variableAnchors;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom);
    }

    public Builder toBuilder() {
        return new Builder().annotatedFeature(this.annotatedFeature).width(this.width).height(this.height).allowOverlap(this.allowOverlap).allowOverlapWithPuck(this.allowOverlapWithPuck).allowZElevate(this.allowZElevate).visible(this.visible).variableAnchors(this.variableAnchors).selected(this.selected).priority(this.priority).ignoreCameraPadding(this.ignoreCameraPadding).minZoom(this.minZoom).maxZoom(this.maxZoom);
    }

    public String toString() {
        return "[annotatedFeature: " + RecordUtils.fieldToString(this.annotatedFeature) + ", width: " + RecordUtils.fieldToString(this.width) + ", height: " + RecordUtils.fieldToString(this.height) + ", allowOverlap: " + RecordUtils.fieldToString(this.allowOverlap) + ", allowOverlapWithPuck: " + RecordUtils.fieldToString(this.allowOverlapWithPuck) + ", allowZElevate: " + RecordUtils.fieldToString(this.allowZElevate) + ", visible: " + RecordUtils.fieldToString(this.visible) + ", variableAnchors: " + RecordUtils.fieldToString(this.variableAnchors) + ", selected: " + RecordUtils.fieldToString(this.selected) + ", priority: " + RecordUtils.fieldToString(this.priority) + ", ignoreCameraPadding: " + RecordUtils.fieldToString(this.ignoreCameraPadding) + ", minZoom: " + RecordUtils.fieldToString(this.minZoom) + ", maxZoom: " + RecordUtils.fieldToString(this.maxZoom) + "]";
    }
}
