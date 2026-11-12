package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface SettingsApi {
    @RecentlyNonNull
    PendingResult<LocationSettingsResult> checkLocationSettings(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull LocationSettingsRequest locationSettingsRequest);
}
