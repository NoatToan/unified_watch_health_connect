package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbm extends zzb implements zzbn {
    public zzbm() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzd();
            parcel2.writeNoException();
        } else if (i14 == 2) {
            zzf();
            parcel2.writeNoException();
        } else if (i14 == 3) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzcc zzccVar = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
            zzc.zzb(parcel);
            List listZzb = zzb(iObjectWrapperAsInterface, zzccVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzb);
        } else if (i14 == 4) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzcc zzccVar2 = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
            zzbc zzbcVar = (zzbc) zzc.zza(parcel, zzbc.CREATOR);
            zzc.zzb(parcel);
            List listZzc = zzc(iObjectWrapperAsInterface2, zzccVar2, zzbcVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzc);
        } else {
            if (i14 != 5) {
                return false;
            }
            zzbe zzbeVar = (zzbe) zzc.zza(parcel, zzbe.CREATOR);
            zzc.zzb(parcel);
            zze(zzbeVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
