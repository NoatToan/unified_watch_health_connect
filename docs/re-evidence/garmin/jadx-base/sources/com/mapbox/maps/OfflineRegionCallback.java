package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface OfflineRegionCallback {
    void run(Expected<String, List<OfflineRegion>> expected);
}
