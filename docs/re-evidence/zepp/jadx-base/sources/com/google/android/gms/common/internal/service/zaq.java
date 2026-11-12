package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zaq extends GoogleApi<Api.ApiOptions.NoOptions> implements zaac {
    private static final Api.ClientKey<zar> k;
    private static final Api.AbstractClientBuilder<zar, Api.ApiOptions.NoOptions> l;
    private static final Api<Api.ApiOptions.NoOptions> m;

    static {
        Api.ClientKey<zar> clientKey = new Api.ClientKey<>();
        k = clientKey;
        g gVar = new g();
        l = gVar;
        m = new Api<>("ClientTelemetry.API", gVar, clientKey);
    }

    public zaq(Context context) {
        super(context, m, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final /* synthetic */ void d(zaaa zaaaVar, zar zarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zak) zarVar.getService()).zaa(zaaaVar);
        taskCompletionSource.setResult(null);
    }

    @Override // com.google.android.gms.common.internal.zaac
    public final Task<Void> zaa(final zaaa zaaaVar) {
        return doBestEffortWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.internal.base.zae.zaa).setAutoResolveMissingFeatures(false).run(new RemoteCall(zaaaVar) { // from class: com.google.android.gms.common.internal.service.f
            private final zaaa a;

            {
                this.a = zaaaVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zaq.d(this.a, (zar) obj, (TaskCompletionSource) obj2);
            }
        }).build());
    }
}
