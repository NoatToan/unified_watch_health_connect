package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface StylePacksCallback {
    void run(Expected<StylePackError, List<StylePack>> expected);
}
