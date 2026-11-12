package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        long j8 = 0;
        long j14 = 0;
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
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i18 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MethodInvocation(i15, i16, i17, j8, j14, strCreateString, strCreateString2, i18, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new MethodInvocation[i14];
    }
}
