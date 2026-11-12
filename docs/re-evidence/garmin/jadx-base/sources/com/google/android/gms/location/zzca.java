package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzca implements BaseImplementation.ResultHolder {
    private final TaskCompletionSource zza;

    public zzca(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.zza.setResult(new LocationSettingsResponse(locationSettingsResult));
            return;
        }
        boolean zHasResolution = status.hasResolution();
        TaskCompletionSource taskCompletionSource = this.zza;
        if (zHasResolution) {
            taskCompletionSource.setException(new ResolvableApiException(status));
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }
}
