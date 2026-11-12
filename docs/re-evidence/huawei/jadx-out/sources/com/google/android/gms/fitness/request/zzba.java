package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Session;

/* JADX INFO: loaded from: classes21.dex */
public final class zzba implements Parcelable.Creator<zzaz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz[] newArray(int i) {
        return new zzaz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaz createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Session session = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                session = (Session) SafeParcelReader.createParcelable(parcel, header, Session.CREATOR);
            } else if (fieldId == 2) {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaz(session, iBinder);
    }
}
