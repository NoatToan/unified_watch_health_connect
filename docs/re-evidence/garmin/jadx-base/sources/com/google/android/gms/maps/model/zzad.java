package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StampStyle stampStyle = null;
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        float f14 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                f14 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 3) {
                i14 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                i15 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 5) {
                z14 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                stampStyle = (StampStyle) SafeParcelReader.createParcelable(parcel, header, StampStyle.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StrokeStyle(f14, i14, i15, z14, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new StrokeStyle[i14];
    }
}
