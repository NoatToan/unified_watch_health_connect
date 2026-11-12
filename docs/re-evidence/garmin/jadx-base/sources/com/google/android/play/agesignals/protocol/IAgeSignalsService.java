package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;

/* JADX INFO: loaded from: classes14.dex */
public interface IAgeSignalsService extends IInterface {

    public static abstract class Stub extends zzb implements IAgeSignalsService {

        public static class Proxy extends zza implements IAgeSignalsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
            public void checkAgeRange(String str, Bundle bundle, IAgeSignalsServiceCallback iAgeSignalsServiceCallback) {
                Parcel parcelZza = zza();
                parcelZza.writeString(str);
                zzc.zzc(parcelZza, bundle);
                zzc.zzd(parcelZza, iAgeSignalsServiceCallback);
                zzb(1, parcelZza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
            public void requestAgeSignalsAccess(String str, Bundle bundle, IAgeSignalsAccessCallback iAgeSignalsAccessCallback) {
                Parcel parcelZza = zza();
                parcelZza.writeString(str);
                zzc.zzc(parcelZza, bundle);
                zzc.zzd(parcelZza, iAgeSignalsAccessCallback);
                zzb(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsService");
        }

        public static IAgeSignalsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return iInterfaceQueryLocalInterface instanceof IAgeSignalsService ? (IAgeSignalsService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        public boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                IAgeSignalsServiceCallback iAgeSignalsServiceCallbackAsInterface = IAgeSignalsServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzc.zzb(parcel);
                checkAgeRange(string, bundle, iAgeSignalsServiceCallbackAsInterface);
            } else {
                if (i14 != 2) {
                    return false;
                }
                String string2 = parcel.readString();
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                IAgeSignalsAccessCallback iAgeSignalsAccessCallbackAsInterface = IAgeSignalsAccessCallback.Stub.asInterface(parcel.readStrongBinder());
                zzc.zzb(parcel);
                requestAgeSignalsAccess(string2, bundle2, iAgeSignalsAccessCallbackAsInterface);
            }
            return true;
        }
    }

    void checkAgeRange(String str, Bundle bundle, IAgeSignalsServiceCallback iAgeSignalsServiceCallback);

    void requestAgeSignalsAccess(String str, Bundle bundle, IAgeSignalsAccessCallback iAgeSignalsAccessCallback);
}
