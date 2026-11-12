package com.google.android.gms.internal.identity;

import am.j;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* JADX INFO: loaded from: classes14.dex */
public final class zze extends GmsClient<zzi> {
    private Activity mActivity;
    private final int mTheme;
    private zzf zzh;
    private final String zzi;

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i14, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super((Context) activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzi = clientSettings.getAccountName();
        this.mActivity = activity;
        this.mTheme = i14;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return iInterfaceQueryLocalInterface instanceof zzi ? (zzi) iInterfaceQueryLocalInterface : new zzj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        super.disconnect();
        zzf zzfVar = this.zzh;
        if (zzfVar != null) {
            zzfVar.setActivity(null);
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(UserAddressRequest userAddressRequest, int i14) {
        checkConnected();
        this.zzh = new zzf(i14, this.mActivity);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzi)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzi, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
            ((zzi) getService()).zza(this.zzh, userAddressRequest, bundle);
        } catch (RemoteException unused) {
            this.zzh.zza(1, j.e(AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, AddressConstants.Extras.EXTRA_ERROR_CODE));
        }
    }
}
