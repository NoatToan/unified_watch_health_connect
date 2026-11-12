package com.google.android.gms.internal.fitness;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq extends zzj<zzbq> {
    public static final Api<Api.ApiOptions.NoOptions> API;
    private static final zzf.zza F = zzf.zza.FIT_CONFIG;
    private static final Api.ClientKey<zzq> G;
    public static final Api<Api.ApiOptions.HasGoogleSignInAccountOptions> zzoz;

    static {
        Api.ClientKey<zzq> clientKey = new Api.ClientKey<>();
        G = clientKey;
        v5 v5Var = null;
        API = new Api<>("Fitness.CONFIG_API", new u5(), clientKey);
        zzoz = new Api<>("Fitness.CONFIG_CLIENT", new w5(), clientKey);
    }

    private zzq(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, F, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbt(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.fitness.ConfigApi";
    }
}
