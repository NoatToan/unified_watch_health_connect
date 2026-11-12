package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        long j8 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CurrentLocationRequest(j8, i14, i15, j14, z14, workSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new CurrentLocationRequest[i14];
    }
}
