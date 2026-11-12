package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import j20.x;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            x.l("Null southwest");
            throw null;
        }
        this.southwest = point;
        if (point2 != null) {
            this.northeast = point2;
        } else {
            x.l("Null northeast");
            throw null;
        }
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d14, double d15, double d16, double d17) {
        return fromLngLats(d14, d15, d16, d17);
    }

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(double d14, double d15, double d16, double d17) {
        return new BoundingBox(Point.fromLngLat(d14, d15), Point.fromLngLat(d16, d17));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final double north() {
        return northeast().latitude();
    }

    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        return new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().toJson(this, BoundingBox.class);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + StringSubstitutor.DEFAULT_VAR_END;
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d14, double d15, double d16, double d17, double d18, double d19) {
        return fromLngLats(d14, d15, d16, d17, d18, d19);
    }

    public static BoundingBox fromLngLats(double d14, double d15, double d16, double d17, double d18, double d19) {
        return new BoundingBox(Point.fromLngLat(d14, d15, d16), Point.fromLngLat(d17, d18, d19));
    }
}
