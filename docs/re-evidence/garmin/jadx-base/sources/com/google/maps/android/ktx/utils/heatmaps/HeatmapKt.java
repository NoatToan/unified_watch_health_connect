package com.google.maps.android.ktx.utils.heatmaps;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.heatmaps.Gradient;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import com.google.maps.android.heatmaps.WeightedLatLng;
import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a?\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0086\b\u001a?\u0010\u000f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0086\b¨\u0006\u0010"}, d2 = {"toWeightedLatLng", "Lcom/google/maps/android/heatmaps/WeightedLatLng;", "Lcom/google/android/gms/maps/model/LatLng;", "intensity", "", "heatmapTileProviderWithData", "Lcom/google/maps/android/heatmaps/HeatmapTileProvider;", "latLngs", "", "radius", "", "gradient", "Lcom/google/maps/android/heatmaps/Gradient;", "opacity", "maxIntensity", "heatmapTileProviderWithWeightedData", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HeatmapKt {
    public static final HeatmapTileProvider heatmapTileProviderWithData(Collection<LatLng> collection, int i14, Gradient gradient, double d14, double d15) {
        collection.getClass();
        gradient.getClass();
        HeatmapTileProvider heatmapTileProviderBuild = new HeatmapTileProvider.Builder().data(collection).radius(i14).gradient(gradient).opacity(d14).maxIntensity(d15).build();
        heatmapTileProviderBuild.getClass();
        return heatmapTileProviderBuild;
    }

    public static /* synthetic */ HeatmapTileProvider heatmapTileProviderWithData$default(Collection collection, int i14, Gradient gradient, double d14, double d15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i14 = 20;
        }
        if ((i15 & 4) != 0) {
            gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        }
        if ((i15 & 8) != 0) {
            d14 = 0.7d;
        }
        if ((i15 & 16) != 0) {
            d15 = 0.0d;
        }
        collection.getClass();
        gradient.getClass();
        HeatmapTileProvider heatmapTileProviderBuild = new HeatmapTileProvider.Builder().data(collection).radius(i14).gradient(gradient).opacity(d14).maxIntensity(d15).build();
        heatmapTileProviderBuild.getClass();
        return heatmapTileProviderBuild;
    }

    public static final HeatmapTileProvider heatmapTileProviderWithWeightedData(Collection<? extends WeightedLatLng> collection, int i14, Gradient gradient, double d14, double d15) {
        collection.getClass();
        gradient.getClass();
        HeatmapTileProvider heatmapTileProviderBuild = new HeatmapTileProvider.Builder().weightedData(collection).radius(i14).gradient(gradient).opacity(d14).maxIntensity(d15).build();
        heatmapTileProviderBuild.getClass();
        return heatmapTileProviderBuild;
    }

    public static /* synthetic */ HeatmapTileProvider heatmapTileProviderWithWeightedData$default(Collection collection, int i14, Gradient gradient, double d14, double d15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i14 = 20;
        }
        if ((i15 & 4) != 0) {
            gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        }
        if ((i15 & 8) != 0) {
            d14 = 0.7d;
        }
        if ((i15 & 16) != 0) {
            d15 = 0.0d;
        }
        collection.getClass();
        gradient.getClass();
        HeatmapTileProvider heatmapTileProviderBuild = new HeatmapTileProvider.Builder().weightedData(collection).radius(i14).gradient(gradient).opacity(d14).maxIntensity(d15).build();
        heatmapTileProviderBuild.getClass();
        return heatmapTileProviderBuild;
    }

    public static final WeightedLatLng toWeightedLatLng(LatLng latLng, double d14) {
        latLng.getClass();
        return new WeightedLatLng(latLng, d14);
    }

    public static /* synthetic */ WeightedLatLng toWeightedLatLng$default(LatLng latLng, double d14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d14 = 1.0d;
        }
        latLng.getClass();
        return new WeightedLatLng(latLng, d14);
    }
}
