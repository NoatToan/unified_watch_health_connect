package com.google.android.gms.fitness;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResponse;
import com.google.android.gms.internal.fitness.zzad;
import com.google.android.gms.internal.fitness.zzde;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public class HistoryClient extends GoogleApi<Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final HistoryApi k = new zzde();

    @ShowFirstParty
    public HistoryClient(@RecentlyNonNull Context context, @RecentlyNonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, zzad.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final /* synthetic */ DataSet d(DailyTotalResult dailyTotalResult) {
        return (DataSet) Preconditions.checkNotNull(dailyTotalResult.getTotal());
    }

    public static final /* synthetic */ DataSet e(DailyTotalResult dailyTotalResult) {
        return (DataSet) Preconditions.checkNotNull(dailyTotalResult.getTotal());
    }

    @RecentlyNonNull
    public Task<Void> deleteData(@RecentlyNonNull DataDeleteRequest dataDeleteRequest) {
        return PendingResultUtil.toVoidTask(k.deleteData(asGoogleApiClient(), dataDeleteRequest));
    }

    @RecentlyNonNull
    public Task<Void> insertData(@RecentlyNonNull DataSet dataSet) {
        return PendingResultUtil.toVoidTask(k.insertData(asGoogleApiClient(), dataSet));
    }

    @RecentlyNonNull
    public Task<DataSet> readDailyTotal(@RecentlyNonNull DataType dataType) {
        return PendingResultUtil.toTask(k.readDailyTotal(asGoogleApiClient(), dataType), h.a);
    }

    @RecentlyNonNull
    public Task<DataSet> readDailyTotalFromLocalDevice(@RecentlyNonNull DataType dataType) {
        return PendingResultUtil.toTask(k.readDailyTotalFromLocalDevice(asGoogleApiClient(), dataType), i.a);
    }

    @RecentlyNonNull
    public Task<DataReadResponse> readData(@RecentlyNonNull DataReadRequest dataReadRequest) {
        return PendingResultUtil.toResponseTask(k.readData(asGoogleApiClient(), dataReadRequest), new DataReadResponse());
    }

    @RecentlyNonNull
    public Task<Void> registerDataUpdateListener(@RecentlyNonNull DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return PendingResultUtil.toVoidTask(k.registerDataUpdateListener(asGoogleApiClient(), dataUpdateListenerRegistrationRequest));
    }

    @RecentlyNonNull
    public Task<Void> unregisterDataUpdateListener(@RecentlyNonNull PendingIntent pendingIntent) {
        return PendingResultUtil.toVoidTask(k.unregisterDataUpdateListener(asGoogleApiClient(), pendingIntent));
    }

    @RecentlyNonNull
    public Task<Void> updateData(@RecentlyNonNull DataUpdateRequest dataUpdateRequest) {
        return PendingResultUtil.toVoidTask(k.updateData(asGoogleApiClient(), dataUpdateRequest));
    }

    public HistoryClient(@NonNull Activity activity, @NonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, zzad.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
