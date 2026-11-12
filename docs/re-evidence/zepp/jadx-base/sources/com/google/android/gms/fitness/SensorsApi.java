package com.google.android.gms.fitness;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface SensorsApi {
    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    PendingResult<Status> add(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull SensorRequest sensorRequest, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    PendingResult<Status> add(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull SensorRequest sensorRequest, @RecentlyNonNull OnDataPointListener onDataPointListener);

    @RecentlyNonNull
    PendingResult<DataSourcesResult> findDataSources(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataSourcesRequest dataSourcesRequest);

    @RecentlyNonNull
    PendingResult<Status> remove(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    PendingResult<Status> remove(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull OnDataPointListener onDataPointListener);
}
