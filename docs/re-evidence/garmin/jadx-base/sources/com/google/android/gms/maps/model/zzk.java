package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = false;
        boolean z15 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f22 = 0.0f;
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 4:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    f18 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f19 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f22 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GroundOverlayOptions(iBinder, latLng, f14, f15, latLngBounds, f16, f17, z14, f18, f19, f22, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new GroundOverlayOptions[i14];
    }
}
