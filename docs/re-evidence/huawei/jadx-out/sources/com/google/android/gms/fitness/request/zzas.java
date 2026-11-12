package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes21.dex */
public final class zzas implements Parcelable.Creator<zzar> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzar[] newArray(int i) {
        return new zzar[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzar createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            } else if (fieldId == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
            } else if (fieldId == 3) {
                iBinder2 = SafeParcelReader.readIBinder(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzar(iBinder, pendingIntent, iBinder2);
    }
}
