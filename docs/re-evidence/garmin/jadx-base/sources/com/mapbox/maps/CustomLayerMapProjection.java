package com.mapbox.maps;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomLayerMapProjection {
    List<Double> convertMercatorModelMatrix(List<Double> list, boolean z14);

    List<Double> getModelMatrix();

    List<Double> getTransitionMatrix();

    float getTransitionPhase();
}
