package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zze implements Parcelable.Creator<LabelValueRow> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LabelValueRow createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListNewArrayList = ArrayUtils.newArrayList();
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListNewArrayList = SafeParcelReader.createTypedList(parcel, header, LabelValue.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LabelValueRow(strCreateString, strCreateString2, arrayListNewArrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LabelValueRow[] newArray(int i14) {
        return new LabelValueRow[i14];
    }
}
