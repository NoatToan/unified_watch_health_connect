package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes21.dex */
public final class zzn implements Parcelable.Creator<DataUpdateNotification> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataUpdateNotification[] newArray(int i) {
        return new DataUpdateNotification[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataUpdateNotification createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                j = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 2) {
                j2 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                i = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                dataSource = (DataSource) SafeParcelReader.createParcelable(parcel, header, DataSource.CREATOR);
            } else if (fieldId == 5) {
                dataType = (DataType) SafeParcelReader.createParcelable(parcel, header, DataType.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DataUpdateNotification(j, j2, i, dataSource, dataType);
    }
}
