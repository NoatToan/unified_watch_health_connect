package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 1000;
        int i15 = 1;
        int i16 = 1;
        long j8 = 0;
        zzbv[] zzbvVarArr = null;
        boolean z14 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    zzbvVarArr = (zzbv[]) SafeParcelReader.createTypedArray(parcel, header, zzbv.CREATOR);
                    break;
                case 6:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationAvailability(i14, i15, i16, j8, zzbvVarArr, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new LocationAvailability[i14];
    }
}
