package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zze implements Parcelable.Creator<CardRequirements> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardRequirements createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<Integer> arrayListCreateIntegerList = null;
        boolean z14 = false;
        boolean z15 = true;
        int i14 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
            } else if (fieldId == 2) {
                z15 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                z14 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i14 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardRequirements(arrayListCreateIntegerList, z15, z14, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardRequirements[] newArray(int i14) {
        return new CardRequirements[i14];
    }
}
