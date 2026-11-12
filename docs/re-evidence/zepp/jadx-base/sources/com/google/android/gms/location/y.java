package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class y implements BaseImplementation.ResultHolder<LocationSettingsResult> {
    private final TaskCompletionSource<LocationSettingsResponse> a;

    public y(TaskCompletionSource<LocationSettingsResponse> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.a.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.a.setResult(new LocationSettingsResponse(locationSettingsResult));
        } else if (status.hasResolution()) {
            this.a.setException(new ResolvableApiException(status));
        } else {
            this.a.setException(new ApiException(status));
        }
    }
}
