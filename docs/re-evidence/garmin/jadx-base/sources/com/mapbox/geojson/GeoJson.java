package com.mapbox.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface GeoJson extends Serializable {
    BoundingBox bbox();

    String toJson();

    String type();
}
