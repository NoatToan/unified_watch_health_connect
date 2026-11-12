package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class zzd implements Parcelable.Creator<DataSourcesResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataSourcesResult[] newArray(int i) {
        return new DataSourcesResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataSourcesResult createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        Status status = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, DataSource.CREATOR);
            } else if (fieldId == 2) {
                status = (Status) SafeParcelReader.createParcelable(parcel, header, Status.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DataSourcesResult(arrayListCreateTypedList, status);
    }
}
