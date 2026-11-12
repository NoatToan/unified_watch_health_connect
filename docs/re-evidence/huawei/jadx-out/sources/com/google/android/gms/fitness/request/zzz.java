package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSet;

/* JADX INFO: loaded from: classes21.dex */
public final class zzz implements Parcelable.Creator<DataUpdateRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataUpdateRequest[] newArray(int i) {
        return new DataUpdateRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataUpdateRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        DataSet dataSet = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                j = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 2) {
                j2 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                dataSet = (DataSet) SafeParcelReader.createParcelable(parcel, header, DataSet.CREATOR);
            } else if (fieldId == 4) {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DataUpdateRequest(j, j2, dataSet, iBinder);
    }
}
