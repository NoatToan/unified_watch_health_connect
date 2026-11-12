package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes4.dex */
public final class zzw implements Parcelable.Creator<MapValue> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MapValue[] newArray(int i) {
        return new MapValue[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MapValue createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                f = SafeParcelReader.readFloat(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MapValue(i, f);
    }
}
