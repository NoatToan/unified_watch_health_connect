package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface QuerySourceFeaturesCallback {
    void run(Expected<String, List<QueriedSourceFeature>> expected);
}
