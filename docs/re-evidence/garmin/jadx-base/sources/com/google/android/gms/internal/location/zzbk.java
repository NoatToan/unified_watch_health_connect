package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        int i14 = 0;
        short s8 = 0;
        int i15 = 0;
        double d14 = 0.0d;
        double d15 = 0.0d;
        float f14 = 0.0f;
        long j8 = 0;
        int i16 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s8 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d14 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d15 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbj(strCreateString, i14, s8, d14, d15, f14, j8, i15, i16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new zzbj[i14];
    }
}
