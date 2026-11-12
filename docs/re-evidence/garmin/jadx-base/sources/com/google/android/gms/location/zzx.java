package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = true;
        long j8 = 50;
        float f14 = 0.0f;
        long j14 = Long.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z14 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                j8 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                f14 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 4) {
                j14 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i14 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzw(z14, j8, f14, j14, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new zzw[i14];
    }
}
