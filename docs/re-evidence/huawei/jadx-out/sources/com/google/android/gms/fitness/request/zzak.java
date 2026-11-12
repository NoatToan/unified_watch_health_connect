package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataType;

/* JADX INFO: loaded from: classes21.dex */
public final class zzak implements Parcelable.Creator<zzaj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj[] newArray(int i) {
        return new zzaj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        DataType dataType = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                dataType = (DataType) SafeParcelReader.createParcelable(parcel, header, DataType.CREATOR);
            } else if (fieldId == 2) {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaj(dataType, iBinder);
    }
}
