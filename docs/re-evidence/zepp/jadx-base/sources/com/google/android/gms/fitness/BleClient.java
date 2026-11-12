package com.google.android.gms.fitness;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.internal.fitness.zzco;
import com.google.android.gms.internal.fitness.zzen;
import com.google.android.gms.internal.fitness.zzk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BleClient extends GoogleApi<Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final BleApi k;

    static {
        k = PlatformVersion.isAtLeastJellyBeanMR2() ? new zzco() : new zzen();
    }

    @ShowFirstParty
    public BleClient(@RecentlyNonNull Context context, @RecentlyNonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, zzk.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    public Task<Void> claimBleDevice(@RecentlyNonNull BleDevice bleDevice) {
        return PendingResultUtil.toVoidTask(k.claimBleDevice(asGoogleApiClient(), bleDevice));
    }

    @RecentlyNonNull
    public Task<List<BleDevice>> listClaimedBleDevices() {
        return PendingResultUtil.toTask(k.listClaimedBleDevices(asGoogleApiClient()), a.a);
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public Task<Void> startBleScan(@RecentlyNonNull List<DataType> list, int i, @RecentlyNonNull BleScanCallback bleScanCallback) {
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            return Tasks.forException(new ApiException(zzen.zzqh));
        }
        ListenerHolder<L> listenerHolderRegisterListener = registerListener(bleScanCallback, BleScanCallback.class.getSimpleName());
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new b(this, listenerHolderRegisterListener, list, i)).unregister(new c(this, listenerHolderRegisterListener)).build());
    }

    @RecentlyNonNull
    public Task<Boolean> stopBleScan(@RecentlyNonNull BleScanCallback bleScanCallback) {
        return !PlatformVersion.isAtLeastJellyBeanMR2() ? Tasks.forException(new ApiException(zzen.zzqh)) : doUnregisterEventListener(ListenerHolders.createListenerKey(bleScanCallback, BleScanCallback.class.getSimpleName()));
    }

    @RecentlyNonNull
    public Task<Void> unclaimBleDevice(@RecentlyNonNull String str) {
        return PendingResultUtil.toVoidTask(k.unclaimBleDevice(asGoogleApiClient(), str));
    }

    public BleClient(@NonNull Activity activity, @NonNull Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, zzk.zzoz, hasGoogleSignInAccountOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @RecentlyNonNull
    public Task<Void> claimBleDevice(@RecentlyNonNull String str) {
        return PendingResultUtil.toVoidTask(k.claimBleDevice(asGoogleApiClient(), str));
    }

    @RecentlyNonNull
    public Task<Void> unclaimBleDevice(@RecentlyNonNull BleDevice bleDevice) {
        return PendingResultUtil.toVoidTask(k.unclaimBleDevice(asGoogleApiClient(), bleDevice));
    }
}
