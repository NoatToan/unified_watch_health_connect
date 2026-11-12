package com.google.android.gms.fitness;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.fitness.zzaj;
import com.google.android.gms.internal.fitness.zzdo;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RecordingClient extends GoogleApi<Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final RecordingApi k = new zzdo();

    @ShowFirstParty
    public RecordingClient(@RecentlyNonNull Context context, @RecentlyNonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, zzaj.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    public Task<List<Subscription>> listSubscriptions() {
        return PendingResultUtil.toTask(k.listSubscriptions(asGoogleApiClient()), j.a);
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    public Task<Void> subscribe(@RecentlyNonNull DataType dataType) {
        return PendingResultUtil.toVoidTask(k.subscribe(asGoogleApiClient(), dataType));
    }

    @RecentlyNonNull
    public Task<Void> unsubscribe(@RecentlyNonNull DataType dataType) {
        return PendingResultUtil.toVoidTask(k.unsubscribe(asGoogleApiClient(), dataType));
    }

    public RecordingClient(@NonNull Activity activity, @NonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, zzaj.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    public Task<Void> subscribe(@RecentlyNonNull DataSource dataSource) {
        return PendingResultUtil.toVoidTask(k.subscribe(asGoogleApiClient(), dataSource));
    }

    @RecentlyNonNull
    public Task<Void> unsubscribe(@RecentlyNonNull DataSource dataSource) {
        return PendingResultUtil.toVoidTask(k.unsubscribe(asGoogleApiClient(), dataSource));
    }

    @RecentlyNonNull
    public Task<List<Subscription>> listSubscriptions(@RecentlyNonNull DataType dataType) {
        return PendingResultUtil.toTask(k.listSubscriptions(asGoogleApiClient(), dataType), k.a);
    }

    @RecentlyNonNull
    public Task<Void> unsubscribe(@RecentlyNonNull Subscription subscription) {
        return PendingResultUtil.toVoidTask(k.unsubscribe(asGoogleApiClient(), subscription));
    }
}
