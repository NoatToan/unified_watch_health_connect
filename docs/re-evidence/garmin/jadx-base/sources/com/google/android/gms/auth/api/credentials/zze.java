package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zze implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i15 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z14 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                z15 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                z16 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 4) {
                i15 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 1000) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i14 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CredentialPickerConfig(i14, z14, z15, z16, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i14) {
        return new CredentialPickerConfig[i14];
    }
}
