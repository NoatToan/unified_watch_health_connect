package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 102;
        long j8 = 3600000;
        long j14 = 600000;
        boolean z14 = false;
        boolean z15 = false;
        long j15 = Long.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        float f14 = 0.0f;
        long j16 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i14, j8, j14, z14, j15, i15, f14, j16, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new LocationRequest[i14];
    }
}
