package com.huawei.appgallery.agd.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.huawei.appgallery.coreservice.api.IConnectionResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectionResult implements IConnectionResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IConnectionResult f5193c;

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        this.f5193c.startResolutionForResult(activity, i);
    }

    public int hashCode() {
        int statusCode = this.f5193c.getStatusCode();
        return Arrays.hashCode(new Object[]{Integer.valueOf(statusCode), this.f5193c.getResolution(), this.f5193c.getErrorMessage()});
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public boolean hasResolution() {
        return this.f5193c.hasResolution();
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public int getStatusCode() {
        return this.f5193c.getStatusCode();
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public PendingIntent getResolution() {
        return this.f5193c.getResolution();
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public String getErrorMessage() {
        return this.f5193c.getErrorMessage();
    }

    public boolean equals(Object obj) {
        return this.f5193c.equals(obj);
    }

    public ConnectionResult(IConnectionResult iConnectionResult) {
        this.f5193c = iConnectionResult;
    }
}
