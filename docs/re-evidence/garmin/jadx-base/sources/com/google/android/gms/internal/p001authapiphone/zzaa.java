package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaa extends SmsRetrieverClient {
    public zzaa(Context context) {
        super(context);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsRetriever() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzz
            private final zzaa zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzx) obj).getService()).zza(new zzab(this.zza, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzad.zzc).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzac
            private final zzaa zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzaa zzaaVar = this.zza;
                ((zzh) ((zzx) obj).getService()).zza(this.zzb, new zzae(zzaaVar, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzad.zzd).build());
    }

    public zzaa(Activity activity) {
        super(activity);
    }
}
