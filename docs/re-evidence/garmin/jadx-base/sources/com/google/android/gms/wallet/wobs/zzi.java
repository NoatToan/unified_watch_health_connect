package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzi implements Parcelable.Creator<LoyaltyPointsBalance> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPointsBalance createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        double d14 = 0.0d;
        long j8 = 0;
        int i15 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    d14 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LoyaltyPointsBalance(i14, strCreateString, d14, strCreateString2, j8, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPointsBalance[] newArray(int i14) {
        return new LoyaltyPointsBalance[i14];
    }
}
