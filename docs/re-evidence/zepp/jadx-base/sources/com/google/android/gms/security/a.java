package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* JADX INFO: loaded from: classes3.dex */
final class a extends AsyncTask<Void, Void, Integer> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener b;

    public a(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.a = context;
        this.b = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Integer doInBackground(Void[] voidArr) {
        try {
            ProviderInstaller.installIfNeeded(this.a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.errorCode);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        Integer num2 = num;
        if (num2.intValue() == 0) {
            this.b.onProviderInstalled();
        } else {
            this.b.onProviderInstallFailed(num2.intValue(), ProviderInstaller.a.getErrorResolutionIntent(this.a, num2.intValue(), "pi"));
        }
    }
}
