package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zzak extends GoogleApi<zzf> implements CredentialSavingClient {
    private static final Api.ClientKey<zzab> k;
    private static final Api.AbstractClientBuilder<zzab, zzf> l;
    private static final Api<zzf> m;

    static {
        Api.ClientKey<zzab> clientKey = new Api.ClientKey<>();
        k = clientKey;
        a aVar = new a();
        l = aVar;
        m = new Api<>("Auth.Api.Identity.CredentialSaving.API", aVar, clientKey);
    }

    public zzak(@NonNull Context context, @NonNull zzf zzfVar) {
        super(context, m, zzf.zzc.zzc(zzfVar).zze(zzba.zzw()).zzi(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SavePasswordResult> savePassword(@NonNull SavePasswordRequest savePasswordRequest) {
        final SavePasswordRequest savePasswordRequestBuild = SavePasswordRequest.zzc(savePasswordRequest).zzg(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdg).run(new RemoteCall(this, savePasswordRequestBuild) { // from class: com.google.android.gms.internal.auth-api.b
            private final zzak a;
            private final SavePasswordRequest b;

            {
                this.a = this;
                this.b = savePasswordRequestBuild;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzak zzakVar = this.a;
                SavePasswordRequest savePasswordRequest2 = this.b;
                ((zzac) ((zzab) obj).getService()).zzc(new c(zzakVar, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest2));
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    public zzak(@NonNull Activity activity, @NonNull zzf zzfVar) {
        super(activity, m, zzf.zzc.zzc(zzfVar).zze(zzba.zzw()).zzi(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
