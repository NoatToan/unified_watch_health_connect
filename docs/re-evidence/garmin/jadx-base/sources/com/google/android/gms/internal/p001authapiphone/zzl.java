package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public final class zzl extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeAutofillClient {
    private static final Api.ClientKey<zzx> zza;
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;

    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzc = new Api<>("SmsCodeAutofill.API", zzpVar, clientKey);
    }

    public zzl(Context context) {
        super(context, zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Integer> checkPermissionState() {
        return doRead(TaskApiCall.builder().setFeatures(zzad.zza).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzn
            private final zzl zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzx) obj).getService()).zza(new zzr(this.zza, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(TaskApiCall.builder().setFeatures(zzad.zza).run(new RemoteCall(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzq
            private final zzl zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzl zzlVar = this.zza;
                ((zzh) ((zzx) obj).getService()).zza(this.zzb, new zzu(zzlVar, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(zzad.zza).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzo
            private final zzl zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzx) obj).getService()).zza(new zzs(this.zza, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    public zzl(Activity activity) {
        super(activity, (Api<Api.ApiOptions>) zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
