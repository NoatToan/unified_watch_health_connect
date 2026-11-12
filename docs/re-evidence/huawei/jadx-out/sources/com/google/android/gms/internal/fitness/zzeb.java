package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
final class zzeb extends zzav<DataSourcesResult> {
    private final /* synthetic */ DataSourcesRequest zzft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzea zzeaVar, GoogleApiClient googleApiClient, DataSourcesRequest dataSourcesRequest) {
        super(googleApiClient);
        this.zzft = dataSourcesRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzcd) ((zzas) anyClient).getService()).zza(new DataSourcesRequest(this.zzft, new zzo(this)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new DataSourcesResult(Collections.EMPTY_LIST, status);
    }
}
