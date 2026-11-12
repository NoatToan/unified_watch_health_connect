package com.huami.watch.companion.location;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public interface LocationListener {
    public static final int LOCATION_ERROR_NETWORK = 1;
    public static final int LOCATION_ERROR_NO_PERMISSION = 2;

    void onLocationError(int i);

    void onLocationReceived(@NonNull Location location);
}
