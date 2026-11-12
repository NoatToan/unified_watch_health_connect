package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes14.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(Activity activity, int i14) {
        getStatus().startResolutionForResult(activity, i14);
    }
}
