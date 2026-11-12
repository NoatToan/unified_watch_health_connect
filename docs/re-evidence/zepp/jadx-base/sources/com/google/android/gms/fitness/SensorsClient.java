package com.google.android.gms.fitness;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.internal.fitness.zzap;
import com.google.android.gms.internal.fitness.zzdx;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SensorsClient extends GoogleApi<Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final SensorsApi k = new zzdx();

    @ShowFirstParty
    public SensorsClient(@RecentlyNonNull Context context, @RecentlyNonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, zzap.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    public Task<Void> add(@RecentlyNonNull SensorRequest sensorRequest, @RecentlyNonNull OnDataPointListener onDataPointListener) {
        ListenerHolder<L> listenerHolderRegisterListener = registerListener(onDataPointListener, OnDataPointListener.class.getSimpleName());
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new m(this, listenerHolderRegisterListener, sensorRequest)).unregister(new n(this, listenerHolderRegisterListener)).build());
    }

    @RecentlyNonNull
    public Task<List<DataSource>> findDataSources(@RecentlyNonNull DataSourcesRequest dataSourcesRequest) {
        return PendingResultUtil.toTask(k.findDataSources(asGoogleApiClient(), dataSourcesRequest), l.a);
    }

    @RecentlyNonNull
    public Task<Boolean> remove(@RecentlyNonNull OnDataPointListener onDataPointListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(onDataPointListener, OnDataPointListener.class.getSimpleName()));
    }

    public SensorsClient(@NonNull Activity activity, @NonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, zzap.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    public Task<Void> remove(@RecentlyNonNull PendingIntent pendingIntent) {
        return PendingResultUtil.toVoidTask(k.remove(asGoogleApiClient(), pendingIntent));
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    @SuppressLint({"InlinedApi"})
    public Task<Void> add(@RecentlyNonNull SensorRequest sensorRequest, @RecentlyNonNull PendingIntent pendingIntent) {
        return PendingResultUtil.toVoidTask(k.add(asGoogleApiClient(), sensorRequest, pendingIntent));
    }
}
