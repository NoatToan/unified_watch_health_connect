package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        ArrayList arrayListCreateTypedList = null;
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        double d14 = 0.0d;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    d14 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 4:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i15 = SafeParcelReader.readInt(parcel, header);
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
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CircleOptions(latLng, d14, f14, i14, i15, f15, z14, z15, arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new CircleOptions[i14];
    }
}
