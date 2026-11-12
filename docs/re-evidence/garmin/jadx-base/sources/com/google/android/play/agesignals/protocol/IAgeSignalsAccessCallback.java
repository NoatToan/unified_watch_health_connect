package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;

/* JADX INFO: loaded from: classes14.dex */
public interface IAgeSignalsAccessCallback extends IInterface {

    public static abstract class Stub extends zzb implements IAgeSignalsAccessCallback {

        public static class Proxy extends zza implements IAgeSignalsAccessCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback
            public void onCompleteRequestAgeSignalsAccess(Bundle bundle) {
                Parcel parcelZza = zza();
                zzc.zzc(parcelZza, bundle);
                zzb(1, parcelZza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback
            public void onError(Bundle bundle) {
                Parcel parcelZza = zza();
                zzc.zzc(parcelZza, bundle);
                zzb(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback");
        }

        public static IAgeSignalsAccessCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsAccessCallback");
            return iInterfaceQueryLocalInterface instanceof IAgeSignalsAccessCallback ? (IAgeSignalsAccessCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        public boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1) {
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onCompleteRequestAgeSignalsAccess(bundle);
            } else {
                if (i14 != 2) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onError(bundle2);
            }
            return true;
        }
    }

    void onCompleteRequestAgeSignalsAccess(Bundle bundle);

    void onError(Bundle bundle);
}
