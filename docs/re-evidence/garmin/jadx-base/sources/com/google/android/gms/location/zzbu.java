package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z18 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z19 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationSettingsStates(z14, z15, z16, z17, z18, z19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new LocationSettingsStates[i14];
    }
}
