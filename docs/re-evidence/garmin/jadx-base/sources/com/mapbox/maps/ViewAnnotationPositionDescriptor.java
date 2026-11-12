package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class ViewAnnotationPositionDescriptor implements Serializable {
    private final ViewAnnotationAnchorConfig anchorConfig;
    private final Point anchorCoordinate;
    private final double height;
    private final String identifier;
    private final ScreenCoordinate leftTopCoordinate;
    private final double width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ViewAnnotationPositionDescriptor(String str, double d14, double d15, ScreenCoordinate screenCoordinate, Point point, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig) {
        this.identifier = str;
        this.width = d14;
        this.height = d15;
        this.leftTopCoordinate = screenCoordinate;
        this.anchorCoordinate = point;
        this.anchorConfig = viewAnnotationAnchorConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewAnnotationPositionDescriptor viewAnnotationPositionDescriptor = (ViewAnnotationPositionDescriptor) obj;
        return Objects.equals(this.identifier, viewAnnotationPositionDescriptor.identifier) && PartialEq.compare(this.width, viewAnnotationPositionDescriptor.width) && PartialEq.compare(this.height, viewAnnotationPositionDescriptor.height) && Objects.equals(this.leftTopCoordinate, viewAnnotationPositionDescriptor.leftTopCoordinate) && Objects.equals(this.anchorCoordinate, viewAnnotationPositionDescriptor.anchorCoordinate) && Objects.equals(this.anchorConfig, viewAnnotationPositionDescriptor.anchorConfig);
    }

    public ViewAnnotationAnchorConfig getAnchorConfig() {
        return this.anchorConfig;
    }

    public Point getAnchorCoordinate() {
        return this.anchorCoordinate;
    }

    public double getHeight() {
        return this.height;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public ScreenCoordinate getLeftTopCoordinate() {
        return this.leftTopCoordinate;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.identifier, Double.valueOf(this.width), Double.valueOf(this.height), this.leftTopCoordinate, this.anchorCoordinate, this.anchorConfig);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[identifier: ");
        com.google.protobuf.a.k(this.identifier, ", width: ", sb3);
        com.google.protobuf.a.c(this.width, ", height: ", sb3);
        com.google.protobuf.a.c(this.height, ", leftTopCoordinate: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.leftTopCoordinate));
        sb3.append(", anchorCoordinate: ");
        sb3.append(RecordUtils.fieldToString(this.anchorCoordinate));
        sb3.append(", anchorConfig: ");
        sb3.append(RecordUtils.fieldToString(this.anchorConfig));
        sb3.append("]");
        return sb3.toString();
    }
}
