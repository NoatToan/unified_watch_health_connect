package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes21.dex */
public final class zzaf implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Session session = null;
        DataSet dataSet = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                session = (Session) SafeParcelReader.createParcelable(parcel, header, Session.CREATOR);
            } else if (fieldId == 2) {
                dataSet = (DataSet) SafeParcelReader.createParcelable(parcel, header, DataSet.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzae(session, dataSet);
    }
}
