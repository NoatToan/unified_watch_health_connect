package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzg implements Parcelable.Creator<CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String[] strArrCreateStringArray = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        z14 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 2:
                        strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, header, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, header, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z15 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 6:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 8:
                        z16 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i14 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CredentialRequest(i14, z14, strArrCreateStringArray, credentialPickerConfig, credentialPickerConfig2, z15, strCreateString, strCreateString2, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i14) {
        return new CredentialRequest[i14];
    }
}
