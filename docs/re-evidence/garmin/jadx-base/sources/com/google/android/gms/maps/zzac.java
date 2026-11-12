package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes14.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        int i15 = 0;
        CameraPosition cameraPosition = null;
        Float floatObject = null;
        Float floatObject2 = null;
        LatLngBounds latLngBounds = null;
        Integer integerObject = null;
        String strCreateString = null;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b24 = -1;
        byte b25 = -1;
        byte b26 = -1;
        byte b27 = -1;
        byte b28 = -1;
        byte b29 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    b14 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 3:
                    b15 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 4:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel, header, CameraPosition.CREATOR);
                    break;
                case 6:
                    b16 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b17 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b18 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b19 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b24 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    b25 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 12:
                    b26 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 13:
                case 22:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    b27 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 15:
                    b28 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 16:
                    floatObject = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 17:
                    floatObject2 = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b29 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 20:
                    integerObject = SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 21:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 23:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleMapOptions(b14, b15, i14, cameraPosition, b16, b17, b18, b19, b24, b25, b26, b27, b28, floatObject, floatObject2, latLngBounds, b29, integerObject, strCreateString, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new GoogleMapOptions[i14];
    }
}
