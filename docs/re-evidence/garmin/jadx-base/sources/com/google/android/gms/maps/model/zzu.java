package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayListCreateTypedList2 = null;
        ArrayList arrayListCreateTypedList3 = null;
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i15 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.createParcelable(parcel, header, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.createParcelable(parcel, header, Cap.CREATOR);
                    break;
                case 11:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, PatternItem.CREATOR);
                    break;
                case 13:
                    arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header, StyleSpan.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PolylineOptions(arrayListCreateTypedList, f14, i14, f15, z14, z15, z16, cap, cap2, i15, arrayListCreateTypedList2, arrayListCreateTypedList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new PolylineOptions[i14];
    }
}
