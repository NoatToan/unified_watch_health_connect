package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.internal.p001authapiphone.zzi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {
    private static final Api.ClientKey<zzi> k;
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> l;
    private static final Api<Api.ApiOptions.NoOptions> m;

    static {
        Api.ClientKey<zzi> clientKey = new Api.ClientKey<>();
        k = clientKey;
        a aVar = new a();
        l = aVar;
        m = new Api<>("SmsRetriever.API", aVar, clientKey);
    }

    public SmsRetrieverClient(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions>) m, (Api.ApiOptions) null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public SmsRetrieverClient(@NonNull Context context) {
        super(context, m, (Api.ApiOptions) null, new ApiExceptionMapper());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract Task<Void> startSmsRetriever();
}
