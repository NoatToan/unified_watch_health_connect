package com.huawei.hms.maps;

import android.app.Activity;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;

/* JADX INFO: loaded from: classes34.dex */
public interface man extends LifecycleDelegate {
    void a(Activity activity);

    void getMapAsync(OnMapReadyCallback onMapReadyCallback);
}
