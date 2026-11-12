package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        LatLng latLng = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString3 = null;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i14 = 0;
        int i15 = 0;
        float f22 = 1.0f;
        float f24 = 0.5f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f24 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 14:
                    f22 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f18 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 16:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 17:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    f19 = SafeParcelReader.readFloat(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MarkerOptions(latLng, strCreateString, strCreateString2, iBinder, f14, f15, z14, z15, z16, f16, f24, f17, f22, f18, i14, iBinder2, i15, strCreateString3, f19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new MarkerOptions[i14];
    }
}
