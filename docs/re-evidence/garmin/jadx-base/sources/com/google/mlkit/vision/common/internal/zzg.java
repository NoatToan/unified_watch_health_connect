package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i14 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                i15 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                i16 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                j8 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i17 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new VisionImageMetadataParcel(i14, i15, i16, j8, i17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new VisionImageMetadataParcel[i14];
    }
}
