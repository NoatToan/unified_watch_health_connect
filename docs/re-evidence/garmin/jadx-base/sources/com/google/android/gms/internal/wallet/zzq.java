package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzam;

/* JADX INFO: loaded from: classes14.dex */
public interface zzq extends IInterface {
    void zza(int i14, Bundle bundle);

    void zza(int i14, FullWallet fullWallet, Bundle bundle);

    void zza(int i14, MaskedWallet maskedWallet, Bundle bundle);

    void zza(int i14, boolean z14, Bundle bundle);

    void zza(Status status, Bundle bundle);

    void zza(Status status, zzg zzgVar, Bundle bundle);

    void zza(Status status, zzi zziVar, Bundle bundle);

    void zza(Status status, zzk zzkVar, Bundle bundle);

    void zza(Status status, zzm zzmVar, Bundle bundle);

    void zza(Status status, PaymentData paymentData, Bundle bundle);

    void zza(Status status, zzam zzamVar, Bundle bundle);

    void zza(Status status, boolean z14, Bundle bundle);

    void zzb(int i14, boolean z14, Bundle bundle);

    void zzb(Status status, Bundle bundle);

    void zzc(Status status, Bundle bundle);
}
