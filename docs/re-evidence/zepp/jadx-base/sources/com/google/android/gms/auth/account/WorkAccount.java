package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* JADX INFO: loaded from: classes3.dex */
public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API;

    @Deprecated
    public static final WorkAccountApi WorkAccountApi;
    private static final Api.ClientKey<zzr> a;
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> b;

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        b = aVar;
        API = new Api<>("WorkAccount.API", aVar, clientKey);
        WorkAccountApi = new zzh();
    }

    private WorkAccount() {
    }

    public static WorkAccountClient getClient(@NonNull Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(@NonNull Context context) {
        return new WorkAccountClient(context);
    }
}
