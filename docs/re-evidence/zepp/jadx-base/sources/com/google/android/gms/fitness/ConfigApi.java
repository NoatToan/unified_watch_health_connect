package com.google.android.gms.fitness;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface ConfigApi {
    @RecentlyNonNull
    @Deprecated
    PendingResult<DataTypeResult> createCustomDataType(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataTypeCreateRequest dataTypeCreateRequest);

    @RecentlyNonNull
    PendingResult<Status> disableFit(@RecentlyNonNull GoogleApiClient googleApiClient);

    @RecentlyNonNull
    @Deprecated
    PendingResult<DataTypeResult> readDataType(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull String str);
}
