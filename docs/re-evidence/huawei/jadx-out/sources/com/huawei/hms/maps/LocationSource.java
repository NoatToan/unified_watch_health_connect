package com.huawei.hms.maps;

import android.location.Location;

/* JADX INFO: loaded from: classes34.dex */
public interface LocationSource {

    public interface OnLocationChangedListener {
        void onLocationChanged(Location location);
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
