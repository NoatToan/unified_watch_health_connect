package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes14.dex */
public final class zzc implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardInfo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        UserAddress userAddress = null;
        int i14 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString3 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 4) {
                i14 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                userAddress = (UserAddress) SafeParcelReader.createParcelable(parcel, header, UserAddress.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardInfo(strCreateString, strCreateString2, strCreateString3, i14, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardInfo[] newArray(int i14) {
        return new CardInfo[i14];
    }
}
