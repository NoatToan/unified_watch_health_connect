package com.google.android.gms.internal.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class zzev implements Parcelable.Creator<zzeu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzeu[] newArray(int i) {
        return new zzeu[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzeu createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 1) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, DataType.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzeu(arrayListCreateTypedList);
    }
}
