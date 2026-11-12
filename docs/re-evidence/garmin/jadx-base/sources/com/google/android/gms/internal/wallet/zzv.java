package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;

/* JADX INFO: loaded from: classes14.dex */
public final class zzv extends GmsClient<zzo> {
    private final int environment;
    private final int theme;
    private final String zzcc;
    private final boolean zzef;
    private final Context zzer;

    public zzv(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i14, int i15, boolean z14) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzer = context;
        this.environment = i14;
        this.zzcc = clientSettings.getAccountName();
        this.theme = i15;
        this.zzef = z14;
    }

    private final Bundle zzd() {
        int i14 = this.environment;
        String packageName = this.zzer.getPackageName();
        String str = this.zzcc;
        int i15 = this.theme;
        boolean z14 = this.zzef;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i14);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z14);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i15);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzr(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wallet.zzh.zzbg;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(PaymentDataRequest paymentDataRequest, TaskCompletionSource<PaymentData> taskCompletionSource) {
        Bundle bundleZzd = zzd();
        bundleZzd.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzy zzyVar = new zzy(taskCompletionSource);
        try {
            ((zzo) getService()).zza(paymentDataRequest, bundleZzd, zzyVar);
        } catch (RemoteException unused) {
            zzyVar.zza(Status.RESULT_INTERNAL_ERROR, (PaymentData) null, Bundle.EMPTY);
        }
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource<AutoResolvableVoidResult> taskCompletionSource) {
        Bundle bundleZzd = zzd();
        bundleZzd.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzz zzzVar = new zzz(taskCompletionSource);
        try {
            ((zzo) getService()).zza(createWalletObjectsRequest, bundleZzd, zzzVar);
        } catch (RemoteException unused) {
            zzzVar.zza(8, Bundle.EMPTY);
        }
    }

    public final void zza(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource<Boolean> taskCompletionSource) {
        zzw zzwVar = new zzw(taskCompletionSource);
        try {
            ((zzo) getService()).zza(isReadyToPayRequest, zzd(), zzwVar);
        } catch (RemoteException unused) {
            zzwVar.zza(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, int i14) {
        zzu zzuVar = new zzu((Activity) this.zzer, i14);
        try {
            ((zzo) getService()).zza(createWalletObjectsRequest, zzd(), zzuVar);
        } catch (RemoteException unused) {
            zzuVar.zza(8, Bundle.EMPTY);
        }
    }
}
