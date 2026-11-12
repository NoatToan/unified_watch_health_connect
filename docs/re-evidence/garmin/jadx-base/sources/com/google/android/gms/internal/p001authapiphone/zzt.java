package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public final class zzt extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeBrowserClient {
    private static final Api.ClientKey<zzx> zza;
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;

    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new Api<>("SmsCodeBrowser.API", zzvVar, clientKey);
    }

    public zzt(Context context) {
        super(context, zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeBrowserClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(zzad.zzb).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzw
            private final zzt zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzx) obj).getService()).zzb(new zzy(this.zza, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    public zzt(Activity activity) {
        super(activity, (Api<Api.ApiOptions>) zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
