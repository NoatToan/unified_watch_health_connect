package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;

/* JADX INFO: loaded from: classes14.dex */
public interface IAgeSignalsServiceCallback extends IInterface {

    public static abstract class Stub extends zzb implements IAgeSignalsServiceCallback {

        public static class Proxy extends zza implements IAgeSignalsServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onCompleteCheckAgeSignals(Bundle bundle) {
                Parcel parcelZza = zza();
                zzc.zzc(parcelZza, bundle);
                zzb(1, parcelZza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onError(Bundle bundle) {
                Parcel parcelZza = zza();
                zzc.zzc(parcelZza, bundle);
                zzb(3, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        public static IAgeSignalsServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            return iInterfaceQueryLocalInterface instanceof IAgeSignalsServiceCallback ? (IAgeSignalsServiceCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        public boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1) {
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onCompleteCheckAgeSignals(bundle);
            } else {
                if (i14 != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onError(bundle2);
            }
            return true;
        }
    }

    void onCompleteCheckAgeSignals(Bundle bundle);

    void onError(Bundle bundle);
}
