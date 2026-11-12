package com.google.android.gms.common.api;

import am.j;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import p1.a;

/* JADX INFO: loaded from: classes14.dex */
public class AvailabilityException extends Exception {
    private final a zaa;

    public AvailabilityException(a aVar) {
        this.zaa = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        a aVar = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        V v14 = aVar.get(apiKey);
        Preconditions.checkArgument(v14 != 0, j.m("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z14 = true;
        for (ApiKey apiKey : (a.c) this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z14 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb3 = new StringBuilder();
        if (z14) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        a aVar = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        V v14 = aVar.get(apiKey);
        Preconditions.checkArgument(v14 != 0, j.m("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
