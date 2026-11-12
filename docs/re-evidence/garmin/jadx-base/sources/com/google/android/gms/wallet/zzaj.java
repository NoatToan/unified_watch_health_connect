package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes14.dex */
final class zzaj extends Api.AbstractClientBuilder<com.google.android.gms.internal.wallet.zzv, Wallet.WalletOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Wallet.WalletOptions walletOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Wallet.WalletOptions walletOptions2 = walletOptions;
        if (walletOptions2 == null) {
            walletOptions2 = new Wallet.WalletOptions((zzaj) null);
        }
        return new com.google.android.gms.internal.wallet.zzv(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener, walletOptions2.environment, walletOptions2.theme, walletOptions2.zzef);
    }
}
