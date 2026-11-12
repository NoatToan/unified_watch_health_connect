package com.google.android.gms.internal.fitness;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes3.dex */
public final class zzav extends zzj<zzca> {
    public static final Api<Api.ApiOptions.NoOptions> API;
    private static final zzf.zza F = zzf.zza.FIT_SESSIONS;
    private static final Api.ClientKey<zzav> G;
    public static final Api<Api.ApiOptions.HasGoogleSignInAccountOptions> zzoz;

    static {
        Api.ClientKey<zzav> clientKey = new Api.ClientKey<>();
        G = clientKey;
        r rVar = null;
        API = new Api<>("Fitness.SESSIONS_API", new t(), clientKey);
        zzoz = new Api<>("Fitness.SESSIONS_CLIENT", new v(), clientKey);
    }

    private zzav(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, F, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
        return iInterfaceQueryLocalInterface instanceof zzca ? (zzca) iInterfaceQueryLocalInterface : new zzcd(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzj, com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.fitness.SessionsApi";
    }
}
