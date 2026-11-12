package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomLayerRenderParameters implements Serializable {
    private final double bearing;
    private final DepthRange depthRange;
    private final ElevationData elevationData;
    private final double fieldOfView;
    private final double height;
    private final double latitude;
    private final double longitude;
    private final double pitch;
    private final CustomLayerMapProjection projection;
    private final List<Double> projectionMatrix;
    private final List<CanonicalTileID> renderToTilesIDs;
    private final double width;
    private final double zoom;

    private CustomLayerRenderParameters(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, List<Double> list, DepthRange depthRange, ElevationData elevationData, List<CanonicalTileID> list2, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d14;
        this.height = d15;
        this.latitude = d16;
        this.longitude = d17;
        this.zoom = d18;
        this.bearing = d19;
        this.pitch = d24;
        this.fieldOfView = d25;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = list2;
        this.projection = customLayerMapProjection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderParameters.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderParameters customLayerRenderParameters = (CustomLayerRenderParameters) obj;
        return Double.compare(this.width, customLayerRenderParameters.width) == 0 && Double.compare(this.height, customLayerRenderParameters.height) == 0 && Double.compare(this.latitude, customLayerRenderParameters.latitude) == 0 && Double.compare(this.longitude, customLayerRenderParameters.longitude) == 0 && Double.compare(this.zoom, customLayerRenderParameters.zoom) == 0 && Double.compare(this.bearing, customLayerRenderParameters.bearing) == 0 && Double.compare(this.pitch, customLayerRenderParameters.pitch) == 0 && Double.compare(this.fieldOfView, customLayerRenderParameters.fieldOfView) == 0 && Objects.equals(this.projectionMatrix, customLayerRenderParameters.projectionMatrix) && Objects.equals(this.depthRange, customLayerRenderParameters.depthRange) && Objects.equals(this.elevationData, customLayerRenderParameters.elevationData) && Objects.equals(this.renderToTilesIDs, customLayerRenderParameters.renderToTilesIDs) && Objects.equals(this.projection, customLayerRenderParameters.projection);
    }

    public double getBearing() {
        return this.bearing;
    }

    public DepthRange getDepthRange() {
        return this.depthRange;
    }

    public ElevationData getElevationData() {
        return this.elevationData;
    }

    public double getFieldOfView() {
        return this.fieldOfView;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getPitch() {
        return this.pitch;
    }

    public CustomLayerMapProjection getProjection() {
        return this.projection;
    }

    public List<Double> getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public List<CanonicalTileID> getRenderToTilesIDs() {
        return this.renderToTilesIDs;
    }

    public double getWidth() {
        return this.width;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.latitude), Double.valueOf(this.longitude), Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch), Double.valueOf(this.fieldOfView), this.projectionMatrix, this.depthRange, this.elevationData, this.renderToTilesIDs, this.projection);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[width: ");
        com.google.protobuf.a.c(this.width, ", height: ", sb3);
        com.google.protobuf.a.c(this.height, ", latitude: ", sb3);
        com.google.protobuf.a.c(this.latitude, ", longitude: ", sb3);
        com.google.protobuf.a.c(this.longitude, ", zoom: ", sb3);
        com.google.protobuf.a.c(this.zoom, ", bearing: ", sb3);
        com.google.protobuf.a.c(this.bearing, ", pitch: ", sb3);
        com.google.protobuf.a.c(this.pitch, ", fieldOfView: ", sb3);
        com.google.protobuf.a.c(this.fieldOfView, ", projectionMatrix: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.projectionMatrix));
        sb3.append(", depthRange: ");
        sb3.append(RecordUtils.fieldToString(this.depthRange));
        sb3.append(", elevationData: ");
        sb3.append(RecordUtils.fieldToString(this.elevationData));
        sb3.append(", renderToTilesIDs: ");
        sb3.append(RecordUtils.fieldToString(this.renderToTilesIDs));
        sb3.append(", projection: ");
        sb3.append(RecordUtils.fieldToString(this.projection));
        sb3.append("]");
        return sb3.toString();
    }

    @Deprecated
    public CustomLayerRenderParameters(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, List<Double> list, DepthRange depthRange, ElevationData elevationData, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d14;
        this.height = d15;
        this.latitude = d16;
        this.longitude = d17;
        this.zoom = d18;
        this.bearing = d19;
        this.pitch = d24;
        this.fieldOfView = d25;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = null;
        this.projection = customLayerMapProjection;
    }
}
