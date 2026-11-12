package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List listCreateTypedList = zzbf.zza;
        LocationRequest locationRequest = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        long j8 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        listCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        z14 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 8:
                        z15 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 9:
                        z16 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 10:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 11:
                        z17 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 12:
                        z18 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 13:
                        strCreateString3 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 14:
                        j8 = SafeParcelReader.readLong(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbf(locationRequest, listCreateTypedList, strCreateString, z14, z15, z16, strCreateString2, z17, z18, strCreateString3, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new zzbf[i14];
    }
}
