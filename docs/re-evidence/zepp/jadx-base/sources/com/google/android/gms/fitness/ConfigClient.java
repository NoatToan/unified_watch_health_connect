package com.google.android.gms.fitness;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import com.google.android.gms.internal.fitness.zzcw;
import com.google.android.gms.internal.fitness.zzq;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigClient extends GoogleApi<Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final ConfigApi k = new zzcw();

    @ShowFirstParty
    public ConfigClient(@RecentlyNonNull Context context, @RecentlyNonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, zzq.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final /* synthetic */ DataType d(DataTypeResult dataTypeResult) {
        return (DataType) Preconditions.checkNotNull(dataTypeResult.getDataType());
    }

    public static final /* synthetic */ DataType e(DataTypeResult dataTypeResult) {
        return (DataType) Preconditions.checkNotNull(dataTypeResult.getDataType());
    }

    @RecentlyNonNull
    @Deprecated
    public Task<DataType> createCustomDataType(@RecentlyNonNull DataTypeCreateRequest dataTypeCreateRequest) {
        return PendingResultUtil.toTask(k.createCustomDataType(asGoogleApiClient(), dataTypeCreateRequest), e.a);
    }

    @RecentlyNonNull
    public Task<Void> disableFit() {
        return PendingResultUtil.toVoidTask(k.disableFit(asGoogleApiClient()));
    }

    @RecentlyNonNull
    @Deprecated
    public Task<DataType> readDataType(@RecentlyNonNull String str) {
        return PendingResultUtil.toTask(k.readDataType(asGoogleApiClient(), str), d.a);
    }

    public ConfigClient(@NonNull Activity activity, @NonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, zzq.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
